package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 10/01/2018.
 */
data class ResponseAnonimusPatient (

        @field:SerializedName("id")
        val id:Int? = null,

        @field:SerializedName("username")
        val username:String? = null,

        @field:SerializedName("password")
        val password:Int? = null
)