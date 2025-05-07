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
    private static String endpoint = "intlpartnersmgt.intl.tencentcloudapi.com";
    private static String service = "intlpartnersmgt";
    private static String version = "2022-09-28";
    
    public IntlpartnersmgtClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IntlpartnersmgtClient(Credential credential, String region, ClientProfile profile) {
        super(IntlpartnersmgtClient.endpoint, IntlpartnersmgtClient.version, credential, region, profile);
    }

    /**
     *This API is used to allocate credit pools to second-level resellers by distributors.
Callable roles: Distributor
     * @param req AllocateCreditPoolRequest
     * @return AllocateCreditPoolResponse
     * @throws TencentCloudSDKException
     */
    public AllocateCreditPoolResponse AllocateCreditPool(AllocateCreditPoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateCreditPool", AllocateCreditPoolResponse.class);
    }

    /**
     *This API is used for a partner to set credit for a customer, such as increasing or lowering the credit and setting it to 0.
1. The credit is valid permanently and will not be zeroed regularly.
2. The customer's service will be suspended when its available credit is set to 0, so caution should be exercised with this operation.
3. To prevent the customer from making new purchases without affecting their use of previously purchased products, the partner can set their available credit to 0 after obtaining the non-stop feature privilege from the channel manager.
4. The set credit is an increment of the current available credit and cannot exceed the remaining allocable credit. Setting the credit to a negative value indicates that it will be repossessed. The available credit can be set to 0 at the minimum.

Callable roles: Distributor, Second-level reseller, Reseller
     * @param req AllocateCustomerCreditRequest
     * @return AllocateCustomerCreditResponse
     * @throws TencentCloudSDKException
     */
    public AllocateCustomerCreditResponse AllocateCustomerCredit(AllocateCustomerCreditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateCustomerCredit", AllocateCustomerCreditResponse.class);
    }

    /**
     *Description: This API is used by resellers to review applications to become sub-customers. Note: This API is used to apply for the allowlist. If needed, please contact your business representative.

Callable roles: Reseller, Distributer, Second-level reseller
     * @param req ApproveClientApplyRequest
     * @return ApproveClientApplyResponse
     * @throws TencentCloudSDKException
     */
    public ApproveClientApplyResponse ApproveClientApply(ApproveClientApplyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApproveClientApply", ApproveClientApplyResponse.class);
    }

    /**
     *This API is used to create Tencent Cloud customer accounts for distributor/second-level resellers.After the account is created, it will be automatically bound to the partner account.Note:
1. Create a Tencent Cloud account. The entered email address and mobile phone number need to be verified by the partner for validity.
2. Customers need to add personal information when logging in for the first time.
3. This interface needs to be applied for allowlist usage. Please contact the channel manager to initiate the application process.

Callable roles: Distributor, Second-level reseller, Reseller
     * @param req CreateAccountRequest
     * @return CreateAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountResponse CreateAccount(CreateAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccount", CreateAccountResponse.class);
    }

    /**
     *This API is used to apply for the allowlist. If needed, please contact your business representative.Directions:
1.This API is used to create an invitation link, which you can send to a specified email address.
2.Customer need to click the invitation link in the email, fill in and submit the required information.
3.You can review the customer's application in customer management  after submission.

Note:This API is used to manually send the invitation link to the customer if the specified email does not receive it.

Callable roles: Distributor, Second-level reseller, Reseller
     * @param req CreateAndSendClientInvitationMailRequest
     * @return CreateAndSendClientInvitationMailResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndSendClientInvitationMailResponse CreateAndSendClientInvitationMail(CreateAndSendClientInvitationMailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndSendClientInvitationMail", CreateAndSendClientInvitationMailResponse.class);
    }

    /**
     *Description: End-customer queries its own bill details.
Callable role: End-customer.
     * @param req DescribeBillDetailRequest
     * @return DescribeBillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDetailResponse DescribeBillDetail(DescribeBillDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillDetail", DescribeBillDetailResponse.class);
    }

    /**
     *Description: This API is used to download billing files and return billing file URLs for sub-customers.
Callable role: Enb-customer.
     * @param req DescribeBillDownloadUrlRequest
     * @return DescribeBillDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDownloadUrlResponse DescribeBillDownloadUrl(DescribeBillDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillDownloadUrl", DescribeBillDownloadUrlResponse.class);
    }

    /**
     *Description: External API for L1 billing of Sub-customer billing center.
Callable role: End-customer.
     * @param req DescribeBillSummaryRequest
     * @return DescribeBillSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryResponse DescribeBillSummary(DescribeBillSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummary", DescribeBillSummaryResponse.class);
    }

    /**
     *This API is used to obtain the total amount of customer bills by payment mode.
Callable roles: Distributor, Second-level reseller, Reseller
     * @param req DescribeBillSummaryByPayModeRequest
     * @return DescribeBillSummaryByPayModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByPayModeResponse DescribeBillSummaryByPayMode(DescribeBillSummaryByPayModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByPayMode", DescribeBillSummaryByPayModeResponse.class);
    }

    /**
     *Description: Obtain the summarized value of sub - account bills by product dimension.
Callable roles: Distributor, Second-level reseller, Reseller
     * @param req DescribeBillSummaryByProductRequest
     * @return DescribeBillSummaryByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProductResponse DescribeBillSummaryByProduct(DescribeBillSummaryByProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByProduct", DescribeBillSummaryByProductResponse.class);
    }

    /**
     *Description: Obtain the summarized value of sub - account bills by region through API.
Callable roles: Distributor, Second-level reseller, Reseller
     * @param req DescribeBillSummaryByRegionRequest
     * @return DescribeBillSummaryByRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByRegionResponse DescribeBillSummaryByRegion(DescribeBillSummaryByRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillSummaryByRegion", DescribeBillSummaryByRegionResponse.class);
    }

    /**
     *This API is used to query the customer bill details by resellers.
Callable roles: Distributor, Second-level reseller, Reseller
     * @param req DescribeCustomerBillDetailRequest
     * @return DescribeCustomerBillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerBillDetailResponse DescribeCustomerBillDetail(DescribeCustomerBillDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomerBillDetail", DescribeCustomerBillDetailResponse.class);
    }

    /**
     *This API is used to get the URL for downloading the customer bill file by reseller. The download conditions are as follows:
1. Detailed bills (billDetail and billDetailPack) can be downloaded starting from June 2022; resource bills (billResource and billResourcePack) can be downloaded starting from November 2023.
2. Bill packages (billDetailPack and billResourcePack) can only be downloaded after billing.
     * @param req DescribeCustomerBillDownloadUrlRequest
     * @return DescribeCustomerBillDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerBillDownloadUrlResponse DescribeCustomerBillDownloadUrl(DescribeCustomerBillDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomerBillDownloadUrl", DescribeCustomerBillDownloadUrlResponse.class);
    }

    /**
     *This API is used to query the total amount of customer bills.
Callable roles: Distributor, Second-level reseller, Reseller
     * @param req DescribeCustomerBillSummaryRequest
     * @return DescribeCustomerBillSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerBillSummaryResponse DescribeCustomerBillSummary(DescribeCustomerBillSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomerBillSummary", DescribeCustomerBillSummaryResponse.class);
    }

    /**
     *This API is used to query sub-customer information.
Invocation roles: reseller, first-level distributor.
     * @param req DescribeCustomerInfoRequest
     * @return DescribeCustomerInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerInfoResponse DescribeCustomerInfo(DescribeCustomerInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomerInfo", DescribeCustomerInfoResponse.class);
    }

    /**
     *This API is used to query the list of customer UINs.
     * @param req DescribeCustomerUinRequest
     * @return DescribeCustomerUinResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerUinResponse DescribeCustomerUin(DescribeCustomerUinRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomerUin", DescribeCustomerUinResponse.class);
    }

    /**
     *This API is used to download the commission bill file by resellers/agents. The file URL is returned.
Resellers/Agents can call this API.
     * @param req DescribeRebateDownloadUrlRequest
     * @return DescribeRebateDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRebateDownloadUrlResponse DescribeRebateDownloadUrl(DescribeRebateDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRebateDownloadUrl", DescribeRebateDownloadUrlResponse.class);
    }

    /**
     *Forced Service Suspension settings and cancellation can be used only after the reseller is whitelisted.

Callable roles: Distributor, Second-level reseller, Reseller
     * @param req ForceQNRequest
     * @return ForceQNResponse
     * @throws TencentCloudSDKException
     */
    public ForceQNResponse ForceQN(ForceQNRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForceQN", ForceQNResponse.class);
    }

    /**
     *This API is used to obtain country/region codes.
     * @param req GetCountryCodesRequest
     * @return GetCountryCodesResponse
     * @throws TencentCloudSDKException
     */
    public GetCountryCodesResponse GetCountryCodes(GetCountryCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCountryCodes", GetCountryCodesResponse.class);
    }

    /**
     *This API is used to query industry information, including layer-1 industry and layer-2 industry.

Callable roles: Distributor, Second-level reseller, Reseller,End-customer
     * @param req GetTradeConfigListRequest
     * @return GetTradeConfigListResponse
     * @throws TencentCloudSDKException
     */
    public GetTradeConfigListResponse GetTradeConfigList(GetTradeConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTradeConfigList", GetTradeConfigListResponse.class);
    }

    /**
     *This API is used to modify customer remarks.

Callable roles: Distributor, Second-level reseller, Reseller
     * @param req ModifyClientRemarkRequest
     * @return ModifyClientRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClientRemarkResponse ModifyClientRemark(ModifyClientRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClientRemark", ModifyClientRemarkResponse.class);
    }

    /**
     *This API is used to query the account verification status.
Callable roles: Distributor, Reseller
     * @param req QueryAccountVerificationStatusRequest
     * @return QueryAccountVerificationStatusResponse
     * @throws TencentCloudSDKException
     */
    public QueryAccountVerificationStatusResponse QueryAccountVerificationStatus(QueryAccountVerificationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryAccountVerificationStatus", QueryAccountVerificationStatusResponse.class);
    }

    /**
     *This API is used to query all the credit allocation records of a single customer.
Callable roles: Distributor, Second-level reseller, Reseller
     * @param req QueryCreditAllocationHistoryRequest
     * @return QueryCreditAllocationHistoryResponse
     * @throws TencentCloudSDKException
     */
    public QueryCreditAllocationHistoryResponse QueryCreditAllocationHistory(QueryCreditAllocationHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCreditAllocationHistory", QueryCreditAllocationHistoryResponse.class);
    }

    /**
     *This API is used to query the credit of users in the list.
Callable roles: Distributor, Second-level reseller, Reseller
     * @param req QueryCreditByUinListRequest
     * @return QueryCreditByUinListResponse
     * @throws TencentCloudSDKException
     */
    public QueryCreditByUinListResponse QueryCreditByUinList(QueryCreditByUinListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCreditByUinList", QueryCreditByUinListResponse.class);
    }

    /**
     *Description: This API is used for a sub-customer to real-time query its own total credit and remaining credit in USD.

Callable roles: Sub-customer
     * @param req QueryCustomerBillingQuotaRequest
     * @return QueryCustomerBillingQuotaResponse
     * @throws TencentCloudSDKException
     */
    public QueryCustomerBillingQuotaResponse QueryCustomerBillingQuota(QueryCustomerBillingQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCustomerBillingQuota", QueryCustomerBillingQuotaResponse.class);
    }

    /**
     *This API is used for a partner to the credits and basic information of cutomers.

Callable roles: Distributor, Second-level reseller, Reseller
     * @param req QueryCustomersCreditRequest
     * @return QueryCustomersCreditResponse
     * @throws TencentCloudSDKException
     */
    public QueryCustomersCreditResponse QueryCustomersCredit(QueryCustomersCreditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryCustomersCredit", QueryCustomersCreditResponse.class);
    }

    /**
     *This API is used to query the credits of direct customers.
Callable roles: Distributor, Second-level reseller, Reseller
     * @param req QueryDirectCustomersCreditRequest
     * @return QueryDirectCustomersCreditResponse
     * @throws TencentCloudSDKException
     */
    public QueryDirectCustomersCreditResponse QueryDirectCustomersCredit(QueryDirectCustomersCreditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryDirectCustomersCredit", QueryDirectCustomersCreditResponse.class);
    }

    /**
     *Query usage information of invitation link. Once created, the data will only be retained for 60 days, and the system will automatically delete the invitation link after 60 days.
Invokable role types: Distributor, Second-level reseller, Reseller.
     * @param req QueryInvitationInfoRequest
     * @return QueryInvitationInfoResponse
     * @throws TencentCloudSDKException
     */
    public QueryInvitationInfoResponse QueryInvitationInfo(QueryInvitationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryInvitationInfo", QueryInvitationInfoResponse.class);
    }

    /**
     *This API is used for a partner to query its own total credit, available credit, and used credit in USD.

Callable roles: Distributor, Second-level reseller, Reseller
     * @param req QueryPartnerCreditRequest
     * @return QueryPartnerCreditResponse
     * @throws TencentCloudSDKException
     */
    public QueryPartnerCreditResponse QueryPartnerCredit(QueryPartnerCreditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryPartnerCredit", QueryPartnerCreditResponse.class);
    }

    /**
     *Description: This API is used by resellers to query the list of sub-customers pending review. Note: This API is used to apply for the allowlist. If needed, please contact your business representative.

Callable roles: Reseller, Distributer, Second-level reseller
     * @param req QueryPendingClientsV2Request
     * @return QueryPendingClientsV2Response
     * @throws TencentCloudSDKException
     */
    public QueryPendingClientsV2Response QueryPendingClientsV2(QueryPendingClientsV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryPendingClientsV2", QueryPendingClientsV2Response.class);
    }

    /**
     *This API is used to query the product list information within the specified policy range. To call this API, contact your business manager to apply for adding it to the allowlist.
Callable roles: Distributor, Second-level reseller, Reseller
     * @param req QueryPolicyProductListByCodeRequest
     * @return QueryPolicyProductListByCodeResponse
     * @throws TencentCloudSDKException
     */
    public QueryPolicyProductListByCodeResponse QueryPolicyProductListByCode(QueryPolicyProductListByCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryPolicyProductListByCode", QueryPolicyProductListByCodeResponse.class);
    }

    /**
     *This API is used to query information of second-level resellers.
Invocation Role:Distributor.
     * @param req QuerySubAgentsDetailV2Request
     * @return QuerySubAgentsDetailV2Response
     * @throws TencentCloudSDKException
     */
    public QuerySubAgentsDetailV2Response QuerySubAgentsDetailV2(QuerySubAgentsDetailV2Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QuerySubAgentsDetailV2", QuerySubAgentsDetailV2Response.class);
    }

    /**
     *This API is used to query the indirect sub-customers of a distributor.
Invokable role type: Distributor
     * @param req QueryT1IndirectCustomersDetailRequest
     * @return QueryT1IndirectCustomersDetailResponse
     * @throws TencentCloudSDKException
     */
    public QueryT1IndirectCustomersDetailResponse QueryT1IndirectCustomersDetail(QueryT1IndirectCustomersDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryT1IndirectCustomersDetail", QueryT1IndirectCustomersDetailResponse.class);
    }

    /**
     *This API is used by primary/secondary resellers to query the voucher quota based on the customer UIN.
Callable roles: Reseller, Distributor, Second-level reseller
     * @param req QueryVoucherAmountByUinRequest
     * @return QueryVoucherAmountByUinResponse
     * @throws TencentCloudSDKException
     */
    public QueryVoucherAmountByUinResponse QueryVoucherAmountByUin(QueryVoucherAmountByUinRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryVoucherAmountByUin", QueryVoucherAmountByUinResponse.class);
    }

    /**
     *This API is used by primary/secondary resellers to query the voucher list based on the customer UIN.
Callable roles: Reseller, Distributor, Second-level reseller
     * @param req QueryVoucherListByUinRequest
     * @return QueryVoucherListByUinResponse
     * @throws TencentCloudSDKException
     */
    public QueryVoucherListByUinResponse QueryVoucherListByUin(QueryVoucherListByUinRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryVoucherListByUin", QueryVoucherListByUinResponse.class);
    }

    /**
     *This API is used by primary/secondary resellers to query the voucher quota pool.
Callable roles: Distributor, First-level reseller, Second-level reseller
     * @param req QueryVoucherPoolRequest
     * @return QueryVoucherPoolResponse
     * @throws TencentCloudSDKException
     */
    public QueryVoucherPoolResponse QueryVoucherPool(QueryVoucherPoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryVoucherPool", QueryVoucherPoolResponse.class);
    }

    /**
     *This API is used to send a verification code for account registration.

Callable roles: Distributor, Second-level reseller, Reseller,End-customer
     * @param req SendVerifyCodeRequest
     * @return SendVerifyCodeResponse
     * @throws TencentCloudSDKException
     */
    public SendVerifyCodeResponse SendVerifyCode(SendVerifyCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendVerifyCode", SendVerifyCodeResponse.class);
    }

}
