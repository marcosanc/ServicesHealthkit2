package com.chilangolabs.victoria.network.RqObjects

import com.google.gson.annotations.SerializedName

data class QRJsonActivation(

        @field:SerializedName("tokenType")
        val tokenType: String? = null,

        @field:SerializedName("token")
        val token: String? = null
)