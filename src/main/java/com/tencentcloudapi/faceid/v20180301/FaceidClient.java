/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    private static String endpoint = "faceid.intl.tencentcloudapi.com";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyLivenessToken", ApplyLivenessTokenResponse.class);
    }

    /**
     *This API is used to apply for a token before calling the eKYC SDK service each time. This token is required for initiating the verification process and getting the result after the verification is completed.
     * @param req ApplySdkVerificationTokenRequest
     * @return ApplySdkVerificationTokenResponse
     * @throws TencentCloudSDKException
     */
    public ApplySdkVerificationTokenResponse ApplySdkVerificationToken(ApplySdkVerificationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplySdkVerificationToken", ApplySdkVerificationTokenResponse.class);
    }

    /**
     *This API is used to obtain a BizToken before each call to the Web verification service. Save the BizToken to initiate the verification process and retrieve the result upon completion. The BizToken is valid for 10 minutes.
     * @param req ApplyWebVerificationBizTokenIntlRequest
     * @return ApplyWebVerificationBizTokenIntlResponse
     * @throws TencentCloudSDKException
     */
    public ApplyWebVerificationBizTokenIntlResponse ApplyWebVerificationBizTokenIntl(ApplyWebVerificationBizTokenIntlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyWebVerificationBizTokenIntl", ApplyWebVerificationBizTokenIntlResponse.class);
    }

    /**
     *This API is used to validate the authenticity and consistency of the name and bank card number.
     * @param req BankCard2EVerificationRequest
     * @return BankCard2EVerificationResponse
     * @throws TencentCloudSDKException
     */
    public BankCard2EVerificationResponse BankCard2EVerification(BankCard2EVerificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BankCard2EVerification", BankCard2EVerificationResponse.class);
    }

    /**
     *This API is used to verify the authenticity and consistency of the bank card number, name, ID number, and mobile number for account opening.
     * @param req BankCard4EVerificationRequest
     * @return BankCard4EVerificationResponse
     * @throws TencentCloudSDKException
     */
    public BankCard4EVerificationResponse BankCard4EVerification(BankCard4EVerificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BankCard4EVerification", BankCard4EVerificationResponse.class);
    }

    /**
     *This API is used to verify the authenticity and consistency of the bank card number, name, and ID number of information.
     * @param req BankCardVerificationRequest
     * @return BankCardVerificationResponse
     * @throws TencentCloudSDKException
     */
    public BankCardVerificationResponse BankCardVerification(BankCardVerificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BankCardVerification", BankCardVerificationResponse.class);
    }

    /**
     *Bank card basic information query
     * @param req CheckBankCardInformationRequest
     * @return CheckBankCardInformationResponse
     * @throws TencentCloudSDKException
     */
    public CheckBankCardInformationResponse CheckBankCardInformation(CheckBankCardInformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckBankCardInformation", CheckBankCardInformationResponse.class);
    }

    /**
     *This API is used to import the ID card portrait side photo, recognize the information on the ID card photo, and compare the name, identity card number, and ID card portrait photo with the ID photo in the authoritative database to verify if they belong to the same person, thereby verifying the authenticity of the identity card information.
     * @param req CheckIdCardInformationRequest
     * @return CheckIdCardInformationResponse
     * @throws TencentCloudSDKException
     */
    public CheckIdCardInformationResponse CheckIdCardInformation(CheckIdCardInformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIdCardInformation", CheckIdCardInformationResponse.class);
    }

    /**
     *This API is used to validate the authenticity and consistency of the name, identity card number, and valid period.
     * @param req CheckIdNameDateRequest
     * @return CheckIdNameDateResponse
     * @throws TencentCloudSDKException
     */
    public CheckIdNameDateResponse CheckIdNameDate(CheckIdNameDateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIdNameDate", CheckIdNameDateResponse.class);
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
     *This API is used to create an EKYC Webhook configuration.
     * @param req CreateEKYCWebhookRequest
     * @return CreateEKYCWebhookResponse
     * @throws TencentCloudSDKException
     */
    public CreateEKYCWebhookResponse CreateEKYCWebhook(CreateEKYCWebhookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEKYCWebhook", CreateEKYCWebhookResponse.class);
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
     *This API deletes the Webhook configuration.
     * @param req DeleteEKYCWebhookRequest
     * @return DeleteEKYCWebhookResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEKYCWebhookResponse DeleteEKYCWebhook(DeleteEKYCWebhookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEKYCWebhook", DeleteEKYCWebhookResponse.class);
    }

    /**
     *Based on the multimodal AI large model algorithm, it provides anti-attack detection capabilities for facial images and videos. It can effectively identify highly simulated AIGC face-changing, high-definition remakes, batch black market attacks, watermarks and other attack traces, and enhance the anti-counterfeiting security capabilities of images and videos.
     * @param req DetectAIFakeFacesRequest
     * @return DetectAIFakeFacesResponse
     * @throws TencentCloudSDKException
     */
    public DetectAIFakeFacesResponse DetectAIFakeFaces(DetectAIFakeFacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectAIFakeFaces", DetectAIFakeFacesResponse.class);
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
     *This API is used to generate an appropriate light sequence based on the information collected by the liveness comparison (reflection-based) SDK and pass the light sequence into the SDK to start the eKYC process.
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
     *Status change of continuous name list screening
     * @param req GetAMLScreeningResultRequest
     * @return GetAMLScreeningResultResponse
     * @throws TencentCloudSDKException
     */
    public GetAMLScreeningResultResponse GetAMLScreeningResult(GetAMLScreeningResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAMLScreeningResult", GetAMLScreeningResultResponse.class);
    }

    /**
     *This API is used to get the verification result with the corresponding SDK token after the identity verification process is completed. The SDK token is valid for 72 hours (72*3600s) after generation and can be called multiple times.
     * @param req GetFaceIdResultIntlRequest
     * @return GetFaceIdResultIntlResponse
     * @throws TencentCloudSDKException
     */
    public GetFaceIdResultIntlResponse GetFaceIdResultIntl(GetFaceIdResultIntlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFaceIdResultIntl", GetFaceIdResultIntlResponse.class);
    }

    /**
     *This API is used to apply for an SDK token before calling the selfie verification SDK each time. The SDK token is used throughout the eKYC process and to get the verification result after the verification is completed. A token is valid for one eKYC process only.
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
     *This API verifies NFC data. Pass in the NFCToken returned by the SDK, along with the document fields and portrait photo to be verified.The service automatically compares the information to verify with the decrypted document NFC data and outputs the verification result. The NFCToken generated by the SDK is valid for 10 minutes. The service is billed per query. 
The service currently supports NFC recognition and verification of the following fields and portrait photos on Chinese mainland second-generation resident identity cards, exit-entry permits for traveling to and from Hong Kong and Macao, and international passports with an NFC chip: 

-Chinese mainland second-generation resident identity card: identity card number, name, sex, ethnicity, date of birth, address, issuing authority, validity start time, validity end time, portrait photo 
-Exit-Entry Permit for Traveling to and from Hong Kong and Macao: ID number, name, sex, English name, issuing place, issuing authority, validity end time, date of birth, portrait photo, machine-readable code 
-International passports with an NFC chip: passport number, name, nationality, sex, country or region code, validity start time, validity end time, date of birth, birth place, issuing place, issuing authority, portrait photo, machine-readable code
     * @param req GetNFCResultRequest
     * @return GetNFCResultResponse
     * @throws TencentCloudSDKException
     */
    public GetNFCResultResponse GetNFCResult(GetNFCResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetNFCResult", GetNFCResultResponse.class);
    }

    /**
     *NFC verification service: obtain Token information (valid for 10 minutes) for the NFC identify request. This API supports NFC recognition and verification of the following documents:

-Chinese mainland second-generation resident identity card
-Exit-Entry Permit for Traveling to and from Hong Kong and Macao
-International passports with an NFC chip
     * @param req GetNFCTokenRequest
     * @return GetNFCTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetNFCTokenResponse GetNFCToken(GetNFCTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetNFCToken", GetNFCTokenResponse.class);
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
     *After completing the Web verification process, call this API with the verification token (BizToken) to query the verification result info. The BizToken is valid within three days (259,200 seconds) after application and can be called multiple times.
     * @param req GetWebVerificationResultIntlRequest
     * @return GetWebVerificationResultIntlResponse
     * @throws TencentCloudSDKException
     */
    public GetWebVerificationResultIntlResponse GetWebVerificationResultIntl(GetWebVerificationResultIntlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWebVerificationResultIntl", GetWebVerificationResultIntlResponse.class);
    }

    /**
     *This API is used to validate the authenticity and consistency of the name and identity card number. You can provide the required verification information by manually inputting the name and identity card number or importing the ID card portrait side image.
     * @param req IdCardOCRVerificationRequest
     * @return IdCardOCRVerificationResponse
     * @throws TencentCloudSDKException
     */
    public IdCardOCRVerificationResponse IdCardOCRVerification(IdCardOCRVerificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IdCardOCRVerification", IdCardOCRVerificationResponse.class);
    }

    /**
     *This API is used to validate the authenticity and consistency of the name and identity card number.
     * @param req IdCardVerificationRequest
     * @return IdCardVerificationResponse
     * @throws TencentCloudSDKException
     */
    public IdCardVerificationResponse IdCardVerification(IdCardVerificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IdCardVerification", IdCardVerificationResponse.class);
    }

    /**
     *This API is used to judge whether the image passed in and the ID photo in the authoritative database belong to the same person based on the identity information.
     * @param req ImageRecognitionV2Request
     * @return ImageRecognitionV2Response
     * @throws TencentCloudSDKException
     */
    public ImageRecognitionV2Response ImageRecognitionV2(ImageRecognitionV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageRecognitionV2", ImageRecognitionV2Response.class);
    }

    /**
     *This API queries the list of Webhook configurations.
     * @param req ListEKYCWebhooksRequest
     * @return ListEKYCWebhooksResponse
     * @throws TencentCloudSDKException
     */
    public ListEKYCWebhooksResponse ListEKYCWebhooks(ListEKYCWebhooksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEKYCWebhooks", ListEKYCWebhooksResponse.class);
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
     *This API is used to query the duration of a mobile number. Enter mobile number to query.
     * @param req MobileNetworkTimeVerificationRequest
     * @return MobileNetworkTimeVerificationResponse
     * @throws TencentCloudSDKException
     */
    public MobileNetworkTimeVerificationResponse MobileNetworkTimeVerification(MobileNetworkTimeVerificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MobileNetworkTimeVerification", MobileNetworkTimeVerificationResponse.class);
    }

    /**
     *This API is used to verify phone number status. You can enter mobile number to query.
     * @param req MobileStatusRequest
     * @return MobileStatusResponse
     * @throws TencentCloudSDKException
     */
    public MobileStatusResponse MobileStatus(MobileStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MobileStatus", MobileStatusResponse.class);
    }

    /**
     *This API is used to validate the authenticity and consistency of the mobile number, name, and identity card number. For details on supported mobile number segments, see the <a href="https://www.tencentcloud.com/document/product/1061/79689">carrier</a> document.
     * @param req PhoneVerificationRequest
     * @return PhoneVerificationResponse
     * @throws TencentCloudSDKException
     */
    public PhoneVerificationResponse PhoneVerification(PhoneVerificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PhoneVerification", PhoneVerificationResponse.class);
    }

    /**
     *AML list screening
     * @param req RunAMLNameScreeningRequest
     * @return RunAMLNameScreeningResponse
     * @throws TencentCloudSDKException
     */
    public RunAMLNameScreeningResponse RunAMLNameScreening(RunAMLNameScreeningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunAMLNameScreening", RunAMLNameScreeningResponse.class);
    }

    /**
     *AML list screening
     * @param req UpdateAMLCustomerProfileRequest
     * @return UpdateAMLCustomerProfileResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAMLCustomerProfileResponse UpdateAMLCustomerProfile(UpdateAMLCustomerProfileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAMLCustomerProfile", UpdateAMLCustomerProfileResponse.class);
    }

    /**
     *Continuous name list screening status change
     * @param req UpdateAMLOngoingScreeningStatusRequest
     * @return UpdateAMLOngoingScreeningStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAMLOngoingScreeningStatusResponse UpdateAMLOngoingScreeningStatus(UpdateAMLOngoingScreeningStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAMLOngoingScreeningStatus", UpdateAMLOngoingScreeningStatusResponse.class);
    }

    /**
     *This API is used to update Webhook configurations.
     * @param req UpdateEKYCWebhookRequest
     * @return UpdateEKYCWebhookResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEKYCWebhookResponse UpdateEKYCWebhook(UpdateEKYCWebhookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEKYCWebhook", UpdateEKYCWebhookResponse.class);
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
