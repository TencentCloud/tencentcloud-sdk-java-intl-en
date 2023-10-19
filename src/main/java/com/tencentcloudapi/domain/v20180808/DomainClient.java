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
package com.tencentcloudapi.domain.v20180808;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.domain.v20180808.models.*;

public class DomainClient extends AbstractClient{
    private static String endpoint = "domain.tencentcloudapi.com";
    private static String service = "domain";
    private static String version = "2018-08-08";
    
    public DomainClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DomainClient(Credential credential, String region, ClientProfile profile) {
        super(DomainClient.endpoint, DomainClient.version, credential, region, profile);
    }

    /**
     *This API is used to bulk modify DNS servers for domains.
     * @param req BatchModifyIntlDomainDNSRequest
     * @return BatchModifyIntlDomainDNSResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyIntlDomainDNSResponse BatchModifyIntlDomainDNS(BatchModifyIntlDomainDNSRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyIntlDomainDNS", BatchModifyIntlDomainDNSResponse.class);
    }

    /**
     *This API is used to bulk modify registrant information.
     * @param req BatchModifyIntlDomainInfoRequest
     * @return BatchModifyIntlDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyIntlDomainInfoResponse BatchModifyIntlDomainInfo(BatchModifyIntlDomainInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyIntlDomainInfo", BatchModifyIntlDomainInfoResponse.class);
    }

    /**
     *This API is used to check whether a domain is available for registration.
     * @param req CheckIntlDomainNewRequest
     * @return CheckIntlDomainNewResponse
     * @throws TencentCloudSDKException
     */
    public CheckIntlDomainNewResponse CheckIntlDomainNew(CheckIntlDomainNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIntlDomainNew", CheckIntlDomainNewResponse.class);
    }

    /**
     *This API is used to bulk register domains.
     * @param req CreateIntlDomainBatchRequest
     * @return CreateIntlDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntlDomainBatchResponse CreateIntlDomainBatch(CreateIntlDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIntlDomainBatch", CreateIntlDomainBatchResponse.class);
    }

    /**
     *This API is used to verify a mobile number or an email address via a verification code.
     * @param req CreateIntlPhoneEmailRequest
     * @return CreateIntlPhoneEmailResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntlPhoneEmailResponse CreateIntlPhoneEmail(CreateIntlPhoneEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIntlPhoneEmail", CreateIntlPhoneEmailResponse.class);
    }

    /**
     *This API is used to add a registrant profile.
     * @param req CreateIntlTemplateRequest
     * @return CreateIntlTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntlTemplateResponse CreateIntlTemplate(CreateIntlTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIntlTemplate", CreateIntlTemplateResponse.class);
    }

    /**
     *This API is used to delete a mobile number or an email address.
     * @param req DeleteIntlPhoneEmailRequest
     * @return DeleteIntlPhoneEmailResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntlPhoneEmailResponse DeleteIntlPhoneEmail(DeleteIntlPhoneEmailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIntlPhoneEmail", DeleteIntlPhoneEmailResponse.class);
    }

    /**
     *This API is used to delete a registrant profile.
     * @param req DeleteIntlTemplateRequest
     * @return DeleteIntlTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntlTemplateResponse DeleteIntlTemplate(DeleteIntlTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIntlTemplate", DeleteIntlTemplateResponse.class);
    }

    /**
     *This API is used to query the status of a bulk task.
     * @param req DescribeIntlBatchDetailStatusRequest
     * @return DescribeIntlBatchDetailStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntlBatchDetailStatusResponse DescribeIntlBatchDetailStatus(DescribeIntlBatchDetailStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntlBatchDetailStatus", DescribeIntlBatchDetailStatusResponse.class);
    }

    /**
     *This API is used to query the logs of bulk domain purchase.
     * @param req DescribeIntlBatchOperationLogsRequest
     * @return DescribeIntlBatchOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntlBatchOperationLogsResponse DescribeIntlBatchOperationLogs(DescribeIntlBatchOperationLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntlBatchOperationLogs", DescribeIntlBatchOperationLogsResponse.class);
    }

    /**
     *This API is used to query domain information.
     * @param req DescribeIntlDomainRequest
     * @return DescribeIntlDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntlDomainResponse DescribeIntlDomain(DescribeIntlDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntlDomain", DescribeIntlDomainResponse.class);
    }

    /**
     *This API is used to get the log details of bulk domain purchase.
     * @param req DescribeIntlDomainBatchDetailsRequest
     * @return DescribeIntlDomainBatchDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntlDomainBatchDetailsResponse DescribeIntlDomainBatchDetails(DescribeIntlDomainBatchDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntlDomainBatchDetails", DescribeIntlDomainBatchDetailsResponse.class);
    }

    /**
     *This API is used to query the "My domains" list.
     * @param req DescribeIntlDomainListRequest
     * @return DescribeIntlDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntlDomainListResponse DescribeIntlDomainList(DescribeIntlDomainListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntlDomainList", DescribeIntlDomainListResponse.class);
    }

    /**
     *This API is used to get the price list by domain suffix.
     * @param req DescribeIntlDomainPriceNewListRequest
     * @return DescribeIntlDomainPriceNewListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntlDomainPriceNewListResponse DescribeIntlDomainPriceNewList(DescribeIntlDomainPriceNewListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntlDomainPriceNewList", DescribeIntlDomainPriceNewListResponse.class);
    }

    /**
     *This API is used to get the list of verified mobile numbers and email addresses.
     * @param req DescribeIntlPhoneEmailListRequest
     * @return DescribeIntlPhoneEmailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntlPhoneEmailListResponse DescribeIntlPhoneEmailList(DescribeIntlPhoneEmailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntlPhoneEmailList", DescribeIntlPhoneEmailListResponse.class);
    }

    /**
     *This API is used to get the details of a registrant profile.
     * @param req DescribeIntlTemplateRequest
     * @return DescribeIntlTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntlTemplateResponse DescribeIntlTemplate(DescribeIntlTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntlTemplate", DescribeIntlTemplateResponse.class);
    }

    /**
     *This API is used to get the list of registrant profiles.
     * @param req DescribeIntlTemplateListRequest
     * @return DescribeIntlTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntlTemplateListResponse DescribeIntlTemplateList(DescribeIntlTemplateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIntlTemplateList", DescribeIntlTemplateListResponse.class);
    }

    /**
     *This API is used to bulk transfer domains to another account.
     * @param req ModifyOwnerIntlBatchRequest
     * @return ModifyOwnerIntlBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOwnerIntlBatchResponse ModifyOwnerIntlBatch(ModifyOwnerIntlBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOwnerIntlBatch", ModifyOwnerIntlBatchResponse.class);
    }

    /**
     *This API is used to bulk renew domains.
     * @param req RenewIntlDomainBatchRequest
     * @return RenewIntlDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public RenewIntlDomainBatchResponse RenewIntlDomainBatch(RenewIntlDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewIntlDomainBatch", RenewIntlDomainBatchResponse.class);
    }

    /**
     *This API is used to send a verification code to a mobile number or an email address.
     * @param req SendIntlPhoneEmailCodeRequest
     * @return SendIntlPhoneEmailCodeResponse
     * @throws TencentCloudSDKException
     */
    public SendIntlPhoneEmailCodeResponse SendIntlPhoneEmailCode(SendIntlPhoneEmailCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendIntlPhoneEmailCode", SendIntlPhoneEmailCodeResponse.class);
    }

    /**
     *This API is used to set auto-renewal.
     * @param req SetIntlDomainAutoRenewRequest
     * @return SetIntlDomainAutoRenewResponse
     * @throws TencentCloudSDKException
     */
    public SetIntlDomainAutoRenewResponse SetIntlDomainAutoRenew(SetIntlDomainAutoRenewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetIntlDomainAutoRenew", SetIntlDomainAutoRenewResponse.class);
    }

    /**
     *This API is used to bulk transfer domains in.
     * @param req TransferInIntlDomainBatchRequest
     * @return TransferInIntlDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public TransferInIntlDomainBatchResponse TransferInIntlDomainBatch(TransferInIntlDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransferInIntlDomainBatch", TransferInIntlDomainBatchResponse.class);
    }

    /**
     *This API is used to bulk set transfer prohibition for domains.
     * @param req TransferProhibitionIntlBatchRequest
     * @return TransferProhibitionIntlBatchResponse
     * @throws TencentCloudSDKException
     */
    public TransferProhibitionIntlBatchResponse TransferProhibitionIntlBatch(TransferProhibitionIntlBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransferProhibitionIntlBatch", TransferProhibitionIntlBatchResponse.class);
    }

    /**
     *This API is used to bulk set update prohibition for domains.
     * @param req UpdateProhibitionIntlBatchRequest
     * @return UpdateProhibitionIntlBatchResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProhibitionIntlBatchResponse UpdateProhibitionIntlBatch(UpdateProhibitionIntlBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProhibitionIntlBatch", UpdateProhibitionIntlBatchResponse.class);
    }

}
