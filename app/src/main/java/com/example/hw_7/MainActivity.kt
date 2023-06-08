package com.example.hw_7


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw_7.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnCalculate.setOnClickListener {
                resultTv.text = Math().add(firstNumber.text.toString(),secondNumber.text.toString())
            }
            btnDivide.setOnClickListener {
                resultTv.text = Math().divide(firstNumber.text.toString(),secondNumber.text.toString())
            }
        }
    }
}