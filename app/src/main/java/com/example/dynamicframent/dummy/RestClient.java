package com.example.dynamicframent.dummy;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;


/**
 * Created by root on 21/9/16.
 */
public class RestClient {
    private static ApiWebInterface gitApiInterface;

    public static ApiWebInterface getClient() {
        OkHttpClient okClient = new OkHttpClient();
        okClient.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Response response = chain.proceed(chain.request());
                return response;
            }
        });

        Retrofit client = new Retrofit.Builder()
                .baseUrl("http://webmobsoft.com/testing_API/home/")
                .addConverter(String.class, new ToStringConverter())
                .client(okClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        gitApiInterface = client.create(ApiWebInterface.class);

        return gitApiInterface;

    }
}
