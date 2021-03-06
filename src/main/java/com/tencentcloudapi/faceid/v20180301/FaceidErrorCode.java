package com.tencentcloudapi.faceid.v20180301;
public enum FaceidErrorCode {
    // No motions of eye closing are detected.
     FAILEDOPERATION_ACTIONCLOSEEYE("FailedOperation.ActionCloseEye"),
     
    // The face is too close to the screen.
     FAILEDOPERATION_ACTIONFACECLOSE("FailedOperation.ActionFaceClose"),
     
    // The face is too far from the screen.
     FAILEDOPERATION_ACTIONFACEFAR("FailedOperation.ActionFaceFar"),
     
    // The face is too far left from the screen.
     FAILEDOPERATION_ACTIONFACELEFT("FailedOperation.ActionFaceLeft"),
     
    // The face is too far right from the screen.
     FAILEDOPERATION_ACTIONFACERIGHT("FailedOperation.ActionFaceRight"),
     
    // The first motion is not detected.
     FAILEDOPERATION_ACTIONFIRSTACTION("FailedOperation.ActionFirstAction"),
     
    // The lighting is too dim.
     FAILEDOPERATION_ACTIONLIGHTDARK("FailedOperation.ActionLightDark"),
     
    // The lighting is too strong.
     FAILEDOPERATION_ACTIONLIGHTSTRONG("FailedOperation.ActionLightStrong"),
     
    // Failed to detect a full face.
     FAILEDOPERATION_ACTIONNODETECTFACE("FailedOperation.ActionNodetectFace"),
     
    // No motions of mouth opening are detected.
     FAILEDOPERATION_ACTIONOPENMOUTH("FailedOperation.ActionOpenMouth"),
     
    // Comparison failed.
     FAILEDOPERATION_COMPAREFAIL("FailedOperation.CompareFail"),
     
    // The comparison similarity did not reach the passing standard.
     FAILEDOPERATION_COMPARELOWSIMILARITY("FailedOperation.CompareLowSimilarity"),
     
    // Error calling the comparison engine API.
     FAILEDOPERATION_COMPARESYSTEMERROR("FailedOperation.CompareSystemError"),
     
    // Failed to store the file. Please try again later.
     FAILEDOPERATION_FILESAVEERROR("FailedOperation.FileSaveError"),
     
    // The ID number entered is incorrect.
     FAILEDOPERATION_IDFORMATERROR("FailedOperation.IdFormatError"),
     
    // The name and ID number do not match. Please check and try again.
     FAILEDOPERATION_IDNAMEMISMATCH("FailedOperation.IdNameMisMatch"),
     
    // The number is not in the library. Please go to the applicable household registrar for check.
     FAILEDOPERATION_IDNOEXISTSYSTEM("FailedOperation.IdNoExistSystem"),
     
    // The photo is not in the library. Please go to the applicable household registrar for check.
     FAILEDOPERATION_IDPHOTONOEXIST("FailedOperation.IdPhotoNoExist"),
     
    // The ID photo resolution is too low. Please upload a new one.
     FAILEDOPERATION_IDPHOTOPOORQUALITY("FailedOperation.IdPhotoPoorQuality"),
     
    // Failed to return a photo from the customer library or authentication center. Please try again later.
     FAILEDOPERATION_IDPHOTOSYSTEMNOANSWER("FailedOperation.IdPhotoSystemNoanswer"),
     
    // Multiple faces are detected.
     FAILEDOPERATION_LIFEPHOTODETECTFACES("FailedOperation.LifePhotoDetectFaces"),
     
    // Real person comparison failed.
     FAILEDOPERATION_LIFEPHOTODETECTFAKE("FailedOperation.LifePhotoDetectFake"),
     
    // Failed to detect a full face.
     FAILEDOPERATION_LIFEPHOTODETECTNOFACES("FailedOperation.LifePhotoDetectNoFaces"),
     
    // The resolution of the image passed in is too low. Please upload a new one.
     FAILEDOPERATION_LIFEPHOTOPOORQUALITY("FailedOperation.LifePhotoPoorQuality"),
     
    // The image passed in is too large or too small.
     FAILEDOPERATION_LIFEPHOTOSIZEERROR("FailedOperation.LifePhotoSizeError"),
     
    // The face is not fully exposed.
     FAILEDOPERATION_LIPFACEINCOMPLETE("FailedOperation.LipFaceIncomplete"),
     
    // The lip movement range is too small.
     FAILEDOPERATION_LIPMOVESMALL("FailedOperation.LipMoveSmall"),
     
    // Failed to pull the video. Please try again.
     FAILEDOPERATION_LIPNETFAILED("FailedOperation.LipNetFailed"),
     
    // The video is empty or its size is inappropriate. The recording duration should be about 6 seconds.
     FAILEDOPERATION_LIPSIZEERROR("FailedOperation.LipSizeError"),
     
    // The video format is incorrect.
     FAILEDOPERATION_LIPVIDEOINVALID("FailedOperation.LipVideoInvalid"),
     
    // The video definition is too low.
     FAILEDOPERATION_LIPVIDEOQUAILITY("FailedOperation.LipVideoQuaility"),
     
    // No sound is detected.
     FAILEDOPERATION_LIPVOICEDETECT("FailedOperation.LipVoiceDetect"),
     
    // The volume of the video is too low.
     FAILEDOPERATION_LIPVOICELOW("FailedOperation.LipVoiceLow"),
     
    // Speech recognition failed.
     FAILEDOPERATION_LIPVOICERECOGNIZE("FailedOperation.LipVoiceRecognize"),
     
    // Face detection failed. Unable to extract the photo for comparison.
     FAILEDOPERATION_LIVESSBESTFRAMEERROR("FailedOperation.LivessBestFrameError"),
     
    // Liveness detection failed.
     FAILEDOPERATION_LIVESSDETECTFAIL("FailedOperation.LivessDetectFail"),
     
    // Suspected spoofed recording.
     FAILEDOPERATION_LIVESSDETECTFAKE("FailedOperation.LivessDetectFake"),
     
    // Error calling the liveness engine API.
     FAILEDOPERATION_LIVESSSYSTEMERROR("FailedOperation.LivessSystemError"),
     
    // Video-based real person detection failed.
     FAILEDOPERATION_LIVESSUNKNOWNERROR("FailedOperation.LivessUnknownError"),
     
    // The name entered is incorrect.
     FAILEDOPERATION_NAMEFORMATERROR("FailedOperation.NameFormatError"),
     
    // Real person detection failed.
     FAILEDOPERATION_SILENTDETECTFAIL("FailedOperation.SilentDetectFail"),
     
    // Eye detection failed.
     FAILEDOPERATION_SILENTEYELIVEFAIL("FailedOperation.SilentEyeLiveFail"),
     
    // No face is detected in the video.
     FAILEDOPERATION_SILENTFACEDETECTFAIL("FailedOperation.SilentFaceDetectFail"),
     
    // Low face quality.
     FAILEDOPERATION_SILENTFACEQUALITYFAIL("FailedOperation.SilentFaceQualityFail"),
     
    // A face mask is detected.
     FAILEDOPERATION_SILENTFACEWITHMASKFAIL("FailedOperation.SilentFaceWithMaskFail"),
     
    // Mouth detection failed.
     FAILEDOPERATION_SILENTMOUTHLIVEFAIL("FailedOperation.SilentMouthLiveFail"),
     
    // Multiple faces are detected in the video.
     FAILEDOPERATION_SILENTMULTIFACEFAIL("FailedOperation.SilentMultiFaceFail"),
     
    // The video might be spoofed.
     FAILEDOPERATION_SILENTPICTURELIVEFAIL("FailedOperation.SilentPictureLiveFail"),
     
    // Real person detection did not reach the passing standard.
     FAILEDOPERATION_SILENTTHRESHOLD("FailedOperation.SilentThreshold"),
     
    // The video is too short. Please capture a video longer than 2 seconds.
     FAILEDOPERATION_SILENTTOOSHORT("FailedOperation.SilentTooShort"),
     
    // Unknown internal error.
     FAILEDOPERATION_UNKNOWN("FailedOperation.UnKnown"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // The account is in arrears.
     UNAUTHORIZEDOPERATION_ARREARS("UnauthorizedOperation.Arrears"),
     
    // Identity verification has not been completed for the account.
     UNAUTHORIZEDOPERATION_NONAUTHORIZE("UnauthorizedOperation.NonAuthorize"),
     
    // The service has not been activated.
     UNAUTHORIZEDOPERATION_NONACTIVATED("UnauthorizedOperation.Nonactivated"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private FaceidErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

