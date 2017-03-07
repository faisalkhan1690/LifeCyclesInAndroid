package com.example.faisalkhan.lifecyclesinandroid;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class FragmentMainActivity extends AppCompatActivity implements FragmentOne.IFragmentCallBack,
        FragmentTwo.IFragmentCallBack,FragmentThree.IFragmentCallBack,FragmentFour.IFragmentCallBack{


    private FragmentManager mFragmentManager;
    private Fragment fragmentOne;
    private Fragment fragmentTwo;
    private Fragment fragmentThree;
    private Fragment fragmentFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);
        mFragmentManager=getFragmentManager();

        fragmentOne=new FragmentOne();
        fragmentTwo=new FragmentTwo();
        fragmentThree=new FragmentThree();
        fragmentFour=new FragmentFour();

        mFragmentManager.beginTransaction().add(R.id.fr_layout, fragmentOne).commit();

    }

    @Override
    public void fragmentOneCallBack() {
        mFragmentManager.beginTransaction().replace(R.id.fr_layout, fragmentTwo).addToBackStack("One").commit();
    }

    @Override
    public void fragmentTwoCallBack() {
        mFragmentManager.beginTransaction().replace(R.id.fr_layout, fragmentThree).addToBackStack("Two").commit();
    }

    @Override
    public void fragmentThreeCallBack() {
        mFragmentManager.beginTransaction().replace(R.id.fr_layout, fragmentFour).addToBackStack("Three").commit();
    }

    @Override
    public void fragmentFourCallBack() {
        getFragmentManager().popBackStack("One",0);
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}
