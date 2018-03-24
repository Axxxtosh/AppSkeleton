package com.uriahsolution.Skeleton.di.component;

import android.app.Application;
import android.content.Context;

import com.uriahsolution.Skeleton.MyApp;
import com.uriahsolution.Skeleton.data.SharedPrefsHelper;
import com.uriahsolution.Skeleton.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ashutosh Makwana at Uriah Solution Pvt Ltd on 24-03-2018.
 */


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApp myApp);

    Context getContext();

    Application getApplication();

    SharedPrefsHelper getPreferenceHelper();

}
