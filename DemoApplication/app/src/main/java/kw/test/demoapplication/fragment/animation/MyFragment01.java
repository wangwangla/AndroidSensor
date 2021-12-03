package kw.test.demoapplication.fragment.animation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kw.test.demoapplication.R;

public class MyFragment01 extends Fragment {
    private AnimationActivity.Nextfragment nextfragment;
    public void setListener(AnimationActivity.Nextfragment nextfragment) {
        this.nextfragment = nextfragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ani1_fragment,null);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextfragment.click();
            }
        });
        return view;
    }
}
