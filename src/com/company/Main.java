package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //filehandler
        FileThingy fileThingy = new FileThingy();
        //create a new grocerylist object
        GroceryList groceryList = new GroceryList();

        //loop over the grocerylist array as long as it holds fewer objects than 10
        while(groceryList.noMoreThanTen())
        {
            fileThingy.readGroceryListFromFile("Groceries.txt", groceryList);
            System.out.println(groceryList);
        }


    }
}
