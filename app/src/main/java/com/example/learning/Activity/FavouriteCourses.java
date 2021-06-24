package com.example.learning.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.learning.Adapter.Favourite_Adapter;
import com.example.learning.R;
import com.example.learning.databinding.ActivityFavouriteCoursesBinding;

public class FavouriteCourses extends AppCompatActivity {

    int[] img= {
            R.drawable.book,
            R.drawable.screentwo,
            R.drawable.groth,
            R.drawable.physic,
            R.drawable.chemstry,
            R.drawable.idea


    };
    ActivityFavouriteCoursesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityFavouriteCoursesBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.favouriteCourses.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.favouriteCourses.setAdapter(new Favourite_Adapter(img));



    }
}