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
package com.tencentcloudapi.dbbrain.v20210527;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dbbrain.v20210527.models.*;

public class DbbrainClient extends AbstractClient{
    private static String endpoint = "dbbrain.tencentcloudapi.com";
    private static String service = "dbbrain";
    private static String version = "2021-05-27";

    public DbbrainClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DbbrainClient(Credential credential, String region, ClientProfile profile) {
        super(DbbrainClient.endpoint, DbbrainClient.version, credential, region, profile);
    }

    /**
     *This API is used to add the recipient name and email. The returned value is the ID of the successfully added recipient.
     * @param req AddUserContactRequest
     * @return AddUserContactResponse
     * @throws TencentCloudSDKException
     */
    public AddUserContactResponse AddUserContact(AddUserContactRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserContactResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserContactResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUserContact");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a health report and send it via email as configured.
     * @param req CreateDBDiagReportTaskRequest
     * @return CreateDBDiagReportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBDiagReportTaskResponse CreateDBDiagReportTask(CreateDBDiagReportTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBDiagReportTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBDiagReportTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBDiagReportTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a URL for a health report.
     * @param req CreateDBDiagReportUrlRequest
     * @return CreateDBDiagReportUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBDiagReportUrlResponse CreateDBDiagReportUrl(CreateDBDiagReportUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBDiagReportUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBDiagReportUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDBDiagReportUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create the email configuration. The input parameter `ProfileType` represents the type of the email configuration. Valid values: `dbScan_mail_configuration` (email configuration of database inspection report) and `scheduler_mail_configuration` (email sending configuration of scheduled task health report). Please always select Guangzhou for `Region`, regardless of the region where the instance resides.
     * @param req CreateMailProfileRequest
     * @return CreateMailProfileResponse
     * @throws TencentCloudSDKException
     */
    public CreateMailProfileResponse CreateMailProfile(CreateMailProfileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMailProfileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMailProfileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMailProfile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create the regular generation time of health reports and the regular email sending configuration. Please pass in the regular generation time of health reports as a parameter (Monday to Sunday) to set the regular generation time, and save the corresponding regular email sending configuration.
     * @param req CreateSchedulerMailProfileRequest
     * @return CreateSchedulerMailProfileResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchedulerMailProfileResponse CreateSchedulerMailProfile(CreateSchedulerMailProfileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSchedulerMailProfileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSchedulerMailProfileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSchedulerMailProfile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a security audit log export task.
     * @param req CreateSecurityAuditLogExportTaskRequest
     * @return CreateSecurityAuditLogExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityAuditLogExportTaskResponse CreateSecurityAuditLogExportTask(CreateSecurityAuditLogExportTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityAuditLogExportTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityAuditLogExportTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityAuditLogExportTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a security audit log export task.
     * @param req DeleteSecurityAuditLogExportTasksRequest
     * @return DeleteSecurityAuditLogExportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityAuditLogExportTasksResponse DeleteSecurityAuditLogExportTasks(DeleteSecurityAuditLogExportTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityAuditLogExportTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityAuditLogExportTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityAuditLogExportTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of the contact in the email.
     * @param req DescribeAllUserContactRequest
     * @return DescribeAllUserContactResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllUserContactResponse DescribeAllUserContact(DescribeAllUserContactRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllUserContactResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllUserContactResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllUserContact");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of the contact group in the email.
     * @param req DescribeAllUserGroupRequest
     * @return DescribeAllUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllUserGroupResponse DescribeAllUserGroup(DescribeAllUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the details of an instance exception diagnosis event.
     * @param req DescribeDBDiagEventRequest
     * @return DescribeDBDiagEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagEventResponse DescribeDBDiagEvent(DescribeDBDiagEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBDiagEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of instance diagnosis events.
     * @param req DescribeDBDiagHistoryRequest
     * @return DescribeDBDiagHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagHistoryResponse DescribeDBDiagHistory(DescribeDBDiagHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBDiagHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of health report generation tasks.
     * @param req DescribeDBDiagReportTasksRequest
     * @return DescribeDBDiagReportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagReportTasksResponse DescribeDBDiagReportTasks(DescribeDBDiagReportTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagReportTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagReportTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBDiagReportTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the overview of instance space usage during a specified time period, including disk usage growth (MB), available disk space (MB), total disk space (MB), and estimated number of available days.
     * @param req DescribeDBSpaceStatusRequest
     * @return DescribeDBSpaceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSpaceStatusResponse DescribeDBSpaceStatus(DescribeDBSpaceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSpaceStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSpaceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBSpaceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the instance information list. Please always select Guangzhou for `Region`.
     * @param req DescribeDiagDBInstancesRequest
     * @return DescribeDiagDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiagDBInstancesResponse DescribeDiagDBInstances(DescribeDiagDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiagDBInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiagDBInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiagDBInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the health score and deduction for exceptions in the specified time period (30 minutes) based on the instance ID.
     * @param req DescribeHealthScoreRequest
     * @return DescribeHealthScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHealthScoreResponse DescribeHealthScore(DescribeHealthScoreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHealthScoreResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHealthScoreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHealthScore");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the email sending configuration, including the email configuration for database inspection and the email sending configuration for scheduled task health reports.
     * @param req DescribeMailProfileRequest
     * @return DescribeMailProfileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMailProfileResponse DescribeMailProfile(DescribeMailProfileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMailProfileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMailProfileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMailProfile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the real-time thread list of a relational database.
     * @param req DescribeMySqlProcessListRequest
     * @return DescribeMySqlProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMySqlProcessListResponse DescribeMySqlProcessList(DescribeMySqlProcessListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMySqlProcessListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMySqlProcessListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMySqlProcessList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the download link of a security audit log export file. Currently, log file download only provides a Tencent Cloud private network address. Please download it by using a CVM instance in the Guangzhou region.
     * @param req DescribeSecurityAuditLogDownloadUrlsRequest
     * @return DescribeSecurityAuditLogDownloadUrlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityAuditLogDownloadUrlsResponse DescribeSecurityAuditLogDownloadUrls(DescribeSecurityAuditLogDownloadUrlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityAuditLogDownloadUrlsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityAuditLogDownloadUrlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityAuditLogDownloadUrls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of security audit log export tasks.
     * @param req DescribeSecurityAuditLogExportTasksRequest
     * @return DescribeSecurityAuditLogExportTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityAuditLogExportTasksResponse DescribeSecurityAuditLogExportTasks(DescribeSecurityAuditLogExportTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityAuditLogExportTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityAuditLogExportTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityAuditLogExportTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the slow log statistics histogram.
     * @param req DescribeSlowLogTimeSeriesStatsRequest
     * @return DescribeSlowLogTimeSeriesStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogTimeSeriesStatsResponse DescribeSlowLogTimeSeriesStats(DescribeSlowLogTimeSeriesStatsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogTimeSeriesStatsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogTimeSeriesStatsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLogTimeSeriesStats");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get and sort the top slow SQL statements in a specified time period by the aggregation mode of SQL template plus schema.
     * @param req DescribeSlowLogTopSqlsRequest
     * @return DescribeSlowLogTopSqlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogTopSqlsResponse DescribeSlowLogTopSqls(DescribeSlowLogTopSqlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogTopSqlsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogTopSqlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLogTopSqls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the statistical distribution chart of slow log source addresses.
     * @param req DescribeSlowLogUserHostStatsRequest
     * @return DescribeSlowLogUserHostStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogUserHostStatsResponse DescribeSlowLogUserHostStats(DescribeSlowLogUserHostStatsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogUserHostStatsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogUserHostStatsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSlowLogUserHostStats");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the daily space data of top databases consuming the most instance space. The data is daily collected by DBbrain during a specified time period. The returned results are sorted by size by default.
     * @param req DescribeTopSpaceSchemaTimeSeriesRequest
     * @return DescribeTopSpaceSchemaTimeSeriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceSchemaTimeSeriesResponse DescribeTopSpaceSchemaTimeSeries(DescribeTopSpaceSchemaTimeSeriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopSpaceSchemaTimeSeriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopSpaceSchemaTimeSeriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopSpaceSchemaTimeSeries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the real-time space statistics of top databases of an instance. The returned results are sorted by size by default.
     * @param req DescribeTopSpaceSchemasRequest
     * @return DescribeTopSpaceSchemasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceSchemasResponse DescribeTopSpaceSchemas(DescribeTopSpaceSchemasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopSpaceSchemasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopSpaceSchemasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopSpaceSchemas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the daily space data of top tables consuming the most instance space. The data is daily collected by DBbrain during a specified time period. The returned results are sorted by size by default.
     * @param req DescribeTopSpaceTableTimeSeriesRequest
     * @return DescribeTopSpaceTableTimeSeriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceTableTimeSeriesResponse DescribeTopSpaceTableTimeSeries(DescribeTopSpaceTableTimeSeriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopSpaceTableTimeSeriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopSpaceTableTimeSeriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopSpaceTableTimeSeries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the real-time space statistics of top tables of an instance. The returned results are sorted by size by default.
     * @param req DescribeTopSpaceTablesRequest
     * @return DescribeTopSpaceTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceTablesResponse DescribeTopSpaceTables(DescribeTopSpaceTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopSpaceTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopSpaceTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopSpaceTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get SQL statement optimization suggestions.
     * @param req DescribeUserSqlAdviceRequest
     * @return DescribeUserSqlAdviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSqlAdviceResponse DescribeUserSqlAdvice(DescribeUserSqlAdviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserSqlAdviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserSqlAdviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserSqlAdvice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to interrupt the current session according to the session ID. It needs to be called twice to commit the session interruption task in two stages. In the pre-commit stage, the stage value is `Prepare`, and the returned value is `SqlExecId’. In the commit stage, the stage value is `Commit`, and `SqlExecId` will be passed in as a parameter. Then the session process will be terminated.
     * @param req KillMySqlThreadsRequest
     * @return KillMySqlThreadsResponse
     * @throws TencentCloudSDKException
     */
    public KillMySqlThreadsResponse KillMySqlThreads(KillMySqlThreadsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KillMySqlThreadsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<KillMySqlThreadsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KillMySqlThreads");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable/disable instance inspection.
     * @param req ModifyDiagDBInstanceConfRequest
     * @return ModifyDiagDBInstanceConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiagDBInstanceConfResponse ModifyDiagDBInstanceConf(ModifyDiagDBInstanceConfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiagDBInstanceConfResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiagDBInstanceConfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDiagDBInstanceConf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
