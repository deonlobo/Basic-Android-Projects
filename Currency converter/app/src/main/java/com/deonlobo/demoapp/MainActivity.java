package com.deonlobo.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarAmountEditText =(EditText) findViewById(R.id.dollarAmountEditText);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());
        Double poundAmt = dollarAmountDouble*0.81;
        Toast.makeText(this, "The amount in pounds = "+String.format("%.2f", poundAmt)+"£", Toast.LENGTH_LONG).show();
        Log.i("amount",dollarAmountEditText.getText().toString());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
