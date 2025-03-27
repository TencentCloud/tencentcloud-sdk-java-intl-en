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
package com.tencentcloudapi.sts.v20180813;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.sts.v20180813.models.*;

public class StsClient extends AbstractClient{
    private static String endpoint = "sts.intl.tencentcloudapi.com";
    private static String service = "sts";
    private static String version = "2018-08-13";
    
    public StsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public StsClient(Credential credential, String region, ClientProfile profile) {
        super(StsClient.endpoint, StsClient.version, credential, region, profile);
    }

    /**
     *This API is used to request for the temporary security credentials of a role.
     * @param req AssumeRoleRequest
     * @return AssumeRoleResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleResponse AssumeRole(AssumeRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssumeRole", AssumeRoleResponse.class);
    }

    /**
     *This API is used to request for the temporary credentials for a role that has been authenticated via a SAML assertion.
     * @param req AssumeRoleWithSAMLRequest
     * @return AssumeRoleWithSAMLResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleWithSAMLResponse AssumeRoleWithSAML(AssumeRoleWithSAMLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(true);
        return this.internalRequest(req, "AssumeRoleWithSAML", AssumeRoleWithSAMLResponse.class);
    }

    /**
     *This API is used to apply for an OIDC role credential.
     * @param req AssumeRoleWithWebIdentityRequest
     * @return AssumeRoleWithWebIdentityResponse
     * @throws TencentCloudSDKException
     */
    public AssumeRoleWithWebIdentityResponse AssumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(true);
        return this.internalRequest(req, "AssumeRoleWithWebIdentity", AssumeRoleWithWebIdentityResponse.class);
    }

    /**
     *This API is used to get the identity information of the current caller.
The persistent keys of the root account and sub-account as well as the temporary credentials generated by `AssumeRole` and `GetFederationToken` can be used to get the identity information.
     * @param req GetCallerIdentityRequest
     * @return GetCallerIdentityResponse
     * @throws TencentCloudSDKException
     */
    public GetCallerIdentityResponse GetCallerIdentity(GetCallerIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCallerIdentity", GetCallerIdentityResponse.class);
    }

    /**
     *This API is used to get temporary credentials for a federated user.
     * @param req GetFederationTokenRequest
     * @return GetFederationTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetFederationTokenResponse GetFederationToken(GetFederationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFederationToken", GetFederationTokenResponse.class);
    }

}
