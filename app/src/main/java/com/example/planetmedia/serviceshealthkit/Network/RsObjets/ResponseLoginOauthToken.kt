package com.chilangolabs.victoria.network.RsObjects

import com.google.gson.annotations.SerializedName

data class ResponseLoginOauthToken(

        @field:SerializedName("access_token")
        val accessToken: String? = null,

        @field:SerializedName("principal")
        val principal: Principal? = null,

        @field:SerializedName("refresh_token")
        val refreshToken: String? = null,

        @field:SerializedName("scope")
        val scope: String? = null,

        @field:SerializedName("token_type")
        val tokenType: String? = null,

        @field:SerializedName("expires_in")
        val expiresIn: Int? = null
) {
    data class Principal(

            @field:SerializedName("name")
            val name: String? = null,

            @field:SerializedName("secondSurname")
            val secondSurname: String? = null,

            @field:SerializedName("statuses")
            val statuses: List<String?>? = null,

            @field:SerializedName("pendingEmail")
            val pendingEmail: String? = null,

            @field:SerializedName("firstSurname")
            val firstSurname: String? = null,

            @field:SerializedName("email")
            val email: String? = null,

            @field:SerializedName("username")
            val username: String? = null
    )
}