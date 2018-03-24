package com.uriahsolution.Skeleton.ui.Feature1;

import com.uriahsolution.Skeleton.BasePresenter;
import com.uriahsolution.Skeleton.BaseView;

/**
 * Created by Ashutosh Makwana at Uriah Solution Pvt Ltd on 24-03-2018.
 */

public class TestContract {


        interface View extends BaseView<Presenter> {

            void showProcess();
            void hieProcess();




        }

        interface Presenter extends BasePresenter<View> {


            void takeView(TestContract.View view);
            void dropView();
        }

}
