package com.example.learning.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.learning.Adapter.Containt_List_Adapter;
import com.example.learning.Adapter.Tab_Adapter;
import com.example.learning.Model.Containt_List_Model;
import com.example.learning.R;
import com.example.learning.databinding.ActivityVideoDetailsBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class VideoDetails extends AppCompatActivity {


    ActivityVideoDetailsBinding binding;
    ArrayList<Containt_List_Model> containt_list_models;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityVideoDetailsBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


        containt_list_models =new ArrayList<>();
        containt_list_models.add(new Containt_List_Model("01","Android Basic","30.5 min"));
        containt_list_models.add(new Containt_List_Model("02","Android First application demo","30.5 min"));
        containt_list_models.add(new Containt_List_Model("03","Android AVD","3.5 min"));
        containt_list_models.add(new Containt_List_Model("04","Android Advance","3.5 min"));
        containt_list_models.add(new Containt_List_Model("05","Android","3.50 min"));
        containt_list_models.add(new Containt_List_Model("06","Android","30.5 min"));
        containt_list_models.add(new Containt_List_Model("07","Android","30.5 min"));
        containt_list_models.add(new Containt_List_Model("08","Android","30.5 min"));
        containt_list_models.add(new Containt_List_Model("09","Android","3.5 min"));

        binding.containtdetail.buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VideoDetails.this, "rferfe", Toast.LENGTH_SHORT).show();
            }
        });

        binding.containtdetail.containtListRecyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.containtdetail.containtListRecyclerview.setAdapter(new Containt_List_Adapter(containt_list_models));

        binding.containtdetail.buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Payment_Detail.class));
            }
        });








    }
}