package com.alimmanurung.moviecatalogues1.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alimmanurung.moviecatalogues1.data.source.CatalogueRepository
import com.alimmanurung.moviecatalogues1.di.Injection
import com.alimmanurung.moviecatalogues1.ui.detail.DetailMovieViewModel
import com.alimmanurung.moviecatalogues1.ui.detail.DetailTvShowViewModel
import com.alimmanurung.moviecatalogues1.ui.movie.MovieViewModel
import com.alimmanurung.moviecatalogues1.ui.tvshow.TvShowViewModel

class ViewModelFactory private constructor(private val mMovieRepository: CatalogueRepository) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context))
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                return MovieViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(DetailMovieViewModel::class.java) -> {
                return DetailMovieViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                return TvShowViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(DetailTvShowViewModel::class.java) -> {
                return DetailTvShowViewModel(mMovieRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }

    }
}