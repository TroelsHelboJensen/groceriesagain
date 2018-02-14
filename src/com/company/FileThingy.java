package com.company;

import java.io.*;
import java.util.Scanner;


public class FileThingy
{
    public void readGroceryListFromFile(String path,GroceryList2 groceryList)
    {
        File file = new File(path);
        GroceryItemOrder groceryItemOrder;
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                String nextLine = scanner.nextLine();

                String[] groceryItems = nextLine.split(",");
                groceryItemOrder = new GroceryItemOrder(groceryItems[0], Integer.parseInt(groceryItems[1]),Float.parseFloat(groceryItems[2]));
                //groceryList.groceryItemOrders = groceryList.addToGroceries(groceryItemOrder);
                groceryList.addToGroceries(groceryItemOrder);
            }
            scanner.close();
        }
        catch (FileNotFoundException eFNF)
        {
            eFNF.printStackTrace();
        }
    }
}