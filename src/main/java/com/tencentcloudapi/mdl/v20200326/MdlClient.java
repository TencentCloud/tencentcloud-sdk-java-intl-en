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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLiveChannel", CreateStreamLiveChannelResponse.class);
    }

    /**
     *This API is used to create a StreamLive input.
     * @param req CreateStreamLiveInputRequest
     * @return CreateStreamLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLiveInputResponse CreateStreamLiveInput(CreateStreamLiveInputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLiveInput", CreateStreamLiveInputResponse.class);
    }

    /**
     *This API is used to create an input security group. Up to 5 security groups are allowed.
     * @param req CreateStreamLiveInputSecurityGroupRequest
     * @return CreateStreamLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLiveInputSecurityGroupResponse CreateStreamLiveInputSecurityGroup(CreateStreamLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLiveInputSecurityGroup", CreateStreamLiveInputSecurityGroupResponse.class);
    }

    /**
     *This API is used to create an event in the plan.
     * @param req CreateStreamLivePlanRequest
     * @return CreateStreamLivePlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLivePlanResponse CreateStreamLivePlan(CreateStreamLivePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLivePlan", CreateStreamLivePlanResponse.class);
    }

    /**
     *This API is used to add a watermark.
     * @param req CreateStreamLiveWatermarkRequest
     * @return CreateStreamLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLiveWatermarkResponse CreateStreamLiveWatermark(CreateStreamLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLiveWatermark", CreateStreamLiveWatermarkResponse.class);
    }

    /**
     *This API is used to delete a StreamLive channel.
     * @param req DeleteStreamLiveChannelRequest
     * @return DeleteStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLiveChannelResponse DeleteStreamLiveChannel(DeleteStreamLiveChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLiveChannel", DeleteStreamLiveChannelResponse.class);
    }

    /**
     *This API is used to delete a StreamLive input.
     * @param req DeleteStreamLiveInputRequest
     * @return DeleteStreamLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLiveInputResponse DeleteStreamLiveInput(DeleteStreamLiveInputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLiveInput", DeleteStreamLiveInputResponse.class);
    }

    /**
     *This API is used to delete an input security group.
     * @param req DeleteStreamLiveInputSecurityGroupRequest
     * @return DeleteStreamLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLiveInputSecurityGroupResponse DeleteStreamLiveInputSecurityGroup(DeleteStreamLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLiveInputSecurityGroup", DeleteStreamLiveInputSecurityGroupResponse.class);
    }

    /**
     *This API is used to delete a StreamLive event.
     * @param req DeleteStreamLivePlanRequest
     * @return DeleteStreamLivePlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLivePlanResponse DeleteStreamLivePlan(DeleteStreamLivePlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLivePlan", DeleteStreamLivePlanResponse.class);
    }

    /**
     *This API is used to delete a watermark.
     * @param req DeleteStreamLiveWatermarkRequest
     * @return DeleteStreamLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLiveWatermarkResponse DeleteStreamLiveWatermark(DeleteStreamLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLiveWatermark", DeleteStreamLiveWatermarkResponse.class);
    }

    /**
     *This API is used to query a StreamLive channel.
     * @param req DescribeStreamLiveChannelRequest
     * @return DescribeStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelResponse DescribeStreamLiveChannel(DescribeStreamLiveChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveChannel", DescribeStreamLiveChannelResponse.class);
    }

    /**
     *This API is used to query the alarm information of a StreamLive channel.
     * @param req DescribeStreamLiveChannelAlertsRequest
     * @return DescribeStreamLiveChannelAlertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelAlertsResponse DescribeStreamLiveChannelAlerts(DescribeStreamLiveChannelAlertsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveChannelAlerts", DescribeStreamLiveChannelAlertsResponse.class);
    }

    /**
     *This API is used to query input statistics.
     * @param req DescribeStreamLiveChannelInputStatisticsRequest
     * @return DescribeStreamLiveChannelInputStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelInputStatisticsResponse DescribeStreamLiveChannelInputStatistics(DescribeStreamLiveChannelInputStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveChannelInputStatistics", DescribeStreamLiveChannelInputStatisticsResponse.class);
    }

    /**
     *This API is used to query StreamLive channel logs, such as push event logs.
     * @param req DescribeStreamLiveChannelLogsRequest
     * @return DescribeStreamLiveChannelLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelLogsResponse DescribeStreamLiveChannelLogs(DescribeStreamLiveChannelLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveChannelLogs", DescribeStreamLiveChannelLogsResponse.class);
    }

    /**
     *This API is used to query the output statistics of a StreamLive channel.
     * @param req DescribeStreamLiveChannelOutputStatisticsRequest
     * @return DescribeStreamLiveChannelOutputStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelOutputStatisticsResponse DescribeStreamLiveChannelOutputStatistics(DescribeStreamLiveChannelOutputStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveChannelOutputStatistics", DescribeStreamLiveChannelOutputStatisticsResponse.class);
    }

    /**
     *This API is used to query StreamLive channels in batches.
     * @param req DescribeStreamLiveChannelsRequest
     * @return DescribeStreamLiveChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveChannelsResponse DescribeStreamLiveChannels(DescribeStreamLiveChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveChannels", DescribeStreamLiveChannelsResponse.class);
    }

    /**
     *This API is used to query a StreamLive input.
     * @param req DescribeStreamLiveInputRequest
     * @return DescribeStreamLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveInputResponse DescribeStreamLiveInput(DescribeStreamLiveInputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveInput", DescribeStreamLiveInputResponse.class);
    }

    /**
     *This API is used to query an input security group.
     * @param req DescribeStreamLiveInputSecurityGroupRequest
     * @return DescribeStreamLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveInputSecurityGroupResponse DescribeStreamLiveInputSecurityGroup(DescribeStreamLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveInputSecurityGroup", DescribeStreamLiveInputSecurityGroupResponse.class);
    }

    /**
     *This API is used to query input security groups in batches.
     * @param req DescribeStreamLiveInputSecurityGroupsRequest
     * @return DescribeStreamLiveInputSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveInputSecurityGroupsResponse DescribeStreamLiveInputSecurityGroups(DescribeStreamLiveInputSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveInputSecurityGroups", DescribeStreamLiveInputSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query StreamLive inputs in batches.
     * @param req DescribeStreamLiveInputsRequest
     * @return DescribeStreamLiveInputsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveInputsResponse DescribeStreamLiveInputs(DescribeStreamLiveInputsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveInputs", DescribeStreamLiveInputsResponse.class);
    }

    /**
     *This API is used to query the events in the plan in batches.
     * @param req DescribeStreamLivePlansRequest
     * @return DescribeStreamLivePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLivePlansResponse DescribeStreamLivePlans(DescribeStreamLivePlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLivePlans", DescribeStreamLivePlansResponse.class);
    }

    /**
     *This API is used to query all StreamLive regions.
     * @param req DescribeStreamLiveRegionsRequest
     * @return DescribeStreamLiveRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveRegionsResponse DescribeStreamLiveRegions(DescribeStreamLiveRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveRegions", DescribeStreamLiveRegionsResponse.class);
    }

    /**
     *This API is used to query the transcoding information of StreamLive streams.
     * @param req DescribeStreamLiveTranscodeDetailRequest
     * @return DescribeStreamLiveTranscodeDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveTranscodeDetailResponse DescribeStreamLiveTranscodeDetail(DescribeStreamLiveTranscodeDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveTranscodeDetail", DescribeStreamLiveTranscodeDetailResponse.class);
    }

    /**
     *This API is used to query a watermark.
     * @param req DescribeStreamLiveWatermarkRequest
     * @return DescribeStreamLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveWatermarkResponse DescribeStreamLiveWatermark(DescribeStreamLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveWatermark", DescribeStreamLiveWatermarkResponse.class);
    }

    /**
     *This API is used to query multiple watermarks at a time.
     * @param req DescribeStreamLiveWatermarksRequest
     * @return DescribeStreamLiveWatermarksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLiveWatermarksResponse DescribeStreamLiveWatermarks(DescribeStreamLiveWatermarksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLiveWatermarks", DescribeStreamLiveWatermarksResponse.class);
    }

    /**
     *This API is used to modify a StreamLive channel.
     * @param req ModifyStreamLiveChannelRequest
     * @return ModifyStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLiveChannelResponse ModifyStreamLiveChannel(ModifyStreamLiveChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLiveChannel", ModifyStreamLiveChannelResponse.class);
    }

    /**
     *This API is used to modify a StreamLive input.
     * @param req ModifyStreamLiveInputRequest
     * @return ModifyStreamLiveInputResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLiveInputResponse ModifyStreamLiveInput(ModifyStreamLiveInputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLiveInput", ModifyStreamLiveInputResponse.class);
    }

    /**
     *This API is used to modify an input security group.
     * @param req ModifyStreamLiveInputSecurityGroupRequest
     * @return ModifyStreamLiveInputSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLiveInputSecurityGroupResponse ModifyStreamLiveInputSecurityGroup(ModifyStreamLiveInputSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLiveInputSecurityGroup", ModifyStreamLiveInputSecurityGroupResponse.class);
    }

    /**
     *This API is used to modify a watermark.
     * @param req ModifyStreamLiveWatermarkRequest
     * @return ModifyStreamLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLiveWatermarkResponse ModifyStreamLiveWatermark(ModifyStreamLiveWatermarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLiveWatermark", ModifyStreamLiveWatermarkResponse.class);
    }

    /**
     *This API is used to query the stream status of a StreamLive input.
     * @param req QueryInputStreamStateRequest
     * @return QueryInputStreamStateResponse
     * @throws TencentCloudSDKException
     */
    public QueryInputStreamStateResponse QueryInputStreamState(QueryInputStreamStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryInputStreamState", QueryInputStreamStateResponse.class);
    }

    /**
     *This API is used to start a StreamLive channel.
     * @param req StartStreamLiveChannelRequest
     * @return StartStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public StartStreamLiveChannelResponse StartStreamLiveChannel(StartStreamLiveChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartStreamLiveChannel", StartStreamLiveChannelResponse.class);
    }

    /**
     *This API is used to stop a StreamLive channel.
     * @param req StopStreamLiveChannelRequest
     * @return StopStreamLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public StopStreamLiveChannelResponse StopStreamLiveChannel(StopStreamLiveChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopStreamLiveChannel", StopStreamLiveChannelResponse.class);
    }

}
