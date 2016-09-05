package com.kamil;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FoundItemTest {
    private FoundItem foundItem;
    private static String FOUND_ITEM_ID = "123123";
    private static String FOUND_ITEM_CONTENT = "Content";

    @Before
    public void setup(){
        foundItem = new FoundItem(FOUND_ITEM_ID, FOUND_ITEM_CONTENT);
    }

    @Test
    public void test_getter(){
        Assert.assertThat(foundItem.getId(), is(FOUND_ITEM_ID));
        Assert.assertThat(foundItem.getContent(), is(FOUND_ITEM_CONTENT));
    }




}
