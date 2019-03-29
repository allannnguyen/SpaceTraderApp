package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Good;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.ConfigurationViewModel;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.MarketViewModel;

/**
 * Represents the screen where the player will buy goods.
 */
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
    private TextView cargo1, cargo2, cargo3, cargo4, cargo5, cargo6, cargo7, cargo8, cargo9, cargo10;
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
    private MarketViewModel viewModel = new MarketViewModel(ConfigurationViewModel.getInstance().getPlayer());
    private Button buyButton;

    /**
     * Creates the buy screen.
     * @param savedInstanceState The last known state of the buy screen
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        total = viewModel.getCargoSpace();

        cargo1 = findViewById(R.id.cargo1);
        cargo2 = findViewById(R.id.cargo2);
        cargo3 = findViewById(R.id.cargo3);
        cargo4 = findViewById(R.id.cargo4);
        cargo5 = findViewById(R.id.cargo5);
        cargo6 = findViewById(R.id.cargo6);
        cargo7 = findViewById(R.id.cargo7);
        cargo8 = findViewById(R.id.cargo8);
        cargo9 = findViewById(R.id.cargo9);
        cargo10 = findViewById(R.id.cargo10);

        String cargo1text = "Cargo: " + viewModel.getGoodQuantity(Good.WATER);
        String cargo2text = "Cargo: " + viewModel.getGoodQuantity(Good.FURS);
        String cargo3text = "Cargo: " + viewModel.getGoodQuantity(Good.FOOD);
        String cargo4text = "Cargo: " + viewModel.getGoodQuantity(Good.ORE);
        String cargo5text = "Cargo: " + viewModel.getGoodQuantity(Good.GAMES);
        String cargo6text = "Cargo: " + viewModel.getGoodQuantity(Good.FIREARMS);
        String cargo7text = "Cargo: " + viewModel.getGoodQuantity(Good.MEDICINE);
        String cargo8text = "Cargo: " + viewModel.getGoodQuantity(Good.MACHINES);
        String cargo9text = "Cargo: " + viewModel.getGoodQuantity(Good.NARCOTICS);
        String cargo10text = "Cargo: " + viewModel.getGoodQuantity(Good.ROBOTS);
        cargo1.setText(cargo1text);
        cargo2.setText(cargo2text);
        cargo3.setText(cargo3text);
        cargo4.setText(cargo4text);
        cargo5.setText(cargo5text);
        cargo6.setText(cargo6text);
        cargo7.setText(cargo7text);
        cargo8.setText(cargo8text);
        cargo9.setText(cargo9text);
        cargo10.setText(cargo10text);

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
        price1.setText(Integer.toString(viewModel.getGoodPrice(Good.WATER)));
        price2.setText(Integer.toString(viewModel.getGoodPrice(Good.FURS)));
        price3.setText(Integer.toString(viewModel.getGoodPrice(Good.FOOD)));
        price4.setText(Integer.toString(viewModel.getGoodPrice(Good.ORE)));
        price5.setText(Integer.toString(viewModel.getGoodPrice(Good.GAMES)));
        price6.setText(Integer.toString(viewModel.getGoodPrice(Good.FIREARMS)));
        price7.setText(Integer.toString(viewModel.getGoodPrice(Good.MEDICINE)));
        price8.setText(Integer.toString(viewModel.getGoodPrice(Good.MACHINES)));
        price9.setText(Integer.toString(viewModel.getGoodPrice(Good.NARCOTICS)));
        price10.setText(Integer.toString(viewModel.getGoodPrice(Good.ROBOTS)));

        if (!viewModel.isBuyable(Good.WATER)) {
            price1.setVisibility(View.INVISIBLE);
            quant1.setVisibility(View.INVISIBLE);
            upButton1.setVisibility(View.INVISIBLE);
            downButton1.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isBuyable(Good.FURS)) {
            price2.setVisibility(View.INVISIBLE);
            quant2.setVisibility(View.INVISIBLE);
            upButton2.setVisibility(View.INVISIBLE);
            downButton2.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isBuyable(Good.FOOD)) {
            price3.setVisibility(View.INVISIBLE);
            quant3.setVisibility(View.INVISIBLE);
            upButton3.setVisibility(View.INVISIBLE);
            downButton3.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isBuyable(Good.ORE)) {
            price4.setVisibility(View.INVISIBLE);
            quant4.setVisibility(View.INVISIBLE);
            upButton4.setVisibility(View.INVISIBLE);
            downButton4.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isBuyable(Good.GAMES)) {
            price5.setVisibility(View.INVISIBLE);
            quant5.setVisibility(View.INVISIBLE);
            upButton5.setVisibility(View.INVISIBLE);
            downButton5.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isBuyable(Good.FIREARMS)) {
            price6.setVisibility(View.INVISIBLE);
            quant6.setVisibility(View.INVISIBLE);
            upButton6.setVisibility(View.INVISIBLE);
            downButton6.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isBuyable(Good.MEDICINE)) {
            price7.setVisibility(View.INVISIBLE);
            quant7.setVisibility(View.INVISIBLE);
            upButton7.setVisibility(View.INVISIBLE);
            downButton7.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isBuyable(Good.MACHINES)) {
            price8.setVisibility(View.INVISIBLE);
            quant8.setVisibility(View.INVISIBLE);
            upButton8.setVisibility(View.INVISIBLE);
            downButton8.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isBuyable(Good.NARCOTICS)) {
            price9.setVisibility(View.INVISIBLE);
            quant9.setVisibility(View.INVISIBLE);
            upButton9.setVisibility(View.INVISIBLE);
            downButton9.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isBuyable(Good.ROBOTS)) {
            price10.setVisibility(View.INVISIBLE);
            quant10.setVisibility(View.INVISIBLE);
            upButton10.setVisibility(View.INVISIBLE);
            downButton10.setVisibility(View.INVISIBLE);
        }

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
                    oneCounter--;
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
                    twoCounter--;
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
                    threeCounter--;
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
                    fourCounter--;
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
                    fiveCounter--;
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
                    sixCounter--;
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
                    sevenCounter--;
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
                    eightCounter--;
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
                    nineCounter--;
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
                    tenCounter--;
                    quant10.setText(Integer.toString(tenCounter));
                    total++;
                }
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.buy(oneCounter, twoCounter, threeCounter, fourCounter, fiveCounter,
                        sixCounter, sevenCounter, eightCounter, nineCounter, tenCounter);
                //pass viewmodel to sellactivity
                Intent i = new Intent(BuyActivity.this, MarketActivity.class);
                //i.putExtra("viewmodel", viewModel);
                startActivity(i);
            }
        });
    }
}
