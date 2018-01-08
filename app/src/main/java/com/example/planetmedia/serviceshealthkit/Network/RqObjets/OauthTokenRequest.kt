package com.victoria.planetmedia.androidtabvictoria.network.RqObjects

/**
 * Created by sergio on 01/01/18.
 */

data class OauthTokenRequest(
        var authorization:String = "",
        var password:String = "",
        var username:String = "",
        var grant_type:String = ""
)