package com.franceskoly.menuprincipalconfragment.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.franceskoly.menuprincipalconfragment.R;
import com.franceskoly.menuprincipalconfragment.modelos.Postre;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostreAdapter extends RecyclerView.Adapter<PostreAdapter.PostreViewHolder>{

    ArrayList<Postre> listPostre;
    Context context;

    public PostreAdapter(ArrayList<Postre> listPostre, Context context) {
        this.listPostre = listPostre;
        this.context = context;
    }

    @NonNull
    @Override
    public PostreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context myContexto = parent.getContext();
        int IdLayoutName = R.layout.item_listpostre;
        boolean attachParentRapido = false;

        LayoutInflater inflater = LayoutInflater.from(myContexto);
        View view = inflater.inflate(IdLayoutName,parent,attachParentRapido);

        PostreViewHolder holder = new PostreViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostreViewHolder holder, int position) {
        Glide.with(context).load("https://okdiario.com/img/recetas/2017/02/08/macarrones-con-chorizo.jpg").into(holder.food_image);
        holder.name_of_food.setText(listPostre.get(position).getFood_name());
    }

    @Override
    public int getItemCount() {
        return listPostre.size();
    }

    class PostreViewHolder extends RecyclerView.ViewHolder{

        ImageView food_image;
        TextView name_of_food;

        public PostreViewHolder(@NonNull View itemView) {
            super(itemView);

            food_image = (ImageView) itemView.findViewById(R.id.food_imgview);
            name_of_food = (TextView) itemView.findViewById(R.id.name_tv);
        }
    }
}
