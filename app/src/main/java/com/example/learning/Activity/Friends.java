package com.example.learning.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.learning.Adapter.Friends_List_Adapter;
import com.example.learning.R;
import com.example.learning.databinding.ActivityFriendsBinding;

public class Friends extends AppCompatActivity {
ActivityFriendsBinding binding;
int[] img= {
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone,
        R.drawable.userone, R.drawable.userone


};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityFriendsBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.frndListRecyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.frndListRecyclerview.setAdapter(new Friends_List_Adapter(img));



    }
}