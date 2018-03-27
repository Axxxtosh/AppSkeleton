package com.uriahsolution.Skeleton.di.component;

import com.uriahsolution.Skeleton.di.ActivityScoped;
import com.uriahsolution.Skeleton.ui.Feature1.TestActivity;
import com.uriahsolution.Skeleton.ui.Feature1.TestModule;

import dagger.Component;

/**
 * Created by Ashutosh Makwana at Uriah Solution Pvt Ltd on 24-03-2018.
 */

@ActivityScoped
@Component(dependencies = AppComponent.class, modules = TestModule.class)
public interface ActivityComponent {

    void inject(TestActivity mainActivity);

}
