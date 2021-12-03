package kw.test.demoapplication.fragment.transdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kw.test.demoapplication.R;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        TransDataFragment transDataFragment = new TransDataFragment();
        Bundle bundle = new Bundle();
        bundle.putString("data","llllll");
        transDataFragment.setArguments(bundle);
        fragmentTransaction.add(R.id.frame_trans,transDataFragment);

        fragmentTransaction.commit();
    }
}
