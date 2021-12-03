package kw.test.demoapplication.fragment.transdata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kw.test.demoapplication.R;

public class TransDataFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.transdata, null);
        return inflate;
    }

    @Override
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        String data = args.getString("data");
        System.out.println(data +"----------------------------");
    }
}
