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
    private static String endpoint = "mdc.intl.tencentcloudapi.com";
    private static String service = "mdc";
    private static String version = "2020-08-28";

    public MdcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MdcClient(Credential credential, String region, ClientProfile profile) {
        super(MdcClient.endpoint, MdcClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a StreamLink flow.
     * @param req CreateStreamLinkFlowRequest
     * @return CreateStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLinkFlowResponse CreateStreamLinkFlow(CreateStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLinkFlow", CreateStreamLinkFlowResponse.class);
    }

    /**
     *Create an input configuration for the StreamLink.
     * @param req CreateStreamLinkInputRequest
     * @return CreateStreamLinkInputResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLinkInputResponse CreateStreamLinkInput(CreateStreamLinkInputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLinkInput", CreateStreamLinkInputResponse.class);
    }

    /**
     *This API is used to create a StreamLink output.
     * @param req CreateStreamLinkOutputInfoRequest
     * @return CreateStreamLinkOutputInfoResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamLinkOutputInfoResponse CreateStreamLinkOutputInfo(CreateStreamLinkOutputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamLinkOutputInfo", CreateStreamLinkOutputInfoResponse.class);
    }

    /**
     *This API is used to delete a StreamLink flow.
     * @param req DeleteStreamLinkFlowRequest
     * @return DeleteStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLinkFlowResponse DeleteStreamLinkFlow(DeleteStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLinkFlow", DeleteStreamLinkFlowResponse.class);
    }

    /**
     *This API is used to delete an output of a StreamLink flow.
     * @param req DeleteStreamLinkOutputRequest
     * @return DeleteStreamLinkOutputResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamLinkOutputResponse DeleteStreamLinkOutput(DeleteStreamLinkOutputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamLinkOutput", DeleteStreamLinkOutputResponse.class);
    }

    /**
     *This API is used to query the configuration information of a StreamLink flow.
     * @param req DescribeStreamLinkFlowRequest
     * @return DescribeStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowResponse DescribeStreamLinkFlow(DescribeStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlow", DescribeStreamLinkFlowResponse.class);
    }

    /**
     *This API is used to query the logs of a StreamLink flow.
     * @param req DescribeStreamLinkFlowLogsRequest
     * @return DescribeStreamLinkFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowLogsResponse DescribeStreamLinkFlowLogs(DescribeStreamLinkFlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowLogs", DescribeStreamLinkFlowLogsResponse.class);
    }

    /**
     *This API is used to query the media quality of a StreamLink flow.

     * @param req DescribeStreamLinkFlowMediaStatisticsRequest
     * @return DescribeStreamLinkFlowMediaStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowMediaStatisticsResponse DescribeStreamLinkFlowMediaStatistics(DescribeStreamLinkFlowMediaStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowMediaStatistics", DescribeStreamLinkFlowMediaStatisticsResponse.class);
    }

    /**
     *This API is used to query the current status of a flow.
     * @param req DescribeStreamLinkFlowRealtimeStatusRequest
     * @return DescribeStreamLinkFlowRealtimeStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowRealtimeStatusResponse DescribeStreamLinkFlowRealtimeStatus(DescribeStreamLinkFlowRealtimeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowRealtimeStatus", DescribeStreamLinkFlowRealtimeStatusResponse.class);
    }

    /**
     *This API is used to query the SRT streaming performance of a StreamLink flow.
     * @param req DescribeStreamLinkFlowSRTStatisticsRequest
     * @return DescribeStreamLinkFlowSRTStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowSRTStatisticsResponse DescribeStreamLinkFlowSRTStatistics(DescribeStreamLinkFlowSRTStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowSRTStatistics", DescribeStreamLinkFlowSRTStatisticsResponse.class);
    }

    /**
     *This API is used to query the media quality of a StreamLink flow.

     * @param req DescribeStreamLinkFlowStatisticsRequest
     * @return DescribeStreamLinkFlowStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowStatisticsResponse DescribeStreamLinkFlowStatistics(DescribeStreamLinkFlowStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlowStatistics", DescribeStreamLinkFlowStatisticsResponse.class);
    }

    /**
     *This API is used to query the configuration information of multiple StreamLink flows in batches.
     * @param req DescribeStreamLinkFlowsRequest
     * @return DescribeStreamLinkFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkFlowsResponse DescribeStreamLinkFlows(DescribeStreamLinkFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkFlows", DescribeStreamLinkFlowsResponse.class);
    }

    /**
     *This API is used to query all StreamLink regions.
     * @param req DescribeStreamLinkRegionsRequest
     * @return DescribeStreamLinkRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamLinkRegionsResponse DescribeStreamLinkRegions(DescribeStreamLinkRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamLinkRegions", DescribeStreamLinkRegionsResponse.class);
    }

    /**
     *This API is used to modify the configuration information of a StreamLink flow.
     * @param req ModifyStreamLinkFlowRequest
     * @return ModifyStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLinkFlowResponse ModifyStreamLinkFlow(ModifyStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLinkFlow", ModifyStreamLinkFlowResponse.class);
    }

    /**
     *This API is used to modify an input of a StreamLink flow.
     * @param req ModifyStreamLinkInputRequest
     * @return ModifyStreamLinkInputResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLinkInputResponse ModifyStreamLinkInput(ModifyStreamLinkInputRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLinkInput", ModifyStreamLinkInputResponse.class);
    }

    /**
     *This API is used to modify an output of a StreamLink flow.
     * @param req ModifyStreamLinkOutputInfoRequest
     * @return ModifyStreamLinkOutputInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamLinkOutputInfoResponse ModifyStreamLinkOutputInfo(ModifyStreamLinkOutputInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamLinkOutputInfo", ModifyStreamLinkOutputInfoResponse.class);
    }

    /**
     *This API is used to start a StreamLink flow.
     * @param req StartStreamLinkFlowRequest
     * @return StartStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public StartStreamLinkFlowResponse StartStreamLinkFlow(StartStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartStreamLinkFlow", StartStreamLinkFlowResponse.class);
    }

    /**
     *This API is used to stop a StreamLink flow.
     * @param req StopStreamLinkFlowRequest
     * @return StopStreamLinkFlowResponse
     * @throws TencentCloudSDKException
     */
    public StopStreamLinkFlowResponse StopStreamLinkFlow(StopStreamLinkFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopStreamLinkFlow", StopStreamLinkFlowResponse.class);
    }

}
