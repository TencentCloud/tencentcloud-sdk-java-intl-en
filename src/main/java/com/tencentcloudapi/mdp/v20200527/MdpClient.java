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
    private static String endpoint = "mdp.intl.tencentcloudapi.com";
    private static String service = "mdp";
    private static String version = "2020-05-27";

    public MdpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MdpClient(Credential credential, String region, ClientProfile profile) {
        super(MdpClient.endpoint, MdpClient.version, credential, region, profile);
    }

    /**
     *Linear Assembly channel is bound to CDN playback domain name.
     * @param req BindLinearAssemblyCDNDomainWithChannelRequest
     * @return BindLinearAssemblyCDNDomainWithChannelResponse
     * @throws TencentCloudSDKException
     */
    public BindLinearAssemblyCDNDomainWithChannelResponse BindLinearAssemblyCDNDomainWithChannel(BindLinearAssemblyCDNDomainWithChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindLinearAssemblyCDNDomainWithChannel", BindLinearAssemblyCDNDomainWithChannelResponse.class);
    }

    /**
     *This API is used to bind an LVB domain name to a channel.
     * @param req BindNewLVBDomainWithChannelRequest
     * @return BindNewLVBDomainWithChannelResponse
     * @throws TencentCloudSDKException
     */
    public BindNewLVBDomainWithChannelResponse BindNewLVBDomainWithChannel(BindNewLVBDomainWithChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindNewLVBDomainWithChannel", BindNewLVBDomainWithChannelResponse.class);
    }

    /**
     *BindSSAICDNDomainWithChannel
     * @param req BindSSAICDNDomainWithChannelRequest
     * @return BindSSAICDNDomainWithChannelResponse
     * @throws TencentCloudSDKException
     */
    public BindSSAICDNDomainWithChannelResponse BindSSAICDNDomainWithChannel(BindSSAICDNDomainWithChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindSSAICDNDomainWithChannel", BindSSAICDNDomainWithChannelResponse.class);
    }

    /**
     *This API is used to create a StreamPackage channel.
     * @param req CreateStreamPackageChannelRequest
     * @return CreateStreamPackageChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageChannelResponse CreateStreamPackageChannel(CreateStreamPackageChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageChannel", CreateStreamPackageChannelResponse.class);
    }

    /**
     *This API is used to create an endpoint on a StreamPackage channel.
     * @param req CreateStreamPackageChannelEndpointRequest
     * @return CreateStreamPackageChannelEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageChannelEndpointResponse CreateStreamPackageChannelEndpoint(CreateStreamPackageChannelEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageChannelEndpoint", CreateStreamPackageChannelEndpointResponse.class);
    }

    /**
     *Create HarvestJob.
     * @param req CreateStreamPackageHarvestJobRequest
     * @return CreateStreamPackageHarvestJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageHarvestJobResponse CreateStreamPackageHarvestJob(CreateStreamPackageHarvestJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageHarvestJob", CreateStreamPackageHarvestJobResponse.class);
    }

    /**
     *Create a linear assembly channel.
     * @param req CreateStreamPackageLinearAssemblyChannelRequest
     * @return CreateStreamPackageLinearAssemblyChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageLinearAssemblyChannelResponse CreateStreamPackageLinearAssemblyChannel(CreateStreamPackageLinearAssemblyChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageLinearAssemblyChannel", CreateStreamPackageLinearAssemblyChannelResponse.class);
    }

    /**
     *Create a linear assembly program.
     * @param req CreateStreamPackageLinearAssemblyProgramRequest
     * @return CreateStreamPackageLinearAssemblyProgramResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageLinearAssemblyProgramResponse CreateStreamPackageLinearAssemblyProgram(CreateStreamPackageLinearAssemblyProgramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageLinearAssemblyProgram", CreateStreamPackageLinearAssemblyProgramResponse.class);
    }

    /**
     *CreateStreamPackageSSAIChannel
     * @param req CreateStreamPackageSSAIChannelRequest
     * @return CreateStreamPackageSSAIChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageSSAIChannelResponse CreateStreamPackageSSAIChannel(CreateStreamPackageSSAIChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageSSAIChannel", CreateStreamPackageSSAIChannelResponse.class);
    }

    /**
     *Create channel linear assembly Source.
     * @param req CreateStreamPackageSourceRequest
     * @return CreateStreamPackageSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageSourceResponse CreateStreamPackageSource(CreateStreamPackageSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageSource", CreateStreamPackageSourceResponse.class);
    }

    /**
     *Create Linear Assembly SourceLocation.
     * @param req CreateStreamPackageSourceLocationRequest
     * @return CreateStreamPackageSourceLocationResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageSourceLocationResponse CreateStreamPackageSourceLocation(CreateStreamPackageSourceLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageSourceLocation", CreateStreamPackageSourceLocationResponse.class);
    }

    /**
     *Create VodRemuxTask
     * @param req CreateStreamPackageVodRemuxTaskRequest
     * @return CreateStreamPackageVodRemuxTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateStreamPackageVodRemuxTaskResponse CreateStreamPackageVodRemuxTask(CreateStreamPackageVodRemuxTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStreamPackageVodRemuxTask", CreateStreamPackageVodRemuxTaskResponse.class);
    }

    /**
     *This API is used to delete endpoints from a StreamPackage channel in batches.
     * @param req DeleteStreamPackageChannelEndpointsRequest
     * @return DeleteStreamPackageChannelEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageChannelEndpointsResponse DeleteStreamPackageChannelEndpoints(DeleteStreamPackageChannelEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageChannelEndpoints", DeleteStreamPackageChannelEndpointsResponse.class);
    }

    /**
     *This API is used to delete StreamPackage channels in batches.
     * @param req DeleteStreamPackageChannelsRequest
     * @return DeleteStreamPackageChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageChannelsResponse DeleteStreamPackageChannels(DeleteStreamPackageChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageChannels", DeleteStreamPackageChannelsResponse.class);
    }

    /**
     *Delete HarvestJob.
     * @param req DeleteStreamPackageHarvestJobRequest
     * @return DeleteStreamPackageHarvestJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageHarvestJobResponse DeleteStreamPackageHarvestJob(DeleteStreamPackageHarvestJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageHarvestJob", DeleteStreamPackageHarvestJobResponse.class);
    }

    /**
     *Deleting HarvestJobs in Batch.
     * @param req DeleteStreamPackageHarvestJobsRequest
     * @return DeleteStreamPackageHarvestJobsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageHarvestJobsResponse DeleteStreamPackageHarvestJobs(DeleteStreamPackageHarvestJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageHarvestJobs", DeleteStreamPackageHarvestJobsResponse.class);
    }

    /**
     *Delete channel linear assemblyChannel.
     * @param req DeleteStreamPackageLinearAssemblyChannelRequest
     * @return DeleteStreamPackageLinearAssemblyChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageLinearAssemblyChannelResponse DeleteStreamPackageLinearAssemblyChannel(DeleteStreamPackageLinearAssemblyChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageLinearAssemblyChannel", DeleteStreamPackageLinearAssemblyChannelResponse.class);
    }

    /**
     *Delete channels in batches and linearly assemble channels.
     * @param req DeleteStreamPackageLinearAssemblyChannelsRequest
     * @return DeleteStreamPackageLinearAssemblyChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageLinearAssemblyChannelsResponse DeleteStreamPackageLinearAssemblyChannels(DeleteStreamPackageLinearAssemblyChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageLinearAssemblyChannels", DeleteStreamPackageLinearAssemblyChannelsResponse.class);
    }

    /**
     *Delete Channel Linear Assembly Program.
     * @param req DeleteStreamPackageLinearAssemblyProgramRequest
     * @return DeleteStreamPackageLinearAssemblyProgramResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageLinearAssemblyProgramResponse DeleteStreamPackageLinearAssemblyProgram(DeleteStreamPackageLinearAssemblyProgramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageLinearAssemblyProgram", DeleteStreamPackageLinearAssemblyProgramResponse.class);
    }

    /**
     *Batch deletion of channels linear assembly program.
     * @param req DeleteStreamPackageLinearAssemblyProgramsRequest
     * @return DeleteStreamPackageLinearAssemblyProgramsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageLinearAssemblyProgramsResponse DeleteStreamPackageLinearAssemblyPrograms(DeleteStreamPackageLinearAssemblyProgramsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageLinearAssemblyPrograms", DeleteStreamPackageLinearAssemblyProgramsResponse.class);
    }

    /**
     *DeleteStreamPackageSSAIChannel
     * @param req DeleteStreamPackageSSAIChannelRequest
     * @return DeleteStreamPackageSSAIChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageSSAIChannelResponse DeleteStreamPackageSSAIChannel(DeleteStreamPackageSSAIChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageSSAIChannel", DeleteStreamPackageSSAIChannelResponse.class);
    }

    /**
     *Delete channel linear assembly Source.
     * @param req DeleteStreamPackageSourceRequest
     * @return DeleteStreamPackageSourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageSourceResponse DeleteStreamPackageSource(DeleteStreamPackageSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageSource", DeleteStreamPackageSourceResponse.class);
    }

    /**
     *Batch delete media packaging SourceLocation.
     * @param req DeleteStreamPackageSourceLocationRequest
     * @return DeleteStreamPackageSourceLocationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageSourceLocationResponse DeleteStreamPackageSourceLocation(DeleteStreamPackageSourceLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageSourceLocation", DeleteStreamPackageSourceLocationResponse.class);
    }

    /**
     *Delete Vod remux task.
     * @param req DeleteStreamPackageVodRemuxTaskRequest
     * @return DeleteStreamPackageVodRemuxTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageVodRemuxTaskResponse DeleteStreamPackageVodRemuxTask(DeleteStreamPackageVodRemuxTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageVodRemuxTask", DeleteStreamPackageVodRemuxTaskResponse.class);
    }

    /**
     *Delete VOD remux tasks in batches.
     * @param req DeleteStreamPackageVodRemuxTasksRequest
     * @return DeleteStreamPackageVodRemuxTasksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStreamPackageVodRemuxTasksResponse DeleteStreamPackageVodRemuxTasks(DeleteStreamPackageVodRemuxTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStreamPackageVodRemuxTasks", DeleteStreamPackageVodRemuxTasksResponse.class);
    }

    /**
     *Query the CDN domain name associated with the LinearAssembly channel.
     * @param req DescribeLinearAssemblyCDNDomainWithChannelRequest
     * @return DescribeLinearAssemblyCDNDomainWithChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLinearAssemblyCDNDomainWithChannelResponse DescribeLinearAssemblyCDNDomainWithChannel(DescribeLinearAssemblyCDNDomainWithChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLinearAssemblyCDNDomainWithChannel", DescribeLinearAssemblyCDNDomainWithChannelResponse.class);
    }

    /**
     *Query the CDN domain names associated with all LinearAssembly channels.
     * @param req DescribeLinearAssemblyCDNDomainWithChannelsRequest
     * @return DescribeLinearAssemblyCDNDomainWithChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLinearAssemblyCDNDomainWithChannelsResponse DescribeLinearAssemblyCDNDomainWithChannels(DescribeLinearAssemblyCDNDomainWithChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLinearAssemblyCDNDomainWithChannels", DescribeLinearAssemblyCDNDomainWithChannelsResponse.class);
    }

    /**
     *This API is used to query the information of a StreamPackage channel.
     * @param req DescribeStreamPackageChannelRequest
     * @return DescribeStreamPackageChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageChannelResponse DescribeStreamPackageChannel(DescribeStreamPackageChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageChannel", DescribeStreamPackageChannelResponse.class);
    }

    /**
     *This API is used to query the information of multiple StreamPackage channels.
     * @param req DescribeStreamPackageChannelsRequest
     * @return DescribeStreamPackageChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageChannelsResponse DescribeStreamPackageChannels(DescribeStreamPackageChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageChannels", DescribeStreamPackageChannelsResponse.class);
    }

    /**
     *Query HarvestJob.
     * @param req DescribeStreamPackageHarvestJobRequest
     * @return DescribeStreamPackageHarvestJobResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageHarvestJobResponse DescribeStreamPackageHarvestJob(DescribeStreamPackageHarvestJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageHarvestJob", DescribeStreamPackageHarvestJobResponse.class);
    }

    /**
     *Batch query HarvestJob.
     * @param req DescribeStreamPackageHarvestJobsRequest
     * @return DescribeStreamPackageHarvestJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageHarvestJobsResponse DescribeStreamPackageHarvestJobs(DescribeStreamPackageHarvestJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageHarvestJobs", DescribeStreamPackageHarvestJobsResponse.class);
    }

    /**
     *Query channel linear assembly Channel information.
     * @param req DescribeStreamPackageLinearAssemblyChannelRequest
     * @return DescribeStreamPackageLinearAssemblyChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageLinearAssemblyChannelResponse DescribeStreamPackageLinearAssemblyChannel(DescribeStreamPackageLinearAssemblyChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageLinearAssemblyChannel", DescribeStreamPackageLinearAssemblyChannelResponse.class);
    }

    /**
     *Query linear assembly channel alarm information.
     * @param req DescribeStreamPackageLinearAssemblyChannelAlertsRequest
     * @return DescribeStreamPackageLinearAssemblyChannelAlertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageLinearAssemblyChannelAlertsResponse DescribeStreamPackageLinearAssemblyChannelAlerts(DescribeStreamPackageLinearAssemblyChannelAlertsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageLinearAssemblyChannelAlerts", DescribeStreamPackageLinearAssemblyChannelAlertsResponse.class);
    }

    /**
     *Query channel linear assembly Channel information list.
     * @param req DescribeStreamPackageLinearAssemblyChannelsRequest
     * @return DescribeStreamPackageLinearAssemblyChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageLinearAssemblyChannelsResponse DescribeStreamPackageLinearAssemblyChannels(DescribeStreamPackageLinearAssemblyChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageLinearAssemblyChannels", DescribeStreamPackageLinearAssemblyChannelsResponse.class);
    }

    /**
     *Query channel linear assembly program information.
     * @param req DescribeStreamPackageLinearAssemblyProgramRequest
     * @return DescribeStreamPackageLinearAssemblyProgramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageLinearAssemblyProgramResponse DescribeStreamPackageLinearAssemblyProgram(DescribeStreamPackageLinearAssemblyProgramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageLinearAssemblyProgram", DescribeStreamPackageLinearAssemblyProgramResponse.class);
    }

    /**
     *Query channel linear assembly Programl assembly scheduling information list.
     * @param req DescribeStreamPackageLinearAssemblyProgramSchedulesRequest
     * @return DescribeStreamPackageLinearAssemblyProgramSchedulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageLinearAssemblyProgramSchedulesResponse DescribeStreamPackageLinearAssemblyProgramSchedules(DescribeStreamPackageLinearAssemblyProgramSchedulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageLinearAssemblyProgramSchedules", DescribeStreamPackageLinearAssemblyProgramSchedulesResponse.class);
    }

    /**
     *Query channel linear assembly Programl information list.
     * @param req DescribeStreamPackageLinearAssemblyProgramsRequest
     * @return DescribeStreamPackageLinearAssemblyProgramsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageLinearAssemblyProgramsResponse DescribeStreamPackageLinearAssemblyPrograms(DescribeStreamPackageLinearAssemblyProgramsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageLinearAssemblyPrograms", DescribeStreamPackageLinearAssemblyProgramsResponse.class);
    }

    /**
     *DescribeStreamPackageSSAIChannel
     * @param req DescribeStreamPackageSSAIChannelRequest
     * @return DescribeStreamPackageSSAIChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageSSAIChannelResponse DescribeStreamPackageSSAIChannel(DescribeStreamPackageSSAIChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageSSAIChannel", DescribeStreamPackageSSAIChannelResponse.class);
    }

    /**
     *DescribeStreamPackageSSAIChannels
     * @param req DescribeStreamPackageSSAIChannelsRequest
     * @return DescribeStreamPackageSSAIChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageSSAIChannelsResponse DescribeStreamPackageSSAIChannels(DescribeStreamPackageSSAIChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageSSAIChannels", DescribeStreamPackageSSAIChannelsResponse.class);
    }

    /**
     *This API is used to query SSAI ad replacement usage.
     * @param req DescribeStreamPackageSSAIUsageRequest
     * @return DescribeStreamPackageSSAIUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageSSAIUsageResponse DescribeStreamPackageSSAIUsage(DescribeStreamPackageSSAIUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageSSAIUsage", DescribeStreamPackageSSAIUsageResponse.class);
    }

    /**
     *Query channel linear assembly Source information.
     * @param req DescribeStreamPackageSourceRequest
     * @return DescribeStreamPackageSourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageSourceResponse DescribeStreamPackageSource(DescribeStreamPackageSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageSource", DescribeStreamPackageSourceResponse.class);
    }

    /**
     *Query channel linear assembly Source alarm information.
     * @param req DescribeStreamPackageSourceAlertsRequest
     * @return DescribeStreamPackageSourceAlertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageSourceAlertsResponse DescribeStreamPackageSourceAlerts(DescribeStreamPackageSourceAlertsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageSourceAlerts", DescribeStreamPackageSourceAlertsResponse.class);
    }

    /**
     *Query channel linear assembly sourceLocation information.
     * @param req DescribeStreamPackageSourceLocationRequest
     * @return DescribeStreamPackageSourceLocationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageSourceLocationResponse DescribeStreamPackageSourceLocation(DescribeStreamPackageSourceLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageSourceLocation", DescribeStreamPackageSourceLocationResponse.class);
    }

    /**
     *Query channel linear assembly Location alarm information.
     * @param req DescribeStreamPackageSourceLocationAlertsRequest
     * @return DescribeStreamPackageSourceLocationAlertsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageSourceLocationAlertsResponse DescribeStreamPackageSourceLocationAlerts(DescribeStreamPackageSourceLocationAlertsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageSourceLocationAlerts", DescribeStreamPackageSourceLocationAlertsResponse.class);
    }

    /**
     *Query channel linear assembly SourceLocation information list.
     * @param req DescribeStreamPackageSourceLocationsRequest
     * @return DescribeStreamPackageSourceLocationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageSourceLocationsResponse DescribeStreamPackageSourceLocations(DescribeStreamPackageSourceLocationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageSourceLocations", DescribeStreamPackageSourceLocationsResponse.class);
    }

    /**
     *Query channel linear assembly Source information list.
     * @param req DescribeStreamPackageSourcesRequest
     * @return DescribeStreamPackageSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageSourcesResponse DescribeStreamPackageSources(DescribeStreamPackageSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageSources", DescribeStreamPackageSourcesResponse.class);
    }

    /**
     *Query VOD remux task information.
     * @param req DescribeStreamPackageVodRemuxTaskRequest
     * @return DescribeStreamPackageVodRemuxTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageVodRemuxTaskResponse DescribeStreamPackageVodRemuxTask(DescribeStreamPackageVodRemuxTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageVodRemuxTask", DescribeStreamPackageVodRemuxTaskResponse.class);
    }

    /**
     *Query VOD remux tasks informations.
     * @param req DescribeStreamPackageVodRemuxTasksRequest
     * @return DescribeStreamPackageVodRemuxTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamPackageVodRemuxTasksResponse DescribeStreamPackageVodRemuxTasks(DescribeStreamPackageVodRemuxTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamPackageVodRemuxTasks", DescribeStreamPackageVodRemuxTasksResponse.class);
    }

    /**
     *This API is used to modify a StreamPackage channel.
     * @param req ModifyStreamPackageChannelRequest
     * @return ModifyStreamPackageChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageChannelResponse ModifyStreamPackageChannel(ModifyStreamPackageChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageChannel", ModifyStreamPackageChannelResponse.class);
    }

    /**
     *This API is used to modify an endpoint of a StreamPackage channel.
     * @param req ModifyStreamPackageChannelEndpointRequest
     * @return ModifyStreamPackageChannelEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageChannelEndpointResponse ModifyStreamPackageChannelEndpoint(ModifyStreamPackageChannelEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageChannelEndpoint", ModifyStreamPackageChannelEndpointResponse.class);
    }

    /**
     *This API is used to modify the input authentication information of a StreamPackage channel.
     * @param req ModifyStreamPackageChannelInputAuthInfoRequest
     * @return ModifyStreamPackageChannelInputAuthInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageChannelInputAuthInfoResponse ModifyStreamPackageChannelInputAuthInfo(ModifyStreamPackageChannelInputAuthInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageChannelInputAuthInfo", ModifyStreamPackageChannelInputAuthInfoResponse.class);
    }

    /**
     *Modify channel linear assembly Channel configuration.
     * @param req ModifyStreamPackageLinearAssemblyChannelRequest
     * @return ModifyStreamPackageLinearAssemblyChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageLinearAssemblyChannelResponse ModifyStreamPackageLinearAssemblyChannel(ModifyStreamPackageLinearAssemblyChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageLinearAssemblyChannel", ModifyStreamPackageLinearAssemblyChannelResponse.class);
    }

    /**
     *Modify channel linear assembly Program configuration.
     * @param req ModifyStreamPackageLinearAssemblyProgramRequest
     * @return ModifyStreamPackageLinearAssemblyProgramResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageLinearAssemblyProgramResponse ModifyStreamPackageLinearAssemblyProgram(ModifyStreamPackageLinearAssemblyProgramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageLinearAssemblyProgram", ModifyStreamPackageLinearAssemblyProgramResponse.class);
    }

    /**
     *ModifyStreamPackageSSAIChannel
     * @param req ModifyStreamPackageSSAIChannelRequest
     * @return ModifyStreamPackageSSAIChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageSSAIChannelResponse ModifyStreamPackageSSAIChannel(ModifyStreamPackageSSAIChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageSSAIChannel", ModifyStreamPackageSSAIChannelResponse.class);
    }

    /**
     *Modify channel linear assembly Source configuration.
     * @param req ModifyStreamPackageSourceRequest
     * @return ModifyStreamPackageSourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageSourceResponse ModifyStreamPackageSource(ModifyStreamPackageSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageSource", ModifyStreamPackageSourceResponse.class);
    }

    /**
     *Modify channel linear assembly SourceLocation configuration
     * @param req ModifyStreamPackageSourceLocationRequest
     * @return ModifyStreamPackageSourceLocationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStreamPackageSourceLocationResponse ModifyStreamPackageSourceLocation(ModifyStreamPackageSourceLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStreamPackageSourceLocation", ModifyStreamPackageSourceLocationResponse.class);
    }

    /**
     *Start Linear Assembly Channel.
     * @param req StartStreamPackageLinearAssemblyChannelRequest
     * @return StartStreamPackageLinearAssemblyChannelResponse
     * @throws TencentCloudSDKException
     */
    public StartStreamPackageLinearAssemblyChannelResponse StartStreamPackageLinearAssemblyChannel(StartStreamPackageLinearAssemblyChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartStreamPackageLinearAssemblyChannel", StartStreamPackageLinearAssemblyChannelResponse.class);
    }

    /**
     *Start VOD remux task.
     * @param req StartStreamPackageVodRemuxTaskRequest
     * @return StartStreamPackageVodRemuxTaskResponse
     * @throws TencentCloudSDKException
     */
    public StartStreamPackageVodRemuxTaskResponse StartStreamPackageVodRemuxTask(StartStreamPackageVodRemuxTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartStreamPackageVodRemuxTask", StartStreamPackageVodRemuxTaskResponse.class);
    }

    /**
     *Stop linear assembly channel.
     * @param req StopStreamPackageLinearAssemblyChannelRequest
     * @return StopStreamPackageLinearAssemblyChannelResponse
     * @throws TencentCloudSDKException
     */
    public StopStreamPackageLinearAssemblyChannelResponse StopStreamPackageLinearAssemblyChannel(StopStreamPackageLinearAssemblyChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopStreamPackageLinearAssemblyChannel", StopStreamPackageLinearAssemblyChannelResponse.class);
    }

    /**
     *This API is used to unbind a CDN playback domain name from a channel.
     * @param req UnbindCdnDomainWithChannelRequest
     * @return UnbindCdnDomainWithChannelResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCdnDomainWithChannelResponse UnbindCdnDomainWithChannel(UnbindCdnDomainWithChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindCdnDomainWithChannel", UnbindCdnDomainWithChannelResponse.class);
    }

    /**
     *Unbind LinearAssembly channel with CDN domain name.
     * @param req UnbindLinearAssemblyCDNDomainWithChannelRequest
     * @return UnbindLinearAssemblyCDNDomainWithChannelResponse
     * @throws TencentCloudSDKException
     */
    public UnbindLinearAssemblyCDNDomainWithChannelResponse UnbindLinearAssemblyCDNDomainWithChannel(UnbindLinearAssemblyCDNDomainWithChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindLinearAssemblyCDNDomainWithChannel", UnbindLinearAssemblyCDNDomainWithChannelResponse.class);
    }

    /**
     *UnbindSSAICDNDomainWithChannel
     * @param req UnbindSSAICDNDomainWithChannelRequest
     * @return UnbindSSAICDNDomainWithChannelResponse
     * @throws TencentCloudSDKException
     */
    public UnbindSSAICDNDomainWithChannelResponse UnbindSSAICDNDomainWithChannel(UnbindSSAICDNDomainWithChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindSSAICDNDomainWithChannel", UnbindSSAICDNDomainWithChannelResponse.class);
    }

}
