package com.example.user.myfirstproject.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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
                "Третий"
        };

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                break;
            case 1:
                break;

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
