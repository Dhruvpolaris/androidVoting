package com.example.polaris.arkinsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static  int ashay=0;
    public static  int sunny=0;
    public static  int aman=0;
    public static  int sameer=0;
    public static  int anzar=0;
    public static  int sanket=0;
    public static  int arshdeep=0;
    public static  int srisha=0;
    public static  int anukruti=0;
    public static  int sadhana=0;
    public static  int shraddha=0;
    public static  int afeefa=0;
    public static  int shruti=0;
    public static  int akila=0;
    public static  int tanya=0;
    public static  int sunanda=0;
    public static  int divya=0;
    public static  int reshma=0;
    public static  int bhoomika=0;
    public static  int sai=0;

    Button submit,result;
    RadioGroup rg1,rg2;
    RadioButton boysVote,girlsVote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1=(RadioGroup)findViewById(R.id.radio_group);

        rg2=(RadioGroup)findViewById(R.id.radio_group_girls);

        submit=(Button)findViewById(R.id.submit_vote);
        result=(Button)findViewById(R.id.ViewResult);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId1=rg1.getCheckedRadioButtonId();
                boysVote=(RadioButton)findViewById(selectedId1);
//                Toast.makeText(MainActivity.this,boysVote.getText(),Toast.LENGTH_SHORT).show();

                Toast toast = Toast.makeText(getApplicationContext(), "Vote Registered :" + boysVote.getText(), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

                switch (selectedId1)
                {
                    case 2131492947:
                        ashay++;
                        break;
                    case 2131492948:
                        sunny++;
                        break;
                    case 2131492949:
                        aman++;
                        break;
                    case 2131492950:
                        sameer++;
                        break;
                    case 2131492951:
                        anzar++;
                        break;
                    case 2131492952:
                        sanket++;
                        break;
                    case 2131492953:
                        arshdeep++;
                        break;
                    case 2131492954:
                        srisha++;
                        break;
                }

                int selectedId2=rg2.getCheckedRadioButtonId();
                girlsVote=(RadioButton)findViewById(selectedId2);
//                Toast.makeText(MainActivity.this,girlsVote.getText(),Toast.LENGTH_SHORT).show();

                Toast toast2 = Toast.makeText(getApplicationContext(), "Vote Registered :"+girlsVote.getText(), Toast.LENGTH_SHORT);
                toast2.setGravity(Gravity.CENTER, 0, 0);
                toast2.show();

                switch (selectedId2)
                {
                    case 2131492956:
                        anukruti++;
                        break;
                    case 2131492957:
                        sadhana++;
                        break;
                    case 2131492958:
                        shraddha++;
                        break;
                    case 2131492959:
                        afeefa++;
                        break;
                    case 2131492960:
                        shruti++;
                        break;
                    case 2131492961:
                        akila++;
                        break;
                    case 2131492962:
                        tanya++;
                        break;
                    case 2131492963:
                        sunanda++;
                        break;
                    case 2131492964:
                        divya++;
                        break;
                    case 2131492965:
                        reshma++;
                        break;
                    case 2131492966:
                        bhoomika++;
                        break;
                    case 2131492967:
                        sai++;
                        break;
                }

            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent sendStuff = new Intent(getApplicationContext(), ResultActivity.class);
                sendStuff.putExtra("ashay", "Ashay : "+ashay+" votes");
                sendStuff.putExtra("sunny", "Sunny : "+sunny+" votes");
                sendStuff.putExtra("aman", "Aman : "+aman+" votes");
                sendStuff.putExtra("sameer", "Sameer : "+sameer+" votes");
                sendStuff.putExtra("anzar", "Anzar : "+anzar+" votes");
                sendStuff.putExtra("sanket", "Sanket : "+sanket+" votes");
                sendStuff.putExtra("arshdeep", "Arshdeep : "+arshdeep+" votes");
                sendStuff.putExtra("srisha", "Srisha : "+srisha+" votes");
                sendStuff.putExtra("anukriti", "Anukriti : "+anukruti+" votes");
                sendStuff.putExtra("sadhana", "Sadhana : "+sadhana+" votes");
                sendStuff.putExtra("shraddha", "Shraddha : "+shraddha+" votes");
                sendStuff.putExtra("afeefa", "Afeefa : "+afeefa+" votes");
                sendStuff.putExtra("shruti", "Shruti : "+shruti+" votes");
                sendStuff.putExtra("akila", "Akila : "+akila+" votes");
                sendStuff.putExtra("tanya", "tanya : "+tanya+" votes");
                sendStuff.putExtra("sunanda", "Sunanda : "+sunanda+" votes");
                sendStuff.putExtra("divya", "Divya : "+divya+" votes");
                sendStuff.putExtra("reshma", "Reshma : "+reshma+" votes");
                sendStuff.putExtra("bhoomika", "Bhoomika : "+bhoomika+" votes");
                sendStuff.putExtra("sai", "Sai : "+sai+" votes");

                startActivity(sendStuff);

            }
        });

    }
}
