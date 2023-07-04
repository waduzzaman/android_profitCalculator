package com.waduzzaman.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edBuy, edSell;
    Button buttonCalculate;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        edBuy=findViewById(R.id.edBuy);
        edSell=findViewById(R.id.edSell);
        tvDisplay=findViewById(R.id.tvDisplay);
        buttonCalculate=findViewById((R.id.buttonCalculate));

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                int byPrice, sellPrice, profit;
//                //get the user input data using getText() method and store that in a string
//                String buy=edBuy.getText().toString();
//                /*
//                how to convert string to int
//                String myString="50";
//                int count =Integer.parseInt(myString); // it will show the 50 as a number
//                // to convert in float:
//                float myFloat=Float.parseFloat(myString);
//                * */
//                // convert string value to integer value
//                byPrice=Integer.parseInt(buy);
//                String sell=edSell.getText().toString();
//                sellPrice=Integer.parseInt(sell);
//                profit=sellPrice-byPrice;
//                // Display the result in the Text View
//                tvDisplay.setText("Your Profit is: "+profit +"টাকা\n");

                float buyPrice, sellPrice, profit, profitPercent;
                //get the user input data using getText() method and store that in a string
                String buy=edBuy.getText().toString();
                /*
                how to convert string to int
                String myString="50";
                int count =Integer.parseInt(myString); // it will show the 50 as a number
                // to convert in float:
                float myFloat=Float.parseFloat(myString);
                * */
                // convert string value to integer value
                buyPrice=Float.parseFloat(buy);
                String sell=edSell.getText().toString();
                sellPrice=Float.parseFloat(sell);
                profit=sellPrice-buyPrice;

                profitPercent=profit/buyPrice*100;
                // Display the result in the Text View
                tvDisplay.setText("Your Profit is: "+   String.format("%.2f", profit)+" টাকা\nProfit percent is "+ String.format("%.2f", profitPercent)+"%");





            }
        });







    }






}