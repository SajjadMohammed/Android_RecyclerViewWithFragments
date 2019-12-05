package com.sajjad.recyclerviewwithfragments.DataPackage;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sajjad.recyclerviewwithfragments.R;

class DataHolder extends RecyclerView.ViewHolder {
    TextView id, age, fullName;

    DataHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.dataId);
        age = itemView.findViewById(R.id.dataAge);
        fullName = itemView.findViewById(R.id.dataName);
    }
}
