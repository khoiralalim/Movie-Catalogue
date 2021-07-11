package com.alimmanurung.moviecatalogues1.data.source.remote.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse (
    var id: String,
    var title: String,
    var overview: String,
    var production: String,
    var imagePath: String
): Parcelable