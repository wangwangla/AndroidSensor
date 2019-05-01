package com.example.fragmentlizi;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView imageView1 = (ImageView)findViewById(R.id.im1);
		ImageView imageView2 = (ImageView)findViewById(R.id.im2);
		ImageView imageView3 = (ImageView)findViewById(R.id.im3);
		ImageView imageView4 = (ImageView)findViewById(R.id.im4);
		imageView1.setOnClickListener(v);
		imageView2.setOnClickListener(v);
		imageView3.setOnClickListener(v);
		imageView4.setOnClickListener(v);
		
		
	}
	View.OnClickListener v= new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
			Fragment fragment = null;
			
			switch (v.getId()) {
			case R.id.im1:
				fragment = new WeChatFragment();
				break;
			case R.id.im2:
				fragment = new ListFragment();
				break;
			case R.id.im3:
				fragment = new FriendFragment();
				break;
			case R.id.im4:
				fragment = new MyFragment();
				break;
			default:
				break;
			}
			fragmentTransaction.replace(R.id.XX, fragment);
			fragmentTransaction.commit();
		}
	};
}
