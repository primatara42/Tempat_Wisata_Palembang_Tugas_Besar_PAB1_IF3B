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

    private static String[] alamatWisata =
            {
                    "Jalan Sungai Rengit Desa Air Batu Kecamatan Talang Kelapa Kabupaten Musi Banyuasin", "Air Terjun Curup Tenang, Tj. Agung, Bedegung, Kec. Tj. Agung, Kabupaten Muara Enim, Sumatera Selatan 32157",
                    "Jl. Amat Ramui, Gn. Dempo, Kec. Pagar Alam Sel., Kota Pagar Alam, Sumatera Selatan 31581", "Danau Ranau, Jepara, Kec. Buay Pematang Ribu Ranau Tenga, Kabupaten Ogan Komering Ulu Selatan, Sumatera Selatan",
                    "Jl. Moh. Amin, Gandus, Kec. Gandus, Kota Palembang, Sumatera Selatan 30149", "OPI Water Fun Jakabaring, Sungai Kedukan, Kec. Rambutan, Kab. Banyuasin, Sumatera Selatan 30967",
                    "Pulau maspari, Simpang Tiga Jaya, Sumatera Selatan", "Padang Bindu, Semidang Aji, Suka Merindu, Kec. Semidang Aji, Kabupaten Ogan Komering Ulu, Sumatera Selatan 32155",
                    "Gn. Dempo, Kec. Pagar Alam Sel., Kota Pagar Alam, Sumatera Selatan 31581", "Jl. Letnan Alamsyah, Karang Dalam, Kec. Pulau Pinang, Kabupaten Lahat, Sumatera Selatan 31461"
            };

    private static String[] tarif =
            {
                    "Rp. 5000/orang", "Rp. 5000 (Hari Biasa) / Rp. 10000 - Rp. 25000 (Hari Libur)", "Rp. 5000 (Hari Biasa) / Rp. 10000 (Hari Libur)",
                    "Rp. 10000/orang", "Rp. 15000 (Anak - Anak) / Rp. 20000 (Dewasa)", "Rp. 5000 (Motor) / Rp. 10000 (Mobil) / Rp. 1000 (Orang)",
                    "Sungai Musi – Pulau Maspari (+- 6 jam) = Rp 2.500.000 (sekali jalan) / *Palembang – OKI (+-2 Jam)* <--> *OKI - Pulau Maspari (+- 4 jam)* = unknown",
                    "Rp. 5000 (Orang) / Rp. 10000 (Kendaraan)", "Free", "Free"
            };

    private static String[] jamOperasional = {
            "24 Jam", "06.00 - 18.00", "24 Jam", "08.00 – 17.00", "09.00 – 17.00", "05.30 – 23.00", "24 Jam", "08.00 – 16.00",
            "24 Jam", "08.00 – 16.00"
    };

    private static String[] rating = {
            "4.3/5", "4.5/5", "4.8/5", "4.5/5", "4.6/5", "4.2/5", "4.5/5", "4.5/5", "4.5/5", "4.9/5"
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
