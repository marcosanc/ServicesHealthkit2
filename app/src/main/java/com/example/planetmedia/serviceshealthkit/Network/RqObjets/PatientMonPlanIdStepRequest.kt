package com.example.planetmedia.serviceshealthkit.Network.RqObjets

/**
 * Created by ing.juanmejia on 08/01/18.
 */
data class PatientMonPlanIdStepRequest(
        var access_token:String="",
        var monitoring: String="",
        var stepPOST: stepPost= stepPost()
)
{
data class stepPost (
        var actionId: Int=0,
        var mediaId: Int=0,
        var actionTypeId: Int=0,
        var scheduledDate: String="",
        var statementId: Int=0,
        var multimediaId: Int=0,
        var description: String=""

)}