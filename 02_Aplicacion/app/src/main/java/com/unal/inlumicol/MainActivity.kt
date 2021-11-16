package com.unal.inlumicol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unal.inlumicol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.textTest.text = "Probando el View Binding"


    }
}