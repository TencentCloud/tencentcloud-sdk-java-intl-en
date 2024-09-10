/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.faceid.v20180301;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.faceid.v20180301.models.*;

public class FaceidClient extends AbstractClient{
    private static String endpoint = "faceid.tencentcloudapi.com";
    private static String service = "faceid";
    private static String version = "2018-03-01";
    
    public FaceidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public FaceidClient(Credential credential, String region, ClientProfile profile) {
        super(FaceidClient.endpoint, FaceidClient.version, credential, region, profile);
    }

    /**
     *The types of national cards supported by the API and whether instructions on the back of the card are required are as follows:  
<table> <thead> <tr> <td>Nationality</td> <td style="width:200px">CardType</td> <td style="width:200px">Back side required</td> </tr> </thead> <tbody> <tr> <td>Indonesia</td> <td>ID card</td> <td>No</td> </tr> <tr> <td>Indonesia</td> <td>Driving License</td> <td>No</td> </tr> <tr> <td>Hongkong</td> <td>ID card</td> <td>Yes</td> </tr> <tr> <td>Thailand</td> <td>ID card</td> <td>No</td> </tr> <tr> <td>Thailand</td> <td>Driving License</td> <td>Yes</td> </tr> <tr> <td>Malaysia</td> <td>ID card</td> <td>Yes</td> </tr> <tr> <td>Malaysia</td> <td>Driving License</td> <td>Yes</td> </tr> <tr> <td>Singapore</td> <td>ID card</td> <td>Yes</td> </tr> <tr> <td>Singapore</td> <td>Driving License</td> <td>Yes</td> </tr> <tr> <td>Philippine</td> <td>ID card</td> <td>Yes</td> </tr> <tr> <td>Philippine</td> <td>Driving License</td> <td>No</td> </tr> <tr> <td>Japan</td> <td>ID card</td> <td>Yes</td> </tr> <tr> <td>Japan</td> <td>Driving License</td> <td>No</td> </tr> <tr> <td>Taiwan</td> <td>ID Card</td> <td>Yes</td> </tr> </tbody> </table>
     * @param req ApplyCardVerificationRequest
     * @return ApplyCardVerificationResponse
     * @throws TencentCloudSDKException
     */
    public ApplyCardVerificationResponse ApplyCardVerification(ApplyCardVerificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyCardVerification", ApplyCardVerificationResponse.class);
    }

    /**
     *This API is used to apply for a token before calling the liveness detection service each time. This token is required for initiating the verification process and getting the result after the verification is completed.
     * @param req ApplyLivenessTokenRequest
     * @return ApplyLivenessTokenResponse
     * @throws TencentCloudSDKException
     */
    public ApplyLivenessTokenResponse ApplyLivenessToken(ApplyLivenessTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyLivenessToken", ApplyLivenessTokenResponse.class);
    }

    /**
     *This API is used to apply for a token before calling the Identity Verification SDK service each time. This token is required for initiating the verification process and getting the result after the verification is completed.
     * @param req ApplySdkVerificationTokenRequest
     * @return ApplySdkVerificationTokenResponse
     * @throws TencentCloudSDKException
     */
    public ApplySdkVerificationTokenResponse ApplySdkVerificationToken(ApplySdkVerificationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplySdkVerificationToken", ApplySdkVerificationTokenResponse.class);
    }

    /**
     *This API is used to apply for a BizToken before calling the web-based verification service each time. This token is required for initiating a verification process and getting the result after the verification is completed.
     * @param req ApplyWebVerificationBizTokenIntlRequest
     * @return ApplyWebVerificationBizTokenIntlResponse
     * @throws TencentCloudSDKException
     */
    public ApplyWebVerificationBizTokenIntlResponse ApplyWebVerificationBizTokenIntl(ApplyWebVerificationBizTokenIntlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyWebVerificationBizTokenIntl", ApplyWebVerificationBizTokenIntlResponse.class);
    }

    /**
     *This API is used to apply for a token before calling the web-based verification service each time. This token is required for initiating the verification process and getting the result after the verification is completed.
     * @param req ApplyWebVerificationTokenRequest
     * @return ApplyWebVerificationTokenResponse
     * @throws TencentCloudSDKException
     */
    public ApplyWebVerificationTokenResponse ApplyWebVerificationToken(ApplyWebVerificationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyWebVerificationToken", ApplyWebVerificationTokenResponse.class);
    }

    /**
     *This interface supports judgment of real person and photo comparison to verify the user's identity online. By passing the video and photo into the interface, it will first judge whether the person in the video is real. If yes, it judges whether the person in the video is the same one as the uploaded photo and returns authentication result.
     * @param req CompareFaceLivenessRequest
     * @return CompareFaceLivenessResponse
     * @throws TencentCloudSDKException
     */
    public CompareFaceLivenessResponse CompareFaceLiveness(CompareFaceLivenessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompareFaceLiveness", CompareFaceLivenessResponse.class);
    }

    /**
     *This API is used to generate a temporary `UploadUrl` for uploading resource files (with the `HTTP PUT` method). After resource upload, `ResourceUrl` will be passed to the `TargetAction` API to complete the resource passing (specific fields vary by case). 
The data will be stored in a COS bucket in the region specified by the parameter `Region` for two hours.
     * @param req CreateUploadUrlRequest
     * @return CreateUploadUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateUploadUrlResponse CreateUploadUrl(CreateUploadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUploadUrl", CreateUploadUrlResponse.class);
    }

    /**
     *This API is used to detect liveness with the package generated by the liveness comparison (reflection-based) SDK, and to compare the person detected with that in the image passed in.
The image and the data generated with the SDK must be stored in COS, and the region of the COS bucket must be same as that of requests made with this API. We recommend that you pass resources with upload link APIs.
     * @param req DetectReflectLivenessAndCompareRequest
     * @return DetectReflectLivenessAndCompareResponse
     * @throws TencentCloudSDKException
     */
    public DetectReflectLivenessAndCompareResponse DetectReflectLivenessAndCompare(DetectReflectLivenessAndCompareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectReflectLivenessAndCompare", DetectReflectLivenessAndCompareResponse.class);
    }

    /**
     *This API is used to generate an appropriate light sequence based on the information collected by the liveness comparison (reflection-based) SDK and pass the light sequence into the SDK to start the identity verification process.
The data generated with the SDK must be stored in COS, and the region of the COS bucket must be same as that of requests made with this API. We recommend that you pass resources with upload link APIs.
     * @param req GenerateReflectSequenceRequest
     * @return GenerateReflectSequenceResponse
     * @throws TencentCloudSDKException
     */
    public GenerateReflectSequenceResponse GenerateReflectSequence(GenerateReflectSequenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateReflectSequence", GenerateReflectSequenceResponse.class);
    }

    /**
     *The interface supports obtaining the certificate authentication result based on the token.
     * @param req GetCardVerificationResultRequest
     * @return GetCardVerificationResultResponse
     * @throws TencentCloudSDKException
     */
    public GetCardVerificationResultResponse GetCardVerificationResult(GetCardVerificationResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCardVerificationResult", GetCardVerificationResultResponse.class);
    }

    /**
     *This API is used to get the verification result with the corresponding SDK token after the identity verification process is completed. The SDK token is valid for two hours (2*3,600s) after generation and can be called multiple times.
     * @param req GetFaceIdResultIntlRequest
     * @return GetFaceIdResultIntlResponse
     * @throws TencentCloudSDKException
     */
    public GetFaceIdResultIntlResponse GetFaceIdResultIntl(GetFaceIdResultIntlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFaceIdResultIntl", GetFaceIdResultIntlResponse.class);
    }

    /**
     *This API is used to apply for an SDK token before calling the liveness detection and face comparison SDK each time. The SDK token is used throughout the identity verification process and to get the verification result after the verification is completed. A token is valid for one identity verification process only.
     * @param req GetFaceIdTokenIntlRequest
     * @return GetFaceIdTokenIntlResponse
     * @throws TencentCloudSDKException
     */
    public GetFaceIdTokenIntlResponse GetFaceIdTokenIntl(GetFaceIdTokenIntlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFaceIdTokenIntl", GetFaceIdTokenIntlResponse.class);
    }

    /**
     *This API is used to get the verification result with the corresponding token (SdkToken) after the liveness detection is completed. The token is valid for two hours after issuance and can be called multiple times.
     * @param req GetLivenessResultRequest
     * @return GetLivenessResultResponse
     * @throws TencentCloudSDKException
     */
    public GetLivenessResultResponse GetLivenessResult(GetLivenessResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLivenessResult", GetLivenessResultResponse.class);
    }

    /**
     *This API is used to get the verification result with the corresponding token after the SDK-based verification is completed. The token is valid for three days after issuance and can be called multiple times.
     * @param req GetSdkVerificationResultRequest
     * @return GetSdkVerificationResultResponse
     * @throws TencentCloudSDKException
     */
    public GetSdkVerificationResultResponse GetSdkVerificationResult(GetSdkVerificationResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSdkVerificationResult", GetSdkVerificationResultResponse.class);
    }

    /**
     *This API is used to get the verification result with the corresponding token (BizToken) after the web-based verification is completed. The BizToken is valid for three days (3*24*3,600s) after issuance and can be called multiple times.
     * @param req GetWebVerificationResultRequest
     * @return GetWebVerificationResultResponse
     * @throws TencentCloudSDKException
     */
    public GetWebVerificationResultResponse GetWebVerificationResult(GetWebVerificationResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWebVerificationResult", GetWebVerificationResultResponse.class);
    }

    /**
     *This API is used to get the verification result with the corresponding BizToken after the web-based verification is completed. The token is valid for three days (259,200s) after issuance and can be called multiple times.
     * @param req GetWebVerificationResultIntlRequest
     * @return GetWebVerificationResultIntlResponse
     * @throws TencentCloudSDKException
     */
    public GetWebVerificationResultIntlResponse GetWebVerificationResultIntl(GetWebVerificationResultIntlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWebVerificationResultIntl", GetWebVerificationResultIntlResponse.class);
    }

    /**
     *This API is used to pass in a video and a photo, determine whether the person in the video is real, and if yes, then determine whether the person in the video is the same as that in the photo.
This API on the legacy version will continue to serve existing users but will be unavailable to new users. We recommend you use `VideoLivenessCompare` for better service quality.
     * @param req LivenessCompareRequest
     * @return LivenessCompareResponse
     * @throws TencentCloudSDKException
     */
    public LivenessCompareResponse LivenessCompare(LivenessCompareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LivenessCompare", LivenessCompareResponse.class);
    }

    /**
     *This API is used to pass in URLs of a video and a photo, determine whether the person in the video is real, and if yes, then determine whether the person in the video is the same as that in the photo.
     * @param req VideoLivenessCompareRequest
     * @return VideoLivenessCompareResponse
     * @throws TencentCloudSDKException
     */
    public VideoLivenessCompareResponse VideoLivenessCompare(VideoLivenessCompareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VideoLivenessCompare", VideoLivenessCompareResponse.class);
    }

}
