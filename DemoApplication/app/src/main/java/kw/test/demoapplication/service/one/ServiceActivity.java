package kw.test.demoapplication.service.one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;

import kw.test.demoapplication.R;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(this,LoacalService.class);
        bindService(intent,con, Context.BIND_AUTO_CREATE);
    }

    private LoacalService serive;
    private ServiceConnection con = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LoacalService.LacalBuilder binder = (LoacalService.LacalBuilder) iBinder;
            serive = binder.getSerive();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };
}
