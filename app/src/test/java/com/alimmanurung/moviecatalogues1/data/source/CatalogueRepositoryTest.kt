package com.alimmanurung.moviecatalogues1.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.alimmanurung.moviecatalogues1.data.source.remote.RemoteDataSource
import com.alimmanurung.moviecatalogues1.utils.DataDummy
import com.alimmanurung.moviecatalogues1.utils.LiveDataTestUtil
import org.mockito.Mockito.mock
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.doAnswer
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test

class CatalogueRepositoryTest {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val catalogueRepository = FakeCatalogueRepository(remote)

    private val movieResponses = DataDummy.generateRemoteDummyMovies()
    private val movieId = movieResponses[0].id
    private val tvshowResponses = DataDummy.generateRemoteDummyTvShows()
    private val tvshowId = tvshowResponses[0].id

    @Test
    fun getAllMovies() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback)
                .onAllMoviesReceived(movieResponses)
            null
        }.`when`(remote).getAllMovies(any())
        val movieEntities = LiveDataTestUtil.getValue(catalogueRepository.getAllMovies())
                verify(remote).getAllMovies(any())
                assertNotNull(movieEntities)
                assertEquals(movieResponses.size.toLong(), movieEntities.size.toLong())
    }

    @Test
    fun getMovieById() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback)
                .onAllMoviesReceived(movieResponses)
            null
        }.`when`(remote).getAllMovies(any())
        val movieEntities = LiveDataTestUtil.getValue(catalogueRepository.getMovieById(movieId))
        verify(remote).getAllMovies((any()))
        assertNotNull(movieEntities)
        assertNotNull(movieEntities.title)
        assertEquals(movieResponses[0].id, movieEntities.movieId)
    }

    @Test
    fun getAllTvShows() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback)
                .onAllTvShowsReceived(tvshowResponses)
            null
        }.`when`(remote).getAllTvShows(any())
        val tvshowEntities = LiveDataTestUtil.getValue(catalogueRepository.getTvShows())
                verify(remote).getAllTvShows(any())
                assertNotNull(tvshowEntities)
                assertEquals(tvshowResponses.size.toLong(), tvshowEntities.size.toLong())
    }

    @Test
    fun getTvShowById() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback)
                .onAllTvShowsReceived(tvshowResponses)
            null
        }.`when`(remote).getAllTvShows(any())
        val tvshowEntities = LiveDataTestUtil.getValue(catalogueRepository.getTvShowById(tvshowId))
        verify(remote).getAllTvShows((any()))
        assertNotNull(tvshowEntities)
        assertNotNull(tvshowEntities.title)
        assertEquals(tvshowResponses[0].id, tvshowEntities.tvshowId)
    }
}
