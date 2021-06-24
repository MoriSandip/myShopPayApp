package com.example.learning.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.Activity.FrndProfile;
import com.example.learning.R;
import com.example.learning.databinding.FrndBinding;

import org.jetbrains.annotations.NotNull;

public class Friends_List_Adapter  extends RecyclerView.Adapter<Friends_List_Adapter.Friends_List_ViewHolder> {
    int[] img;

    public Friends_List_Adapter(int[] img) {
        this.img = img;
    }

    @NonNull
    @NotNull
    @Override
    public Friends_List_ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new Friends_List_ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.frnd,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Friends_List_ViewHolder holder, int position) {
holder.binding.imageView35.setImageResource(img[position]);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(), FrndProfile.class));
            }
        });
        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.pro_animation);
        holder.itemView.setAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class Friends_List_ViewHolder extends RecyclerView.ViewHolder {
        FrndBinding binding;
        public Friends_List_ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            binding = FrndBinding.bind(itemView);
        }
    }
}
