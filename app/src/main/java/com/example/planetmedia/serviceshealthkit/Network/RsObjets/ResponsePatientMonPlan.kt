package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class ResponsePatientMonPlan (

        @field:SerializedName("id")
        val id:Int?=null,

        @field:SerializedName("publicName")
        val publicName:String?=null,

        @field:SerializedName("startingDate")
        val startingDate:String?=null,

        @field:SerializedName("numberOfSteps")
        val numberOfSteps:Int?=null,

        @field:SerializedName("healthIndicators")
        val healthIndicators:HealthIndicatorsPojo?=null,

        @field:SerializedName("diseases")
        val diseases:DiseasesPojo?=null,

        @field:SerializedName("healthCoach")
        val healthCoach:HealthCoachPojo?=null
)