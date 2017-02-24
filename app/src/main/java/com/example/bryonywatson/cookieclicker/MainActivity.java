package com.example.bryonywatson.cookieclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int currentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgCookie = (ImageView)findViewById(R.id.imgCookie);
        final TextView text = (TextView)findViewById(R.id.text);
        imgCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentScore ++;
                Log.v("HELLO", "lalalala");
                text.setText("Your current score is: " + currentScore);
                Toast.makeText(MainActivity.this, String.valueOf(currentScore), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
