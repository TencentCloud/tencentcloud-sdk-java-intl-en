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
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateCustomerCreditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AllocateCustomerCredit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByPayModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummaryByPayMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummaryByProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillSummaryByRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillSummaryByRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomerBillDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomerBillDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomerBillSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomerBillSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<GetCountryCodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCountryCodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCreditAllocationHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCreditAllocationHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCreditByUinListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCreditByUinList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<QueryCustomersCreditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryCustomersCredit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<QueryDirectCustomersCreditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryDirectCustomersCredit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<QueryPartnerCreditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryPartnerCredit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<QueryVoucherAmountByUinResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryVoucherAmountByUin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<QueryVoucherListByUinResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryVoucherListByUin");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        try {
                Type type = new TypeToken<JsonResponseModel<QueryVoucherPoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryVoucherPool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
