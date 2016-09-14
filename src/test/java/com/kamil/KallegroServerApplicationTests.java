package com.kamil;

import com.allegro.webapi.ItemsListType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KallegroServerApplicationTests {

	@Autowired
	SearchController searchController;

	@Test
	public void queryAllegroWithNokia() {
		List<ItemsListType> result = searchController.searchItem("Nokia");
		assertThat(result.size()).isNotNull();
		assertThat(result.size()).isGreaterThan(0);
	}






}
