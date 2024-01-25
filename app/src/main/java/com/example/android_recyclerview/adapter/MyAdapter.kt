package com.example.android_recyclerview.adapter

import android.content.ClipData.Item
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.android_recyclerview.R
import com.example.android_recyclerview.model.MyModel
import java.util.ArrayList

class MyAdapter(var context: Context, var arrayList:ArrayList<MyModel>):
    RecyclerView.Adapter<MyAdapter.ItemHolder>() {

    class ItemHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        var icons = itemView.findViewById<ImageView>(R.id.icon_image)
        var txt = itemView.findViewById<TextView>(R.id.cardText)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context) //similar to setContentView(R.layout.activity_main)
            .inflate(R.layout.grid_item, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun onBindViewHolder(holder: MyAdapter.ItemHolder, position: Int) {
        var myCard: MyModel = arrayList.get(position)

        //Set the icon for the card (icons from the Adapter)
        holder.icons.setImageResource(myCard.iconsCard!!)
        //set the text for the card (text model for the adapter)
        holder.txt.text = myCard.textCard

        holder.txt.setOnClickListener{
            Toast.makeText(context, myCard.textCard, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}
