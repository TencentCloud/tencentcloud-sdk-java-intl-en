package com.tencentcloudapi.lkeap.v20240522;
public enum LkeapErrorCode {
     /* Operation failed. */
     FAILEDOPERATION("FailedOperation"),
     
     /*  */
     FAILEDOPERATION_FILEPARSEERROR("FailedOperation.FileParseError"),
     
     /*  */
     FAILEDOPERATION_FILEPARSETIMEOUT("FailedOperation.FileParseTimeout"),
     
     /*  */
     FAILEDOPERATION_INTERNALERROR("FailedOperation.InternalError"),
     
     /* Internal error. */
     INTERNALERROR("InternalError"),
     
     /* Parameter error. */
     INVALIDPARAMETER("InvalidParameter"),
     
     /*  */
     INVALIDPARAMETER_FILEURLINVALID("InvalidParameter.FileURLInvalid"),
     
     /*  */
     INVALIDPARAMETER_INVALIDFILEFORMAT("InvalidParameter.InvalidFileFormat"),
     
     /*  */
     INVALIDPARAMETER_INVALIDFILETYPE("InvalidParameter.InvalidFileType"),
     
     /* Exceeds the maximum file page limit. */
     LIMITEXCEEDED_EXCEEDEDMAXPAGESERROR("LimitExceeded.ExceededMaxPagesError"),
     
     /* File too large. */
     LIMITEXCEEDED_TOOLARGEFILEERROR("LimitExceeded.TooLargeFileError"),
     
     /* Too many and frequent requests. */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* The account resource package is exhausted. */
     RESOURCEUNAVAILABLE_RESOURCEPACKAGERUNOUT("ResourceUnavailable.ResourcePackageRunOut"),
     
     /* The billing status is abnormal. */
     RESOURCESSOLDOUT_CHARGESTATUSEXCEPTION("ResourcesSoldOut.ChargeStatusException");
     
    private String value;
    private LkeapErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

