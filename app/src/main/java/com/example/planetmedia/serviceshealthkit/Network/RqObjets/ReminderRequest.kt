package com.example.planetmedia.serviceshealthkit.Network.RqObjets

/**
 * Created by ing.juanmejia on 08/01/18.
 */
data  class ReminderRequest (
        var access_token: String="",
        var healthCoachId: String="",
        var ReminderPOST: reminderPost= reminderPost()
) {

    data class reminderPost(
            var subject: String = "",
            var message: String = "",
            var scheduledDate: String = "2018-01-08T19:53:32.848Z",
            var reminderType: Int = 0,
            var referenceId: Int = 0

    )
}