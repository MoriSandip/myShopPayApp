package com.example.learning.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.learning.Fragment.AboutFragment;
import com.example.learning.Fragment.ContaintFragment;
import com.example.learning.Fragment.DiscussFragment;

import org.jetbrains.annotations.NotNull;

public class Tab_Adapter  extends FragmentPagerAdapter {



    public Tab_Adapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0: return new AboutFragment();
            case 1: return new ContaintFragment();
            case 2: return new DiscussFragment();

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
