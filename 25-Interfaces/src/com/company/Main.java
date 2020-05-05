package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone myPhone;

        myPhone = new DeskPhone(55542069);
        myPhone.powerOn();
        myPhone.callPhone(55542069);
        myPhone.answer();

        System.out.println();

        myPhone = new MobilePhone(555696969);
        myPhone.powerOn();
        myPhone.callPhone(555696969);
        myPhone.answer();
    }
}
