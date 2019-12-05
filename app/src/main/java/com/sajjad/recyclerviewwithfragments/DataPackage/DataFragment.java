package com.sajjad.recyclerviewwithfragments.DataPackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sajjad.recyclerviewwithfragments.R;

import java.util.ArrayList;
import java.util.List;

public class DataFragment extends Fragment {

    private List<DataModel> dataModels;
    private DataRecyclerAdapter dataRecyclerAdapter;
    private RecyclerView dataRecycler;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.data_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        dataRecycler = view.findViewById(R.id.dataRecycler);
        layoutManager = new LinearLayoutManager(getContext());
        dataRecycler.setLayoutManager(layoutManager);
        //
        dataModels = getData();
        dataRecyclerAdapter = new DataRecyclerAdapter(dataModels);
        dataRecycler.setAdapter(dataRecyclerAdapter);
    }

    private List<DataModel> getData() {
        List<DataModel> temp = new ArrayList<>();
        temp.add(new DataModel(1, 30, "Sajjad Mohammed"));
        temp.add(new DataModel(2, 24, "Ahmed Jabbar"));
        temp.add(new DataModel(3, 25, "Sameer Sami"));
        temp.add(new DataModel(4, 30, "Aya Ahmed"));
        temp.add(new DataModel(5, 30, "Suha Ahmed"));
        return temp;
    }
}