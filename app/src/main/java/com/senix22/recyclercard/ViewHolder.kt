package com.senix22.recyclercard

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_view.view.*

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var name: TextView = itemView.personName
    var descriptionPhoto: TextView = itemView.photoDescription
    var photo: ImageView = itemView.photo

    fun bind(item: Person, action: OnDataItemClickListener) {
        name.text = item.name
        descriptionPhoto.text = item.description
        photo.setImageResource(item.photo)

        itemView.setOnClickListener {
            action.onItemClick(item, adapterPosition)
        }
    }
}