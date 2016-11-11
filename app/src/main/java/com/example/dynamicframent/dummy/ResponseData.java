package com.example.dynamicframent.dummy;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

/**
 * Created by root on 11/11/16.
 */




@Generated("org.jsonschema2pojo")
public class ResponseData {

    @SerializedName("response")
    @Expose
    private List<Response> response = new ArrayList<Response>();

    /**
     *
     * @return
     * The response
     */
    public List<Response> getResponse() {
        return response;
    }

    /**
     *
     * @param response
     * The response
     */
    public void setResponse(List<Response> response) {
        this.response = response;
    }

    @Generated("org.jsonschema2pojo")
    public class Response {

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("data")
        @Expose
        private List<Datum> data = new ArrayList<Datum>();

        /**
         *
         * @return
         * The status
         */
        public String getStatus() {
            return status;
        }

        /**
         *
         * @param status
         * The status
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         *
         * @return
         * The data
         */
        public List<Datum> getData() {
            return data;
        }

        /**
         *
         * @param data
         * The data
         */
        public void setData(List<Datum> data) {
            this.data = data;
        }

        @Generated("org.jsonschema2pojo")
        public class AllApp implements Parcelable {

            @SerializedName("id")
            @Expose
            private String id;
            @SerializedName("user_id")
            @Expose
            private String userId;
            @SerializedName("device_id")
            @Expose
            private String deviceId;
            @SerializedName("device_name")
            @Expose
            private String deviceName;
            @SerializedName("app_name")
            @Expose
            private String appName;
            @SerializedName("app_version")
            @Expose
            private String appVersion;
            @SerializedName("app_install_on")
            @Expose
            private String appInstallOn;
            @SerializedName("added_on")
            @Expose
            private String addedOn;
            @SerializedName("app_link")
            @Expose
            private String appLink;

            /**
             *
             * @return
             * The id
             */
            public String getId() {
                return id;
            }

            /**
             *
             * @param id
             * The id
             */
            public void setId(String id) {
                this.id = id;
            }

            /**
             *
             * @return
             * The userId
             */
            public String getUserId() {
                return userId;
            }

            /**
             *
             * @param userId
             * The user_id
             */
            public void setUserId(String userId) {
                this.userId = userId;
            }

            /**
             *
             * @return
             * The deviceId
             */
            public String getDeviceId() {
                return deviceId;
            }

            /**
             *
             * @param deviceId
             * The device_id
             */
            public void setDeviceId(String deviceId) {
                this.deviceId = deviceId;
            }

            /**
             *
             * @return
             * The deviceName
             */
            public String getDeviceName() {
                return deviceName;
            }

            /**
             *
             * @param deviceName
             * The device_name
             */
            public void setDeviceName(String deviceName) {
                this.deviceName = deviceName;
            }

            /**
             *
             * @return
             * The appName
             */
            public String getAppName() {
                return appName;
            }

            /**
             *
             * @param appName
             * The app_name
             */
            public void setAppName(String appName) {
                this.appName = appName;
            }

            /**
             *
             * @return
             * The appVersion
             */
            public String getAppVersion() {
                return appVersion;
            }

            /**
             *
             * @param appVersion
             * The app_version
             */
            public void setAppVersion(String appVersion) {
                this.appVersion = appVersion;
            }

            /**
             *
             * @return
             * The appInstallOn
             */
            public String getAppInstallOn() {
                return appInstallOn;
            }

            /**
             *
             * @param appInstallOn
             * The app_install_on
             */
            public void setAppInstallOn(String appInstallOn) {
                this.appInstallOn = appInstallOn;
            }

            /**
             *
             * @return
             * The addedOn
             */
            public String getAddedOn() {
                return addedOn;
            }

            /**
             *
             * @param addedOn
             * The added_on
             */
            public void setAddedOn(String addedOn) {
                this.addedOn = addedOn;
            }

            /**
             *
             * @return
             * The appLink
             */
            public String getAppLink() {
                return appLink;
            }

            /**
             *
             * @param appLink
             * The app_link
             */
            public void setAppLink(String appLink) {
                this.appLink = appLink;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {

            }
        }

        @Generated("org.jsonschema2pojo")
        public class Datum {

            @SerializedName("device_name")
            @Expose
            private List<String> deviceName = new ArrayList<String>();
            @SerializedName("device_id")
            @Expose
            private List<String> deviceId = new ArrayList<String>();
            @SerializedName("device_app")
            @Expose
            private List<DeviceApp> deviceApp = new ArrayList<DeviceApp>();

            /**
             *
             * @return
             * The deviceName
             */
            public List<String> getDeviceName() {
                return deviceName;
            }

            /**
             *
             * @param deviceName
             * The device_name
             */
            public void setDeviceName(List<String> deviceName) {
                this.deviceName = deviceName;
            }

            /**
             *
             * @return
             * The deviceId
             */
            public List<String> getDeviceId() {
                return deviceId;
            }

            /**
             *
             * @param deviceId
             * The device_id
             */
            public void setDeviceId(List<String> deviceId) {
                this.deviceId = deviceId;
            }

            /**
             *
             * @return
             * The deviceApp
             */
            public List<DeviceApp> getDeviceApp() {
                return deviceApp;
            }

            /**
             *
             * @param deviceApp
             * The device_app
             */
            public void setDeviceApp(List<DeviceApp> deviceApp) {
                this.deviceApp = deviceApp;
            }

        }

        @Generated("org.jsonschema2pojo")
        public class DeviceApp {

            @SerializedName("all_app")
            @Expose
            private List<AllApp> allApp = new ArrayList<AllApp>();

            /**
             *
             * @return
             * The allApp
             */
            public List<AllApp> getAllApp() {
                return allApp;
            }

            /**
             *
             * @param allApp
             * The all_app
             */
            public void setAllApp(List<AllApp> allApp) {
                this.allApp = allApp;
            }

        }

    }

}

