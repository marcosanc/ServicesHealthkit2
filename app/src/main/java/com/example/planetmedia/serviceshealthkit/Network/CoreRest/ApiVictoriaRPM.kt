package com.victoria.planetmedia.androidtabvictoria.network
import com.chilangolabs.victoria.network.RsObjects.ResponseActivationCode
import com.chilangolabs.victoria.network.RsObjects.ResponseLoginOauthToken
import com.example.planetmedia.serviceshealthkit.Network.RsObjets.ResponseCatalogGender
import com.victoria.planetmedia.androidtabvictoria.network.RqObjects.RecoverPasswordBody
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface ApiVictoriaRPM {

    @GET("anonymous/activation-code/{activationCodeId}")
    fun getActivationCode(@Path(value = "activationCodeId", encoded = true) activationCode: String, @Query("temporal_token") token: String): Observable<ResponseActivationCode>


    @GET("/catalog/gender")
    fun getCtalogGender(@Query("access_token") token: String): Observable<List<ResponseCatalogGender>>




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