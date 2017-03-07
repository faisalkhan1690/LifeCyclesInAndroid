package com.example.faisalkhan.lifecyclesinandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * ActivityThree class to demonstrate activity life cycle change in code and play
 *
 * @author faisal khan
 */

public class ActivityThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }

    public void startActivity(View view){
        startActivity(new Intent(this,ActivityFour.class));
    }
}
