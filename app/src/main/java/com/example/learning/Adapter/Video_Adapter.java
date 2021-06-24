package com.example.learning.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.Activity.VideoDetails;
import com.example.learning.R;
import com.example.learning.databinding.VideoSampleLayoutBinding;

import org.jetbrains.annotations.NotNull;

public class Video_Adapter extends RecyclerView.Adapter<Video_Adapter.VideoViewHolder> {
    String[] title;

    public Video_Adapter(String[] title) {
        this.title = title;
    }

    @NonNull
    @NotNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new VideoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.video_sample_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull VideoViewHolder holder, int position) {

        holder.binding.titleVideo.setText(title[position]);

         holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(),VideoDetails.class));
            }
        });
        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.pro_animation);
        holder.itemView.setAnimation(animation);


    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder {
        VideoSampleLayoutBinding binding;
        public VideoViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            binding = VideoSampleLayoutBinding.bind(itemView);
        }
    }
}
