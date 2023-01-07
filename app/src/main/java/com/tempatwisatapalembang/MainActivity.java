package com.tempatwisatapalembang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<GetterAndSetterWisataData> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList()
    {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(list,MainActivity.this);
        rvWisata.setAdapter(listWisataAdapter);
    }

}