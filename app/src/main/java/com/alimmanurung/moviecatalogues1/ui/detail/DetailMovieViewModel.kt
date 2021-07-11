package com.alimmanurung.moviecatalogues1.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.alimmanurung.moviecatalogues1.data.MovieEntity
import com.alimmanurung.moviecatalogues1.data.source.CatalogueRepository

class DetailMovieViewModel(private val movieRepository: CatalogueRepository) : ViewModel() {
    private lateinit var movieId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): LiveData<MovieEntity> = movieRepository.getMovieById(movieId)
}
