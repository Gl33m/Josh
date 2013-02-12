//Josh Husey
//Software Development
// 2/12/2013
//This application is to simply showcase I took the 10 minutes to see how to make buttons and screen switching work in Android.
//By the way, I skipped making a back button for my screens. It's a single function call finish(); and 
//a back button already physically exists on phones...

package edu.Drake.androidactivities2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button button;
	private static final String TAG = "MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void buttonPress (View view)
	{
		Log.v(TAG, "Button Pressed!");
		Intent intent = new Intent(view.getContext(), SecondActivity.class);
		startActivity(intent);
	}

}
