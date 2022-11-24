package com.tencentcloudapi.tts.v20190823;
public enum TtsErrorCode {
    // Invalid authorization.
     AUTHFAILURE_INVALIDAUTHORIZATION("AuthFailure.InvalidAuthorization"),
     
    // Invalid route.
     INTERNALERROR_ERRORGETROUTE("InternalError.ErrorGetRoute"),
     
    // Traffic is throttled due to high load.
     INTERNALERROR_EXCEEDMAXLIMIT("InternalError.ExceedMaxLimit"),
     
    // Internal error.
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
    // The request text contains invalid characters.
     INVALIDPARAMETER_INVALIDTEXT("InvalidParameter.InvalidText"),
     
    // Invalid `AppId`. See the description of `AppId`.
     INVALIDPARAMETERVALUE_APPID("InvalidParameterValue.AppId"),
     
    // The `APPID` is not registered. Activate the service in the TTS console (https://console.cloud.tencent.com/tts) first.
     INVALIDPARAMETERVALUE_APPIDNOTREGISTERED("InvalidParameterValue.AppIdNotRegistered"),
     
    // Invalid `Codec`. See the description of `Codec`.
     INVALIDPARAMETERVALUE_CODEC("InvalidParameterValue.Codec"),
     
    // The number part of the `say-as` tag of SSML is not a valid constant, which can only contain digits, ",", ".", and " " when the tag attribute is `cardinal`, `currency`, or `address`.
     INVALIDPARAMETERVALUE_ERRORCARDINALFORMAT("InvalidParameterValue.ErrorCardinalFormat"),
     
    // The request text contains invalid characters, or it contains no valid characters.
     INVALIDPARAMETERVALUE_INVALIDTEXT("InvalidParameterValue.InvalidText"),
     
    // Parameter missing.
     INVALIDPARAMETERVALUE_MISSPARAMETERS("InvalidParameterValue.MissParameters"),
     
    // Error in text segmentation.
     INVALIDPARAMETERVALUE_PARTICIPLEERROR("InvalidParameterValue.ParticipleError"),
     
    // Invalid `PrimaryLanguage`. See the description of `PrimaryLanguage`.
     INVALIDPARAMETERVALUE_PRIMARYLANGUAGE("InvalidParameterValue.PrimaryLanguage"),
     
    // Invalid SSML tag.
     INVALIDPARAMETERVALUE_SSMLINVALID("InvalidParameterValue.SSMLInvalid"),
     
    // Invalid `SampleRate`. See the description of `SampleRate`.
     INVALIDPARAMETERVALUE_SAMPLERATE("InvalidParameterValue.SampleRate"),
     
    // Invalid `SessionId`. See the description of `SessionId`.
     INVALIDPARAMETERVALUE_SESSIONID("InvalidParameterValue.SessionId"),
     
    // Invalid `Speed`. See the description of `Speed`.
     INVALIDPARAMETERVALUE_SPEED("InvalidParameterValue.Speed"),
     
    // Text missing.
     INVALIDPARAMETERVALUE_TEXT("InvalidParameterValue.Text"),
     
    // Empty text.
     INVALIDPARAMETERVALUE_TEXTEMPTY("InvalidParameterValue.TextEmpty"),
     
    // The text is not encoded in UTF8.
     INVALIDPARAMETERVALUE_TEXTNOTUTF8("InvalidParameterValue.TextNotUtf8"),
     
    // Invalid `Type`.
     INVALIDPARAMETERVALUE_TYPE("InvalidParameterValue.Type"),
     
    // Invalid `VoiceType`. See the description of `VoiceType`.
     INVALIDPARAMETERVALUE_VOICETYPE("InvalidParameterValue.VoiceType"),
     
    // Invalid `Volume`. See the description of `Volume`.
     INVALIDPARAMETERVALUE_VOLUME("InvalidParameterValue.Volume"),
     
    // The request frequency exceeds the limit.
     LIMITEXCEEDED_ACCESSLIMIT("LimitExceeded.AccessLimit"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // Overdue payment exists.
     UNSUPPORTEDOPERATION_ACCOUNTARREARS("UnsupportedOperation.AccountArrears"),
     
    // Authentication expired.
     UNSUPPORTEDOPERATION_AUTHORIZATIONEXPIRED("UnsupportedOperation.AuthorizationExpired"),
     
    // Authentication failed.
     UNSUPPORTEDOPERATION_AUTHORIZATIONFAILED("UnsupportedOperation.AuthorizationFailed"),
     
    // Service prohibited.
     UNSUPPORTEDOPERATION_FORBIDDENUSE("UnsupportedOperation.ForbiddenUse"),
     
    // Free tier is used up.
     UNSUPPORTEDOPERATION_NOFREEACCOUNT("UnsupportedOperation.NoFreeAccount"),
     
    // The resource package is used up.
     UNSUPPORTEDOPERATION_PKGEXHAUSTED("UnsupportedOperation.PkgExhausted"),
     
    // Server opened.
     UNSUPPORTEDOPERATION_SERVERALREADYOPEN("UnsupportedOperation.ServerAlreadyOpen"),
     
    // The service is already terminated.
     UNSUPPORTEDOPERATION_SERVERDESTORYED("UnsupportedOperation.ServerDestoryed"),
     
    // Service inactivated.
     UNSUPPORTEDOPERATION_SERVERNOTOPEN("UnsupportedOperation.ServerNotOpen"),
     
    // Service stopped.
     UNSUPPORTEDOPERATION_SERVERSTOPPED("UnsupportedOperation.ServerStopped"),
     
    // The text is too long. See the description of the request parameter `Text`.
     UNSUPPORTEDOPERATION_TEXTTOOLONG("UnsupportedOperation.TextTooLong");
     
    private String value;
    private TtsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

