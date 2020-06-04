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
package com.tencentcloudapi.mdl.v20200326;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mdl.v20200326.models.*;

public class MdlClient extends AbstractClient{
    private static String endpoint = "mdl.tencentcloudapi.com";
    private static String version = "2020-03-26";

    public MdlClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MdlClient(Credential credential, String region, ClientProfile profile) {
        super(MdlClient.endpoint, MdlClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a media channel.
     * @param req CreateMediaLiveChannelRequest
     * @return CreateMediaLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateMediaLiveChannelResponse CreateMediaLiveChannel(CreateMediaLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMediaLiveChannelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMediaLiveChannelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMediaLiveChannel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a media input.
     * @param req CreateMediaLiveInputRequest
     * @return CreateMediaLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public CreateMediaLiveInputResponse CreateMediaLiveInput(CreateMediaLiveInputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMediaLiveInputResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMediaLiveInputResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMediaLiveInput"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an input security group. Up to 5 ones can be created.
     * @param req CreateMediaLiveInputSecurityGroupRequest
     * @return CreateMediaLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateMediaLiveInputSecurityGroupResponse CreateMediaLiveInputSecurityGroup(CreateMediaLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMediaLiveInputSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMediaLiveInputSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateMediaLiveInputSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a MediaLive channel.
     * @param req DeleteMediaLiveChannelRequest
     * @return DeleteMediaLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaLiveChannelResponse DeleteMediaLiveChannel(DeleteMediaLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMediaLiveChannelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMediaLiveChannelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMediaLiveChannel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a media input.
     * @param req DeleteMediaLiveInputRequest
     * @return DeleteMediaLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaLiveInputResponse DeleteMediaLiveInput(DeleteMediaLiveInputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMediaLiveInputResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMediaLiveInputResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMediaLiveInput"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an input security group.
     * @param req DeleteMediaLiveInputSecurityGroupRequest
     * @return DeleteMediaLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMediaLiveInputSecurityGroupResponse DeleteMediaLiveInputSecurityGroup(DeleteMediaLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMediaLiveInputSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMediaLiveInputSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteMediaLiveInputSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of a MediaLive channel.
     * @param req DescribeMediaLiveChannelRequest
     * @return DescribeMediaLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaLiveChannelResponse DescribeMediaLiveChannel(DescribeMediaLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaLiveChannelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaLiveChannelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaLiveChannel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the channel alarm information.
     * @param req DescribeMediaLiveChannelAlertsRequest
     * @return DescribeMediaLiveChannelAlertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaLiveChannelAlertsResponse DescribeMediaLiveChannelAlerts(DescribeMediaLiveChannelAlertsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaLiveChannelAlertsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaLiveChannelAlertsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaLiveChannelAlerts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the input statistics.
     * @param req DescribeMediaLiveChannelInputStatisticsRequest
     * @return DescribeMediaLiveChannelInputStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaLiveChannelInputStatisticsResponse DescribeMediaLiveChannelInputStatistics(DescribeMediaLiveChannelInputStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaLiveChannelInputStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaLiveChannelInputStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaLiveChannelInputStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the output statistics of a channel.
     * @param req DescribeMediaLiveChannelOutputStatisticsRequest
     * @return DescribeMediaLiveChannelOutputStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaLiveChannelOutputStatisticsResponse DescribeMediaLiveChannelOutputStatistics(DescribeMediaLiveChannelOutputStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaLiveChannelOutputStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaLiveChannelOutputStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaLiveChannelOutputStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of MediaLive channels in batches.
     * @param req DescribeMediaLiveChannelsRequest
     * @return DescribeMediaLiveChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaLiveChannelsResponse DescribeMediaLiveChannels(DescribeMediaLiveChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaLiveChannelsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaLiveChannelsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaLiveChannels"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a media input.
     * @param req DescribeMediaLiveInputRequest
     * @return DescribeMediaLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaLiveInputResponse DescribeMediaLiveInput(DescribeMediaLiveInputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaLiveInputResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaLiveInputResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaLiveInput"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query an input security group.
     * @param req DescribeMediaLiveInputSecurityGroupRequest
     * @return DescribeMediaLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaLiveInputSecurityGroupResponse DescribeMediaLiveInputSecurityGroup(DescribeMediaLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaLiveInputSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaLiveInputSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaLiveInputSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of input security groups in batches.
     * @param req DescribeMediaLiveInputSecurityGroupsRequest
     * @return DescribeMediaLiveInputSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaLiveInputSecurityGroupsResponse DescribeMediaLiveInputSecurityGroups(DescribeMediaLiveInputSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaLiveInputSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaLiveInputSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaLiveInputSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of media inputs in batches.
     * @param req DescribeMediaLiveInputsRequest
     * @return DescribeMediaLiveInputsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMediaLiveInputsResponse DescribeMediaLiveInputs(DescribeMediaLiveInputsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMediaLiveInputsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMediaLiveInputsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMediaLiveInputs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the information of a MediaLive channel.
     * @param req ModifyMediaLiveChannelRequest
     * @return ModifyMediaLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaLiveChannelResponse ModifyMediaLiveChannel(ModifyMediaLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaLiveChannelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaLiveChannelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMediaLiveChannel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a media input.
     * @param req ModifyMediaLiveInputRequest
     * @return ModifyMediaLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaLiveInputResponse ModifyMediaLiveInput(ModifyMediaLiveInputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaLiveInputResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaLiveInputResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMediaLiveInput"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update an input security group.
     * @param req ModifyMediaLiveInputSecurityGroupRequest
     * @return ModifyMediaLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMediaLiveInputSecurityGroupResponse ModifyMediaLiveInputSecurityGroup(ModifyMediaLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMediaLiveInputSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMediaLiveInputSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMediaLiveInputSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to start a MediaLive channel.
     * @param req StartMediaLiveChannelRequest
     * @return StartMediaLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public StartMediaLiveChannelResponse StartMediaLiveChannel(StartMediaLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMediaLiveChannelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartMediaLiveChannelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartMediaLiveChannel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop a MediaLive channel.
     * @param req StopMediaLiveChannelRequest
     * @return StopMediaLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public StopMediaLiveChannelResponse StopMediaLiveChannel(StopMediaLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopMediaLiveChannelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopMediaLiveChannelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopMediaLiveChannel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
