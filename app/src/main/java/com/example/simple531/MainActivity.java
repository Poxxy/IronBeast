package com.example.simple531;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void settingsMenu(View view) {
        Intent myIntent = new Intent(MainActivity.this, Settings.class);
        /* If I want to send information
        myIntent.putExtra("key", value); //Optional parameters
        */
        MainActivity.this.startActivity(myIntent);
    }
}