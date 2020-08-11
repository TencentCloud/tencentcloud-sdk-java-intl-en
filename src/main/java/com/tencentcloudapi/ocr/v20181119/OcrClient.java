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
    private static String version = "2018-11-19";

    public OcrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OcrClient(Credential credential, String region, ClientProfile profile) {
        super(OcrClient.endpoint, OcrClient.version, credential, region, profile);
    }

    /**
     *This API is used to detect and recognize key fields such as the card number, bank information, and expiration date on mainstream bank cards in Mainland China.
     * @param req BankCardOCRRequest
     * @return BankCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public BankCardOCRResponse BankCardOCR(BankCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BankCardOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BankCardOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BankCardOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to detect and recognize characters in an image in the following 19 languages: Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, and Thai. Mixed characters in English and each supported language can be recognized together.

It can recognize printed text in paper documents, online images, ads, signboards, menus, video titles, profile photos, etc.

Product strengths: it can automatically recognize the text language, return the text box coordinate information, and automatically rotate tilted text to the upright direction.

The differences between different editions of general print recognition are as detailed below:
<table style="width:715px">
      <thead>
        <tr>
          <th style="width:150px"></th>
          <th style="width:200px">**(Recommended)** General Print Recognition</th>
          <th ><a href="https://cloud.tencent.com/document/product/866/34937">**(Recommended)** General Print Recognition (High-Precision)</a></th>
          <th><a href="https://cloud.tencent.com/document/product/866/37831">General Print Recognition (Simplified)</a></th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>Use case</td>
          <td>It is suitable for recognition of printed text in all general scenarios</td>
          <td>It is suitable for content with high recognition difficulty such as a large number of characters, long strings of digits, small characters, blurry characters, and tilted text</td>
          <td>It is suitable for fast text recognition, which compromises the accuracy and recall rate but is more cost-effective</td>
        </tr>
        <tr>
          <td>Recognition accuracy rate</td>
          <td>96%</td>
          <td>99%</td>
          <td>91%</td>
        </tr>
        <tr>
          <td>Price</td>
          <td>Medium</td>
          <td>High</td>
          <td>Low</td>
        </tr>
        <tr>
          <td>Supported languages</td>
          <td>Chinese, English, Chinese-English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, and Thai</td>
          <td>Chinese, English, and Chinese-English</td>
          <td>Chinese, English, and Chinese-English</td>
        </tr>
        <tr>
          <td>Automatic language detection</td>
          <td>Supported</td>
          <td>Supported</td>
          <td>Supported</td>
        </tr>
        <tr>
          <td>Return of text line coordinates</td>
          <td>Supported</td>
          <td>Supported</td>
          <td>Supported</td>
        </tr>
        <tr>
          <td>Automatic rotation correction</td>
          <td>Rotation recognition is supported, and the angle information can be returned</td>
          <td>Rotation recognition is supported, but no angle information can be returned</td>
          <td>Rotation recognition is supported, and the angle information can be returned</td>
        </tr>
      </tbody>
    </table>
     * @param req GeneralBasicOCRRequest
     * @return GeneralBasicOCRResponse
     * @throws TencentCloudSDKException
     */
    public GeneralBasicOCRResponse GeneralBasicOCR(GeneralBasicOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GeneralBasicOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GeneralBasicOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GeneralBasicOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize key fields on the photo side of a Hong Kong (China) identity card, including name in Chinese, name in English, telecode for name, date of birth, gender, document symbol, date of the first issue, date of the last receipt, identity card number, and permanent residency attribute. It can check for card authenticity and crop the identity photo.
This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://cloud.tencent.com/about/connect).

     * @param req HKIDCardOCRRequest
     * @return HKIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public HKIDCardOCRResponse HKIDCardOCR(HKIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HKIDCardOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<HKIDCardOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "HKIDCardOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a Malaysian identity card. Recognizable fields include identity card number, name, gender, and address. It has the features of cropping identity photos and alarming for photographed or photocopied documents.
This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://cloud.tencent.com/about/connect).

     * @param req MLIDCardOCRRequest
     * @return MLIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public MLIDCardOCRResponse MLIDCardOCR(MLIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MLIDCardOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MLIDCardOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MLIDCardOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to recognize a passport issued outside Mainland China. Recognizable fields include passport ID, name, date of birth, gender, expiration date, issuing country/region, and nationality. It has the features of cropping identity photos and alarming for spoofed or photocopied documents.
This API is not fully available for the time being. For more information, please contact your [Tencent Cloud sales rep](https://cloud.tencent.com/about/connect).
     * @param req MLIDPassportOCRRequest
     * @return MLIDPassportOCRResponse
     * @throws TencentCloudSDKException
     */
    public MLIDPassportOCRResponse MLIDPassportOCR(MLIDPassportOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MLIDPassportOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MLIDPassportOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MLIDPassportOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
