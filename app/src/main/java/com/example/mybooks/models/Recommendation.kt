package com.example.mybooks.models

class Recommendation {

    var imageRecommendation :Int = 0
    var author:String = ""
    var bookName:String =""
    var category:String = ""

    constructor(image_recommendation: Int, author: String, bookName: String, category: String) {
        this.imageRecommendation = image_recommendation
        this.author = author
        this.bookName = bookName
        this.category = category
    }
    constructor()
}