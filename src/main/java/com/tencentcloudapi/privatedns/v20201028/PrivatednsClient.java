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
package com.tencentcloudapi.privatedns.v20201028;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.privatedns.v20201028.models.*;

public class PrivatednsClient extends AbstractClient{
    private static String endpoint = "privatedns.tencentcloudapi.com";
    private static String service = "privatedns";
    private static String version = "2020-10-28";
    
    public PrivatednsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public PrivatednsClient(Credential credential, String region, ClientProfile profile) {
        super(PrivatednsClient.endpoint, PrivatednsClient.version, credential, region, profile);
    }

    /**
     *This API is used to create an endpoint.
     * @param req CreateEndPointRequest
     * @return CreateEndPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateEndPointResponse CreateEndPoint(CreateEndPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEndPoint", CreateEndPointResponse.class);
    }

    /**
     *This API is used to create an endpoint and an endpoint service simultaneously.
     * @param req CreateEndPointAndEndPointServiceRequest
     * @return CreateEndPointAndEndPointServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateEndPointAndEndPointServiceResponse CreateEndPointAndEndPointService(CreateEndPointAndEndPointServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEndPointAndEndPointService", CreateEndPointAndEndPointServiceResponse.class);
    }

    /**
     *This API is used to create a custom forwarding rule.
     * @param req CreateForwardRuleRequest
     * @return CreateForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateForwardRuleResponse CreateForwardRule(CreateForwardRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateForwardRule", CreateForwardRuleResponse.class);
    }

    /**
     *This API is used to create a Private DNS account.
     * @param req CreatePrivateDNSAccountRequest
     * @return CreatePrivateDNSAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateDNSAccountResponse CreatePrivateDNSAccount(CreatePrivateDNSAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateDNSAccount", CreatePrivateDNSAccountResponse.class);
    }

    /**
     *This API is used to create a private domain.
     * @param req CreatePrivateZoneRequest
     * @return CreatePrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateZoneResponse CreatePrivateZone(CreatePrivateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateZone", CreatePrivateZoneResponse.class);
    }

    /**
     *This API is used to add a DNS record for a private domain.
     * @param req CreatePrivateZoneRecordRequest
     * @return CreatePrivateZoneRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateZoneRecordResponse CreatePrivateZoneRecord(CreatePrivateZoneRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateZoneRecord", CreatePrivateZoneRecordResponse.class);
    }

    /**
     *This API is used to delete a DNS record for a private domain.
     * @param req DeletePrivateZoneRecordRequest
     * @return DeletePrivateZoneRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateZoneRecordResponse DeletePrivateZoneRecord(DeletePrivateZoneRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateZoneRecord", DeletePrivateZoneRecordResponse.class);
    }

    /**
     *This API is used to get the VPC list of a Private DNS account.
     * @param req DescribeAccountVpcListRequest
     * @return DescribeAccountVpcListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountVpcListResponse DescribeAccountVpcList(DescribeAccountVpcListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountVpcList", DescribeAccountVpcListResponse.class);
    }

    /**
     *This API is used to get the list of operation logs.
     * @param req DescribeAuditLogRequest
     * @return DescribeAuditLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuditLogResponse DescribeAuditLog(DescribeAuditLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuditLog", DescribeAuditLogResponse.class);
    }

    /**
     *This API is used to get the overview of private DNS records.
     * @param req DescribeDashboardRequest
     * @return DescribeDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDashboardResponse DescribeDashboard(DescribeDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDashboard", DescribeDashboardResponse.class);
    }

    /**
     *This API is used to obtain the endpoint list.
     * @param req DescribeEndPointListRequest
     * @return DescribeEndPointListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndPointListResponse DescribeEndPointList(DescribeEndPointListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEndPointList", DescribeEndPointListResponse.class);
    }

    /**
     *This API is used to query the forwarding rule list.
     * @param req DescribeForwardRuleListRequest
     * @return DescribeForwardRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForwardRuleListResponse DescribeForwardRuleList(DescribeForwardRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeForwardRuleList", DescribeForwardRuleListResponse.class);
    }

    /**
     *This API is used to get the list of Private DNS accounts.
     * @param req DescribePrivateDNSAccountListRequest
     * @return DescribePrivateDNSAccountListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateDNSAccountListResponse DescribePrivateDNSAccountList(DescribePrivateDNSAccountListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateDNSAccountList", DescribePrivateDNSAccountListResponse.class);
    }

    /**
     *This API is used to get the list of private domains.
     * @param req DescribePrivateZoneListRequest
     * @return DescribePrivateZoneListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneListResponse DescribePrivateZoneList(DescribePrivateZoneListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateZoneList", DescribePrivateZoneListResponse.class);
    }

    /**
     *This API is used to get the list of records for a private domain.
     * @param req DescribePrivateZoneRecordListRequest
     * @return DescribePrivateZoneRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneRecordListResponse DescribePrivateZoneRecordList(DescribePrivateZoneRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateZoneRecordList", DescribePrivateZoneRecordListResponse.class);
    }

    /**
     *This API is used to query the Private DNS activation status.
     * @param req DescribePrivateZoneServiceRequest
     * @return DescribePrivateZoneServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateZoneServiceResponse DescribePrivateZoneService(DescribePrivateZoneServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateZoneService", DescribePrivateZoneServiceResponse.class);
    }

    /**
     *This API is used to query quota usage.
     * @param req DescribeQuotaUsageRequest
     * @return DescribeQuotaUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaUsageResponse DescribeQuotaUsage(DescribeQuotaUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuotaUsage", DescribeQuotaUsageResponse.class);
    }

    /**
     *This API is used to get the DNS request volume of a private domain.
     * @param req DescribeRequestDataRequest
     * @return DescribeRequestDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRequestDataResponse DescribeRequestData(DescribeRequestDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRequestData", DescribeRequestDataResponse.class);
    }

    /**
     *This API is used to modify a private domain.
     * @param req ModifyPrivateZoneRequest
     * @return ModifyPrivateZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateZoneResponse ModifyPrivateZone(ModifyPrivateZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateZone", ModifyPrivateZoneResponse.class);
    }

    /**
     *This API is used to modify a DNS record for a private domain.
     * @param req ModifyPrivateZoneRecordRequest
     * @return ModifyPrivateZoneRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateZoneRecordResponse ModifyPrivateZoneRecord(ModifyPrivateZoneRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateZoneRecord", ModifyPrivateZoneRecordResponse.class);
    }

    /**
     *This API is used to modify the VPC associated with a private domain.
     * @param req ModifyPrivateZoneVpcRequest
     * @return ModifyPrivateZoneVpcResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateZoneVpcResponse ModifyPrivateZoneVpc(ModifyPrivateZoneVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateZoneVpc", ModifyPrivateZoneVpcResponse.class);
    }

    /**
     *This API is used to modify the DNS record status.
     * @param req ModifyRecordsStatusRequest
     * @return ModifyRecordsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordsStatusResponse ModifyRecordsStatus(ModifyRecordsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordsStatus", ModifyRecordsStatusResponse.class);
    }

    /**
     *This API is used to activate the Private DNS service.
     * @param req SubscribePrivateZoneServiceRequest
     * @return SubscribePrivateZoneServiceResponse
     * @throws TencentCloudSDKException
     */
    public SubscribePrivateZoneServiceResponse SubscribePrivateZoneService(SubscribePrivateZoneServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubscribePrivateZoneService", SubscribePrivateZoneServiceResponse.class);
    }

}
