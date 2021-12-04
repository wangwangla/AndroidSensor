package kw.test.demoapplication.savedInstanceState;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;

import kw.test.demoapplication.R;

/**
 * 保存数据  取出数据
 */
public class SaveStateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState!=null){
            System.out.println(savedInstanceState.getString("key"));
        }
        setContentView(R.layout.activity_save_state);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putString("key","save data");
    }
}