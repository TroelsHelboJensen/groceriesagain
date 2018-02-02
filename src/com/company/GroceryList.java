package com.company;

import java.util.Scanner;

public class GroceryList
{
    public GroceryItemOrder[] groceryItemOrders = new GroceryItemOrder[0];

    public int getGroceryItemOrders() {
        return groceryItemOrders.length;
    }

    public GroceryItemOrder[] addToGroceries(GroceryItemOrder[] currentItemOrders, Scanner input)
    {
        //make temp arr with previous size + 1
        GroceryItemOrder[] tempArr = new GroceryItemOrder[currentItemOrders.length + 1];
        //loop through previous array
        for (int i = 0; i < currentItemOrders.length; i++)
        {
            //set previous array elements to temporary array's elements
            tempArr[i] = currentItemOrders[i];
            //after creating the new array that has a spot more than the old one
            //set the new position to null, untill we have to use it
            tempArr[i + 1] = null;
        }

        GroceryItemOrder tempItemArr;

        int cnt = 0;
        String[] tmpinf = new String[3];
        String[] groceryInfo = {"item Name", "quantity", "price per unit"};

        for (int i = 0; i < groceryInfo.length; i++) {
            System.out.println("Please enter " + groceryInfo[cnt]);
            tmpinf[i] = input.nextLine();
            cnt++;
        }

        tempItemArr = new GroceryItemOrder(tmpinf[0], Integer.parseInt(tmpinf[1]),Float.parseFloat(tmpinf[2]));
        System.out.println("New order created " + tempItemArr);

        //minus one else it goes out of bounds
        tempArr[tempArr.length - 1] = tempItemArr;

        return tempArr;
    }

    //adjusted so its not less than, but less than or equal to ten
    public boolean noMoreThanTen()
    {
        return groceryItemOrders.length <= 10;
    }

    /*public float getTotalCost()
    {
        float totalCost = 0f;

        for (int i = 0; i < groceryItemOrders.length; i++) {


        }
    }*/

    @Override
    public String toString() {
        return "There are: " + getGroceryItemOrders() + " in this bag.";
    }
}
