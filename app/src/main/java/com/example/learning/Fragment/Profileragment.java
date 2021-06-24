package com.example.learning.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learning.Activity.FavouriteCourses;
import com.example.learning.Activity.Friends;
import com.example.learning.Adapter.task_adapter;
import com.example.learning.R;
import com.example.learning.databinding.FragmentProfileragmentBinding;

public class Profileragment extends Fragment {


    FragmentProfileragmentBinding binding;
    public Profileragment() {
        // Required empty public constructor
    }


    String[] title = {"Android","Java","Php"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        binding =  FragmentProfileragmentBinding.inflate(inflater, container, false);


        binding.taskRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        binding.taskRecyclerview.setAdapter(new task_adapter(title));

        binding.imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), FavouriteCourses.class));
            }
        });

        binding.imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Friends.class));
            }
        });











        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
