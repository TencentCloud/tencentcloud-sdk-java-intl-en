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
package com.tencentcloudapi.billing.v20180709;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.billing.v20180709.models.*;

public class BillingClient extends AbstractClient{
    private static String endpoint = "billing.intl.tencentcloudapi.com";
    private static String service = "billing";
    private static String version = "2018-07-09";
    
    public BillingClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BillingClient(Credential credential, String region, ClientProfile profile) {
        super(BillingClient.endpoint, BillingClient.version, credential, region, profile);
    }

    /**
     *This API is used to batch set cost allocation tags.
     * @param req CreateAllocationTagRequest
     * @return CreateAllocationTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateAllocationTagResponse CreateAllocationTag(CreateAllocationTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAllocationTag", CreateAllocationTagResponse.class);
    }

    /**
     *u200cThis API is used to batch cancel cost allocation tags.
     * @param req DeleteAllocationTagRequest
     * @return DeleteAllocationTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllocationTagResponse DeleteAllocationTag(DeleteAllocationTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAllocationTag", DeleteAllocationTagResponse.class);
    }

    /**
     *This API is used to check the Tencent Cloud account balance.
     * @param req DescribeAccountBalanceRequest
     * @return DescribeAccountBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountBalanceResponse DescribeAccountBalance(DescribeAccountBalanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountBalance", DescribeAccountBalanceResponse.class);
    }

    /**
     *This API is used to check whether the current UIN has any adjustment, enabling customers to proactively obtain the adjustment status faster.
     * @param req DescribeBillAdjustInfoRequest
     * @return DescribeBillAdjustInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillAdjustInfoResponse DescribeBillAdjustInfo(DescribeBillAdjustInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillAdjustInfo", DescribeBillAdjustInfoResponse.class);
    }

    /**
     *u200cThis API is used to get bill details.
Note:
1. The API request may fail due to network instability or other exceptions. In this case, we recommend you manually retry the request when the API request fails.
2.If the volume of your bill data is high (for example, if over 200 thousand bill entries are generated for a month), bill data query via APIs may be slow. We recommend you enable bill storage so that you can obtain bill files from COS buckets for analysis. For details, see [Saving Bills to COS](https://intl.cloud.tencent.com/document/product/555/61275?from_cn_redirect=1).
     * @param req DescribeBillDetailRequest
     * @return DescribeBillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDetailResponse DescribeBillDetail(DescribeBillDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillDetail", DescribeBillDetailResponse.class);
    }

    /**
     *This API is used to get pay-on-behalf bills of the admin account (bill details).
Note: The API request may fail due to network instability or other exceptions. In this case, we recommend you manually retry the request when the API request fails.
     * @param req DescribeBillDetailForOrganizationRequest
     * @return DescribeBillDetailForOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDetailForOrganizationResponse DescribeBillDetailForOrganization(DescribeBillDetailForOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillDetailForOrganization", DescribeBillDetailForOrganizationResponse.class);
    }

    /**
     *This API is used to get bill download URLs for L0, L1, L2, and L3 bills and bill packs.
     * @param req DescribeBillDownloadUrlRequest
     * @return DescribeBillDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDownloadUrlResponse DescribeBillDownloadUrl(DescribeBillDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillDownloadUrl", DescribeBillDownloadUrlResponse.class);
    }

    /**
     *This API is used to get the bill summarized by instance.
     * @param req DescribeBillResourceSummaryRequest
     * @return DescribeBillResourceSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillResourceSummaryResponse DescribeBillResourceSummary(DescribeBillResourceSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillResourceSummary", DescribeBillResourceSummaryResponse.class);
    }

    /**
     *This API is used to get pay-on-behalf bills of the admin account (bills by instance).
     * @param req DescribeBillResourceSummaryForOrganizationRequest
     * @return DescribeBillResourceSummaryForOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillResourceSummaryForOrganizationResponse DescribeBillResourceSummaryForOrganization(DescribeBillResourceSummaryForOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillResourceSummaryForOrganization", DescribeBillResourceSummaryForOrganizationResponse.class);
    }

    /**
     *This API is used to get bill details by product, project, region, billing mode, and tag by passing in parameters.
     * @param req DescribeBillSummaryRequest
     * @return DescribeBillSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryResponse DescribeBillSummary(DescribeBillSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummary", DescribeBillSummaryResponse.class);
    }

    /**
     *This API is used to get the bill summarized by billing mode.
     * @param req DescribeBillSummaryByPayModeRequest
     * @return DescribeBillSummaryByPayModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByPayModeResponse DescribeBillSummaryByPayMode(DescribeBillSummaryByPayModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByPayMode", DescribeBillSummaryByPayModeResponse.class);
    }

    /**
     *Gets the bill summarized according to product
     * @param req DescribeBillSummaryByProductRequest
     * @return DescribeBillSummaryByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProductResponse DescribeBillSummaryByProduct(DescribeBillSummaryByProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByProduct", DescribeBillSummaryByProductResponse.class);
    }

    /**
     *Gets the bill summarized according to project
     * @param req DescribeBillSummaryByProjectRequest
     * @return DescribeBillSummaryByProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProjectResponse DescribeBillSummaryByProject(DescribeBillSummaryByProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByProject", DescribeBillSummaryByProjectResponse.class);
    }

    /**
     *Gets the bill summarized according to region
     * @param req DescribeBillSummaryByRegionRequest
     * @return DescribeBillSummaryByRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByRegionResponse DescribeBillSummaryByRegion(DescribeBillSummaryByRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByRegion", DescribeBillSummaryByRegionResponse.class);
    }

    /**
     *This API is used to get the cost distribution over different tags.
     * @param req DescribeBillSummaryByTagRequest
     * @return DescribeBillSummaryByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByTagResponse DescribeBillSummaryByTag(DescribeBillSummaryByTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByTag", DescribeBillSummaryByTagResponse.class);
    }

    /**
     *This API is used to get bills summarized by product, project, region, billing mode, and tag by passing in parameters.
     * @param req DescribeBillSummaryForOrganizationRequest
     * @return DescribeBillSummaryForOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryForOrganizationResponse DescribeBillSummaryForOrganization(DescribeBillSummaryForOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryForOrganization", DescribeBillSummaryForOrganizationResponse.class);
    }

    /**
     *This API is used to query consumption details.
     * @param req DescribeCostDetailRequest
     * @return DescribeCostDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostDetailResponse DescribeCostDetail(DescribeCostDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostDetail", DescribeCostDetailResponse.class);
    }

    /**
     *This API is used to view cost analysis details.
     * @param req DescribeCostExplorerSummaryRequest
     * @return DescribeCostExplorerSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostExplorerSummaryResponse DescribeCostExplorerSummary(DescribeCostExplorerSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostExplorerSummary", DescribeCostExplorerSummaryResponse.class);
    }

    /**
     *This API is used to obtain consumption details summarized by product.
     * @param req DescribeCostSummaryByProductRequest
     * @return DescribeCostSummaryByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByProductResponse DescribeCostSummaryByProduct(DescribeCostSummaryByProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostSummaryByProduct", DescribeCostSummaryByProductResponse.class);
    }

    /**
     *This API is used to obtain consumption details summarized by project.
     * @param req DescribeCostSummaryByProjectRequest
     * @return DescribeCostSummaryByProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByProjectResponse DescribeCostSummaryByProject(DescribeCostSummaryByProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostSummaryByProject", DescribeCostSummaryByProjectResponse.class);
    }

    /**
     *This API is used to obtain consumption details summarized by region.
     * @param req DescribeCostSummaryByRegionRequest
     * @return DescribeCostSummaryByRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByRegionResponse DescribeCostSummaryByRegion(DescribeCostSummaryByRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostSummaryByRegion", DescribeCostSummaryByRegionResponse.class);
    }

    /**
     *This API is used to obtain consumption details summarized by resource.
     * @param req DescribeCostSummaryByResourceRequest
     * @return DescribeCostSummaryByResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCostSummaryByResourceResponse DescribeCostSummaryByResource(DescribeCostSummaryByResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCostSummaryByResource", DescribeCostSummaryByResourceResponse.class);
    }

    /**
     *Querying orders
     * @param req DescribeDealsByCondRequest
     * @return DescribeDealsByCondResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDealsByCondResponse DescribeDealsByCond(DescribeDealsByCondRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDealsByCond", DescribeDealsByCondResponse.class);
    }

    /**
     *This API is used to query COS usage details.
     * @param req DescribeDosageCosDetailByDateRequest
     * @return DescribeDosageCosDetailByDateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDosageCosDetailByDateResponse DescribeDosageCosDetailByDate(DescribeDosageCosDetailByDateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDosageCosDetailByDate", DescribeDosageCosDetailByDateResponse.class);
    }

    /**
     *This API is used to get cost allocation tags.
     * @param req DescribeTagListRequest
     * @return DescribeTagListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagListResponse DescribeTagList(DescribeTagListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagList", DescribeTagListResponse.class);
    }

    /**
     *This API is used to query vouchers.
     * @param req DescribeVoucherInfoRequest
     * @return DescribeVoucherInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoucherInfoResponse DescribeVoucherInfo(DescribeVoucherInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVoucherInfo", DescribeVoucherInfoResponse.class);
    }

    /**
     *This API is used to query voucher usage details.
     * @param req DescribeVoucherUsageDetailsRequest
     * @return DescribeVoucherUsageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoucherUsageDetailsResponse DescribeVoucherUsageDetails(DescribeVoucherUsageDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVoucherUsageDetails", DescribeVoucherUsageDetailsResponse.class);
    }

}
