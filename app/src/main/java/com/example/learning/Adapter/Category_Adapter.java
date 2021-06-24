package com.example.learning.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.example.learning.databinding.CategorySampleLayoutBinding;

import org.jetbrains.annotations.NotNull;

public class Category_Adapter extends RecyclerView.Adapter<Category_Adapter.Category_Viewholder> {
    int[] img;
    String[] title;

    public Category_Adapter(int[] img, String[] title) {
        this.img = img;
        this.title = title;
    }

    @NonNull
    @NotNull
    @Override
    public Category_Viewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new Category_Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.category_sample_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Category_Viewholder holder, int position) {

        holder.binding.imageView4.setImageResource(img[position]);
        holder.binding.textView2.setText(title[position]);

        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), android.R.anim.slide_in_left);
        holder.itemView.setAnimation(animation);


    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class Category_Viewholder extends RecyclerView.ViewHolder {
        CategorySampleLayoutBinding binding;
        public Category_Viewholder(@NonNull @NotNull View itemView) {
            super(itemView);
            binding = CategorySampleLayoutBinding.bind(itemView);
        }
    }
}
