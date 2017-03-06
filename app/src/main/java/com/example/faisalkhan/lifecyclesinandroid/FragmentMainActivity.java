package com.example.faisalkhan.lifecyclesinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class FragmentMainActivity extends AppCompatActivity implements FragmentOne.IFragmentCallBack,
        FragmentTwo.IFragmentCallBack,FragmentThree.IFragmentCallBack,FragmentFour.IFragmentCallBack{


    private FrameLayout mFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);

        mFrameLayout=(FrameLayout) findViewById(R.id.fr_layout);

    }

    @Override
    public void fragmentOneCallBack() {
    }

    @Override
    public void fragmentTwoCallBack() {

    }

    @Override
    public void fragmentThreeCallBack() {

    }

    @Override
    public void fragmentFourCallBack() {

    }
}
