package com.company;

public class GroceryItemOrder
{
    private String itemName;
    private int quantity;
    private float pricePerUnit;

    public GroceryItemOrder(String itemName, int quantity, float pricePerUnit)
    {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getTotalCost()
    {
        return getPricePerUnit() * getQuantity();
    }

    @Override
    public String toString() {
        return "Item name: " + getItemName() + ", amount is: " + getQuantity() + ", and total cost: " + getTotalCost();
    }
}
