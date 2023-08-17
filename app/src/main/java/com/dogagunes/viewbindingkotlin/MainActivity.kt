package com.dogagunes.viewbindingkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dogagunes.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var counter : String
    private lateinit var sum : String
    private lateinit var list: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        counter = "0"
        sum = "0"
        list = ArrayList()



    }


    fun sum (view: View){
        var num1 = binding.firstText.text.toString().toInt()
        var sumInt = sum.toInt()
        var counterInt = counter.toInt()
        if(counterInt < 1){
            var num2 = binding.secondText.text.toString().toInt()
            sumInt = num1 + num2
            binding.textView.text = "Result: ${sumInt}"
            list.add(sumInt)
            println(list.size)
            counterInt++
        }

        if(counterInt > 1 ){
            sumInt = list[list.size-1] + num1
          list.add(sumInt)
          binding.textView.text = "Result: ${list[list.size-1]}"
        }

        counterInt++

        counter = counterInt.toString()
        sum = sumInt.toString()
        binding.firstText.setText("")
        binding.secondText.setText("")





    }



}