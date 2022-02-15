package com.example.login;

import static java.lang.String.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);

        TextView res = (TextView)findViewById(R.id.textView);

        add = (Button)findViewById(R.id.button);
        sub = (Button)findViewById(R.id.button2);
        mul = (Button)findViewById(R.id.button3);
        div = (Button)findViewById(R.id.button4);
        mod = (Button)findViewById(R.id.button5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float Num1 = Float.parseFloat(num1.getText().toString());
                float Num2 = Float.parseFloat(num2.getText().toString());

                float result = Num2 + Num1;

                res.setText(Num1 +" + " +Num2 + " = "+Float.toString(result));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float Num1 = Float.parseFloat(num1.getText().toString());
                float Num2 = Float.parseFloat(num2.getText().toString());

                float result = Num1 - Num2;

                res.setText(Num1 +" - " +Num2 + " = "+Float.toString(result));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float Num1 = Float.parseFloat(num1.getText().toString());
                float Num2 = Float.parseFloat(num2.getText().toString());

                float result = Num2 * Num1;

                res.setText(Num1 +" * " +Num2 + " = "+Float.toString(result));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float Num1 = Float.parseFloat(num1.getText().toString());
                float Num2 = Float.parseFloat(num2.getText().toString());

                float result = Num1 / Num2;

                res.setText(Num1 +" / " +Num2 + " = "+Float.toString(result));
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float Num1 = Float.parseFloat(num1.getText().toString());
                float Num2 = Float.parseFloat(num2.getText().toString());

                float result = Num1 % Num2;

                res.setText(Num1 +" % " +Num2 + " = "+Float.toString(result));
            }
        });
    }
}