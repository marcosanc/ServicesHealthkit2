package com.victoria.planetmedia.androidtabvictoria.network.RqObjects

/**
 * Created by ing.juanmejia on 08/01/18.
 */
data class MedicalDevIdHealthPostRequest(

        var access_token: String="",
        var medicalDeviceId: String="",
        var HealthIndicatorMeasurementPOST:IndicadorPOST= IndicadorPOST()
) {
    data class IndicadorPOST(

            var healthIndicatorId: Int = 0,
            var measurement: Int = 0,
            var measurementDate: String = "",
            var isInitialMeasurement: Boolean = true
    )
}