package com.ardakazanci.listmaker.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.raywenderlich.listmaker.R

class ListSelectionRecyclerViewAdapter : RecyclerView.Adapter<ListSelectionViewHolder>() {

    val listTitles = arrayOf("Shopping List", "Chores", "Android Tutorials")

    // View Created
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListSelectionViewHolder {

        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_list, p0, false)
        return ListSelectionViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listTitles.size
    }

    // Data Connected
    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {

        holder.listPosition.text = (position + 1).toString()
        holder.listContent.text = listTitles[position]

    }


}
