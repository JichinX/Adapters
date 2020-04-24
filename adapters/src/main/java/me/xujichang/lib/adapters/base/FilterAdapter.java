package me.xujichang.lib.adapters.base;

import android.widget.Filter;
import android.widget.Filterable;

import androidx.recyclerview.widget.RecyclerView;

public class FilterAdapter<T, VH extends RecyclerView.ViewHolder> extends BaseAdapter<T, VH> implements Filterable {

    @Override
    public Filter getFilter() {
        return null;
    }
}
