package com.uriahsolution.Skeleton.ui.Feature1;

import android.app.Activity;
import android.content.Context;

import com.uriahsolution.Skeleton.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ashutosh Makwana at Uriah Solution Pvt Ltd on 24-03-2018.
 */

@Module
public class TestModule {

    private Activity mActivity;

    public TestModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }


}