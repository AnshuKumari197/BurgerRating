package com.coding.a13burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);

    }
    public void submit(View view){
        float ratingValue = ratingBar.getRating();

        if (ratingValue <= 2){
            textView.setText("Rating " + ratingValue + "\n We will try better next time");
        }
        else if (ratingValue <= 3.5 && ratingValue >= 2.5){
            textView.setText("Rating " + ratingValue + "\n We are constantly improving");
        }
        else if (ratingValue <= 4.5 && ratingValue >= 4){
            textView.setText("Rating " + ratingValue + "\n We will provide our best");
        }
        else if (ratingValue == 5){
            textView.setText("Rating " + ratingValue + "\n Happy to satisfy you");
        }

    }
}