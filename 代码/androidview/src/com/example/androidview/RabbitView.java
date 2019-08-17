package com.example.androidview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class RabbitView extends View{
	float X;
    float Y;
	public RabbitView(Context context) {
		super(context);
		X=200;
		Y=200;
	}
	//…Ë÷√œ‘ æŒª÷√
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Paint paint = new Paint();
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
		canvas.drawBitmap(bitmap, X, Y, paint);
		if(bitmap.isRecycled()) {
			bitmap.recycle();
		}
	}
}
