package com.example.listfragment;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DetailFragment detailFragment = new DetailFragment();
		
		FragmentTransaction transaction = getFragmentManager().beginTransaction();
		transaction.add(R.id.fl, detailFragment);
		transaction.commit();
	}
}
