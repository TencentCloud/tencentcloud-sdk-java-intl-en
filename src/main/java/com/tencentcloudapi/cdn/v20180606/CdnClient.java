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
    private static String service = "cdn";
    private static String version = "2018-06-06";
    
    public CdnClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdnClient(Credential credential, String region, ClientProfile profile) {
        super(CdnClient.endpoint, CdnClient.version, credential, region, profile);
    }

    /**
     *This API is used to add one or more domains to a specified log topic.
     * @param req AddCLSTopicDomainsRequest
     * @return AddCLSTopicDomainsResponse
     * @throws TencentCloudSDKException
     */
    public AddCLSTopicDomainsResponse AddCLSTopicDomains(AddCLSTopicDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCLSTopicDomains", AddCLSTopicDomainsResponse.class);
    }

    /**
     *This API is used to add a CDN acceleration domain name. Up to 100 domain names can be added per minute.
     * @param req AddCdnDomainRequest
     * @return AddCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddCdnDomainResponse AddCdnDomain(AddCdnDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCdnDomain", AddCdnDomainResponse.class);
    }

    /**
     *This API is used to create a log topic. Up to 10 log topics can be created under one logset.
     * @param req CreateClsLogTopicRequest
     * @return CreateClsLogTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateClsLogTopicResponse CreateClsLogTopic(CreateClsLogTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClsLogTopic", CreateClsLogTopicResponse.class);
    }

    /**
     *This API is used to recreate a failed event log task.
     * @param req CreateScdnFailedLogTaskRequest
     * @return CreateScdnFailedLogTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateScdnFailedLogTaskResponse CreateScdnFailedLogTask(CreateScdnFailedLogTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScdnFailedLogTask", CreateScdnFailedLogTaskResponse.class);
    }

    /**
     *This API is used to delete a specified acceleration domain name.
     * @param req DeleteCdnDomainRequest
     * @return DeleteCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCdnDomainResponse DeleteCdnDomain(DeleteCdnDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCdnDomain", DeleteCdnDomainResponse.class);
    }

    /**
     *This API is used to delete a log topic. Note: when a log topic is deleted, all logs of the domain names bound to it will no longer be published to the topic, and the logs previously published to the topic will be deleted. This action will take effect within 5–15 minutes.
     * @param req DeleteClsLogTopicRequest
     * @return DeleteClsLogTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClsLogTopicResponse DeleteClsLogTopic(DeleteClsLogTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClsLogTopic", DeleteClsLogTopicResponse.class);
    }

    /**
     *This API is used to query billing data details.
     * @param req DescribeBillingDataRequest
     * @return DescribeBillingDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingDataResponse DescribeBillingData(DescribeBillingDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingData", DescribeBillingDataResponse.class);
    }

    /**
     *This API is used to query CDN real-time access monitoring data and supports the following metrics:

+ Traffic (in bytes)
+ Bandwidth (in bps)
+ Number of requests
+ Number of hit requests
+ Request hit rate (in %)
+ Hit traffic (in bytes)
+ Traffic hit rate (in %)
+ Aggregate list of 2xx status codes and the details of status codes starting with 2 (in entries)
+ Aggregate list of 3xx status codes and the details of status codes starting with 3 (in entries)
+ Aggregate list of 4xx status codes and the details of status codes starting with 4 (in entries)
+ Aggregate list of 5xx status codes and the details of status codes starting with 5 (in entries)
     * @param req DescribeCdnDataRequest
     * @return DescribeCdnDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnDataResponse DescribeCdnData(DescribeCdnDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdnData", DescribeCdnDataResponse.class);
    }

    /**
     *This API is used to query the download link of an access log. You can use this API for access logs in the last 30 days either within or outside Mainland China.
     * @param req DescribeCdnDomainLogsRequest
     * @return DescribeCdnDomainLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnDomainLogsResponse DescribeCdnDomainLogs(DescribeCdnDomainLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdnDomainLogs", DescribeCdnDomainLogsResponse.class);
    }

    /**
     *This API is used to query CDN IP ownership.
     * @param req DescribeCdnIpRequest
     * @return DescribeCdnIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnIpResponse DescribeCdnIp(DescribeCdnIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdnIp", DescribeCdnIpResponse.class);
    }

    /**
     *This API is used to query the IP information of CDN intermediate nodes. Note: this API will be deactivated soon and no longer be maintained. Please call `DescribeIpStatus` instead.
     * @param req DescribeCdnOriginIpRequest
     * @return DescribeCdnOriginIpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCdnOriginIpResponse DescribeCdnOriginIp(DescribeCdnOriginIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCdnOriginIp", DescribeCdnOriginIpResponse.class);
    }

    /**
     *This API is used to verify a SSL certificate and obtain its domain names.
     * @param req DescribeCertDomainsRequest
     * @return DescribeCertDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertDomainsResponse DescribeCertDomains(DescribeCertDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertDomains", DescribeCertDomainsResponse.class);
    }

    /**
     *This API is used to query the basic configuration information of CDN acceleration domain names (inside and outside mainland China), including the project ID, service status, service type, creation time, and update time, etc.
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomains", DescribeDomainsResponse.class);
    }

    /**
     *This API is used to query the complete configuration information of CDN acceleration domain names (inside and outside mainland China).
     * @param req DescribeDomainsConfigRequest
     * @return DescribeDomainsConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsConfigResponse DescribeDomainsConfig(DescribeDomainsConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainsConfig", DescribeDomainsConfigResponse.class);
    }

    /**
     *This API is used to query the IP details of edge nodes (available soon) and intermediate nodes. Note that there is a certain delay in data availability.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/api/228/41954?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req DescribeIpStatusRequest
     * @return DescribeIpStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpStatusResponse DescribeIpStatus(DescribeIpStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpStatus", DescribeIpStatusResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpVisit", DescribeIpVisitResponse.class);
    }

    /**
     *This API (DescribeMapInfo) is used to query the IDs of districts or ISPs.
     * @param req DescribeMapInfoRequest
     * @return DescribeMapInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMapInfoResponse DescribeMapInfo(DescribeMapInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMapInfo", DescribeMapInfoResponse.class);
    }

    /**
     *This API is used to query CDN real-time origin-pull monitoring data and supports the following metrics:

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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOriginData", DescribeOriginDataResponse.class);
    }

    /**
     *This API (DescribePayType) is used to query billing information of the current account, such as billing mode and billing cycle.
     * @param req DescribePayTypeRequest
     * @return DescribePayTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribePayTypeResponse DescribePayType(DescribePayTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePayType", DescribePayTypeResponse.class);
    }

    /**
     *This API is used to query the purge usage quota and daily available usage for an account.
     * @param req DescribePurgeQuotaRequest
     * @return DescribePurgeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeQuotaResponse DescribePurgeQuota(DescribePurgeQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePurgeQuota", DescribePurgeQuotaResponse.class);
    }

    /**
     *This API is used to query the record and progress of URL or directory purge tasks submitted via the `PurgePathCache` or `PurgeUrlsCache` APIs.
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePurgeTasks", DescribePurgeTasksResponse.class);
    }

    /**
     *This API is used to query the prefetch quota and daily available usage.
     * @param req DescribePushQuotaRequest
     * @return DescribePushQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribePushQuotaResponse DescribePushQuota(DescribePushQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePushQuota", DescribePushQuotaResponse.class);
    }

    /**
     *This API is used to query the submission record and progress of prefetch tasks.
     * @param req DescribePushTasksRequest
     * @return DescribePushTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePushTasksResponse DescribePushTasks(DescribePushTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePushTasks", DescribePushTasksResponse.class);
    }

    /**
     *This API is used to query the daily/weekly/monthly report data at domain name/project levels.
     * @param req DescribeReportDataRequest
     * @return DescribeReportDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportDataResponse DescribeReportData(DescribeReportDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReportData", DescribeReportDataResponse.class);
    }

    /**
     *This API is used to query the list of domain name URLs containing regulation-violating content scanned and detected by the CDN system, and the current status of the URLs.
It corresponds to the **Pornography Detection** page on the CDN Console.
     * @param req DescribeUrlViolationsRequest
     * @return DescribeUrlViolationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUrlViolationsResponse DescribeUrlViolations(DescribeUrlViolationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUrlViolations", DescribeUrlViolationsResponse.class);
    }

    /**
     *This API is used to block access to a specific URL on CDN. When a URL is blocked, error 403 will be returned for requests from the Chinese mainland. URL blocking is not permanent. Note that this API is only available to beta users now. 
     * @param req DisableCachesRequest
     * @return DisableCachesResponse
     * @throws TencentCloudSDKException
     */
    public DisableCachesResponse DisableCaches(DisableCachesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableCaches", DisableCachesResponse.class);
    }

    /**
     *This API is used to stop publishing to a log topic. Note: after a log topic is disabled, all logs of the domain names bound to it will no longer be published to the topic, and the logs that have already been published will be retained. This action will take effect within 5–15 minutes.

     * @param req DisableClsLogTopicRequest
     * @return DisableClsLogTopicResponse
     * @throws TencentCloudSDKException
     */
    public DisableClsLogTopicResponse DisableClsLogTopic(DisableClsLogTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableClsLogTopic", DisableClsLogTopicResponse.class);
    }

    /**
     *This API (EnableCaches) is used to unblock manually blocked URLs. After a URL is successfully unblocked, it takes about 5 to 10 minutes to take effect across the entire network. (This API is during beta test and not fully available now.)
     * @param req EnableCachesRequest
     * @return EnableCachesResponse
     * @throws TencentCloudSDKException
     */
    public EnableCachesResponse EnableCaches(EnableCachesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableCaches", EnableCachesResponse.class);
    }

    /**
     *This API is used to start publishing to a log topic. Note: after a log topic is enabled, all logs of the domain names bound to the topic will be published to it. This action will take effect within 5–15 minutes.
     * @param req EnableClsLogTopicRequest
     * @return EnableClsLogTopicResponse
     * @throws TencentCloudSDKException
     */
    public EnableClsLogTopicResponse EnableClsLogTopic(EnableClsLogTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableClsLogTopic", EnableClsLogTopicResponse.class);
    }

    /**
     *This API is used to query the resource blocking history and the current URL status. (This API is in beta test and not generally available yet.)
     * @param req GetDisableRecordsRequest
     * @return GetDisableRecordsResponse
     * @throws TencentCloudSDKException
     */
    public GetDisableRecordsResponse GetDisableRecords(GetDisableRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDisableRecords", GetDisableRecordsResponse.class);
    }

    /**
     *This API is used to display the list of log topics. Note: a logset can contain up to 10 log topics.
     * @param req ListClsLogTopicsRequest
     * @return ListClsLogTopicsResponse
     * @throws TencentCloudSDKException
     */
    public ListClsLogTopicsResponse ListClsLogTopics(ListClsLogTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListClsLogTopics", ListClsLogTopicsResponse.class);
    }

    /**
     *This API is used to get the list of domain names bound to a log topic.
     * @param req ListClsTopicDomainsRequest
     * @return ListClsTopicDomainsResponse
     * @throws TencentCloudSDKException
     */
    public ListClsTopicDomainsResponse ListClsTopicDomains(ListClsTopicDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListClsTopicDomains", ListClsTopicDomainsResponse.class);
    }

    /**
     *This API is used to list data sorted the following ways by using different combinations of the Metric and Filter input parameters:

+ It sorts access URLs by total traffic and total requests, and returns the top 1,000 URLs in descending order.
+ It sorts client districts by total traffic and total requests, and returns the list of districts in descending order.
+ It sorts client ISPs by total traffic and total requests, and returns the list of ISPs in descending order.
+ It sorts domain names by total traffic, peak bandwidth, total requests, average hit rate, and 2XX/3XX/4XX/5XX status codes, and returns the list of domain names in descending order.
+ It sorts domain names by total origin-pull traffic, peak origin-pull bandwidth, total origin-pull requests, average origin-pull failure rate, and 2XX/3XX/4XX/5XX origin-pull status codes, and returns the list of domain names in descending order.

Note: only data from the last 90 days will be queried.
     * @param req ListTopDataRequest
     * @return ListTopDataResponse
     * @throws TencentCloudSDKException
     */
    public ListTopDataResponse ListTopData(ListTopDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTopData", ListTopDataResponse.class);
    }

    /**
     *This API is used to manage the list of domain names bound to a log topic.
     * @param req ManageClsTopicDomainsRequest
     * @return ManageClsTopicDomainsResponse
     * @throws TencentCloudSDKException
     */
    public ManageClsTopicDomainsResponse ManageClsTopicDomains(ManageClsTopicDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManageClsTopicDomains", ManageClsTopicDomainsResponse.class);
    }

    /**
     *This API is used to modify the configuration of a CDN acceleration domain name in a finer manner than `UpdateDomainConfig`.
Notes:
In `Route`, separate values by dots (.). The last value is called a leaf node. For non-leaf nodes, keep the configuration unchanged.
The Value field is serialized to a JSON string {key:value}, where **key** is fixed to `update` and **value** is used to specify the value of the configuration parameter. To specify configurations with complex types, see https://intl.cloud.tencent.com/document/product/228/41116.?from_cn_redirect=1
The input parameters of this API are not reported to CloudAudit as it may contain sensitive data, such as keys and secrets.
     * @param req ModifyDomainConfigRequest
     * @return ModifyDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainConfigResponse ModifyDomainConfig(ModifyDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainConfig", ModifyDomainConfigResponse.class);
    }

    /**
     *This API is used to submit multiple directory purge tasks, which are carried out according to the acceleration region of the domain names.
By default, a maximum of 100 directories can be purged per day for acceleration regions either within or outside the Chinese mainland, and up to 500 tasks can be submitted at a time.
     * @param req PurgePathCacheRequest
     * @return PurgePathCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgePathCacheResponse PurgePathCache(PurgePathCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PurgePathCache", PurgePathCacheResponse.class);
    }

    /**
     *This API is used to submit multiple URL purge tasks, which are carried out according to the current acceleration region of the domain names in the URLs.
By default, a maximum of 10,000 URLs can be purged per day for acceleration regions either within or outside Mainland China, and up to 1,000 tasks can be submitted at a time.
     * @param req PurgeUrlsCacheRequest
     * @return PurgeUrlsCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgeUrlsCacheResponse PurgeUrlsCache(PurgeUrlsCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PurgeUrlsCache", PurgeUrlsCacheResponse.class);
    }

    /**
     *This API is used to cache specified URL resources to CDN nodes. You can specify acceleration regions for the prefetch.
By default, a maximum of 1000 URLs can be prefetched per day for regions either within or outside the Chinese mainland, and up to 500 tasks can be submitted at a time. Note that resources prefetched outside the Chinese mainland will be cached to CDN nodes outside the Chinese mainland and the traffic generated will incur costs.
     * @param req PushUrlsCacheRequest
     * @return PushUrlsCacheResponse
     * @throws TencentCloudSDKException
     */
    public PushUrlsCacheResponse PushUrlsCache(PushUrlsCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PushUrlsCache", PushUrlsCacheResponse.class);
    }

    /**
     *This API is used to search for CLS logs. Search filters can be set to today, 24 hours (one of the last 7 days), and the last 7 days.
     * @param req SearchClsLogRequest
     * @return SearchClsLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchClsLogResponse SearchClsLog(SearchClsLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchClsLog", SearchClsLogResponse.class);
    }

    /**
     *This API is used to enable the acceleration service for a disabled domain name.
     * @param req StartCdnDomainRequest
     * @return StartCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StartCdnDomainResponse StartCdnDomain(StartCdnDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCdnDomain", StartCdnDomainResponse.class);
    }

    /**
     *This API is used to suspend the acceleration service for a domain name.
Note: after the acceleration service has been suspended, requests to the cache node will return a 404 error. In order to avoid impact to your business, please move the domain name to another service before suspending the acceleration service.
     * @param req StopCdnDomainRequest
     * @return StopCdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StopCdnDomainResponse StopCdnDomain(StopCdnDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCdnDomain", StopCdnDomainResponse.class);
    }

    /**
     *This API is used to modify the configuration of CDN acceleration domain names.
Note: To update complex configuration items, all attributes of the object must be specified, or the default values are used. We recommend calling the querying API to get attributes before modifying and passing them to this API.
The input parameters of this API are not reported to CloudAudit as it may contain sensitive data, such as keys and secrets.
     * @param req UpdateDomainConfigRequest
     * @return UpdateDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDomainConfigResponse UpdateDomainConfig(UpdateDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDomainConfig", UpdateDomainConfigResponse.class);
    }

    /**
     *This API is used to modify the billing mode of an account. At present, the billing mode of accounts on a monthly billing cycle and sub-accounts cannot be modified.
     * @param req UpdatePayTypeRequest
     * @return UpdatePayTypeResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePayTypeResponse UpdatePayType(UpdatePayTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePayType", UpdatePayTypeResponse.class);
    }

    /**
     *This API is used to modify security configurations of SCDN acceleration domain names.
     * @param req UpdateScdnDomainRequest
     * @return UpdateScdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public UpdateScdnDomainResponse UpdateScdnDomain(UpdateScdnDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateScdnDomain", UpdateScdnDomainResponse.class);
    }

}
