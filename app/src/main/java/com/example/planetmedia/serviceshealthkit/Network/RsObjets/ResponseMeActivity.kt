package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 08/01/2018.
 */
data class ResponseMeActivity (

        @field:SerializedName("id")
        val id:Int? = null,

        @field:SerializedName("action")
        val action:String? = null,

        @field:SerializedName("actionType")
        val actionType:String? = null,

        @field:SerializedName("media")
        val media:String? = null,

        @field:SerializedName("description")
        val description:String? = null,

        @field:SerializedName("scheduledStartingTime")
        val scheduledStartingTime:String? = null,

        @field:SerializedName("scheduledEndingTime")
        val scheduledEndingTime:String? = null,

        @field:SerializedName("isEnabled")
        val isEnabled:Boolean? = null,

        @field:SerializedName("isFavorite")
        val isFavorite:Boolean? = null,

        @field:SerializedName("status")
        val status:String? = null
)