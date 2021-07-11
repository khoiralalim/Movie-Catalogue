package com.alimmanurung.moviecatalogues1.ui.tvshow

import com.alimmanurung.moviecatalogues1.data.TvShowEntity

interface TvShowFragmentCallback {
    fun onShareClick(tvshow: TvShowEntity)
}
