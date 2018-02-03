package com.slacoff.slac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;


public class AddItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
    }

    public void setTitle(String s){
        TextView tv = (TextView) findViewById(R.id.myTextViewInXml);
        tv.setText(s);
    }
}
