package com.example.pokedexapp.domain.usecases

import com.example.pokedexapp.data.repository.PokemonRepository

class PokemonUseCase {
    var repository = PokemonRepository()

    suspend fun getPokemonService(){
        repository.getPokemonServiceRepository()
    }

}
