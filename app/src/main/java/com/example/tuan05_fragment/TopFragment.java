package com.example.tuan05_fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment{

    private EditText edtFirstName;
    private EditText edtLastName;
    private Button btnAdd;

    private demo2_MainActivity demo2_mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.demo2_top_activity, container, false);
        edtFirstName = (EditText) view.findViewById(R.id.viewFirstName);
        edtLastName = (EditText) view.findViewById(R.id.viewLastName);
        btnAdd = (Button) view.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addName();
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof demo2_MainActivity){
            this.demo2_mainActivity = (demo2_MainActivity) context;
        }
    }

    private void addName() {
        String firstName = edtFirstName.getText().toString();
        String lastName = edtLastName.getText().toString();
        this.demo2_mainActivity.showText(firstName,lastName);
    }
}