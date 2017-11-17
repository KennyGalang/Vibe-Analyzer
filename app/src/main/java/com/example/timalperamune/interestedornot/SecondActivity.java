package com.example.timalperamune.interestedornot;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ProgressBar pgL;

    ProgressBar angB;
    ProgressBar disB;
    ProgressBar fearB;
    ProgressBar joyB;
    ProgressBar sadB;
    TextView likeT;
    TextView angT;
    TextView disT;
    TextView fearT;
    TextView joyT;
    TextView sadT;
    TextView decision;

    TextView tvL;
    int fife = 54;

    Button stats;

    Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        stats = (Button)findViewById(R.id.stats);
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double ang = MainActivity.angerAvg;
                double dis = MainActivity.disgustAvg;
                double fear = MainActivity.fearAvg;
                double joy = MainActivity.joyAvg;
                double sad= MainActivity.sadnessAvg;

                decision = (TextView)findViewById(R.id.grats);
                tvL = (TextView)findViewById(R.id.textView4); //Does SHE LIKE YOU?

                pgL = (ProgressBar)findViewById(R.id.progressBarL);////////////////////////////////////////
                if(joy>50){
                    decision.setText("CONGRATS! They do!");
                }else{
                    decision.setText("They don't.");
                }
                likeT = (TextView)findViewById(R.id.textView4);

                angB = (ProgressBar)findViewById(R.id.progressBar2);
                disB = (ProgressBar)findViewById(R.id.progressBar5);
                fearB = (ProgressBar)findViewById(R.id.progressBarFear);
                joyB= (ProgressBar)findViewById(R.id.progressBar1);
                sadB=(ProgressBar)findViewById(R.id.progressBar3);

                angT= (TextView)findViewById(R.id.textView10);
                disT = (TextView)findViewById(R.id.textView14);
                fearT = (TextView)findViewById(R.id.textView5);
                joyT= (TextView)findViewById(R.id.Number1);
                sadT= (TextView)findViewById(R.id.Number2);


                int aInt = (int) ang;
                int dInt = (int) dis;
                int fInt = (int) fear;
                int sInt = (int) sad;

//                Log.i("UH..WTF", Double.toString(joy));
                int intJ = (int) joy;
//                Log.i("WTF", Integer.toString(intMe));
                angB.setProgress(aInt);
                disB.setProgress(dInt);
                fearB.setProgress(fInt);
                sadB.setProgress(sInt);
                joyB.setProgress(intJ);


                pgL.setProgress(intJ);                    //For now

                angT.setText(("%" + Integer.toString(aInt)));
                disT.setText(("%" + Integer.toString(dInt)));
                fearT.setText(("%" + Integer.toString(fInt)));
                joyT.setText(("%" + Integer.toString(intJ)));
                sadT.setText(("%" + Integer.toString(sInt)));



            }
        });


//        sadB = (ProgressBar)findViewById(R.id.progressBarL);












        bt2 = (Button) findViewById(R.id.back);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });


    }
}
