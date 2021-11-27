package com.unal.inlumicol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Peligro!!
        Thread.sleep(1500)
        // !!----!!
        super.onCreate(savedInstanceState)
        // TODO("para login")
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }
}