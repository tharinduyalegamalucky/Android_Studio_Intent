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
    TextView txtTwo, txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button = findViewById(R.id.btnTwo);
        txtTwo = findViewById(R.id.txtTwo);
        txtAge = findViewById(R.id.txtAge);


        Intent intent = getIntent();
//        String name = intent.getStringExtra("USER_NAME");
//        int age = intent.getIntExtra("age",0);
        Bundle extras = intent.getExtras();

        String name = extras.getString("USER_NAME");
        int age = extras.getInt("USER_AGE");

        txtTwo.setText(name);
        txtAge.setText(String.valueOf(age));

        //set listener to the button
        button.setOnClickListener(v ->  {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                //Launch the activity two
                startActivity(i);
        });
    }
}