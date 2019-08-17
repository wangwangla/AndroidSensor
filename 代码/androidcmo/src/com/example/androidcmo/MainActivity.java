package com.example.androidcmo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//第二步：创建并初始化一个图片，根据触摸事件改编帽子的位置
		final ChumoView chumoView = new ChumoView(MainActivity.this);
		//给它加上一个时间监听器
		chumoView.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				chumoView.X = event.getX()-80;
				chumoView.Y = event.getY()-80;
				chumoView.invalidate();
				if(event.getAction() == MotionEvent.ACTION_DOWN) {
					///按键按下
				}else if(event.getAction() == MotionEvent.ACTION_UP) {
					//按键弹起
				}
				return true;
			}
		});
		//将图片添加到布局管理器
		//获取管理器
		//添加布局
	}
}
