package com.example.wtsup.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wtsup.Modelclass.StatusModelclass
import com.example.wtsup.R

class StatusAdapter(listst: ArrayList<StatusModelclass>) : RecyclerView.Adapter<StatusAdapter.StatusHolder>() {
    var listst =listst
    class StatusHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var namest = itemView.findViewById<TextView>(R.id.namest)
        var profileest = itemView.findViewById<ImageView>(R.id.profileest)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        return StatusHolder(LayoutInflater.from(parent.context).inflate(R.layout.status_itemfile,parent,false))
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        holder.namest.text = listst.get(position).namest
        holder.profileest.setImageResource(listst.get(position).imgst)
    }

    override fun getItemCount(): Int {
        return listst.size
    }
}