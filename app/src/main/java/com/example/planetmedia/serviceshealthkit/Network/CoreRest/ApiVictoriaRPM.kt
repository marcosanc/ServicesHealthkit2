package com.victoria.planetmedia.androidtabvictoria.network
import com.chilangolabs.victoria.network.RsObjects.ResponseActivationCode
import com.example.planetmedia.serviceshealthkit.Network.RsObjets.*
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