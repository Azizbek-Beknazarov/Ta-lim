package com.example.talim.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.talim.Activity.KursDetailActivity;
import com.example.talim.Model.FanData;
import com.example.talim.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FanAdapter extends RecyclerView.Adapter<FanAdapter.ViewHolder> {
    Context mContext;
    List<FanData> mFanlarData;

    public FanAdapter(Context context, List<FanData> fanlarData) {
        mContext = context;
        mFanlarData = fanlarData;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_fan,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FanAdapter.ViewHolder holder, int position) {
        holder.mTextView_fan_nomi.setText(mFanlarData.get(position).getFan_nomi());
        holder.mTextView_uqituvchi.setText(mFanlarData.get(position).getUqituvchi_ismi());
        holder.reklama_image.setImageResource(mFanlarData.get(position).getImageUrl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext, KursDetailActivity.class);
                intent.putExtra("fan",mFanlarData.get(position).getFan_nomi());
                intent.putExtra("uqituvchi",mFanlarData.get(position).getUqituvchi_ismi());
                intent.putExtra("image_d",mFanlarData.get(position).getImageUrl());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mFanlarData.size();
    }

    public void filterList(List<FanData> filteredList){
        mFanlarData=filteredList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView_fan_nomi, mTextView_uqituvchi;
        ImageView reklama_image;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            mTextView_fan_nomi = itemView.findViewById(R.id.text_view_fan_nomi);
            mTextView_uqituvchi = itemView.findViewById(R.id.text_view_uqituvchi);
            reklama_image=itemView.findViewById(R.id.fav_Image);
        }
    }
}






