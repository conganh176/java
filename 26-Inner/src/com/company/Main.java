package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button buttonPrint = new Button("Print");

    public static void main(String[] args) {
//        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

        class ClickListener implements Button.OnClickListener
        {
            public ClickListener()
            {
                System.out.println("I've been attached");
            }


            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        buttonPrint.setOnClickListener(new ClickListener());
        listen();
//        buttonPrint.setOnClickListener(new Button.OnClickListener()       //anonymous class
//        {
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        });
//        listen();
    }

    private static void listen()
    {
        boolean quit = false;
        while (!quit)
        {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    buttonPrint.onClick();
            }
        }
    }
}
