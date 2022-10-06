package com.example.android_tutorial_05;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
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

//        final Intent intent = new Intent(getApplicationContext(),ActivityTwo.class);
//        String name = "Tharindu Yalegama";
//        int age = 24;
//
//        //intent.putExtra("USER_NAME",name);
//        //intent.putExtra("age",age);
//        Bundle extras = new Bundle();
//        extras.putString("USER_NAME",name);
//        extras.putInt("USER_AGE",age);
//
//        intent.putExtras(extras);

        Intent intent = new Intent(Intent.ACTION_SEND);
        final Intent chooser;

        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,new  String[] {"someone@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "This is our test Subject");
        intent.putExtra(Intent.EXTRA_TEXT, "This is our test email.body");
        intent.setType("message/rfc822");
        chooser = intent.createChooser(intent, "Send email text app");



          button.setOnClickListener(v ->  {
                //Launch the activity two
                startActivity(chooser);

            }
        );
    }
}