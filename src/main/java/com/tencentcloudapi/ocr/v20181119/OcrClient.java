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
package com.tencentcloudapi.ocr.v20181119;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ocr.v20181119.models.*;

public class OcrClient extends AbstractClient{
    private static String endpoint = "ocr.intl.tencentcloudapi.com";
    private static String service = "ocr";
    private static String version = "2018-11-19";

    public OcrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OcrClient(Credential credential, String region, ClientProfile profile) {
        super(OcrClient.endpoint, OcrClient.version, credential, region, profile);
    }

    /**
     *This API provides general OCR recognition for overseas identity documents.

The following table lists the supported countries or regions, document types, and whether the back side is required:

<table>
<thead>
<tr>
<td style="width:200px">Nationality</td>
<td style="width:200px">CardType</td>
<td style="width:200px">Whether the Back Side is Required</td>
</tr>
</thead>
<tbody>
<tr>
<td>Argentina</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Argentina</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Argentina</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Australia</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Australia</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Australia</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Australia</td>
<td>Residence Permit</td>
<td>Yes</td>
</tr>
<tr>
<td>Bangladesh</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Bangladesh</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Bangladesh</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Cambodia</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Cambodia</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Cambodia</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Canada</td>
<td>Driver's License</td>
<td>No</td>
</tr>
<tr>
<td>Canada</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Canada</td>
<td>Passport</td>
<td>Yes</td>
</tr>
<tr>
<td>Canada</td>
<td>Residence Permit</td>
<td>Yes</td>
</tr>
<tr>
<td>Chile</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Chile</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Chile</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Germany</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Germany</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Germany</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Germany</td>
<td>Residence Permit</td>
<td>Yes</td>
</tr>
<tr>
<td>Mexico</td>
<td>Driver's License</td>
<td>No</td>
</tr>
<tr>
<td>Mexico</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Mexico</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Myanmar</td>
<td>Driver's License</td>
<td>No</td>
</tr>
<tr>
<td>Myanmar</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Myanmar</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>New Zealand</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>New Zealand</td>
<td>National ID Card</td>
<td>No</td>
</tr>
<tr>
<td>New Zealand</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>New Zealand</td>
<td>Residence Permit</td>
<td>No</td>
</tr>
<tr>
<td>Nigeria</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Nigeria</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Nigeria</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Nigeria</td>
<td>Residence Permit</td>
<td>Yes</td>
</tr>
<tr>
<td>Pakistan</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Pakistan</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Pakistan</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Russia</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Russia</td>
<td>National ID Card</td>
<td>No</td>
</tr>
<tr>
<td>Russia</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Singapore</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Singapore</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Singapore</td>
<td>Passport</td>
<td>No</td>
</tr>
<tr>
<td>Singapore</td>
<td>Residence Permit</td>
<td>Yes</td>
</tr>
<tr>
<td>Indonesia</td>
<td>National ID Card</td>
<td>No</td>
</tr>
<tr>
<td>Indonesia</td>
<td>Driver's License</td>
<td>No</td>
</tr>
<tr>
<td>Hong Kong, China</td>
<td>Identity Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Thailand</td>
<td>National ID Card</td>
<td>No</td>
</tr>
<tr>
<td>Thailand</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Malaysia</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Malaysia</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Singapore</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Singapore</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Philippines</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Philippines</td>
<td>Driver's License</td>
<td>No</td>
</tr>
<tr>
<td>Japan</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Japan</td>
<td>Driver's License</td>
<td>No</td>
</tr>
<tr>
<td>Macau, China</td>
<td>Identity Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Taiwan, China</td>
<td>Identity Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Bangladesh</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Nigeria</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Nigeria</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
<tr>
<td>Pakistan</td>
<td>National ID Card</td>
<td>Yes</td>
</tr>
<tr>
<td>Pakistan</td>
<td>Driver's License</td>
<td>Yes</td>
</tr>
</tbody>
</table>
     * @param req ApplyCardVerificationExternalRequest
     * @return ApplyCardVerificationExternalResponse
     * @throws TencentCloudSDKException
     */
    public ApplyCardVerificationExternalResponse ApplyCardVerificationExternal(ApplyCardVerificationExternalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyCardVerificationExternal", ApplyCardVerificationExternalResponse.class);
    }

    /**
     *This API supports identifying and extracting field information in structured scenarios such as complex scenarios and multiple formats. Key scenarios include: finance, health care, transportation, travel, insurance. Click [experience now](https://ocrdemo.cloud.tencent.com/).

This API is used to set the alias SmartStructuralPro.

The default API request rate limit is 5 requests per second.
     * @param req ExtractDocMultiRequest
     * @return ExtractDocMultiResponse
     * @throws TencentCloudSDKException
     */
    public ExtractDocMultiResponse ExtractDocMulti(ExtractDocMultiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExtractDocMulti", ExtractDocMultiResponse.class);
    }

    /**
     *This API is used to detect and recognize characters in an image. It can recognize Chinese, English, Chinese-English, digits, and special symbols and return the text box positions and characters.

It is suitable for scenarios with a lot of characters in complex layouts and requiring high recognition accuracy, such as examination papers, online images, signboards, and legal documents.

Strengths: compared with general print recognition, it provides higher-precision character recognition services. Its accuracy and recall rate are higher in difficult scenarios such as a large number of characters, long strings of digits, small characters, blurry characters, and tilted text.

This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).
     * @param req GeneralAccurateOCRRequest
     * @return GeneralAccurateOCRResponse
     * @throws TencentCloudSDKException
     */
    public GeneralAccurateOCRResponse GeneralAccurateOCR(GeneralAccurateOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GeneralAccurateOCR", GeneralAccurateOCRResponse.class);
    }

    /**
     *This API is used to detect and recognize characters in an image in the following 20 languages: Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, and Arabic. Mixed characters in English and each supported language can be recognized together.

It can recognize printed text in paper documents, online images, ads, signboards, menus, video titles, profile photos, etc.

Strengths: it can automatically recognize the text language, return the text box coordinate information, and automatically rotate tilted text to the upright direction.

This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).
     * @param req GeneralBasicOCRRequest
     * @return GeneralBasicOCRResponse
     * @throws TencentCloudSDKException
     */
    public GeneralBasicOCRResponse GeneralBasicOCR(GeneralBasicOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GeneralBasicOCR", GeneralBasicOCRResponse.class);
    }

    /**
     *This API is used to obtain document recognition results.
     * @param req GetCardVerificationExternalResultRequest
     * @return GetCardVerificationExternalResultResponse
     * @throws TencentCloudSDKException
     */
    public GetCardVerificationExternalResultResponse GetCardVerificationExternalResult(GetCardVerificationExternalResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCardVerificationExternalResult", GetCardVerificationExternalResultResponse.class);
    }

    /**
     *This API is used to recognize key fields on the photo side of a Hong Kong (China) identity card, including name in Chinese, name in English, telecode for name, date of birth, gender, document symbol, date of the first issue, date of the last receipt, identity card number, and permanent residency attribute. 

This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).
     * @param req HKIDCardOCRRequest
     * @return HKIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public HKIDCardOCRResponse HKIDCardOCR(HKIDCardOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HKIDCardOCR", HKIDCardOCRResponse.class);
    }

    /**
     *This API is used to recognize a Malaysian identity card, including identity card number, name, gender, and address. It is also used to crop identity photos and give alarms for photographed or photocopied certificates.

This API is not fully available for the time being. For more information, contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).
     * @param req MLIDCardOCRRequest
     * @return MLIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public MLIDCardOCRResponse MLIDCardOCR(MLIDCardOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MLIDCardOCR", MLIDCardOCRResponse.class);
    }

    /**
     *This API is used to recognize a passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions. Recognizable fields include passport ID, name, date of birth, gender, expiration date, issuing country/region, and nationality. It has the features of cropping identity photos and alarming for photographed or photocopied documents.
This interface supports regional scope: countries with machine-readable passports
     * @param req MLIDPassportOCRRequest
     * @return MLIDPassportOCRResponse
     * @throws TencentCloudSDKException
     */
    public MLIDPassportOCRResponse MLIDPassportOCR(MLIDPassportOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MLIDPassportOCR", MLIDPassportOCRResponse.class);
    }

    /**
     *This API is used to recognize all fields on the front of a mainland travel permit for Hong Kong, Macao, or Taiwan residents: name in Chinese, name in English, gender, date of birth, issuing authority, validity period, document number, place of issuance, number of issues, and document type.

A maximum of 20 requests can be initiated per second for this API.
     * @param req MainlandPermitOCRRequest
     * @return MainlandPermitOCRResponse
     * @throws TencentCloudSDKException
     */
    public MainlandPermitOCRResponse MainlandPermitOCR(MainlandPermitOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MainlandPermitOCR", MainlandPermitOCRResponse.class);
    }

    /**
     *The POD intelligent review deeply integrates multimodal large model image understanding technology, targeting the logistics last-mile delivery scenario to provide high-precision POD compliance audit service. The system auto-recognizes ticket imperfections and risks of non-compliance, helping businesses achieve standardized control in the delivery process and effectively avoid customer complaints and disputes caused by non-compliant credentials.
     * @param req PODAuditAIRequest
     * @return PODAuditAIResponse
     * @throws TencentCloudSDKException
     */
    public PODAuditAIResponse PODAuditAI(PODAuditAIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PODAuditAI", PODAuditAIResponse.class);
    }

    /**
     *This API is used to recognize the fields on an exit/entry permit (card) for traveling to and from Hong Kong, Macao, or Taiwan, including place of issuance, issuing authority, validity period, gender, date of birth, name in English, name in Chinese, and document number.

A maximum of 10 requests can be initiated per second for this API.
     * @param req PermitOCRRequest
     * @return PermitOCRResponse
     * @throws TencentCloudSDKException
     */
    public PermitOCRResponse PermitOCR(PermitOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PermitOCR", PermitOCRResponse.class);
    }

    /**
     *This API is used to identify Brazil common documents.

This API is used to set the default request rate limit to 5 requests/second.
     * @param req RecognizeBrazilCommonOCRRequest
     * @return RecognizeBrazilCommonOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeBrazilCommonOCRResponse RecognizeBrazilCommonOCR(RecognizeBrazilCommonOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeBrazilCommonOCR", RecognizeBrazilCommonOCRResponse.class);
    }

    /**
     *This interface supports identification of the front and back of Brazilian driver's license. The identification fields include name, driver's license category, number, validity period, etc.
     * @param req RecognizeBrazilDriverLicenseOCRRequest
     * @return RecognizeBrazilDriverLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeBrazilDriverLicenseOCRResponse RecognizeBrazilDriverLicenseOCR(RecognizeBrazilDriverLicenseOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeBrazilDriverLicenseOCR", RecognizeBrazilDriverLicenseOCRResponse.class);
    }

    /**
     *This interface supports identification of the front and back of Brazilian ID license. The identification fields include name, driver's license category, number, validity period, etc.
     * @param req RecognizeBrazilIDCardOCRRequest
     * @return RecognizeBrazilIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeBrazilIDCardOCRResponse RecognizeBrazilIDCardOCR(RecognizeBrazilIDCardOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeBrazilIDCardOCR", RecognizeBrazilIDCardOCRResponse.class);
    }

    /**
     *Brazil RNE document recognition Default interface request frequency limit: 5 times/second
     * @param req RecognizeBrazilRNEOCRRequest
     * @return RecognizeBrazilRNEOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeBrazilRNEOCRResponse RecognizeBrazilRNEOCR(RecognizeBrazilRNEOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeBrazilRNEOCR", RecognizeBrazilRNEOCRResponse.class);
    }

    /**
     *This interface supports identification of the front and back of Brazilian RNM license. The default interface request frequency limit is 5 times per second.
     * @param req RecognizeBrazilRNMOCRRequest
     * @return RecognizeBrazilRNMOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeBrazilRNMOCRResponse RecognizeBrazilRNMOCR(RecognizeBrazilRNMOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeBrazilRNMOCR", RecognizeBrazilRNMOCRResponse.class);
    }

    /**
     *This API is used to recognize the coordinates of four corners of cards.
     * @param req RecognizeDetectCardCoordsRequest
     * @return RecognizeDetectCardCoordsResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeDetectCardCoordsResponse RecognizeDetectCardCoords(RecognizeDetectCardCoordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeDetectCardCoords", RecognizeDetectCardCoordsResponse.class);
    }

    /**
     *Indonesian identity card recognition

Default API request rate limit: 5 requests/second.
     * @param req RecognizeIndonesiaIDCardOCRRequest
     * @return RecognizeIndonesiaIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeIndonesiaIDCardOCRResponse RecognizeIndonesiaIDCardOCR(RecognizeIndonesiaIDCardOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeIndonesiaIDCardOCR", RecognizeIndonesiaIDCardOCRResponse.class);
    }

    /**
     *This API is used to recognize key fields on the photo side of a Macao (China) identity card, including name in Chinese, name in English, telecode for name, date of birth, gender, document symbol, date of the first issue, date of the last receipt, identity card number, and permanent residency attribute. 

This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).
     * @param req RecognizeMacaoIDCardOCRRequest
     * @return RecognizeMacaoIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeMacaoIDCardOCRResponse RecognizeMacaoIDCardOCR(RecognizeMacaoIDCardOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeMacaoIDCardOCR", RecognizeMacaoIDCardOCRResponse.class);
    }

    /**
     *This interface recognizes all fields on both sides of the Mainland China Resident Identity Card (second-generation), including name, gender, ethnicity, date of birth, address, ID number, issuing authority, and validity period, with an accuracy of over 99%.

In addition, the interface provides additional features for various scenarios, such as ID card and portrait photo cropping, along with five alarm detections (see table below).<table style="width:650px"> <thead> <tr> <th width="150">Value-added ability</th> <th width="500">Ability items</th> </tr> </thead> <tbody> <tr> <td rowspan="9">Alarm function</td> </tr> <tr> <td>ID card photocopy warning</td> </tr> <tr> <td>ID card on-screen display warning</td> </tr> <tr> <td>Alarm for occlusion in the ID card frame</td> </tr> <tr> <td>ID card reflective warning</td> </tr> <tr> <td>Blurry picture warning</td> </tr> </tbody> </table> Default rate limit: 20 requests/second.
     * @param req RecognizeMainlandIDCardOCRRequest
     * @return RecognizeMainlandIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeMainlandIDCardOCRResponse RecognizeMainlandIDCardOCR(RecognizeMainlandIDCardOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeMainlandIDCardOCR", RecognizeMainlandIDCardOCRResponse.class);
    }

    /**
     *This interface supports identification of the front and back of Mexican Voter ID Card. The default interface request frequency limit is 5 times per second.
     * @param req RecognizeMexicoVTIDRequest
     * @return RecognizeMexicoVTIDResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeMexicoVTIDResponse RecognizeMexicoVTID(RecognizeMexicoVTIDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeMexicoVTID", RecognizeMexicoVTIDResponse.class);
    }

    /**
     *This API is used to recognize a Philippine driver's license.
     * @param req RecognizePhilippinesDrivingLicenseOCRRequest
     * @return RecognizePhilippinesDrivingLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesDrivingLicenseOCRResponse RecognizePhilippinesDrivingLicenseOCR(RecognizePhilippinesDrivingLicenseOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizePhilippinesDrivingLicenseOCR", RecognizePhilippinesDrivingLicenseOCRResponse.class);
    }

    /**
     *This API is used to recognize a Philippine SSSID/UMID card.
     * @param req RecognizePhilippinesSssIDOCRRequest
     * @return RecognizePhilippinesSssIDOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesSssIDOCRResponse RecognizePhilippinesSssIDOCR(RecognizePhilippinesSssIDOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizePhilippinesSssIDOCR", RecognizePhilippinesSssIDOCRResponse.class);
    }

    /**
     *This API is used to recognize a Philippine TIN ID card.
     * @param req RecognizePhilippinesTinIDOCRRequest
     * @return RecognizePhilippinesTinIDOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesTinIDOCRResponse RecognizePhilippinesTinIDOCR(RecognizePhilippinesTinIDOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizePhilippinesTinIDOCR", RecognizePhilippinesTinIDOCRResponse.class);
    }

    /**
     *This API is used to recognize a Philippine Unified Multi-Purpose ID (UMID) card.
     * @param req RecognizePhilippinesUMIDOCRRequest
     * @return RecognizePhilippinesUMIDOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesUMIDOCRResponse RecognizePhilippinesUMIDOCR(RecognizePhilippinesUMIDOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizePhilippinesUMIDOCR", RecognizePhilippinesUMIDOCRResponse.class);
    }

    /**
     *This API is used to recognize a Philippine voters ID card. It can recognize fields such as first name, family name, date of birth, civil status, citizenship, address, precinct, and voter's identification number (VIN).

The API request rate is limited to 20 requests/sec by default.
     * @param req RecognizePhilippinesVoteIDOCRRequest
     * @return RecognizePhilippinesVoteIDOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesVoteIDOCRResponse RecognizePhilippinesVoteIDOCR(RecognizePhilippinesVoteIDOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizePhilippinesVoteIDOCR", RecognizePhilippinesVoteIDOCRResponse.class);
    }

    /**
     *This interface supports the identification of all fields on the front side of ID card for Singapore residents.The identification accuracy reaches more than 99%.In addition, this interface also supports a variety of value-added capabilities to meet the needs of different scenarios. Such as the cropping function of ID card photos and portrait photos, and also has 5 alarm functions.
As shown in the table below. <table style="width:650px"> <thead> <tr> <th width="150">Value-added ability</th> <th width="500">Ability items</th> </tr> </thead> <tbody> <tr> <td rowspan="9">Alarm function</td> </tr> <tr> <td>ID card copy warning</td> </tr> <tr> <td>ID card copy warning</td> </tr> <tr> <td>Alarm for occlusion in the ID card frame</td> </tr> <tr> <td>ID card reflective warning</td> </tr> <tr> <td>Blurry picture warning</td> </tr> </tbody> </table> Default interface request frequency limit: 20 times/second
     * @param req RecognizeSingaporeIDCardOCRRequest
     * @return RecognizeSingaporeIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeSingaporeIDCardOCRResponse RecognizeSingaporeIDCardOCR(RecognizeSingaporeIDCardOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeSingaporeIDCardOCR", RecognizeSingaporeIDCardOCRResponse.class);
    }

    /**
     *This API is used to recognize the fields on a Thai identity card, including name in Thai, name in English, address, date of birth, identification number, date of issue, and date of expiry.

A maximum of 10 requests can be initiated per second for this API.
     * @param req RecognizeThaiIDCardOCRRequest
     * @return RecognizeThaiIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeThaiIDCardOCRResponse RecognizeThaiIDCardOCR(RecognizeThaiIDCardOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeThaiIDCardOCR", RecognizeThaiIDCardOCRResponse.class);
    }

    /**
     *This API is used to recognize the fields on a Thai identity card, including name in Thai, name in English, address, date of birth, identification number, date of issue, and date of expiry.
Currently, this API is not generally available. For more information, please [contact your sales rep](https://intl.cloud.tencent.com/zh/contact-us).

A maximum of 5 requests can be initiated per second for this API.
     * @param req RecognizeThaiPinkCardRequest
     * @return RecognizeThaiPinkCardResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeThaiPinkCardResponse RecognizeThaiPinkCard(RecognizeThaiPinkCardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecognizeThaiPinkCard", RecognizeThaiPinkCardResponse.class);
    }

    /**
     *This API is used to recognize fields from cards, documents, bills, forms, contracts, and other structured information. It is flexible and efficient to use, without any configuration required. This API is suitable for recognizing structured information.

A maximum of 10 requests can be initiated per second for this API.
     * @param req SmartStructuralOCRV2Request
     * @return SmartStructuralOCRV2Response
     * @throws TencentCloudSDKException
     */
    public SmartStructuralOCRV2Response SmartStructuralOCRV2(SmartStructuralOCRV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SmartStructuralOCRV2", SmartStructuralOCRV2Response.class);
    }

    /**
     *This API is used to recognize the vehicle identification number (VIN) in an image.
     * @param req VinOCRRequest
     * @return VinOCRResponse
     * @throws TencentCloudSDKException
     */
    public VinOCRResponse VinOCR(VinOCRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VinOCR", VinOCRResponse.class);
    }

}
