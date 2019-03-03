package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    private TextView quant1;
    private TextView quant2;
    private TextView quant3;
    private TextView quant4;
    private TextView quant5;
    private TextView quant6;
    private TextView quant7;
    private TextView quant8;
    private TextView quant9;
    private TextView quant10;
    private TextView price1;
    private TextView price2;
    private TextView price3;
    private TextView price4;
    private TextView price5;
    private TextView price6;
    private TextView price7;
    private TextView price8;
    private TextView price9;
    private TextView price10;
    private int total = 0;

    private Button buyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        total = 0; //THIS NEEDS TO BE THE TOTAL NUMBER OF CARGO SPACE AVAILABLE I.E. getIntent().getCargoSpace() or something

        buyButton = findViewById(R.id.buyButton2);

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
        quant1 = findViewById(R.id.quant1);
        quant2 = findViewById(R.id.quant2);
        quant3 = findViewById(R.id.quant3);
        quant4 = findViewById(R.id.quant4);
        quant5 = findViewById(R.id.quant5);
        quant6 = findViewById(R.id.quant6);
        quant7 = findViewById(R.id.quant7);
        quant8 = findViewById(R.id.quant8);
        quant9 = findViewById(R.id.quant9);
        quant10 = findViewById(R.id.quant10);
        price1 = findViewById(R.id.price1);
        price2 = findViewById(R.id.price2);
        price3 = findViewById(R.id.price3);
        price4 = findViewById(R.id.price4);
        price5 = findViewById(R.id.price5);
        price6 = findViewById(R.id.price6);
        price7 = findViewById(R.id.price7);
        price8 = findViewById(R.id.price8);
        price9 = findViewById(R.id.price9);
        price10 = findViewById(R.id.price10);
        price1.setText(Integer.toString(30)); //CHANGE TO marketvm.getGoodPrice(Good.WATER); or something similar
        price2.setText(Integer.toString(250)); //CHANGE TO marketvm.getGoodPrice(Good.FURS); or something similar
        price3.setText(Integer.toString(100)); //CHANGE TO marketvm.getGoodPrice(Good.FOOD); or something similar
        price4.setText(Integer.toString(350)); //CHANGE TO marketvm.getGoodPrice(Good.ORE); or something similar
        price5.setText(Integer.toString(250)); //CHANGE TO marketvm.getGoodPrice(Good.GAMES); or something similar
        price6.setText(Integer.toString(1250)); //CHANGE TO marketvm.getGoodPrice(Good.FIREARMS); or something similar
        price7.setText(Integer.toString(650)); //CHANGE TO marketvm.getGoodPrice(Good.MEDICINE); or something similar
        price8.setText(Integer.toString(900)); //CHANGE TO marketvm.getGoodPrice(Good.MACHINES); or something similar
        price9.setText(Integer.toString(3500)); //CHANGE TO marketvm.getGoodPrice(Good.NARCOTICS); or something similar
        price10.setText(Integer.toString(5000)); //CHANGE TO marketvm.getGoodPrice(Good.ROBOTS); or something similar

        upButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    oneCounter++;
                    quant1.setText(Integer.toString(oneCounter));
                    total--;
                    //remainingCargo.setText("Remaining Cargo: " + Integer.toString(total));
                }
            }
        });

        downButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneCounter > 0) {
                    oneCounter++;
                    quant1.setText(Integer.toString(oneCounter));
                    total++;
                    //remainingCargo.setText("Remaining Cargo: " + Integer.toString(total));
                }
            }
        });

        upButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    twoCounter++;
                    quant2.setText(Integer.toString(twoCounter));
                    total--;
                }
            }
        });

        downButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (twoCounter > 0) {
                    twoCounter++;
                    quant2.setText(Integer.toString(twoCounter));
                    total++;
                }
            }
        });

        upButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    threeCounter++;
                    quant3.setText(Integer.toString(threeCounter));
                    total--;
                }
            }
        });

        downButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (threeCounter > 0) {
                    threeCounter++;
                    quant3.setText(Integer.toString(threeCounter));
                    total++;
                }
            }
        });

        upButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    fourCounter++;
                    quant4.setText(Integer.toString(fourCounter));
                    total--;
                }
            }
        });

        downButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourCounter > 0) {
                    fourCounter++;
                    quant4.setText(Integer.toString(fourCounter));
                    total++;
                }
            }
        });

        upButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    fiveCounter++;
                    quant5.setText(Integer.toString(fiveCounter));
                    total--;
                }
            }
        });

        downButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fiveCounter > 0) {
                    fiveCounter++;
                    quant5.setText(Integer.toString(fiveCounter));
                    total++;
                }
            }
        });

        upButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    sixCounter++;
                    quant6.setText(Integer.toString(sixCounter));
                    total--;
                }
            }
        });

        downButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixCounter > 0) {
                    sixCounter++;
                    quant6.setText(Integer.toString(sixCounter));
                    total++;
                }
            }
        });

        upButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    sevenCounter++;
                    quant7.setText(Integer.toString(sevenCounter));
                    total--;
                }
            }
        });

        downButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sevenCounter > 0) {
                    sevenCounter++;
                    quant7.setText(Integer.toString(sevenCounter));
                    total++;
                }
            }
        });

        upButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    eightCounter++;
                    quant8.setText(Integer.toString(eightCounter));
                    total--;
                }
            }
        });

        downButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eightCounter > 0) {
                    eightCounter++;
                    quant8.setText(Integer.toString(eightCounter));
                    total++;
                }
            }
        });

        upButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    nineCounter++;
                    quant9.setText(Integer.toString(nineCounter));
                    total--;
                }
            }
        });

        downButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nineCounter > 0) {
                    nineCounter++;
                    quant9.setText(Integer.toString(nineCounter));
                    total++;
                }
            }
        });

        upButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    tenCounter++;
                    quant10.setText(Integer.toString(tenCounter));
                    total--;
                }
            }
        });

        downButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tenCounter > 0) {
                    tenCounter++;
                    quant10.setText(Integer.toString(tenCounter));
                    total++;
                }
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass viewmodel to sellactivity
                Intent i = new Intent(BuyActivity.this, MarketActivity.class);
                //i.putExtra("viewmodel", viewModel);
                startActivity(i);
            }
        });
    }
}
