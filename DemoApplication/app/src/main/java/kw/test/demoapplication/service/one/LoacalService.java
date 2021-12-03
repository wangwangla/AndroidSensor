package kw.test.demoapplication.service.one;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class LoacalService extends Service {
    private final IBinder binder = new LacalBuilder();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public class LacalBuilder extends Binder {
        LoacalService getSerive(){
            return LoacalService.this;
        }
    }

    public void test(){

    }
}
