package com.example.demorecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items_row.view.*

class ItemAdapter(val context:Context, val items:ArrayList<String>):RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.items_row,parent,false))
    }



    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
        val item = items[position]
        holder.viewItem.text = item
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val viewItem = view.tvItem
    }

}