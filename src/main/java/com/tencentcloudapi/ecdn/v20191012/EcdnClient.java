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
    private static String endpoint = "ecdn.intl.tencentcloudapi.com";
    private static String service = "ecdn";
    private static String version = "2019-10-12";
    
    public EcdnClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EcdnClient(Credential credential, String region, ClientProfile profile) {
        super(EcdnClient.endpoint, EcdnClient.version, credential, region, profile);
    }

    /**
     *This API is used to create an acceleration domain name.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/api/228/41123?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req AddEcdnDomainRequest
     * @return AddEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public AddEcdnDomainResponse AddEcdnDomain(AddEcdnDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddEcdnDomain", AddEcdnDomainResponse.class);
    }

    /**
     *This API is used to delete a specified acceleration domain name. The acceleration domain name to be deleted must be in disabled status.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/api/570/42471?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req DeleteEcdnDomainRequest
     * @return DeleteEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEcdnDomainResponse DeleteEcdnDomain(DeleteEcdnDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEcdnDomain", DeleteEcdnDomainResponse.class);
    }

    /**
     *This API is used to query the basic information of a CDN domain name, including the project ID, status, business type, creation time, update time, etc.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/api/228/41118?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomains", DescribeDomainsResponse.class);
    }

    /**
     *This API is used to query the detailed configuration information of a CDN acceleration domain name.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/api/228/41117?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req DescribeDomainsConfigRequest
     * @return DescribeDomainsConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsConfigResponse DescribeDomainsConfig(DescribeDomainsConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainsConfig", DescribeDomainsConfigResponse.class);
    }

    /**
     *This API is used to query the access log download link of a domain name.
     * @param req DescribeEcdnDomainLogsRequest
     * @return DescribeEcdnDomainLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEcdnDomainLogsResponse DescribeEcdnDomainLogs(DescribeEcdnDomainLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEcdnDomainLogs", DescribeEcdnDomainLogsResponse.class);
    }

    /**
     *This API is used to query the statistical metrics of domain name access within a specified time period.
     * @param req DescribeEcdnDomainStatisticsRequest
     * @return DescribeEcdnDomainStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEcdnDomainStatisticsResponse DescribeEcdnDomainStatistics(DescribeEcdnDomainStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEcdnDomainStatistics", DescribeEcdnDomainStatisticsResponse.class);
    }

    /**
     *This API is used to query ECDN real-time access monitoring data and supports the following metrics:

+ Traffic (in bytes)
+ Bandwidth (in bps)
+ Number of requests
+ Number of 2xx status codes and details of status codes starting with 2
+ Number of 3xx status codes and details of status codes starting with 3
+ Number of 4xx status codes and details of status codes starting with 4
+ Number of 5xx status codes and details of status codes starting with 5
     * @param req DescribeEcdnStatisticsRequest
     * @return DescribeEcdnStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEcdnStatisticsResponse DescribeEcdnStatistics(DescribeEcdnStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEcdnStatistics", DescribeEcdnStatisticsResponse.class);
    }

    /**
     *This API is used to query ECDN node IPs. This API is only available to beta users. Please submit a ticket to use it.

If you need to add the node IPs to your origin allowlist, keep querying the updating the IPs regularly to ensure the success of origin forwarding. 
     * @param req DescribeIpStatusRequest
     * @return DescribeIpStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpStatusResponse DescribeIpStatus(DescribeIpStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpStatus", DescribeIpStatusResponse.class);
    }

    /**
     *This API is used to query the usage quota of the purge API.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/api/228/41956?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req DescribePurgeQuotaRequest
     * @return DescribePurgeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeQuotaResponse DescribePurgeQuota(DescribePurgeQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePurgeQuota", DescribePurgeQuotaResponse.class);
    }

    /**
     *This API is used to query the submission record and progress of purge tasks.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/api/228/37873?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePurgeTasks", DescribePurgeTasksResponse.class);
    }

    /**
     *This API is used to purge cache directories in batches. One purge task ID will be returned for each submission.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/api/570/42475?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req PurgePathCacheRequest
     * @return PurgePathCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgePathCacheResponse PurgePathCache(PurgePathCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PurgePathCache", PurgePathCacheResponse.class);
    }

    /**
     *This API is used to batch purge URLs. One purge task ID will be returned for each submission.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/api/228/37870?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req PurgeUrlsCacheRequest
     * @return PurgeUrlsCacheResponse
     * @throws TencentCloudSDKException
     */
    public PurgeUrlsCacheResponse PurgeUrlsCache(PurgeUrlsCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PurgeUrlsCache", PurgeUrlsCacheResponse.class);
    }

    /**
     *This API is used to enable an acceleration domain name. The domain name to be enabled must be in deactivated status.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/product/228/41121?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req StartEcdnDomainRequest
     * @return StartEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StartEcdnDomainResponse StartEcdnDomain(StartEcdnDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartEcdnDomain", StartEcdnDomainResponse.class);
    }

    /**
     *This API is used to disable an acceleration domain name. The domain name to be disabled must be in enabled or deploying status.

>? If you have migrated your ECDN service to CDN, you can use the <a href="https://intl.cloud.tencent.com/document/product/228/41120?from_cn_redirect=1">corresponding CDN API</a>.
     * @param req StopEcdnDomainRequest
     * @return StopEcdnDomainResponse
     * @throws TencentCloudSDKException
     */
    public StopEcdnDomainResponse StopEcdnDomain(StopEcdnDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopEcdnDomain", StopEcdnDomainResponse.class);
    }

    /**
     *This API is used to update the configuration information of an ECDN acceleration domain name.
Note: if you need to update complex configuration items, you must pass all the attributes of the entire object. The default value will be used for attributes that are not passed. We recommend calling the querying API to obtain the configuration attributes first. You can then modify and pass the attributes to the API. The certificate and key fields do not need to be passed for HTTPS configuration.

>?  If your application has been migrated to Tencent Cloud CDN, you can use <a href="https://intl.cloud.tencent.com/document/product/228/41116?from_cn_redirect=1">CDN APIs</a>.

     * @param req UpdateDomainConfigRequest
     * @return UpdateDomainConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDomainConfigResponse UpdateDomainConfig(UpdateDomainConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDomainConfig", UpdateDomainConfigResponse.class);
    }

}
