package com.example.hackerrupt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select extends AppCompatActivity {
    private Button button;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationActivity();
            }
        });

        loginButton = (Button) findViewById(R.id.button2);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });
    }

    public void openRegistrationActivity() {
        Intent intent = new Intent(this,Registration.class);
        startActivity(intent);
    }

    public void openLoginActivity() {
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }
}