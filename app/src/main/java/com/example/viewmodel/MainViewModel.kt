package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel(val value: Int): ViewModel(){
    var count: Int = value

    fun increment(){
        count++
    }
}