package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;

import android.util.Log;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Difficulty;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Good;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Universe;

/**
 * Handles the player creation process and subsequent checks
 */
public class ConfigurationViewModel {
    private Player player;
    private Universe universe;
    private static ConfigurationViewModel configSingle = new ConfigurationViewModel();

    private ConfigurationViewModel() {}

    public static ConfigurationViewModel getInstance() {
        return configSingle;
    }
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
        universe = new Universe();
        player = new Player(name, difficulty, pilot, fighter, trader, engineer, universe.getPlanets().get(0));
        Log.d("Player", player.toString());
        largeLog("Universe", universe.toString());
    }

    /**
     * Gets the player
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the universe
     * @return the universe
     */
    public Universe getUniverse() {
        return universe;
    }

    /**
     * Prints out large log numbers
     * @param tag
     * @param content
     */
    public static void largeLog(String tag, String content) {
        if (content.length() > 4000) {
            Log.d(tag, content.substring(0, 4000));
            largeLog(tag, content.substring(4000));
        } else {
            Log.d(tag, content);
        }
    }
}
