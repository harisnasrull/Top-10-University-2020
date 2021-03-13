package com.example.top10university.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Univ(
    var name: String = "",
    var description: String = "",
    var country: String = "",
    var country_rank: String = "",
    var link: String = "",
    var logo: Int = 0
) : Parcelable