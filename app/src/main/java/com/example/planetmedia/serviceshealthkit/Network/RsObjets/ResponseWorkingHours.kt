package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class ResponseWorkingHours (

        @field:SerializedName("day")
        val day:Int?=null,

        @field:SerializedName("startingWorkHour")
        val startingWorkHour:String?=null,

        @field:SerializedName("endingWorkHour")
        val endingWorkHour:String?=null
)