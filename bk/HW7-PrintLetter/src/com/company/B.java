package com.company;

public class B extends A {
    public B() {
        System.out.println("B");
    }

    @Override
    public void show() {
        System.out.println("D");
    }
}
