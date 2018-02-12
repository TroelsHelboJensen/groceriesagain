package com.company;

import java.util.Scanner;

public class GroceryList
{
    public GroceryItemOrder[] groceryItemOrders;
    
    public GroceryList()
    {
        groceryItemOrders = new GroceryItemOrder[0];
    }
    

    public int getGroceryItemOrders() {
        return groceryItemOrders.length;
    }
    
    
    public GroceryItemOrder[] addToGroceries(GroceryItemOrder itemOrder)
    {
        GroceryItemOrder[] temp = new GroceryItemOrder[groceryItemOrders.length +1];
        for (int i = 0; i < groceryItemOrders.length; i++)
        {
            temp[i] = groceryItemOrders[i];
            temp[i+1] = null;
        }
        
        temp[temp.length-1] = itemOrder;
        
        return temp;
    }
    

    //adjusted so its not less than, but less than or equal to ten
    public boolean noMoreThanTen()
    {
        return groceryItemOrders.length <= 10;
    }

    public float getTotalCost()
    {
        float totalCost = 0f;

        for (int i = 0; i < groceryItemOrders.length; i++)
        {
            totalCost += groceryItemOrders[i].getTotalCost();

        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "There are: " + getGroceryItemOrders() + " in this bag.\nWith a total price of " + getTotalCost();
    }
}
