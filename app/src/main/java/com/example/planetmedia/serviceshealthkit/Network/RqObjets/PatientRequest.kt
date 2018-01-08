package com.victoria.planetmedia.androidtabvictoria.network.RqObjects

/**
 * Created by PLANETMEDIA on 03/01/2018.
 */
data class PatientRequest (
        var temporal_token:String="",
        var PatientPOST:paciente=paciente()
) {
    data class paciente(
            var username: String = "",
            var name: String = "",
            var firstSurname: String = "",
            var secondSurname: String = "",
            var email: String = "",
            var gender: String = "FEMALE",
            var birthdate: String = "",
            var countryOfBirthCode: String = "",
            var candidateId: Int = 0

    )
}