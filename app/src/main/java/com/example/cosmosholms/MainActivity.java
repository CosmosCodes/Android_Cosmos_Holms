package com.example.cosmosholms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void change_act(View view) {
        Intent intent = new Intent(this, sort_by_age.class);
        startActivity(intent);
    }

    public void goToURL(View view) {
        Intent intent = new Intent(this, registeredActivity.class);
        startActivity(intent);
    }
}