package com.alimmanurung.moviecatalogues1.data

data class TvShowEntity (
    var tvshowId: String,
    var title: String,
    var overview: String,
    var production: String,
    var bookmarked: Boolean = false,
    var imagePath: String
)