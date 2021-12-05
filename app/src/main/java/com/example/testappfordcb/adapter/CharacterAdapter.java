package com.example.testappfordcb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.testappfordcb.R;
import com.example.testappfordcb.model.Characters;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {
    private final Context context;
    ArrayList<Characters> characterArrayList;

public CharacterAdapter(Context context,ArrayList<Characters> characterArrayList){

    this.context = context;
    this.characterArrayList = characterArrayList;

}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list,parent,false);


    return new ViewHolder(view) ;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         Characters characters = characterArrayList.get(position);
         holder.textView.setText(characters.getName());

        Glide.with(context).
                load(characters.getImage()).
                into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return characterArrayList.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{
    private final ImageView imageView;
    private final TextView textView;
    //private final TextView textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView =itemView.findViewById(R.id.name);


        }
    }
}
