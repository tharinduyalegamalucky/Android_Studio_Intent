package com.example.android_tutorial_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    //create button object
    Button button;
    TextView txtTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button = findViewById(R.id.btnTwo);
        txtTwo = findViewById(R.id.txtTwo);


        Intent intent = getIntent();
        String name = intent.getStringExtra("USER_NAME");

        txtTwo.setText(name);

        //set listener to the button
        button.setOnClickListener(v ->  {
                Intent i = new Intent(getApplicationContext(),ActivityTwo.class);
                //Launch the activity two
                startActivity(i);
        });
    }
}