package com.victoria.planetmedia.androidtabvictoria.network.RqObjects

/**
 * Created by planetmedia on 14/12/17.
 */
data class QRCodePojo(
        var token:String = "",
        var tokenType:String = "",
        var candidateId:String = "",
        var activationCodeId:String = ""
)