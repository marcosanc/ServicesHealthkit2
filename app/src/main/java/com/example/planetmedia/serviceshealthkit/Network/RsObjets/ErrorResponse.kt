package com.chilangolabs.victoria.network.RsObjects

import com.google.gson.annotations.SerializedName

data class ErrorResponse(

        @field:SerializedName("code")
        val code: String? = null,

        @field:SerializedName("message")
        val message: String? = null
)