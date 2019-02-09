package com.example.rawanalsh.warba_test_v0;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Activity2Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_details);

        TextView tvTitle_detail = (TextView) findViewById(R.id.tvTitle_detail);

        Toolbar toolbar_1 = (Toolbar)findViewById(R.id.toolbar_1);

        setSupportActionBar(toolbar_1);
        getSupportActionBar().setTitle("Details");
        toolbar_1.setSubtitle("");
//        toolbar.setLogo(android.R.drawable.ic_menu_info_details);
        toolbar_1.setBackgroundColor(Color.parseColor("#8b8b8e"));
        toolbar_1.setTitleTextColor(Color.WHITE);
        toolbar_1.setSubtitleTextColor(Color.WHITE);


        Bundle bundle = getIntent().getExtras();

        if ( bundle != null ){
            tvTitle_detail.setText(bundle.getString("title"));
            toolbar_1.setSubtitle((String)bundle.get("title"));
        }
    }
}
