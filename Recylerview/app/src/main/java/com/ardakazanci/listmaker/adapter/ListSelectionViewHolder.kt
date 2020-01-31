package com.ardakazanci.listmaker.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.raywenderlich.listmaker.R

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val listPosition = itemView.findViewById(R.id.itemNumber) as TextView
    val listContent = itemView.findViewById(R.id.itemString) as TextView


}