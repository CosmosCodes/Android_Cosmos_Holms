package com.example.cosmosholms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class registeredActivity extends AppCompatActivity {

    private WebView webContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);

        ShowWebViewWebContent();

    }

    //Going to the site at the specified URL and displaying its content in the element WebView
    @SuppressLint("SetJavaScriptEnabled")
    public void ShowWebViewWebContent(){
        webContent = findViewById(R.id.webContent);
        webContent.getSettings().setJavaScriptEnabled(true);
        webContent.loadUrl("http://cosmosholms.com/173-2/?action-rcl=register");

        WebViewClient webViewClient = new WebViewClient() {
            @SuppressWarnings("deprecation") @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @TargetApi(Build.VERSION_CODES.N) @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true;
            }
        };
        webContent.setWebViewClient(webViewClient);
    }

    //Clicking the Back button returns to the previous WebContent page
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode==KeyEvent.KEYCODE_BACK) && webContent.canGoBack()){
            webContent.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    //Returns to the home page of the application
    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}