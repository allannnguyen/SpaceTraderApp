package edu.gatech.cs2340.vanillaice.spacetraderapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

import edu.gatech.cs2340.vanillaice.spacetraderapp.R;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Good;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.ConfigurationViewModel;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.MarketViewModel;

/**
 * Represents the sell screen.
 */
public class SellActivity extends AppCompatActivity {
    private int waterCounter;
    private int furCounter;
    private int foodCounter;
    private int oreCounter;
    private int gameCounter;
    private int firearmCounter;
    private int medicineCounter;
    private int machineCounter;
    private int narcoticCounter;
    private int robotCounter;
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
    private int amountOne;
    private int amountTwo;
    private int amountThree;
    private int amountFour;
    private int amountFive;
    private int amountSix;
    private int amountSeven;
    private int amountEight;
    private int amountNine;
    private int amountTen;
    private final ConfigurationViewModel cvm = ConfigurationViewModel.getInstance();
    private final MarketViewModel viewModel = new MarketViewModel(cvm.getPlayer());
    private HashMap<Good, Integer> goodstoSell;


    /**
     * Creates the sell screen.
     * @param savedInstanceState The last known state of teh sell screen.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        goodstoSell = new HashMap<>();

        TextView cargo1 = findViewById(R.id.cargo1);
        TextView cargo2 = findViewById(R.id.cargo2);
        TextView cargo3 = findViewById(R.id.cargo3);
        TextView cargo4 = findViewById(R.id.cargo4);
        TextView cargo5 = findViewById(R.id.cargo5);
        TextView cargo6 = findViewById(R.id.cargo6);
        TextView cargo7 = findViewById(R.id.cargo7);
        TextView cargo8 = findViewById(R.id.cargo8);
        TextView cargo9 = findViewById(R.id.cargo9);
        TextView cargo10 = findViewById(R.id.cargo10);

        String cargo1text = "Cargo: " + getGoodQuantity(Good.WATER);
        String cargo2text = "Cargo: " + getGoodQuantity(Good.FURS);
        String cargo3text = "Cargo: " + getGoodQuantity(Good.FOOD);
        String cargo4text = "Cargo: " + getGoodQuantity(Good.ORE);
        String cargo5text = "Cargo: " + getGoodQuantity(Good.GAMES);
        String cargo6text = "Cargo: " + getGoodQuantity(Good.FIREARMS);
        String cargo7text = "Cargo: " + getGoodQuantity(Good.MEDICINE);
        String cargo8text = "Cargo: " + getGoodQuantity(Good.MACHINES);
        String cargo9text = "Cargo: " + getGoodQuantity(Good.NARCOTICS);
        String cargo10text = "Cargo: " + getGoodQuantity(Good.ROBOTS);
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

        amountOne = getGoodQuantity(Good.WATER);
        amountTwo = getGoodQuantity(Good.FURS);
        amountThree = getGoodQuantity(Good.FOOD);
        amountFour = getGoodQuantity(Good.ORE);
        amountFive = getGoodQuantity(Good.GAMES);
        amountSix = getGoodQuantity(Good.FIREARMS);
        amountSeven = getGoodQuantity(Good.MEDICINE);
        amountEight = getGoodQuantity(Good.MACHINES);
        amountNine = getGoodQuantity(Good.NARCOTICS);
        amountTen = getGoodQuantity(Good.ROBOTS);

        Button sellButton = findViewById(R.id.sellButton2);

        Button upButton1 = findViewById(R.id.upButton1);
        Button downButton1 = findViewById(R.id.downButton1);
        Button upButton2 = findViewById(R.id.upButton2);
        Button downButton2 = findViewById(R.id.downButton2);
        Button upButton3 = findViewById(R.id.upButton3);
        Button downButton3 = findViewById(R.id.downButton3);
        Button upButton4 = findViewById(R.id.upButton4);
        Button downButton4 = findViewById(R.id.downButton4);
        Button upButton5 = findViewById(R.id.upButton5);
        Button downButton5 = findViewById(R.id.downButton5);
        Button upButton6 = findViewById(R.id.upButton6);
        Button downButton6 = findViewById(R.id.downButton6);
        Button upButton7 = findViewById(R.id.upButton7);
        Button downButton7 = findViewById(R.id.downButton7);
        Button upButton8 = findViewById(R.id.upButton8);
        Button downButton8 = findViewById(R.id.downButton8);
        Button upButton9 = findViewById(R.id.upButton9);
        Button downButton9 = findViewById(R.id.downButton9);
        Button upButton10 = findViewById(R.id.upButton10);
        Button downButton10 = findViewById(R.id.downButton10);
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
        TextView price1 = findViewById(R.id.price1);
        TextView price2 = findViewById(R.id.price2);
        TextView price3 = findViewById(R.id.price3);
        TextView price4 = findViewById(R.id.price4);
        TextView price5 = findViewById(R.id.price5);
        TextView price6 = findViewById(R.id.price6);
        TextView price7 = findViewById(R.id.price7);
        TextView price8 = findViewById(R.id.price8);
        TextView price9 = findViewById(R.id.price9);
        TextView price10 = findViewById(R.id.price10);
        price1.setText(Integer.toString(getGoodPrice(Good.WATER)));
        price2.setText(Integer.toString(getGoodPrice(Good.FURS)));
        price3.setText(Integer.toString(getGoodPrice(Good.FOOD)));
        price4.setText(Integer.toString(getGoodPrice(Good.ORE)));
        price5.setText(Integer.toString(getGoodPrice(Good.GAMES)));
        price6.setText(Integer.toString(getGoodPrice(Good.FIREARMS)));
        price7.setText(Integer.toString(getGoodPrice(Good.MEDICINE)));
        price8.setText(Integer.toString(getGoodPrice(Good.MACHINES)));
        price9.setText(Integer.toString(getGoodPrice(Good.NARCOTICS)));
        price10.setText(Integer.toString(getGoodPrice(Good.ROBOTS)));

        if (!isSellable(Good.WATER)) {
            price1.setVisibility(View.INVISIBLE);
            quant1.setVisibility(View.INVISIBLE);
            upButton1.setVisibility(View.INVISIBLE);
            downButton1.setVisibility(View.INVISIBLE);
        }

        if (!isSellable(Good.FURS)) {
            price2.setVisibility(View.INVISIBLE);
            quant2.setVisibility(View.INVISIBLE);
            upButton2.setVisibility(View.INVISIBLE);
            downButton2.setVisibility(View.INVISIBLE);
        }

        if (!isSellable(Good.FOOD)) {
            price3.setVisibility(View.INVISIBLE);
            quant3.setVisibility(View.INVISIBLE);
            upButton3.setVisibility(View.INVISIBLE);
            downButton3.setVisibility(View.INVISIBLE);
        }

        if (!isSellable(Good.ORE)) {
            price4.setVisibility(View.INVISIBLE);
            quant4.setVisibility(View.INVISIBLE);
            upButton4.setVisibility(View.INVISIBLE);
            downButton4.setVisibility(View.INVISIBLE);
        }

        if (!isSellable(Good.GAMES)) {
            price5.setVisibility(View.INVISIBLE);
            quant5.setVisibility(View.INVISIBLE);
            upButton5.setVisibility(View.INVISIBLE);
            downButton5.setVisibility(View.INVISIBLE);
        }

        if (!isSellable(Good.FIREARMS)) {
            price6.setVisibility(View.INVISIBLE);
            quant6.setVisibility(View.INVISIBLE);
            upButton6.setVisibility(View.INVISIBLE);
            downButton6.setVisibility(View.INVISIBLE);
        }

        if (!isSellable(Good.MEDICINE)) {
            price7.setVisibility(View.INVISIBLE);
            quant7.setVisibility(View.INVISIBLE);
            upButton7.setVisibility(View.INVISIBLE);
            downButton7.setVisibility(View.INVISIBLE);
        }

        if (!isSellable(Good.MACHINES)) {
            price8.setVisibility(View.INVISIBLE);
            quant8.setVisibility(View.INVISIBLE);
            upButton8.setVisibility(View.INVISIBLE);
            downButton8.setVisibility(View.INVISIBLE);
        }

        if (!isSellable(Good.NARCOTICS)) {
            price9.setVisibility(View.INVISIBLE);
            quant9.setVisibility(View.INVISIBLE);
            upButton9.setVisibility(View.INVISIBLE);
            downButton9.setVisibility(View.INVISIBLE);
        }

        if (!isSellable(Good.ROBOTS)) {
            price10.setVisibility(View.INVISIBLE);
            quant10.setVisibility(View.INVISIBLE);
            upButton10.setVisibility(View.INVISIBLE);
            downButton10.setVisibility(View.INVISIBLE);
        }

        upButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (waterCounter < amountOne) {
                    waterCounter++;
                    quant1.setText(Integer.toString(waterCounter));
                    goodstoSell.put(Good.WATER, waterCounter);
                }
            }
        });

        downButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (waterCounter > 0) {
                    waterCounter--;
                    quant1.setText(Integer.toString(waterCounter));
                    goodstoSell.put(Good.WATER, waterCounter);
                }
            }
        });

        upButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (furCounter < amountTwo) {
                    furCounter++;
                    quant2.setText(Integer.toString(furCounter));
                    goodstoSell.put(Good.FURS, furCounter);
                }
            }
        });

        downButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (furCounter > 0) {
                    furCounter--;
                    quant2.setText(Integer.toString(furCounter));
                    goodstoSell.put(Good.FURS, furCounter);
                }
            }
        });

        upButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foodCounter < amountThree) {
                    foodCounter++;
                    quant3.setText(Integer.toString(foodCounter));
                    goodstoSell.put(Good.FOOD, foodCounter);
                }
            }
        });

        downButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foodCounter > 0) {
                    foodCounter--;
                    quant3.setText(Integer.toString(foodCounter));
                    goodstoSell.put(Good.FOOD, foodCounter);
                }
            }
        });

        upButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oreCounter < amountFour) {
                    oreCounter++;
                    quant4.setText(Integer.toString(oreCounter));
                    goodstoSell.put(Good.ORE, oreCounter);
                }
            }
        });

        downButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oreCounter > 0) {
                    oreCounter--;
                    quant4.setText(Integer.toString(oreCounter));
                    goodstoSell.put(Good.ORE, oreCounter);
                }
            }
        });

        upButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameCounter < amountFive) {
                    gameCounter++;
                    quant5.setText(Integer.toString(gameCounter));
                    goodstoSell.put(Good.GAMES, gameCounter);
                }
            }
        });

        downButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameCounter > 0) {
                    gameCounter--;
                    quant5.setText(Integer.toString(gameCounter));
                    goodstoSell.put(Good.FURS, furCounter);
                }
            }
        });

        upButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firearmCounter < amountSix) {
                    firearmCounter++;
                    quant6.setText(Integer.toString(firearmCounter));
                    goodstoSell.put(Good.FIREARMS, firearmCounter);
                }
            }
        });

        downButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firearmCounter > 0) {
                    firearmCounter--;
                    quant6.setText(Integer.toString(firearmCounter));
                    goodstoSell.put(Good.FIREARMS, firearmCounter);
                }
            }
        });

        upButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (medicineCounter < amountSeven) {
                    medicineCounter++;
                    quant7.setText(Integer.toString(medicineCounter));
                    goodstoSell.put(Good.MEDICINE, medicineCounter);
                }
            }
        });

        downButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (medicineCounter > 0) {
                    medicineCounter--;
                    quant7.setText(Integer.toString(medicineCounter));
                    goodstoSell.put(Good.MEDICINE, medicineCounter);
                }
            }
        });

        upButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (machineCounter < amountEight) {
                    machineCounter++;
                    quant8.setText(Integer.toString(machineCounter));
                    goodstoSell.put(Good.MACHINES, machineCounter);
                }
            }
        });

        downButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (machineCounter > 0) {
                    machineCounter--;
                    quant8.setText(Integer.toString(machineCounter));
                    goodstoSell.put(Good.MACHINES, machineCounter);
                }
            }
        });

        upButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (narcoticCounter < amountNine) {
                    narcoticCounter++;
                    quant9.setText(Integer.toString(narcoticCounter));
                    goodstoSell.put(Good.NARCOTICS, narcoticCounter);
                }
            }
        });

        downButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (narcoticCounter > 0) {
                    narcoticCounter--;
                    quant9.setText(Integer.toString(narcoticCounter));
                    goodstoSell.put(Good.NARCOTICS, narcoticCounter);
                }
            }
        });

        upButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (robotCounter < amountTen) {
                    robotCounter++;
                    quant10.setText(Integer.toString(robotCounter));
                    goodstoSell.put(Good.ROBOTS, robotCounter);
                }
            }
        });

        downButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (robotCounter > 0) {
                    robotCounter--;
                    quant10.setText(Integer.toString(robotCounter));
                    goodstoSell.put(Good.ROBOTS, robotCounter);
                }
            }
        });

        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.sell(goodstoSell);
                //pass viewmodel to sellactivity
                Intent i = new Intent(SellActivity.this, MarketActivity.class);
                //i.putExtra("viewmodel", viewModel);
                startActivity(i);
            }
        });
    }

    /**
     * Gets good quantity
     * @param good type of good
     * @return quantity of good
     */
    public int getGoodQuantity(Good good) {
        return viewModel.getGoodQuantity(good);
    }

    /**
     * Gets good price
     * @param good type of good
     * @return price of good
     */
    public int getGoodPrice(Good good) {
        return viewModel.getGoodPrice(good);
    }

    /**
     * Gets if good is sellable
     * @param good type of good
     * @return boolean if good is sellable
     */
    public boolean isSellable(Good good) {
        return viewModel.isSellable(good);
    }
}
