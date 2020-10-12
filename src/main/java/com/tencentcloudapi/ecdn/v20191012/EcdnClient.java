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
package com.tencentcloudapi.ecdn.v20191012;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ecdn.v20191012.models.*;

public class EcdnClient extends AbstractClient{
    private static String endpoint = "ecdn.tencentcloudapi.com";
    private static String version = "2019-10-12";

    public EcdnClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EcdnClient(Credential credential, String region, ClientProfile profile) {
        super(EcdnClient.endpoint, EcdnClient.version, credential, region, profile);
    }

    /**
     *This API is used to create an acceleration domain name.
     * @param req AddEcdnDomainRequest
     * @return AddEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddEcdnDomainResponse AddEcdnDomain(AddEcdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEcdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddEcdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddEcdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a specified acceleration domain name. The acceleration domain name to be deleted must be in disabled status.
     * @param req DeleteEcdnDomainRequest
     * @return DeleteEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEcdnDomainResponse DeleteEcdnDomain(DeleteEcdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEcdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEcdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEcdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the basic information of a CDN domain name, including the project ID, status, business type, creation time, update time, etc.
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the detailed configuration information of a CDN acceleration domain name.
     * @param req DescribeDomainsConfigRequest
     * @return DescribeDomainsConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsConfigResponse DescribeDomainsConfig(DescribeDomainsConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainsConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainsConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the access log download link of a domain name.
     * @param req DescribeEcdnDomainLogsRequest
     * @return DescribeEcdnDomainLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEcdnDomainLogsResponse DescribeEcdnDomainLogs(DescribeEcdnDomainLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEcdnDomainLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEcdnDomainLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEcdnDomainLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the statistical metrics of domain name access within a specified time period.
     * @param req DescribeEcdnDomainStatisticsRequest
     * @return DescribeEcdnDomainStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEcdnDomainStatisticsResponse DescribeEcdnDomainStatistics(DescribeEcdnDomainStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEcdnDomainStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEcdnDomainStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEcdnDomainStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query ECDN real-time access monitoring data and supports the following metrics:

+ Traffic (in bytes)
+ Bandwidth (in bps)
+ Number of requests
+ Response time (in ms)
+ Number of 2xx status codes and details of status codes starting with 2
+ Number of 3xx status codes and details of status codes starting with 3
+ Number of 4xx status codes and details of status codes starting with 4
+ Number of 5xx status codes and details of status codes starting with 5
     * @param req DescribeEcdnStatisticsRequest
     * @return DescribeEcdnStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEcdnStatisticsResponse DescribeEcdnStatistics(DescribeEcdnStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEcdnStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEcdnStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEcdnStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the usage quota of the purge API.
     * @param req DescribePurgeQuotaRequest
     * @return DescribePurgeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeQuotaResponse DescribePurgeQuota(DescribePurgeQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurgeQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurgeQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePurgeQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the submission history of purge tasks and their execution progress.
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurgeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurgeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePurgeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to batch purge cache directories. One purge task ID will be returned for each submission.
     * @param req PurgePathCacheRequest
     * @return PurgePathCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgePathCacheResponse PurgePathCache(PurgePathCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PurgePathCacheResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PurgePathCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PurgePathCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to batch purge URLs. One purge task ID will be returned for each submission.
     * @param req PurgeUrlsCacheRequest
     * @return PurgeUrlsCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgeUrlsCacheResponse PurgeUrlsCache(PurgeUrlsCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PurgeUrlsCacheResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PurgeUrlsCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PurgeUrlsCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable an acceleration domain name. The domain name to be enabled must be in deactivated status.
     * @param req StartEcdnDomainRequest
     * @return StartEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StartEcdnDomainResponse StartEcdnDomain(StartEcdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartEcdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartEcdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartEcdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to disable an acceleration domain name. The domain name to be disabled must be in enabled or deploying status.
     * @param req StopEcdnDomainRequest
     * @return StopEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StopEcdnDomainResponse StopEcdnDomain(StopEcdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopEcdnDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopEcdnDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopEcdnDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the configuration information of an ECDN acceleration domain name.
Note: if you need to update a complex configuration item, you must pass in all attributes of the entire object, and the default values will be used for the attributes that are not passed in. You are recommended to get the configuration attribute through the query API first and then directly modify and pass it to this API. Due to the special nature of the certificate for HTTPS configuration, you do not need to pass in the certificate and key fields during the update.
     * @param req UpdateDomainConfigRequest
     * @return UpdateDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDomainConfigResponse UpdateDomainConfig(UpdateDomainConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDomainConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDomainConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDomainConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
