package com.example.talim.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.talim.Model.FanData;
import com.example.talim.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class KursAdapter extends RecyclerView.Adapter<KursAdapter.ViewHolder> {
    List<FanData> mList=new ArrayList<>();

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row_kurs,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull KursAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView_fan_nomi, mTextView_uqituvchi;
        ImageView kurs_image;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            mTextView_fan_nomi = itemView.findViewById(R.id.text_view_fan_nomi_k);
            mTextView_uqituvchi = itemView.findViewById(R.id.text_view_uqituvchi_k);
            kurs_image=itemView.findViewById(R.id.fav_Image_k);
        }
    }
}
