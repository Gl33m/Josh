package edu.Drake.androidactivities2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
	
	Button button;
	private static final String TAG = "SecondActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}
	public void buttonPress (View view)
	{
		Log.v(TAG, "Button Pressed!");
		Intent intent = new Intent(view.getContext(), ThirdActivity.class);
		startActivity(intent);
	}

}
