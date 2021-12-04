package kw.test.demoapplication.activityfor;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import kw.test.demoapplication.R;

public class MainForWardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_for_ward);

    }

    public void open(View view) {
        startActivityForResult(
                new Intent(Intent.ACTION_PICK,
                        Uri.parse("content://contacts")),
                0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0){
//            startActivity(new Intent(Intent.ACTION_VIEW,data));
        }
    }
}