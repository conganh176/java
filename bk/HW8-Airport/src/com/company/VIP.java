package com.company;

public class VIP extends Person {
    private String idIdentifier;

    public VIP(int idNumber, String name, String idIdentifier) {
        super(idNumber, name);
        this.idIdentifier = idIdentifier;
    }
}
