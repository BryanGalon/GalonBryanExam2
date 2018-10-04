package com.galon.bryan.galonbryanexam1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GalonBryanExam1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galon_bryan_exam1);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.button){
            i = new Intent(this, Screen2.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610358, 120.991895"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }
    }
}
