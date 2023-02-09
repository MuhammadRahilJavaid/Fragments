package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ITAfternoonFragment extends Fragment {

    TextView AftIT;
    public ITAfternoonFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_layout, container, false);
        AftIT = view.findViewById(R.id.AftITtext);
        AftIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AftIT.setText("I'm Changed!BOOM!");
            }
        });
        return view;
    }
}