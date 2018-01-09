package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class ResponsePatientMonPlanIdProgress (

        @field:SerializedName("progress")
        val progress:Int?=null,

        @field:SerializedName("accomplished")
        val accomplished:Int?=null
)