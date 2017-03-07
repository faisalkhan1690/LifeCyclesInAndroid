package com.example.faisalkhan.lifecyclesinandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * ActivityTwo class to demonstrate activity life cycle change in code and play
 *
 * @author faisal khan
 */
public class ActivityTwo extends AppCompatActivity {

    final String TAG=ActivityTwo.class.getSimpleName();
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate");
        setContentView(R.layout.activity_two);
        textView=(TextView) findViewById(R.id.tv_text);
        textView.setText("onCreate\n");
    }

    public void startActivity(View view){
        startActivity(new Intent(this,ActivityThree.class));
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
