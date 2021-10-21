package com.example.menumakanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.menumakanan.adapter.MakananAdapter
import com.example.menumakanan.data.Makanan
import com.example.menumakanan.model.MakananModel

class MainActivity : AppCompatActivity(){
    lateinit var banyakMakanan : List<MakananModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        banyakMakanan = Makanan().banyakMakanan
        val rv : RecyclerView = findViewById(R.id.RVList)
        rv.adapter = MakananAdapter(banyakMakanan)
        rv.layoutManager = LinearLayoutManager(this)

    }


}