package com.example.appmovie.data.model

data class Genres(
    val id: Int?,
    val name: String?,
    var selected: Boolean = false,
    var positionSelected: Int? = null
)

object GenresEntry {
    const val ID = "id"
    const val NAME = "name"
    const val LIST_GENRES = "genres"
}
