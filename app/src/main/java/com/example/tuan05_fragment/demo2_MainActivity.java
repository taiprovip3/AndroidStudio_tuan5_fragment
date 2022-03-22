package com.example.tuan05_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class demo2_MainActivity extends AppCompatActivity {

    public void showText(String firstName, String lastName) {
        BottomFragment bottomFragment = (BottomFragment) this.getSupportFragmentManager().findFragmentById(R.id.fragment_bottom);
                bottomFragment.showText(firstName, lastName);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo2_main_activity);
    }
}