package com.example.pokedexapp.ui.fragments.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedexapp.domain.usecases.PokemonUseCase
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private var pokemonUseCase = PokemonUseCase()

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    fun callServicePokemon() {
        viewModelScope.launch {
            pokemonUseCase.getPokemonService()
        }

    }

}