package com.myorg;

/**
 * Created by anthonyc on 5/10/16.
 */
public class CalculateCost {

    /**
     * This method computes total cost of an item including tax.
     * Total cost = item price + (item price * tax rate).
     * Transactions are in pennies, so use whole number.
     * @param it  item to compute total cost for.
     * @return total cost in whole number round to the nearest integer value if successful; otherwise, null is returned.
     */
    public Long computeTotalCost(Item it) {
        try {
            Double totalCost = it.getItemPrice() + (it.getItemPrice() * it.getItemType().rate());
            return ((Long)(Math.round(totalCost)));
        } catch (NullPointerException e) {
            return null;
        }
    }
}
