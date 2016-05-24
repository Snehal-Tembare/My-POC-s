package com.example.synerzip.picassodemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by synerzip on 24/5/16.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<AndroidVersion> androidVersions;
    private Context context;
    public DataAdapter(Context context,ArrayList<AndroidVersion> androidVersions){
        this.context=context;
        this.androidVersions=androidVersions;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(androidVersions.get(position).getAndroid_verison_name());

        //--To load image usin Picasso Library
//        Picasso.with(context).load(androidVersions.get(position).getAandroid_image_url()).resize(200,100).into(holder.imageView);

        //---To rotate Image
//        Picasso.with(context).load(androidVersions.get(position).getAandroid_image_url()).rotate(90f).into(holder.imageView);
//        Picasso.with(context).load(androidVersions.get(position).getAandroid_image_url()).rotate(45f,200f,100f).into(holder.imageView);

//        Picasso.with(context).load(androidVersions.get(position).getAandroid_image_url()).fit();
//        Picasso.with(context).load(androidVersions.get(position).getAandroid_image_url()).resize(200,200).centerInside().into(holder.imageView);
        Picasso.with(context).load(androidVersions.get(position).getAandroid_image_url()).resize(200,200).centerCrop().into(holder.imageView);

        Picasso.with(context).load(androidVersions.get(position).getAandroid_image_url()).transform(new BlurTransformation(context)).into(holder.imageView);
    }



    @Override
    public int getItemCount() {
        return androidVersions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textView=(TextView)itemView.findViewById(R.id.name);
            imageView=(ImageView)itemView.findViewById(R.id.image_view);
        }
        @Override
        public void onClick(View v) {
          //Log.v("Clicked Item no "+this.getLayoutPosition(), (String) textView.getText());
//            Toast.makeText("Clicked",Toast.LENGTH_LONG).show();
        }
    }
}
