package com.example.planetmedia.serviceshealthkit.Network.RqObjets

/**
 * Created by ing.juanmejia on 08/01/18.
 */
data class PatientMonHealthIndGoalRequest(
        var access_token: String="",
        var monitoringPlanId: String="",
        var HealthIndicatorGoalPOST: GoalPOST= GoalPOST()

) {
    data class GoalPOST(

            var healthIndicatorId: Int = 0,
            var measurementGoal: Int = 0
    )
}