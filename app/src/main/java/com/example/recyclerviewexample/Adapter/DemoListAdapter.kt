package com.example.recyclerviewexample.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import kotlinx.android.synthetic.main.list_item.view.*


class DemoListAdapter(private val WordList : ArrayList<String>): RecyclerView.Adapter<DemoListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val View = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(view = View)
    }

    override fun onBindViewHolder(holder:DemoListAdapter.ViewHolder, position: Int) {
      holder.bind(WordList[position])
    }

    override fun getItemCount(): Int = WordList.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(kelime: String) {
            itemView.SuperHahramanlarimiz.text = kelime

        }
    }
}