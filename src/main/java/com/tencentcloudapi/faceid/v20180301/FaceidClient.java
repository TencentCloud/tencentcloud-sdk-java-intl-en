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
package com.tencentcloudapi.faceid.v20180301;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.faceid.v20180301.models.*;

public class FaceidClient extends AbstractClient{
    private static String endpoint = "faceid.tencentcloudapi.com";
    private static String service = "faceid";
    private static String version = "2018-03-01";
    
    public FaceidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public FaceidClient(Credential credential, String region, ClientProfile profile) {
        super(FaceidClient.endpoint, FaceidClient.version, credential, region, profile);
    }

    /**
     *This API is used to apply for a token before calling the Identity Verification SDK service each time. This token is required for initiating the verification process and getting the result after the verification is completed.
     * @param req ApplySdkVerificationTokenRequest
     * @return ApplySdkVerificationTokenResponse
     * @throws TencentCloudSDKException
     */
    public ApplySdkVerificationTokenResponse ApplySdkVerificationToken(ApplySdkVerificationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplySdkVerificationToken", ApplySdkVerificationTokenResponse.class);
    }

    /**
     *This API is used to get the verification result with the corresponding token after the SDK-based verification is completed. The token is valid for three days after issuance and can be called multiple times.
     * @param req GetSdkVerificationResultRequest
     * @return GetSdkVerificationResultResponse
     * @throws TencentCloudSDKException
     */
    public GetSdkVerificationResultResponse GetSdkVerificationResult(GetSdkVerificationResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetSdkVerificationResult", GetSdkVerificationResultResponse.class);
    }

}
