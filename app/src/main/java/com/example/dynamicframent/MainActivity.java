package com.example.dynamicframent;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.dynamicframent.dummy.ApiWebInterface;
import com.example.dynamicframent.dummy.ResponseData;
import com.example.dynamicframent.dummy.RestClient;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;

public class MainActivity extends AppCompatActivity {

    ViewPager mViewPager;
    ViewPagerAdapter mAdapter;
    List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loggedDeviceList();

    }

    public void loggedDeviceList() {
        Log.i("AppCompare:- url ", ApiWebInterface.BASE_URL + ApiWebInterface.USER_LOGGED_DEVICES + "/" + "33");
        ApiWebInterface service = RestClient.getClient();
        Call<ResponseData> call = service.userDevices("33");


        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Response<ResponseData> response) {
                try {
                    if (response.isSuccess()) {
                        Log.e("hello", "hhhhhhhhhh");
                        ResponseData mResponseBody = response.body();

                        if (mResponseBody.getResponse().get(0).getStatus().equals("1")) {
                            System.out.println("mResponseBody = " + mResponseBody.getResponse().get(0).getData().get(0).getDeviceApp().size());
                            Constant.FRAGMENT_COUNT = mResponseBody.getResponse().get(0).getData().get(0).getDeviceApp().size();
                            fragments = buildFragment(mResponseBody.getResponse().get(0).getData().get(0).getDeviceApp());
                            mAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
                            mViewPager = (ViewPager) findViewById(R.id.pager);
                            mViewPager.setAdapter(mAdapter);
                        }


                    } else {
                        System.out.println("response error = " + response.errorBody());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });
    }


    private List<Fragment> buildFragment(List<ResponseData.Response.DeviceApp> deviceApp) {


        List<Fragment> fragment = new ArrayList<>();

        for (int i = 0; i < deviceApp.size(); i++) {
            Bundle b = new Bundle();
            b.putParcelableArrayList("list", (ArrayList<? extends Parcelable>) deviceApp.get(i).getAllApp());
            fragment.add(new DemoFragment().instantiate(this, new DemoFragment().getClass().getName(), b));
        }

        return fragment;
    }

}
