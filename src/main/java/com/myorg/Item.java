package com.myorg;

/**
 * Created by anthonyc on 5/10/16.
 */
public class Item {
    protected String itemName;    // name of the item
    protected Long itemPrice;     // price in pennies, so only whole number
    protected ItemType itemType;  // item type: either neccessary item or luxury item
    protected final String priceUnit = "pennies";


    Item(String name,Long price,String type) {
        if (name != null) {
            this.itemName = name;
        }

        if ((price != null) && (price >= 0)) {
            this.itemPrice = price;
        }

        if ((type != null) && (type.equalsIgnoreCase("NECESSITY"))) {
            this.itemType = ItemType.NECESSITY;
        } else if ((type != null) && (type.equalsIgnoreCase("LUXURY"))) {
            this.itemType = ItemType.LUXURY;
        }
    }

    /**
     * Retrieves item name
     * @return name of item as string value.
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * Retrieves item price
     * @return price of item
     */
    public Long getItemPrice() {
       return this.itemPrice;
    }

    /**
     * Retrieves item type
     * @return enum ItemType of item: NECCESSITY or LUXURY
     */
    public ItemType getItemType() {
        return this.itemType;
    }

    /**
     * Retreives price unit string
     * @return price unit text
     */
    public String getPriceUnits() {
        return this.priceUnit;
    }

    /**
     * Sets item name
     * @param name  name to set to
     */
    public void setItemName(String name) {
        if (name != null) {
            this.itemName = name;
        }
    }

    /**
     * Sets item price
     * @param price price value to set to
     */
    public void setItemPrice(Long price) {
        if ( (price != null) && (price >= 0)) {
            this.itemPrice = price;
        }
    }

    /**
     * Sets item type
     * @param type string value used to determine item type to set to
     */
    public void setItemType(String type) {
        if ((type != null) && (type.equalsIgnoreCase("NECESSITY"))) {
            this.itemType = ItemType.NECESSITY;
        } else if ((type != null) && (type.equalsIgnoreCase("LUXURY"))) {
            this.itemType = ItemType.LUXURY;
        }
    }
}
