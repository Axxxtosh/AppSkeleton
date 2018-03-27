package com.uriahsolution.Skeleton.di.component;

import com.uriahsolution.Skeleton.di.module.NetModule;

import dagger.Component;

/**
 * Created by Ashutosh Makwana at Uriah Solution Pvt Ltd on 24-03-2018.
 */

@Component(modules={AppComponent.class,NetModule.class})
public interface NetComponent {



}
