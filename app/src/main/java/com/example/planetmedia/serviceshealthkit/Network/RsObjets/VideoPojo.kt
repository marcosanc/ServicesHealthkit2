package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 08/01/2018.
 */
data class VideoPojo (

        @field:SerializedName("baseUrl")
        val baseUrl:String? = null,

        @field:SerializedName("views")
        val views:Int? = null
)