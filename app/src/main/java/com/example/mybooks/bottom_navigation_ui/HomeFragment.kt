package com.example.mybooks.bottom_navigation_ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.mybooks.R
import com.example.mybooks.adapters.CategoryAdapter
import com.example.mybooks.adapters.RecommendationAdapter
import com.example.mybooks.databinding.FragmentHome2Binding
import com.example.mybooks.models.Category
import com.example.mybooks.models.Recommendation


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHome2Binding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var recommendationAdapter: RecommendationAdapter

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentHome2Binding.inflate(inflater,container,false)

       categoryAdapter = CategoryAdapter()
       recommendationAdapter = RecommendationAdapter()

       categoryAdapter.categoryList = arrayListOf(Category(R.drawable.book1,"Ta'lim sohasi"),
               Category(R.drawable.book1,"Tibbiyot"),
               Category(R.drawable.book1,"Business"),
               Category(R.drawable.book1,"Others"),
               Category(R.drawable.book1,"Ta'lim sohasi"),
               Category(R.drawable.book1,"Ta'lim sohasi"),
               Category(R.drawable.book1,"Ta'lim sohasi"),
               Category(R.drawable.book1,"Ta'lim sohasi"),
               Category(R.drawable.book1,"Ta'lim sohasi"))
       binding.recyclerViewCategory.adapter = categoryAdapter

       recommendationAdapter.recommendationList = arrayListOf(Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught")
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"),
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"),
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"),
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"),
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"),
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"),
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"),
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"),
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"),
//               Recommendation(R.drawable.dale,"Dale Carnegie","Muvaffaqiyatga erishish","Self-taught"))
       )
       binding.recyclerViewRecommendation.adapter = recommendationAdapter

        return binding.root
    }


}