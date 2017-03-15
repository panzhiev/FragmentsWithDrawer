package com.tim.fragmentswithdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.tim.fragmentswithdrawer.MainActivity.fragment;

/**
 * Created by Tim on 05.03.2017.
 */

public class Fragment3 extends Fragment {

    Button btnf3;
    public static final String TAG = "F3";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);
        btnf3 = (Button)view.findViewById(R.id.btn_f3);
        btnf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = Fragment4.newInstance();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_main, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }

    public static Fragment3 newInstance() {

        Fragment3 fragment = new Fragment3();
        return fragment;
    }
}
