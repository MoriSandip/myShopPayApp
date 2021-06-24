package com.example.learning.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.Activity.Chats;
import com.example.learning.Model.User;
import com.example.learning.R;
import com.example.learning.databinding.UserlistSampleBinding;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    int[] img;

    public UserAdapter(int[] img) {
        this.img = img;
    }

   /* Context context;
   // ArrayList<User> users;*/

   /* public UserAdapter(Context context*//*, ArrayList<User> users*//*) {
        this.context = context;
     //   this.users = users;
    }*/

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.userlist_sample, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
       // User user = users.get(position);
      //  holder.binding.textView.setText(user.getUsername());

        // Glide.with(context).load(user.getImg()).placeholder(R.drawable.user_foreground).into(holder.binding.imageView);

        holder.binding.imageView.setImageResource(img[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* Intent intent = new Intent(context, ChatApp.class);

                intent.putExtra("name",user.getUsername());

                intent.putExtra("uid",user.getUid());

                intent.putExtra("img",user.getImg());

                context.startActivity(intent);*/

                holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(), Chats.class));

            }
        });

        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.logo_animation);
        holder.itemView.setAnimation(animation);
    }

    @Override
    public int getItemCount() {
       // return users.size();

        return img.length;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {


        UserlistSampleBinding binding;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = UserlistSampleBinding.bind(itemView);
        }
    }
}