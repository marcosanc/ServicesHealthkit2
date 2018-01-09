package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class ResponsePatientHealthIndicProgress(

        @field:SerializedName("healthIndicator")
        val healthIndicator:HealthIndicatorPojo?=null,

        @field:SerializedName("initialMeasurement")
        val initialMeasurement:Int?=null,

        @field:SerializedName("lastMeasurement")
        val lastMeasurement:Int?=null,

        @field:SerializedName("measurementGoal")
        val measurementGoal:Int?=null,

        @field:SerializedName("progress")
        val progress:Int?=null
)