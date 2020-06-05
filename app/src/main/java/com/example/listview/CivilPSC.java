package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.GestureDescription;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class CivilPSC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_p_s_c);

        Storage str=new Storage();
        //String[][] subjects={{"Building-First Paper","Building-First Paper"},{"General-First Paper","General-First Paper"},{"Highway-First Paper","Highway-First Paper"},{"Hydrology-First Paper","Hydrology-First Paper"},{"Hydropower-First Paper","Hydropower-First Paper"},{"Irrigation-First Paper","Irrigation-First Paper"},{"Mining-First Paper","Mining-First Paper"},{"Sanitary-First Paper","Sanitary-First Paper"}};
        final ListView listView=findViewById(R.id.lstviewcivil);
        Intent message=getIntent();
        int pos1=message.getIntExtra("position",0);
        listView.setAdapter(new CustomListAdaptere(this,str.Civil(pos1)));
    }
}