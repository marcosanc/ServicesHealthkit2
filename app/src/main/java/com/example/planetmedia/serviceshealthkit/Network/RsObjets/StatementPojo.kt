package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 08/01/2018.
 */
data class StatementPojo (

        @field:SerializedName("id")
        val id:Int? = null,

        @field:SerializedName("name")
        val name:String? = null,

        @field:SerializedName("subject")
        val subject:String? = null,

        @field:SerializedName("code")
        val code:String? = null
)