package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class CustomListAdaptere extends BaseAdapter {
    private final Context context;
    private final String[] names;
    private final LayoutInflater layoutInflater;

    public CustomListAdaptere(Context context,String[] names){
        this.context=context;
        this.names=names;
        this.layoutInflater= (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view=layoutInflater.inflate(R.layout.listlayout,null);
        TextView txt=view.findViewById(R.id.font);
        txt.setText(names[position]);

        return view;
    }
}
