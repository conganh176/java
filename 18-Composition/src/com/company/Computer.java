package com.company;

public class Computer {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public Computer(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private Case getTheCase() {
        return theCase;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    public void powerUp()
    {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        getMonitor().drawPixelArt(800, 600, "lavender");
    }
}
