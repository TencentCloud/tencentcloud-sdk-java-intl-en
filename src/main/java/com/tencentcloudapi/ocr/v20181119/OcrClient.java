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
    private static String endpoint = "ocr.tencentcloudapi.com";
    private static String service = "ocr";
    private static String version = "2018-11-19";

    public OcrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OcrClient(Credential credential, String region, ClientProfile profile) {
        super(OcrClient.endpoint, OcrClient.version, credential, region, profile);
    }

    /**
     *This API is used to detect and recognize key fields such as the card number, bank information, and expiration date on mainstream bank cards in Mainland China.

This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).
     * @param req BankCardOCRRequest
     * @return BankCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public BankCardOCRResponse BankCardOCR(BankCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BankCardOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BankCardOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BankCardOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<GeneralAccurateOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GeneralAccurateOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GeneralAccurateOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<GeneralBasicOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GeneralBasicOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GeneralBasicOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize key fields on the photo side of a Hong Kong (China) identity card, including name in Chinese, name in English, telecode for name, date of birth, gender, document symbol, date of the first issue, date of the last receipt, identity card number, and permanent residency attribute. It can check for card authenticity and crop the identity photo.

This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).

     * @param req HKIDCardOCRRequest
     * @return HKIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public HKIDCardOCRResponse HKIDCardOCR(HKIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HKIDCardOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<HKIDCardOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "HKIDCardOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize key fields on the front and back sides of a residence permit for Hong Kong, Macao, or Taiwan residents, including name, gender, date of birth, address, ID number, issuing authority, validity period, number of issues, and permit number. It can be used for residence permit OCR in scenarios such as bank account opening and user registration.

A maximum of 20 requests can be initiated per second for this API.
     * @param req HmtResidentPermitOCRRequest
     * @return HmtResidentPermitOCRResponse
     * @throws TencentCloudSDKException
     */
    public HmtResidentPermitOCRResponse HmtResidentPermitOCR(HmtResidentPermitOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HmtResidentPermitOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<HmtResidentPermitOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "HmtResidentPermitOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize all fields on the front and back sides of a second-generation resident identity card for the Chinese mainland: name, gender, ethnicity, date of birth, domicile, identification number, issuing authority, and validity period, with a recognition accuracy of over 99%.

In addition, this API supports multiple value-added capabilities to meet the needs of different scenarios. It can crop ID card photos and profile photos, and provide warnings for nine cases, as detailed below.

<table style="width:650px">
      <thead>
        <tr>
       <th width="150">Capability</th>
          <th width="500">Description</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td rowspan="2">Cropping</td>
          <td>Crops the ID card photo (by removing extra edges outside the ID card and automatically correcting the shooting angle).</td>
        </tr>
        <tr>
          <td>Crops the profile photo (by automatically cutting out the face area in the ID card).</td>
        </tr>
        <tr>
          <td rowspan="9">Warning</td>
          <td>Warns about invalid ID card validity periods.</td>
        </tr>
        <tr>
          <td>Warns about  incomplete ID card borders.</td>
        </tr>
        <tr>
          <td>Warns about photocopied images.</td>
        </tr>
        <tr>
          <td>Warns about spoofed images.</td>
        </tr>
          <tr>
          <td>Warns about border and frame occlusions.</td>
        </tr>
         <tr>
          <td>Warns about temporary ID cards.</td>
        </tr>
          <tr>
          <td>Warns about photoshopped images.</td>
        </tr>
          <tr>
          <td>Warns about blurry ID card images (blurriness can be determined based on the image quality score).</td>
        </tr>
      </tbody>
    </table>

A maximum of 20 requests can be initiated per second for this API.
     * @param req IDCardOCRRequest
     * @return IDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public IDCardOCRResponse IDCardOCR(IDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IDCardOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IDCardOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IDCardOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a license plate attached to a motor vehicle in the Chinese mainland and return the regional code, license plate number, and license plate color.

A maximum of 10 requests can be initiated per second for this API.
     * @param req LicensePlateOCRRequest
     * @return LicensePlateOCRResponse
     * @throws TencentCloudSDKException
     */
    public LicensePlateOCRResponse LicensePlateOCR(LicensePlateOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LicensePlateOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<LicensePlateOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LicensePlateOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a Malaysian identity card, including identity card number, name, gender, and address. It is also used to crop identity photos and give alarms for photographed or photocopied certificates.

This API is not fully available for the time being. For more information, contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).
     * @param req MLIDCardOCRRequest
     * @return MLIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public MLIDCardOCRResponse MLIDCardOCR(MLIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MLIDCardOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MLIDCardOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MLIDCardOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a passport issued in Hong Kong/Macao/Taiwan (China) or other countries/regions. Recognizable fields include passport ID, name, date of birth, gender, expiration date, issuing country/region, and nationality. It has the features of cropping identity photos and alarming for photographed or photocopied documents.

This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).
     * @param req MLIDPassportOCRRequest
     * @return MLIDPassportOCRResponse
     * @throws TencentCloudSDKException
     */
    public MLIDPassportOCRResponse MLIDPassportOCR(MLIDPassportOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MLIDPassportOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MLIDPassportOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MLIDPassportOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize all fields on the front of a mainland travel permit for Hong Kong, Macao, or Taiwan residents: name in Chinese, name in English, gender, date of birth, issuing authority, validity period, document number, place of issuance, number of issues, and document type.

A maximum of 20 requests can be initiated per second for this API.
     * @param req MainlandPermitOCRRequest
     * @return MainlandPermitOCRResponse
     * @throws TencentCloudSDKException
     */
    public MainlandPermitOCRResponse MainlandPermitOCR(MainlandPermitOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MainlandPermitOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MainlandPermitOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MainlandPermitOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize the fields on an exit/entry permit (card) for traveling to and from Hong Kong, Macao, or Taiwan, including place of issuance, issuing authority, validity period, gender, date of birth, name in English, name in Chinese, and document number.

A maximum of 10 requests can be initiated per second for this API.
     * @param req PermitOCRRequest
     * @return PermitOCRResponse
     * @throws TencentCloudSDKException
     */
    public PermitOCRResponse PermitOCR(PermitOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PermitOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PermitOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PermitOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize various types of invoices or tickets in an image or PDF file. You can also specify a type. 14 types of standard expense reimbursement invoices are supported, including value-added tax (VAT) invoice (special, general, roll, blockchain, and toll), fully digitalized electronic invoice (special and general), non-tax revenue invoice (general receipt and general payment voucher), quota invoice, general machine-printed invoice, car sales invoice (motor vehicle sales invoice and used car invoice), train ticket, taxi receipt, itinerary/receipt of e-ticket for air transportation, bus ticket, ship ticket, toll receipt, and medical invoice (inpatient and outpatient). This API can also be used for intelligent recognition of other types of invoices. To try now, click [here](https://intl.cloud.tencent.com/product/ocr?from_cn_redirect=1).

A maximum of 5 requests can be initiated per second for this API.


The invoice/ticket subtype (SubType), subtype description (TypeDescription), and parent type (Type) can be returned, as described below:
<table style="width:715px">
      <thead>
        <tr>
          <th style="width:200px">SubType</th>
          <th style="width:200px">TypeDescription</th>
          <th >Type</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td> VatSpecialInvoice</td>
          <td> Special VAT invoice </td>
          <td> 3 </td>
        </tr>
        <tr>
          <td> VatCommonInvoice</td>
          <td> General VAT invoice </td>
          <td> 3 </td>
        </tr>
        <tr>
          <td> VatElectronicCommonInvoice </td>
          <td> Electronic general VAT invoice </td>
          <td> 3 </td>
        </tr>
        <tr>
          <td> VatElectronicSpecialInvoice </td>
          <td> Electronic special VAT invoice </td>
          <td> 3 </td>
        </tr>
        <tr>
          <td> VatElectronicInvoiceBlockchain</td>
          <td> Blockchain electronic invoice </td>
          <td> 3 </td>
        </tr>
        <tr>
          <td> VatElectronicInvoiceToll</td>
          <td> Electronic general VAT invoice (toll)</td>
          <td> 3 </td>
        </tr>
        <tr>
          <td> VatElectronicSpecialInvoiceFull</td>
          <td> Electronic invoice (special)</td>
          <td> 16 </td>
        </tr>
        <tr>
          <td> VatElectronicInvoiceFull</td>
          <td> Electronic invoice (general) </td>
          <td> 16 </td>
        </tr>
        <tr>
          <td> MotorVehicleSaleInvoice </td>
          <td> Motor vehicle sales invoice </td>
          <td> 12 </td>
        </tr>
        <tr>
          <td> UsedCarPurchaseInvoice </td>
          <td> Used car invoice </td>
          <td> 12 </td>
        </tr>
        <tr>
          <td> VatInvoiceRoll </td>
          <td> General VAT invoice (roll) </td>
          <td> 11 </td>
        </tr>
        <tr>
          <td> TaxiTicket </td>
          <td> Taxi receipt </td>
          <td> 0 </td>
        </tr>
        <tr>
          <td> QuotaInvoice </td>
          <td> Quota invoice </td>
          <td> 1 </td>
        </tr>
        <tr>
          <td> TrainTicket </td>
          <td> Train ticket </td>
          <td> 2 </td>
        </tr>
        <tr>
          <td> AirTransport </td>
          <td> Itinerary/Receipt of e-ticket for air transportation </td>
          <td> 5 </td>
        </tr>
        <tr>
          <td> MachinePrintedInvoice </td>
          <td> General machine-printed invoice </td>
          <td> 8 </td>
        </tr>
        <tr>
          <td> BusInvoice </td>
          <td> Bus ticket </td>
          <td> 9 </td>
        </tr>
        <tr>
          <td> ShippingInvoice </td>
          <td> Ship ticket </td>
          <td> 10 </td>
        </tr>
        <tr>
          <td> NonTaxIncomeGeneralBill </td>
          <td> General receipt for non-tax revenue </td>
          <td> 15 </td>
        </tr>
        <tr>
          <td> NonTaxIncomeElectronicBill </td>
          <td> General payment voucher for non-tax revenue (electronic) </td>
          <td> 15 </td>
        </tr>
        <tr>
          <td> TollInvoice </td>
          <td> Toll receipt </td>
          <td> 13 </td>
        </tr>
        <tr>
          <td> OtherInvoice </td>
          <td> Other </td>
          <td> -1 </td>
        </tr>
      </tbody>
    </table>
     * @param req RecognizeGeneralInvoiceRequest
     * @return RecognizeGeneralInvoiceResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeGeneralInvoiceResponse RecognizeGeneralInvoice(RecognizeGeneralInvoiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeGeneralInvoiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeGeneralInvoiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizeGeneralInvoice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize an Indonesian identity card.

The API request rate is limited to 20 requests/sec by default.
     * @param req RecognizeIndonesiaIDCardOCRRequest
     * @return RecognizeIndonesiaIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeIndonesiaIDCardOCRResponse RecognizeIndonesiaIDCardOCR(RecognizeIndonesiaIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeIndonesiaIDCardOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeIndonesiaIDCardOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizeIndonesiaIDCardOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a South Korean driver's license.
     * @param req RecognizeKoreanDrivingLicenseOCRRequest
     * @return RecognizeKoreanDrivingLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeKoreanDrivingLicenseOCRResponse RecognizeKoreanDrivingLicenseOCR(RecognizeKoreanDrivingLicenseOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeKoreanDrivingLicenseOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeKoreanDrivingLicenseOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizeKoreanDrivingLicenseOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a South Korean ID card.
     * @param req RecognizeKoreanIDCardOCRRequest
     * @return RecognizeKoreanIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeKoreanIDCardOCRResponse RecognizeKoreanIDCardOCR(RecognizeKoreanIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeKoreanIDCardOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeKoreanIDCardOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizeKoreanIDCardOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a Philippine driver's license.
     * @param req RecognizePhilippinesDrivingLicenseOCRRequest
     * @return RecognizePhilippinesDrivingLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesDrivingLicenseOCRResponse RecognizePhilippinesDrivingLicenseOCR(RecognizePhilippinesDrivingLicenseOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizePhilippinesDrivingLicenseOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizePhilippinesDrivingLicenseOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizePhilippinesDrivingLicenseOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a Philippine SSSID/UMID card.
     * @param req RecognizePhilippinesSssIDOCRRequest
     * @return RecognizePhilippinesSssIDOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesSssIDOCRResponse RecognizePhilippinesSssIDOCR(RecognizePhilippinesSssIDOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizePhilippinesSssIDOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizePhilippinesSssIDOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizePhilippinesSssIDOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a Philippine TIN ID card.
     * @param req RecognizePhilippinesTinIDOCRRequest
     * @return RecognizePhilippinesTinIDOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesTinIDOCRResponse RecognizePhilippinesTinIDOCR(RecognizePhilippinesTinIDOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizePhilippinesTinIDOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizePhilippinesTinIDOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizePhilippinesTinIDOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a Philippine Unified Multi-Purpose ID (UMID) card.
     * @param req RecognizePhilippinesUMIDOCRRequest
     * @return RecognizePhilippinesUMIDOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesUMIDOCRResponse RecognizePhilippinesUMIDOCR(RecognizePhilippinesUMIDOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizePhilippinesUMIDOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizePhilippinesUMIDOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizePhilippinesUMIDOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a Philippine voters ID card. It can recognize fields such as first name, family name, date of birth, civil status, citizenship, address, precinct, and voter's identification number (VIN).

The API request rate is limited to 20 requests/sec by default.
     * @param req RecognizePhilippinesVoteIDOCRRequest
     * @return RecognizePhilippinesVoteIDOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizePhilippinesVoteIDOCRResponse RecognizePhilippinesVoteIDOCR(RecognizePhilippinesVoteIDOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizePhilippinesVoteIDOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizePhilippinesVoteIDOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizePhilippinesVoteIDOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize regular tables, borderless tables, or multi-tables in images or PDF files containing Chinese and English texts. It returns the text content of each cell, supports recognition of rotated table images, and can save the recognition results into an Excel document. It delivers higher recognition accuracy than that of table OCR v2 and applies to more scenarios. The recognition accuracy in difficult table scenarios, such as irregular tables and nested tables (borderless tables contained in bordered tables), is better than that of table OCR v2. To try it, click [here](https://intl.cloud.tencent.com/product/smart?from_cn_redirect=1-ocr).

A maximum of 2 requests can be initiated per second for this API.
     * @param req RecognizeTableAccurateOCRRequest
     * @return RecognizeTableAccurateOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeTableAccurateOCRResponse RecognizeTableAccurateOCR(RecognizeTableAccurateOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeTableAccurateOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeTableAccurateOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizeTableAccurateOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize the fields on a Thai identity card, including name in Thai, name in English, address, date of birth, identification number, date of issue, and date of expiry.
Currently, this API is not generally available. For more information, please [contact your sales rep](https://intl.cloud.tencent.com/about/connect?from_cn_redirect=1).

A maximum of 10 requests can be initiated per second for this API.
     * @param req RecognizeThaiIDCardOCRRequest
     * @return RecognizeThaiIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeThaiIDCardOCRResponse RecognizeThaiIDCardOCR(RecognizeThaiIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeThaiIDCardOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeThaiIDCardOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecognizeThaiIDCardOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize various types of seals, including invoice seals and finance seals. It is suitable for scenarios such as official document and invoice/ticket OCR.

A maximum of 5 requests can be initiated per second for this API.
     * @param req SealOCRRequest
     * @return SealOCRResponse
     * @throws TencentCloudSDKException
     */
    public SealOCRResponse SealOCR(SealOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SealOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SealOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SealOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize fields from cards, documents, bills, forms, contracts, and other structured information. It is flexible and efficient to use, without any configuration required. This API is suitable for recognizing structured information.

A maximum of 10 requests can be initiated per second for this API.
     * @param req SmartStructuralOCRV2Request
     * @return SmartStructuralOCRV2Response
     * @throws TencentCloudSDKException
     */
    public SmartStructuralOCRV2Response SmartStructuralOCRV2(SmartStructuralOCRV2Request req) throws TencentCloudSDKException{
        JsonResponseModel<SmartStructuralOCRV2Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SmartStructuralOCRV2Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SmartStructuralOCRV2");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to detect and recognize Chinese and English forms in images. It can return the text content of each cell and save the recognition result as Excel.

This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://intl.cloud.tencent.com/contact-sales).
     * @param req TableOCRRequest
     * @return TableOCRResponse
     * @throws TencentCloudSDKException
     */
    public TableOCRResponse TableOCR(TableOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TableOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TableOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TableOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize the vehicle identification number (VIN) in an image.
     * @param req VinOCRRequest
     * @return VinOCRResponse
     * @throws TencentCloudSDKException
     */
    public VinOCRResponse VinOCR(VinOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VinOCRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VinOCRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VinOCR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
