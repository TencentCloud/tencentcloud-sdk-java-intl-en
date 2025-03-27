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
package com.tencentcloudapi.vclm.v20240523;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vclm.v20240523.models.*;

public class VclmClient extends AbstractClient{
    private static String endpoint = "vclm.intl.tencentcloudapi.com";
    private static String service = "vclm";
    private static String version = "2024-05-23";
    
    public VclmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VclmClient(Credential credential, String region, ClientProfile profile) {
        super(VclmClient.endpoint, VclmClient.version, credential, region, profile);
    }

    /**
     *This API is used to query image animation tasks. The image animation feature supports generating videos based on dance movements and images to meet the needs of scenarios such as social entertainment and interactive marketing.
     * @param req DescribeImageAnimateJobRequest
     * @return DescribeImageAnimateJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAnimateJobResponse DescribeImageAnimateJob(DescribeImageAnimateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAnimateJob", DescribeImageAnimateJobResponse.class);
    }

    /**
     *This API is used to submit image animation tasks. The image animation feature supports generating videos based on dance movements and images to meet the needs of scenarios such as social entertainment and interactive marketing.
     * @param req SubmitImageAnimateJobRequest
     * @return SubmitImageAnimateJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitImageAnimateJobResponse SubmitImageAnimateJob(SubmitImageAnimateJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitImageAnimateJob", SubmitImageAnimateJobResponse.class);
    }

}
