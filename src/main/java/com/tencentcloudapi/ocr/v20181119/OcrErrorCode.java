package com.tencentcloudapi.ocr.v20181119;
public enum OcrErrorCode {
     /* File download failed. */
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownLoadError"),
     
     /* Image decoding failed. */
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
     /* OCR failed. This error may be caused by unstable network connections,service anomalies or other issues. */
     FAILEDOPERATION_OCRFAILED("FailedOperation.OcrFailed"),
     
     /* Unknown error. */
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
     /* The service is not activated. */
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
     /* Incorrect parameter value. */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
     /* The file is too large. */
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
     /* The account is in arrears. */
     RESOURCEUNAVAILABLE_INARREARS("ResourceUnavailable.InArrears"),
     
     /* Exceptional billing status. */
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

