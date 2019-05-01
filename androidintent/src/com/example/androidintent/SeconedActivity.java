package com.example.androidintent;

import android.R.bool;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeconedActivity extends Activity {
	private Button btn; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seconed);
		
		btn = (Button) findViewById(R.id.bt);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = getIntent();
				Bundle bundle = new Bundle();		

				bundle.putString("XX", "XXX");
				intent.putExtras(bundle);
				setResult(0x11, intent);
				finish();
			}
		});
	}
}
