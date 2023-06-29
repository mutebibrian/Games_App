package com.kotlinseries.gamesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(val gamelist:ArrayList<GameModel>):RecyclerView.Adapter<GameAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        //this class will initialize the widgets for my custom item layout
        var gameimg: ImageView
        var gametitle:TextView

        init {
            gameimg= itemView.findViewById(R.id.cardviewImg)
            gametitle=itemView.findViewById(R.id.cardviewTXT)

            itemView.setOnClickListener{
Toast.makeText(itemView.context,"You choose ${gamelist[adapterPosition].txtcard}",Toast.LENGTH_SHORT).show()

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
val v = LayoutInflater.from(parent.context)
    .inflate(R.layout.card_item_layout,parent,false)
        return MyViewHolder(v)

    }

    override fun getItemCount(): Int {
        return gamelist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //I need to setdata insidewidget so i need to use the holder.gameimage.setimageresource
       holder.gameimg.setImageResource(gamelist[position].imgcard)
        holder.gametitle.setText(gamelist[position].txtcard)


    }
}