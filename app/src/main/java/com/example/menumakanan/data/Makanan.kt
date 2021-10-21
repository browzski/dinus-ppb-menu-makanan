package com.example.menumakanan.data

import com.example.menumakanan.R
import com.example.menumakanan.model.MakananModel

class Makanan {
    var banyakMakanan = listOf(
        MakananModel(1,"Ikan Goreng",
            "Ikan goreng adalah istilah umum yang merujuk pada berbagai jenis hidangan Indonesia dan Malaysia yang dibuat dengan cara menggoreng ikan atau makanan laut lainnya. Ikan goreng sangat terkenal di Indonesia.",
            28000, R.drawable.ikan_bakar),
        MakananModel(2,"Nasi Goreng","Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.",15000
            ,R.drawable.nasi_goreng),
        MakananModel(3,"Ayam Bakar","Ayam bakar adalah sebuah hidangan Asia Tenggara Maritim, terutama hidangan Indonesia atau Malaysia, dari ayam yang dipanggang di atas arang.",30000,R.drawable.ayam_bakar),
        MakananModel(4,"Kwetiaw Goreng","Kwetiau goreng adalah kwetiau yang digoreng yang merupakan masakan Tionghoa Indonesia, itu adalah hidangan mie yang digoreng yang beraroma dan pedas yang umum dijumpai di Indonesia",20000,R.drawable.kwetiau),
    )
}