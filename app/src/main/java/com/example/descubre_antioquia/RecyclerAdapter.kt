package com.example.descubre_antioquia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import java.io.IOException
import java.io.InputStream

class RecyclerAdapter(private val sitesList : ArrayList<Sites>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout
            ,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = sitesList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text= currentItem.heading
        holder.tvDetail.text= currentItem.detail
    }

    override fun getItemCount(): Int {
        return sitesList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.item_image)
        val tvHeading : TextView= itemView.findViewById(R.id.item_title)
        val tvDetail : TextView = itemView.findViewById(R.id.item_detail)
    }
}
