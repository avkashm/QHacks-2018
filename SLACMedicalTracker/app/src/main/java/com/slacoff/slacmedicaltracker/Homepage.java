package com.slacoff.slacmedicaltracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        final Button button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (v.getId()==R.id.button){
                    goToIVPump();
                }else if (v.getId()==R.id.button2){
                    goToHeartMonitor();

                }else if(v.getId()==R.id.button3){
                    goToAED();

                }else if (v.getId() == R.id.button4){
                    goToXray();
                }

            }
        });
    }

    private void goToIVPump(){
        Intent intent= new Intent(this, IVPump.class);
        startActivity(intent);
    }
}
