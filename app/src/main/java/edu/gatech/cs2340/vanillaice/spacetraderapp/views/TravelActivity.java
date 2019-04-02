package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Planet;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.ConfigurationViewModel;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.TravelViewModel;

/**
 * Represents the travel screen.
 */
public class TravelActivity extends AppCompatActivity {
    private Spinner travelSpinner;
    private TravelViewModel travelViewModel;
    private final ConfigurationViewModel cvm = ConfigurationViewModel.getInstance();

    /**
     * Creates the travel screen.
     * @param savedInstanceState The last known state of the travel screen.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        TextView fuel = findViewById(R.id.fuel);
        TextView planet = findViewById(R.id.currentPlanetTextView);
        Button travelButton = findViewById(R.id.travelButton);
        Button cancelButton = findViewById(R.id.cancelButton);
        travelSpinner = findViewById(R.id.travelPlanets);
        travelViewModel =
                new TravelViewModel(cvm.getPlayer(),
                        cvm.getUniverse());
        String fueltext = "Fuel: " + travelViewModel.getFuel();
        List<Planet> planets = travelViewModel.planetsInRange();
        String planettext = "Current Planet: " + getCurrentPlanet();
        fuel.setText(fueltext);
        planet.setText(planettext);

        travelSpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,
                planets));

        travelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toastMessage;
                toastMessage = travel((Planet) travelSpinner.getSelectedItem());
                startActivity(new Intent(TravelActivity.this, GameActivity.class));
                Toast toast = Toast.makeText(getApplicationContext(), toastMessage,
                        Toast.LENGTH_LONG);
                toast.show();


            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TravelActivity.this, GameActivity.class));
            }
        });
    }

    /**
     * Changes the player's current planet.
     * @param planet The planet the player wants to go to.
     * @return A message of what happened during the travel.
     */
    public String travel(Planet planet) {
        return travelViewModel.travel(planet);
    }

    /**
     * Gets the player's current planet.
     * @return The planet that the player is currently on.
     */
    public Planet getCurrentPlanet() {
        return travelViewModel.getCurrentPlanet();
    }


}
