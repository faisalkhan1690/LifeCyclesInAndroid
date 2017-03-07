package com.example.faisalkhan.lifecyclesinandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * ActivityFour class to demonstrate activity life cycle change in code and play
 *
 * @author faisal khan
 */

public class ActivityFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    //start activity from back stack without calling on create
    public void startActivityOne(View view){
        Intent intent=new Intent(this,ActivityTwo.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    //start activity from back stack with calling on create
    public void startActivityTwo(View view){
        Intent intent=new Intent(this,ActivityTwo.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
