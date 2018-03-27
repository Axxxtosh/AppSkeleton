package com.uriahsolution.Skeleton.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.uriahsolution.Skeleton.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ashutosh Makwana at Uriah Solution Pvt Ltd on 24-03-2018.
 */

@Module
public class AppModule {

    private final Application mApplication;

    public AppModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPrefs(Context app) {
        return app.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }
}