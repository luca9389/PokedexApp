package com.example.pokedexapp.data.model

import com.google.gson.annotations.SerializedName

data class PokemonModels(
    @SerializedName("count") val count: Int,
    @SerializedName("next") val next: String,
    @SerializedName("previous") val previous: String,
    @SerializedName("results") val results: List<ResultModel>
) {

}
