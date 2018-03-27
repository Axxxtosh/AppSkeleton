package com.uriahsolution.Skeleton.ui.Feature1;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import com.uriahsolution.Skeleton.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ashutosh Makwana at Uriah Solution Pvt Ltd on 24-03-2018.
 */

@Module
public class TestModule {

    private Activity mActivity;
    private TestFragment testFragment;

    public TestModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity()
    {
        return mActivity;
    }

    @Provides
    Fragment provideTestFragment(){

        return new TestFragment();
    }


}