package com.victoria.planetmedia.androidtabvictoria.network.RqObjects

/**
 * Created by PLANETMEDIA on 03/01/2018.
 */
data class MedicalDevicePostRequest (
    var access_token:String="",
    var MedicalDevicePOST:MedicalDevice=MedicalDevice()
) {
    data class MedicalDevice(
            var serialNumber: String = "",
            var macAddress: String = "",
            var medicalDeviceId: Int = 0
    )
}