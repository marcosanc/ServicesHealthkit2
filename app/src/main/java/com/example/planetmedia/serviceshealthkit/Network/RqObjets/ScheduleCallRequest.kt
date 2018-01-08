package com.victoria.planetmedia.androidtabvictoria.network.RqObjects

/**
 * Created by PLANETMEDIA on 03/01/2018.
 */
data class SchedulleCallRequest (
    var access_token: String="",
    var candidateld: String="",
    var ScheduleCallPOST: ScheduleCallPost=ScheduleCallPost()
) {


    data class ScheduleCallPost(
            var startingTime: String = "",
            var endingTime: String = ""
    )
}