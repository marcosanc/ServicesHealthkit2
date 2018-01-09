package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 08/01/2018.
 */
data class ResponseMeMedicalDevice (

        @field:SerializedName("id")
        val id:Int?=null,

        @field:SerializedName("medicalDeviceCode")
        val medicalDeviceCode:String?=null,

        @field:SerializedName("macAddress")
        val macAddress:String?=null
)