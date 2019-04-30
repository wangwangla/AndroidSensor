package com.example.androidsensor;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class accelerom extends Activity implements SensorEventListener{
	private SensorManager sensorManager;
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		textView = (TextView) findViewById(R.id.accel);
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		sensorManager.registerListener(this, 
				sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
				SensorManager.SENSOR_DELAY_UI);
		sensorManager.registerListener(this, 
				sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY),
				SensorManager.SENSOR_DELAY_FASTEST);
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		sensorManager.unregisterListener(this);
	}
	
	//改变
	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		switch(event.sensor.getType()) {
			case Sensor.TYPE_ACCELEROMETER:
				float arr []  = event.values;
				textView.append(arr[0]+"  "+arr[1]+"  "+arr[2]);
				break;
			case Sensor.TYPE_GRAVITY:
				break;
		}
	}
	//创建之后
	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}
}
