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
package com.tencentcloudapi.tmt.v20180321;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tmt.v20180321.models.*;

public class TmtClient extends AbstractClient{
    private static String endpoint = "tmt.intl.tencentcloudapi.com";
    private static String service = "tmt";
    private static String version = "2018-03-21";

    public TmtClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TmtClient(Credential credential, String region, ClientProfile profile) {
        super(TmtClient.endpoint, TmtClient.version, credential, region, profile);
    }

    /**
     *This API is used to provide translation service for images in 18 languages. It can automatically recognize text content in images and translate it into the target language. The recognized text is translated line by line, and a version that supports paragraph translation will be offered subsequently.

-Input image format: png, jpg, jpeg and other common image formats. gif animation is not supported.
-Output image format: jpg.

Notification: For general developers, we recommend prioritizing SDK integration to simplify development. For SDK usage introduction, directly view the 5. Developer Resources part.
     * @param req ImageTranslateLLMRequest
     * @return ImageTranslateLLMResponse
     * @throws TencentCloudSDKException
     */
    public ImageTranslateLLMResponse ImageTranslateLLM(ImageTranslateLLMRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageTranslateLLM", ImageTranslateLLMResponse.class);
    }

}
