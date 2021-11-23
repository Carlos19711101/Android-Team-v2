package com.example.descubre_antioquia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.io.IOException
import java.io.InputStream

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf("Piedra del Peñol",
            "Santa Fe de Antioquia",
            "El Jardín",
            "Estadio Atanasio Girardot",
            "Jericó"
            )
    private var details = arrayOf("El peñón de Guatapé, o piedra del Peñol, es un monolito de 220 metros de altura, localizado en El Peñol-Guatapé",
            "Puente de Occidente. Kanaloa Parque Acuatico. Plaza Mayor Juan de Corral. Iglesia de Nuestra Señora de Chiquinquirá",
        "Pueblo más Bonito de Antioquia, Ciudad de los muchos cerros y Monumento Nacional",
        "Campo deportivo del Área Metropolitana del Valle de Aburrá","La “Atenas del suroeste antioqueño"
    )
    private var images = intArrayOf(R.drawable.piedra_1,R.drawable.santafe_2,R.drawable.jardin_3,R.drawable.estadio_4,R.drawable.jerico_5)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail:TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }



}