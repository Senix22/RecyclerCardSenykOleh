package com.senix22.recyclercard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(
    var items: ArrayList<Person>, var clickListner: OnDataItemClickListener
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view, parent, false)
        return ViewHolder(v)
    }


    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position], clickListner)
    }
}