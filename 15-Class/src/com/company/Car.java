package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void SetDoor(int num)
    {
        this.doors = num;
    }

    public void SetWheels(int num)
    {
        this.wheels = num;
    }

    public void SetModel(String name)
    {
        this.model = name;
    }

    public void SetEngine(String name)
    {
        this.engine = name;
    }

    public void SetColor(String name)
    {
        this.color = name;
    }

    public int GetDoor()
    {
        return this.doors;
    }

    public int GetWheels()
    {
        return this.wheels;
    }

    public String GetModel()
    {
        return this.model;
    }

    public String GetEngine()
    {
        return this.engine;
    }

    public String GetColor()
    {
        return this.color;
    }
}
