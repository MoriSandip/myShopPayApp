package com.example.learning.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learning.Activity.Signin_SignUp;
import com.example.learning.Adapter.Category_Adapter;
import com.example.learning.Adapter.CoureseAdapter;
import com.example.learning.R;
import com.example.learning.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    int[] img= {
            R.drawable.book,
            R.drawable.screentwo,
            R.drawable.groth,
            R.drawable.physic,
            R.drawable.chemstry,
            R.drawable.idea


    };
    String[] title = {
            "Computer Science","Physics","Computer","Science","Maths","Science"


    };

    String[] price = {
            "$ 2.9",
            "$ 1.9",
            "$ 0.9",
            "$ 1.9",
            "$ 3.9",
            "$ 0.9",
    };

   FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding =  FragmentHomeBinding.inflate(inflater, container, false);






        binding.coureserecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.coureserecyclerview.setAdapter(new CoureseAdapter(img,title,price));

        binding.bookrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        binding.bookrecyclerview.setAdapter(new CoureseAdapter(img,title,price));

        binding.categoryRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        binding.categoryRecyclerView.setAdapter(new Category_Adapter(img,title));



        return binding.getRoot();





    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}