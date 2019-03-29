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
    private TextView fuel;
    private TextView planet;
    private Spinner travelSpinner;
    private Button travelButton;
    private Button cancelButton;
    private List<Planet> planets;
    private TravelViewModel travelViewModel;

    /**
     * Creates the travel screen.
     * @param savedInstanceState The last known state of the travel screen.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        fuel = findViewById(R.id.fuel);
        planet = findViewById(R.id.currentPlanetTextView);
        travelButton = findViewById(R.id.travelButton);
        cancelButton = findViewById(R.id.cancelButton);
        travelSpinner = findViewById(R.id.travelPlanets);
        travelViewModel =
                new TravelViewModel(ConfigurationViewModel.getInstance().getPlayer(),
                        ConfigurationViewModel.getInstance().getUniverse());
        String fueltext = "Fuel: " + travelViewModel.getFuel();
        planets = travelViewModel.planetsInRange();
        String planettext = "Current Planet: " + travelViewModel.getCurrentPlanet();
        fuel.setText(fueltext);
        planet.setText(planettext);

        travelSpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, planets));

        travelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toastMessage;
                toastMessage = travelViewModel.travel((Planet) travelSpinner.getSelectedItem());
                startActivity(new Intent(TravelActivity.this, GameActivity.class));
                Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG);
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


}
