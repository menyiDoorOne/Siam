package com.Siam.siamuniversity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Word1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_word1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.word1, menu);
		return true;
	}

}
