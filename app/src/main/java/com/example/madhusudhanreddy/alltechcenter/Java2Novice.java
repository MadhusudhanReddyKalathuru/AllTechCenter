package com.example.madhusudhanreddy.alltechcenter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Java2Novice extends Activity
{
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java2novice);

        webView = (WebView) findViewById(R.id.webview1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.java2novice.com");
    }
}
