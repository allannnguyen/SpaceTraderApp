package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.io.Serializable;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Difficulty;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.ConfigurationViewModel;

public class MainActivity extends AppCompatActivity implements Serializable {
    private ConfigurationViewModel viewModel;
    private EditText nameEntry;
    private TextView remainingPoints;
    private Button pUp;
    private Button pDown;
    private Button fUp;
    private Button fDown;
    private Button tUp;
    private Button tDown;
    private Button eUp;
    private Button eDown;
    private Button createButton;
    private Button exitButton;
    private TextView pilotPoints;
    private TextView fighterPoints;
    private TextView traderPoints;
    private TextView engineerPoints;
    private int pCounter = 0;
    private int fCounter = 0;
    private int tCounter = 0;
    private int eCounter = 0;
    private Spinner difficultySpinner;
    int total = 16;

    @Override
    @SuppressWarnings("serial")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        viewModel = ConfigurationViewModel.getInstance();
        nameEntry = findViewById(R.id.nameEntry);
        remainingPoints = findViewById(R.id.remainingPoints);
        pUp = findViewById(R.id.pUp);
        pDown = findViewById(R.id.pDown);
        fUp = findViewById(R.id.fUp);
        fDown = findViewById(R.id.fDown);
        tUp = findViewById(R.id.tUp);
        tDown = findViewById(R.id.tDown);
        eUp = findViewById(R.id.eUp);
        eDown = findViewById(R.id.eDown);
        createButton = findViewById(R.id.createButton);
        exitButton = findViewById(R.id.exitButton);
        pilotPoints = findViewById(R.id.pilotPoints);
        fighterPoints = findViewById(R.id.fighterPoints);
        traderPoints = findViewById(R.id.traderPoints);
        engineerPoints = findViewById(R.id.engineerPoints);
        difficultySpinner = findViewById(R.id.difficultySpinner);
        Log.i("reached pos1", " YES");
        //int total = 16;
        remainingPoints.setText("Remaining Points: " + Integer.toString(total));

        difficultySpinner.setAdapter(new ArrayAdapter<Difficulty>(this,
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
                if (total < 16 && pCounter > 0) {
                    pCounter--;
                    pilotPoints.setText(Integer.toString(pCounter));
                    total++;
                    remainingPoints.setText("Remaining Points: " + Integer.toString(total));
                }

            }
        });


        fUp.setOnClickListener(new View.OnClickListener() {
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
                if (total < 16 && fCounter > 0) {
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
                if (total < 16 && tCounter > 0) {
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
                    int x =6;
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
                if (total < 16 && eCounter > 0) {
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
               if (total == 0 && pCounter >= 0 && fCounter >= 0 && tCounter >= 0 && eCounter >= 0 && !nameEntry.getText().toString().equals("")) {
                   viewModel.createPlayer(nameEntry.getText().toString(),
                           (Difficulty) difficultySpinner.getSelectedItem(),
                           pCounter, fCounter, tCounter, eCounter);
                   Player player = viewModel.getPlayer();

                   Intent i = new Intent(MainActivity.this, GameActivity.class);
                   i.putExtra("player", player);
                   startActivity(i);
               }
           }
        });



    }
}
