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
        JsonResponseModel<CreateDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a domain alias.
     * @param req CreateDomainAliasRequest
     * @return CreateDomainAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainAliasResponse CreateDomainAlias(CreateDomainAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bulk add domains.
     * @param req CreateDomainBatchRequest
     * @return CreateDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainBatchResponse CreateDomainBatch(CreateDomainBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a domain group.
     * @param req CreateDomainGroupRequest
     * @return CreateDomainGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainGroupResponse CreateDomainGroup(CreateDomainGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a record.
     * @param req CreateRecordRequest
     * @return CreateRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordResponse CreateRecord(CreateRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bulk add records.
     * @param req CreateRecordBatchRequest
     * @return CreateRecordBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordBatchResponse CreateRecordBatch(CreateRecordBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecordBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a record group.
     * @param req CreateRecordGroupRequest
     * @return CreateRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordGroupResponse CreateRecordGroup(CreateRecordGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecordGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a domain.
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a domain alias.
     * @param req DeleteDomainAliasRequest
     * @return DeleteDomainAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainAliasResponse DeleteDomainAlias(DeleteDomainAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomainAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to batch delete domains.
     * @param req DeleteDomainBatchRequest
     * @return DeleteDomainBatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainBatchResponse DeleteDomainBatch(DeleteDomainBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomainBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a record.
     * @param req DeleteRecordRequest
     * @return DeleteRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordResponse DeleteRecord(DeleteRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a record group.
     * @param req DeleteRecordGroupRequest
     * @return DeleteRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordGroupResponse DeleteRecordGroup(DeleteRecordGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unshare a domain.
     * @param req DeleteShareDomainRequest
     * @return DeleteShareDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShareDomainResponse DeleteShareDomain(DeleteShareDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteShareDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteShareDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteShareDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a domain.
     * @param req DescribeDomainRequest
     * @return DescribeDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainResponse DescribeDomain(DescribeDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of domain aliases.
     * @param req DescribeDomainAliasListRequest
     * @return DescribeDomainAliasListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAliasListResponse DescribeDomainAliasList(DescribeDomainAliasListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainAliasListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainAliasListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainAliasList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of domain groups.
     * @param req DescribeDomainGroupListRequest
     * @return DescribeDomainGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainGroupListResponse DescribeDomainGroupList(DescribeDomainGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of domains.
     * @param req DescribeDomainListRequest
     * @return DescribeDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainListResponse DescribeDomainList(DescribeDomainListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the log of a domain.
     * @param req DescribeDomainLogListRequest
     * @return DescribeDomainLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainLogListResponse DescribeDomainLogList(DescribeDomainLogListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainLogListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainLogListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainLogList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the permissions of a domain.
     * @param req DescribeDomainPurviewRequest
     * @return DescribeDomainPurviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainPurviewResponse DescribeDomainPurview(DescribeDomainPurviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainPurviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainPurviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainPurview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the domain sharing information.
     * @param req DescribeDomainShareInfoRequest
     * @return DescribeDomainShareInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainShareInfoResponse DescribeDomainShareInfo(DescribeDomainShareInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainShareInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainShareInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainShareInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the information of a record.
     * @param req DescribeRecordRequest
     * @return DescribeRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordResponse DescribeRecord(DescribeRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of DNS record groups.
     * @param req DescribeRecordGroupListRequest
     * @return DescribeRecordGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordGroupListResponse DescribeRecordGroupList(DescribeRecordGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the split zones allowed by the domain level.
     * @param req DescribeRecordLineListRequest
     * @return DescribeRecordLineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordLineListResponse DescribeRecordLineList(DescribeRecordLineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordLineListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordLineListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordLineList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the DNS records of a domain.
     * @param req DescribeRecordListRequest
     * @return DescribeRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordListResponse DescribeRecordList(DescribeRecordListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the record type allowed by the domain level.
     * @param req DescribeRecordTypeRequest
     * @return DescribeRecordTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordTypeResponse DescribeRecordType(DescribeRecordTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to collect statistics on the DNS query volume of a subdomain. It helps you understand the traffic and time period distribution and allows you to view statistics in the last three months. It is available only for domains under a paid plan.
     * @param req DescribeSubdomainAnalyticsRequest
     * @return DescribeSubdomainAnalyticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubdomainAnalyticsResponse DescribeSubdomainAnalytics(DescribeSubdomainAnalyticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubdomainAnalyticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubdomainAnalyticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubdomainAnalytics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to lock a domain.
     * @param req ModifyDomainLockRequest
     * @return ModifyDomainLockResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainLockResponse ModifyDomainLock(ModifyDomainLockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainLockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainLockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainLock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to transfer ownership of a domain.
     * @param req ModifyDomainOwnerRequest
     * @return ModifyDomainOwnerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainOwnerResponse ModifyDomainOwner(ModifyDomainOwnerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainOwnerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainOwnerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainOwner");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the remarks of a domain.
     * @param req ModifyDomainRemarkRequest
     * @return ModifyDomainRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainRemarkResponse ModifyDomainRemark(ModifyDomainRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainRemarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the status of a domain.
     * @param req ModifyDomainStatusRequest
     * @return ModifyDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainStatusResponse ModifyDomainStatus(ModifyDomainStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unlock a domain.
     * @param req ModifyDomainUnlockRequest
     * @return ModifyDomainUnlockResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainUnlockResponse ModifyDomainUnlock(ModifyDomainUnlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainUnlockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainUnlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainUnlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a record.
     * @param req ModifyRecordRequest
     * @return ModifyRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordResponse ModifyRecord(ModifyRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to bulk modify records.
     * @param req ModifyRecordBatchRequest
     * @return ModifyRecordBatchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordBatchResponse ModifyRecordBatch(ModifyRecordBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a record group.
     * @param req ModifyRecordGroupRequest
     * @return ModifyRecordGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordGroupResponse ModifyRecordGroup(ModifyRecordGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the remarks of a record.
     * @param req ModifyRecordRemarkRequest
     * @return ModifyRecordRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordRemarkResponse ModifyRecordRemark(ModifyRecordRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordRemarkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordRemarkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordRemark");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the DNS record status.
     * @param req ModifyRecordStatusRequest
     * @return ModifyRecordStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordStatusResponse ModifyRecordStatus(ModifyRecordStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to add a record to a group.
     * @param req ModifyRecordToGroupRequest
     * @return ModifyRecordToGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordToGroupResponse ModifyRecordToGroup(ModifyRecordToGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordToGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordToGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordToGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
