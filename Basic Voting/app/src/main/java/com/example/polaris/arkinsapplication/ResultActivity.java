package com.example.polaris.arkinsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    EditText user,pass;
    Button Finalresult;
    ScrollView scrollView;

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);
        t7=(TextView)findViewById(R.id.textView7);
        t8=(TextView)findViewById(R.id.textView8);
        t9=(TextView)findViewById(R.id.textView9);
        t10=(TextView)findViewById(R.id.textView10);
        t11=(TextView)findViewById(R.id.textView11);
        t12=(TextView)findViewById(R.id.textView12);
        t13=(TextView)findViewById(R.id.textView13);
        t14=(TextView)findViewById(R.id.textView14);
        t15=(TextView)findViewById(R.id.textView15);
        t16=(TextView)findViewById(R.id.textView16);
        t17=(TextView)findViewById(R.id.textView17);
        t18=(TextView)findViewById(R.id.textView18);
        t19=(TextView)findViewById(R.id.textView19);
        t20=(TextView)findViewById(R.id.textView20);

        scrollView=(ScrollView)findViewById(R.id.scrollId);
        user=(EditText)findViewById(R.id.ResultUsername);
        pass=(EditText)findViewById(R.id.ResultPass);
        Finalresult=(Button)findViewById(R.id.getResult);
        Finalresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(user.getText().toString().equals("DP") && pass.getText().toString().equals("dhruv"))
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Welcome ADMIN", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();

                     scrollView.setVisibility(View.VISIBLE);
                     user.setVisibility(View.GONE);
                    pass.setVisibility(View.GONE);
                    Finalresult.setVisibility(View.GONE);

                    Bundle bundle = getIntent().getExtras();

                    String message1 = bundle.getString("ashay");
                    t1.setText(message1);

                    String message2 = bundle.getString("sunny");
                    t2.setText(message2);

                    String message3 = bundle.getString("aman");
                    t3.setText(message3);

                    String message4 = bundle.getString("sameer");
                    t4.setText(message4);

                    String message5 = bundle.getString("anzar");
                    t5.setText(message5);

                    String message6 = bundle.getString("sanket");
                    t6.setText(message6);

                    String message7 = bundle.getString("arshdeep");
                    t7.setText(message7);

                    String message8 = bundle.getString("srisha");
                    t8.setText(message8);

                    String message9 = bundle.getString("anukriti");
                    t9.setText(message9);

                    String message10 = bundle.getString("sadhana");
                    t10.setText(message10);

                    String message11 = bundle.getString("afeefa");
                    t11.setText(message11);

                    String message12 = bundle.getString("shruti");
                    t12.setText(message12);

                    String message13 = bundle.getString("akila");
                    t13.setText(message13);

                    String message14 = bundle.getString("tanya");
                    t14.setText(message14);

                    String message15 = bundle.getString("sunanda");
                    t15.setText(message15);

                    String message16 = bundle.getString("divya");
                    t16.setText(message16);

                    String message17 = bundle.getString("reshma");
                    t17.setText(message17);

                    String message18 = bundle.getString("bhoomika");
                    t18.setText(message18);

                    String message19 = bundle.getString("sai");
                    t19.setText(message19);

                    String message20 = bundle.getString("shraddha");
                    t20.setText(message20);


                }

                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Invalid Credentials, Contact administrator!", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }

            }
        });

    }
}
