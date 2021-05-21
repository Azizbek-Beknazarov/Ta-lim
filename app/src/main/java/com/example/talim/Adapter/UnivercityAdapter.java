package com.example.talim.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.talim.Activity.FanActivity;
import com.example.talim.Model.UnivercityData;
import com.example.talim.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class UnivercityAdapter extends RecyclerView.Adapter<UnivercityAdapter.ViewHolder> {
    Context mContext;
    List<UnivercityData> mList = new ArrayList<>();

    public UnivercityAdapter(Context context, List<UnivercityData> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.uni_item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull UnivercityAdapter.ViewHolder holder, int position) {
        holder.mUni_name.setText(mList.get(position).getName_uni());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext.getApplicationContext(), FanActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void filterList(List<UnivercityData> univercityData) {
        univercityData = mList;
        notifyDataSetChanged();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mUni_name;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            mUni_name=itemView.findViewById(R.id.uni_tv);
        }
    }
}
