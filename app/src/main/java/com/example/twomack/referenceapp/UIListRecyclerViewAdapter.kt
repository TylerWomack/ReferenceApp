package com.example.twomack.referenceapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.ui_list_item.view.*


class UIListRecyclerViewAdapter(val items: ArrayList<String>, val context: Context)
    : RecyclerView.Adapter<UIListRecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UIListRecyclerViewAdapter.ViewHolder {

        val v = LayoutInflater.from(context).inflate(R.layout.ui_list_item, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {

        return items.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.uiCategoryType?.text = items.get(position)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val uiCategoryType = view.UiCategory
    }
}

