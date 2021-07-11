package com.alimmanurung.moviecatalogues1.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.alimmanurung.moviecatalogues1.data.TvShowEntity
import com.alimmanurung.moviecatalogues1.data.source.CatalogueRepository

class DetailTvShowViewModel(private val tvshowRepository: CatalogueRepository) : ViewModel() {
    private lateinit var tvshowId: String

    fun setSelectedTvShow(tvshowId: String) {
        this.tvshowId = tvshowId
    }

    fun getTvShow(): LiveData<TvShowEntity> = tvshowRepository.getTvShowById(tvshowId)
}
