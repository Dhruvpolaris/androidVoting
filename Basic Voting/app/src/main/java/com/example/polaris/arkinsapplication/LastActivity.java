package com.example.polaris.arkinsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LastActivity extends AppCompatActivity {

    Button vote,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        vote=(Button)findViewById(R.id.voteBTN);
        result=(Button)findViewById(R.id.ViewResult);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoGirls=new Intent(getApplicationContext(),ResultActivity.class);
                startActivity(gotoGirls);
            }
        });


        vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoGirls=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(gotoGirls);
            }
        });

    }
}
