package com.unal.inlumicol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unal.inlumicol.databinding.ActivityGestionSuperUsuarioBinding

class GestionSuperUsuarioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGestionSuperUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGestionSuperUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // supportFragmentManager.beginTransaction().apply {
       //     replace(R.id.fragmenContainerSuperUsuario)
       // }

    }
}