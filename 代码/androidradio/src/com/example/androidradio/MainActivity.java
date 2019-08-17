package com.example.androidradio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radios);
		//方式一：
		radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				RadioButton r = (RadioButton)findViewById(checkedId);
				//获取参数
				r.getText();
				
			}
		});
		findViewById(R.id.XXX).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//循环
				for(int i=0;i<radioGroup.getChildCount();i++) {
					RadioButton radioButton = (RadioButton)radioGroup.getChildAt(i);
					if(radioButton.isChecked()) {
						radioButton.getText();
						//单选只有一个可以选中，这个时候就可以跳出
						break;
					}
				}
			}
		});
	}
}
