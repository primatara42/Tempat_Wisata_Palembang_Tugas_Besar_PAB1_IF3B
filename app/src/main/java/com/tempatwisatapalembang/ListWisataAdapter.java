package com.tempatwisatapalembang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>
{
    private ArrayList<GetterAndSetterWisataData> listWisata;
    private Context ctx;

    public ListWisataAdapter(ArrayList<GetterAndSetterWisataData> listWisata, Context ctx)
    {
        this.listWisata = listWisata;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.item_card, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        /*
        GetterAndSetterWisataData wisata = listWisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(wisata.getFotoWisata())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgWisata);
        holder.tvName.setText(wisata.getNameWisata());
         */
        GetterAndSetterWisataData wisata = listWisata.get(position);
        holder.tvName.setText(wisata.getNameWisata());
        Glide.
                with(ctx)
                .load(wisata.getFotoWisata())
                .centerCrop()
                .into(holder.imgWisata);
    }

    @Override
    public int getItemCount()
    {
        return listWisata.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgWisata;
        TextView tvName;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgWisata = itemView.findViewById(R.id.iv_foto);
            tvName = itemView.findViewById(R.id.tv_nama);
        }
    }
}
