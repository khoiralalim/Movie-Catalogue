package com.alimmanurung.moviecatalogues1.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.alimmanurung.moviecatalogues1.data.MovieEntity
import com.alimmanurung.moviecatalogues1.data.source.CatalogueRepository

class MovieViewModel(private val movieRepository: CatalogueRepository) : ViewModel() {

    fun getMovies(): LiveData<List<MovieEntity>> = movieRepository.getAllMovies()
}
