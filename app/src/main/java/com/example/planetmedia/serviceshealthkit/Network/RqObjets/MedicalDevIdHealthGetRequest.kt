package com.victoria.planetmedia.androidtabvictoria.network.RqObjects

/**
 * Created by ing.juanmejia on 08/01/18.
 */
data class MedicalDevIdHealthGetRequest(

        var access_token: String="",
        var period: String="",
        var medicalDeviceId: String="",
        var health_indicator_id: String= ""


)