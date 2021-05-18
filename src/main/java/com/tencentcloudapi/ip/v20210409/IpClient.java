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
package com.tencentcloudapi.ip.v20210409;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ip.v20210409.models.*;

public class IpClient extends AbstractClient{
    private static String endpoint = "ip.tencentcloudapi.com";
    private static String service = "ip";
    private static String version = "2021-04-09";

    public IpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IpClient(Credential credential, String region, ClientProfile profile) {
        super(IpClient.endpoint, IpClient.version, credential, region, profile);
    }

    /**
     *On the partner platform, create a Tencent Cloud account. After the sub-customer is registered, it will be automatically bound to the partner account.

Notes: <br>
1. Create a Tencent Cloud account and enter the email address , Mobile phone number, the partner needs to verify the validity.<br>
2, the customer needs to add personal information for the first login
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Get country and region code
     * @param req GetCountryCodesRequest
     * @return GetCountryCodesResponse
     * @throws TencentCloudSDKException
     */
    public GetCountryCodesResponse GetCountryCodes(GetCountryCodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCountryCodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCountryCodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCountryCodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
