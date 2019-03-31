package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;

/**
 * Represents the screen where the player will randomly encounter other characters
 */
public class EncounterActivity extends AppCompatActivity {

    /**
     * Creates the screen where the random encounter occurs
     * @param savedInstanceState The last known state of the encounter screen
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encounter);

        Button cancelButton = findViewById(R.id.cancelButton);


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EncounterActivity.this, GameActivity.class));
            }
        });
    }
}
