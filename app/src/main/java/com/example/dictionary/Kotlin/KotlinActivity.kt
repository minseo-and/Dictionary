package com.example.dictionary.Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dictionary.R

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // ?키워드는 null 값이 들어감을 의미
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        println(sum(1, 2))
    }

    fun sum(a : Int, b : Int) = a + b
    //간단한 함수 형식!
}