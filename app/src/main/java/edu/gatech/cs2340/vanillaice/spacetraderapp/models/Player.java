package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

public class Player {
    private String name;
    private int pilot;
    private int fighter;
    private int trader;
    private int engineer;
    private int credits;

    public Player(String name, int pilot, int fighter, int trader, int engineer) {
        this.name = name;
        this.pilot = pilot;
        this.fighter = fighter;
        this.trader = trader;
        this.engineer = engineer;
        this.credits = 1000;
    }

    public String getName() {
        return name;
    }
    public int getPilot(){
        return pilot;
    }
    public int getFighter(){
        return fighter;
    }
    public int getTrader(){
        return trader;
    }
    public int getEngineer(){
        return engineer;
    }
    public int getCredits() {
        return credits;
    }
}
