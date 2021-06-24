package com.example.learning.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.example.learning.databinding.FavouriteSampleLayoutBinding;

import org.jetbrains.annotations.NotNull;

public class Favourite_Adapter extends RecyclerView.Adapter<Favourite_Adapter.Favourite_Viewholder> {
    int[] img;

    public Favourite_Adapter(int[] img)
    {
        this.img = img;
    }

    @NonNull
    @NotNull
    @Override
    public Favourite_Viewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new Favourite_Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.favourite_sample_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Favourite_Viewholder holder, int position) {

        holder.binding.imageView32.setImageResource(img[position]);

    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class Favourite_Viewholder extends RecyclerView.ViewHolder {
        FavouriteSampleLayoutBinding binding;
        public Favourite_Viewholder(@NonNull @NotNull View itemView) {
            super(itemView);
            binding = FavouriteSampleLayoutBinding.bind(itemView);
        }
    }
}
