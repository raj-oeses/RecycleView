package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent message=getIntent();
        String nayapdf=message.getStringExtra("final");

        PDFView display= (PDFView) findViewById(R.id.display);
        display.fromAsset(nayapdf+".pdf").load();
    }
}