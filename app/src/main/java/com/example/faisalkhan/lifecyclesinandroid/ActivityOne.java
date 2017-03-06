package com.example.faisalkhan.lifecyclesinandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    final String TAG=ActivityOne.class.getSimpleName();
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate");
        setContentView(R.layout.activity_one);
        textView=(TextView) findViewById(R.id.tv_text);
        textView.setText("onCreate\n");
    }

    public void startActivity(View view){
        startActivity(new Intent(this,ActivityTwo.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStart");
        textView.setText("onStart\n");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");
        textView.setText("onResume\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart");
        textView.setText("onRestart\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause");
        textView.setText("onPause\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop");
        textView.setText("onStop\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy");
        textView.setText("onDestroy\n");
    }
}
