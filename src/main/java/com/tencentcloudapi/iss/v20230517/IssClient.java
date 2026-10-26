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
package com.tencentcloudapi.iss.v20230517;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iss.v20230517.models.*;

public class IssClient extends AbstractClient{
    private static String endpoint = "iss.intl.tencentcloudapi.com";
    private static String service = "iss";
    private static String version = "2023-05-17";

    public IssClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IssClient(Credential credential, String region, ClientProfile profile) {
        super(IssClient.endpoint, IssClient.version, credential, region, profile);
    }

    /**
     *Used to add an organization.
     * @param req AddOrganizationRequest
     * @return AddOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationResponse AddOrganization(AddOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOrganization", AddOrganizationResponse.class);
    }

    /**
     *Used to add a recording cloud migration plan (currently applicable only to devices/video channels connected via the GB28181 protocol and gateway).
     * @param req AddRecordBackupPlanRequest
     * @return AddRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordBackupPlanResponse AddRecordBackupPlan(AddRecordBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordBackupPlan", AddRecordBackupPlanResponse.class);
    }

    /**
     *This API is used to create a video recording cloud template.
> The feature essentially pulls local device recording data to the cloud (i.e., recordings stored in the IPC camera memory card or NVR hard disk). When operating, first set the recording time period (i.e., the local device recording you want to upload to the cloud), then set the Cloud Upload Time Period and upload speed. The platform will pull the previous day's Time Period Data from the device at the specified speed during the Cloud Upload Time Period.

> Set the Cloud Upload Time Period to at least meet (Cloud Upload Time Period = previous day's recording time period / cloud upload speed multiplication). It is advisable to set about 10% more time for the Cloud Upload Time Period to avoid incomplete data retrieval due to network fluctuations.
     * @param req AddRecordBackupTemplateRequest
     * @return AddRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordBackupTemplateResponse AddRecordBackupTemplate(AddRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordBackupTemplate", AddRecordBackupTemplateResponse.class);
    }

    /**
     *This API is used to create a real-time cloud migration plan.
     * @param req AddRecordPlanRequest
     * @return AddRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordPlanResponse AddRecordPlan(AddRecordPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordPlan", AddRecordPlanResponse.class);
    }

    /**
     *This API is used to create a retrieval task.
     * @param req AddRecordRetrieveTaskRequest
     * @return AddRecordRetrieveTaskResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordRetrieveTaskResponse AddRecordRetrieveTask(AddRecordRetrieveTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordRetrieveTask", AddRecordRetrieveTaskResponse.class);
    }

    /**
     *Used to add a real-time cloud template.
     * @param req AddRecordTemplateRequest
     * @return AddRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordTemplateResponse AddRecordTemplate(AddRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordTemplate", AddRecordTemplateResponse.class);
    }

    /**
     *Used to set push/pull stream authentication configuration.
     * @param req AddStreamAuthRequest
     * @return AddStreamAuthResponse
     * @throws TencentCloudSDKException
     */
    public AddStreamAuthResponse AddStreamAuth(AddStreamAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddStreamAuth", AddStreamAuthResponse.class);
    }

    /**
     *This API is used to add a single device. After the device is added, configure it based on the returned results, then wait for device registration or stream pushing.
     * @param req AddUserDeviceRequest
     * @return AddUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AddUserDeviceResponse AddUserDevice(AddUserDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUserDevice", AddUserDeviceResponse.class);
    }

    /**
     *Add channels for screenshot configuration in batches.
     * @param req BatchAddVideoSnapshotConfigChannelRequest
     * @return BatchAddVideoSnapshotConfigChannelResponse
     * @throws TencentCloudSDKException
     */
    public BatchAddVideoSnapshotConfigChannelResponse BatchAddVideoSnapshotConfigChannel(BatchAddVideoSnapshotConfigChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchAddVideoSnapshotConfigChannel", BatchAddVideoSnapshotConfigChannelResponse.class);
    }

    /**
     *Batch associate visual understanding plan channels
     * @param req BatchAssignVLPlanChannelsRequest
     * @return BatchAssignVLPlanChannelsResponse
     * @throws TencentCloudSDKException
     */
    public BatchAssignVLPlanChannelsResponse BatchAssignVLPlanChannels(BatchAssignVLPlanChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchAssignVLPlanChannels", BatchAssignVLPlanChannelsResponse.class);
    }

    /**
     *This API is used to delete failed local recording download tasks in batches.
     * @param req BatchDeleteVideoDownloadTaskRequest
     * @return BatchDeleteVideoDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteVideoDownloadTaskResponse BatchDeleteVideoDownloadTask(BatchDeleteVideoDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteVideoDownloadTask", BatchDeleteVideoDownloadTaskResponse.class);
    }

    /**
     *This API is used to batch obtain source material URLs for visual understanding plans.
     * @param req BatchGetVLPlanSourceFileURLRequest
     * @return BatchGetVLPlanSourceFileURLResponse
     * @throws TencentCloudSDKException
     */
    public BatchGetVLPlanSourceFileURLResponse BatchGetVLPlanSourceFileURL(BatchGetVLPlanSourceFileURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchGetVLPlanSourceFileURL", BatchGetVLPlanSourceFileURLResponse.class);
    }

    /**
     *Bulk gets screenshot image URLs
     * @param req BatchGetVideoSnapshotImageUrlRequest
     * @return BatchGetVideoSnapshotImageUrlResponse
     * @throws TencentCloudSDKException
     */
    public BatchGetVideoSnapshotImageUrlResponse BatchGetVideoSnapshotImageUrl(BatchGetVideoSnapshotImageUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchGetVideoSnapshotImageUrl", BatchGetVideoSnapshotImageUrlResponse.class);
    }

    /**
     *Used for batch operations (enable, disable, delete) on devices.
     * @param req BatchOperateDeviceRequest
     * @return BatchOperateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public BatchOperateDeviceResponse BatchOperateDevice(BatchOperateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchOperateDevice", BatchOperateDeviceResponse.class);
    }

    /**
     *This API can be based on the Hikvision ISUP 5.0 protocol to pass through ISAPI request data. Before calling the API, ensure the device has successfully registered to this platform using the ISUP protocol.
     * @param req CallISAPIRequest
     * @return CallISAPIResponse
     * @throws TencentCloudSDKException
     */
    public CallISAPIResponse CallISAPI(CallISAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CallISAPI", CallISAPIResponse.class);
    }

    /**
     *Used for device channel panning control, including turn, zoom scale, zoom, and aperture.
     * @param req ControlDevicePTZRequest
     * @return ControlDevicePTZResponse
     * @throws TencentCloudSDKException
     */
    public ControlDevicePTZResponse ControlDevicePTZ(ControlDevicePTZRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDevicePTZ", ControlDevicePTZResponse.class);
    }

    /**
     *Used to operate device preset positions, including settings, deletion, and calls.
     * @param req ControlDevicePresetRequest
     * @return ControlDevicePresetResponse
     * @throws TencentCloudSDKException
     */
    public ControlDevicePresetResponse ControlDevicePreset(ControlDevicePresetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDevicePreset", ControlDevicePresetResponse.class);
    }

    /**
     *Control device capture (single). Currently only support national standard devices.
     * @param req ControlDeviceSnapshotRequest
     * @return ControlDeviceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceSnapshotResponse ControlDeviceSnapshot(ControlDeviceSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDeviceSnapshot", ControlDeviceSnapshotResponse.class);
    }

    /**
     *This API is used to obtain the real-time streaming address of a device.
     * @param req ControlDeviceStreamRequest
     * @return ControlDeviceStreamResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceStreamResponse ControlDeviceStream(ControlDeviceStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDeviceStream", ControlDeviceStreamResponse.class);
    }

    /**
     *This API is used to query the local recording timeline info of a device, which is stored locally on the NVR/IPC.
     * @param req ControlRecordTimelineRequest
     * @return ControlRecordTimelineResponse
     * @throws TencentCloudSDKException
     */
    public ControlRecordTimelineResponse ControlRecordTimeline(ControlRecordTimelineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlRecordTimeline", ControlRecordTimelineResponse.class);
    }

    /**
     *Creates a vision understanding plan
     * @param req CreateVLPlanRequest
     * @return CreateVLPlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateVLPlanResponse CreateVLPlan(CreateVLPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVLPlan", CreateVLPlanResponse.class);
    }

    /**
     *Create a visual understanding template.
     * @param req CreateVLTemplateRequest
     * @return CreateVLTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateVLTemplateResponse CreateVLTemplate(CreateVLTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVLTemplate", CreateVLTemplateResponse.class);
    }

    /**
     *This API is used to create a local recording download task.
     * @param req CreateVideoDownloadTaskRequest
     * @return CreateVideoDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoDownloadTaskResponse CreateVideoDownloadTask(CreateVideoDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVideoDownloadTask", CreateVideoDownloadTaskResponse.class);
    }

    /**
     *This API is used to create a screenshot configuration.
     * @param req CreateVideoSnapshotConfigRequest
     * @return CreateVideoSnapshotConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoSnapshotConfigResponse CreateVideoSnapshotConfig(CreateVideoSnapshotConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVideoSnapshotConfig", CreateVideoSnapshotConfigResponse.class);
    }

    /**
     *Create a screenshot template.
     * @param req CreateVideoSnapshotTemplateRequest
     * @return CreateVideoSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoSnapshotTemplateResponse CreateVideoSnapshotTemplate(CreateVideoSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVideoSnapshotTemplate", CreateVideoSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to delete domain names.
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomain", DeleteDomainResponse.class);
    }

    /**
     *This API is used to delete an organization.
     * @param req DeleteOrganizationRequest
     * @return DeleteOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationResponse DeleteOrganization(DeleteOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganization", DeleteOrganizationResponse.class);
    }

    /**
     *Used to delete a video recording cloud template.
     * @param req DeleteRecordBackupPlanRequest
     * @return DeleteRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordBackupPlanResponse DeleteRecordBackupPlan(DeleteRecordBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordBackupPlan", DeleteRecordBackupPlanResponse.class);
    }

    /**
     *This API is used to delete a video recording cloud template.
     * @param req DeleteRecordBackupTemplateRequest
     * @return DeleteRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordBackupTemplateResponse DeleteRecordBackupTemplate(DeleteRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordBackupTemplate", DeleteRecordBackupTemplateResponse.class);
    }

    /**
     *This API is used to delete a real-time cloud migration plan.
     * @param req DeleteRecordPlanRequest
     * @return DeleteRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordPlanResponse DeleteRecordPlan(DeleteRecordPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordPlan", DeleteRecordPlanResponse.class);
    }

    /**
     *This API is used to delete a retrieval task.
     * @param req DeleteRecordRetrieveTaskRequest
     * @return DeleteRecordRetrieveTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordRetrieveTaskResponse DeleteRecordRetrieveTask(DeleteRecordRetrieveTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordRetrieveTask", DeleteRecordRetrieveTaskResponse.class);
    }

    /**
     *Used to delete a real-time cloud template.
     * @param req DeleteRecordTemplateRequest
     * @return DeleteRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordTemplateResponse DeleteRecordTemplate(DeleteRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordTemplate", DeleteRecordTemplateResponse.class);
    }

    /**
     *Used to delete completed tasks.
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTask", DeleteTaskResponse.class);
    }

    /**
     *This API is used to delete added devices.
     * @param req DeleteUserDeviceRequest
     * @return DeleteUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserDeviceResponse DeleteUserDevice(DeleteUserDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserDevice", DeleteUserDeviceResponse.class);
    }

    /**
     *Delete a vision understanding plan
     * @param req DeleteVLPlanRequest
     * @return DeleteVLPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVLPlanResponse DeleteVLPlan(DeleteVLPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVLPlan", DeleteVLPlanResponse.class);
    }

    /**
     *Delete a visual understanding template.
     * @param req DeleteVLTemplateRequest
     * @return DeleteVLTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVLTemplateResponse DeleteVLTemplate(DeleteVLTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVLTemplate", DeleteVLTemplateResponse.class);
    }

    /**
     *Deletes screenshot configuration
     * @param req DeleteVideoSnapshotConfigRequest
     * @return DeleteVideoSnapshotConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVideoSnapshotConfigResponse DeleteVideoSnapshotConfig(DeleteVideoSnapshotConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVideoSnapshotConfig", DeleteVideoSnapshotConfigResponse.class);
    }

    /**
     *This API is used to delete a screenshot template.
     * @param req DeleteVideoSnapshotTemplateRequest
     * @return DeleteVideoSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVideoSnapshotTemplateResponse DeleteVideoSnapshotTemplate(DeleteVideoSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVideoSnapshotTemplate", DeleteVideoSnapshotTemplateResponse.class);
    }

    /**
     *This API is used to get the CNAME value based on the service node.
     * @param req DescribeCNAMERequest
     * @return DescribeCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCNAMEResponse DescribeCNAME(DescribeCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCNAME", DescribeCNAMEResponse.class);
    }

    /**
     *This API is used to query the channels of a device.
     * @param req DescribeDeviceChannelRequest
     * @return DescribeDeviceChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceChannelResponse DescribeDeviceChannel(DescribeDeviceChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceChannel", DescribeDeviceChannelResponse.class);
    }

    /**
     *This API is used to query preset position information of device channels.
     * @param req DescribeDevicePresetRequest
     * @return DescribeDevicePresetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePresetResponse DescribeDevicePreset(DescribeDevicePresetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevicePreset", DescribeDevicePresetResponse.class);
    }

    /**
     *This API is used to query the list of added domains.
     * @param req DescribeDomainRequest
     * @return DescribeDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainResponse DescribeDomain(DescribeDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomain", DescribeDomainResponse.class);
    }

    /**
     *This API is used to query the service nodes that can be bound when a user adds a domain name. The result is all service nodes supported by the platform. Each service node can only be bound to one domain name.
     * @param req DescribeDomainRegionRequest
     * @return DescribeDomainRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainRegionResponse DescribeDomainRegion(DescribeDomainRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainRegion", DescribeDomainRegionResponse.class);
    }

    /**
     *This API is used to obtain the public network address of a national standard device.
     * @param req DescribeGBDeviceAddrRequest
     * @return DescribeGBDeviceAddrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGBDeviceAddrResponse DescribeGBDeviceAddr(DescribeGBDeviceAddrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGBDeviceAddr", DescribeGBDeviceAddrResponse.class);
    }

    /**
     *Used for querying organizations.
     * @param req DescribeOrganizationRequest
     * @return DescribeOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationResponse DescribeOrganization(DescribeOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganization", DescribeOrganizationResponse.class);
    }

    /**
     *This API is used to query recording cloud migration plan details.
     * @param req DescribeRecordBackupPlanRequest
     * @return DescribeRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordBackupPlanResponse DescribeRecordBackupPlan(DescribeRecordBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordBackupPlan", DescribeRecordBackupPlanResponse.class);
    }

    /**
     *This API is used to query video recording cloud template details.
     * @param req DescribeRecordBackupTemplateRequest
     * @return DescribeRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordBackupTemplateResponse DescribeRecordBackupTemplate(DescribeRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordBackupTemplate", DescribeRecordBackupTemplateResponse.class);
    }

    /**
     *This API is used to query the device cloud recording timeline information, which is the cloud storage video recording after setting a recording schedule for video upload to cloud.
     * @param req DescribeRecordFileRequest
     * @return DescribeRecordFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordFileResponse DescribeRecordFile(DescribeRecordFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordFile", DescribeRecordFileResponse.class);
    }

    /**
     *This API is used to query real-time cloud migration plan details.
     * @param req DescribeRecordPlanRequest
     * @return DescribeRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordPlanResponse DescribeRecordPlan(DescribeRecordPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordPlan", DescribeRecordPlanResponse.class);
    }

    /**
     *This API is used to obtain the cloud recording playback url address.
     * @param req DescribeRecordPlaybackUrlRequest
     * @return DescribeRecordPlaybackUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordPlaybackUrlResponse DescribeRecordPlaybackUrl(DescribeRecordPlaybackUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordPlaybackUrl", DescribeRecordPlaybackUrlResponse.class);
    }

    /**
     *Used to query the details of a cloud recording retrieval task.
     * @param req DescribeRecordRetrieveTaskRequest
     * @return DescribeRecordRetrieveTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordRetrieveTaskResponse DescribeRecordRetrieveTask(DescribeRecordRetrieveTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordRetrieveTask", DescribeRecordRetrieveTaskResponse.class);
    }

    /**
     *This API is used to query real-time cloud migration template details.
     * @param req DescribeRecordTemplateRequest
     * @return DescribeRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordTemplateResponse DescribeRecordTemplate(DescribeRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordTemplate", DescribeRecordTemplateResponse.class);
    }

    /**
     *Used to query push/pull stream authentication configuration.
     * @param req DescribeStreamAuthRequest
     * @return DescribeStreamAuthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamAuthResponse DescribeStreamAuth(DescribeStreamAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamAuth", DescribeStreamAuthResponse.class);
    }

    /**
     *This API is used to query task details.
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTask", DescribeTaskResponse.class);
    }

    /**
     *This API is used to query detailed information of a device.
     * @param req DescribeUserDeviceRequest
     * @return DescribeUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDeviceResponse DescribeUserDevice(DescribeUserDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDevice", DescribeUserDeviceResponse.class);
    }

    /**
     *This API is used to query device details in batches.
     * @param req DescribeUserDeviceListRequest
     * @return DescribeUserDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDeviceListResponse DescribeUserDeviceList(DescribeUserDeviceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDeviceList", DescribeUserDeviceListResponse.class);
    }

    /**
     *Query the plan details of visual understanding.
     * @param req DescribeVLPlanRequest
     * @return DescribeVLPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVLPlanResponse DescribeVLPlan(DescribeVLPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVLPlan", DescribeVLPlanResponse.class);
    }

    /**
     *Query the result details of a vision understanding plan
     * @param req DescribeVLPlanResultRequest
     * @return DescribeVLPlanResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVLPlanResultResponse DescribeVLPlanResult(DescribeVLPlanResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVLPlanResult", DescribeVLPlanResultResponse.class);
    }

    /**
     *Query the details of a visual understanding template.
     * @param req DescribeVLTemplateRequest
     * @return DescribeVLTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVLTemplateResponse DescribeVLTemplate(DescribeVLTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVLTemplate", DescribeVLTemplateResponse.class);
    }

    /**
     *This API is used to obtain the bitrate info of a video channel.
     * @param req DescribeVideoBitRateRequest
     * @return DescribeVideoBitRateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoBitRateResponse DescribeVideoBitRate(DescribeVideoBitRateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoBitRate", DescribeVideoBitRateResponse.class);
    }

    /**
     *This API is used to obtain the download url of cloud recordings.
     * @param req DescribeVideoDownloadUrlRequest
     * @return DescribeVideoDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoDownloadUrlResponse DescribeVideoDownloadUrl(DescribeVideoDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoDownloadUrl", DescribeVideoDownloadUrlResponse.class);
    }

    /**
     *Queries screenshot configuration details
     * @param req DescribeVideoSnapshotConfigRequest
     * @return DescribeVideoSnapshotConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoSnapshotConfigResponse DescribeVideoSnapshotConfig(DescribeVideoSnapshotConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoSnapshotConfig", DescribeVideoSnapshotConfigResponse.class);
    }

    /**
     *Get screenshot template details.
     * @param req DescribeVideoSnapshotTemplateRequest
     * @return DescribeVideoSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoSnapshotTemplateResponse DescribeVideoSnapshotTemplate(DescribeVideoSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoSnapshotTemplate", DescribeVideoSnapshotTemplateResponse.class);
    }

    /**
     *Get device capture result list
     * @param req ListDeviceSnapshotsRequest
     * @return ListDeviceSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public ListDeviceSnapshotsResponse ListDeviceSnapshots(ListDeviceSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDeviceSnapshots", ListDeviceSnapshotsResponse.class);
    }

    /**
     *This API is used to obtain the device list under the corresponding organization.
     * @param req ListDevicesRequest
     * @return ListDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListDevicesResponse ListDevices(ListDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDevices", ListDevicesResponse.class);
    }

    /**
     *This API is used to query the channel list under the organizational unit directory.
     * @param req ListOrganizationChannelsRequest
     * @return ListOrganizationChannelsResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationChannelsResponse ListOrganizationChannels(ListOrganizationChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationChannels", ListOrganizationChannelsResponse.class);
    }

    /**
     *This API is used to query the device channel list under a recording cloud migration plan.
     * @param req ListRecordBackupPlanDevicesRequest
     * @return ListRecordBackupPlanDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordBackupPlanDevicesResponse ListRecordBackupPlanDevices(ListRecordBackupPlanDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordBackupPlanDevices", ListRecordBackupPlanDevicesResponse.class);
    }

    /**
     *This API is used to query the recording cloud migration plan list.
     * @param req ListRecordBackupPlansRequest
     * @return ListRecordBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordBackupPlansResponse ListRecordBackupPlans(ListRecordBackupPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordBackupPlans", ListRecordBackupPlansResponse.class);
    }

    /**
     *This API is used to query the video recording cloud template list.
     * @param req ListRecordBackupTemplatesRequest
     * @return ListRecordBackupTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordBackupTemplatesResponse ListRecordBackupTemplates(ListRecordBackupTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordBackupTemplates", ListRecordBackupTemplatesResponse.class);
    }

    /**
     *This API is used to query the device channel list under a real-time cloud migration plan.
     * @param req ListRecordPlanDevicesRequest
     * @return ListRecordPlanDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordPlanDevicesResponse ListRecordPlanDevices(ListRecordPlanDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordPlanDevices", ListRecordPlanDevicesResponse.class);
    }

    /**
     *This API is used to query the real-time cloud migration plan list.
     * @param req ListRecordPlansRequest
     * @return ListRecordPlansResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordPlansResponse ListRecordPlans(ListRecordPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordPlans", ListRecordPlansResponse.class);
    }

    /**
     *This API is used to query the retrieval task list.
     * @param req ListRecordRetrieveTasksRequest
     * @return ListRecordRetrieveTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordRetrieveTasksResponse ListRecordRetrieveTasks(ListRecordRetrieveTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordRetrieveTasks", ListRecordRetrieveTasksResponse.class);
    }

    /**
     *This API is used to query the real-time cloud migration template list.
     * @param req ListRecordTemplatesRequest
     * @return ListRecordTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordTemplatesResponse ListRecordTemplates(ListRecordTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordTemplates", ListRecordTemplatesResponse.class);
    }

    /**
     *This API is used to query the subtask list of a query task.
     * @param req ListSubTasksRequest
     * @return ListSubTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListSubTasksResponse ListSubTasks(ListSubTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSubTasks", ListSubTasksResponse.class);
    }

    /**
     *This API is used to query the batch task and simple task list.
     * @param req ListTasksRequest
     * @return ListTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListTasksResponse ListTasks(ListTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTasks", ListTasksResponse.class);
    }

    /**
     *Get the visual understanding plan list.
     * @param req ListVLPlansRequest
     * @return ListVLPlansResponse
     * @throws TencentCloudSDKException
     */
    public ListVLPlansResponse ListVLPlans(ListVLPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListVLPlans", ListVLPlansResponse.class);
    }

    /**
     *Get a list of visual understanding templates.
     * @param req ListVLTemplatesRequest
     * @return ListVLTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListVLTemplatesResponse ListVLTemplates(ListVLTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListVLTemplates", ListVLTemplatesResponse.class);
    }

    /**
     *This API is used to query the recording download task list in this store.
     * @param req ListVideoDownloadTaskRequest
     * @return ListVideoDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public ListVideoDownloadTaskResponse ListVideoDownloadTask(ListVideoDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListVideoDownloadTask", ListVideoDownloadTaskResponse.class);
    }

    /**
     *This API is used to search the screenshot template details list.
     * @param req ListVideoSnapshotTemplateRequest
     * @return ListVideoSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ListVideoSnapshotTemplateResponse ListVideoSnapshotTemplate(ListVideoSnapshotTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListVideoSnapshotTemplate", ListVideoSnapshotTemplateResponse.class);
    }

    /**
     *Modify a vision understanding plan
     * @param req ModifyVLPlanRequest
     * @return ModifyVLPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVLPlanResponse ModifyVLPlan(ModifyVLPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVLPlan", ModifyVLPlanResponse.class);
    }

    /**
     *Update screenshot configuration
     * @param req ModifyVideoSnapshotConfigRequest
     * @return ModifyVideoSnapshotConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVideoSnapshotConfigResponse ModifyVideoSnapshotConfig(ModifyVideoSnapshotConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVideoSnapshotConfig", ModifyVideoSnapshotConfigResponse.class);
    }

    /**
     *This API is used to obtain the local device recording URL address.
     * @param req PlayRecordRequest
     * @return PlayRecordResponse
     * @throws TencentCloudSDKException
     */
    public PlayRecordResponse PlayRecord(PlayRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PlayRecord", PlayRecordResponse.class);
    }

    /**
     *Query the disabled channel list
     * @param req QueryForbidPlayChannelListRequest
     * @return QueryForbidPlayChannelListResponse
     * @throws TencentCloudSDKException
     */
    public QueryForbidPlayChannelListResponse QueryForbidPlayChannelList(QueryForbidPlayChannelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryForbidPlayChannelList", QueryForbidPlayChannelListResponse.class);
    }

    /**
     *This API is used to synchronize channels of national standard devices. After the API is called, a request is triggered to get the channel list from devices. Newly-added channels are stored, and channels deleted on devices need to be deleted manually and are not automatically deleted in the backend.
     * @param req RefreshDeviceChannelRequest
     * @return RefreshDeviceChannelResponse
     * @throws TencentCloudSDKException
     */
    public RefreshDeviceChannelResponse RefreshDeviceChannel(RefreshDeviceChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefreshDeviceChannel", RefreshDeviceChannelResponse.class);
    }

    /**
     *Forbid the live preview of video channels for root accounts and sub-accounts.
     * @param req SetForbidPlayChannelsRequest
     * @return SetForbidPlayChannelsResponse
     * @throws TencentCloudSDKException
     */
    public SetForbidPlayChannelsResponse SetForbidPlayChannels(SetForbidPlayChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetForbidPlayChannels", SetForbidPlayChannelsResponse.class);
    }

    /**
     *Used to change the organization of devices in batches.
     * @param req UpdateDeviceOrganizationRequest
     * @return UpdateDeviceOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceOrganizationResponse UpdateDeviceOrganization(UpdateDeviceOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDeviceOrganization", UpdateDeviceOrganizationResponse.class);
    }

    /**
     *Used to enable or disable a device. After it is disabled, device registration is denied.
     * @param req UpdateDeviceStatusRequest
     * @return UpdateDeviceStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceStatusResponse UpdateDeviceStatus(UpdateDeviceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDeviceStatus", UpdateDeviceStatusResponse.class);
    }

    /**
     *Used to modify an organization.
     * @param req UpdateOrganizationRequest
     * @return UpdateOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationResponse UpdateOrganization(UpdateOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganization", UpdateOrganizationResponse.class);
    }

    /**
     *Used to modify the recording cloud migration plan.
     * @param req UpdateRecordBackupPlanRequest
     * @return UpdateRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordBackupPlanResponse UpdateRecordBackupPlan(UpdateRecordBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordBackupPlan", UpdateRecordBackupPlanResponse.class);
    }

    /**
     *Used to modify a video recording cloud template.
     * @param req UpdateRecordBackupTemplateRequest
     * @return UpdateRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordBackupTemplateResponse UpdateRecordBackupTemplate(UpdateRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordBackupTemplate", UpdateRecordBackupTemplateResponse.class);
    }

    /**
     *This API is used to modify a real-time cloud migration plan.
     * @param req UpdateRecordPlanRequest
     * @return UpdateRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordPlanResponse UpdateRecordPlan(UpdateRecordPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordPlan", UpdateRecordPlanResponse.class);
    }

    /**
     *Used to modify a real-time cloud template.
     * @param req UpdateRecordTemplateRequest
     * @return UpdateRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordTemplateResponse UpdateRecordTemplate(UpdateRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordTemplate", UpdateRecordTemplateResponse.class);
    }

    /**
     *This API is used to modify device configuration information.
     * @param req UpdateUserDeviceRequest
     * @return UpdateUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserDeviceResponse UpdateUserDevice(UpdateUserDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserDevice", UpdateUserDeviceResponse.class);
    }

}
