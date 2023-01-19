package com.example.wtsup.Modelclass

class Chatmodelclass {
    lateinit var name1 : String
    lateinit var dates : String
    var imgs : Int=0

    constructor(name1: String,dates: String, imgs: Int) {
        this.name1 = name1
        this.dates = dates
        this.imgs = imgs
    }
}