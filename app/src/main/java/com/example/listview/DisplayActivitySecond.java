package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DisplayActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_second);
        final ListView listView=findViewById(R.id.lstview2);
        Storage str= new Storage();

        //final String[][] subsubject = {{"Airlines"},{"NTC"},{"Airlines"},{"ADBL","NEA","NTC","PSC"},{"Airlines","NEA","NTC","NTV","PSC"},{"NEA","NTC","NTV","PSC"},{"Airlines","NTC","NTV","PSC"}};
        //final String[][] pdffile={{"Operations Engineer","Senior Technical Officer"},{"Operations Engineer"}};
        /*Bundle bundle=getIntent().getExtras();
        String[] sub=bundle.getStringArray("pdf");*/
        Intent message=getIntent();
        //String[] sub=message.getStringArrayExtra("pdf");
        //String[] pdf=message.getStringArrayExtra("pdffilename");



        //int postion=message.getIntArrayExtra("position");
        final int pos1=message.getIntExtra("position",0);

        //listView.setAdapter(new CustomListAdaptere(this,subsubject[pos]));
        //listView.setAdapter(new CustomListAdaptere(this,subsubject[pos1]));
        listView.setAdapter(new CustomListAdaptere(this,str.SubSubjects(pos1)));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent display=new Intent(getApplicationContext(),DisplayActivityThird.class);
                display.putExtra("finalpdffile",position);
                display.putExtra("position",pos1);

                startActivity(display);

            }
        });
    }
}