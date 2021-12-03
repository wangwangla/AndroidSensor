package kw.test.demoapplication.fragment.dymethid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kw.test.demoapplication.R;
import kw.test.demoapplication.fragment.staticmethod.DemoFragment;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setDefault();
    }

    private void setDefault() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        Demo02Fragment demo02Fragment = new Demo02Fragment(this);
        demo02Fragment.setListener(new MainListener() {
            @Override
            public void click() {
                updateView();
            }
        });
        fragmentTransaction.add(R.id.dy_fragment,demo02Fragment);
        fragmentTransaction.commit();
    }

    private void updateView() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.dy_fragment,new DemoFragment());
        fragmentTransaction.commit();
    }

    interface MainListener{
        public void click();
    }

}
