package com.naufal.recycleview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.naufal.recycleview.R
import com.naufal.recycleview.Model.modelbuah


class BuahAdapter (val itemList: ArrayList<modelbuah.ModelBuah>,private val onItemClick : (modelbuah.ModelBuah) -> Unit):
    RecyclerView.Adapter<BuahAdapter.ModelViewHolder>() {

    class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ItemImage: ImageView = itemView.findViewById(R.id.gambar) as ImageView
        var Itemtext: TextView = itemView.findViewById(R.id.nama) as TextView

        init {
            ItemImage = itemView.findViewById(R.id.gambar) as ImageView
            Itemtext = itemView.findViewById(R.id.nama) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val nview = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_customimage, parent, false)
        return ModelViewHolder(nview)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.ItemImage.setImageResource(currentItem.image)
        holder.Itemtext.text=currentItem.deskripsi

        //set listener pada item
        holder.itemView.setOnClickListener(){
            onItemClick(currentItem)
        }
}
    }
