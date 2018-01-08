package com.chilangolabs.victoria.network.RsObjects

import com.google.gson.annotations.SerializedName

data class ResponseActivationCode(

        @field:SerializedName("birthdate")
        val birthdate: String? = null,

        @field:SerializedName("gender")
        val gender: String? = null,

        @field:SerializedName("countryOfBirthCode")
        val countryOfBirthCode: String? = null,

        @field:SerializedName("name")
        val name: String? = null,

        @field:SerializedName("secondSurname")
        val secondSurname: String? = null,

        @field:SerializedName("candidateId")
        val candidateId: Int? = null,

        @field:SerializedName("firstSurname")
        val firstSurname: String? = null,

        @field:SerializedName("email")
        val email: String? = null
)