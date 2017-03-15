package com.tim.fragmentswithdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tim on 05.03.2017.
 */

public class Fragment5 extends Fragment {

    public static final String TAG = "F5";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment5, container, false);

        return view;
    }

    public static Fragment5 newInstance() {

        Fragment5 fragment = new Fragment5();
        return fragment;
    }
}
