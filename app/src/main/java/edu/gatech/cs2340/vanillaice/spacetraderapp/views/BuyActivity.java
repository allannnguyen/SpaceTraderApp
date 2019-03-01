package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;

public class BuyActivity extends AppCompatActivity {

    private Button upButton1;
    private Button downButton1;
    private Button upButton2;
    private Button downButton2;
    private Button upButton3;
    private Button downButton3;
    private Button upButton4;
    private Button downButton4;
    private Button upButton5;
    private Button downButton5;
    private Button upButton6;
    private Button downButton6;
    private Button upButton7;
    private Button downButton7;
    private Button upButton8;
    private Button downButton8;
    private Button upButton9;
    private Button downButton9;
    private Button upButton10;
    private Button downButton10;
    private int oneCounter = 0;
    private int twoCounter = 0;
    private int threeCounter = 0;
    private int fourCounter = 0;
    private int fiveCounter = 0;
    private int sixCounter = 0;
    private int sevenCounter = 0;
    private int eightCounter = 0;
    private int nineCounter = 0;
    private int tenCounter = 0;
    int total = 0; //THIS NEEDS TO BE something.GETCARGOSPACE()
    private int sumCounter = oneCounter + twoCounter + threeCounter + fourCounter + fiveCounter + sixCounter + sevenCounter + eightCounter + nineCounter + tenCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        upButton1 = findViewById(R.id.upButton1);
        downButton1 = findViewById(R.id.downButton1);
        upButton2 = findViewById(R.id.upButton2);
        downButton2 = findViewById(R.id.downButton2);
        upButton3 = findViewById(R.id.upButton3);
        downButton3 = findViewById(R.id.downButton3);
        upButton4 = findViewById(R.id.upButton4);
        downButton4 = findViewById(R.id.downButton4);
        upButton5 = findViewById(R.id.upButton5);
        downButton5 = findViewById(R.id.downButton5);
        upButton6 = findViewById(R.id.upButton6);
        downButton6 = findViewById(R.id.downButton6);
        upButton7 = findViewById(R.id.upButton7);
        downButton7 = findViewById(R.id.downButton7);
        upButton8 = findViewById(R.id.upButton8);
        downButton8 = findViewById(R.id.downButton8);
        upButton9 = findViewById(R.id.upButton9);
        downButton9 = findViewById(R.id.downButton9);
        upButton10 = findViewById(R.id.upButton10);
        downButton10 = findViewById(R.id.downButton10);
    }
}
