package com.example.dynamicframent.dummy;


import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by root on 21/9/16.
 */
public interface ApiWebInterface {
    public static final String BASE_URL = "http://webmobsoft.com/testing_API/home/";

    public static final String REGISTER = "/register?";
    public static final String LOGIN = "/login?";
    public static final String FORGOT_PASSWORD = "/getPassword?";
    public static final String SHARE_APPLICATIONS = "/sendMail?";
    public static final String UPLOAD_APPLICATIONS = "/addDeviceApps?";
    public static final String ALL_DEVICES = "/getMyAllDevice?";
    public static final String SAVE_POINT = "/makeSavePoint?";
    public static final String GET_SAVE_POINTS = "/getSavepointName?";
    public static final String GET_SAVE_POINTS_APPS = "/getSavePointApps?";
    public static final String DELETE_SAVE_POINT= "/deleteSavePoint?";
    public static final String USER_LOGGED_DEVICES= "getDeviceApps_anil?";

    // 1).
    /* For Register a new user
    *   Url="http://webmobsoft.com/testing_API/home/register?"
    *   @Field("name")
    *   @Field("email")
    *   @Field("password")
    *   @Field("device_id")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + REGISTER)
    Call<ResponseData> signup(@Field("name") String mName,
                              @Field("email") String mEmail,
                              @Field("password") String mPassword,
                              @Field("device_id") String mDevice_id
    );


    // 2).
    /* For Login to exiting user
    *   Url="http://webmobsoft.com/testing_API/home//login?"
    *   @Field("email")
    *   @Field("password")
    *   @Field("device_id")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + LOGIN)
    Call<ResponseData> login(@Field("email") String email,
                             @Field("password") String password,
                             @Field("device_id") String device_id
    );


    // 3).
    /* For get forgot password
    * Url="http://webmobsoft.com/testing_API/home/getPassword?"
    * @Field("email")
    * @Field("device_id")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + FORGOT_PASSWORD)
    Call<ResponseData> forgot(@Field("email") String email,
                              @Field("device_id") String device_id
    );


    // 4).
    /* For share applications using email address
    * Url="http://webmobsoft.com/testing_API/home/sendMail?"
    * @Field("user_id")
    * @Field("subject")
    * @Field("to")
    * @Field("app")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + SHARE_APPLICATIONS)
    Call<ResponseData> share(@Field("user_id") String user_id,
                             @Field("subject") String subject,
                             @Field("to") String receiverAddress,
                             @Field("app") String application
    );


    // 5).
    /* For store all applications installed by user on server
    * Url="http://webmobsoft.com/testing_API/home/addDeviceApps?"
    * @Field("user_id")
    * @Field("device_id")
    * @Field("app_name")
    * @Field("app_image")
    * @Field("app_version")
    * @Field("app_install_on")
    * @Field("app_link")
    * @Field("device_name")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + UPLOAD_APPLICATIONS)
    Call<ResponseData> uploads(
            @Field("user_id") String user_id,
            @Field("device_id") String device_id,
            @Field("app_name") String app_name,
            @Field("app_image") String app_image,
            @Field("app_version") String app_version,
            @Field("app_install_on") String app_install_on,
            @Field("app_link") String app_link,
            @Field("device_name") String device_name
    );


    // 6).
    /* For store all applications installed by user on server
    * Url="http://webmobsoft.com/testing_API/home/getMyAllDevice?"
    * @Field("user_id")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + ALL_DEVICES)
    Call<ResponseData> get_devices(
            @Field("user_id") String user_id
    );


    // 7).
    /* For store all applications which are installed at present
    * Url="http://webmobsoft.com/testing_API/home/getMyAllDevice?"
    * @Field("user_id")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + SAVE_POINT)
    Call<ResponseData> savepoint(
            @Field("user_id") String user_id,
            @Field("device_id") String device_id,
            @Field("app_name") String app_name,
            @Field("app_image") String app_image,
            @Field("app_version") String app_version,
            @Field("app_install_on") String app_install_on,
            @Field("app_link") String app_link
    );


    // 8).
    /* For get all save points of applications according to saving Date
    * Url="http://webmobsoft.com/testing_API/home/getSavepointName?"
    * @Field("user_id")
    * @Field("device_id")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + GET_SAVE_POINTS)
    Call<ResponseData> getSavepoint(
            @Field("user_id") String user_id,
            @Field("device_id") String device_id

    );


    // 9).
    /* For get all applications of a particular save point
    * Url="http://webmobsoft.com/testing_API/home/getSavePointApps?"
    * @Field("user_id")
    * @Field("device_id")
    * @Field("savepoint_name")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + GET_SAVE_POINTS_APPS)
    Call<ResponseData> getSavepointApps(
            @Field("user_id") String user_id,
            @Field("device_id") String device_id,
            @Field("savepoint_name") String savepoint_name

    );


    // 10).
    /* For get all applications of a particular save point
    * Url="http://webmobsoft.com/testing_API/home/getSavePointApps?"
    * @Field("user_id")
    * @Field("device_id")
    * @Field("savepoint_name")
    * */
    @FormUrlEncoded
    @POST(BASE_URL + DELETE_SAVE_POINT)
    Call<ResponseData> deleteSavepoint(
            @Field("user_id") String user_id,
            @Field("device_id") String device_id,
            @Field("savepoint_name") String savepoint_name

    );

    // 11).
    /* For get all logged devices of a particular user
    * Url="http://webmobsoft.com/testing_API/home/getDeviceApps?"
    * @Field("user_id")
    * */
    @FormUrlEncoded
    @POST(USER_LOGGED_DEVICES)
    Call<ResponseData> userDevices(
            @Field("user_id") String user_id
    );


}
