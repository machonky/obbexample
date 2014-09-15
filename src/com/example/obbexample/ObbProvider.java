package com.example.obbexample;

import java.io.File;

import android.net.Uri;

import com.android.vending.expansion.zipfile.APEZProvider;

public class ObbProvider extends APEZProvider {

	public static final String SCHEME = "content://";
	public static final String AUTHORITY = "com.example.obbexample.provider";
	
	@Override
	public String getAuthority() {
		return AUTHORITY;
	}

	public static Uri getUriFromPath(String resourcePath) {
		StringBuilder builder = new StringBuilder(SCHEME)
			.append(AUTHORITY)
			.append(File.separator)
			.append(resourcePath);
		
		return Uri.parse(builder.toString());
	}

}
