package com.example.faisalkhan.lifecyclesinandroid;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

/**
 * FragmentMainActivity class to demonstrate Fragment life cycle change in code and play
 *
 * @author faisal khan
 */

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

        //add first fragment
        mFragmentManager.beginTransaction().add(R.id.fr_layout, fragmentOne).commit();

    }

    @Override
    public void fragmentOneCallBack() {
        //replace first fragment
        mFragmentManager.beginTransaction().replace(R.id.fr_layout, fragmentTwo).addToBackStack("One").commit();
    }

    @Override
    public void fragmentTwoCallBack() {
        //replace second fragment
        mFragmentManager.beginTransaction().replace(R.id.fr_layout, fragmentThree).addToBackStack("Two").commit();
    }

    @Override
    public void fragmentThreeCallBack() {
        //replace third fragment
        mFragmentManager.beginTransaction().replace(R.id.fr_layout, fragmentFour).addToBackStack("Three").commit();
    }

    @Override
    public void fragmentFourCallBack() {
        //pop second fragment  from back stack forcefully
        getFragmentManager().popBackStack("One",0);
    }

    @Override
    public void onBackPressed() {
        //pop fragment from back stack if available in back stack
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}
