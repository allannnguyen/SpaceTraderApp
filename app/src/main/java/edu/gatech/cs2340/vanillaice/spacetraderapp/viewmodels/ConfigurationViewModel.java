package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;

import android.util.Log;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Difficulty;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;

public class ConfigurationViewModel {
    private int pilot;
    private int fighter;
    private int trader;
    private int engineer;

    public void createPlayer(String name, Difficulty difficulty, int pilot, int fighter, int trader, int engineer) {
        Player newPlayer = new Player(name, difficulty, pilot, fighter, trader, engineer);
        Log.d("Player", newPlayer.toString());
    }
    public boolean checkPlayer(int pilot, int fighter, int trader, int engineer) {
        return 16 == (pilot + fighter + trader + engineer);
    }

    public int getPilot(){
        return pilot;
    }
    public int getFighter() {
        return fighter;
    }
    public int getTrader(){
        return trader;
    }
    public int getEngineer() {
        return engineer;
    }

    public void setPilot(int pilot) {
        this.pilot = pilot;
    }
    public void setFighter(int fighter) {
        this.fighter = fighter;
    }
    public void setTrader(int trader) {
        this.trader = trader;
    }
    public void setEngineer(int engineer) {
        this.engineer = engineer;
    }
}
