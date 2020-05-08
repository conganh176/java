package com.company;

public class Main {

    public static void main(String[] args) {
        String privateVar = "This is a private var from Main";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree cannot access in Main");

        /*System.out.println("scopeInstance privateVar is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println();
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();*/
    }
}
