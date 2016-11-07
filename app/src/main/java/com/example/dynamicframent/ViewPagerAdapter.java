package com.example.dynamicframent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by root on 10/5/16.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragment;
    String[] title = new String[]{"fragment1,fragment2", "fragment3", "fragment4", "fragment5", "fragment6",
            "fragment7", "fragment8", "fragment9", "fragment11"};

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> fragment) {
        super(fm);
        this.fragment = fragment;
    }

    @Override
    public Fragment getItem(int position) {

        return fragment.get(position);
    }

    @Override
    public int getCount() {
        return Constant.FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
