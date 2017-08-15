package com.example.alinamurmur.myprojektiswork.other;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alinamurmur.myprojektiswork.DataForDelete.NewsData;
import com.example.alinamurmur.myprojektiswork.R;

import java.util.ArrayList;


public class AdapterDelMain extends RecyclerView
        .Adapter<AdapterDelMain
        .DataObjectHolder> {
    private ArrayList<NewsData> list;
    static int position =0;

    public static class DataObjectHolder extends RecyclerView.ViewHolder {
        TextView title,time;
        ImageView imageView;
        // LinearLayout linearLayout;

        public DataObjectHolder(final View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.textViewG);
            imageView = (ImageView)itemView.findViewById(R.id.imgG);
            time = (TextView)itemView.findViewById(R.id.time);
            //   linearLayout = (LinearLayout) itemView.findViewById(R.id.linearlayout);
        }


    }
    public AdapterDelMain(ArrayList<NewsData> myDataset) {
        list = myDataset;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardvig, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(v);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {

//        holder.title.setText(list.get(position).getTitle());
    //    holder.time.setText(list.get(position).getTime());
 //       holder.imageView.setImageResource(list.get(position).getImg());

    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public static int getPositionV(){
        int a=position;
        return a;
    }
}


