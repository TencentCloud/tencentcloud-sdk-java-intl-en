package com.tencentcloudapi.ocr.v20181119;
public enum OcrErrorCode {
     /* The CardSide type of the ID card is incorrect. */
     FAILEDOPERATION_CARDSIDEERROR("FailedOperation.CardSideError"),
     
     /* File download failed. */
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownLoadError"),
     
     /* The image is empty. */
     FAILEDOPERATION_EMPTYIMAGEERROR("FailedOperation.EmptyImageError"),
     
     /* Recognition by the engine timed out. */
     FAILEDOPERATION_ENGINERECOGNIZETIMEOUT("FailedOperation.EngineRecognizeTimeout"),
     
     /* The field value does not meet expectations. */
     FAILEDOPERATION_FIELDEXCEPTION("FailedOperation.FieldException"),
     
     /* The ID card information (ID number, name, etc.) is invalid. */
     FAILEDOPERATION_IDCARDINFOILLEGAL("FailedOperation.IdCardInfoIllegal"),
     
     /* The resolution of the image is too low or the proportion of the ID card in the image is too small. */
     FAILEDOPERATION_IDCARDTOOSMALL("FailedOperation.IdCardTooSmall"),
     
     /* Invalid bank card information. */
     FAILEDOPERATION_ILLEGALBANKCARDERROR("FailedOperation.IllegalBankCardError"),
     
     /* The image is blurry. */
     FAILEDOPERATION_IMAGEBLUR("FailedOperation.ImageBlur"),
     
     /* Image decoding failed. */
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
     /* No ID card is detected in the image. */
     FAILEDOPERATION_IMAGENOIDCARD("FailedOperation.ImageNoIdCard"),
     
     /* The card in the image is not of the specified type. */
     FAILEDOPERATION_IMAGENOSPECIFIEDCARD("FailedOperation.ImageNoSpecifiedCard"),
     
     /* No text is detected in the image. */
     FAILEDOPERATION_IMAGENOTEXT("FailedOperation.ImageNoText"),
     
     /* The image size is too large. refer to the image size limit in the reference input. */
     FAILEDOPERATION_IMAGESIZETOOLARGE("FailedOperation.ImageSizeTooLarge"),
     
     /* The information in the visual zone does not match that in the machine-readable zone. */
     FAILEDOPERATION_INCONSISTENCYBETWEENMRZANDVRZ("FailedOperation.InconsistencyBetweenMRZAndVRZ"),
     
     /* The input language is not supported. */
     FAILEDOPERATION_LANGUAGENOTSUPPORT("FailedOperation.LanguageNotSupport"),
     
     /* There are multiple cards in the photo. */
     FAILEDOPERATION_MULTICARDERROR("FailedOperation.MultiCardError"),
     
     /* No bank card found. */
     FAILEDOPERATION_NOBANKCARDERROR("FailedOperation.NoBankCardError"),
     
     /* Not a Hong Kong identity card. */
     FAILEDOPERATION_NOHKIDCARD("FailedOperation.NoHKIDCard"),
     
     /* Non-Malaysian ID cards. */
     FAILEDOPERATION_NOMASIDCARD("FailedOperation.NoMASIDCard"),
     
     /* Not a passport. */
     FAILEDOPERATION_NOPASSPORT("FailedOperation.NoPassport"),
     
     /* OCR failed. This error may be caused by unstable network connections,service anomalies or other issues. */
     FAILEDOPERATION_OCRFAILED("FailedOperation.OcrFailed"),
     
     /* Unknown error. */
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
     /* The service is not activated. */
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
     /* Warning service error. */
     FAILEDOPERATION_WARNINGSERVICEFAILED("FailedOperation.WarningServiceFailed"),
     
     /* Config is not in valid JSON format. */
     INVALIDPARAMETER_CONFIGFORMATERROR("InvalidParameter.ConfigFormatError"),
     
     /* Image decoding failed. */
     INVALIDPARAMETER_ENGINEIMAGEDECODEFAILED("InvalidParameter.EngineImageDecodeFailed"),
     
     /* The size of the image file content is abnormal. */
     INVALIDPARAMETERVALUE_INVALIDFILECONTENTSIZE("InvalidParameterValue.InvalidFileContentSize"),
     
     /* Incorrect parameter value. */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
     /* The file is too large. */
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
     /* Image file download failed. */
     RESOURCEUNAVAILABLE_IMAGEDOWNLOADERROR("ResourceUnavailable.ImageDownloadError"),
     
     /* The account is in arrears. */
     RESOURCEUNAVAILABLE_INARREARS("ResourceUnavailable.InArrears"),
     
     /* The account resource package is exhausted. */
     RESOURCEUNAVAILABLE_RESOURCEPACKAGERUNOUT("ResourceUnavailable.ResourcePackageRunOut"),
     
     /* Exceptional billing status. */
     RESOURCESSOLDOUT_CHARGESTATUSEXCEPTION("ResourcesSoldOut.ChargeStatusException"),
     
     /* Unrecognized argument. */
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private OcrErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

