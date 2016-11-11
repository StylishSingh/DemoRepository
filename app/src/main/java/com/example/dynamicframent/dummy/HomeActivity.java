package com.example.dynamicframent.dummy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.dynamicframent.R;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;

public class HomeActivity extends AppCompatActivity {

    Response[] mResponse;

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

                        System.out.println("mResponseBody = " + mResponseBody.getResponse().get(0).getData().get(0).getDeviceApp().size());

                    } else {
                        System.out.println("response error = " + response.errorBody());
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });
    }


}
