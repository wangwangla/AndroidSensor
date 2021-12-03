package kw.test.demoapplication.fragment.dymethid;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import kw.test.demoapplication.R;

public class Demo02Fragment extends Fragment {
    private Context context;
    public Demo02Fragment(Main2Activity main2Activity) {
        this.context = main2Activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.activity_demo02_fragment, null);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click();
            }
        });
        return inflate;
    }

    private Main2Activity.MainListener listener;
    public void setListener(Main2Activity.MainListener listener) {
        this.listener = listener;
    }
}
