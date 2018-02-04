package com.slacoff.slacmedicaltracker;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by shere on 2018-02-03.
 */

public class IVPump extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        final ProgressDialog TempDialog;
        CountDownTimer CDT;
        int i =5;


        TempDialog = new ProgressDialog(IVPump.this);
        TempDialog.setMessage("Please wait..." + i + " sec");
        TempDialog.setCancelable(false);
        TempDialog.setProgress(i);
        TempDialog.show();

        CDT = new CountDownTimer(5000, 1000)
        {
            public void onTick(long millisUntilFinished)
            {
                TempDialog.setMessage("Please wait.." + i + " sec");
                i--;
            }

            public void onFinish()
            {
                TempDialog.dismiss();
                //Your Code ...
            }
        }.start();
        final Button button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                TextView t;
                t = (TextView) findViewById(R.id.display);
                if (v.getId()==R.id.increment){
                    int num = Integer.parseInt(t.toString())+1;
                    t.setText(num);

                }else if (v.getId()==R.id.decrement){
                    int num1 = Integer.parseInt(t.toString())-1;
                    if (num1>=0) {
                        t.setText(num1);
                    }
                }
            }
        });



    }
}
