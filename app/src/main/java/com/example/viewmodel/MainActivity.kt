package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var tvCount :TextView
    lateinit var btn_add : Button
    lateinit var mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(101)).get(MainViewModel::class.java)

        tvCount = findViewById<TextView>(R.id.tvCount)
        btn_add = findViewById(R.id.btn_add)

        tvCount.text = mainViewModel.count.toString()

    }

//    fun setText(){
//        tvCount.text = mainViewModel.count.toString()
//
//    }

    fun increment(view: View) {
        mainViewModel.increment()
        tvCount.text = mainViewModel.count.toString()
    }
}