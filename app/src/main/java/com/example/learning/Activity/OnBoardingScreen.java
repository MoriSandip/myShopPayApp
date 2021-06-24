package com.example.learning.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.learning.Adapter.OnBoardingScreenAdapter;
import com.example.learning.databinding.ActivityOnBoardingScreenBinding;

public class OnBoardingScreen extends AppCompatActivity {

ActivityOnBoardingScreenBinding boardingScreenBinding;
OnBoardingScreenAdapter onBoardingScreenAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        boardingScreenBinding  = ActivityOnBoardingScreenBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(boardingScreenBinding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        onBoardingScreenAdapter = new OnBoardingScreenAdapter(getSupportFragmentManager());
        boardingScreenBinding.pager.setAdapter(onBoardingScreenAdapter);





    }
}