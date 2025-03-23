package com.tencentcloudapi.facefusion.v20220927;
public enum FacefusionErrorCode {
    // Insufficient balance, failed to open, please recharge and open again.
     FAILEDOPERATION_BALANCEINSUFFICIENT("FailedOperation.BalanceInsufficient"),
     
    // The face corresponding to the specified ID does not exist in the video.
     FAILEDOPERATION_FACEIDNOTINVIDEO("FailedOperation.FaceIdNotInVideo"),
     
    // The face was filtered because it was too small. It is recommended that the face size is not less than 34x34 pixels.
     FAILEDOPERATION_FACESIZETOOSMALL("FailedOperation.FaceSizeTooSmall"),
     
    // The material has not been reviewed.
     FAILEDOPERATION_FUSEMATERIALNOTAUTH("FailedOperation.FuseMaterialNotAuth"),
     
    // The material in this state cannot be used.
     FAILEDOPERATION_FUSEMATERIALNOTAVAILABLE("FailedOperation.FuseMaterialNotAvailable"),
     
    // The material does not exist.
     FAILEDOPERATION_FUSEMATERIALNOTEXIST("FailedOperation.FuseMaterialNotExist"),
     
    // Image decoding failed.
     FAILEDOPERATION_IMAGEDECODEFAILED("FailedOperation.ImageDecodeFailed"),
     
    // Image download failed.
     FAILEDOPERATION_IMAGEDOWNLOADERROR("FailedOperation.ImageDownloadError"),
     
    // The image size is too large. It is recommended to resize the image to below 2,000x2,000 pixels.
     FAILEDOPERATION_IMAGERESOLUTIONEXCEED("FailedOperation.ImageResolutionExceed"),
     
    // The short edge resolution of the image is lower than 64 pixels.
     FAILEDOPERATION_IMAGERESOLUTIONTOOSMALL("FailedOperation.ImageResolutionTooSmall"),
     
    // The image after Base64 encoding exceeds in size.
     FAILEDOPERATION_IMAGESIZEEXCEED("FailedOperation.ImageSizeExceed"),
     
    // The image size is too large or too small and does not meet algorithm requirements.
     FAILEDOPERATION_IMAGESIZEINVALID("FailedOperation.ImageSizeInvalid"),
     
    // Internal service error.
     FAILEDOPERATION_INNERERROR("FailedOperation.InnerError"),
     
    // The task has been canceled. Please submit the task again.
     FAILEDOPERATION_JOBHASBEENCANCELED("FailedOperation.JobHasBeenCanceled"),
     
    // The task does not exist.
     FAILEDOPERATION_JOBNOTEXIST("FailedOperation.JobNotExist"),
     
    // The face cannot be detected because the face box is too small.
     FAILEDOPERATION_NOFACEDETECTED("FailedOperation.NoFaceDetected"),
     
    // Parameter or value is invalid.
     FAILEDOPERATION_PARAMETERVALUEERROR("FailedOperation.ParameterValueError"),
     
    // The authorization fee is not paid for the activity, or the activity has been disabled.
     FAILEDOPERATION_PROJECTNOTAUTH("FailedOperation.ProjectNotAuth"),
     
    // The backend service timed out.
     FAILEDOPERATION_REQUESTTIMEOUT("FailedOperation.RequestTimeout"),
     
    // RPC request failed, typically due to algorithm service malfunction.
     FAILEDOPERATION_RPCFAIL("FailedOperation.RpcFail"),
     
    // The material face ID does not exist.
     FAILEDOPERATION_TEMPLATEFACEIDNOTEXIST("FailedOperation.TemplateFaceIDNotExist"),
     
    // Internal error.
     FAILEDOPERATION_UNKNOWERROR("FailedOperation.UnKnowError"),
     
    // Unknown error.
     FAILEDOPERATION_UNKNOWN("FailedOperation.Unknown"),
     
    // Activity ID is not found.
     INVALIDPARAMETERVALUE_ACTIVITYIDNOTFOUND("InvalidParameterValue.ActivityIdNotFound"),
     
    // Face box parameters are invalid, or the face box is too small.
     INVALIDPARAMETERVALUE_FACERECTPARAMETERVALUEERROR("InvalidParameterValue.FaceRectParameterValueError"),
     
    // No material ID is found.
     INVALIDPARAMETERVALUE_MATERIALIDNOTFOUND("InvalidParameterValue.MaterialIdNotFound"),
     
    // The URL format is invalid.
     INVALIDPARAMETERVALUE_URLILLEGAL("InvalidParameterValue.UrlIllegal"),
     
    // The number of requests exceeded the rate limit.
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // Resources are insufficient.
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The account has been frozen.
     RESOURCEUNAVAILABLE_FREEZE("ResourceUnavailable.Freeze"),
     
    // The account is in arrears.
     RESOURCEUNAVAILABLE_INARREARS("ResourceUnavailable.InArrears"),
     
    // The service is being opened, please wait.
     RESOURCEUNAVAILABLE_ISOPENING("ResourceUnavailable.IsOpening"),
     
    // The billing status is unknown. Check whether the service has been activated in the console.
     RESOURCEUNAVAILABLE_NOTEXIST("ResourceUnavailable.NotExist"),
     
    // The resource has been possessed.
     RESOURCEUNAVAILABLE_RECOVER("ResourceUnavailable.Recover"),
     
    // Services for the account has been stopped.
     RESOURCEUNAVAILABLE_STOPUSING("ResourceUnavailable.StopUsing");
     
    private String value;
    private FacefusionErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

