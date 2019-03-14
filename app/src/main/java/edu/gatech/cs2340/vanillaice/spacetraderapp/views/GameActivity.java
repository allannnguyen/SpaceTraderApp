package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.ConfigurationViewModel;

public class GameActivity extends AppCompatActivity {
    private Button travelButton;
    private Button tradeButton;
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //Intent i = getIntent();
        //player = (Player)i.getSerializableExtra("player");

        travelButton = findViewById(R.id.travelButton);
        tradeButton = findViewById(R.id.tradeButton);

        travelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameActivity.this, TravelActivity.class));
            }
        });

        tradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass player onto marketActivity
                Intent i = new Intent(GameActivity.this, MarketActivity.class);
                //i.putExtra("player", player);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        ConfigurationViewModel cvm = ConfigurationViewModel.getInstance();
        File file;
        if (item.getItemId() == R.id.save_game) {
            file = new File(this.getFilesDir(), ConfigurationViewModel.DEFAULT_BINARY_FILE_NAME);
            Log.d("MY APP", "Saving");
            return cvm.saveBinary(file);
        }
        else {
            //create a file object in the local files section
            file = new File(this.getFilesDir(), ConfigurationViewModel.DEFAULT_BINARY_FILE_NAME);
            Log.d("MY APP", "Loading Binary Data");
            cvm.loadBinary(file);
            return true;
        }

    }
}
