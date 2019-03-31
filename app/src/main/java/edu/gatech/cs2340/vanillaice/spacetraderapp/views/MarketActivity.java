package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.ConfigurationViewModel;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.MarketViewModel;

/**
 * Represents the market screen.
 */
public class MarketActivity extends AppCompatActivity {
    private final MarketViewModel viewModel = new MarketViewModel(ConfigurationViewModel
            .getInstance().getPlayer());

    /**
     * Creates the market screen.
     * @param savedInstanceState The last known state of teh market screen.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        Player player = ConfigurationViewModel.getInstance().getPlayer();
        TextView credits = findViewById(R.id.marketCredits);
        TextView cargo = findViewById(R.id.marketCargo);
        Button buyButton = findViewById(R.id.buyButton);
        Button sellButton = findViewById(R.id.buyButton2);
        Button returnButton = findViewById(R.id.returnButton);
        TextView planet = findViewById(R.id.marketPlanet);
        String creditsText = "Cargo Credits: " + viewModel.getPlayerCredits();
        String planetText = "Planet: " + player.getPlanet().getName();
        String cargoText = "Cargo Space: " + viewModel.getCargoSpace();
        credits.setText(creditsText);
        planet.setText(planetText);
        cargo.setText(cargoText);
        //Intent i = getIntent();
        //player = (Player) i.getSerializableExtra("player");
        //viewModel = new MarketViewModel(player);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass viwemodel to buyactivity
                Intent i = new Intent(MarketActivity.this, BuyActivity.class);
                //i.putExtra("viewmodel", viewModel);
                startActivity(i);
            }
        });

        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass viewmodel to sellactivity
                Intent i = new Intent(MarketActivity.this, SellActivity.class);
                //i.putExtra("viewmodel", viewModel);
                startActivity(i);
            }
        });

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MarketActivity.this, GameActivity.class);
                startActivity(i);
            }
        });







    }
}
