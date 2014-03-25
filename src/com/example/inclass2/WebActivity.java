/*
 * James Keller
 * In Class Assignment 2
 * 2/18/14
 */

package com.example.inclass2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebActivity extends Activity {
	String url;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
		
		url = getIntent().getExtras().getString(MainActivity.URL_KEY);
		
		 WebView webview = new WebView(this);
		 WebSettings webSettings = webview.getSettings();
		 webSettings.setJavaScriptEnabled(true);
		 webview.loadUrl(url);
		 setContentView(webview);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web, menu);
		return true;
	}

}
