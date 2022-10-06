package com.example.android_tutorial_05;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnOne);

        final Intent intent = new Intent(getApplicationContext(),ActivityTwo.class);
        String name = "Tharindu Yalegama";

        intent.putExtra("USER_NAME",name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Launch the activity two
                startActivity(intent);
            }
        });
    }
}