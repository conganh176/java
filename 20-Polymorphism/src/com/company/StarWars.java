package com.company;

public class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot()
    {
        return "A really bad sequel made by Disney";
    }
}
