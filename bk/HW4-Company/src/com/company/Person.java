package com.company;

public abstract class Person {
    private String name;
    private int age;
    private String pid;
    private String tax;
    private boolean isMale;
    private String ins;

    public Person(String name, int age, String pid, String tax, boolean isMale, String ins) {
        setName(name);
        setAge(age);
        setPid(pid);
        setTax(tax);
        setMale(isMale);
        setIns(ins);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getIns() {
        return ins;
    }

    public void setIns(String ins) {
        this.ins = ins;
    }


}
