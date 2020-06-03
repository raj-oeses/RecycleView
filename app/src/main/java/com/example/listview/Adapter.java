package com.example.listview;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


class SyllabusAdapter extends RecyclerView.Adapter<SyllabusAdapter.SyllabusViewHolder> {
    Context context;

    //  when data is entered ,, this function as adapter is going to convert data and show it on recycler view
    //
    private String data[];
    public SyllabusAdapter(String[] data){
        this.data=data;

    }

    @NonNull
    @Override

    // this will create the view
    // yesle cahi holder banauxa ,, jasma data halna sakixna

    public SyllabusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //we ll create a view
        //we use class called LayoutInfaltor
        //layout file ko euta object banayera retun garxa yesle

        LayoutInflater  inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_layout,parent,false);    //view is an object that contain the List_layout file
        return new SyllabusViewHolder(view);             //returning view
    }

    @Override
    public void onBindViewHolder(@NonNull SyllabusViewHolder holder, int position) {

        final String subject= data[position];
        holder.txtTitle.setText(subject);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    //        This is view Holder
    //        yesle chai aagadi ko holder ko format jahile ni retain garera rakhxa
    //        this will be recycled every thme
    //        Holder ma data haru change hudai garxa ra ho looping jasto aayerakhxa
    //        This is nested calss
    //                 Must extend to View Holder
    public class SyllabusViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtTitle;
        public SyllabusViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon=(ImageView)itemView.findViewById(R.id.imgIcon);
            txtTitle=(TextView) itemView.findViewById(R.id.txtTitle);

        }
    }
}
