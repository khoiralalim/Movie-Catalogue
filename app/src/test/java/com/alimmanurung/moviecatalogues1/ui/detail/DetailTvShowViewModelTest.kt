package com.alimmanurung.moviecatalogues1.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.alimmanurung.moviecatalogues1.data.TvShowEntity
import com.alimmanurung.moviecatalogues1.data.source.CatalogueRepository
import com.alimmanurung.moviecatalogues1.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyTvShow = DataDummy.generateDummyTvShows()[0]
    private val tvshowId = dummyTvShow.tvshowId

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var tvshowObserver: Observer<TvShowEntity>

    @Before
    fun setUp() {
        viewModel = DetailTvShowViewModel(catalogueRepository)
        viewModel.setSelectedTvShow(tvshowId)
    }

    @Test
    fun getTvShow() {
        val tvshow = MutableLiveData<TvShowEntity>()
        tvshow.value = dummyTvShow

        `when`(catalogueRepository.getTvShowById(tvshowId)).thenReturn(tvshow)
        val tvshowEntity = viewModel.getTvShow().value as TvShowEntity
        verify(catalogueRepository).getTvShowById(tvshowId)
        assertNotNull(tvshowEntity)
        assertEquals(dummyTvShow.tvshowId, tvshowEntity.tvshowId)
        assertEquals(dummyTvShow.production, tvshowEntity.production)
        assertEquals(dummyTvShow.overview, tvshowEntity.overview)
        assertEquals(dummyTvShow.imagePath, tvshowEntity.imagePath)
        assertEquals(dummyTvShow.title, tvshowEntity.title)

        viewModel.getTvShow().observeForever(tvshowObserver)
        verify(tvshowObserver).onChanged(dummyTvShow)
    }
}