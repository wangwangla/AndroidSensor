package kw.test.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import kw.test.demoapplication.flow.FlowButtonActivity;
import kw.test.demoapplication.fragment.animation.AnimationActivity;
import kw.test.demoapplication.fragment.dymethid.Demo02Fragment;
import kw.test.demoapplication.fragment.dymethid.Main2Activity;
import kw.test.demoapplication.fragment.staticmethod.DemoFragmentActivity;
import kw.test.demoapplication.fragment.transdata.Main3Activity;
import kw.test.demoapplication.notification.Main4Activity;
import kw.test.demoapplication.shadow.ShadowActivity;

public class MainActivity extends AppCompatActivity {
    String data[] = {
            "static fragment",
            "dy_fragment",
            "trans data",
            "aniamtion",
            "flow",
            "showdow",
            "notification"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1,data);;
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i){
                    case 0:
                        intent = new Intent(MainActivity.this, DemoFragmentActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, Main3Activity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, AnimationActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, FlowButtonActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(MainActivity.this, ShadowActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(MainActivity.this, Main4Activity.class);
                        startActivity(intent);
                        break;

                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
