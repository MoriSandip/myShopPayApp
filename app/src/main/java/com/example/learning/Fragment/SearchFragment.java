package com.example.learning.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.learning.Adapter.CoureseAdapter;
import com.example.learning.Adapter.FilterCategory;
import com.example.learning.Adapter.Instructor_Adapter;
import com.example.learning.Model.Instructor_Model;
import com.example.learning.R;
import com.example.learning.databinding.FragmentSearchBinding;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    ArrayList<Instructor_Model> instructor_modelArrayList;
    Instructor_Model instructor_model;
    FragmentSearchBinding binding;
    Instructor_Adapter instructor_adapter;

    public SearchFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       binding = FragmentSearchBinding.inflate(inflater, container, false);

       instructor_modelArrayList = new ArrayList<>();

        instructor_modelArrayList.add(new Instructor_Model( R.drawable.userone,"Mori Sandip","Android"));
        instructor_modelArrayList.add(new Instructor_Model( R.drawable.userthree,"Rahul","Java"));
        instructor_modelArrayList.add(new Instructor_Model( R.drawable.usertwo,"Ravi","Android Kotlin"));
        instructor_modelArrayList.add(new Instructor_Model( R.drawable.userone,"ravi 1","php"));
        instructor_modelArrayList.add(new Instructor_Model( R.drawable.userone,"rahul","c lang"));
        instructor_modelArrayList.add(new Instructor_Model( R.drawable.usertwo,"vishal","kotlin2"));
        instructor_modelArrayList.add(new Instructor_Model( R.drawable.userthree,"ravi 2","Android1"));
        instructor_modelArrayList.add(new Instructor_Model( R.drawable.userthree,"rahul 2","maths"));



       /* binding.filtercategory.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.filtercategory.setAdapter(new FilterCategory(img));*/

        instructor_adapter=new Instructor_Adapter(instructor_modelArrayList);

        binding.instructorRecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.instructorRecyclerview.setAdapter(instructor_adapter);


        binding.search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filter(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.filtertext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.filter.getVisibility() == View.VISIBLE) {


                    TransitionManager.beginDelayedTransition(binding.filter, new AutoTransition());

                    binding.filter.setVisibility(View.GONE);

                    //imgnm.setImageResource(R.drawable.ic_down_foreground);

                } else {

                    TransitionManager.beginDelayedTransition(binding.filter, new AutoTransition());

                    binding.filter.setVisibility(View.VISIBLE);
                    binding.cardView6.setVisibility(View.GONE);
                  //  imgnm.setImageResource(R.drawable.ic_up_foreground);

                    binding.filtercancle.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {


                            if (binding.cardView6.getVisibility() == View.VISIBLE) {


                                TransitionManager.beginDelayedTransition(binding.cardView6, new AutoTransition());

                                binding.cardView6.setVisibility(View.GONE);
                               // imgnm.setImageResource(R.drawable.ic_down_foreground);

                            } else {

                                TransitionManager.beginDelayedTransition(binding.cardView6, new AutoTransition());

                                binding.cardView6.setVisibility(View.VISIBLE);
                                binding.filter.setVisibility(View.GONE);
                                //imgnm.setImageResource(R.drawable.ic_up_foreground);


                            }






                                                  }
                    });

                }


            }
        });




       return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding.getRoot();
    }
    private void filter(String text) {
        //new array list that will hold the filtered data
        ArrayList<Instructor_Model> filterdNames = new ArrayList<>();

        //looping through existing elements
        for (Instructor_Model s : instructor_modelArrayList) {
            //if the existing elements contains the search input
            if (s.getSubject().toLowerCase().contains(text.toLowerCase())) {
                //adding the element to filtered list
                filterdNames.add(s);
                instructor_adapter.filterList(filterdNames);
            }
        }


    }

}