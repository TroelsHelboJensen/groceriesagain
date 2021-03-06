package com.company;

import java.util.ArrayList;

public class GroceryList2
{
    public ArrayList<GroceryItemOrder> groceryItemOrders;
    
    public GroceryList2()
    {
        groceryItemOrders = new ArrayList<>();
    }
    
    public int getGroceryItemOrders() {
        return groceryItemOrders.size();
    }
    
    
    public void addToGroceries(GroceryItemOrder itemOrder)
    {
        groceryItemOrders.add(itemOrder);
    }
    
    public boolean noMoreThanTen()
    {
        return groceryItemOrders.size() < 10;
    }
    
    public float getTotalCost()
    {
        float totalCost = 0f;
        
        for (int i = 0; i < groceryItemOrders.size(); i++)
        {
            totalCost += groceryItemOrders.get(i).getTotalCost();
            
        }
        return totalCost;
    }
    
    @Override
    public String toString() {
        return "There are: " + getGroceryItemOrders() + " in this bag.\nWith a total price of " + getTotalCost();
    }
}
