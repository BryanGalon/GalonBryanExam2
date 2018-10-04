package com.galon.bryan.galonbryanexam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.btn1){
            i = new Intent(this, GalonBryanExam1.class);
            startActivity(i);
        }
    }
}
