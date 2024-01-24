package com.example.pokedexapp.data.model

import com.google.gson.annotations.SerializedName

data class ResultModel(@SerializedName("name") var name:String , @SerializedName("url") var url:String) {
}