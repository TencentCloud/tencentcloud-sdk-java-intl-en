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
package com.tencentcloudapi.ciam.v20210420;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ciam.v20210420.models.*;

public class CiamClient extends AbstractClient{
    private static String endpoint = "ciam.intl.tencentcloudapi.com";
    private static String service = "ciam";
    private static String version = "2021-04-20";

    public CiamClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CiamClient(Credential credential, String region, ClientProfile profile) {
        super(CiamClient.endpoint, CiamClient.version, credential, region, profile);
    }

    /**
     *This API is used to list user groups.
     * @param req ListUserGroupsRequest
     * @return ListUserGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListUserGroupsResponse ListUserGroups(ListUserGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUserGroups", ListUserGroupsResponse.class);
    }

}
