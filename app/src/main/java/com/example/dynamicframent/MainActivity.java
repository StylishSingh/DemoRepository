package com.example.dynamicframent;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager mViewPager;
    ViewPagerAdapter mAdapter;
    List<DemoModal> categories = new ArrayList<>();
    List<DemoModal> subCategories = new ArrayList<>();
    List<Fragment> fragments ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 10; i++) {
            DemoModal modal = new DemoModal();

            modal.setFirstName("Fruits: " + i);
            categories.add(modal);
        }

        for (int i = 0; i < 10; i++) {
            DemoModal modal = new DemoModal();

            modal.setFirstName("Vegetables: " + i);

            subCategories.add(modal);
        }


        Constant.FRAGMENT_COUNT = 10;
        fragments = buildFragment();


        mAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mAdapter);

    }


    private List<Fragment> buildFragment() {

        List<Fragment> fragment = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Bundle b = new Bundle();
            if (i % 2 == 0)
                b.putParcelableArrayList("list", (ArrayList<? extends Parcelable>) categories);
            else
                b.putParcelableArrayList("list", (ArrayList<? extends Parcelable>) subCategories);
            fragment.add(new DemoFragment().instantiate(this,new DemoFragment().getClass().getName(),b));

        }

        return fragment;
    }

}
