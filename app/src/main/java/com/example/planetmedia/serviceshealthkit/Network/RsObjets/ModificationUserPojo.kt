package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class ModificationUserPojo (

        @field:SerializedName("id")
        val id:Int?=null,

        @field:SerializedName("full_name")
        val full_name:String?=null
)