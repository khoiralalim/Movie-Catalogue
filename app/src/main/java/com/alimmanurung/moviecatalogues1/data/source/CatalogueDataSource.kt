package com.alimmanurung.moviecatalogues1.data.source

import androidx.lifecycle.LiveData
import com.alimmanurung.moviecatalogues1.data.MovieEntity
import com.alimmanurung.moviecatalogues1.data.TvShowEntity

interface CatalogueDataSource {

    fun getAllMovies(): LiveData<List<MovieEntity>>

    fun getMovieById(movieId: String): LiveData<MovieEntity>

    fun getTvShowById(tvshowId: String): LiveData<TvShowEntity>

    fun getTvShows(): LiveData<List<TvShowEntity>>

}