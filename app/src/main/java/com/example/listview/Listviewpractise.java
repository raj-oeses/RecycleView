package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listviewpractise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewpractise);
        Storage stg=new Storage();

        String[] subject=stg.engineering();

        //final String[] subject = {"Aeronautical Engineering", "Architect Engineer","Automobile Engineering","Civil Engineering","Computer Engineering","Electrical Engineering","Electronics Engineering","IT Engineering","Mechanical Engineering"};
        //final String[] Aeronautical={"Airlines"};

        ///final String[][] subsubject = {{"Airlines"},{"NTC"},{"Airlines"},{"ADBL","NEA","NTC","PSC"},{"Airlines","NEA","NTC","NTV","PSC"}};
        //final String[][][] pdffile={{{"OperationsEngineer.pdf"},{"SeniorTechnicalOfficer.pdf"},{"OperationsEngineer.pdf"}}};
        ListView ls = findViewById(R.id.lstview);

        //CustomListAdaptere customListAdaptere= new CustomListAdaptere(getApplicationContext(),subject);
        //ls.setAdapter(customListAdaptere);
        // ls.setAdapter(adapter);
        //  Normall ma default vako adapter use huntheyo
        //  since we have made our own adapter we are using this


        ls.setAdapter(new CustomListAdaptere(this,subject));


        // now we are going for the onClickListener
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent display=new Intent(getApplicationContext(),DisplayActivitySecond.class);
                //String refrence=ref.engineering(position);


                //display.putExtra("file",pdffile[position]);
                //display.putExtra("pdf",subsubject[position]);

                display.putExtra("position",position);

                startActivity(display);
            }
        });





    }
}