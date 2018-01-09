package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class ResponseStatement (

        @field:SerializedName("name")
        val name:String?=null,

        @field:SerializedName("subject")
        val subject:String?=null,

        @field:SerializedName("code")
        val code:String?=null,

        @field:SerializedName("template")
        val template:String?=null,

        @field:SerializedName("tags")
        val tags:TagsPojo?=null,

        @field:SerializedName("modification_user")
        val modification_user:ModificationUserPojo?=null,

        @field:SerializedName("modification_date")
        val modification_date:String?=null

)