package com.example.androidview;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FrameLayout fragment = (FrameLayout)findViewById(R.id.bg_id);
		final RabbitView rabbitView = new RabbitView(this);
		rabbitView.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				rabbitView.X=event.getX();
				rabbitView.Y=event.getY();
				//ÖØÐÂ»æÖÆ
				rabbitView.invalidate();
				return true;
			}
		});
		fragment.addView(rabbitView);
	}
}
