package com.company;

public class Main {

    public static void main(String[] args) {
        Account bankAccount = new Account("42069666", 69, "John Smith" , "mail@mail.com", "555-1234");

        bankAccount.deposit(100);
        bankAccount.withdraw(200);
        bankAccount.withdraw(80);

        Account secondBankAccount = new Account();

        VipAccount vipAccount = new VipAccount("Not John Smith", 420.69, "notmail@mail.com");
    }
}
