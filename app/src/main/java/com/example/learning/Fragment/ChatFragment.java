package com.example.learning.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learning.Adapter.UserAdapter;
import com.example.learning.R;
import com.example.learning.databinding.FragmentChatBinding;


public class ChatFragment extends Fragment {

    FragmentChatBinding binding;
    int[] img = {
            R.drawable.usertwo,
            R.drawable.userthree,
            R.drawable.userone,
            R.drawable.usertwo,
            R.drawable.userthree,
            R.drawable.userone,
            R.drawable.usertwo,
            R.drawable.userthree,
            R.drawable.userone,
            R.drawable.usertwo,
            R.drawable.userthree,
            R.drawable.userone

    };

    public ChatFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentChatBinding.inflate(inflater, container, false);


        binding.userlistRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));

        binding.userlistRecyclerview.setAdapter(new UserAdapter(img));





        return binding.getRoot();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding  = null;
    }
}