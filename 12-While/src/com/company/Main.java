package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        System.out.println("While\n");
        while (count < 10)
        {
            System.out.println(count);
            count++;
        }

        System.out.println("Do\n");
        do
        {
            System.out.println(count);
            count--;
        } while (count > 0);

        int num = 0;
        System.out.println("Function\n");
        while (count <= 100)
        {
            count ++;
            if (count % 2 != 0)
            {
                continue;
            }
            num += count;
        }

        System.out.println("Total: " + num);
    }
}
