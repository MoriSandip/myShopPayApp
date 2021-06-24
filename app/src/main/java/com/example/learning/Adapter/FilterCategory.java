package com.example.learning.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.example.learning.databinding.FiltercategoryBinding;

import org.jetbrains.annotations.NotNull;

public class FilterCategory extends RecyclerView.Adapter<FilterCategory.FilterCategoryViewHolder> {


    int[] img;

    public FilterCategory(int[] img) {
        this.img = img;
    }

    @NonNull
    @NotNull
    @Override
    public FilterCategoryViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new FilterCategoryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.filtercategory,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FilterCategoryViewHolder holder, int position) {

        holder.binding.imageView4.setImageResource(img[position]);
        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), android.R.anim.slide_in_left);
        holder.itemView.setAnimation(animation);


    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class FilterCategoryViewHolder extends RecyclerView.ViewHolder {
        FiltercategoryBinding binding;
        public FilterCategoryViewHolder(@NonNull @NotNull View itemView) {

            super(itemView);
            binding = FiltercategoryBinding.bind(itemView);
        }
    }
}
