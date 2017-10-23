package com.example.madhusudhanreddy.alltechcenter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Madhusudhan Reddy on 12/13/2016.
 */

public class W3Schools extends Activity
{
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w3schools);

        webView = (WebView) findViewById(R.id.webview4);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.w3schools.com");


    }
}
