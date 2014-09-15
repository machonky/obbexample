package com.example.obbexample;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends Activity {

	WebView mainView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String externalStoragePath = Environment.getExternalStorageDirectory().toString();
		Log.i("ObbPath", externalStoragePath);
		
		mainView = (WebView)findViewById(R.id.webView1);
		String startUrl = ObbProvider.getUriFromPath("start.html").toString();
		mainView.loadUrl(startUrl);
	}
}
