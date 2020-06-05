package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BTn3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_tn3);
        //     typecasting of the list view
        //     layout manager cahi ,,kasari view define garne vanne ho
        //     yeha cahi linear tarika le define garya xa

        String[] subjects={"OperationsEngineer.pdf","SeniorTechnicalOfficer.pdf"};
        RecyclerView list=(RecyclerView)findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new SyllabusAdapter(subjects));
    }
}