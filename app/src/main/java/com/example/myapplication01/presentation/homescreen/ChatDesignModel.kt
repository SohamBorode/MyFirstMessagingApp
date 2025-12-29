//package com.example.myapplication01.presentation.homescreen
//
//data class ChatDesignModel(
//    val image: Int,
//    val name:String,
//    val message:String,
//    val time: String
//
//)
package com.example.myapplication01.presentation.homescreen

import androidx.annotation.DrawableRes

data class ChatDesignModel(
    @DrawableRes val image: Int,
    val name: String,
    val message: String,
    val time: String
)
