package com.example.madhusudhanreddy.alltechcenter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Madhusudhan Reddy on 12/13/2016.
 */

public class CoderHub extends Activity
{
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.codershub);

        webView = (WebView) findViewById(R.id.webview6);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.coders-hub.com");

    }
}
