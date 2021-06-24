package com.example.learning.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.R;
import com.example.learning.databinding.TaskTotalBinding;

import org.jetbrains.annotations.NotNull;

public class task_adapter extends RecyclerView.Adapter<task_adapter.task_viewholder> {
    String[] title;

    public task_adapter(String[] title) {
        this.title = title;
    }

    @NonNull
    @NotNull
    @Override
    public task_viewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new task_viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.task_total,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull task_viewholder holder, int position) {


        holder.binding.titleTask.setText(title[position]);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class task_viewholder extends RecyclerView.ViewHolder {

        TaskTotalBinding binding;
        public task_viewholder(@NonNull @NotNull View itemView) {
            super(itemView);

            binding = TaskTotalBinding.bind(itemView);
        }
    }
}
