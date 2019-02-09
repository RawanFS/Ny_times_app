package com.example.rawanalsh.warba_test_v0;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {


    private static final String TAG = "Activity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
//        log.d(TAG, "onCreate: Started. ");

        final ListView mListView = (ListView) findViewById(R.id.ListView);

        Toolbar toolbar_0 = (Toolbar)findViewById(R.id.toolbar_0);


        //dummy
        New N_00 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_01 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_02 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_03 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_04 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_05 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_06 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_07 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_08 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_09 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_10 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");
        New N_11 = new New("Supporters of The Democratic candidates Jon Ossoft after his  ", "David Leaonhart and Stuart A. Thompson", "2017-06-23");

        ArrayList<New> newsList = new ArrayList<>();
        newsList.add(N_00);
        newsList.add(N_01);
        newsList.add(N_02);
        newsList.add(N_03);
        newsList.add(N_05);
        newsList.add(N_06);
        newsList.add(N_07);
        newsList.add(N_08);
        newsList.add(N_09);
        newsList.add(N_10);
        newsList.add(N_11);


//        ArrayAdapter adapter = new ArrayAdapter();
        NewsListAdapter adapter = new NewsListAdapter(this,R.layout.adapter_view_layout, newsList);
        mListView.setAdapter(adapter);



        setSupportActionBar(toolbar_0);

        getSupportActionBar().setTitle("NY Times Most Popular");
        toolbar_0.setSubtitle("");
//        toolbar.setLogo(android.R.drawable.ic_menu_info_details);
        toolbar_0.setBackgroundColor(Color.parseColor("#8b8b8e"));
        toolbar_0.setTitleTextColor(Color.WHITE);



        //
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Activity2.this, Activity2Details.class);
                intent.putExtra("title", mListView.getItemAtPosition(i).toString());
//                intent.putExtra("title", ((String) mListView.getItemAtPosition(i)));
                startActivity(intent);
            }
        });


    }
}
