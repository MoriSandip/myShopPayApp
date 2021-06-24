package com.example.learning.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.learning.Fragment.ChatFragment;
import com.example.learning.Fragment.CoureseFragment;
import com.example.learning.Fragment.HomeFragment;
import com.example.learning.Fragment.Profileragment;
import com.example.learning.Fragment.SearchFragment;
import com.example.learning.R;
import com.example.learning.databinding.ActivityDashboardBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {


    ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());




        getSupportFragmentManager().beginTransaction().replace(R.id.frg,new HomeFragment()).commit();

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId())
                {


                    case R.id.home:
                        fragment = new HomeFragment();

                        break;
                    case R.id.srch:
                        fragment = new SearchFragment();
                        break;
                    case R.id.courese:
                        fragment = new CoureseFragment();
                        break;
                    case R.id.msg:
                        fragment = new ChatFragment();
                        break;
                    case R.id.profile:
                        fragment = new Profileragment();
                        break;
                    default:



                }

                if(fragment!=null)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frg,fragment).commit();


                }
                return true;

            }


        });


    }
}