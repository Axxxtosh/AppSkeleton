package com.uriahsolution.Skeleton.di.component;

import android.app.Application;
import android.content.Context;

import com.uriahsolution.Skeleton.MyApp;
import com.uriahsolution.Skeleton.data.SharedPrefsHelper;
import com.uriahsolution.Skeleton.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ashutosh Makwana at Uriah Solution Pvt Ltd on 24-03-2018.
 */


@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MyApp myApp);

    Context getContext();

    Application getApplication();

    SharedPrefsHelper getPreferenceHelper();

}
