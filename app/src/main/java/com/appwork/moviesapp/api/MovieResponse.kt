package com.appwork.moviesapp.api

import com.appwork.moviesapp.data.model.Movie

data class MovieResponse(
    val results: List<Movie>
)