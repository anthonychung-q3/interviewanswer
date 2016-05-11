package com.myorg;

/**
 * Created by anthonyc on 5/10/16.
 */
public enum ItemType {
    NECESSITY(0.01),
    LUXURY(0.09);

    private final Double taxRate;    // tax rate value

    ItemType(Double r) {
        this.taxRate = r;
    }

    /**
     * Retrieves tax rate value for associated enum
     * @return tax rate value associated with the enum
     */
    public Double rate() { return taxRate; }
}
