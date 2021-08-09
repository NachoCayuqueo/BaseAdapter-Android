package com.example.customlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter: BaseAdapter {
    var context: Context? = null
    var dataList = ArrayList<Character>()

    constructor(
        context: Context,
        list: ArrayList<Character>
    ):super(){
        this.context = context
        this.dataList = list
    }

    override fun getCount(): Int {
        return dataList.size
    }

    override fun getItem(position: Int): Any {
        return dataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val date = dataList[position]

        var inflator = LayoutInflater.from(context)
        var view = inflator.inflate(R.layout.list_items,null)

        val imageView = view.findViewById<ImageView>(R.id.imageID)
        val nameView = view.findViewById<TextView>(R.id.nameID)
        val serieView = view.findViewById<TextView>(R.id.serieID)

        imageView.setImageResource(date.image)
        nameView.text = date.name
        serieView.text = date.serie

        return view
    }

}