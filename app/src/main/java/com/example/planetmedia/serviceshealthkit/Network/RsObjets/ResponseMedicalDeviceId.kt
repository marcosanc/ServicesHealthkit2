package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 08/01/2018.
 */
data class ResponseMedicalDeviceId (

        @field:SerializedName("id")
        val id:Int?=null,

        @field:SerializedName("healthIndicator")
        val healthIndicator:HealthIndicatorPojo?=null,

        @field:SerializedName("measurement")
        val measurement:Int?=null,

        @field:SerializedName("measurementDate")
        val measurementDate:String?=null
)