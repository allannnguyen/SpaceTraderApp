package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.File;
import java.io.Serializable;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Difficulty;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.ConfigurationViewModel;

/**
 * Represents the configuration screen.
 */
public class MainActivity extends AppCompatActivity implements Serializable {
    private ConfigurationViewModel viewModel;
    private EditText nameEntry;
    private TextView remainingPoints;
    private TextView pilotPoints;
    private TextView fighterPoints;
    private TextView traderPoints;
    private TextView engineerPoints;
    private int pCounter;
    private int fCounter;
    private int tCounter;
    private int eCounter;
    private Spinner difficultySpinner;
    private final int maxTotal = 16;
    private int total = maxTotal;
    private final String emptyStr = "";

    /**
     * Creates the configuration screen
     * @param savedInstanceState The last known state of the configuration screen
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        viewModel = ConfigurationViewModel.getInstance();
        nameEntry = findViewById(R.id.nameEntry);
        remainingPoints = findViewById(R.id.remainingPoints);
        Button pUp = findViewById(R.id.pUp);
        Button pDown = findViewById(R.id.pDown);
        Button fUp = findViewById(R.id.fUp);
        Button fDown = findViewById(R.id.fDown);
        Button tUp = findViewById(R.id.tUp);
        Button tDown = findViewById(R.id.tDown);
        Button eUp = findViewById(R.id.eUp);
        Button eDown = findViewById(R.id.eDown);
        Button createButton = findViewById(R.id.createButton);
        pilotPoints = findViewById(R.id.pilotPoints);
        fighterPoints = findViewById(R.id.fighterPoints);
        traderPoints = findViewById(R.id.traderPoints);
        engineerPoints = findViewById(R.id.engineerPoints);
        difficultySpinner = findViewById(R.id.difficultySpinner);
        Log.i("reached pos1", " YES");
        //int total = 16;
        remainingPoints.setText("Remaining Points: " + Integer.toString(total));

        difficultySpinner.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, Difficulty.values()));

        pUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    pCounter++;
                    pilotPoints.setText(Integer.toString(pCounter));
                    total--;
                    remainingPoints.setText("Remaining Points: " + Integer.toString(total));
                }


            }
        });

        pDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((total < maxTotal) && (pCounter > 0)) {
                    pCounter--;
                    pilotPoints.setText(Integer.toString(pCounter));
                    total++;
                    remainingPoints.setText("Remaining Points: " + Integer.toString(total));
                }

            }
        });


        fUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if (total > 0) {
                    fCounter++;
                    fighterPoints.setText(Integer.toString(fCounter));
                    total--;
                    remainingPoints.setText("Remaining Points: " + Integer.toString(total));
                }
            }
        });

        fDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((total < maxTotal) && (fCounter > 0)) {
                    fCounter--;
                    fighterPoints.setText(Integer.toString(fCounter));
                    total++;
                    remainingPoints.setText("Remaining Points: " + Integer.toString(total));
                }
            }
        });

        tUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    tCounter++;
                    traderPoints.setText(Integer.toString(tCounter));
                    total--;
                    remainingPoints.setText("Remaining Points: " + Integer.toString(total));
                }
            }
        });

        tDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((total < maxTotal) && (tCounter > 0)) {
                    tCounter--;
                    traderPoints.setText(Integer.toString(tCounter));
                    total++;
                    remainingPoints.setText("Remaining Points: " + Integer.toString(total));
                }

            }
        });

        eUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    eCounter++;
                    engineerPoints.setText(Integer.toString(eCounter));
                    total--;
                    remainingPoints.setText("Remaining Points: " + Integer.toString(total));
                }
            }
        });

        eDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((total < maxTotal) && (eCounter > 0)) {
                    eCounter--;
                    engineerPoints.setText(Integer.toString(eCounter));
                    total++;
                    remainingPoints.setText("Remaining Points: " + Integer.toString(total));
                }
            }
        });

        createButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if ((total == 0) && (pCounter >= 0) && (fCounter >= 0) && (tCounter >= 0)
                       && (eCounter >= 0) && (!emptyStr.equals(nameEntry.getText().toString()))) {
                   viewModel.createPlayer(nameEntry.getText().toString(),
                           (Difficulty) difficultySpinner.getSelectedItem(),
                           pCounter, fCounter, tCounter, eCounter);

                   Intent i = new Intent(MainActivity.this, GameActivity.class);
                   //i.putExtra("player", player);
                   startActivity(i);
               }
           }
        });



    }

    /**
     * Creates a drop down menu on the corner of teh screen.
     * @param menu The menu that will be shown when the drop down is selected.
     * @return True if the drop down menu is selected.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    /**
     * Sends the call to save or load the game when the save or load button is pressed.
     * @param item The button from the drop down menu that is pressed.
     * @return True if the save/load is successful. False otherwise.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        File file;
        if (item.getItemId() == R.id.save_game) {
            file = new File(this.getFilesDir(), ConfigurationViewModel.DEFAULT_BINARY_FILE_NAME);
            Log.d("MY APP", "Saving");
            return saveBinary(file);
        } else {
            //create a file object in the local files section
            file = new File(this.getFilesDir(), ConfigurationViewModel.DEFAULT_BINARY_FILE_NAME);
            Log.d("MY APP", "Loading Binary Data");
            loadBinary(file);
            Intent i = new Intent(MainActivity.this, GameActivity.class);
            startActivity(i);
            return true;
        }
    }

    /**
     * Saves data onto a file
     * @param file the file that data is saved on
     * @return whether the data is saved
     */
    private boolean saveBinary(File file) {
        return viewModel.saveBinary(file);
    }

    /**
     * Loads data from file
     * @param file the file that data is located on
     * @return whether the data is loaded.
     */
    private boolean loadBinary(File file) {
        return viewModel.loadBinary(file);
    }
}
