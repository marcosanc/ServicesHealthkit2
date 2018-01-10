package com.example.planetmedia.serviceshealthkit.Network.RqObjets

/**
 * Created by PLANETMEDIA on 09/01/2018.
 */
data class ScheduleCallRequest (
        var access_token: String="",
        var candidateld: String="",
        var ScheduleCallPOST: ScheduleCallPost=ScheduleCallPost()
) {


    data class ScheduleCallPost(
            var startingTime: String = "",
            var endingTime: String = ""
    )
}