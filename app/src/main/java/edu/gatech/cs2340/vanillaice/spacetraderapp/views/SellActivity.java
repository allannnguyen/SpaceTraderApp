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

public class SellActivity extends AppCompatActivity {

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
    private int amountOne = 0;
    private int amountTwo = 0;
    private int amountThree = 0;
    private int amountFour = 0;
    private int amountFive = 0;
    private int amountSix = 0;
    private int amountSeven = 0;
    private int amountEight = 0;
    private int amountNine = 0;
    private int amountTen = 0;
    private MarketViewModel viewModel = new MarketViewModel(ConfigurationViewModel.getInstance().getPlayer());
    private Button sellButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);
        amountOne = viewModel.getGoodQuantity(Good.WATER);
        amountTwo = viewModel.getGoodQuantity(Good.FURS);
        amountThree = viewModel.getGoodQuantity(Good.FOOD);
        amountFour = viewModel.getGoodQuantity(Good.ORE);
        amountFive = viewModel.getGoodQuantity(Good.GAMES);
        amountSix = viewModel.getGoodQuantity(Good.FIREARMS);
        amountSeven = viewModel.getGoodQuantity(Good.MEDICINE);
        amountEight = viewModel.getGoodQuantity(Good.MACHINES);
        amountNine = viewModel.getGoodQuantity(Good.NARCOTICS);
        amountTen = viewModel.getGoodQuantity(Good.ROBOTS);

        sellButton = findViewById(R.id.sellButton2);

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

        if (!viewModel.isSellable(Good.WATER)) {
            price1.setVisibility(View.INVISIBLE);
            quant1.setVisibility(View.INVISIBLE);
            upButton1.setVisibility(View.INVISIBLE);
            downButton1.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isSellable(Good.FURS)) {
            price2.setVisibility(View.INVISIBLE);
            quant2.setVisibility(View.INVISIBLE);
            upButton2.setVisibility(View.INVISIBLE);
            downButton2.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isSellable(Good.FOOD)) {
            price3.setVisibility(View.INVISIBLE);
            quant3.setVisibility(View.INVISIBLE);
            upButton3.setVisibility(View.INVISIBLE);
            downButton3.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isSellable(Good.ORE)) {
            price4.setVisibility(View.INVISIBLE);
            quant4.setVisibility(View.INVISIBLE);
            upButton4.setVisibility(View.INVISIBLE);
            downButton4.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isSellable(Good.GAMES)) {
            price5.setVisibility(View.INVISIBLE);
            quant5.setVisibility(View.INVISIBLE);
            upButton5.setVisibility(View.INVISIBLE);
            downButton5.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isSellable(Good.FIREARMS)) {
            price6.setVisibility(View.INVISIBLE);
            quant6.setVisibility(View.INVISIBLE);
            upButton6.setVisibility(View.INVISIBLE);
            downButton6.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isSellable(Good.MEDICINE)) {
            price7.setVisibility(View.INVISIBLE);
            quant7.setVisibility(View.INVISIBLE);
            upButton7.setVisibility(View.INVISIBLE);
            downButton7.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isSellable(Good.MACHINES)) {
            price8.setVisibility(View.INVISIBLE);
            quant8.setVisibility(View.INVISIBLE);
            upButton8.setVisibility(View.INVISIBLE);
            downButton8.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isSellable(Good.NARCOTICS)) {
            price9.setVisibility(View.INVISIBLE);
            quant9.setVisibility(View.INVISIBLE);
            upButton9.setVisibility(View.INVISIBLE);
            downButton9.setVisibility(View.INVISIBLE);
        }

        if (!viewModel.isSellable(Good.ROBOTS)) {
            price10.setVisibility(View.INVISIBLE);
            quant10.setVisibility(View.INVISIBLE);
            upButton10.setVisibility(View.INVISIBLE);
            downButton10.setVisibility(View.INVISIBLE);
        }

        upButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneCounter < amountOne) {
                    oneCounter++;
                    quant1.setText(Integer.toString(oneCounter));
                }
            }
        });

        downButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneCounter > 0) {
                    oneCounter--;
                    quant1.setText(Integer.toString(oneCounter));
                }
            }
        });

        upButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (twoCounter < amountTwo) {
                    twoCounter++;
                    quant2.setText(Integer.toString(twoCounter));
                }
            }
        });

        downButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (twoCounter > 0) {
                    twoCounter--;
                    quant2.setText(Integer.toString(twoCounter));
                }
            }
        });

        upButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (threeCounter < amountThree) {
                    threeCounter++;
                    quant3.setText(Integer.toString(threeCounter));
                }
            }
        });

        downButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (threeCounter > 0) {
                    threeCounter--;
                    quant3.setText(Integer.toString(threeCounter));
                }
            }
        });

        upButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourCounter < amountFour) {
                    fourCounter++;
                    quant4.setText(Integer.toString(fourCounter));
                }
            }
        });

        downButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourCounter > 0) {
                    fourCounter--;
                    quant4.setText(Integer.toString(fourCounter));
                }
            }
        });

        upButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fiveCounter < amountFive) {
                    fiveCounter++;
                    quant5.setText(Integer.toString(fiveCounter));
                }
            }
        });

        downButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fiveCounter > 0) {
                    fiveCounter--;
                    quant5.setText(Integer.toString(fiveCounter));
                }
            }
        });

        upButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixCounter < amountSix) {
                    sixCounter++;
                    quant6.setText(Integer.toString(sixCounter));
                }
            }
        });

        downButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixCounter > 0) {
                    sixCounter--;
                    quant6.setText(Integer.toString(sixCounter));
                }
            }
        });

        upButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sevenCounter < amountSeven) {
                    sevenCounter++;
                    quant7.setText(Integer.toString(sevenCounter));
                }
            }
        });

        downButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sevenCounter > 0) {
                    sevenCounter--;
                    quant7.setText(Integer.toString(sevenCounter));
                }
            }
        });

        upButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eightCounter < amountEight) {
                    eightCounter++;
                    quant8.setText(Integer.toString(eightCounter));
                }
            }
        });

        downButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eightCounter > 0) {
                    eightCounter--;
                    quant8.setText(Integer.toString(eightCounter));
                }
            }
        });

        upButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nineCounter < amountNine) {
                    nineCounter++;
                    quant9.setText(Integer.toString(nineCounter));
                }
            }
        });

        downButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nineCounter > 0) {
                    nineCounter--;
                    quant9.setText(Integer.toString(nineCounter));
                }
            }
        });

        upButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tenCounter < amountTen) {
                    tenCounter++;
                    quant10.setText(Integer.toString(tenCounter));
                }
            }
        });

        downButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tenCounter > 0) {
                    tenCounter--;
                    quant10.setText(Integer.toString(tenCounter));
                }
            }
        });

        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.sell(oneCounter, twoCounter, threeCounter, fourCounter, fiveCounter,
                        sixCounter, sevenCounter, eightCounter, nineCounter, tenCounter);
                //pass viewmodel to sellactivity
                Intent i = new Intent(SellActivity.this, MarketActivity.class);
                //i.putExtra("viewmodel", viewModel);
                startActivity(i);
            }
        });
    }
}
