package com.example.planetmedia.serviceshealthkit.Network.RsObjets

import com.google.gson.annotations.SerializedName

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class DiseasesPojo (

        @field:SerializedName("diseaseCode")
        val diseaseCode:String?=null,

        @field:SerializedName("diseaseName")
        val diseaseName:String?=null
)