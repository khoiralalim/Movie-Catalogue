package com.alimmanurung.moviecatalogues1.di

import android.content.Context
import com.alimmanurung.moviecatalogues1.data.source.CatalogueRepository
import com.alimmanurung.moviecatalogues1.data.source.remote.RemoteDataSource
import com.alimmanurung.moviecatalogues1.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): CatalogueRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return CatalogueRepository.getInstance(remoteDataSource)
    }
}