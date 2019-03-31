package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;

import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Difficulty;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Universe;

/**
 * Handles the player creation process and subsequent checks
 */
public final class ConfigurationViewModel {
    private Player player;
    private Universe universe;
    private static final ConfigurationViewModel configSingle = new ConfigurationViewModel();
    public static final String DEFAULT_BINARY_FILE_NAME = "data.bin";

    private ConfigurationViewModel() {}

    /**
     * Gets the singleton instance of teh configuration viewmodel
     * @return The instance of teh configuration viewmodel
     */
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
    public void createPlayer(String name, Difficulty difficulty, int pilot, int fighter,
                             int trader, int engineer) {
        universe = new Universe();
        player = new Player(name, difficulty, pilot, fighter, trader, engineer,
                universe.getPlanets().get(0));
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
     * @param tag The type of the log message
     * @param content The message that will be printed in the log
     */
    private static void largeLog(String tag, String content) {
        if (content.length() > 4000) {
            Log.d(tag, content.substring(0, 4000));
            largeLog(tag, content.substring(4000));
        } else {
            Log.d(tag, content);
        }
    }

    /**
     * Loads the data of the game.
     * @param file The file from which the data will be loaded
     * @return True if the data is loaded. False if there is an exception.
     */
    public boolean loadBinary(File file) {
        boolean success = true;
        try {
            /*
              To read, we must use the ObjectInputStream since we want to read our model in with
              a single read.
             */
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            // assuming we saved our top level object, we read it back in with one line of code.
            player = (Player) in.readObject();
            universe = (Universe) in.readObject();
            in.close();
        } catch (IOException e) {
            Log.e("MY APP", "Error reading an entry from binary file",e);
            success = false;
        } catch (ClassNotFoundException e) {
            Log.e("MY APP", "Error casting a class from the binary file",e);
            success = false;
        }

        return success;
    }

    /**
     * Saves the data of the game
     * @param file The file to which the data will be saved
     * @return True if the data is saved. False if there is an exception.
     */
    public boolean saveBinary(File file) {
        boolean success = true;
        try {
            /*
               For binary, we use Serialization, so everything we write has to implement
               the Serializable interface.  Fortunately all the collection classes and APi classes
               that we might use are already Serializable.  You just have to make sure your
               classes implement Serializable.

               We have to use an ObjectOutputStream to write objects.

               One thing to be careful of:  You cannot serialize static data.
             */


            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(file));
            // We basically can save our entire data model with one write, since this will follow
            // all the links and pointers to save everything.  Just save the top level object.
            out.writeObject(player);
            out.writeObject(universe);
            out.close();

        } catch (IOException e) {
            Log.e("UserManagerFacade", "Error writing an entry from binary file",e);
            success = false;
        }
        return success;
    }

}
