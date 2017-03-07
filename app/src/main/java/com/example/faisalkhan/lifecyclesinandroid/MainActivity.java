package com.example.faisalkhan.lifecyclesinandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A sample project to study how does activity and fragment life cycle works
 *
 * @author faisal khan
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.lv_item);
        List<String> listData=new ArrayList<>();
        listData.add("Activity");
        listData.add("Fragment");


        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listData));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        //Start intent to ActivityOne activity to study activity life cycle
                        startActivity(new Intent(MainActivity.this,ActivityOne.class));
                        break;

                    case 1:
                        //Start intent to FragmentMainActivity activity to study life cycle
                        startActivity(new Intent(MainActivity.this,FragmentMainActivity.class));
                        break;
                }
            }
        });

    }
}
