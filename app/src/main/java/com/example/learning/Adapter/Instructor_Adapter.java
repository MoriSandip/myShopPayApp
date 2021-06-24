package com.example.learning.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.Activity.Instructor_Profile;
import com.example.learning.Model.Instructor_Model;
import com.example.learning.R;
import com.example.learning.databinding.InstructorSampleLayoutBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;

public class Instructor_Adapter extends RecyclerView.Adapter<Instructor_Adapter.Instructor_ViewHolder>  {

ArrayList<Instructor_Model> instructor_modelArrayList;
//ArrayList<Instructor_Model> serchlist;

    public Instructor_Adapter(ArrayList<Instructor_Model> instructor_modelArrayList ) {
        this.instructor_modelArrayList = instructor_modelArrayList;
        //serchlist = new ArrayList<>();
       // serchlist.addAll(instructor_modelArrayList);

    }

    @NonNull
    @NotNull
    @Override
    public Instructor_ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new Instructor_ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.instructor_sample_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Instructor_ViewHolder holder, int position) {

       // holder.binding.imageView4.setImageResource(instructor_modelArrayList.get(position));

        holder.binding.imageView4.setImageResource(instructor_modelArrayList.get(position).getImg());
        holder.binding.textView2.setText(instructor_modelArrayList.get(position).getName());
        holder.binding.textView25.setText(instructor_modelArrayList.get(position).getSubject());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(), Instructor_Profile.class));
            }
        });

        Animation animation = AnimationUtils.loadAnimation(holder.itemView.getContext(), android.R.anim.slide_in_left);
        holder.itemView.setAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return instructor_modelArrayList.size();
    }

    public class Instructor_ViewHolder extends RecyclerView.ViewHolder {
        InstructorSampleLayoutBinding binding;
        public Instructor_ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            binding = InstructorSampleLayoutBinding.bind(itemView);
        }
    }
  /*  @Override
    public Filter getFilter() {
        return myFilter;
    }*/
   /* private Filter myFilter=new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<Instructor_Model> fRecords = new ArrayList<Instructor_Model>();

            if (constraint == null || constraint.length() == 0){
                fRecords.addAll(serchlist);

            }else {
                String searchString=constraint.toString().toLowerCase().trim();

                for (Instructor_Model s : serchlist) {
                    if (s.getSubject().toLowerCase().contains(searchString)) {
                        fRecords.add(s);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values=fRecords;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            instructor_modelArrayList.clear();
            instructor_modelArrayList.addAll((Collection<? extends Instructor_Model>) results.values);
            notifyDataSetChanged();
        }
    };*/
  public void filterList(ArrayList<Instructor_Model> filterdNames) {
     // instructor_modelArrayList.clear();
      this.instructor_modelArrayList = filterdNames;
      notifyDataSetChanged();
  }
}


