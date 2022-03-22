package com.example.tuan05_fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends Fragment {

    private TextView txtResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.demo2_bottom_activity, container, false);

        txtResult = (TextView) view.findViewById(R.id.txtResult);
        return view;
    }

    public void showText(String firstName, String lastName){
        txtResult.setText(firstName + " " + lastName);
    }
}