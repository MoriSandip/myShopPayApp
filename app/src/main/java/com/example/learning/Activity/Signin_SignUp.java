package com.example.learning.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.learning.R;
import com.example.learning.databinding.ActivitySigninSignUpBinding;

public class Signin_SignUp extends AppCompatActivity {
ActivitySigninSignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySigninSignUpBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.alreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Signup.class));
            }
        });
        binding.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Dashboard.class));
            }
        });
    }
}