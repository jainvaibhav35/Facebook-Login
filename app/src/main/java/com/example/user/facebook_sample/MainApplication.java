package com.example.user.facebook_sample;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by user on 21/1/16.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(this);
    }
}
