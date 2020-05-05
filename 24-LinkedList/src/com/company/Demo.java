package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        addInOrder(placeToVisit, "Hell");
        addInOrder(placeToVisit, "Heaven");
        addInOrder(placeToVisit, "America");
        addInOrder(placeToVisit, "Japan");
        addInOrder(placeToVisit, "Korea");
        addInOrder(placeToVisit, "Somewhere");
        addInOrder(placeToVisit, "Nowhere");
        addInOrder(placeToVisit, "Anywhere");
        addInOrder(placeToVisit, "Home");
        addInOrder(placeToVisit, "Death");
//        placeToVisit.add("Hell");
//        placeToVisit.add("Heaven");
//        placeToVisit.add("America");
//        placeToVisit.add("Japan");
//        placeToVisit.add("Korea");
//        placeToVisit.add("Somewhere");
//        placeToVisit.add("Nowhere");
//        placeToVisit.add("Anywhere");
//        placeToVisit.add("Home");
//        placeToVisit.add("Death");

        printList(placeToVisit);

        System.out.println();
        addInOrder(placeToVisit, "Middle Earth");
        addInOrder(placeToVisit, "Home");
        printList(placeToVisit);

        visit(placeToVisit);

//        System.out.println();
//        placeToVisit.remove(5);
//        printList(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList)
    {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext())
            System.out.println("Now visiting " + i.next());

        System.out.println("End of the line");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext())
        {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0)
            {
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if (comparison > 0)
            {
                System.out.println(newCity + " should appear before this one");
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison < 0)
            {

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty())
        {
            System.out.println("No cities in the itenerary");
            return;
        }
        else
        {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action)
            {
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward)
                    {
                        if (listIterator.hasNext())
                            listIterator.next();

                        goingForward = true;
                    }
                    if (listIterator.hasNext())
                        System.out.println("Now visiting " + listIterator.next());
                    else
                    {
                        System.out.println("End of the line");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward)
                    {
                        if (listIterator.hasPrevious())
                            listIterator.previous();

                        goingForward = false;
                    }
                    if (listIterator.hasPrevious())
                        System.out.println("Now visiting " + listIterator.previous());
                    else
                    {
                        System.out.println("Start of the line");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions: ");
        System.out.println("0 - Quit");
        System.out.println("1 - Next city");
        System.out.println("2 - Previous city");
        System.out.println("3 - Print menu options");
    }
}
