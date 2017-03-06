package com.example.faisalkhan.lifecyclesinandroid;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentThree extends Fragment {

    private FragmentThree.IFragmentCallBack iFragmentCallBack;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof FragmentOne.IFragmentCallBack){
            iFragmentCallBack= (FragmentThree.IFragmentCallBack) context;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_one, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        iFragmentCallBack=null;
    }

    public void addFragment(View view){
        if(iFragmentCallBack!=null){
            iFragmentCallBack.fragmentThreeCallBack();
        }
    }

    public interface IFragmentCallBack{
        void fragmentThreeCallBack();
    }

}