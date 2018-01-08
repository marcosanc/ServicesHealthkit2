package com.example.planetmedia.serviceshealthkit.Network.RqObjets

/**
 * Created by ing.juanmejia on 08/01/18.
 */
data class PatientMonHealthIndicProgressRequest(
        var access_token: String="",
        var monitoringPlanId: String="",
        var health_indicator_id: String=""

)