package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        GroceryList tmpList = new GroceryList();
        tmpList.addToGroceries(new GroceryItemOrder[1],input);

    }
}
