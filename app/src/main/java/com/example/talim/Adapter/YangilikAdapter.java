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
import com.example.talim.Activity.YouTubeYangiliklar;
import com.example.talim.Model.FanData;
import com.example.talim.Model.YangilikData;
import com.example.talim.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class YangilikAdapter extends RecyclerView.Adapter<YangilikAdapter.ViewHolder> {
    List<YangilikData> mList=new ArrayList<>();
    Context mContext;

    public YangilikAdapter(List<YangilikData> list, Context context) {
        mList = list;
        mContext = context;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_yangilik,
                parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull YangilikAdapter.ViewHolder holder, int position) {
        holder.mTextView_fan_nomi.setText(mList.get(position).getFan_nomi());
        holder.mTextView_uqituvchi.setText(mList.get(position).getUqituvchi_ismi());
        holder.reklama_image.setImageResource(mList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext, YouTubeYangiliklar.class);
//                intent.putExtra("fan",mList.get(position).getFan_nomi());
                intent.putExtra("uqituvchi",mList.get(position).getUqituvchi_ismi());
//                intent.putExtra("image_d",mList.get(position).getImageUrl());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void filterList(List<YangilikData> filteredList){
        mList=filteredList;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView_fan_nomi, mTextView_uqituvchi;
        ImageView reklama_image;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            mTextView_fan_nomi = itemView.findViewById(R.id.text_view_fan_nomi_y);
            mTextView_uqituvchi = itemView.findViewById(R.id.text_view_uqituvchi_y);
            reklama_image=itemView.findViewById(R.id.fav_Image_y);
        }
    }
}
