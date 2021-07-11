package com.alimmanurung.moviecatalogues1.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.alimmanurung.moviecatalogues1.data.TvShowEntity
import com.alimmanurung.moviecatalogues1.data.source.CatalogueRepository

class TvShowViewModel(private val movieRepository: CatalogueRepository) : ViewModel() {
    fun getTvShows(): LiveData<List<TvShowEntity>> = movieRepository.getTvShows()
}