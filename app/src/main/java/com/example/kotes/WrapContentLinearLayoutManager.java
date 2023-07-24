package com.example.kotes;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class WrapContentLinearLayoutManager extends StaggeredGridLayoutManager {
    public WrapContentLinearLayoutManager(Context context) {
        super(2, StaggeredGridLayoutManager.VERTICAL);
    }


    @Override
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            Log.e("TAG", "in RecyclerView");
        }
    }
}