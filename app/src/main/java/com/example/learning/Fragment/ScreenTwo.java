package com.example.learning.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learning.Activity.Signin_SignUp;
import com.example.learning.R;
import com.example.learning.databinding.FragmentScreenOneBinding;
import com.example.learning.databinding.FragmentScreenThreeBinding;
import com.example.learning.databinding.FragmentScreenTwoBinding;

public class ScreenTwo extends Fragment {
    FragmentScreenTwoBinding binding;

    public ScreenTwo() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =  FragmentScreenTwoBinding.inflate(inflater, container, false);


        binding.skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Signin_SignUp.class));
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