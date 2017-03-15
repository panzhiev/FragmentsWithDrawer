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

public class Fragment1 extends Fragment {

    Button btnf1;
    public static final String TAG = "F1";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        btnf1 = (Button)view.findViewById(R.id.btn_f1);
        btnf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = Fragment2.newInstance();

                FragmentTransaction fragmentTransaction = getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content_main, fragment)
                        .addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }

    public static Fragment1 newInstance() {

        Fragment1 fragment = new Fragment1();
        return fragment;
    }
}
