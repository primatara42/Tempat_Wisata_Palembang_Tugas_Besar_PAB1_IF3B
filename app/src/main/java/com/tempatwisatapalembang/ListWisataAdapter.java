package com.tempatwisatapalembang;

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
    public ListWisataAdapter(ArrayList<GetterAndSetterWisataData> list)
    {
        this.listWisata = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        GetterAndSetterWisataData wisata = listWisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(wisata.getFotoWisata())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgWisata);
        holder.tvName.setText(wisata.getNameWisata());
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


        ListViewHolder(View view)
        {
            super(view);
            imgWisata = itemView.findViewById(R.id.iv_foto);
            tvName = itemView.findViewById(R.id.tv_nama);
        }
    }
}
