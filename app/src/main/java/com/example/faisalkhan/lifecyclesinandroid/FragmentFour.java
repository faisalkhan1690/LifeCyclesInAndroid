package com.example.faisalkhan.lifecyclesinandroid;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * FragmentFour class to demonstrate Fragment life cycle change in code and play
 *
 * @author faisal khan
 */
public class FragmentFour extends Fragment {


    private FragmentFour.IFragmentCallBack iFragmentCallBack;

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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment_four, container, false);
        View btn = view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iFragmentCallBack!=null){
                    iFragmentCallBack.fragmentFourCallBack();
                }
            }
        });
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        iFragmentCallBack=null;
    }

    /**
     * Fragment four callback interface
     */
    public interface IFragmentCallBack{
        void fragmentFourCallBack();
    }
}