package com.example.androidsensor;

import java.util.List;

import android.R.string;
import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class SensorAll extends Activity{
	private TextView textView;
	private SensorManager sensorManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sensor);
		textView = (TextView) findViewById(R.id.tvSensor);
		sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
		for(Sensor sensor : sensors) {
			textView.append(sensor.getName()+"\n");
		}
	}
}
