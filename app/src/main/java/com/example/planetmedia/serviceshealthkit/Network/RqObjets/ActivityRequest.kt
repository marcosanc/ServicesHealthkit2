package com.victoria.planetmedia.androidtabvictoria.network.RqObjects

/**
 * Created by PLANETMEDIA on 03/01/2018.
 */
data class ActivityRequest (
        var access_token:String="",
        var filter_by:String="",
        var date: String="",
        var page:String ="",
        var per_page: String=""

)