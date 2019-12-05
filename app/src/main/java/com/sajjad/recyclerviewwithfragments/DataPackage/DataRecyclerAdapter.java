package com.sajjad.recyclerviewwithfragments.DataPackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sajjad.recyclerviewwithfragments.R;

import java.util.List;

public class DataRecyclerAdapter extends RecyclerView.Adapter<DataHolder> {

    private List<DataModel> dataModels;

    DataRecyclerAdapter(List<DataModel> dataModels) {
        this.dataModels = dataModels;
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_item, parent, false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataHolder holder, int position) {
        holder.id.setText(String.valueOf(dataModels.get(position).getId()));
        holder.age.setText(String.valueOf(dataModels.get(position).getAge()));
        holder.fullName.setText(dataModels.get(position).getFullName());
    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }
}
