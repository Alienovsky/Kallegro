package com.kamil;

import com.allegro.webapi.*;


import java.util.concurrent.Callable;

class AllegroSearcher implements Callable<FoundItem> {
    String query;

    public AllegroSearcher(String query) {
        this.query = query;
    }

    public FoundItem call() throws Exception {
        ServiceService allegroWebApiService = new ServiceService();
        ServicePort allegro = allegroWebApiService.getServicePort();

        int countryCode = 1;
        String webApiKey = "ce35dff0";
        DoGetItemsListRequest doGetItemsListRequest = new DoGetItemsListRequest();
        doGetItemsListRequest.setCountryId(countryCode);
        doGetItemsListRequest.setWebapiKey(webApiKey);
        ArrayOfFilteroptionstype arrayOfFilteroptionstype = new ArrayOfFilteroptionstype();
        FilterOptionsType filterOptionsType = new FilterOptionsType();
        filterOptionsType.setFilterId("search");
        ArrayOfString arrayOfString = new ArrayOfString();
        arrayOfString.getItem().add(query);
        filterOptionsType.setFilterValueId(arrayOfString);
        arrayOfFilteroptionstype.getItem().add(filterOptionsType);
        doGetItemsListRequest.setFilterOptions(arrayOfFilteroptionstype);
        DoGetItemsListResponse doGetItemsListResponse = allegro.doGetItemsList(doGetItemsListRequest);
        System.out.println(" # "+doGetItemsListResponse.getItemsList().getItem().get(0).getItemTitle());
        String id = String.valueOf(doGetItemsListResponse.getItemsList().getItem().get(0).getItemId());
        return new FoundItem("http://allegro.pl/show_item.php?item="+id,doGetItemsListResponse.getItemsList().getItem().get(0).getItemTitle());
    }

}
