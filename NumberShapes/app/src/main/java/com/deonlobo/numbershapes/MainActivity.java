package com.deonlobo.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number{
        int number;

        public boolean isTriangular() {
            int x=1;
            int triangularNumber = 1;
            while(triangularNumber < number) {
                x++;
                triangularNumber = triangularNumber +x;

            }
            if(triangularNumber == number) {
                return true;
            }else {
                return false;
            }
        }

        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);
            if (squareRoot == Math.floor(squareRoot)) {
                return true;
            }else {
                return false;
            }
        }
    }



    public void testNumber(View view){
        String msg = "";
        EditText userNumber = (EditText) findViewById(R.id.usersNumber);

        if(userNumber.getText().toString().isEmpty()){
            msg="Please enter a number";
        }else {
            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(userNumber.getText().toString());

            if (myNumber.isSquare()) {
                if (myNumber.isTriangular()) {
                    msg = myNumber.number + " is both triangular and square!";

                } else {
                    msg = myNumber.number + " is square but not triangular!";
                }
            } else if (myNumber.isTriangular()) {
                msg = myNumber.number + " is triangular but not square!";
            } else {
                msg = myNumber.number + " is not triangular and not square!";
            }
        }
        Log.
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
