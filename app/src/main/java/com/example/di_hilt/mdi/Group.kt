package com.example.di_hilt.mdi

import android.util.Log

class Group(
    private val sam : Sam,
    private val ram : Ram,
    private val dam : Dam
) {
    fun groupName(){
        Log.i("name","it is group baby")
    }
}