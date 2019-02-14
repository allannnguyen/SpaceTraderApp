package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

public class Player {
    private String name;
    private int pilot;
    private int fighter;
    private int trader;
    private int engineer;
    private int credits;
    private Difficulty difficulty;
    private Ships ship;

    public Player(String name, Difficulty difficulty, int pilot, int fighter, int trader, int engineer) {
        this.name = name;
        this.difficulty = difficulty;
        this.pilot = pilot;
        this.fighter = fighter;
        this.trader = trader;
        this.engineer = engineer;
        this.credits = 1000;
        this.ship = Ships.GNAT;
    }

    public String getName() {
        return name;
    }
    public int getPilot(){ return pilot; }
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
    public Difficulty getDifficulty(){ return difficulty;}
    public Ships getShip(){ return ship;}
}
