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
    private static String endpoint = "rum.intl.tencentcloudapi.com";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogExport", CreateLogExportResponse.class);
    }

    /**
     *This API is used to create an offline log listener to report offline logs of particular users.
     * @param req CreateOfflineLogConfigRequest
     * @return CreateOfflineLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateOfflineLogConfigResponse CreateOfflineLogConfig(CreateOfflineLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOfflineLogConfig", CreateOfflineLogConfigResponse.class);
    }

    /**
     *This API is used to create a RUM application which belongs to a specific team.
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *This API is used to create a file record for the specified project.
     * @param req CreateReleaseFileRequest
     * @return CreateReleaseFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateReleaseFileResponse CreateReleaseFile(CreateReleaseFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReleaseFile", CreateReleaseFileResponse.class);
    }

    /**
     *This API is used to add a starred project.
     * @param req CreateStarProjectRequest
     * @return CreateStarProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateStarProjectResponse CreateStarProject(CreateStarProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStarProject", CreateStarProjectResponse.class);
    }

    /**
     *This API is used to create a RUM business system.
     * @param req CreateTawInstanceRequest
     * @return CreateTawInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateTawInstanceResponse CreateTawInstance(CreateTawInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTawInstance", CreateTawInstanceResponse.class);
    }

    /**
     *This API is used to create an allowlist.
     * @param req CreateWhitelistRequest
     * @return CreateWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhitelistResponse CreateWhitelist(CreateWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWhitelist", CreateWhitelistResponse.class);
    }

    /**
     *This API is used to delete an instance. The deleted instance cannot be recovered.
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogExport", DeleteLogExportResponse.class);
    }

    /**
     *This API is used to delete an offline RUM log listener. Then, offline logs of particular users will not be reported.
     * @param req DeleteOfflineLogConfigRequest
     * @return DeleteOfflineLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOfflineLogConfigResponse DeleteOfflineLogConfig(DeleteOfflineLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOfflineLogConfig", DeleteOfflineLogConfigResponse.class);
    }

    /**
     *This API is used to delete an offline log record.
     * @param req DeleteOfflineLogRecordRequest
     * @return DeleteOfflineLogRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOfflineLogRecordResponse DeleteOfflineLogRecord(DeleteOfflineLogRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOfflineLogRecord", DeleteOfflineLogRecordResponse.class);
    }

    /**
     *This API is used to delete the specified RUM project.
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *This API is used to delete the specified sourcemap file.
     * @param req DeleteReleaseFileRequest
     * @return DeleteReleaseFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReleaseFileResponse DeleteReleaseFile(DeleteReleaseFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReleaseFile", DeleteReleaseFileResponse.class);
    }

    /**
     *This API is used to delete a starred project for the specified user.
     * @param req DeleteStarProjectRequest
     * @return DeleteStarProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStarProjectResponse DeleteStarProject(DeleteStarProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStarProject", DeleteStarProjectResponse.class);
    }

    /**
     *This API is used to delete an allowlist.
     * @param req DeleteWhitelistRequest
     * @return DeleteWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWhitelistResponse DeleteWhitelist(DeleteWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWhitelist", DeleteWhitelistResponse.class);
    }

    /**
     *This API is used to query the forwarding monitor.
     * @param req DescribeDataRequest
     * @return DescribeDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataResponse DescribeData(DescribeDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeData", DescribeDataResponse.class);
    }

    /**
     *This API is used to get the DescribeDataCustomUrl information.
     * @param req DescribeDataCustomUrlRequest
     * @return DescribeDataCustomUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataCustomUrlResponse DescribeDataCustomUrl(DescribeDataCustomUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataCustomUrl", DescribeDataCustomUrlResponse.class);
    }

    /**
     *This API is used to get the DescribeDataEventUrl information.
     * @param req DescribeDataEventUrlRequest
     * @return DescribeDataEventUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataEventUrlResponse DescribeDataEventUrl(DescribeDataEventUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataEventUrl", DescribeDataEventUrlResponse.class);
    }

    /**
     *This API is used to get the `DescribeDataFetchProject` information and has been deprecated. Use `DescribeDataFetchUrl` instead.
     * @param req DescribeDataFetchProjectRequest
     * @return DescribeDataFetchProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchProjectResponse DescribeDataFetchProject(DescribeDataFetchProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataFetchProject", DescribeDataFetchProjectResponse.class);
    }

    /**
     *This API is used to get the DescribeDataFetchUrl information.
     * @param req DescribeDataFetchUrlRequest
     * @return DescribeDataFetchUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchUrlResponse DescribeDataFetchUrl(DescribeDataFetchUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataFetchUrl", DescribeDataFetchUrlResponse.class);
    }

    /**
     *This API is used to get the DescribeDataFetchUrlInfo information.
     * @param req DescribeDataFetchUrlInfoRequest
     * @return DescribeDataFetchUrlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataFetchUrlInfoResponse DescribeDataFetchUrlInfo(DescribeDataFetchUrlInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataFetchUrlInfo", DescribeDataFetchUrlInfoResponse.class);
    }

    /**
     *This API is used to get the loginfo information.
     * @param req DescribeDataLogUrlInfoRequest
     * @return DescribeDataLogUrlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataLogUrlInfoResponse DescribeDataLogUrlInfo(DescribeDataLogUrlInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataLogUrlInfo", DescribeDataLogUrlInfoResponse.class);
    }

    /**
     *This API is used to get the LogUrlStatistics information.
     * @param req DescribeDataLogUrlStatisticsRequest
     * @return DescribeDataLogUrlStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataLogUrlStatisticsResponse DescribeDataLogUrlStatistics(DescribeDataLogUrlStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataLogUrlStatistics", DescribeDataLogUrlStatisticsResponse.class);
    }

    /**
     *This API is used to get the PerformancePage information.
     * @param req DescribeDataPerformancePageRequest
     * @return DescribeDataPerformancePageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPerformancePageResponse DescribeDataPerformancePage(DescribeDataPerformancePageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataPerformancePage", DescribeDataPerformancePageResponse.class);
    }

    /**
     *This API is used to get the PerformanceProject information.
     * @param req DescribeDataPerformanceProjectRequest
     * @return DescribeDataPerformanceProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPerformanceProjectResponse DescribeDataPerformanceProject(DescribeDataPerformanceProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataPerformanceProject", DescribeDataPerformanceProjectResponse.class);
    }

    /**
     *This API is used to get the PvUrlInfo information.
     * @param req DescribeDataPvUrlInfoRequest
     * @return DescribeDataPvUrlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPvUrlInfoResponse DescribeDataPvUrlInfo(DescribeDataPvUrlInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataPvUrlInfo", DescribeDataPvUrlInfoResponse.class);
    }

    /**
     *This API is used to get the DescribeDataPvUrlStatistics information.
     * @param req DescribeDataPvUrlStatisticsRequest
     * @return DescribeDataPvUrlStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataPvUrlStatisticsResponse DescribeDataPvUrlStatistics(DescribeDataPvUrlStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataPvUrlStatistics", DescribeDataPvUrlStatisticsResponse.class);
    }

    /**
     *This API is used to get the number of reported data entries for a project.
     * @param req DescribeDataReportCountRequest
     * @return DescribeDataReportCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataReportCountResponse DescribeDataReportCount(DescribeDataReportCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataReportCount", DescribeDataReportCountResponse.class);
    }

    /**
     *This API is used to get the DescribeDataSetUrlStatistics information.
     * @param req DescribeDataSetUrlStatisticsRequest
     * @return DescribeDataSetUrlStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSetUrlStatisticsResponse DescribeDataSetUrlStatistics(DescribeDataSetUrlStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSetUrlStatistics", DescribeDataSetUrlStatisticsResponse.class);
    }

    /**
     *This API is used to get the DescribeDataStaticProject information.
     * @param req DescribeDataStaticProjectRequest
     * @return DescribeDataStaticProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticProjectResponse DescribeDataStaticProject(DescribeDataStaticProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataStaticProject", DescribeDataStaticProjectResponse.class);
    }

    /**
     *This API is used to get the DescribeDataStaticResource information.
     * @param req DescribeDataStaticResourceRequest
     * @return DescribeDataStaticResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticResourceResponse DescribeDataStaticResource(DescribeDataStaticResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataStaticResource", DescribeDataStaticResourceResponse.class);
    }

    /**
     *This API is used to get the DescribeDataStaticUrl information.
     * @param req DescribeDataStaticUrlRequest
     * @return DescribeDataStaticUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataStaticUrlResponse DescribeDataStaticUrl(DescribeDataStaticUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataStaticUrl", DescribeDataStaticUrlResponse.class);
    }

    /**
     *This API is used to get the DescribeDataWebVitalsPage information, which is about core user activities.
It includes the Web Vitals metric for the page loading performance.
     * @param req DescribeDataWebVitalsPageRequest
     * @return DescribeDataWebVitalsPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataWebVitalsPageResponse DescribeDataWebVitalsPage(DescribeDataWebVitalsPageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataWebVitalsPage", DescribeDataWebVitalsPageResponse.class);
    }

    /**
     *This API is used to get the homepage error information.
     * @param req DescribeErrorRequest
     * @return DescribeErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeErrorResponse DescribeError(DescribeErrorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeError", DescribeErrorResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogExports", DescribeLogExportsResponse.class);
    }

    /**
     *This API is used to get the log list. It has been deprecated. Use `DescribeRumLogList` instead.
     * @param req DescribeLogListRequest
     * @return DescribeLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogListResponse DescribeLogList(DescribeLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogList", DescribeLogListResponse.class);
    }

    /**
     *This API is used to get the configuration of the set offline log listener and return the unique user ID.
     * @param req DescribeOfflineLogConfigsRequest
     * @return DescribeOfflineLogConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineLogConfigsResponse DescribeOfflineLogConfigs(DescribeOfflineLogConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOfflineLogConfigs", DescribeOfflineLogConfigsResponse.class);
    }

    /**
     *This API is used to get all (up to 100) offline log records.
     * @param req DescribeOfflineLogRecordsRequest
     * @return DescribeOfflineLogRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineLogRecordsResponse DescribeOfflineLogRecords(DescribeOfflineLogRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOfflineLogRecords", DescribeOfflineLogRecordsResponse.class);
    }

    /**
     *This API is used to get the specified offline log.
     * @param req DescribeOfflineLogsRequest
     * @return DescribeOfflineLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOfflineLogsResponse DescribeOfflineLogs(DescribeOfflineLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOfflineLogs", DescribeOfflineLogsResponse.class);
    }

    /**
     *This API is used to get the sampling information of an application’s reporting APIs.
     * @param req DescribeProjectLimitsRequest
     * @return DescribeProjectLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectLimitsResponse DescribeProjectLimits(DescribeProjectLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectLimits", DescribeProjectLimitsResponse.class);
    }

    /**
     *This API is used to get the list of projects (under teams created by an instance).
     * @param req DescribeProjectsRequest
     * @return DescribeProjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectsResponse DescribeProjects(DescribeProjectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjects", DescribeProjectsResponse.class);
    }

    /**
     *This API is used to get the list of PVs under a project.
     * @param req DescribePvListRequest
     * @return DescribePvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePvListResponse DescribePvList(DescribePvListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePvList", DescribePvListResponse.class);
    }

    /**
     *This API is used to get the temporary key for uploaded file storage.
     * @param req DescribeReleaseFileSignRequest
     * @return DescribeReleaseFileSignResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseFileSignResponse DescribeReleaseFileSign(DescribeReleaseFileSignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseFileSign", DescribeReleaseFileSignResponse.class);
    }

    /**
     *This API is used to get the list of source maps of an application.
     * @param req DescribeReleaseFilesRequest
     * @return DescribeReleaseFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReleaseFilesResponse DescribeReleaseFiles(DescribeReleaseFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReleaseFiles", DescribeReleaseFilesResponse.class);
    }

    /**
     *This API is used to get the log aggregation information under a project.
     * @param req DescribeRumGroupLogRequest
     * @return DescribeRumGroupLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumGroupLogResponse DescribeRumGroupLog(DescribeRumGroupLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumGroupLog", DescribeRumGroupLogResponse.class);
    }

    /**
     *This API is used to get the list of logs in a project (created by an instance).
     * @param req DescribeRumLogExportRequest
     * @return DescribeRumLogExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogExportResponse DescribeRumLogExport(DescribeRumLogExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogExport", DescribeRumLogExportResponse.class);
    }

    /**
     *This API is used to get the list of exported logs in a project.
     * @param req DescribeRumLogExportsRequest
     * @return DescribeRumLogExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogExportsResponse DescribeRumLogExports(DescribeRumLogExportsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogExports", DescribeRumLogExportsResponse.class);
    }

    /**
     *This API is used to get the list of logs in a project (created by an instance).
     * @param req DescribeRumLogListRequest
     * @return DescribeRumLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumLogListResponse DescribeRumLogList(DescribeRumLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumLogList", DescribeRumLogListResponse.class);
    }

    /**
     *This API is used to get the list of logs in a project every minute.
     * @param req DescribeRumStatsLogListRequest
     * @return DescribeRumStatsLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRumStatsLogListResponse DescribeRumStatsLogList(DescribeRumStatsLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRumStatsLogList", DescribeRumStatsLogListResponse.class);
    }

    /**
     *This API is used to get the list of homepage scores.
     * @param req DescribeScoresRequest
     * @return DescribeScoresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScoresResponse DescribeScores(DescribeScoresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScores", DescribeScoresResponse.class);
    }

    /**
     *This API is used to query region information.
     * @param req DescribeTawAreasRequest
     * @return DescribeTawAreasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTawAreasResponse DescribeTawAreas(DescribeTawAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTawAreas", DescribeTawAreasResponse.class);
    }

    /**
     *This API is used to get the list of UVs under a project.
     * @param req DescribeUvListRequest
     * @return DescribeUvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUvListResponse DescribeUvList(DescribeUvListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUvList", DescribeUvListResponse.class);
    }

    /**
     *This API is used to get the list of allowlists.
     * @param req DescribeWhitelistsRequest
     * @return DescribeWhitelistsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWhitelistsResponse DescribeWhitelists(DescribeWhitelistsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWhitelists", DescribeWhitelistsResponse.class);
    }

    /**
     *This API is used to modify a RUM business system.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *This API is used to modify the RUM application information.
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

    /**
     *This API is used to add or modify data reporting limit.
     * @param req ModifyProjectLimitRequest
     * @return ModifyProjectLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectLimitResponse ModifyProjectLimit(ModifyProjectLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProjectLimit", ModifyProjectLimitResponse.class);
    }

    /**
     *This API is used to recover a RUM business system so that you can use the application to report data normally.
     * @param req ResumeInstanceRequest
     * @return ResumeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeInstanceResponse ResumeInstance(ResumeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeInstance", ResumeInstanceResponse.class);
    }

    /**
     *This API is used to recover an application and resume data reporting.
     * @param req ResumeProjectRequest
     * @return ResumeProjectResponse
     * @throws TencentCloudSDKException
     */
    public ResumeProjectResponse ResumeProject(ResumeProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeProject", ResumeProjectResponse.class);
    }

    /**
     *This API is used to stop an instance.
     * @param req StopInstanceRequest
     * @return StopInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StopInstanceResponse StopInstance(StopInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstance", StopInstanceResponse.class);
    }

    /**
     *This API is used to stop a project from reporting data.
     * @param req StopProjectRequest
     * @return StopProjectResponse
     * @throws TencentCloudSDKException
     */
    public StopProjectResponse StopProject(StopProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopProject", StopProjectResponse.class);
    }

}
