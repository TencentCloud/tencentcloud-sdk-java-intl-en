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
package com.tencentcloudapi.intlpartnersmgt.v20220928;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.intlpartnersmgt.v20220928.models.*;

public class IntlpartnersmgtClient extends AbstractClient{
    private static String endpoint = "intlpartnersmgt.tencentcloudapi.com";
    private static String service = "intlpartnersmgt";
    private static String version = "2022-09-28";
    
    public IntlpartnersmgtClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IntlpartnersmgtClient(Credential credential, String region, ClientProfile profile) {
        super(IntlpartnersmgtClient.endpoint, IntlpartnersmgtClient.version, credential, region, profile);
    }

    /**
     *This API is used for a partner to set credit for a customer, such as increasing or lowering the credit and setting it to 0.
1. The credit is valid permanently and will not be zeroed regularly.
2. The customer's service will be suspended when its available credit is set to 0, so caution should be exercised with this operation.
3. To prevent the customer from making new purchases without affecting their use of previously purchased products, the partner can set their available credit to 0 after obtaining the non-stop feature privilege from the channel manager.
4. The set credit is an increment of the current available credit and cannot exceed the remaining allocable credit. Setting the credit to a negative value indicates that it will be repossessed. The available credit can be set to 0 at the minimum.
     * @param req AllocateCustomerCreditRequest
     * @return AllocateCustomerCreditResponse
     * @throws TencentCloudSDKException
     */
    public AllocateCustomerCreditResponse AllocateCustomerCredit(AllocateCustomerCreditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateCustomerCreditResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AllocateCustomerCredit", AllocateCustomerCreditResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a Tencent Cloud account on the partner platform for a customer. After registration, the customer will be automatically bound to the partner account.

Notes:<br>
1. The partner should verify the entered email address and mobile number for creating a Tencent Cloud account.<br>
2. The customer needs to complete personal information after the first login.
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAccount", CreateAccountResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the customer bill details.
     * @param req DescribeBillDetailRequest
     * @return DescribeBillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDetailResponse DescribeBillDetail(DescribeBillDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillDetail", DescribeBillDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the total amount of customer bills by payment mode.
     * @param req DescribeBillSummaryByPayModeRequest
     * @return DescribeBillSummaryByPayModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByPayModeResponse DescribeBillSummaryByPayMode(DescribeBillSummaryByPayModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByPayModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillSummaryByPayMode", DescribeBillSummaryByPayModeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the total amount of customer bills by product.
     * @param req DescribeBillSummaryByProductRequest
     * @return DescribeBillSummaryByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProductResponse DescribeBillSummaryByProduct(DescribeBillSummaryByProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByProductResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillSummaryByProduct", DescribeBillSummaryByProductResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the total amount of customer bills by region.
     * @param req DescribeBillSummaryByRegionRequest
     * @return DescribeBillSummaryByRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByRegionResponse DescribeBillSummaryByRegion(DescribeBillSummaryByRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByRegionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillSummaryByRegion", DescribeBillSummaryByRegionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the customer bill details.
     * @param req DescribeCustomerBillDetailRequest
     * @return DescribeCustomerBillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerBillDetailResponse DescribeCustomerBillDetail(DescribeCustomerBillDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerBillDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCustomerBillDetail", DescribeCustomerBillDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the total amount of customer bills.
     * @param req DescribeCustomerBillSummaryRequest
     * @return DescribeCustomerBillSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerBillSummaryResponse DescribeCustomerBillSummary(DescribeCustomerBillSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerBillSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCustomerBillSummary", DescribeCustomerBillSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the customer information.
     * @param req DescribeCustomerInfoRequest
     * @return DescribeCustomerInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerInfoResponse DescribeCustomerInfo(DescribeCustomerInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCustomerInfo", DescribeCustomerInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of customer UINs.
     * @param req DescribeCustomerUinRequest
     * @return DescribeCustomerUinResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerUinResponse DescribeCustomerUin(DescribeCustomerUinRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerUinResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCustomerUin", DescribeCustomerUinResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain country/region codes.
     * @param req GetCountryCodesRequest
     * @return GetCountryCodesResponse
     * @throws TencentCloudSDKException
     */
    public GetCountryCodesResponse GetCountryCodes(GetCountryCodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCountryCodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetCountryCodes", GetCountryCodesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the account verification status.
     * @param req QueryAccountVerificationStatusRequest
     * @return QueryAccountVerificationStatusResponse
     * @throws TencentCloudSDKException
     */
    public QueryAccountVerificationStatusResponse QueryAccountVerificationStatus(QueryAccountVerificationStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAccountVerificationStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryAccountVerificationStatus", QueryAccountVerificationStatusResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query all the credit allocation records of a single customer.
     * @param req QueryCreditAllocationHistoryRequest
     * @return QueryCreditAllocationHistoryResponse
     * @throws TencentCloudSDKException
     */
    public QueryCreditAllocationHistoryResponse QueryCreditAllocationHistory(QueryCreditAllocationHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCreditAllocationHistoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryCreditAllocationHistory", QueryCreditAllocationHistoryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the credit of users in the list.
     * @param req QueryCreditByUinListRequest
     * @return QueryCreditByUinListResponse
     * @throws TencentCloudSDKException
     */
    public QueryCreditByUinListResponse QueryCreditByUinList(QueryCreditByUinListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCreditByUinListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryCreditByUinList", QueryCreditByUinListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query customer credits.
     * @param req QueryCreditQuotaRequest
     * @return QueryCreditQuotaResponse
     * @throws TencentCloudSDKException
     */
    public QueryCreditQuotaResponse QueryCreditQuota(QueryCreditQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCreditQuotaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryCreditQuota", QueryCreditQuotaResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used for a partner to the credits and basic information of cutomers.
     * @param req QueryCustomersCreditRequest
     * @return QueryCustomersCreditResponse
     * @throws TencentCloudSDKException
     */
    public QueryCustomersCreditResponse QueryCustomersCredit(QueryCustomersCreditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryCustomersCreditResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryCustomersCredit", QueryCustomersCreditResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the credits of direct customers.
     * @param req QueryDirectCustomersCreditRequest
     * @return QueryDirectCustomersCreditResponse
     * @throws TencentCloudSDKException
     */
    public QueryDirectCustomersCreditResponse QueryDirectCustomersCredit(QueryDirectCustomersCreditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryDirectCustomersCreditResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryDirectCustomersCredit", QueryDirectCustomersCreditResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used for a partner to query its own total credit, available credit, and used credit in USD.
     * @param req QueryPartnerCreditRequest
     * @return QueryPartnerCreditResponse
     * @throws TencentCloudSDKException
     */
    public QueryPartnerCreditResponse QueryPartnerCredit(QueryPartnerCreditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryPartnerCreditResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryPartnerCredit", QueryPartnerCreditResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the voucher quota based on the customer UIN.
     * @param req QueryVoucherAmountByUinRequest
     * @return QueryVoucherAmountByUinResponse
     * @throws TencentCloudSDKException
     */
    public QueryVoucherAmountByUinResponse QueryVoucherAmountByUin(QueryVoucherAmountByUinRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryVoucherAmountByUinResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryVoucherAmountByUin", QueryVoucherAmountByUinResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the voucher list based on the customer UIN.
     * @param req QueryVoucherListByUinRequest
     * @return QueryVoucherListByUinResponse
     * @throws TencentCloudSDKException
     */
    public QueryVoucherListByUinResponse QueryVoucherListByUin(QueryVoucherListByUinRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryVoucherListByUinResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryVoucherListByUin", QueryVoucherListByUinResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the voucher quota pool.
     * @param req QueryVoucherPoolRequest
     * @return QueryVoucherPoolResponse
     * @throws TencentCloudSDKException
     */
    public QueryVoucherPoolResponse QueryVoucherPool(QueryVoucherPoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryVoucherPoolResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "QueryVoucherPool", QueryVoucherPoolResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
