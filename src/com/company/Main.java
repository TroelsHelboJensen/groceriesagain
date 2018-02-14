package com.company;

import java.util.Scanner;

public class Main {

    /*
    BUGS:
    hvis der er mindre end 10 så adder den det dobbelt, altså hvis der er 7 så bliver det til 14
    hvis man siger der skal være mere end 10 så kører den i uendeligt loop
     */
    
    public static void main(String[] args)
    {
        //filehandler
        FileThingy fileThingy = new FileThingy();
        //create a new grocerylist object
        GroceryList2 groceryList = new GroceryList2();

        //loop over the grocerylist array as long as it holds fewer objects than 10
        while(groceryList.noMoreThanTen())
        {
            fileThingy.readGroceryListFromFile("Groceries.txt", groceryList);
            System.out.println(groceryList);
        }


    }
}
