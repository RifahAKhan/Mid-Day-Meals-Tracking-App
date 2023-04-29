package com.example.hackerrupt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class GFeedback extends AppCompatActivity {
    TextView linkTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gfeedback);

        linkTextView = findViewById(R.id.activity_main_hyperlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}



