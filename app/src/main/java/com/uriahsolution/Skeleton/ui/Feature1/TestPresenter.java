package com.uriahsolution.Skeleton.ui.Feature1;

import javax.annotation.Nullable;

/**
 * Created by Ashutosh Makwana at Uriah Solution Pvt Ltd on 24-03-2018.
 */

public class TestPresenter implements TestContract.Presenter {

    @Nullable
    private TestContract.View testView;


    public void takeView(TestContract.View view) {
        testView=view;

    }

    @Override
    public void dropView() {
        testView=null;

    }
}
