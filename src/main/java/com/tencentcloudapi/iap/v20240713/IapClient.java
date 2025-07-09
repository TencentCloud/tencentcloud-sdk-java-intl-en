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
package com.tencentcloudapi.iap.v20240713;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iap.v20240713.models.*;

public class IapClient extends AbstractClient{
    private static String endpoint = "iap.intl.tencentcloudapi.com";
    private static String service = "iap";
    private static String version = "2024-07-13";

    public IapClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IapClient(Credential credential, String region, ClientProfile profile) {
        super(IapClient.endpoint, IapClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a user OIDC configuration. Only one user OIDC IdP can be created, and the user SAML SSO IdP will be automatically disabled after it is created.
     * @param req CreateIAPUserOIDCConfigRequest
     * @return CreateIAPUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateIAPUserOIDCConfigResponse CreateIAPUserOIDCConfig(CreateIAPUserOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIAPUserOIDCConfig", CreateIAPUserOIDCConfigResponse.class);
    }

    /**
     *This API is used to query login session duration.
     * @param req DescribeIAPLoginSessionDurationRequest
     * @return DescribeIAPLoginSessionDurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIAPLoginSessionDurationResponse DescribeIAPLoginSessionDuration(DescribeIAPLoginSessionDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIAPLoginSessionDuration", DescribeIAPLoginSessionDurationResponse.class);
    }

    /**
     *This API is used to query a user OIDC configuration.
     * @param req DescribeIAPUserOIDCConfigRequest
     * @return DescribeIAPUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIAPUserOIDCConfigResponse DescribeIAPUserOIDCConfig(DescribeIAPUserOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIAPUserOIDCConfig", DescribeIAPUserOIDCConfigResponse.class);
    }

    /**
     *This API is used to disable user SSO.
     * @param req DisableIAPUserSSORequest
     * @return DisableIAPUserSSOResponse
     * @throws TencentCloudSDKException
     */
    public DisableIAPUserSSOResponse DisableIAPUserSSO(DisableIAPUserSSORequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableIAPUserSSO", DisableIAPUserSSOResponse.class);
    }

    /**
     *This API is used to modify login session duration.
     * @param req ModifyIAPLoginSessionDurationRequest
     * @return ModifyIAPLoginSessionDurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIAPLoginSessionDurationResponse ModifyIAPLoginSessionDuration(ModifyIAPLoginSessionDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIAPLoginSessionDuration", ModifyIAPLoginSessionDurationResponse.class);
    }

    /**
     *This API is used to modify a user OIDC configuration.
     * @param req UpdateIAPUserOIDCConfigRequest
     * @return UpdateIAPUserOIDCConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateIAPUserOIDCConfigResponse UpdateIAPUserOIDCConfig(UpdateIAPUserOIDCConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateIAPUserOIDCConfig", UpdateIAPUserOIDCConfigResponse.class);
    }

}
