package com.myorg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by anthonyc on 5/11/16.
 * This class contains the unit tests for computeTotalCost() module but using DataProvider to pass in different sets of data to the test.
 */
public class TestWithDataProviders {

    @DataProvider(name = "getItemData")
    public Object[][] getItemData() {
        return new Object[][]{{"medicine",1575L,"necessity",1591L},
                              {"hat",2356L,"luxury",2568L},
                              {"glass",235L,"accessory",null},
                              {"glass",-100L,"luxury",null},
                              {"shirt",0L,"luxury",0L},
                              {null,null,null,null}};
    }

    @Test(dataProvider = "getItemData")
    public void testCalculateCost(String name,Long price,String type,Long expectedTotalCost) {
        CalculateCost c = new CalculateCost();

        Item nItem = new Item(name,price,type);

        Long totalCost = c.computeTotalCost(nItem);
        assertEquals(totalCost,expectedTotalCost,"Expect total cost: " + expectedTotalCost + ", but get: " + totalCost);
    }

}
