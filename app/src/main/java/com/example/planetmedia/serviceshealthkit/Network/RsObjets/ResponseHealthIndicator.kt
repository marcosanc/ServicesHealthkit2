package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class ResponseHealthIndicator (

        @field:SerializedName("id")
        val id:Int?=null,

        @field:SerializedName("name")
        val name:String?=null,

        @field:SerializedName("measureUnit")
        val measureUnit:String?=null
)