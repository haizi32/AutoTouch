package com.example.administrator.webtest;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebActivity extends AppCompatActivity {

    private WebView web;

    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Intent intent = getIntent();
        url = intent.getStringExtra("URL");
        web = (WebView) findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setBlockNetworkImage(false);
        if(Build.VERSION.SDK_INT>= 24) {
            web.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(url);
        AutoClick autoClick = new AutoClick();
        web.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Toast.makeText(WebActivity.this, "hhhhhhhhh", Toast.LENGTH_SHORT).show();
                AutoClick autoClick = new AutoClick();
                autoClick.autoClickXY(900,1800,920,1800);
                autoClick.autoClickXY(900,1800,920,1800);
                autoClick.autoClickXY(900,1800,920,1800);
                autoClick.autoClickXY(900,1800,920,1800);
                autoClick.autoClickXY(900,1800,920,1800);
            }
        });
             autoClick.autoClickXY(900,1800,920,1800);
             autoClick.autoClickXY(900,1800,920,1800);
        }
    }


