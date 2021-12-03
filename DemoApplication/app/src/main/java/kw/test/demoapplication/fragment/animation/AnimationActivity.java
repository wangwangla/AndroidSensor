package kw.test.demoapplication.fragment.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kw.test.demoapplication.R;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MyFragment01 myFragment01 = new MyFragment01();
        myFragment01.setListener(new Nextfragment(){
            @Override
            public void click() {
                nexn();
            }
        });
        fragmentTransaction.add(R.id.fragment_anima,myFragment01);
        fragmentTransaction.commit();
    }

    public void nexn(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MyFragment02 myFragment01 = new MyFragment02();
        fragmentTransaction.setCustomAnimations(
            R.anim.slide_in,
            R.anim.fade_out,
            R.anim.fade_in,
            R.anim.slide_out);
        fragmentTransaction.replace(R.id.fragment_anima,myFragment01);
        fragmentTransaction.commit();
    }

    interface Nextfragment{
        void click();
    }
}
