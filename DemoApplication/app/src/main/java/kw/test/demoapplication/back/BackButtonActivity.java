package kw.test.demoapplication.back;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import kw.test.demoapplication.R;

public class BackButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_button);
    }

    /**
     * 建议保留super方法
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}