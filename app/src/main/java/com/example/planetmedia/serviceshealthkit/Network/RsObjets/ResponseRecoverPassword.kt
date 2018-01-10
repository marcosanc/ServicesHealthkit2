package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class ResponseRecoverPassword (

        @field:SerializedName("code")
        val code:String?=null,

        @field:SerializedName("message")
        val message:String?=null
)