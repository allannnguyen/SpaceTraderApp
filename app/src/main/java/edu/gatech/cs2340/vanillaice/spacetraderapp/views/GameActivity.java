package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.ConfigurationViewModel;

/**
 * Represents the main menu screen.
 */
public class GameActivity extends AppCompatActivity {
    private final ConfigurationViewModel cvm = ConfigurationViewModel.getInstance();

    /**
     * Creates the screen of the main menu
     * @param savedInstanceState The last known state of teh main menu
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //Intent i = getIntent();
        //player = (Player)i.getSerializableExtra("player");

        Button travelButton = findViewById(R.id.travelButton);
        Button tradeButton = findViewById(R.id.tradeButton);

        travelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameActivity.this, TravelActivity.class));
            }
        });

        tradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass player onto marketActivity
                Intent i = new Intent(GameActivity.this, MarketActivity.class);
                //i.putExtra("player", player);
                startActivity(i);
            }
        });
    }

    /**
     * Creates a drop down menu on the corner of the screen
     * @param menu The menu that will be shown when the drop down is selected.
     * @return True if the drop down menu is created
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    /**
     * Sends the call to save or load the game when the save or load buttons are pressed.
     * @param item The button from the drop down menu that is pressed.
     * @return True if the load/save is successful. False otherwise.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        File file;
        if (item.getItemId() == R.id.save_game) {
            file = new File(this.getFilesDir(), ConfigurationViewModel.DEFAULT_BINARY_FILE_NAME);
            Log.d("MY APP", "Saving");
            return saveBinary(file);
        }
        else {
            //create a file object in the local files section
            file = new File(this.getFilesDir(), ConfigurationViewModel.DEFAULT_BINARY_FILE_NAME);
            Log.d("MY APP", "Loading Binary Data");
            //cvm.loadBinary(file);
            Intent i = new Intent(GameActivity.this, GameActivity.class);
            startActivity(i);
            return loadBinary(file);
        }
    }

    /**
     * Loads Binary save file
     * @param file the save file to be loaded
     * @return whether the file was loaded
     */
    private boolean loadBinary(File file) {
        return cvm.loadBinary(file);
    }

    /**
     * Saves game data into a file
     * @param file file where data is saved
     * @return whether the data is saved onto the file
     */
    private boolean saveBinary(File file) {
        return cvm.saveBinary(file);
    }
}
