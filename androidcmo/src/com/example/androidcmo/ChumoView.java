package com.example.androidcmo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * 创建view
 * 
 * @author Administrator
 *
 */
public class ChumoView extends View {
	public float X;
	public float Y;
	
	public ChumoView(Context context) {
		super(context);
		//初始化
		X = 65;
		Y = 0;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Paint paint = new Paint();
		Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_launcher);
		canvas.drawBitmap(bitmap, X, Y,paint);
		if(bitmap.isRecycled()) {
			bitmap.recycle();
		}
	}
}
