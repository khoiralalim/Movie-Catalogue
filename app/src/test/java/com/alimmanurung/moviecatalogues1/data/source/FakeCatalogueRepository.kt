package com.alimmanurung.moviecatalogues1.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.alimmanurung.moviecatalogues1.data.MovieEntity
import com.alimmanurung.moviecatalogues1.data.TvShowEntity
import com.alimmanurung.moviecatalogues1.data.source.remote.RemoteDataSource
import com.alimmanurung.moviecatalogues1.data.source.remote.response.MovieResponse
import com.alimmanurung.moviecatalogues1.data.source.remote.response.TvShowResponse

class FakeCatalogueRepository (private val remoteDataSource: RemoteDataSource) : CatalogueDataSource {

    override fun getAllMovies(): LiveData<List<MovieEntity>> {
        val movieResults = MutableLiveData<List<MovieEntity>>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onAllMoviesReceived(movieResponses: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in movieResponses) {
                    val movie = MovieEntity(response.id,
                        response.title,
                        response.overview,
                        response.production,
                        false,
                        response.imagePath)
                    movieList.add(movie)
                }
                movieResults.postValue(movieList)
            }
        })

        return movieResults
    }

    override fun getMovieById(movieId: String): LiveData<MovieEntity> {
        val movieResult = MutableLiveData<MovieEntity>()

        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onAllMoviesReceived(movieResponses: List<MovieResponse>) {
                lateinit var movie: MovieEntity
                for (response in movieResponses) {
                    if (response.id == movieId) {
                        movie = MovieEntity(
                            response.id,
                            response.title,
                            response.overview,
                            response.production,
                            false,
                            response.imagePath
                        )
                    }
                    movieResult.postValue(movie)
                    break
                }

            }
        })

        return movieResult
    }

    override fun getTvShows(): LiveData<List<TvShowEntity>> {
        val tvshowResults = MutableLiveData<List<TvShowEntity>>()
        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowsCallback {
            override fun onAllTvShowsReceived(tvshowResponses: List<TvShowResponse>) {
                val tvshowList = ArrayList<TvShowEntity>()
                for (response in tvshowResponses) {
                    val tvshow = TvShowEntity(response.id,
                        response.title,
                        response.overview,
                        response.production,
                        false,
                        response.imagePath)
                    tvshowList.add(tvshow)
                }
                tvshowResults.postValue(tvshowList)
            }
        })

        return tvshowResults
    }

    override fun getTvShowById(tvshowId: String): LiveData<TvShowEntity> {
        val tvshowResult = MutableLiveData<TvShowEntity>()

        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowsCallback {
            override fun onAllTvShowsReceived(tvshowResponses: List<TvShowResponse>) {
                lateinit var tvshow: TvShowEntity
                for (response in tvshowResponses) {
                    if (response.id == tvshowId) {
                        tvshow = TvShowEntity(
                            response.id,
                            response.title,
                            response.overview,
                            response.production,
                            false,
                            response.imagePath
                        )
                    }
                    tvshowResult.postValue(tvshow)
                    break
                }
            }
        })

        return tvshowResult
    }

}