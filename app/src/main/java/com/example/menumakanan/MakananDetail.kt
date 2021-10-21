package com.example.menumakanan

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.menumakanan.data.Makanan
import com.example.menumakanan.model.MakananModel

class MakananDetail : AppCompatActivity() {
    lateinit var banyakMakanan: List<MakananModel>
    lateinit var makanan: MakananModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan_detail)

        banyakMakanan = Makanan().banyakMakanan
        val position = intent.extras?.getInt("position")
        Log.d("MakananDetail","${position}")

        if (position != null) {
            val nama = findViewById<TextView>(R.id.tv_nama)
            val deskripsi = findViewById<TextView>(R.id.tv_deskripsi)
            val harga = findViewById<TextView>(R.id.tv_harga)
            val foto = findViewById<ImageView>(R.id.img_food)

            makanan = banyakMakanan[position.toInt()]
            nama.text = makanan.nama
            deskripsi.text = makanan.deskripsi
            harga.text = "Harga : ${makanan.harga}"
            foto.setImageResource(makanan.gambar)


        }

    }

}