package com.example.learning.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.example.learning.databinding.CourcSampleLayoutBinding;

import org.jetbrains.annotations.NotNull;

public class CoureseAdapter extends RecyclerView.Adapter<CoureseAdapter.CoureseViewHolder> {

    int[] img;
    String[] title;
    String[] price;

    public CoureseAdapter(int[] img, String[] title, String[] price) {
        this.img = img;
        this.title = title;
        this.price = price;
    }

    @NonNull
    @NotNull
    @Override
    public CoureseViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new CoureseViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.courc_sample_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CoureseViewHolder holder, int position) {

        holder.binding.corsimg.setImageResource(img[position]);
        holder.binding.corsprice.setText(price[position]);
        holder.binding.corstitle.setText(title[position]);

        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.base_slide_left_out);
        holder.itemView.setAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class CoureseViewHolder extends RecyclerView.ViewHolder {

        CourcSampleLayoutBinding binding;
        public CoureseViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            binding = CourcSampleLayoutBinding.bind(itemView);
        }
    }
}
