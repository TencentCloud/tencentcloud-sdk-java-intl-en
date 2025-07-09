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
package com.tencentcloudapi.dms.v20200819;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dms.v20200819.models.*;

public class DmsClient extends AbstractClient{
    private static String endpoint = "dms.intl.tencentcloudapi.com";
    private static String service = "dms";
    private static String version = "2020-08-19";

    public DmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DmsClient(Credential credential, String region, ClientProfile profile) {
        super(DmsClient.endpoint, DmsClient.version, credential, region, profile);
    }

    /**
     *This API is used to send regular emails.
     * @param req SendEmailRequest
     * @return SendEmailResponse
     * @throws TencentCloudSDKException
     */
    public SendEmailResponse SendEmail(SendEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendEmail", SendEmailResponse.class);
    }

    /**
     *This API is used to send template emails.
     * @param req SendTemplatedEmailRequest
     * @return SendTemplatedEmailResponse
     * @throws TencentCloudSDKException
     */
    public SendTemplatedEmailResponse SendTemplatedEmail(SendTemplatedEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendTemplatedEmail", SendTemplatedEmailResponse.class);
    }

}
