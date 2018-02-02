package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        GroceryList tmpList = new GroceryList();
        GroceryItemOrder[] orders = new GroceryItemOrder[0];

        while(tmpList.noMoreThanTen())
        {
            orders = tmpList.addToGroceries(orders,input);
            System.out.println(orders.length);
        }


    }
}
