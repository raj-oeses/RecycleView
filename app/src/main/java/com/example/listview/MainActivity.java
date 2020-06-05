package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.btn1);
        Button btn2=(Button)findViewById(R.id.btn2);
        Button btn3=(Button)findViewById(R.id.btn3);
        Button btn4=(Button)findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String pdffiles[]={"Operations Engineer","Senior Technical Officer"};
        switch(v.getId()){
            case R.id.btn1:
                Intent  display=new Intent(this,DisplayActivity.class);
                display.putExtra("final",pdffiles[0]);
                startActivity(display);
                break;
            case R.id.btn2:
                Intent  display2=new Intent(this,DisplayActivity.class);
                display2.putExtra("final",pdffiles[1]);
                startActivity(display2);
                break;
            case R.id.btn3:
                Intent  display3=new Intent(this,BTn3.class);
                startActivity(display3);
                break;
            case R.id.btn4:
                Intent  display4=new Intent(this,Listviewpractise.class);
                startActivity(display4);
                break;
        }
    }
}