package com.example.barberbrothers.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barberbrothers.R
import com.example.barberbrothers.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nome = intent.extras?.getString("nome")

        binding.txtNomeUsuario.text = "Bem-vindo(a),$nome"
    }
}