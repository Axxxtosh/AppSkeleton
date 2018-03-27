package com.uriahsolution.Skeleton;

import android.app.Application;

import com.uriahsolution.Skeleton.di.component.AppComponent;

import dagger.android.DaggerApplication;

/**
 * Created by Uriah Solution Pvt Ltd on 24-03-2018.
 */

public class MyApp extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();



        }
}
