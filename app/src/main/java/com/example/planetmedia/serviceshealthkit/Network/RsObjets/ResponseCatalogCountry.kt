package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 08/01/2018.
 */
data class ResponseCatalogCountry (

        @field:SerializedName("isoCode")
        val isoCodigo:String?=null,

        @field:SerializedName("dialCode")
        val dialCodigo:String?=null
)