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
package com.tencentcloudapi.mdc.v20200828;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mdc.v20200828.models.*;

public class MdcClient extends AbstractClient{
    private static String endpoint = "mdc.tencentcloudapi.com";
    private static String version = "2020-08-28";

    public MdcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MdcClient(Credential credential, String region, ClientProfile profile) {
        super(MdcClient.endpoint, MdcClient.version, credential, region, profile);
    }

    /**
     *This API is used to create the configuration of a MediaConnect flow.
     * @param req CreateMediaConnectFlowRequest
     * @return CreateMediaConnectFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateMediaConnectFlowResponse CreateMediaConnectFlow(CreateMediaConnectFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMediaConnectFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMediaConnectFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMediaConnectFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create the output information of a MediaConnect flow.
     * @param req CreateMediaConnectOutputRequest
     * @return CreateMediaConnectOutputResponse
     * @throws TencentCloudSDKException
     */
    public CreateMediaConnectOutputResponse CreateMediaConnectOutput(CreateMediaConnectOutputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMediaConnectOutputResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMediaConnectOutputResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMediaConnectOutput");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the configuration of a MediaConnect flow.
     * @param req DeleteMediaConnectFlowRequest
     * @return DeleteMediaConnectFlowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaConnectFlowResponse DeleteMediaConnectFlow(DeleteMediaConnectFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMediaConnectFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMediaConnectFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMediaConnectFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the output configuration of a MediaConnect flow.
     * @param req DeleteMediaConnectOutputRequest
     * @return DeleteMediaConnectOutputResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaConnectOutputResponse DeleteMediaConnectOutput(DeleteMediaConnectOutputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMediaConnectOutputResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMediaConnectOutputResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMediaConnectOutput");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the configuration information of a MediaConnect flow.
     * @param req DescribeMediaConnectFlowRequest
     * @return DescribeMediaConnectFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaConnectFlowResponse DescribeMediaConnectFlow(DescribeMediaConnectFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaConnectFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaConnectFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMediaConnectFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the configuration information of multiple MediaConnect flows in batches.
     * @param req DescribeMediaConnectFlowsRequest
     * @return DescribeMediaConnectFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaConnectFlowsResponse DescribeMediaConnectFlows(DescribeMediaConnectFlowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaConnectFlowsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaConnectFlowsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMediaConnectFlows");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the configuration information of a MediaConnect flow.
     * @param req ModifyMediaConnectFlowRequest
     * @return ModifyMediaConnectFlowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaConnectFlowResponse ModifyMediaConnectFlow(ModifyMediaConnectFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaConnectFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaConnectFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMediaConnectFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the input information of a MediaConnect flow.
     * @param req ModifyMediaConnectInputRequest
     * @return ModifyMediaConnectInputResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaConnectInputResponse ModifyMediaConnectInput(ModifyMediaConnectInputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaConnectInputResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaConnectInputResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMediaConnectInput");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the output configuration of a MediaConnect flow.
     * @param req ModifyMediaConnectOutputRequest
     * @return ModifyMediaConnectOutputResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaConnectOutputResponse ModifyMediaConnectOutput(ModifyMediaConnectOutputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaConnectOutputResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaConnectOutputResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMediaConnectOutput");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start a MediaConnect flow.
     * @param req StartMediaConnectFlowRequest
     * @return StartMediaConnectFlowResponse
     * @throws TencentCloudSDKException
     */
    public StartMediaConnectFlowResponse StartMediaConnectFlow(StartMediaConnectFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMediaConnectFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartMediaConnectFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartMediaConnectFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop a MediaConnect flow.
     * @param req StopMediaConnectFlowRequest
     * @return StopMediaConnectFlowResponse
     * @throws TencentCloudSDKException
     */
    public StopMediaConnectFlowResponse StopMediaConnectFlow(StopMediaConnectFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopMediaConnectFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopMediaConnectFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopMediaConnectFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
