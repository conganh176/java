package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList()
    {
        return groceryList;
    }

    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " item(s) in grocery list");
        for (int i = 0; i < groceryList.size(); i++)
        {
            System.out.println((i + 1) + ") " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem)
    {
        int position = findItem(currentItem);
        if (position >= 0)
        {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String item)
    {
        groceryList.set(position, item);
    }

    public void removeGroceryList(String item)
    {
        int position = findItem(item);
        if (position >= 0)
        {
            removeGroceryList(position);
        }
    }

    private void removeGroceryList(int position)
    {
        groceryList.remove(position);
    }

    private int findItem(String searchedItem)
    {
        return groceryList.indexOf(searchedItem);
    }

    public boolean onList(String item)
    {
        int position = findItem(item);

        if (position >= 0)
            return true;

        return false;
    }
}
