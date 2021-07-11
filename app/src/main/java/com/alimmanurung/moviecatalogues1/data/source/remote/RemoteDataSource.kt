package com.alimmanurung.moviecatalogues1.data.source.remote

import android.os.Handler
import com.alimmanurung.moviecatalogues1.data.source.remote.response.MovieResponse
import com.alimmanurung.moviecatalogues1.data.source.remote.response.TvShowResponse
import com.alimmanurung.moviecatalogues1.utils.EspressoIdlingResource
import com.alimmanurung.moviecatalogues1.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper){

    private val handler = Handler()

    companion object {
        private const val SERVICE_LATENCY_IN_MILLIS: Long = 2000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper)
            }
    }

    fun getAllMovies(callback: LoadMoviesCallback) {
        EspressoIdlingResource.increment()
        handler.postDelayed({
            callback.onAllMoviesReceived(jsonHelper.loadMovies())
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
    }

    fun getMovie(movieId: String, callback: LoadMoviesCallback) {
        EspressoIdlingResource.increment()
        handler.postDelayed({
            callback.onAllMoviesReceived(jsonHelper.loadMovie(movieId))
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
    }

    fun getAllTvShows(callback: LoadTvShowsCallback) {
        EspressoIdlingResource.increment()
        handler.postDelayed({
            callback.onAllTvShowsReceived(jsonHelper.loadTvShows())
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
    }

    fun getTvShow(tvshowId: String, callback: LoadTvShowsCallback) {
        EspressoIdlingResource.increment()
        handler.postDelayed({
            callback.onAllTvShowsReceived(jsonHelper.loadTvShow(tvshowId))
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
    }

    interface LoadMoviesCallback {
        fun onAllMoviesReceived(movieResponses: List<MovieResponse>)
    }

    interface LoadTvShowsCallback {
        fun onAllTvShowsReceived(tvshowResponses: List<TvShowResponse>)
    }
}