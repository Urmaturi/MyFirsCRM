package com.example.myfirstcrmsystem.firstfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstcrmsystem.R


class FirstAdaptor(private val clients: List<String>) : RecyclerView.Adapter<FirstAdaptor.MyViewHolder>()
{
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val clientName: TextView = itemView.findViewById(R.id.client_name)
        val summ: TextView = itemView.findViewById(R.id.summ)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_client_item, parent, false)
        return MyViewHolder(itemView)


    }

    override fun getItemCount(): Int {
        return clients.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.clientName.text = clients[position]
        holder.summ.text = clients[position]

    }


}