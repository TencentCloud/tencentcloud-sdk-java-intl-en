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
package com.tencentcloudapi.rce.v20201103;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.rce.v20201103.models.*;

public class RceClient extends AbstractClient{
    private static String endpoint = "rce.intl.tencentcloudapi.com";
    private static String service = "rce";
    private static String version = "2020-11-03";
    
    public RceClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RceClient(Credential credential, String region, ClientProfile profile) {
        super(RceClient.endpoint, RceClient.version, credential, region, profile);
    }

    /**
     *This API is used to query risk assessment results.
     * @param req DescribeRiskAssessmentRequest
     * @return DescribeRiskAssessmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskAssessmentResponse DescribeRiskAssessment(DescribeRiskAssessmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskAssessment", DescribeRiskAssessmentResponse.class);
    }

}
