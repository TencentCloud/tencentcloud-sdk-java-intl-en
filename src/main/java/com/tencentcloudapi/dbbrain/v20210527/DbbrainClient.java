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
     *This API is used to create an async task of killing all proxy node connection sessions and is currently supported only for Redis. The async task ID is the returned value, which can be passed to the API `DescribeProxySessionKillTasks` as a parameter to query the execution status of the session killing task.
     * @param req CreateProxySessionKillTaskRequest
     * @return CreateProxySessionKillTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateProxySessionKillTaskResponse CreateProxySessionKillTask(CreateProxySessionKillTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProxySessionKillTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProxySessionKillTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProxySessionKillTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain the diagnosis event list in a specified time period by risk level, instance ID, etc.
     * @param req DescribeDBDiagEventsRequest
     * @return DescribeDBDiagEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagEventsResponse DescribeDBDiagEvents(DescribeDBDiagEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDBDiagEvents");
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
     *This API is used to query the result of the session killing task executed by the Redis proxy node. The async task ID (an input parameter) is obtained after the API `CreateProxySessionKillTask` is successfully called. Currently, the only valid value of `product` is `redis`.
     * @param req DescribeProxySessionKillTasksRequest
     * @return DescribeProxySessionKillTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySessionKillTasksResponse DescribeProxySessionKillTasks(DescribeProxySessionKillTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProxySessionKillTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProxySessionKillTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProxySessionKillTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of top key prefixes for Redis instances.
     * @param req DescribeRedisTopKeyPrefixListRequest
     * @return DescribeRedisTopKeyPrefixListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRedisTopKeyPrefixListResponse DescribeRedisTopKeyPrefixList(DescribeRedisTopKeyPrefixListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRedisTopKeyPrefixListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRedisTopKeyPrefixListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRedisTopKeyPrefixList");
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
     *This API is used to get SQL statement optimization suggestions. It is free of charge for a limited time and will be charged after DBbrain is commercialized.
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

}
