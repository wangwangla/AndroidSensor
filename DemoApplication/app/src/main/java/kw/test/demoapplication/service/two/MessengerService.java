package kw.test.demoapplication.service.two;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MessengerService extends Service {
    static final int MSG_SAY_HELLO = 1;

    static class InComingHandler extends Handler{
        private Context context;

        InComingHandler(Context context){
            this.context = context.getApplicationContext();
        }


        @Override
        public void handleMessage(@NonNull Message msg) {
           switch (msg.what) {
                case MSG_SAY_HELLO:
                    Toast.makeText(context, "hello!", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    super.handleMessage(msg);
            }
        }
    }
    Messenger mMessenger;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(getApplicationContext(), "binding", Toast.LENGTH_SHORT).show();
        mMessenger = new Messenger(new InComingHandler(this));
        return mMessenger.getBinder();
    }
}
