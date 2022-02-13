package com.example.dictionary.Kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dictionary.R

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // ?키워드는 null 값이 들어감을 의미
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val a = 1
        var b = 2

        val str = "코로나 조심하세요"
        val str2 = str.replace("조삼하세요", "이겨내요")
        // replace를 사용하면 문자형 수정이 가능하다

        // val은 값이 변하지 못하고 var는 가능하다
        // 변수형을 생략하여도 된다
        println(sum(1, 2))
    }

    fun sum(a : Int, b : Int) = a + b
    //간단한 함수 형식!
}