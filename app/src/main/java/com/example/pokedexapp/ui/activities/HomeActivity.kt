package com.example.pokedexapp.ui.activities

import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.pokedexapp.databinding.ActivityMainBinding
import com.example.pokedexapp.databinding.HomeActivityBinding
import com.example.pokedexapp.ui.adapters.FragmentPageAdapter
import com.example.pokedexapp.ui.fragments.home.HomeFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: HomeActivityBinding
    private lateinit var adapter: FragmentStateAdapter
    private lateinit var tapLayout:TabLayout
    private lateinit var viewpager2:ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tapLayout = binding.tapLayout
        viewpager2 = binding.viewPager2
        adapter = FragmentPageAdapter(this)
        viewpager2.adapter = adapter
        TabLayoutMediator(tapLayout , viewpager2){ tap ,position->
            when(position){
                0-> tap.text = "Pokemons"
                1-> tap.text = "Ajustes"
            }

        }.attach()


    }
}