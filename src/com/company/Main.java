package com.company;

public class Main {
    
    public static void main(String[] args)
    {
        //filehandler
        FileThingy fileThingy = new FileThingy();
        
        //create a new grocerylist object
        //grocerylist arraylist
        //GroceryList2 groceryList = new GroceryList2();
        GroceryList groceryList = new GroceryList();

        
        fileThingy.readGroceryListFromFile("Groceries.txt", groceryList);
        System.out.println(groceryList);
        


    }
}
