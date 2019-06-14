package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.widget.Button mybutton;
        mybutton = (android.widget.Button) findViewById(R.id.mybutton);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final int[] responses = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };



    mybutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("Ask","Your answer is coming up");
            Random randomNumberGenerator = new Random();
            int number = randomNumberGenerator.nextInt(5);

            ballDisplay.setImageResource(responses[number]);
        }
    });

    }
}
