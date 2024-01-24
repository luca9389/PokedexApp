package com.example.pokedexapp.ui.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.pokedexapp.ui.fragments.home.HomeFragment
import com.example.pokedexapp.ui.notifications.NotificationsFragment

class FragmentPageAdapter(context: FragmentActivity) : FragmentStateAdapter(context) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> NotificationsFragment()
            else -> HomeFragment()
        }
    }
}