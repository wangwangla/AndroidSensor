package kw.test.demoapplication.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.os.Bundle;

import kw.test.demoapplication.R;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        showNotification();
    }

    private void showNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher_background).
                setContentTitle("title")
                .setContentText("context")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.notify();
    }
}
