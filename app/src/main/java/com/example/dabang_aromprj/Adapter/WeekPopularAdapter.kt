package com.example.aromprj_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dabang_aromprj.R

class WeekPopularAdapter : RecyclerView.Adapter<WeekPopularAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekPopularAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_recyclerview_weekpopular_item,parent,false)
        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: WeekPopularAdapter.ViewHolder, position: Int) {

    }
    override fun getItemCount() = 4
}