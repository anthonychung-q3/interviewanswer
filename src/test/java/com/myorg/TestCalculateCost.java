package com.myorg;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by anthonyc on 5/10/16.
 */
public class TestCalculateCost {

    @Test
    public void necessaryItemTest() {
        CalculateCost c = new CalculateCost();

        // Create new neccessary item object with item price = 1575 pennies.
        // Expect total cost = 1575 + (1575 * 0.01) = 1591 pennies
        Item nItem = new Item("medicine",1575L,"Necessity");
        Long expectedTotalCost = 1591L;

        // Compute total cost for item
        Long totalCost = c.computeTotalCost(nItem);

        // Verify the total cost is as expected
        assertEquals(expectedTotalCost,totalCost,"Expect total cost = " + expectedTotalCost + ",but get " + totalCost);
    }

    @Test
    public void luxuryItemTest() {
        CalculateCost c = new CalculateCost();

        // Create new luxury item object with item price = 2356 pennies
        // Expect total cost = 2356 + (2356 * 0.09) = 2568 pennies
        Item lItem = new Item("hat",2356L,"Luxury");
        Long expectedTotalCost = 2568L;

        // Compute total cost for item
        Long totalCost = c.computeTotalCost(lItem);

        // Verity the computed total cost is as expected
        assertEquals(expectedTotalCost,totalCost,"Expect total cost = " + expectedTotalCost + ",but get " + totalCost);
    }

    @Test
    public void invalidItemTypeTest() {
        CalculateCost c = new CalculateCost();

        // Create new item with invalid item type (neither necessary item nor luxury item)
        // Expect computeTotalCost() module returns null
        Item inItem = new Item("glass",235L,"accessory");

        assertNull(c.computeTotalCost(inItem));
    }

    @Test
    public void invalidPriceTest() {
        CalculateCost c = new CalculateCost();

        // Create new item with negative pricing.
        // Expect computeTotalCost() module returns null
        Item inItem = new Item("glass",-100L,"LUXURY");

        assertNull(c.computeTotalCost(inItem));
    }

    @Test
    public void nullItemTest() {
        CalculateCost c = new CalculateCost();

        // Pass in null for Item.
        // Expect computeTotalCost() module returns null
        assertNull(c.computeTotalCost(null));
    }

    @Test
    public void zeroPriceItemTest() {
        CalculateCost c = new CalculateCost();

        Item zItem = new Item("shirt",0L,"luxury");
        Long expectedTotalCost = 0L;

        Long totalCost = c.computeTotalCost(zItem);
        assertEquals(expectedTotalCost,totalCost,"Expect total cost to be zero,but get: " + totalCost);
    }
}
