package com.tencentcloudapi.lke.v20231130;
public enum LkeErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /* File download failure. */
     FAILEDOPERATION_DOWNLOADERROR("FailedOperation.DownLoadError"),
     
     /* File decoding failure. */
     FAILEDOPERATION_FILEDECODEFAILED("FailedOperation.FileDecodeFailed"),
     
     /* Image decoding failed. */
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
     /* Unknown error. */
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
     /* Unknown file type. */
     FAILEDOPERATION_UNKNOWFILETYPEERROR("FailedOperation.UnKnowFileTypeError"),
     
     /* The service is not activated. */
     FAILEDOPERATION_UNOPENERROR("FailedOperation.UnOpenError"),
     
     /*  */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* Parameter value error. */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUELIMIT("InvalidParameterValue.InvalidParameterValueLimit"),
     
     /* The file size is too large. */
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
     /* The account is in arrears. */
     RESOURCEUNAVAILABLE_INARREARS("ResourceUnavailable.InArrears"),
     
     /* The account resource package is exhausted. */
     RESOURCEUNAVAILABLE_RESOURCEPACKAGERUNOUT("ResourceUnavailable.ResourcePackageRunOut"),
     
     /* The billing status is abnormal. */
     RESOURCESSOLDOUT_CHARGESTATUSEXCEPTION("ResourcesSoldOut.ChargeStatusException");
     
    private String value;
    private LkeErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

