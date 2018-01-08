package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 08/01/2018.
 */
data class ResponseAccessCode (

        @field:SerializedName("access_token")
        val access_token:String? = null,

        @field:SerializedName("token_type")
        val token_type:String? = null,

        @field:SerializedName("refresh_token")
        val refresh_token:String? = null,

        @field:SerializedName("expires_in")
        val expires_in:Int? = null,

        @field:SerializedName("scope")
        val scope:String? = null,

        @field:SerializedName("principal")
        val principal:String? = null
)