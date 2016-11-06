package com.example.dynamicframent;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by root on 4/11/16.
 */

public class DemoModal implements  Parcelable {


    String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
