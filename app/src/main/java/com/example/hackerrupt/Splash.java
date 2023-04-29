package com.example.hackerrupt;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ImageView img1,img2;
        Animation top,bottom;

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        img1=(ImageView)findViewById(R.id.imageView);
        img2=(ImageView)findViewById(R.id.imageView2);

        top= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.mainlogoanimation);
        bottom= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sublogoanimation);

        img1.setAnimation(top);
        img2.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),Select.class));
            }
        },3000);


    }
}