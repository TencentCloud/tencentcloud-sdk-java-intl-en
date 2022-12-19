package com.tencentcloudapi.ocr.v20181119;
public enum OcrErrorCode {
    // File download failed.
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownLoadError"),
     
    // The image is empty.
     FAILEDOPERATION_EMPTYIMAGEERROR("FailedOperation.EmptyImageError"),
     
    // Recognition by the engine timed out.
     FAILEDOPERATION_ENGINERECOGNIZETIMEOUT("FailedOperation.EngineRecognizeTimeout"),
     
    // Invalid bank card information.
     FAILEDOPERATION_ILLEGALBANKCARDERROR("FailedOperation.IllegalBankCardError"),
     
    // The image is blurry.
     FAILEDOPERATION_IMAGEBLUR("FailedOperation.ImageBlur"),
     
    // Image decoding failed.
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
    // No text is detected in the image.
     FAILEDOPERATION_IMAGENOTEXT("FailedOperation.ImageNoText"),
     
    // The image is too large. Please see the description of image size limit in the output parameters.
     FAILEDOPERATION_IMAGESIZETOOLARGE("FailedOperation.ImageSizeTooLarge"),
     
    // The input language is not supported.
     FAILEDOPERATION_LANGUAGENOTSUPPORT("FailedOperation.LanguageNotSupport"),
     
    // No bank card found.
     FAILEDOPERATION_NOBANKCARDERROR("FailedOperation.NoBankCardError"),
     
    // Not a Hong Kong identity card.
     FAILEDOPERATION_NOHKIDCARD("FailedOperation.NoHKIDCard"),
     
    // Non-Malaysian ID cards.
     FAILEDOPERATION_NOMASIDCARD("FailedOperation.NoMASIDCard"),
     
    // Not a passport.
     FAILEDOPERATION_NOPASSPORT("FailedOperation.NoPassport"),
     
    // OCR failed.
     FAILEDOPERATION_OCRFAILED("FailedOperation.OcrFailed"),
     
    // Unknown error.
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
    // The service is not activated.
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
    // Image decoding failed.
     INVALIDPARAMETER_ENGINEIMAGEDECODEFAILED("InvalidParameter.EngineImageDecodeFailed"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
    // The file is too large.
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
    // Exceptional billing status.
     RESOURCESSOLDOUT_CHARGESTATUSEXCEPTION("ResourcesSoldOut.ChargeStatusException");
     
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

