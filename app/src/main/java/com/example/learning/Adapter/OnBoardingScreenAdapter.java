package com.example.learning.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.learning.Fragment.ScreenOne;
import com.example.learning.Fragment.ScreenThree;
import com.example.learning.Fragment.ScreenTwo;

import org.jetbrains.annotations.NotNull;

public class OnBoardingScreenAdapter extends FragmentPagerAdapter {
    public OnBoardingScreenAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new ScreenOne();
            case 1:
                return new ScreenTwo();
            case 2:
                return new ScreenThree();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
