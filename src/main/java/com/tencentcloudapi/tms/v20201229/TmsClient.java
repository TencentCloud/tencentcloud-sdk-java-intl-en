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
package com.tencentcloudapi.tms.v20201229;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tms.v20201229.models.*;

public class TmsClient extends AbstractClient{
    private static String endpoint = "tms.intl.tencentcloudapi.com";
    private static String service = "tms";
    private static String version = "2020-12-29";

    public TmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TmsClient(Credential credential, String region, ClientProfile profile) {
        super(TmsClient.endpoint, TmsClient.version, credential, region, profile);
    }

    /**
     *This API is used to submit text content for intelligent moderation. 

### Notes
- Before invoking this API, be sure you have activated Tencent Cloud Text Moderation System in the [Content Moderation - Text Moderation System](https://console.cloud.tencent.com/cms/text/package) console.
- This is a paid API. For the billing details, see [Text Moderation System Pricing](https://www.tencentcloud.com/document/product/1121/43752).

 
 
 
 
 
 

### Use limits
- The submitted texts can not be longer than 10,000 unicode characters.
- English letters, digits and Chinese characters are supported for moderation.
- The API request frequency limit: **1,000 times/second**.
     * @param req TextModerationRequest
     * @return TextModerationResponse
     * @throws TencentCloudSDKException
     */
    public TextModerationResponse TextModeration(TextModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextModeration", TextModerationResponse.class);
    }

}
