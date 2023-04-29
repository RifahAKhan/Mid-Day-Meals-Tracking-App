package com.example.hackerrupt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Scholorship extends AppCompatActivity {
    TextView linkTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholorship);

        linkTextView = findViewById(R.id.link);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}



