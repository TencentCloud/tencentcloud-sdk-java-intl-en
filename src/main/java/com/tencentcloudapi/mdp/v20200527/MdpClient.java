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
package com.tencentcloudapi.mdp.v20200527;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mdp.v20200527.models.*;

public class MdpClient extends AbstractClient{
    private static String endpoint = "mdp.tencentcloudapi.com";
    private static String service = "mdp";
    private static String version = "2020-05-27";

    public MdpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MdpClient(Credential credential, String region, ClientProfile profile) {
        super(MdpClient.endpoint, MdpClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a media package channel.
     * @param req CreateMediaPackageChannelRequest
     * @return CreateMediaPackageChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateMediaPackageChannelResponse CreateMediaPackageChannel(CreateMediaPackageChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMediaPackageChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMediaPackageChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMediaPackageChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an endpoint of a media package channel.
     * @param req CreateMediaPackageChannelEndpointRequest
     * @return CreateMediaPackageChannelEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateMediaPackageChannelEndpointResponse CreateMediaPackageChannelEndpoint(CreateMediaPackageChannelEndpointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMediaPackageChannelEndpointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMediaPackageChannelEndpointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMediaPackageChannelEndpoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete endpoints from a media package channel in batches.
     * @param req DeleteMediaPackageChannelEndpointsRequest
     * @return DeleteMediaPackageChannelEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaPackageChannelEndpointsResponse DeleteMediaPackageChannelEndpoints(DeleteMediaPackageChannelEndpointsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMediaPackageChannelEndpointsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMediaPackageChannelEndpointsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMediaPackageChannelEndpoints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete media package channels in batches.
     * @param req DeleteMediaPackageChannelsRequest
     * @return DeleteMediaPackageChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaPackageChannelsResponse DeleteMediaPackageChannels(DeleteMediaPackageChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMediaPackageChannelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMediaPackageChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMediaPackageChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of a media package channel.
     * @param req DescribeMediaPackageChannelRequest
     * @return DescribeMediaPackageChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaPackageChannelResponse DescribeMediaPackageChannel(DescribeMediaPackageChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaPackageChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaPackageChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMediaPackageChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information list of media package channels.
     * @param req DescribeMediaPackageChannelsRequest
     * @return DescribeMediaPackageChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaPackageChannelsResponse DescribeMediaPackageChannels(DescribeMediaPackageChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaPackageChannelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaPackageChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMediaPackageChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the information of a media package channel.
     * @param req ModifyMediaPackageChannelRequest
     * @return ModifyMediaPackageChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaPackageChannelResponse ModifyMediaPackageChannel(ModifyMediaPackageChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaPackageChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaPackageChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMediaPackageChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an endpoint of a media package channel.
     * @param req ModifyMediaPackageChannelEndpointRequest
     * @return ModifyMediaPackageChannelEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaPackageChannelEndpointResponse ModifyMediaPackageChannelEndpoint(ModifyMediaPackageChannelEndpointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaPackageChannelEndpointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaPackageChannelEndpointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMediaPackageChannelEndpoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the input authentication information of a media package channel.
     * @param req ModifyMediaPackageChannelInputAuthInfoRequest
     * @return ModifyMediaPackageChannelInputAuthInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaPackageChannelInputAuthInfoResponse ModifyMediaPackageChannelInputAuthInfo(ModifyMediaPackageChannelInputAuthInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaPackageChannelInputAuthInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaPackageChannelInputAuthInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMediaPackageChannelInputAuthInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
