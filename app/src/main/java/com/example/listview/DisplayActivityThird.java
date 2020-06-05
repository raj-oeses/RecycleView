package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class DisplayActivityThird extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_third);
        Storage str=new Storage();

        //final String[][][] pdffile={{{"Operations Engineer","Senior Technical Officer"}},{{"Operations Engineer"}},{{"Senior Technical Officer","Senior Technician"}},{{"Civil Ovearseer"},{"Civil Level-4","Civil Level-5","Civil Level-7"},{"First Paper","Second Paper"},{"Building","General","Highway","Hydrology","Hydropower","Irrigation","Mining","Sanitary"}},{{"Computer Engineering Level 7"},{"Computer Engineering Level 7"},{"First Paper","Second Paper"},{"Assistant Computer Engineering Level-5","Computer Engineering Level-6"},{"First Paper","Second Paper"}},{{"Level 3","Level 4","Level 5","Level 7"},{"First Paper","Second Paper"},{"Assistant Technician","Electrical Engineering","Senior Assistant Technician"},{"First Paper","Second Paper"}},{{"Electical Enigneering"},{"First Paper","Second Paper"},{"Assistant Technical","Electronic Engineer","Senior Assistant Technician"},{"First Paper","Second Paper"}}};
        final ListView listView=findViewById(R.id.lstview3);


        Intent message=getIntent();
        //final int  pos=message.getIntExtra();
        final int pos2=message.getIntExtra("finalpdffile",0);
        final int pos1=message.getIntExtra("position",0);

        //listView.setAdapter(new CustomListAdaptere(this,pdffile[pos1][pos2]));
        listView.setAdapter(new CustomListAdaptere(this,str.DisplayThird(pos1,pos2)));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (pos2!=3) {
                    Intent display = new Intent(getApplicationContext(), DisplayActivity.class);
                    //display.putExtra("finalpdffile", position);
                    Storage str = new Storage();

                    display.putExtra("final", str.PdfFile(pos1, pos2, position));
                    Toast.makeText(getApplicationContext(), str.PdfFile(pos1, pos2, position), Toast.LENGTH_SHORT).show();

                    startActivity(display);
                }
                else{
                    Intent display = new Intent(getApplicationContext(), CivilPSC.class);
                    Storage str = new Storage();
                    display.putExtra("position", position);

                    startActivity(display);

                }




            }
        });
    }
}