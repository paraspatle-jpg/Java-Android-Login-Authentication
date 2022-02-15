package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button next_Activity_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next_Activity_button = (Button)findViewById(R.id.button);
        EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText password = (EditText) findViewById(R.id.editTextNumberPassword);
        email.setText("");
        password.setText("");

        next_Activity_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String emailData = email.getText().toString();
                String passwordData = password.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("emailData",emailData);
                intent.putExtra("passwordData",passwordData);
                startActivity(intent);
            }
        });
    }
}