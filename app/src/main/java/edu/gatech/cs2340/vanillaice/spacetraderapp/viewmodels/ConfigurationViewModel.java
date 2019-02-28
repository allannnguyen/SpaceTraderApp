package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;

import android.util.Log;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Difficulty;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Universe;

/**
 * Handles the player creation process and subsequent checks
 */
public class ConfigurationViewModel {
    private int pilot;
    private int fighter;
    private int trader;
    private int engineer;

    /**
     * Creates the player based on input parameters
     * @param name player's name
     * @param difficulty selected game difficulty
     * @param pilot player's selected pilot skillpoints
     * @param fighter player's selected fighter skillpoints
     * @param trader player's selected trader skillpoints
     * @param engineer player's selected engineer skillpoints
     */
    public void createPlayer(String name, Difficulty difficulty, int pilot, int fighter, int trader, int engineer) {
        Universe newUniverse = new Universe();
        Player newPlayer = new Player(name, difficulty, pilot, fighter, trader, engineer, newUniverse.getPlanets().get(0));
        Log.d("Player", newPlayer.toString());
        largeLog("Universe", newUniverse.toString());
    }

    /**
     * Checks that the created player is a valid player
     * @param pilot player's selected pilot skillpoints
     * @param fighter player's selected fighter skillpoints
     * @param trader player's selected trader skillpoints
     * @param engineer player's selected engineer skillpoints
     * @return if the player is a valid player or not
     */
    public boolean checkPlayer(int pilot, int fighter, int trader, int engineer) {
        return 16 == (pilot + fighter + trader + engineer);
    }

    /**
     * Gets the amount of pilot skillpoints chosen
     * @return player's pilot skillpoints
     */
    public int getPilot(){
        return pilot;
    }

    /**
     * Gets the amount of fighter skillpoints chosen
     * @return player's fighter skillpoints
     */
    public int getFighter() {
        return fighter;
    }

    /**
     * Gets the amount of trader skillpoints chosen
     * @return player's trader skillpoints
     */
    public int getTrader(){
        return trader;
    }

    /**
     * Gets the amount of engineer skillpoints chosen
     * @return player's engineer skillpoints
     */
    public int getEngineer() {
        return engineer;
    }

    /**
     * Sets the amount of pilot skillpoints
     * @param pilot player's selected pilot skillpoints
     */
    public void setPilot(int pilot) {
        this.pilot = pilot;
    }

    /**
     * Sets the amount of fighter skillpoints
     * @param fighter player's selected fighter skillpoints
     */
    public void setFighter(int fighter) {
        this.fighter = fighter;
    }

    /**
     * Sets the amount of trader skillpoints
     * @param trader player's selected trader skillpoints
     */
    public void setTrader(int trader) {
        this.trader = trader;
    }

    /**
     * Sets the amount of engineer skillpoints
     * @param engineer player's selected engineer skillpoints
     */
    public void setEngineer(int engineer) {
        this.engineer = engineer;
    }

    public static void largeLog(String tag, String content) {
        if (content.length() > 4000) {
            Log.d(tag, content.substring(0, 4000));
            largeLog(tag, content.substring(4000));
        } else {
            Log.d(tag, content);
        }
    }
}
