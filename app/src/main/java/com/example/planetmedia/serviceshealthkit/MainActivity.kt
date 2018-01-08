package com.example.planetmedia.serviceshealthkit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.planetmedia.serviceshealthkit.Network.RqObjets.GenderRequest
import com.example.planetmedia.serviceshealthkit.Network.RsObjets.ResponseCatalogGender
import com.victoria.planetmedia.androidtabvictoria.network.ApiVictoriaCore
import com.victoria.planetmedia.androidtabvictoria.network.ApiVictoriaRPM
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {


    val apisRPM by lazy {
        ApiVictoriaRPM.create()
    }
    var disposable: Disposable? = null


    val apisCore by lazy {
        ApiVictoriaCore.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun invocarCatalogGender(gender: GenderRequest){
        disposable =  apisRPM.getCtalogGender(gender.access_token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarObjeto(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarObjeto(lgender:List<ResponseCatalogGender> ){

               Log.i("taml", lgender.size.toString())

    }
}

