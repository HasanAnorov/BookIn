package com.example.mybooks.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mybooks.R
import com.example.mybooks.models.Category
import java.util.ArrayList

class CategoryAdapter :RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    var categoryList:ArrayList<Category> = arrayListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun onBind(category:Category){
            itemView.apply {
                findViewById<ImageView>(R.id.iv_item_view).setImageResource(category.image)
                findViewById<TextView>(R.id.tv_category).text = category.categoryName
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_category,null,false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(categoryList[position])
    }

    override fun getItemCount(): Int = categoryList.size

}