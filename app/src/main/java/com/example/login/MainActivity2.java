package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button next_Activity_button;
    Button prev_Activity_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        next_Activity_button = (Button)findViewById(R.id.button);
        prev_Activity_button = (Button)findViewById(R.id.button2);

        EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText password = (EditText) findViewById(R.id.editTextNumberPassword);
        email.setText("");
        password.setText("");

        next_Activity_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String emailData = email.getText().toString();
                String passwordData = password.getText().toString();

                Intent intent = getIntent();
                String validEmail = intent.getExtras().getString("emailData");
                String validPassword = intent.getExtras().getString("passwordData");

                if(emailData.trim().equals(validEmail) && passwordData.trim().equals(validPassword)) {
                    Toast.makeText(MainActivity2.this, "Authentication Succeded, Hello "+emailData, Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity2.this, Calculator.class);
                    startActivity(intent2);
                }
                else{
                    email.setText(emailData);
                    password.setText(passwordData);
                    Toast.makeText(MainActivity2.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        prev_Activity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}