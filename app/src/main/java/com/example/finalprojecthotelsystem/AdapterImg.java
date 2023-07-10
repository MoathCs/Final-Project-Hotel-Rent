package com.example.finalprojecthotelsystem;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterImg
        extends RecyclerView.Adapter<AdapterImg.ViewHolder>{

    private String[] captions;
    private int[] imageIds;

    public AdapterImg(String[] captions, int[] imageIds){
        this.captions = captions;
        this.imageIds = imageIds;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //Equip cardview in run time and convert from xml to object
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.cardimag,
                parent,
                false);

        // this method build card ui just in runtime
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) { // This method fills the data
        CardView cardView = holder.cardView;
        ImageView imageView = cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(dr);
        TextView txt = (TextView)cardView.findViewById(R.id.txtName);
        txt.setText(captions[position]);
        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){


            }
        });
    }

    @Override
    public int getItemCount() {  //count num of item return
        return captions.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}
