package com.alimmanurung.moviecatalogues1.utils

import android.content.Context
import com.alimmanurung.moviecatalogues1.data.source.remote.response.MovieResponse
import com.alimmanurung.moviecatalogues1.data.source.remote.response.TvShowResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.util.ArrayList

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject =
                JSONObject(parsingFileToString("MovieResponses.json").toString())
            val listArray = responseObject.getJSONArray("movies")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val movieId = movie.getString("movieId")
                val title = movie.getString("title")
                val overview = movie.getString("overview")
                val production = movie.getString("production")
                val imagePath = movie.getString("imagePath")

                val movieResponse = MovieResponse(movieId, title, overview, production, imagePath)
                list.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return list
    }

    fun loadMovie(movieId: String): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject =
                JSONObject(parsingFileToString("MovieResponses.json").toString())
            val listArray = responseObject.getJSONArray("movies")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val movieId = movie.getString("movieId")
                val title = movie.getString("title")
                val overview = movie.getString("overview")
                val production = movie.getString("production")
                val imagePath = movie.getString("imagePath")

                val movieResponse = MovieResponse(movieId, title, overview, production, imagePath)
                list.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return list
    }

    fun loadTvShows(): List<TvShowResponse> {
        val list = ArrayList<TvShowResponse>()
        try {
            val responseObject =
                JSONObject(parsingFileToString("TvShowResponse.json").toString())
            val listArray = responseObject.getJSONArray("tvshows")
            for (i in 0 until listArray.length()) {
                val tvshow = listArray.getJSONObject(i)

                val tvshowId = tvshow.getString("tvshowId")
                val title = tvshow.getString("title")
                val overview = tvshow.getString("overview")
                val production = tvshow.getString("production")
                val imagePath = tvshow.getString("imagePath")

                val tvshowResponse = TvShowResponse(tvshowId, title, overview, production, imagePath)
                list.add(tvshowResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return list
    }

    fun loadTvShow(tvshowId: String): List<TvShowResponse> {
        val list = ArrayList<TvShowResponse>()
        try {
            val responseObject =
                JSONObject(parsingFileToString("TvShowResponse.json").toString())
            val listArray = responseObject.getJSONArray("tvshows")
            for (i in 0 until listArray.length()) {
                val tvshow = listArray.getJSONObject(i)

                val tvshowId = tvshow.getString("tvshowId")
                val title = tvshow.getString("title")
                val overview = tvshow.getString("overview")
                val production = tvshow.getString("production")
                val imagePath = tvshow.getString("imagePath")

                val tvshowResponse = TvShowResponse(tvshowId, title, overview, production, imagePath)
                list.add(tvshowResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return list
    }
}
