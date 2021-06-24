package com.example.learning.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.Model.Containt_List_Model;
import com.example.learning.R;
import com.example.learning.databinding.ContaintListBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Containt_List_Adapter extends RecyclerView.Adapter<Containt_List_Adapter.Containt_List_ViewHolder> {

    ArrayList<Containt_List_Model> containt_list_models;

    public Containt_List_Adapter(ArrayList<Containt_List_Model> containt_list_models) {
        this.containt_list_models = containt_list_models;
    }

    @NonNull
    @NotNull
    @Override
    public Containt_List_ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new Containt_List_ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.containt_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Containt_List_ViewHolder holder, int position) {

        holder.binding.listnumber.setText(containt_list_models.get(position).getNumber());
        holder.binding.titleVideo.setText(containt_list_models.get(position).getTitle());
        holder.binding.time.setText(containt_list_models.get(position).getTime());


        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.pro_animation);
        holder.itemView.setAnimation(animation);


    }

    @Override
    public int getItemCount() {
        return containt_list_models.size();
    }

    public class Containt_List_ViewHolder extends RecyclerView.ViewHolder {
        ContaintListBinding binding;
        public Containt_List_ViewHolder(@NonNull @NotNull View itemView) {


            super(itemView);
            binding = ContaintListBinding.bind(itemView);
        }
    }
}
