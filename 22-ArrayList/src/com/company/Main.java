package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstruction();

	    while(!quit)
        {
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt())
            {
                choice = scanner.nextInt();
                scanner.nextLine();
            }
            else
            {
                continue;
            }

            switch (choice)
            {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    continue;
            }
        }
    }

    public static void printInstruction()
    {
        System.out.println("0 - Print choice instruction");
        System.out.println("1 - Print grocery list");
        System.out.println("2 - Add item to list");
        System.out.println("3 - Modify item in list");
        System.out.println("4 - Remove item in list");
        System.out.println("5 - Search item in list");
        System.out.println("6 - Process array list");
        System.out.println("7 - Quit");
    }

    public static void addItem()
    {
        System.out.print("Enter grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem()
    {
        System.out.print("Enter item: ");
        String item = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }

    public static void removeItem()
    {
        System.out.print("Enter item: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryList(item);
    }

    public static void searchForItem()
    {
        System.out.print("Item to search for: ");
        String searchedItem = scanner.nextLine();
        if (groceryList.onList(searchedItem))
            System.out.println("Founded item " + searchedItem);
        else
            System.out.println(searchedItem + " not founded");
    }

    public static void processArrayList()
    {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        System.out.println("Considered it's done");
    }
}
