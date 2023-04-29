package com.example.hackerrupt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);


        setSingleEvent(mainGrid);
        setSecondEvent(mainGrid);
        setThirdEvent(mainGrid);
        setSixthEvent(mainGrid);
        setFourthEvent(mainGrid);
        setFifthEvent(mainGrid);


    }

    private void setSixthEvent(GridLayout mainGrid) {
        CardView cardView = (CardView) mainGrid.getChildAt(5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, com.example.hackerrupt.Helpline.class);
                startActivity(intent);

            }
        });
    }


    private void setToggleEvent(GridLayout mainGrid) {

        for (int i = 0; i < mainGrid.getChildCount(); i++) {

            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {

        CardView cardView = (CardView) mainGrid.getChildAt(0);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, com.example.hackerrupt.ActivityOne.class);
                startActivity(intent);

            }
        });
    }

    private void setSecondEvent(GridLayout mainGrid) {

        CardView cardView = (CardView) mainGrid.getChildAt(1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.hackerrupt.ActivityTwo.class);
                startActivity(intent);

            }
        });
    }

    private void setThirdEvent(GridLayout mainGrid) {

        CardView cardView = (CardView) mainGrid.getChildAt(2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, com.example.hackerrupt.ActivityThree.class);
                startActivity(intent);

            }
        });

    }

    private void setFourthEvent(GridLayout mainGrid) {

        CardView cardView = (CardView) mainGrid.getChildAt(3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, com.example.hackerrupt.MLModel.class);
                startActivity(intent);

            }
        });

    }

    private void setFifthEvent(GridLayout mainGrid) {

        CardView cardView = (CardView) mainGrid.getChildAt(4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, com.example.hackerrupt.Scholorship.class);
                startActivity(intent);

            }
        });

    }
}


