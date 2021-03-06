package com.company;

public class Player {
    private String name;
    private int health = 100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 200)
            this.health = health;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void loseHealth(int damage)
    {
        this.health -= damage;
        if (this.health <= 0)
            System.out.println("Player died");
    }
}
