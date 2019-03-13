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

public class MarketActivity extends AppCompatActivity {
    private Button buyButton;
    private Button sellButton;
    private Button returnButton;
    private TextView credits;
    private TextView planet;
    private TextView cargo;
    private Player player;
    private MarketViewModel viewModel = new MarketViewModel(ConfigurationViewModel.getInstance().getPlayer());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        player = ConfigurationViewModel.getInstance().getPlayer();
        credits = findViewById(R.id.marketCredits);
        cargo = findViewById(R.id.marketCargo);
        buyButton = findViewById(R.id.buyButton);
        sellButton = findViewById(R.id.buyButton2);
        returnButton = findViewById(R.id.returnButton);
        planet = findViewById(R.id.marketPlanet);
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
