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
package com.tencentcloudapi.dnspod.v20210323;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dnspod.v20210323.models.*;

public class DnspodClient extends AbstractClient{
    private static String endpoint = "dnspod.tencentcloudapi.com";
    private static String service = "dnspod";
    private static String version = "2021-03-23";
    
    public DnspodClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DnspodClient(Credential credential, String region, ClientProfile profile) {
        super(DnspodClient.endpoint, DnspodClient.version, credential, region, profile);
    }

    /**
     *This API is used to add a domain.
     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomain", CreateDomainResponse.class);
    }

    /**
     *This API is used to create a domain alias.
     * @param req CreateDomainAliasRequest
     * @return CreateDomainAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainAliasResponse CreateDomainAlias(CreateDomainAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainAlias", CreateDomainAliasResponse.class);
    }

    /**
     *This API is used to bulk add domains.
     * @param req CreateDomainBatchRequest
     * @return CreateDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainBatchResponse CreateDomainBatch(CreateDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainBatch", CreateDomainBatchResponse.class);
    }

    /**
     *This API is used to create a domain group.
     * @param req CreateDomainGroupRequest
     * @return CreateDomainGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainGroupResponse CreateDomainGroup(CreateDomainGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainGroup", CreateDomainGroupResponse.class);
    }

    /**
     *This API is used to add a record.
     * @param req CreateRecordRequest
     * @return CreateRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordResponse CreateRecord(CreateRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecord", CreateRecordResponse.class);
    }

    /**
     *This API is used to bulk add records.
     * @param req CreateRecordBatchRequest
     * @return CreateRecordBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordBatchResponse CreateRecordBatch(CreateRecordBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordBatch", CreateRecordBatchResponse.class);
    }

    /**
     *This API is used to add a record group.
     * @param req CreateRecordGroupRequest
     * @return CreateRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordGroupResponse CreateRecordGroup(CreateRecordGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRecordGroup", CreateRecordGroupResponse.class);
    }

    /**
     *This API is used to delete a domain.
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomain", DeleteDomainResponse.class);
    }

    /**
     *This API is used to delete a domain alias.
     * @param req DeleteDomainAliasRequest
     * @return DeleteDomainAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainAliasResponse DeleteDomainAlias(DeleteDomainAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainAlias", DeleteDomainAliasResponse.class);
    }

    /**
     *This API is used to batch delete domains.
     * @param req DeleteDomainBatchRequest
     * @return DeleteDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainBatchResponse DeleteDomainBatch(DeleteDomainBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainBatch", DeleteDomainBatchResponse.class);
    }

    /**
     *This API is used to delete a record.
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecord", DeleteRecordResponse.class);
    }

    /**
     *This API is used to delete a record group.
     * @param req DeleteRecordGroupRequest
     * @return DeleteRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordGroupResponse DeleteRecordGroup(DeleteRecordGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordGroup", DeleteRecordGroupResponse.class);
    }

    /**
     *This API is used to unshare a domain.
     * @param req DeleteShareDomainRequest
     * @return DeleteShareDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareDomainResponse DeleteShareDomain(DeleteShareDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShareDomain", DeleteShareDomainResponse.class);
    }

    /**
     *This API is used to get the information of a domain.
     * @param req DescribeDomainRequest
     * @return DescribeDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainResponse DescribeDomain(DescribeDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomain", DescribeDomainResponse.class);
    }

    /**
     *This API is used to get the list of domain aliases.
     * @param req DescribeDomainAliasListRequest
     * @return DescribeDomainAliasListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAliasListResponse DescribeDomainAliasList(DescribeDomainAliasListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainAliasList", DescribeDomainAliasListResponse.class);
    }

    /**
     *This API is used to get the list of domain groups.
     * @param req DescribeDomainGroupListRequest
     * @return DescribeDomainGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainGroupListResponse DescribeDomainGroupList(DescribeDomainGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainGroupList", DescribeDomainGroupListResponse.class);
    }

    /**
     *This API is used to get the list of domains.
     * @param req DescribeDomainListRequest
     * @return DescribeDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainListResponse DescribeDomainList(DescribeDomainListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainList", DescribeDomainListResponse.class);
    }

    /**
     *This API is used to get the log of a domain.
     * @param req DescribeDomainLogListRequest
     * @return DescribeDomainLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainLogListResponse DescribeDomainLogList(DescribeDomainLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainLogList", DescribeDomainLogListResponse.class);
    }

    /**
     *This API is used to get the permissions of a domain.
     * @param req DescribeDomainPurviewRequest
     * @return DescribeDomainPurviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainPurviewResponse DescribeDomainPurview(DescribeDomainPurviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainPurview", DescribeDomainPurviewResponse.class);
    }

    /**
     *This API is used to get the domain sharing information.
     * @param req DescribeDomainShareInfoRequest
     * @return DescribeDomainShareInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainShareInfoResponse DescribeDomainShareInfo(DescribeDomainShareInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainShareInfo", DescribeDomainShareInfoResponse.class);
    }

    /**
     *This API is used to get the information of a record.
     * @param req DescribeRecordRequest
     * @return DescribeRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordResponse DescribeRecord(DescribeRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecord", DescribeRecordResponse.class);
    }

    /**
     *This API is used to query the list of DNS record groups.
     * @param req DescribeRecordGroupListRequest
     * @return DescribeRecordGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordGroupListResponse DescribeRecordGroupList(DescribeRecordGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordGroupList", DescribeRecordGroupListResponse.class);
    }

    /**
     *This API is used to get the split zones allowed by the domain level.
     * @param req DescribeRecordLineListRequest
     * @return DescribeRecordLineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordLineListResponse DescribeRecordLineList(DescribeRecordLineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordLineList", DescribeRecordLineListResponse.class);
    }

    /**
     *This API is used to get the DNS records of a domain.
     * @param req DescribeRecordListRequest
     * @return DescribeRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordListResponse DescribeRecordList(DescribeRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordList", DescribeRecordListResponse.class);
    }

    /**
     *This API is used to get the record type allowed by the domain level.
     * @param req DescribeRecordTypeRequest
     * @return DescribeRecordTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordTypeResponse DescribeRecordType(DescribeRecordTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordType", DescribeRecordTypeResponse.class);
    }

    /**
     *This API is used to collect statistics on the DNS query volume of a subdomain. It helps you understand the traffic and time period distribution and allows you to view statistics in the last three months. It is available only for domains under a paid plan.
     * @param req DescribeSubdomainAnalyticsRequest
     * @return DescribeSubdomainAnalyticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubdomainAnalyticsResponse DescribeSubdomainAnalytics(DescribeSubdomainAnalyticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubdomainAnalytics", DescribeSubdomainAnalyticsResponse.class);
    }

    /**
     *This API is used to lock a domain.
     * @param req ModifyDomainLockRequest
     * @return ModifyDomainLockResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainLockResponse ModifyDomainLock(ModifyDomainLockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainLock", ModifyDomainLockResponse.class);
    }

    /**
     *This API is used to transfer ownership of a domain.
     * @param req ModifyDomainOwnerRequest
     * @return ModifyDomainOwnerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainOwnerResponse ModifyDomainOwner(ModifyDomainOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainOwner", ModifyDomainOwnerResponse.class);
    }

    /**
     *This API is used to set the remarks of a domain.
     * @param req ModifyDomainRemarkRequest
     * @return ModifyDomainRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainRemarkResponse ModifyDomainRemark(ModifyDomainRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainRemark", ModifyDomainRemarkResponse.class);
    }

    /**
     *This API is used to modify the status of a domain.
     * @param req ModifyDomainStatusRequest
     * @return ModifyDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainStatusResponse ModifyDomainStatus(ModifyDomainStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainStatus", ModifyDomainStatusResponse.class);
    }

    /**
     *This API is used to unlock a domain.
     * @param req ModifyDomainUnlockRequest
     * @return ModifyDomainUnlockResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainUnlockResponse ModifyDomainUnlock(ModifyDomainUnlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainUnlock", ModifyDomainUnlockResponse.class);
    }

    /**
     *This API is used to modify a record.
     * @param req ModifyRecordRequest
     * @return ModifyRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordResponse ModifyRecord(ModifyRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecord", ModifyRecordResponse.class);
    }

    /**
     *This API is used to bulk modify records.
     * @param req ModifyRecordBatchRequest
     * @return ModifyRecordBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordBatchResponse ModifyRecordBatch(ModifyRecordBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordBatch", ModifyRecordBatchResponse.class);
    }

    /**
     *This API is used to modify a record group.
     * @param req ModifyRecordGroupRequest
     * @return ModifyRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordGroupResponse ModifyRecordGroup(ModifyRecordGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordGroup", ModifyRecordGroupResponse.class);
    }

    /**
     *This API is used to set the remarks of a record.
     * @param req ModifyRecordRemarkRequest
     * @return ModifyRecordRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordRemarkResponse ModifyRecordRemark(ModifyRecordRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordRemark", ModifyRecordRemarkResponse.class);
    }

    /**
     *This API is used to modify the DNS record status.
     * @param req ModifyRecordStatusRequest
     * @return ModifyRecordStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordStatusResponse ModifyRecordStatus(ModifyRecordStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordStatus", ModifyRecordStatusResponse.class);
    }

    /**
     *This API is used to add a record to a group.
     * @param req ModifyRecordToGroupRequest
     * @return ModifyRecordToGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordToGroupResponse ModifyRecordToGroup(ModifyRecordToGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordToGroup", ModifyRecordToGroupResponse.class);
    }

}
