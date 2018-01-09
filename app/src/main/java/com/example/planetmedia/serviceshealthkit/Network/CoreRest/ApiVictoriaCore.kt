package com.victoria.planetmedia.androidtabvictoria.network
import com.chilangolabs.victoria.network.RsObjects.ResponseLoginOauthToken
import com.example.planetmedia.serviceshealthkit.Network.RsObjets.ResponseAccessCode
import com.example.planetmedia.serviceshealthkit.Network.RsObjets.ResponseStatement
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface ApiVictoriaCore {

    @POST("oauth/token")
    fun loginOauth(@Header("Authorization") token: String = "Authorization", @Query("password") password: String, @Query("username") username: String, @Query("grant_type") grantType: String): Observable<ResponseLoginOauthToken>

    @GET("/statements/{statement}")
    fun getStatement(@Query("access_token") token: String, @Path(value = "statement", encoded = true) statement : String): Observable<ResponseStatement>




    companion object objVictoriaCore {

        fun create(): ApiVictoriaCore {
            val  baseUrl = "http://dev.e-ht.com.mx/eht-core-rest/"

            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(baseUrl)
                    .build()
            return  retrofit.create(ApiVictoriaCore::class.java)
        }

    }

}