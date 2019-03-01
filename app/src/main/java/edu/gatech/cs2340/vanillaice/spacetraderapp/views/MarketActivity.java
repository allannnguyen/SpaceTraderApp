package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.MarketViewModel;

public class MarketActivity extends AppCompatActivity {
    private Button buyButton;
    private Button sellButton;
    private Player player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        buyButton = findViewById(R.id.buyButton);
        sellButton = findViewById(R.id.sellButton);
        Intent i = getIntent();
        player = (Player) i.getSerializableExtra("player");
        MarketViewModel viewModel = new MarketViewModel(player);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass viwemodel to buyactivity
                startActivity(new Intent(MarketActivity.this, BuyActivity.class));
            }
        });

        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass viewmodel to sellactivity
                startActivity(new Intent(MarketActivity.this, SellActivity.class));
            }
        });








    }
}
