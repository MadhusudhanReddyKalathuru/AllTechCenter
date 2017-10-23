package com.example.madhusudhanreddy.alltechcenter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Madhusudhan Reddy on 12/13/2016.
 */

public class MkYong extends Activity
{
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mkyong);

        webView = (WebView) findViewById(R.id.webview5);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.mkyong.com");


    }
}
