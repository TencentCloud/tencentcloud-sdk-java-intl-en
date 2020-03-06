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
package com.tencentcloudapi.cdn.v20180606;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdn.v20180606.models.*;

public class CdnClient extends AbstractClient{
    private static String endpoint = "cdn.tencentcloudapi.com";
    private static String version = "2018-06-06";

    public CdnClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdnClient(Credential credential, String region, ClientProfile profile) {
        super(CdnClient.endpoint, CdnClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a CDN acceleration domain name.
     * @param req AddCdnDomainRequest
     * @return AddCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddCdnDomainResponse AddCdnDomain(AddCdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddCdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddCdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a specified acceleration domain name.
     * @param req DeleteCdnDomainRequest
     * @return DeleteCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCdnDomainResponse DeleteCdnDomain(DeleteCdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeCdnData) is used to query CDN real-time access monitoring data and supports the following metrics:

+ Traffic (in bytes)
+ Bandwidth (in bps)
+ Number of requests
+ Traffic hit rate (in % with two decimal digits)
+ Aggregate list of 2xx status codes and the details of status codes starting with 2 (in entries)
+ Aggregate list of 3xx status codes and the details of status codes starting with 3 (in entries)
+ Aggregate list of 4xx status codes and the details of status codes starting with 4 (in entries)
+ Aggregate list of 5xx status codes and the details of status codes starting with 5 (in entries)
     * @param req DescribeCdnDataRequest
     * @return DescribeCdnDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnDataResponse DescribeCdnData(DescribeCdnDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdnDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCdnData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the download link of an access log. You can use this API for access logs in the last 30 days either within or outside Mainland China.
     * @param req DescribeCdnDomainLogsRequest
     * @return DescribeCdnDomainLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnDomainLogsResponse DescribeCdnDomainLogs(DescribeCdnDomainLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdnDomainLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnDomainLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCdnDomainLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query CDN IP ownership.
     * @param req DescribeCdnIpRequest
     * @return DescribeCdnIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnIpResponse DescribeCdnIp(DescribeCdnIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCdnIpResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCdnIpResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCdnIp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the basic configuration information of CDN acceleration domain names (inside and outside mainland China), including the project ID, service status, business type, creation time, and update time, etc.
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDomains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query all the configuration information of CDN acceleration domain names (inside and outside mainland China).
     * @param req DescribeDomainsConfigRequest
     * @return DescribeDomainsConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsConfigResponse DescribeDomainsConfig(DescribeDomainsConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainsConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDomainsConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeIpVisit) is used to query the number of users who remain active for 5 minutes and the detailed number of daily active users.

+ Number of users who remain active for 5 minutes: Collects deduplicated statistics based on client IP addresses in the log with the 5-minute granularity.
+ Number of daily active users: Collects deduplicated statistics based on client IP addresses in the log with the 1-day granularity.
     * @param req DescribeIpVisitRequest
     * @return DescribeIpVisitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpVisitResponse DescribeIpVisit(DescribeIpVisitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpVisitResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpVisitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIpVisit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeMapInfo) is used to query the IDs of districts or ISPs.
     * @param req DescribeMapInfoRequest
     * @return DescribeMapInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMapInfoResponse DescribeMapInfo(DescribeMapInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMapInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMapInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMapInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeOriginData) is used to query CDN real-time origin-pull monitoring data and supports the following metrics:

+ Origin-pull traffic (in bytes)
+ Origin-pull bandwidth (in bps)
+ Number of origin-pull requests
+ Number of failed origin-pull requests
+ Origin-pull failure rate (in % with two decimal digits)
+ Aggregate list of 2xx origin-pull status codes and the details of origin-pull status codes starting with 2 (in entries)
+ Aggregate list of 3xx origin-pull status codes and the details of origin-pull status codes starting with 3 (in entries)
+ Aggregate list of 4xx origin-pull status codes and the details of origin-pull status codes starting with 4 (in entries)
+ Aggregate list of 5xx origin-pull status codes and the details of origin-pull status codes starting with 5 (in entries)
     * @param req DescribeOriginDataRequest
     * @return DescribeOriginDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginDataResponse DescribeOriginData(DescribeOriginDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOriginDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOriginDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeOriginData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribePayType) is used to query billing information of the current account, such as billing mode and billing cycle.
     * @param req DescribePayTypeRequest
     * @return DescribePayTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribePayTypeResponse DescribePayType(DescribePayTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePayTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePayTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePayType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the record and progress of URL or directory purge tasks submitted via the `PurgePathCache` or `PurgeUrlsCache` APIs.
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurgeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurgeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePurgeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the submission record and progress of prefetch tasks.
This API is in beta test and not fully available yet. Please stay tuned.
     * @param req DescribePushTasksRequest
     * @return DescribePushTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePushTasksResponse DescribePushTasks(DescribePushTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePushTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePushTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePushTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of domain name URLs containing regulation-violating content scanned and detected by the CDN system, and the current status of the URLs.
It corresponds to the **Pornography Detection** page of the CDN Console.
     * @param req DescribeUrlViolationsRequest
     * @return DescribeUrlViolationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUrlViolationsResponse DescribeUrlViolations(DescribeUrlViolationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUrlViolationsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUrlViolationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUrlViolations"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisableCaches) is used to block access to a specific URL on CDN. After a URL is blocked, error 403 will be returned for all access requests to it. (This API is during beta test and not fully available now.)
     * @param req DisableCachesRequest
     * @return DisableCachesResponse
     * @throws TencentCloudSDKException
     */
    public DisableCachesResponse DisableCaches(DisableCachesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableCachesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableCachesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableCaches"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (EnableCaches) is used to unblock manually blocked URLs. After a URL is successfully unblocked, it takes about 5 to 10 minutes to take effect across the entire network. (This API is during beta test and not fully available now.)
     * @param req EnableCachesRequest
     * @return EnableCachesResponse
     * @throws TencentCloudSDKException
     */
    public EnableCachesResponse EnableCaches(EnableCachesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableCachesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableCachesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableCaches"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the resource blocking history and the current URL status. (This API is in beta test and not fully available yet.)
     * @param req GetDisableRecordsRequest
     * @return GetDisableRecordsResponse
     * @throws TencentCloudSDKException
     */
    public GetDisableRecordsResponse GetDisableRecords(GetDisableRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDisableRecordsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDisableRecordsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDisableRecords"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the following sorting data by using different combinations of the Metric and Filter input parameters:

+ It sorts access URLs by total traffic and total requests, and returns the top 1,000 URLs in descending order.
+ It sorts client districts by total traffic and total requests, and returns the list of districts in descending order.
+ It sorts client ISPs by total traffic and total requests, and returns the list of ISPs in descending order.
+ It sorts domain names by total traffic, peak bandwidth, total requests, average hit rate, and 2XX/3XX/4XX/5XX status codes, and returns the list of domain names in descending order.
+ It sorts domain names by total origin-pull traffic, peak origin-pull bandwidth, total origin-pull requests, average origin-pull failure rate, and 2XX/3XX/4XX/5XX origin-pull status codes, and returns the list of domain names in descending order.

Note: only querying of data within the past 90 days is supported.
     * @param req ListTopDataRequest
     * @return ListTopDataResponse
     * @throws TencentCloudSDKException
     */
    public ListTopDataResponse ListTopData(ListTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTopDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListTopDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListTopData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to submit multiple directory purge tasks, which are carried out according to the acceleration region of the domain names.
By default, a maximum of 100 directories can be purged per day for acceleration regions either within or outside Mainland China, and up to 20 tasks can be submitted at a time.
     * @param req PurgePathCacheRequest
     * @return PurgePathCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgePathCacheResponse PurgePathCache(PurgePathCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PurgePathCacheResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PurgePathCacheResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PurgePathCache"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to submit multiple URL purge tasks, which are carried out according to the current acceleration region of the domain names in the URLs.
By default, a maximum of 10,000 URLs can be purged per day for acceleration regions either within or outside Mainland China, and up to 1,000 tasks can be submitted at a time.
     * @param req PurgeUrlsCacheRequest
     * @return PurgeUrlsCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgeUrlsCacheResponse PurgeUrlsCache(PurgeUrlsCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PurgeUrlsCacheResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PurgeUrlsCacheResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PurgeUrlsCache"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to cache specified URL resources to CDN nodes. You can specify acceleration regions for the prefetch.
By default, a maximum of 1,000 URLs can be prefetched per day either within or outside Mainland China, and up to 20 tasks can be submitted at a time.
This API is in beta test and not fully available yet. Please stay tuned.
     * @param req PushUrlsCacheRequest
     * @return PushUrlsCacheResponse
     * @throws TencentCloudSDKException
     */
    public PushUrlsCacheResponse PushUrlsCache(PushUrlsCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PushUrlsCacheResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PushUrlsCacheResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PushUrlsCache"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable the acceleration service for a disabled domain name.
     * @param req StartCdnDomainRequest
     * @return StartCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StartCdnDomainResponse StartCdnDomain(StartCdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartCdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartCdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartCdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to suspend the acceleration service for a domain name.
Note: after the acceleration service has been suspended, the requests to the cache node will directly return 404. In order to avoid impact to your business, please release it before suspending the acceleration service.
     * @param req StopCdnDomainRequest
     * @return StopCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StopCdnDomainResponse StopCdnDomain(StopCdnDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopCdnDomainResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopCdnDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopCdnDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the configuration information of the CDN acceleration domain names.
Note: if you need to update complex configuration items, you must pass all the attributes of the entire object. Attributes that are not passed will use the default value. It is recommended that you call the querying API to obtain the configuration attributes first, and then you directly modify them and pass them to this API. Due to the special nature of the certificate, for HTTPS configuration, the certificate and key fields do not need to be passed.
     * @param req UpdateDomainConfigRequest
     * @return UpdateDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDomainConfigResponse UpdateDomainConfig(UpdateDomainConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDomainConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDomainConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateDomainConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the billing mode of an account. At present, the billing mode of monthly-billed accounts and sub-accounts cannot be modified.
     * @param req UpdatePayTypeRequest
     * @return UpdatePayTypeResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePayTypeResponse UpdatePayType(UpdatePayTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePayTypeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePayTypeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdatePayType"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
