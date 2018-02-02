package com.company;

import java.util.Scanner;

public class GroceryList
{
    GroceryItemOrder[] groceryItemOrders;

    public GroceryItemOrder[] addToGroceries(GroceryItemOrder[] currentItemOrders, Scanner input)
    {
        //make temp arr with previous size + 1
        GroceryItemOrder[] tempArr = new GroceryItemOrder[currentItemOrders.length + 1];
        //loop through previous array
        for (int i = 0; i < currentItemOrders.length; i++)
        {
            //set previous array elements to temporary array's elements
            tempArr[i] = currentItemOrders[i];
            //dunno yet
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

        tempArr[tempArr.length-1] = tempItemArr;  //martin was here (ノ͡° ͜ʖ ͡°)ノ︵┻┻

        return tempArr;
    }

    /*public float getTotalCost()
    {
        float totalCost = 0f;

        for (int i = 0; i < groceryItemOrders.length; i++) {


        }
    }*/

    @Override
    public String toString() {
        return "There are: " + groceryItemOrders.length + " in this bag.";
    }
}
