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
    private static String service = "mdl";
    private static String version = "2020-03-26";
    
    public MdlClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MdlClient(Credential credential, String region, ClientProfile profile) {
        super(MdlClient.endpoint, MdlClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a StreamLive channel.
     * @param req CreateStreamLiveChannelRequest
     * @return CreateStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLiveChannelResponse CreateStreamLiveChannel(CreateStreamLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStreamLiveChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateStreamLiveChannel", CreateStreamLiveChannelResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a StreamLive input.
     * @param req CreateStreamLiveInputRequest
     * @return CreateStreamLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLiveInputResponse CreateStreamLiveInput(CreateStreamLiveInputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStreamLiveInputResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateStreamLiveInput", CreateStreamLiveInputResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an input security group. Up to 5 security groups are allowed.
     * @param req CreateStreamLiveInputSecurityGroupRequest
     * @return CreateStreamLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLiveInputSecurityGroupResponse CreateStreamLiveInputSecurityGroup(CreateStreamLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStreamLiveInputSecurityGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateStreamLiveInputSecurityGroup", CreateStreamLiveInputSecurityGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an event in the plan.
     * @param req CreateStreamLivePlanRequest
     * @return CreateStreamLivePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLivePlanResponse CreateStreamLivePlan(CreateStreamLivePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStreamLivePlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateStreamLivePlan", CreateStreamLivePlanResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a watermark.
     * @param req CreateStreamLiveWatermarkRequest
     * @return CreateStreamLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLiveWatermarkResponse CreateStreamLiveWatermark(CreateStreamLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStreamLiveWatermarkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateStreamLiveWatermark", CreateStreamLiveWatermarkResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a StreamLive channel.
     * @param req DeleteStreamLiveChannelRequest
     * @return DeleteStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLiveChannelResponse DeleteStreamLiveChannel(DeleteStreamLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStreamLiveChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteStreamLiveChannel", DeleteStreamLiveChannelResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a StreamLive input.
     * @param req DeleteStreamLiveInputRequest
     * @return DeleteStreamLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLiveInputResponse DeleteStreamLiveInput(DeleteStreamLiveInputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStreamLiveInputResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteStreamLiveInput", DeleteStreamLiveInputResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an input security group.
     * @param req DeleteStreamLiveInputSecurityGroupRequest
     * @return DeleteStreamLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLiveInputSecurityGroupResponse DeleteStreamLiveInputSecurityGroup(DeleteStreamLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStreamLiveInputSecurityGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteStreamLiveInputSecurityGroup", DeleteStreamLiveInputSecurityGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a StreamLive event.
     * @param req DeleteStreamLivePlanRequest
     * @return DeleteStreamLivePlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLivePlanResponse DeleteStreamLivePlan(DeleteStreamLivePlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStreamLivePlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteStreamLivePlan", DeleteStreamLivePlanResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a watermark.
     * @param req DeleteStreamLiveWatermarkRequest
     * @return DeleteStreamLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLiveWatermarkResponse DeleteStreamLiveWatermark(DeleteStreamLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStreamLiveWatermarkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteStreamLiveWatermark", DeleteStreamLiveWatermarkResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query a StreamLive channel.
     * @param req DescribeStreamLiveChannelRequest
     * @return DescribeStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelResponse DescribeStreamLiveChannel(DescribeStreamLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveChannel", DescribeStreamLiveChannelResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the alarm information of a StreamLive channel.
     * @param req DescribeStreamLiveChannelAlertsRequest
     * @return DescribeStreamLiveChannelAlertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelAlertsResponse DescribeStreamLiveChannelAlerts(DescribeStreamLiveChannelAlertsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveChannelAlertsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveChannelAlerts", DescribeStreamLiveChannelAlertsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query input statistics.
     * @param req DescribeStreamLiveChannelInputStatisticsRequest
     * @return DescribeStreamLiveChannelInputStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelInputStatisticsResponse DescribeStreamLiveChannelInputStatistics(DescribeStreamLiveChannelInputStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveChannelInputStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveChannelInputStatistics", DescribeStreamLiveChannelInputStatisticsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query StreamLive channel logs, such as push event logs.
     * @param req DescribeStreamLiveChannelLogsRequest
     * @return DescribeStreamLiveChannelLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelLogsResponse DescribeStreamLiveChannelLogs(DescribeStreamLiveChannelLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveChannelLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveChannelLogs", DescribeStreamLiveChannelLogsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the output statistics of a StreamLive channel.
     * @param req DescribeStreamLiveChannelOutputStatisticsRequest
     * @return DescribeStreamLiveChannelOutputStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelOutputStatisticsResponse DescribeStreamLiveChannelOutputStatistics(DescribeStreamLiveChannelOutputStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveChannelOutputStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveChannelOutputStatistics", DescribeStreamLiveChannelOutputStatisticsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query StreamLive channels in batches.
     * @param req DescribeStreamLiveChannelsRequest
     * @return DescribeStreamLiveChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelsResponse DescribeStreamLiveChannels(DescribeStreamLiveChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveChannelsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveChannels", DescribeStreamLiveChannelsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query a StreamLive input.
     * @param req DescribeStreamLiveInputRequest
     * @return DescribeStreamLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveInputResponse DescribeStreamLiveInput(DescribeStreamLiveInputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveInputResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveInput", DescribeStreamLiveInputResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query an input security group.
     * @param req DescribeStreamLiveInputSecurityGroupRequest
     * @return DescribeStreamLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveInputSecurityGroupResponse DescribeStreamLiveInputSecurityGroup(DescribeStreamLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveInputSecurityGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveInputSecurityGroup", DescribeStreamLiveInputSecurityGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query input security groups in batches.
     * @param req DescribeStreamLiveInputSecurityGroupsRequest
     * @return DescribeStreamLiveInputSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveInputSecurityGroupsResponse DescribeStreamLiveInputSecurityGroups(DescribeStreamLiveInputSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveInputSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveInputSecurityGroups", DescribeStreamLiveInputSecurityGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query StreamLive inputs in batches.
     * @param req DescribeStreamLiveInputsRequest
     * @return DescribeStreamLiveInputsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveInputsResponse DescribeStreamLiveInputs(DescribeStreamLiveInputsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveInputsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveInputs", DescribeStreamLiveInputsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the events in the plan in batches.
     * @param req DescribeStreamLivePlansRequest
     * @return DescribeStreamLivePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLivePlansResponse DescribeStreamLivePlans(DescribeStreamLivePlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLivePlansResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLivePlans", DescribeStreamLivePlansResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query all StreamLive regions.
     * @param req DescribeStreamLiveRegionsRequest
     * @return DescribeStreamLiveRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveRegionsResponse DescribeStreamLiveRegions(DescribeStreamLiveRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveRegions", DescribeStreamLiveRegionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the transcoding information of StreamLive streams.
     * @param req DescribeStreamLiveTranscodeDetailRequest
     * @return DescribeStreamLiveTranscodeDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveTranscodeDetailResponse DescribeStreamLiveTranscodeDetail(DescribeStreamLiveTranscodeDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveTranscodeDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveTranscodeDetail", DescribeStreamLiveTranscodeDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query a watermark.
     * @param req DescribeStreamLiveWatermarkRequest
     * @return DescribeStreamLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveWatermarkResponse DescribeStreamLiveWatermark(DescribeStreamLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveWatermarkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveWatermark", DescribeStreamLiveWatermarkResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query multiple watermarks at a time.
     * @param req DescribeStreamLiveWatermarksRequest
     * @return DescribeStreamLiveWatermarksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveWatermarksResponse DescribeStreamLiveWatermarks(DescribeStreamLiveWatermarksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamLiveWatermarksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeStreamLiveWatermarks", DescribeStreamLiveWatermarksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a StreamLive channel.
     * @param req ModifyStreamLiveChannelRequest
     * @return ModifyStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLiveChannelResponse ModifyStreamLiveChannel(ModifyStreamLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyStreamLiveChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyStreamLiveChannel", ModifyStreamLiveChannelResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a StreamLive input.
     * @param req ModifyStreamLiveInputRequest
     * @return ModifyStreamLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLiveInputResponse ModifyStreamLiveInput(ModifyStreamLiveInputRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyStreamLiveInputResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyStreamLiveInput", ModifyStreamLiveInputResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an input security group.
     * @param req ModifyStreamLiveInputSecurityGroupRequest
     * @return ModifyStreamLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLiveInputSecurityGroupResponse ModifyStreamLiveInputSecurityGroup(ModifyStreamLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyStreamLiveInputSecurityGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyStreamLiveInputSecurityGroup", ModifyStreamLiveInputSecurityGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a watermark.
     * @param req ModifyStreamLiveWatermarkRequest
     * @return ModifyStreamLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLiveWatermarkResponse ModifyStreamLiveWatermark(ModifyStreamLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyStreamLiveWatermarkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyStreamLiveWatermark", ModifyStreamLiveWatermarkResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the stream status of a StreamLive input.
     * @param req QueryInputStreamStateRequest
     * @return QueryInputStreamStateResponse
     * @throws TencentCloudSDKException
     */
    public QueryInputStreamStateResponse QueryInputStreamState(QueryInputStreamStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryInputStreamStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryInputStreamState", QueryInputStreamStateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to start a StreamLive channel.
     * @param req StartStreamLiveChannelRequest
     * @return StartStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public StartStreamLiveChannelResponse StartStreamLiveChannel(StartStreamLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartStreamLiveChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "StartStreamLiveChannel", StartStreamLiveChannelResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to stop a StreamLive channel.
     * @param req StopStreamLiveChannelRequest
     * @return StopStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public StopStreamLiveChannelResponse StopStreamLiveChannel(StopStreamLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopStreamLiveChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "StopStreamLiveChannel", StopStreamLiveChannelResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
