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
    private static String endpoint = "tmt.tencentcloudapi.com";
    private static String service = "tmt";
    private static String version = "2018-03-21";
    
    public TmtClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TmtClient(Credential credential, String region, ClientProfile profile) {
        super(TmtClient.endpoint, TmtClient.version, credential, region, profile);
    }

    /**
     *This API is used to translate text in multiple language pairs, such as Chinese-English.<br />
Note: We recommend that you simplify your development with the SDK integration mode. For how to use the SDK, see Section 5 "Developer Resources".
     * @param req TextTranslateRequest
     * @return TextTranslateResponse
     * @throws TencentCloudSDKException
     */
    public TextTranslateResponse TextTranslate(TextTranslateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextTranslate", TextTranslateResponse.class);
    }

}
