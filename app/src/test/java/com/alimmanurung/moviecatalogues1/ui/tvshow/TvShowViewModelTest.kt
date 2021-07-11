package com.alimmanurung.moviecatalogues1.ui.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.alimmanurung.moviecatalogues1.data.TvShowEntity
import com.alimmanurung.moviecatalogues1.data.source.CatalogueRepository
import com.alimmanurung.moviecatalogues1.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var tvshowRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<List<TvShowEntity>>

    @Before
    fun setUp() {
        viewModel = TvShowViewModel(tvshowRepository)
    }

    @Test
    fun getTvShows() {
        val dummyTvShows = DataDummy.generateDummyTvShows()
        val tvshows = MutableLiveData<List<TvShowEntity>>()
        tvshows.value = dummyTvShows

        `when`(tvshowRepository.getTvShows()).thenReturn(tvshows)
        val tvshowEntities = viewModel.getTvShows().value
        verify<CatalogueRepository>(tvshowRepository).getTvShows()
        assertNotNull(tvshowEntities)
        assertEquals(10, tvshowEntities?.size)

        viewModel.getTvShows().observeForever(observer)
        verify(observer).onChanged(dummyTvShows)
    }
}