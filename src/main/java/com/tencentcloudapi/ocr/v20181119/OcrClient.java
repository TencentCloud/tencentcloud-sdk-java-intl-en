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
     *This API is used to recognize a Malaysian passport. Recognizable fields include passport ID, name, date of birth, gender, expiration date, issuing country, and nationality. It has the features of cropping identity photos and alarming for photographed or photocopied documents.
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
