package com.example.proffesional_manager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

	private static final long DELAYMILLIS = 2000;

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				final Intent intent = new Intent(MainActivity.this, Home.class);
				MainActivity.this.startActivity(intent);
				MainActivity.this.finish();
			}
		}, DELAYMILLIS);
	}
}