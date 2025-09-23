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
package com.tencentcloudapi.quota.v20241204;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.quota.v20241204.models.*;

public class QuotaClient extends AbstractClient{
    private static String endpoint = "quota.intl.tencentcloudapi.com";
    private static String service = "quota";
    private static String version = "2024-12-04";

    public QuotaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public QuotaClient(Credential credential, String region, ClientProfile profile) {
        super(QuotaClient.endpoint, QuotaClient.version, credential, region, profile);
    }

    /**
     *Add alarm rules
     * @param req CreateAlarmRequest
     * @return CreateAlarmResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmResponse CreateAlarm(CreateAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarm", CreateAlarmResponse.class);
    }

}
