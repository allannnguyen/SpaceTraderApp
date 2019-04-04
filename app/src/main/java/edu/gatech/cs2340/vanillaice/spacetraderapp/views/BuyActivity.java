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
 * Represents the screen where the player will buy goods.
 */
public class BuyActivity extends AppCompatActivity {

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
    private TextView quantWater;
    private TextView quantFur;
    private TextView quantFood;
    private TextView quantOre;
    private TextView quantGame;
    private TextView quantFirearm;
    private TextView quantMedicine;
    private TextView quantMachine;
    private TextView quantNarcotic;
    private TextView quantRobot;
    private int total;
    private final ConfigurationViewModel cvm = ConfigurationViewModel.getInstance();
    private final MarketViewModel viewModel = new MarketViewModel(cvm.getPlayer());
    private HashMap<Good, Integer> goodsinCart;

    /**
     * Creates the buy screen.
     * @param savedInstanceState The last known state of the buy screen
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        total = viewModel.getCargoSpace();
        goodsinCart = new HashMap<>();
        TextView cargoWater = findViewById(R.id.cargo1);
        TextView cargoFur = findViewById(R.id.cargo2);
        TextView cargoFood = findViewById(R.id.cargo3);
        TextView cargoOre = findViewById(R.id.cargo4);
        TextView cargoGame = findViewById(R.id.cargo5);
        TextView cargoFirearm = findViewById(R.id.cargo6);
        TextView cargoMedicine = findViewById(R.id.cargo7);
        TextView cargoMachine = findViewById(R.id.cargo8);
        TextView cargoNarcotic = findViewById(R.id.cargo9);
        TextView cargoRobot = findViewById(R.id.cargo10);

        String cargoWatertext = "Cargo: " + getGoodQuantity(Good.WATER);
        String cargoFurtext = "Cargo: " + getGoodQuantity(Good.FURS);
        String cargoFoodtext = "Cargo: " + getGoodQuantity(Good.FOOD);
        String cargoOretext = "Cargo: " + getGoodQuantity(Good.ORE);
        String cargoGametext = "Cargo: " + getGoodQuantity(Good.GAMES);
        String cargoFirearmtext = "Cargo: " + getGoodQuantity(Good.FIREARMS);
        String cargoMedicinetext = "Cargo: " + getGoodQuantity(Good.MEDICINE);
        String cargoMachinetext = "Cargo: " + getGoodQuantity(Good.MACHINES);
        String cargoNarcotictext = "Cargo: " + getGoodQuantity(Good.NARCOTICS);
        String cargoRobottext = "Cargo: " + getGoodQuantity(Good.ROBOTS);
        cargoWater.setText(cargoWatertext);
        cargoFur.setText(cargoFurtext);
        cargoFood.setText(cargoFoodtext);
        cargoOre.setText(cargoOretext);
        cargoGame.setText(cargoGametext);
        cargoFirearm.setText(cargoFirearmtext);
        cargoMedicine.setText(cargoMedicinetext);
        cargoMachine.setText(cargoMachinetext);
        cargoNarcotic.setText(cargoNarcotictext);
        cargoRobot.setText(cargoRobottext);

        Button buyButton = findViewById(R.id.buyButton2);

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
        quantWater = findViewById(R.id.quant1);
        quantFur = findViewById(R.id.quant2);
        quantFood = findViewById(R.id.quant3);
        quantOre = findViewById(R.id.quant4);
        quantGame = findViewById(R.id.quant5);
        quantFirearm = findViewById(R.id.quant6);
        quantMedicine = findViewById(R.id.quant7);
        quantMachine = findViewById(R.id.quant8);
        quantNarcotic = findViewById(R.id.quant9);
        quantRobot = findViewById(R.id.quant10);
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
        price1.setText(getGoodPrice(Good.WATER));
        price2.setText(getGoodPrice(Good.FURS));
        price3.setText(getGoodPrice(Good.FOOD));
        price4.setText(getGoodPrice(Good.ORE));
        price5.setText(getGoodPrice(Good.GAMES));
        price6.setText(getGoodPrice(Good.FIREARMS));
        price7.setText(getGoodPrice(Good.MEDICINE));
        price8.setText(getGoodPrice(Good.MACHINES));
        price9.setText(getGoodPrice(Good.NARCOTICS));
        price10.setText(getGoodPrice(Good.ROBOTS));

        /*if (isBuyable(Good.WATER)) {
            price1.setVisibility(View.INVISIBLE);
            quantWater.setVisibility(View.INVISIBLE);
            upButton1.setVisibility(View.INVISIBLE);
            downButton1.setVisibility(View.INVISIBLE);
        }

        if (isBuyable(Good.FURS)) {
            price2.setVisibility(View.INVISIBLE);
            quantFur.setVisibility(View.INVISIBLE);
            upButton2.setVisibility(View.INVISIBLE);
            downButton2.setVisibility(View.INVISIBLE);
        }*/

        if (isBuyable(Good.FOOD)) {
            price3.setVisibility(View.INVISIBLE);
            quantFood.setVisibility(View.INVISIBLE);
            upButton3.setVisibility(View.INVISIBLE);
            downButton3.setVisibility(View.INVISIBLE);
        }

        if (isBuyable(Good.ORE)) {
            price4.setVisibility(View.INVISIBLE);
            quantOre.setVisibility(View.INVISIBLE);
            upButton4.setVisibility(View.INVISIBLE);
            downButton4.setVisibility(View.INVISIBLE);
        }

        if (isBuyable(Good.GAMES)) {
            price5.setVisibility(View.INVISIBLE);
            quantGame.setVisibility(View.INVISIBLE);
            upButton5.setVisibility(View.INVISIBLE);
            downButton5.setVisibility(View.INVISIBLE);
        }

        if (isBuyable(Good.FIREARMS)) {
            price6.setVisibility(View.INVISIBLE);
            quantFirearm.setVisibility(View.INVISIBLE);
            upButton6.setVisibility(View.INVISIBLE);
            downButton6.setVisibility(View.INVISIBLE);
        }

        if (isBuyable(Good.MEDICINE)) {
            price7.setVisibility(View.INVISIBLE);
            quantMedicine.setVisibility(View.INVISIBLE);
            upButton7.setVisibility(View.INVISIBLE);
            downButton7.setVisibility(View.INVISIBLE);
        }

        if (isBuyable(Good.MACHINES)) {
            price8.setVisibility(View.INVISIBLE);
            quantMachine.setVisibility(View.INVISIBLE);
            upButton8.setVisibility(View.INVISIBLE);
            downButton8.setVisibility(View.INVISIBLE);
        }

        if (isBuyable(Good.NARCOTICS)) {
            price9.setVisibility(View.INVISIBLE);
            quantNarcotic.setVisibility(View.INVISIBLE);
            upButton9.setVisibility(View.INVISIBLE);
            downButton9.setVisibility(View.INVISIBLE);
        }

        if (isBuyable(Good.ROBOTS)) {
            price10.setVisibility(View.INVISIBLE);
            quantRobot.setVisibility(View.INVISIBLE);
            upButton10.setVisibility(View.INVISIBLE);
            downButton10.setVisibility(View.INVISIBLE);
        }

        upButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    waterCounter++;
                    quantWater.setText(Integer.toString(waterCounter));
                    total--;
                    goodsinCart.put(Good.WATER, waterCounter);
                    //remainingCargo.setText("Remaining Cargo: " + Integer.toString(total));
                }
            }
        });

        downButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (waterCounter > 0) {
                    waterCounter--;
                    quantWater.setText(Integer.toString(waterCounter));
                    total++;
                    goodsinCart.put(Good.WATER, waterCounter);
                    //remainingCargo.setText("Remaining Cargo: " + Integer.toString(total));
                }
            }
        });

        upButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    furCounter++;
                    quantFur.setText(Integer.toString(furCounter));
                    total--;
                    goodsinCart.put(Good.FURS, furCounter);
                }
            }
        });

        downButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (furCounter > 0) {
                    furCounter--;
                    quantFur.setText(Integer.toString(furCounter));
                    total++;
                    goodsinCart.put(Good.FURS, furCounter);
                }
            }
        });

        upButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    foodCounter++;
                    quantFood.setText(Integer.toString(foodCounter));
                    total--;
                    goodsinCart.put(Good.FOOD, foodCounter);
                }
            }
        });

        downButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foodCounter > 0) {
                    foodCounter--;
                    quantFood.setText(Integer.toString(foodCounter));
                    total++;
                    goodsinCart.put(Good.FOOD, foodCounter);
                }
            }
        });

        upButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    oreCounter++;
                    quantOre.setText(Integer.toString(oreCounter));
                    total--;
                    goodsinCart.put(Good.ORE, oreCounter);
                }
            }
        });

        downButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oreCounter > 0) {
                    oreCounter--;
                    quantOre.setText(Integer.toString(oreCounter));
                    total++;
                    goodsinCart.put(Good.ORE, oreCounter);
                }
            }
        });

        upButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    gameCounter++;
                    quantGame.setText(Integer.toString(gameCounter));
                    total--;
                    goodsinCart.put(Good.GAMES, gameCounter);
                }
            }
        });

        downButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameCounter > 0) {
                    gameCounter--;
                    quantGame.setText(Integer.toString(gameCounter));
                    total++;
                    goodsinCart.put(Good.GAMES, gameCounter);
                }
            }
        });

        upButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    firearmCounter++;
                    quantFirearm.setText(Integer.toString(firearmCounter));
                    total--;
                    goodsinCart.put(Good.FIREARMS, firearmCounter);
                }
            }
        });

        downButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firearmCounter > 0) {
                    firearmCounter--;
                    quantFirearm.setText(Integer.toString(firearmCounter));
                    total++;
                    goodsinCart.put(Good.FIREARMS, firearmCounter);
                }
            }
        });

        upButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    medicineCounter++;
                    quantMedicine.setText(Integer.toString(medicineCounter));
                    total--;
                    goodsinCart.put(Good.MEDICINE, medicineCounter);
                }
            }
        });

        downButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (medicineCounter > 0) {
                    medicineCounter--;
                    quantMedicine.setText(Integer.toString(medicineCounter));
                    total++;
                    goodsinCart.put(Good.MEDICINE, medicineCounter);
                }
            }
        });

        upButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    machineCounter++;
                    quantMachine.setText(Integer.toString(machineCounter));
                    total--;
                    goodsinCart.put(Good.MACHINES, machineCounter);
                }
            }
        });

        downButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (machineCounter > 0) {
                    machineCounter--;
                    quantMachine.setText(Integer.toString(machineCounter));
                    total++;
                    goodsinCart.put(Good.MACHINES, machineCounter);
                }
            }
        });

        upButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    narcoticCounter++;
                    quantNarcotic.setText(Integer.toString(narcoticCounter));
                    total--;
                    goodsinCart.put(Good.NARCOTICS, narcoticCounter);
                }
            }
        });

        downButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (narcoticCounter > 0) {
                    narcoticCounter--;
                    quantNarcotic.setText(Integer.toString(narcoticCounter));
                    total++;
                    goodsinCart.put(Good.NARCOTICS, narcoticCounter);
                }
            }
        });

        upButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (total > 0) {
                    robotCounter++;
                    quantRobot.setText(Integer.toString(robotCounter));
                    total--;
                    goodsinCart.put(Good.ROBOTS, robotCounter);
                }
            }
        });

        downButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (robotCounter > 0) {
                    robotCounter--;
                    quantRobot.setText(Integer.toString(robotCounter));
                    total++;
                    goodsinCart.put(Good.ROBOTS, robotCounter);
                }
            }
        });

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewModel.buy(goodsinCart);
                //pass viewmodel to sellactivity
                Intent i = new Intent(BuyActivity.this, MarketActivity.class);
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
    private String getGoodQuantity(Good good) {
        return Integer.toString(viewModel.getGoodQuantity(good));
    }

    /**
     * Gets good price
     * @param good type of good
     * @return price of good
     */
    private String getGoodPrice(Good good) {
        return Integer.toString(viewModel.getGoodPrice(good));
    }

    /**
     * Gets if good is buyable
     * @param good type of good
     * @return boolean if good is buyable
     */
    private boolean isBuyable(Good good) {
        return !viewModel.isBuyable(good);
    }
}
