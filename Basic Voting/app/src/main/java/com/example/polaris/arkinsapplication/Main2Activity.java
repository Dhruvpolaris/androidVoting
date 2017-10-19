package com.example.polaris.arkinsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button submit;
    RadioGroup rg1;
    RadioButton girlsVote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rg1=(RadioGroup)findViewById(R.id.radio_group);


        submit=(Button)findViewById(R.id.girls_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId=rg1.getCheckedRadioButtonId();
                girlsVote=(RadioButton)findViewById(selectedId);
                Toast.makeText(Main2Activity.this, girlsVote.getText(), Toast.LENGTH_SHORT).show();

                switch (selectedId)
                {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                }

                Intent gotoGirls=new Intent(getApplicationContext(),LastActivity.class);
                startActivity(gotoGirls);

            }
        });
    }
}
