package com.example.androidsensor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

	private Button sensorAll;
	private Button acce;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sensorAll = (Button) findViewById(R.id.sensorAll);
		acce = (Button) findViewById(R.id.acce);
		sensorAll.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,SensorAll.class);
				startActivity(intent);
			}
		});
		acce.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,accelerom.class);
				startActivity(intent);
			}
		});
	}

	/*@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.sensorAll:
			Intent intent = new Intent(MainActivity.this,SensorAll.class);
			startActivity(intent);
			break;
		case R.id.acce:
			System.out.println("=============");
			break;
		default:
			System.out.println("------------");
			break;
		}
	}*/
}
