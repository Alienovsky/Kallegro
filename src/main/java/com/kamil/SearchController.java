package com.kamil;

import com.google.common.base.Splitter;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/search")
class SearchController {

    private ExecutorService es = Executors.newFixedThreadPool(10);

    @PreDestroy
    private void shutDownExecutorService(){
        es.shutdown();
    }

    @RequestMapping(method = RequestMethod.GET, value = "item/{query}")
    public FoundItem searchItem(@PathVariable String query) {
        AllegroSearcher allegroSearcher = new AllegroSearcher(query);
        Future<FoundItem> promiseString = es.submit(allegroSearcher);
        FoundItem foundItem = new FoundItem("nic","nic");
        try {
            foundItem = promiseString.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return foundItem;
    }
    @RequestMapping(method = RequestMethod.GET, value = "items/{query}")
    public List<FoundItem> searchItems(@PathVariable String query) {
        ArrayList<FoundItem> foundItems = new ArrayList<>();
        ArrayList<Future<FoundItem>> result = new ArrayList<>();
        Iterable<String> splitted = Splitter.on(",").split(query);
        splitted.forEach(x -> {
            AllegroSearcher allegroSearcher = new AllegroSearcher(x);
            result.add(es.submit(allegroSearcher));
        });
        result.forEach(x -> {
            try {
                foundItems.add(x.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        return foundItems;
    }
}
