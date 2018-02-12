package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    //make a new scanner object to write with
        Scanner input = new Scanner(System.in);
        //filehandler
        FileThingy fileThingy = new FileThingy();
        //create a new grocerylist object
        GroceryList groceryList = new GroceryList();

        //loop over the grocerylist array as long as it holds fewer objects than 10
        while(groceryList.noMoreThanTen())
        {
            fileThingy.readGroceryListFromFile("Groceries.txt");
            groceryList.groceryItemOrders = groceryList.addToGroceries(groceryList.groceryItemOrders,input);
            System.out.println(groceryList);
        }


    }
}
