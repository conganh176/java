package com.company;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account()
    {
        this("00000000", 0, "Default Name", "Default Email", "Default phone number");
        System.out.println("New account created with default detail");
    }

    public Account(String number, double balance, String name, String email, String phone)
    {
        setNumber(number);
        setBalance(balance);
        setName(name);
        setEmail(email);
        setEmail(phone);

        System.out.println("New account created with full information");
        System.out.println("Number: " + number);
        System.out.println("Balance: " + balance);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phone);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.println(amount + " deposited, " + this.balance + " remained");
    }

    public void withdraw(double amount)
    {
        if (this.balance - amount <= 0)
        {
            System.out.println("Only " + this.balance + " available, cannot withdraw");
        }
        else
        {
            this.balance -= amount;
            System.out.println(amount + " withdrew, " + this.balance + " remained");
        }
    }
}
