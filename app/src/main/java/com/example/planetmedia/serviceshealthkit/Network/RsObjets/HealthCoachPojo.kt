package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class HealthCoachPojo (

        @field:SerializedName("id")
        val id:Int?=null,

        @field:SerializedName("name")
        val name:String?=null,

        @field:SerializedName("firstSurname")
        val firstSurname:String?=null,

        @field:SerializedName("secondSurname")
        val secondSurname:String?=null
)