package com.company;

public abstract class Property {
    private int shift;
    private int maxSecurity;
    private int totalSecurity;
    private Security[] securities;

    public Property(int shift, int maxSecurity) {
        this.shift = shift;
        this.maxSecurity = maxSecurity;
        securities = new Security[maxSecurity];
    }
}
