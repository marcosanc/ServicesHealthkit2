package com.example.planetmedia.serviceshealthkit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.planetmedia.serviceshealthkit.Network.RqObjets.*
import com.example.planetmedia.serviceshealthkit.Network.RsObjets.*
import com.victoria.planetmedia.androidtabvictoria.network.ApiVictoriaCore
import com.victoria.planetmedia.androidtabvictoria.network.ApiVictoriaRPM
import com.victoria.planetmedia.androidtabvictoria.network.RqObjects.*
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
        disposable =  apisRPM.getCatalogGender(gender.access_token)
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

    fun invocarCatalogCountry(country: CountryRequest){
        disposable =  apisRPM.getCatalogCountry(country.access_token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarCountry(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarCountry(lcountry:List<ResponseCatalogCountry> ){

        Log.i("taml", lcountry.size.toString())

    }

    fun invocarCatalogMedicalDevice(mdevice: MedicalDeviceGetRequest){
        disposable =  apisRPM.getCatalogdicalDevice(mdevice.access_token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarMDevice(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarMDevice(ldevice:List<ResponseCatalogMedicalDevice> ){

        Log.i("taml", ldevice.size.toString())

    }

    fun invocarMeActivity(mactivity: ActivityRequest){
        disposable =  apisRPM.getMeActivity(mactivity.access_token, mactivity.filter_by, mactivity.date, mactivity.page, mactivity.per_page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarMeActivity(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarMeActivity(lactivity:List<ResponseMeActivity> ){

        Log.i("taml", lactivity.size.toString())

    }

    fun invocarActivityId(activityid: ActivityIdRequest){
        disposable =  apisRPM.getActivityId(activityid.access_token, activityid.activityId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarActivityId(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarActivityId(lactivity:ResponseActivatityId ){

        Log.i("taml", lactivity.toString())

    }

    fun invocarMeMedicalDevice(medicaldevice: ActivityRequest){
        disposable =  apisRPM.getMeMedicalDevice(medicaldevice.access_token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarMeMedicalDevice(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarMeMedicalDevice(medicaldev:List<ResponseMeMedicalDevice> ){

        Log.i("taml", medicaldev.size.toString())

    }

    fun invocarMeMedicalDeviceId(medicaldeviceid: MedicalDevIdHealthGetRequest){
        disposable =  apisRPM.getmedicalDeviceId(medicaldeviceid.access_token, medicaldeviceid.period, medicaldeviceid.medicalDeviceId, medicaldeviceid.health_indicator_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarMedicalDeviceId(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarMedicalDeviceId(medicaldevid:List<ResponseMedicalDeviceId> ){

        Log.i("taml", medicaldevid.size.toString())

    }

    fun invocarMeMedicalDeviceIdIndicator(indicator: MedicalDevIdHealthIndicatorGetReqst){
        disposable =  apisRPM.getMeMedicalDeviceIdIndicador(indicator.access_token, indicator.medicalDeviceId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarMedicalDeviceIdIndicator(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarMedicalDeviceIdIndicator(deviceindicator:List<ResponseMedicalDeviceIdIndicator> ){

        Log.i("taml", deviceindicator.size.toString())

    }

    fun invocarPatientHealthIndicProgress(patientprogress: PatientMonHealthIndicProgressRequest){
        disposable =  apisRPM.getPatientHealthIndicProgress(patientprogress.access_token, patientprogress.monitoringPlanId, patientprogress.health_indicator_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarPatientHealthIndicProgress(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarPatientHealthIndicProgress(indicprogress:List<ResponsePatientHealthIndicProgress> ){

        Log.i("taml", indicprogress.size.toString())

    }

    fun invocarPatientMonPlanIdProgress(patmonprogress: PatientMonProgressRequest){
        disposable =  apisRPM.getPatientMonPlanIdProgress(patmonprogress.access_token, patmonprogress.patientMonitoringPlanId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarPatientMonPlanIdProgress(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarPatientMonPlanIdProgress(monprogress:ResponsePatientMonPlanIdProgress ){

        Log.i("taml", monprogress.toString())

    }

    fun invocarPatientMonPlan(monplan: PatientMoniPlanRequest){
        disposable =  apisRPM.getPatientMonPlan(monplan.access_token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarPatientMonPlan(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarPatientMonPlan(patientm:List<ResponsePatientMonPlan>){

        Log.i("taml", patientm.size.toString())

    }

    fun invocarWorkingHours(working: CandidatesIdWorkingHoursRequest){
        disposable =  apisRPM.getWorkingHours(working.access_token, working.candidateId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> usarWorkingHours(result)},
                        { error -> Log.d("error",error.message) }
                )

    }

    fun  usarWorkingHours(whours:List<ResponseWorkingHours>){

        Log.i("taml", whours.size.toString())

    }

}

