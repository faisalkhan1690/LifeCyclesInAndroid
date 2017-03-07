package com.example.faisalkhan.lifecyclesinandroid;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * FragmentTwo class to demonstrate Fragment life cycle change in code and play
 *
 * @author faisal khan
 */
public class FragmentTwo extends Fragment {

    final String TAG=FragmentTwo.class.getSimpleName();

    private FragmentTwo.IFragmentCallBack iFragmentCallBack;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof IFragmentCallBack){
            iFragmentCallBack= (IFragmentCallBack) context;
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof IFragmentCallBack){
            iFragmentCallBack= (IFragmentCallBack) activity;
        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG,"onCreateView");
        View view=inflater.inflate(R.layout.fragment_fragment_two, container, false);
        View btn = view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iFragmentCallBack!=null){
                    iFragmentCallBack.fragmentTwoCallBack();
                }
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG,"onActivityCreated");
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e(TAG,"onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG,"onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG,"onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG,"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG,"onDetach");
        iFragmentCallBack=null;
    }

    /**
     * Fragment two callback interface
     */
    public interface IFragmentCallBack{
        void fragmentTwoCallBack();
    }
}