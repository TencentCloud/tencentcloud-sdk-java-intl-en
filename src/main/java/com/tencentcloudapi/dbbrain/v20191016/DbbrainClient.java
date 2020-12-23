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
package com.tencentcloudapi.dbbrain.v20191016;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dbbrain.v20191016.models.*;

public class DbbrainClient extends AbstractClient{
    private static String endpoint = "dbbrain.tencentcloudapi.com";
    private static String service = "dbbrain";
    private static String version = "2019-10-16";

    public DbbrainClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DbbrainClient(Credential credential, String region, ClientProfile profile) {
        super(DbbrainClient.endpoint, DbbrainClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a health report and select whether to send an email.
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
     *This API is used to create the email configuration. The input parameter “ProfileType” represents the type of the email configuration. Valid values: “dbScan_mail_configuration” (email configuration of database inspection report) and “scheduler_mail_configuration” (email configuration of scheduled task report).
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
     *This API is used to obtain the information of the contact in the email.
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
     *This API is used to obtain the information of the contact group in the email.
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
     *This API is used to query the daily space data of top tables consuming the most instance space. The data is daily collected by DBbrain during a specified time period. The return results are sorted by size by default.
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
     *This API is used to query real-time space statistics of top tables of an instance. The return results are sorted by size by default.
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
     *This API is used to modify instance inspection switch.
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
