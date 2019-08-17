package com.example.androidshijian;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends Activity {
	private long exitLong = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Toast.makeText(MainActivity.this, "触摸", Toast.LENGTH_SHORT).show();
		return super.onTouchEvent(event);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode==KeyEvent.KEYCODE_BACK) {
			exit();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		return super.onKeyUp(keyCode, event);
	}
	
	public void exit() {
		if((System.currentTimeMillis()-exitLong)>=2000) {
			Toast.makeText(MainActivity.this, "再按一次退出", Toast.LENGTH_SHORT).show();
			exitLong = System.currentTimeMillis();
		}else {
			finish();
			System.exit(0);
		}
	}
}
