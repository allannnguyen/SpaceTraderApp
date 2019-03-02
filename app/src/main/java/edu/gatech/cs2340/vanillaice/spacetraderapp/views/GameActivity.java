package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;

public class GameActivity extends AppCompatActivity {
    private Button travelButton;
    private Button tradeButton;
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent i = getIntent();
        player = (Player)i.getSerializableExtra("player");

        travelButton = findViewById(R.id.travelButton);
        tradeButton = findViewById(R.id.tradeButton);

        travelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameActivity.this, EncounterActivity.class));
            }
        });

        tradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass player onto marketActivity
                Intent i = new Intent(GameActivity.this, MarketActivity.class);
                i.putExtra("player", player);
                startActivity(i);
            }
        });

    }
}
