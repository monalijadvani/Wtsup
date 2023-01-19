package com.example.wtsup.Adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.wtsup.Modelclass.CallModelclass
import com.example.wtsup.R

class CallAdapter(name: ArrayList<CallModelclass>) : RecyclerView.Adapter<CallAdapter.CallHolder>() {
    var name = name
    lateinit var context:Context
    class CallHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
       var name1 = itemView.findViewById<TextView>(R.id.name1)
       var profilee = itemView.findViewById<ImageView>(R.id.profilee)
       var call = itemView.findViewById<ImageView>(R.id.call)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallHolder {






         context = parent.context
        return CallHolder(LayoutInflater.from(parent.context).inflate(R.layout.call_itemfile,parent,false))
    }

    override fun onBindViewHolder(holder: CallHolder, position: Int) {
        holder.name1.text = name.get(position).name
        holder.profilee.setImageResource(name.get(position).img)
        holder.call.setOnClickListener {

            val intent = Intent (Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:"+"7900040584"))
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
      return name.size
    }
}