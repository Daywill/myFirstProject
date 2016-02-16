package com.example.user.myfirstproject.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.myfirstproject.fragment.FirstFragment;

/**
 * Created by user on 14.02.2016.
 */
public class AdapterFragmentTabs extends FragmentPagerAdapter {
    String[] tabs;

    public AdapterFragmentTabs(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Первый",
                "Второй",
                "Третий",
                "Четвертый"
        };

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FirstFragment.getInstance();
            case 1:
                return FirstFragment.getInstance();
            case 2:
                return FirstFragment.getInstance();
            case 3:
                return FirstFragment.getInstance();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
