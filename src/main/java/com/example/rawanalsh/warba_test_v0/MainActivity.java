package com.example.rawanalsh.warba_test_v0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.support.v7.widget.Toolbar;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    private Button activity2button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        activity2button = (Button) findViewById(R.id.activity2_btn);
        activity2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");
        toolbar.setSubtitle("");
//        toolbar.setLogo(android.R.drawable.ic_menu_info_details);

        toolbar.setBackgroundColor(Color.parseColor("#8b8b8e"));

    }


    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
