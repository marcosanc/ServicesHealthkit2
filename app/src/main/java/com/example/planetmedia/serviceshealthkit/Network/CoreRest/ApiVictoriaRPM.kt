package com.victoria.planetmedia.androidtabvictoria.network
import com.chilangolabs.victoria.network.RsObjects.ResponseActivationCode
import com.example.planetmedia.serviceshealthkit.Network.RqObjets.PatientMonHealthIndGoalRequest
import com.example.planetmedia.serviceshealthkit.Network.RqObjets.ScheduleCallRequest
import com.example.planetmedia.serviceshealthkit.Network.RsObjets.*
import com.victoria.planetmedia.androidtabvictoria.network.RqObjects.MedicalDevIdHealthPostRequest
import com.victoria.planetmedia.androidtabvictoria.network.RqObjects.MedicalDevicePostRequest
import com.victoria.planetmedia.androidtabvictoria.network.RqObjects.RecoverPasswordBodyRequest
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface ApiVictoriaRPM {

    @GET("anonymous/activation-code/{activationCodeId}")
    fun getActivationCode(@Path(value = "activationCodeId", encoded = true) activationCode: String, @Query("temporal_token") token: String): Observable<ResponseActivationCode>

    @GET("/anonymous/access-code")
    fun getAccessCode(@Query("tempotal_token") token: String): Observable<ResponseAccessCode>

    @GET("/catalog/gender")
    fun getCatalogGender(@Query("access_token") token: String): Observable<List<ResponseCatalogGender>>

    @GET("/catalog/country")
    fun getCatalogCountry(@Query("access_token") token: String): Observable<List<ResponseCatalogCountry>>

    @GET("/catalog/medical-device")
    fun getCatalogdicalDevice(@Query("access_token") token: String): Observable<List<ResponseCatalogMedicalDevice>>

    @GET("/me/activity")
    fun getMeActivity(@Query("access_token") token: String, @Query("filter_by") filter_by:String, @Query("date") date:String, @Query("page") page:String, @Query("per_page") per_page:String): Observable<List<ResponseMeActivity>>

    @GET("/activity/{activityId}")
    fun getActivityId(@Path(value = "activityId ", encoded = true) activityId : String, @Query("access_token ") token: String): Observable<ResponseActivatityId>

    @GET("/me/medical-device")
    fun getMeMedicalDevice(@Query("access_token") token: String): Observable<List<ResponseMeMedicalDevice>>

    @GET("/medical-device/{medicalDeviceId}/health-indicator-measurement")
    fun getmedicalDeviceId(@Query("access_token") token: String, @Query("period") period:String, @Path(value = "medicalDeviceId ", encoded = true) medicalDeviceId : String, @Query("health_indicator_id") health_indicator_id: String): Observable<List<ResponseMedicalDeviceId>>

    @GET("/medical-device/{medicalDeviceId}/health-indicator")
    fun getMeMedicalDeviceIdIndicador(@Query("access_token") token: String, @Path(value = "medicalDeviceId ", encoded = true) medicalDeviceId : String): Observable<List<ResponseMedicalDeviceIdIndicator>>

    @GET("/patient-monitoring-plan/{monitoringPlanId}/health-indicator-progress")
    fun getPatientHealthIndicProgress(@Query("access_token") token: String, @Path(value = "monitoringPlanId", encoded = true) monitoringPlanId : String, @Query("health_indicator_id ") health_indicator_id : String): Observable<List<ResponsePatientHealthIndicProgress>>

    @GET("/patient-monitoring-plan/{patientMonitoringPlanId}/progress")
    fun getPatientMonPlanIdProgress(@Query("access_token") token: String, @Path(value = "patientMonitoringPlanId", encoded = true) patientMonitoringPlanId  : String): Observable<ResponsePatientMonPlanIdProgress>

    //@GET("/medical-device/{medicalDeviceId}/health-indicator")
    //fun getHealthIndicator(@Query("access_token") token: String, @Path(value = "medicalDeviceId", encoded = true) medicalDeviceId : String): Observable<List<ResponseHealthIndicator>>

    @GET("/me/patient-monitoring-plan")
    fun getPatientMonPlan(@Query("access_token") token: String): Observable<List<ResponsePatientMonPlan>>

    @GET("/candidates/{candidateId}/working-hours")
    fun getWorkingHours(@Query("access_token") token: String, @Path(value = "candidateId", encoded = true) candidateId : String): Observable<List<ResponseWorkingHours>>

    //ServicesPOST

    @POST("/anonymous/recover-password")
    fun getRecoverPassword(@Body RecoverPasswordPOST: RecoverPasswordBodyRequest): Observable<ResponseRecoverPassword>

    @POST("/me/defective-device")
    fun getDefectiveDevice(@Query("access_token ") token: String): Observable<ResponseDefectiveDevice>

    @POST("/me/medical-device")
    fun getMedicalDevicePost(@Query("access_token ") token: String, @Body MedicalDevicePOST :MedicalDevicePostRequest): Observable<ResponseMedicalDevicePost>

    @POST("/candidates/{candidateId}/schedule-call")
    fun getScheduleCall(@Query("access_token ") token: String,@Path(value = "candidateId", encoded = true) candidateId : String, @Body ScheduleCallPOST : ScheduleCallRequest): Observable<ResponseScheduleCall>

    @POST("/activity/{activityId}/accomplish")
    fun getAccomplish(@Query("access_token ") token: String,@Path(value = "activityId", encoded = true) activityId : String): Observable<ResponseAccomplish>

    @POST("/medical-device/{medicalDeviceId}/health-indicator-measurement")
    fun getHealthIndicMeasurement(@Query("access_token ") token: String, @Path(value = "medicalDeviceId", encoded = true) medicalDeviceId : String, @Body HealthIndicatorMeasurementPOST : MedicalDevIdHealthPostRequest): Observable<ResponseHealthIndicMeasurement>

    @POST("/patient-monitoring-plan/{monitoringPlanId}/health-indicator-goal")
    fun getHealthIndicGoal(@Query("access_token ") token: String, @Path(value = "monitoringPlanId ", encoded = true) monitoringPlanId  : String, @Body HealthIndicatorGoalPOST : PatientMonHealthIndGoalRequest): Observable<ResponseHealthIndicatorGoal>



    companion object objVictoriaRPM {

        fun create(): ApiVictoriaRPM {
            val  baseUrl = "http://dev.e-ht.com.mx/eht-rpm-rest/"

            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(baseUrl)
                    .build()
            return  retrofit.create(ApiVictoriaRPM::class.java)
        }

    }

}