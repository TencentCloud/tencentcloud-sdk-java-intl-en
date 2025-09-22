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
package com.tencentcloudapi.cdz.v20221123;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdz.v20221123.models.*;

public class CdzClient extends AbstractClient{
    private static String endpoint = "cdz.intl.tencentcloudapi.com";
    private static String service = "cdz";
    private static String version = "2022-11-23";

    public CdzClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdzClient(Credential credential, String region, ClientProfile profile) {
        super(CdzClient.endpoint, CdzClient.version, credential, region, profile);
    }

    /**
     *This API is used to query resource usage of each vertical product in Cloud Dedicated Zone.
     * @param req DescribeCloudDedicatedZoneResourceSummaryRequest
     * @return DescribeCloudDedicatedZoneResourceSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudDedicatedZoneResourceSummaryResponse DescribeCloudDedicatedZoneResourceSummary(DescribeCloudDedicatedZoneResourceSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudDedicatedZoneResourceSummary", DescribeCloudDedicatedZoneResourceSummaryResponse.class);
    }

}
