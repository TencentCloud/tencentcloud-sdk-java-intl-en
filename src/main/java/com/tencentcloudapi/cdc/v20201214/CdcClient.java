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
package com.tencentcloudapi.cdc.v20201214;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdc.v20201214.models.*;

public class CdcClient extends AbstractClient{
    private static String endpoint = "cdc.tencentcloudapi.com";
    private static String service = "cdc";
    private static String version = "2020-12-14";
    
    public CdcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdcClient(Credential credential, String region, ClientProfile profile) {
        super(CdcClient.endpoint, CdcClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a CDC.
     * @param req CreateDedicatedClusterRequest
     * @return CreateDedicatedClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateDedicatedClusterResponse CreateDedicatedCluster(CreateDedicatedClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDedicatedCluster", CreateDedicatedClusterResponse.class);
    }

    /**
     *This API is used to create a CDC order.
     * @param req CreateDedicatedClusterOrderRequest
     * @return CreateDedicatedClusterOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateDedicatedClusterOrderResponse CreateDedicatedClusterOrder(CreateDedicatedClusterOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDedicatedClusterOrder", CreateDedicatedClusterOrderResponse.class);
    }

    /**
     *This API is used to create a site.
     * @param req CreateSiteRequest
     * @return CreateSiteResponse
     * @throws TencentCloudSDKException
     */
    public CreateSiteResponse CreateSite(CreateSiteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSite", CreateSiteResponse.class);
    }

    /**
     *This API is used to delete a CDC.
     * @param req DeleteDedicatedClustersRequest
     * @return DeleteDedicatedClustersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDedicatedClustersResponse DeleteDedicatedClusters(DeleteDedicatedClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDedicatedClusters", DeleteDedicatedClustersResponse.class);
    }

    /**
     *This API is used to delete a site.
     * @param req DeleteSitesRequest
     * @return DeleteSitesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSitesResponse DeleteSites(DeleteSitesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSites", DeleteSitesResponse.class);
    }

    /**
     *This API is used to query the Cloud Object Storage (COS) capacity of the CDC.
     * @param req DescribeDedicatedClusterCosCapacityRequest
     * @return DescribeDedicatedClusterCosCapacityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterCosCapacityResponse DescribeDedicatedClusterCosCapacity(DescribeDedicatedClusterCosCapacityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterCosCapacity", DescribeDedicatedClusterCosCapacityResponse.class);
    }

    /**
     *This API is used to query the statistic information of the host in the CDC.
     * @param req DescribeDedicatedClusterHostStatisticsRequest
     * @return DescribeDedicatedClusterHostStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterHostStatisticsResponse DescribeDedicatedClusterHostStatistics(DescribeDedicatedClusterHostStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterHostStatistics", DescribeDedicatedClusterHostStatisticsResponse.class);
    }

    /**
     *This API is used to query host information of the CDC
     * @param req DescribeDedicatedClusterHostsRequest
     * @return DescribeDedicatedClusterHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterHostsResponse DescribeDedicatedClusterHosts(DescribeDedicatedClusterHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterHosts", DescribeDedicatedClusterHostsResponse.class);
    }

    /**
     *This API is used to query instance types supported by the CDC.
     * @param req DescribeDedicatedClusterInstanceTypesRequest
     * @return DescribeDedicatedClusterInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterInstanceTypesResponse DescribeDedicatedClusterInstanceTypes(DescribeDedicatedClusterInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterInstanceTypes", DescribeDedicatedClusterInstanceTypesResponse.class);
    }

    /**
     *This API is used to query the list of CDC orders.
     * @param req DescribeDedicatedClusterOrdersRequest
     * @return DescribeDedicatedClusterOrdersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterOrdersResponse DescribeDedicatedClusterOrders(DescribeDedicatedClusterOrdersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterOrders", DescribeDedicatedClusterOrdersResponse.class);
    }

    /**
     *This API is used to query the overview of the CDC
     * @param req DescribeDedicatedClusterOverviewRequest
     * @return DescribeDedicatedClusterOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterOverviewResponse DescribeDedicatedClusterOverview(DescribeDedicatedClusterOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterOverview", DescribeDedicatedClusterOverviewResponse.class);
    }

    /**
     *This API is used to query the configuration list of the CDC.
     * @param req DescribeDedicatedClusterTypesRequest
     * @return DescribeDedicatedClusterTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClusterTypesResponse DescribeDedicatedClusterTypes(DescribeDedicatedClusterTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusterTypes", DescribeDedicatedClusterTypesResponse.class);
    }

    /**
     *This API is used to query the CDC list.
     * @param req DescribeDedicatedClustersRequest
     * @return DescribeDedicatedClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedClustersResponse DescribeDedicatedClusters(DescribeDedicatedClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedClusters", DescribeDedicatedClustersResponse.class);
    }

    /**
     *This API is used to query the list of AZs supported by the CDC.
     * @param req DescribeDedicatedSupportedZonesRequest
     * @return DescribeDedicatedSupportedZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDedicatedSupportedZonesResponse DescribeDedicatedSupportedZones(DescribeDedicatedSupportedZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDedicatedSupportedZones", DescribeDedicatedSupportedZonesResponse.class);
    }

    /**
     *This API is used to query the site list.
     * @param req DescribeSitesRequest
     * @return DescribeSitesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSitesResponse DescribeSites(DescribeSitesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSites", DescribeSitesResponse.class);
    }

    /**
     *This API is used to query site details.
     * @param req DescribeSitesDetailRequest
     * @return DescribeSitesDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSitesDetailResponse DescribeSitesDetail(DescribeSitesDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSitesDetail", DescribeSitesDetailResponse.class);
    }

    /**
     *This API is used to modify the CDC information.
     * @param req ModifyDedicatedClusterInfoRequest
     * @return ModifyDedicatedClusterInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDedicatedClusterInfoResponse ModifyDedicatedClusterInfo(ModifyDedicatedClusterInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDedicatedClusterInfo", ModifyDedicatedClusterInfoResponse.class);
    }

    /**
     *This API is used to modify the status of large and small orders.
     * @param req ModifyOrderStatusRequest
     * @return ModifyOrderStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrderStatusResponse ModifyOrderStatus(ModifyOrderStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOrderStatus", ModifyOrderStatusResponse.class);
    }

    /**
     *This API is used to modify the information about devices in the equipment room.
     * @param req ModifySiteDeviceInfoRequest
     * @return ModifySiteDeviceInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySiteDeviceInfoResponse ModifySiteDeviceInfo(ModifySiteDeviceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySiteDeviceInfo", ModifySiteDeviceInfoResponse.class);
    }

    /**
     *This API is used to modify the equipment room information.
     * @param req ModifySiteInfoRequest
     * @return ModifySiteInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySiteInfoResponse ModifySiteInfo(ModifySiteInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySiteInfo", ModifySiteInfoResponse.class);
    }

}
