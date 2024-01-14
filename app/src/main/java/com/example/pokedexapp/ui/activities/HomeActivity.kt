package com.example.pokedexapp.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pokedexapp.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       // val navController = findNavController(R.id.container_fragment)

    }
}