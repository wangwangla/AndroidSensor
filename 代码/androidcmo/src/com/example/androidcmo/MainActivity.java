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
		//�ڶ�������������ʼ��һ��ͼƬ�����ݴ����¼��ı�ñ�ӵ�λ��
		final ChumoView chumoView = new ChumoView(MainActivity.this);
		//��������һ��ʱ�������
		chumoView.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				chumoView.X = event.getX()-80;
				chumoView.Y = event.getY()-80;
				chumoView.invalidate();
				if(event.getAction() == MotionEvent.ACTION_DOWN) {
					///��������
				}else if(event.getAction() == MotionEvent.ACTION_UP) {
					//��������
				}
				return true;
			}
		});
		//��ͼƬ��ӵ����ֹ�����
		//��ȡ������
		//��Ӳ���
	}
}
