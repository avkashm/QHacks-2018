package com.slacoff.slac;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public String itemChoice = " ";

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Hospital Equipment Tracker");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            //}
            //public void buttonClicked(View view){
                if (view.getId()==R.id.button){
                    goToSecondActivity();
                    setTitle("IV PUMP");
                    itemChoice = "IV PUMP";
                }else if (view.getId()==R.id.button2){
                    goToSecondActivity();
                    setTitle("HEART MONITOR");
                    itemChoice = "HEART MONITOR";
                } else if (view.getId()==R.id.button3){
                    goToSecondActivity();
                    setTitle("C");
                    itemChoice = "C";
                } else if (view.getId()==R.id.button4){
                    goToSecondActivity();
                    setTitle("D");
                    itemChoice = "D";
                }
            }
        });
    }

    private void goToSecondActivity(){
        Intent intent = new Intent(this, AddItem.class);
        startActivity(intent);
    }
}
