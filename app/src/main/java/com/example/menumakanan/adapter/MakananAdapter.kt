package com.example.menumakanan.adapter

import android.content.Intent
import android.graphics.BitmapFactory
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.menumakanan.MakananDetail
import com.example.menumakanan.R
import com.example.menumakanan.data.Makanan
import com.example.menumakanan.model.MakananModel

class MakananAdapter(private val dataSet: List<MakananModel>) :
    RecyclerView.Adapter<MakananAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val nama: TextView
        val foto : ImageView
        val harga : TextView
        val card : CardView

        init {
            // Define click listener for the ViewHolder's View.
            nama = view.findViewById(R.id.tv_nama)
            foto = view.findViewById(R.id.img_food)
            harga = view.findViewById(R.id.tv_harga)
            card = view.findViewById(R.id.cv_makanan)

            view.setOnClickListener { v : View ->
                val position = adapterPosition
                Log.d("MakananAdapter","$position")

                val i = Intent(view.context,MakananDetail::class.java)
                i.putExtra("position",position)
                view.context.startActivity(i)
            }
        }

        fun bind(makanan : MakananModel){
            harga.text = makanan.harga.toString()
            nama.text = makanan.nama
            foto.setImageResource(makanan.gambar)


        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.makanan_card, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.bind(dataSet[position])

    }
    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
