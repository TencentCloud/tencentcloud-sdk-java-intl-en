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
package com.tencentcloudapi.trro.v20220325;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trro.v20220325.models.*;

public class TrroClient extends AbstractClient{
    private static String endpoint = "trro.tencentcloudapi.com";
    private static String service = "trro";
    private static String version = "2022-03-25";
    
    public TrroClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrroClient(Credential credential, String region, ClientProfile profile) {
        super(TrroClient.endpoint, TrroClient.version, credential, region, profile);
    }

    /**
     *This API is used to delete devices in batches.
     * @param req BatchDeleteDevicesRequest
     * @return BatchDeleteDevicesResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteDevicesResponse BatchDeleteDevices(BatchDeleteDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteDevices", BatchDeleteDevicesResponse.class);
    }

    /**
     *This API is used to batch delete and modify permission configurations.
     * @param req BatchDeletePolicyRequest
     * @return BatchDeletePolicyResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeletePolicyResponse BatchDeletePolicy(BatchDeletePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeletePolicy", BatchDeletePolicyResponse.class);
    }

    /**
     *This API is used to create a device.
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDevice", CreateDeviceResponse.class);
    }

    /**
     *This API is used to create a project.
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *This API is used to delete a project.
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *This API is used to get specified device information.
     * @param req DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceInfoResponse DescribeDeviceInfo(DescribeDeviceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceInfo", DescribeDeviceInfoResponse.class);
    }

    /**
     *Getting the device session list
     * @param req DescribeDeviceSessionListRequest
     * @return DescribeDeviceSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceSessionListResponse DescribeDeviceSessionList(DescribeDeviceSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceSessionList", DescribeDeviceSessionListResponse.class);
    }

    /**
     *This API is used to get project information.
     * @param req DescribeProjectInfoRequest
     * @return DescribeProjectInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectInfoResponse DescribeProjectInfo(DescribeProjectInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectInfo", DescribeProjectInfoResponse.class);
    }

    /**
     *This API is used to get project lists.
     * @param req DescribeProjectListRequest
     * @return DescribeProjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectListResponse DescribeProjectList(DescribeProjectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectList", DescribeProjectListResponse.class);
    }

    /**
     *Get the latest device session list
     * @param req DescribeRecentSessionListRequest
     * @return DescribeRecentSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecentSessionListResponse DescribeRecentSessionList(DescribeRecentSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecentSessionList", DescribeRecentSessionListResponse.class);
    }

    /**
     *Get session statistical values
     * @param req DescribeSessionStatisticsRequest
     * @return DescribeSessionStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionStatisticsResponse DescribeSessionStatistics(DescribeSessionStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionStatistics", DescribeSessionStatisticsResponse.class);
    }

    /**
     *Getting session statistics for each time period
     * @param req DescribeSessionStatisticsByIntervalRequest
     * @return DescribeSessionStatisticsByIntervalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionStatisticsByIntervalResponse DescribeSessionStatisticsByInterval(DescribeSessionStatisticsByIntervalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionStatisticsByInterval", DescribeSessionStatisticsByIntervalResponse.class);
    }

    /**
     *Obtain the quantity of available authorizations already bound to the device
     * @param req GetDeviceLicenseRequest
     * @return GetDeviceLicenseResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceLicenseResponse GetDeviceLicense(GetDeviceLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceLicense", GetDeviceLicenseResponse.class);
    }

    /**
     *Query the authorization binding status of user devices
     * @param req GetDevicesRequest
     * @return GetDevicesResponse
     * @throws TencentCloudSDKException
     */
    public GetDevicesResponse GetDevices(GetDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevices", GetDevicesResponse.class);
    }

    /**
     *Statistics of license types and quantities
     * @param req GetLicenseStatRequest
     * @return GetLicenseStatResponse
     * @throws TencentCloudSDKException
     */
    public GetLicenseStatResponse GetLicenseStat(GetLicenseStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLicenseStat", GetLicenseStatResponse.class);
    }

    /**
     *View the license list by authorization
     * @param req GetLicensesRequest
     * @return GetLicensesResponse
     * @throws TencentCloudSDKException
     */
    public GetLicensesResponse GetLicenses(GetLicensesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLicenses", GetLicensesResponse.class);
    }

    /**
     *This API is used to modify device information.
     * @param req ModifyDeviceRequest
     * @return ModifyDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceResponse ModifyDevice(ModifyDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDevice", ModifyDeviceResponse.class);
    }

    /**
     *This API is used to modify permission configuration.
     * @param req ModifyPolicyRequest
     * @return ModifyPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPolicyResponse ModifyPolicy(ModifyPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPolicy", ModifyPolicyResponse.class);
    }

    /**
     *This API is used to modify project information.
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

}
