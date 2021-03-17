package com.example.mybooks.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mybooks.R
import com.example.mybooks.models.Category
import com.example.mybooks.models.Recommendation
import java.util.ArrayList

class RecommendationAdapter : RecyclerView.Adapter<RecommendationAdapter.ViewHolder>() {

    var recommendationList: ArrayList<Recommendation> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun onBind(recommendation: Recommendation){
            itemView.apply {
                findViewById<ImageView>(R.id.cardView).setImageResource(recommendation.imageRecommendation)
                findViewById<TextView>(R.id.bookName).text = recommendation.bookName
                findViewById<TextView>(R.id.author_rec).text = recommendation.author
                findViewById<TextView>(R.id.category_rec).text = recommendation.category
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_recommandation,null,false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(recommendationList[position])
    }

    override fun getItemCount(): Int = recommendationList.size

}