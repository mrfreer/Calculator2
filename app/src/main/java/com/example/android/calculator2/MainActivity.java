package com.example.android.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        EditText e1 = (EditText)findViewById(R.id.txtNumber1);
        EditText e2 = (EditText)findViewById(R.id.txtNumber2);
        TextView t1 = (TextView)findViewById(R.id.txtResult);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText("The sum is " + sum);
    }

    public void subtractClick(View v){
        EditText e1 = (EditText)findViewById(R.id.txtNumber1);
        EditText e2 = (EditText)findViewById(R.id.txtNumber2);
        TextView t1 = (TextView)findViewById(R.id.txtResult);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int subtract = num1 - num2;
        t1.setText("Subtraction: " + subtract);
    }
}
