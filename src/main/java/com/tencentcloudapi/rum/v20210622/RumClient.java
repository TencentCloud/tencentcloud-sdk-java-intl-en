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
package com.tencentcloudapi.rum.v20210622;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.rum.v20210622.models.*;

public class RumClient extends AbstractClient{
    private static String endpoint = "rum.tencentcloudapi.com";
    private static String service = "rum";
    private static String version = "2021-06-22";

    public RumClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RumClient(Credential credential, String region, ClientProfile profile) {
        super(RumClient.endpoint, RumClient.version, credential, region, profile);
    }

    /**
     *API domain name: `rum.tencentcloudapi.com`.

This API is used to create a log download task.

Default API request rate limit: 20 requests/sec.
     * @param req CreateLogExportRequest
     * @return CreateLogExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogExportResponse CreateLogExport(CreateLogExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLogExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLogExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLogExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an offline log listener to report offline logs of particular users.
     * @param req CreateOfflineLogConfigRequest
     * @return CreateOfflineLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateOfflineLogConfigResponse CreateOfflineLogConfig(CreateOfflineLogConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOfflineLogConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOfflineLogConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOfflineLogConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a project (owned by the specified team).
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a file record for the specified project.
     * @param req CreateReleaseFileRequest
     * @return CreateReleaseFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateReleaseFileResponse CreateReleaseFile(CreateReleaseFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReleaseFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReleaseFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReleaseFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a starred project.
     * @param req CreateStarProjectRequest
     * @return CreateStarProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateStarProjectResponse CreateStarProject(CreateStarProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStarProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStarProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStarProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a RUM instance.
     * @param req CreateTawInstanceRequest
     * @return CreateTawInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateTawInstanceResponse CreateTawInstance(CreateTawInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTawInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTawInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTawInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an allowlist.
     * @param req CreateWhitelistRequest
     * @return CreateWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhitelistResponse CreateWhitelist(CreateWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWhitelistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWhitelistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWhitelist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an instance. The deleted instance cannot be recovered.
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *API domain name: `rum.tencentcloudapi.com`.

This API is used to delete a log download task.

Default API request rate limit: 20 requests/sec.
     * @param req DeleteLogExportRequest
     * @return DeleteLogExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogExportResponse DeleteLogExport(DeleteLogExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLogExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLogExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLogExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an offline RUM log listener. Then, offline logs of particular users will not be reported.
     * @param req DeleteOfflineLogConfigRequest
     * @return DeleteOfflineLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOfflineLogConfigResponse DeleteOfflineLogConfig(DeleteOfflineLogConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOfflineLogConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOfflineLogConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOfflineLogConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an offline log record.
     * @param req DeleteOfflineLogRecordRequest
     * @return DeleteOfflineLogRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOfflineLogRecordResponse DeleteOfflineLogRecord(DeleteOfflineLogRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOfflineLogRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOfflineLogRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOfflineLogRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the specified RUM project.
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the specified sourcemap file.
     * @param req DeleteReleaseFileRequest
     * @return DeleteReleaseFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReleaseFileResponse DeleteReleaseFile(DeleteReleaseFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteReleaseFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteReleaseFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteReleaseFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a starred project for the specified user.
     * @param req DeleteStarProjectRequest
     * @return DeleteStarProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStarProjectResponse DeleteStarProject(DeleteStarProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStarProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteStarProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteStarProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an allowlist.
     * @param req DeleteWhitelistRequest
     * @return DeleteWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWhitelistResponse DeleteWhitelist(DeleteWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWhitelistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWhitelistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWhitelist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the forwarding monitor.
     * @param req DescribeDataRequest
     * @return DescribeDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataResponse DescribeData(DescribeDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataCustomUrl information.
     * @param req DescribeDataCustomUrlRequest
     * @return DescribeDataCustomUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataCustomUrlResponse DescribeDataCustomUrl(DescribeDataCustomUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataCustomUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataCustomUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataCustomUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataEventUrl information.
     * @param req DescribeDataEventUrlRequest
     * @return DescribeDataEventUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEventUrlResponse DescribeDataEventUrl(DescribeDataEventUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataEventUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataEventUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataEventUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the `DescribeDataFetchProject` information and has been deprecated. Use `DescribeDataFetchUrl` instead.
     * @param req DescribeDataFetchProjectRequest
     * @return DescribeDataFetchProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchProjectResponse DescribeDataFetchProject(DescribeDataFetchProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataFetchProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataFetchProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataFetchProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataFetchUrl information.
     * @param req DescribeDataFetchUrlRequest
     * @return DescribeDataFetchUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchUrlResponse DescribeDataFetchUrl(DescribeDataFetchUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataFetchUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataFetchUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataFetchUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataFetchUrlInfo information.
     * @param req DescribeDataFetchUrlInfoRequest
     * @return DescribeDataFetchUrlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchUrlInfoResponse DescribeDataFetchUrlInfo(DescribeDataFetchUrlInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataFetchUrlInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataFetchUrlInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataFetchUrlInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the loginfo information.
     * @param req DescribeDataLogUrlInfoRequest
     * @return DescribeDataLogUrlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataLogUrlInfoResponse DescribeDataLogUrlInfo(DescribeDataLogUrlInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataLogUrlInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataLogUrlInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataLogUrlInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the LogUrlStatistics information.
     * @param req DescribeDataLogUrlStatisticsRequest
     * @return DescribeDataLogUrlStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataLogUrlStatisticsResponse DescribeDataLogUrlStatistics(DescribeDataLogUrlStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataLogUrlStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataLogUrlStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataLogUrlStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the PerformancePage information.
     * @param req DescribeDataPerformancePageRequest
     * @return DescribeDataPerformancePageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPerformancePageResponse DescribeDataPerformancePage(DescribeDataPerformancePageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataPerformancePageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataPerformancePageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataPerformancePage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the PerformanceProject information.
     * @param req DescribeDataPerformanceProjectRequest
     * @return DescribeDataPerformanceProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPerformanceProjectResponse DescribeDataPerformanceProject(DescribeDataPerformanceProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataPerformanceProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataPerformanceProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataPerformanceProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the PvUrlInfo information.
     * @param req DescribeDataPvUrlInfoRequest
     * @return DescribeDataPvUrlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPvUrlInfoResponse DescribeDataPvUrlInfo(DescribeDataPvUrlInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataPvUrlInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataPvUrlInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataPvUrlInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataPvUrlStatistics information.
     * @param req DescribeDataPvUrlStatisticsRequest
     * @return DescribeDataPvUrlStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPvUrlStatisticsResponse DescribeDataPvUrlStatistics(DescribeDataPvUrlStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataPvUrlStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataPvUrlStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataPvUrlStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the number of reported data entries for a project.
     * @param req DescribeDataReportCountRequest
     * @return DescribeDataReportCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataReportCountResponse DescribeDataReportCount(DescribeDataReportCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataReportCountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataReportCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataReportCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataSetUrlStatistics information.
     * @param req DescribeDataSetUrlStatisticsRequest
     * @return DescribeDataSetUrlStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSetUrlStatisticsResponse DescribeDataSetUrlStatistics(DescribeDataSetUrlStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataSetUrlStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataSetUrlStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataSetUrlStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataStaticProject information.
     * @param req DescribeDataStaticProjectRequest
     * @return DescribeDataStaticProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticProjectResponse DescribeDataStaticProject(DescribeDataStaticProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataStaticProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataStaticProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataStaticProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataStaticResource information.
     * @param req DescribeDataStaticResourceRequest
     * @return DescribeDataStaticResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticResourceResponse DescribeDataStaticResource(DescribeDataStaticResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataStaticResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataStaticResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataStaticResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataStaticUrl information.
     * @param req DescribeDataStaticUrlRequest
     * @return DescribeDataStaticUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticUrlResponse DescribeDataStaticUrl(DescribeDataStaticUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataStaticUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataStaticUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataStaticUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DescribeDataWebVitalsPage information, which is about core user activities.
It includes the Web Vitals metric for the page loading performance.
     * @param req DescribeDataWebVitalsPageRequest
     * @return DescribeDataWebVitalsPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataWebVitalsPageResponse DescribeDataWebVitalsPage(DescribeDataWebVitalsPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataWebVitalsPageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataWebVitalsPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataWebVitalsPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the homepage error information.
     * @param req DescribeErrorRequest
     * @return DescribeErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorResponse DescribeError(DescribeErrorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeErrorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeErrorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeError");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *API domain name: `rum.tencentcloudapi.com`.

This API is used to get the list of log download tasks.

Default API request rate limit: 20 requests/sec.
     * @param req DescribeLogExportsRequest
     * @return DescribeLogExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogExportsResponse DescribeLogExports(DescribeLogExportsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogExportsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogExportsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogExports");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of logs in a project (created by an instance).
     * @param req DescribeLogListRequest
     * @return DescribeLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogListResponse DescribeLogList(DescribeLogListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the configuration of the set offline log listener and return the unique user ID.
     * @param req DescribeOfflineLogConfigsRequest
     * @return DescribeOfflineLogConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineLogConfigsResponse DescribeOfflineLogConfigs(DescribeOfflineLogConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfflineLogConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfflineLogConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfflineLogConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get all (up to 100) offline log records.
     * @param req DescribeOfflineLogRecordsRequest
     * @return DescribeOfflineLogRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineLogRecordsResponse DescribeOfflineLogRecords(DescribeOfflineLogRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfflineLogRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfflineLogRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfflineLogRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the specified offline log.
     * @param req DescribeOfflineLogsRequest
     * @return DescribeOfflineLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineLogsResponse DescribeOfflineLogs(DescribeOfflineLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOfflineLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOfflineLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOfflineLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of project reporting rates.
     * @param req DescribeProjectLimitsRequest
     * @return DescribeProjectLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectLimitsResponse DescribeProjectLimits(DescribeProjectLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProjectLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of projects (under teams created by an instance).
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProjects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of PVs under a project.
     * @param req DescribePvListRequest
     * @return DescribePvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePvListResponse DescribePvList(DescribePvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePvListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePvListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePvList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the temporary key for uploaded file storage.
     * @param req DescribeReleaseFileSignRequest
     * @return DescribeReleaseFileSignResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseFileSignResponse DescribeReleaseFileSign(DescribeReleaseFileSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReleaseFileSignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReleaseFileSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReleaseFileSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of sourcemap files of a project.
     * @param req DescribeReleaseFilesRequest
     * @return DescribeReleaseFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseFilesResponse DescribeReleaseFiles(DescribeReleaseFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReleaseFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReleaseFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReleaseFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of homepage scores.
     * @param req DescribeScoresRequest
     * @return DescribeScoresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScoresResponse DescribeScores(DescribeScoresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScoresResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScoresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScores");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query region information.
     * @param req DescribeTawAreasRequest
     * @return DescribeTawAreasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTawAreasResponse DescribeTawAreas(DescribeTawAreasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTawAreasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTawAreasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTawAreas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of UVs under a project.
     * @param req DescribeUvListRequest
     * @return DescribeUvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUvListResponse DescribeUvList(DescribeUvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUvListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUvListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUvList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of allowlists.
     * @param req DescribeWhitelistsRequest
     * @return DescribeWhitelistsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhitelistsResponse DescribeWhitelists(DescribeWhitelistsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWhitelistsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWhitelistsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWhitelists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an instance.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a RUM project.
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add or modify data reporting limit.
     * @param req ModifyProjectLimitRequest
     * @return ModifyProjectLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectLimitResponse ModifyProjectLimit(ModifyProjectLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProjectLimitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProjectLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProjectLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to resume an instance.
     * @param req ResumeInstanceRequest
     * @return ResumeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeInstanceResponse ResumeInstance(ResumeInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop an instance.
     * @param req StopInstanceRequest
     * @return StopInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StopInstanceResponse StopInstance(StopInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
