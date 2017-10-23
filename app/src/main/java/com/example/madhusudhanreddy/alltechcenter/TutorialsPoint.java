package com.example.madhusudhanreddy.alltechcenter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class TutorialsPoint extends Activity
{
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorialspoint);

        webView = (WebView) findViewById(R.id.webview3);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.tutorialspoint.com");
    }
}
