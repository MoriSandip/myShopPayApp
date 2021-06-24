package com.example.learning.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.learning.Adapter.Video_Adapter;
import com.example.learning.R;
import com.example.learning.databinding.ActivityInstructorProfileBinding;

public class Instructor_Profile extends AppCompatActivity {

    ActivityInstructorProfileBinding binding;
    String[] title={
            "Android Basic"
            ,
            "Java Basic"
            ,
            "PHP Basic"
            ,
            "HTML Basic"
            ,
            "Kotlin Basic"
            ,
            "Android Basic"
            ,
            "Java Basic"
            ,
            "PHP Basic"
            ,
            "HTML Basic"
            ,
            "Kotlin Basic"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityInstructorProfileBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.videoRecyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.videoRecyclerview.setAdapter(new Video_Adapter(title));


        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Payment_Detail.class));
            }
        });

    }
}