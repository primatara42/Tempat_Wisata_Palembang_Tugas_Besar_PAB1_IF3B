package com.tempatwisatapalembang;

import java.util.ArrayList;

public class WisataData
{
    private static String[] nameWisata =
            {
      "Air Batu", "Air Terjun Bedegung", "Kebun Teh Pagaralam", "Danau Ranau", "Al-Qur'an Al-Akbar",
      "Danau Opi Jakabaring", "Pulau Maspari", "Goa Putri Padang Bindu Baturaja", "Tangga 2001", "Air Terjun Bidadari"
    };

    private static int[] imageWisata = {
        R.drawable.danau_air_batu, R.drawable.air_terjun_bedegung, R.drawable.kebun_teh_pagaralam, R.drawable. danau_ranau, R.drawable. al_quran_al_akbar, R.drawable.danau_opi, R.drawable.pulau_maspari, R.drawable.goa_putri, R.drawable.tangga_2001, R.drawable.air_terjun_bedegung
    };

    static ArrayList<GetterAndSetterWisataData> getListData()
    {
        ArrayList<GetterAndSetterWisataData> list = new ArrayList<>();
        for (int i = 0; i < nameWisata.length; i++)
        {
            GetterAndSetterWisataData wisata = new GetterAndSetterWisataData();
            wisata.setNameWisata(nameWisata[i]);
            wisata.setFotoWisata(imageWisata[i]);
            list.add(wisata);
        }
        return list;
    }
}
