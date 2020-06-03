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

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String pdffiles[]={"OperationsEngineer.pdf","SeniorTechnicalOfficer.pdf"};
        switch(v.getId()){
            case R.id.btn1:
                Intent  display=new Intent(this,DisplayActivity.class);
                display.putExtra("forntc",pdffiles[0]);
                startActivity(display);
                break;
            case R.id.btn2:
                Intent  display1=new Intent(this,DisplayActivity.class);
                display1.putExtra("forntc",pdffiles[1]);
                startActivity(display1);
                break;
            case R.id.btn3:
                Intent  display2=new Intent(this,BTn3.class);
                startActivity(display2);
                break;
        }
    }
}