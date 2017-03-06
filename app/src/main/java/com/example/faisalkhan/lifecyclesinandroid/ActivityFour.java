package com.example.faisalkhan.lifecyclesinandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void startActivityOne(View view){
        startActivity(new Intent(this,ActivityFour.class));
    }

    public void startActivityTwo(View view){
        startActivity(new Intent(this,ActivityFour.class));
    }
}
