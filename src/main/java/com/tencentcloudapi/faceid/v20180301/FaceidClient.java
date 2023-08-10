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
     *This API is used to apply for a token before calling the liveness detection service each time. This token is required for initiating the verification process and getting the result after the verification is completed.
     * @param req ApplyLivenessTokenRequest
     * @return ApplyLivenessTokenResponse
     * @throws TencentCloudSDKException
     */
    public ApplyLivenessTokenResponse ApplyLivenessToken(ApplyLivenessTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyLivenessTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyLivenessTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyLivenessToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to apply for a token before calling the Identity Verification SDK service each time. This token is required for initiating the verification process and getting the result after the verification is completed.
     * @param req ApplySdkVerificationTokenRequest
     * @return ApplySdkVerificationTokenResponse
     * @throws TencentCloudSDKException
     */
    public ApplySdkVerificationTokenResponse ApplySdkVerificationToken(ApplySdkVerificationTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplySdkVerificationTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplySdkVerificationTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplySdkVerificationToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to apply for a BizToken before calling the web-based verification service each time. This token is required for initiating a verification process and getting the result after the verification is completed.
     * @param req ApplyWebVerificationBizTokenIntlRequest
     * @return ApplyWebVerificationBizTokenIntlResponse
     * @throws TencentCloudSDKException
     */
    public ApplyWebVerificationBizTokenIntlResponse ApplyWebVerificationBizTokenIntl(ApplyWebVerificationBizTokenIntlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyWebVerificationBizTokenIntlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyWebVerificationBizTokenIntlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyWebVerificationBizTokenIntl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to apply for a token before calling the web-based verification service each time. This token is required for initiating the verification process and getting the result after the verification is completed.
     * @param req ApplyWebVerificationTokenRequest
     * @return ApplyWebVerificationTokenResponse
     * @throws TencentCloudSDKException
     */
    public ApplyWebVerificationTokenResponse ApplyWebVerificationToken(ApplyWebVerificationTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyWebVerificationTokenResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyWebVerificationTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyWebVerificationToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to generate a temporary `UploadUrl` for uploading resource files (with the `HTTP PUT` method). After resource upload, `ResourceUrl` will be passed to the `TargetAction` API to complete the resource passing (specific fields vary by case). 
The data will be stored in a COS bucket in the region specified by the parameter `Region` for two hours.
     * @param req CreateUploadUrlRequest
     * @return CreateUploadUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateUploadUrlResponse CreateUploadUrl(CreateUploadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUploadUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUploadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUploadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to detect liveness with the package generated by the liveness comparison (reflection-based) SDK, and to compare the person detected with that in the image passed in.
The image and the data generated with the SDK must be stored in COS, and the region of the COS bucket must be same as that of requests made with this API. We recommend that you pass resources with upload link APIs.
     * @param req DetectReflectLivenessAndCompareRequest
     * @return DetectReflectLivenessAndCompareResponse
     * @throws TencentCloudSDKException
     */
    public DetectReflectLivenessAndCompareResponse DetectReflectLivenessAndCompare(DetectReflectLivenessAndCompareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectReflectLivenessAndCompareResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DetectReflectLivenessAndCompareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetectReflectLivenessAndCompare");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to generate an appropriate light sequence based on the information collected by the liveness comparison (reflection-based) SDK and pass the light sequence into the SDK to start the identity verification process.
The data generated with the SDK must be stored in COS, and the region of the COS bucket must be same as that of requests made with this API. We recommend that you pass resources with upload link APIs.
     * @param req GenerateReflectSequenceRequest
     * @return GenerateReflectSequenceResponse
     * @throws TencentCloudSDKException
     */
    public GenerateReflectSequenceResponse GenerateReflectSequence(GenerateReflectSequenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateReflectSequenceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateReflectSequenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateReflectSequence");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the verification result with the corresponding SDK token after the identity verification process is completed. The SDK token is valid for two hours (2*3,600s) after generation and can be called multiple times.
     * @param req GetFaceIdResultIntlRequest
     * @return GetFaceIdResultIntlResponse
     * @throws TencentCloudSDKException
     */
    public GetFaceIdResultIntlResponse GetFaceIdResultIntl(GetFaceIdResultIntlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFaceIdResultIntlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetFaceIdResultIntlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFaceIdResultIntl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to apply for an SDK token before calling the liveness detection and face comparison SDK each time. The SDK token is used throughout the identity verification process and to get the verification result after the verification is completed. A token is valid for one identity verification process only.
     * @param req GetFaceIdTokenIntlRequest
     * @return GetFaceIdTokenIntlResponse
     * @throws TencentCloudSDKException
     */
    public GetFaceIdTokenIntlResponse GetFaceIdTokenIntl(GetFaceIdTokenIntlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFaceIdTokenIntlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetFaceIdTokenIntlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFaceIdTokenIntl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the verification result with the corresponding token (SdkToken) after the liveness detection is completed. The token is valid for two hours after issuance and can be called multiple times.
     * @param req GetLivenessResultRequest
     * @return GetLivenessResultResponse
     * @throws TencentCloudSDKException
     */
    public GetLivenessResultResponse GetLivenessResult(GetLivenessResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLivenessResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetLivenessResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetLivenessResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the verification result with the corresponding token after the SDK-based verification is completed. The token is valid for three days after issuance and can be called multiple times.
     * @param req GetSdkVerificationResultRequest
     * @return GetSdkVerificationResultResponse
     * @throws TencentCloudSDKException
     */
    public GetSdkVerificationResultResponse GetSdkVerificationResult(GetSdkVerificationResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSdkVerificationResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetSdkVerificationResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSdkVerificationResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the verification result with the corresponding token (BizToken) after the web-based verification is completed. The BizToken is valid for three days (3*24*3,600s) after issuance and can be called multiple times.
     * @param req GetWebVerificationResultRequest
     * @return GetWebVerificationResultResponse
     * @throws TencentCloudSDKException
     */
    public GetWebVerificationResultResponse GetWebVerificationResult(GetWebVerificationResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetWebVerificationResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetWebVerificationResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetWebVerificationResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the verification result with the corresponding BizToken after the u200dweb-based verification is completed. The token is valid for three days (259,200s) after issuance and can be called multiple times.
     * @param req GetWebVerificationResultIntlRequest
     * @return GetWebVerificationResultIntlResponse
     * @throws TencentCloudSDKException
     */
    public GetWebVerificationResultIntlResponse GetWebVerificationResultIntl(GetWebVerificationResultIntlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetWebVerificationResultIntlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetWebVerificationResultIntlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetWebVerificationResultIntl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pass in a video and a photo, determine whether the person in the video is real, and if yes, then determine whether the person in the video is the same as that in the photo.
This API on the legacy version will continue to serve existing users but will be unavailable to new users. We recommend you use `VideoLivenessCompare` for better service quality.
     * @param req LivenessCompareRequest
     * @return LivenessCompareResponse
     * @throws TencentCloudSDKException
     */
    public LivenessCompareResponse LivenessCompare(LivenessCompareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LivenessCompareResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<LivenessCompareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LivenessCompare");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pass in URLs of a video and a photo, determine whether the person in the video is real, and if yes, then determine whether the person in the video is the same as that in the photo.
     * @param req VideoLivenessCompareRequest
     * @return VideoLivenessCompareResponse
     * @throws TencentCloudSDKException
     */
    public VideoLivenessCompareResponse VideoLivenessCompare(VideoLivenessCompareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VideoLivenessCompareResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VideoLivenessCompareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VideoLivenessCompare");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
