package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;

/**
 * Represents the screen where the player is configured
 */
public class ConfigurationActivity extends AppCompatActivity {

    /**
     * Creates the configuration screen
     * @param savedInstanceState The last known state of the configuration screen
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
    }
}
