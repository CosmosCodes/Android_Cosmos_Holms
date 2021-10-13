package com.example.cosmosholms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Switch to window Activity when clicking on the picture
    public void change_act(View view) {
        Intent intent = new Intent(this, sort_by_age.class);
        startActivity(intent);
    }

    //Switch to window Activity containing content WebView
    public void goToURL(View view) {
        Intent intent = new Intent(this, registeredActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        super.onBackPressed();
    }
}