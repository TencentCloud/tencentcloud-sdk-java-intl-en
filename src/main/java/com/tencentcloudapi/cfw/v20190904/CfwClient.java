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
package com.tencentcloudapi.cfw.v20190904;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cfw.v20190904.models.*;

public class CfwClient extends AbstractClient{
    private static String endpoint = "cfw.tencentcloudapi.com";
    private static String service = "cfw";
    private static String version = "2019-09-04";

    public CfwClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CfwClient(Credential credential, String region, ClientProfile profile) {
        super(CfwClient.endpoint, CfwClient.version, credential, region, profile);
    }

    /**
     *This API is used to add edge firewall rules.
     * @param req AddAcRuleRequest
     * @return AddAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddAcRuleResponse AddAcRule(AddAcRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAcRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddAcRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddAcRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create enterprise security group rules (new).
     * @param req AddEnterpriseSecurityGroupRulesRequest
     * @return AddEnterpriseSecurityGroupRulesResponse
     * @throws TencentCloudSDKException
     */
    public AddEnterpriseSecurityGroupRulesResponse AddEnterpriseSecurityGroupRules(AddEnterpriseSecurityGroupRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEnterpriseSecurityGroupRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddEnterpriseSecurityGroupRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddEnterpriseSecurityGroupRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create rules.
     * @param req CreateAcRulesRequest
     * @return CreateAcRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateAcRulesResponse CreateAcRules(CreateAcRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAcRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAcRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAcRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a NAT firewall instance (The Region parameter is required).
     * @param req CreateNatFwInstanceRequest
     * @return CreateNatFwInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatFwInstanceResponse CreateNatFwInstance(CreateNatFwInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatFwInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatFwInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNatFwInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a firewall instance with domain name (The Region parameter is required).
     * @param req CreateNatFwInstanceWithDomainRequest
     * @return CreateNatFwInstanceWithDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatFwInstanceWithDomainResponse CreateNatFwInstanceWithDomain(CreateNatFwInstanceWithDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatFwInstanceWithDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatFwInstanceWithDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNatFwInstanceWithDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create enterprise security group rules.
     * @param req CreateSecurityGroupRulesRequest
     * @return CreateSecurityGroupRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupRulesResponse CreateSecurityGroupRules(CreateSecurityGroupRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityGroupRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a rule.
     * @param req DeleteAcRuleRequest
     * @return DeleteAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAcRuleResponse DeleteAcRule(DeleteAcRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAcRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAcRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAcRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete all rules.
     * @param req DeleteAllAccessControlRuleRequest
     * @return DeleteAllAccessControlRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllAccessControlRuleResponse DeleteAllAccessControlRule(DeleteAllAccessControlRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAllAccessControlRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAllAccessControlRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAllAccessControlRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete asset groups in Asset Management.
     * @param req DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceGroupResponse DeleteResourceGroup(DeleteResourceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteResourceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete security group rules.
     * @param req DeleteSecurityGroupRuleRequest
     * @return DeleteSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupRuleResponse DeleteSecurityGroupRule(DeleteSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityGroupRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete firewall instance.
     * @param req DeleteVpcInstanceRequest
     * @return DeleteVpcInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcInstanceResponse DeleteVpcInstance(DeleteVpcInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpcInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVpcInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the access control list.
     * @param req DescribeAcListsRequest
     * @return DescribeAcListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAcListsResponse DescribeAcLists(DescribeAcListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAcListsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAcListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAcLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of instances associated with a security group.
     * @param req DescribeAssociatedInstanceListRequest
     * @return DescribeAssociatedInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssociatedInstanceListResponse DescribeAssociatedInstanceList(DescribeAssociatedInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssociatedInstanceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssociatedInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssociatedInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get blocked IP data.

     * @param req DescribeBlockByIpTimesListRequest
     * @return DescribeBlockByIpTimesListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockByIpTimesListResponse DescribeBlockByIpTimesList(DescribeBlockByIpTimesListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlockByIpTimesListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlockByIpTimesListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlockByIpTimesList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the most frequent attacker.

     * @param req DescribeBlockStaticListRequest
     * @return DescribeBlockStaticListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockStaticListResponse DescribeBlockStaticList(DescribeBlockStaticListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlockStaticListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlockStaticListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlockStaticList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of firewall toggles with Intrusion Defense enabled.
     * @param req DescribeDefenseSwitchRequest
     * @return DescribeDefenseSwitchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefenseSwitchResponse DescribeDefenseSwitch(DescribeDefenseSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefenseSwitchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefenseSwitchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDefenseSwitch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get enterprise security group rules (new).
     * @param req DescribeEnterpriseSecurityGroupRuleRequest
     * @return DescribeEnterpriseSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnterpriseSecurityGroupRuleResponse DescribeEnterpriseSecurityGroupRule(DescribeEnterpriseSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnterpriseSecurityGroupRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnterpriseSecurityGroupRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnterpriseSecurityGroupRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the scan interface information in Get Started.
     * @param req DescribeGuideScanInfoRequest
     * @return DescribeGuideScanInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGuideScanInfoResponse DescribeGuideScanInfo(DescribeGuideScanInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGuideScanInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGuideScanInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGuideScanInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the IP protection status.
     * @param req DescribeIPStatusListRequest
     * @return DescribeIPStatusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStatusListResponse DescribeIPStatusList(DescribeIPStatusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPStatusListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPStatusListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIPStatusList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the number of a user's subnets connected to NAT firewall and the number of NAT firewall instances.
     * @param req DescribeNatFwInfoCountRequest
     * @return DescribeNatFwInfoCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInfoCountResponse DescribeNatFwInfoCount(DescribeNatFwInfoCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwInfoCountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwInfoCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwInfoCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get all NAT instances of a tenant.
     * @param req DescribeNatFwInstanceRequest
     * @return DescribeNatFwInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInstanceResponse DescribeNatFwInstance(DescribeNatFwInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the NAT instance with the region that is newly maintained by the tenant.
     * @param req DescribeNatFwInstanceWithRegionRequest
     * @return DescribeNatFwInstanceWithRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInstanceWithRegionResponse DescribeNatFwInstanceWithRegion(DescribeNatFwInstanceWithRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwInstanceWithRegionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwInstanceWithRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwInstanceWithRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get all NAT instances and instance card information of a tenant.
     * @param req DescribeNatFwInstancesInfoRequest
     * @return DescribeNatFwInstancesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInstancesInfoResponse DescribeNatFwInstancesInfo(DescribeNatFwInstancesInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwInstancesInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwInstancesInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwInstancesInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the VPC DNS status of NAT firewall instances.
     * @param req DescribeNatFwVpcDnsLstRequest
     * @return DescribeNatFwVpcDnsLstResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwVpcDnsLstResponse DescribeNatFwVpcDnsLst(DescribeNatFwVpcDnsLstRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwVpcDnsLstResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwVpcDnsLstResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwVpcDnsLst");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the asset tree information in Asset Management.
     * @param req DescribeResourceGroupNewRequest
     * @return DescribeResourceGroupNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceGroupNewResponse DescribeResourceGroupNew(DescribeResourceGroupNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceGroupNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceGroupNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceGroupNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the rule list overview.
     * @param req DescribeRuleOverviewRequest
     * @return DescribeRuleOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleOverviewResponse DescribeRuleOverview(DescribeRuleOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the security group rule list.
     * @param req DescribeSecurityGroupListRequest
     * @return DescribeSecurityGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupListResponse DescribeSecurityGroupList(DescribeSecurityGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get all asset information of an asset group.

     * @param req DescribeSourceAssetRequest
     * @return DescribeSourceAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceAssetResponse DescribeSourceAsset(DescribeSourceAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSourceAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSourceAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSourceAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the firewall status list.
     * @param req DescribeSwitchListsRequest
     * @return DescribeSwitchListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSwitchListsResponse DescribeSwitchLists(DescribeSwitchListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSwitchListsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSwitchListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSwitchLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the current alert monitoring data.

     * @param req DescribeTLogInfoRequest
     * @return DescribeTLogInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTLogInfoResponse DescribeTLogInfo(DescribeTLogInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTLogInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTLogInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTLogInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the most frequent attacker IP.

     * @param req DescribeTLogIpListRequest
     * @return DescribeTLogIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTLogIpListResponse DescribeTLogIpList(DescribeTLogIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTLogIpListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTLogIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTLogIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the rule list status.
     * @param req DescribeTableStatusRequest
     * @return DescribeTableStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableStatusResponse DescribeTableStatus(DescribeTableStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get unhandled security events.

     * @param req DescribeUnHandleEventTabListRequest
     * @return DescribeUnHandleEventTabListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnHandleEventTabListResponse DescribeUnHandleEventTabList(DescribeUnHandleEventTabListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnHandleEventTabListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnHandleEventTabListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUnHandleEventTabList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to increase the firewall bandwidth.
     * @param req ExpandCfwVerticalRequest
     * @return ExpandCfwVerticalResponse
     * @throws TencentCloudSDKException
     */
    public ExpandCfwVerticalResponse ExpandCfwVertical(ExpandCfwVerticalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExpandCfwVerticalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExpandCfwVerticalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExpandCfwVertical");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify rules.
     * @param req ModifyAcRuleRequest
     * @return ModifyAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAcRuleResponse ModifyAcRule(ModifyAcRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAcRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAcRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAcRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable one or multiple edge firewalls.
     * @param req ModifyAllPublicIPSwitchStatusRequest
     * @return ModifyAllPublicIPSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllPublicIPSwitchStatusResponse ModifyAllPublicIPSwitchStatus(ModifyAllPublicIPSwitchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAllPublicIPSwitchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAllPublicIPSwitchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAllPublicIPSwitchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable all rules.
     * @param req ModifyAllRuleStatusRequest
     * @return ModifyAllRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllRuleStatusResponse ModifyAllRuleStatus(ModifyAllRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAllRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAllRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAllRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable one or multiple VPC firewalls.
     * @param req ModifyAllVPCSwitchStatusRequest
     * @return ModifyAllVPCSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllVPCSwitchStatusResponse ModifyAllVPCSwitchStatus(ModifyAllVPCSwitchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAllVPCSwitchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAllVPCSwitchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAllVPCSwitchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify asset scan settings.
     * @param req ModifyAssetScanRequest
     * @return ModifyAssetScanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetScanResponse ModifyAssetScan(ModifyAssetScanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetScanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAssetScanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAssetScan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to:
add IPs/domains in the blocklist or ignored list
delete IPs/domains in the blocklist or ignored list
modify IPs/domains in the blocklist or ignored list
     * @param req ModifyBlockIgnoreListRequest
     * @return ModifyBlockIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockIgnoreListResponse ModifyBlockIgnoreList(ModifyBlockIgnoreListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBlockIgnoreListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBlockIgnoreListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBlockIgnoreList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to pin or unpin a blocking log.
     * @param req ModifyBlockTopRequest
     * @return ModifyBlockTopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockTopResponse ModifyBlockTop(ModifyBlockTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBlockTopResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBlockTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBlockTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the VPC or NAT list for changing associated firewall instances.
     * @param req ModifyNatFwReSelectRequest
     * @return ModifyNatFwReSelectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatFwReSelectResponse ModifyNatFwReSelect(ModifyNatFwReSelectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatFwReSelectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatFwReSelectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatFwReSelect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable a NAT firewall.
     * @param req ModifyNatFwSwitchRequest
     * @return ModifyNatFwSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatFwSwitchResponse ModifyNatFwSwitch(ModifyNatFwSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatFwSwitchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatFwSwitchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatFwSwitch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the VPC DNS status of NAT firewall instances.
     * @param req ModifyNatFwVpcDnsSwitchRequest
     * @return ModifyNatFwVpcDnsSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatFwVpcDnsSwitchResponse ModifyNatFwVpcDnsSwitch(ModifyNatFwVpcDnsSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatFwVpcDnsSwitchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatFwVpcDnsSwitchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatFwVpcDnsSwitch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable an edge firewall.
     * @param req ModifyPublicIPSwitchStatusRequest
     * @return ModifyPublicIPSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPublicIPSwitchStatusResponse ModifyPublicIPSwitchStatus(ModifyPublicIPSwitchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPublicIPSwitchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPublicIPSwitchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPublicIPSwitchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the asset group information in Asset Management.


     * @param req ModifyResourceGroupRequest
     * @return ModifyResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceGroupResponse ModifyResourceGroup(ModifyResourceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to sync assets - Internet & VPC (new).
     * @param req ModifyRunSyncAssetRequest
     * @return ModifyRunSyncAssetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRunSyncAssetResponse ModifyRunSyncAsset(ModifyRunSyncAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRunSyncAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRunSyncAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRunSyncAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to enable or disable an enterprise security group rule.
     * @param req ModifySecurityGroupItemRuleStatusRequest
     * @return ModifySecurityGroupItemRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupItemRuleStatusResponse ModifySecurityGroupItemRuleStatus(ModifySecurityGroupItemRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupItemRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupItemRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupItemRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to sort enterprise security group rules.
     * @param req ModifySecurityGroupSequenceRulesRequest
     * @return ModifySecurityGroupSequenceRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupSequenceRulesResponse ModifySecurityGroupSequenceRules(ModifySecurityGroupSequenceRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupSequenceRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupSequenceRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupSequenceRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify rule priority.
     * @param req ModifySequenceRulesRequest
     * @return ModifySequenceRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySequenceRulesResponse ModifySequenceRules(ModifySequenceRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySequenceRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySequenceRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySequenceRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify rule list status.
     * @param req ModifyTableStatusRequest
     * @return ModifyTableStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableStatusResponse ModifyTableStatus(ModifyTableStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete edge firewall rules.
     * @param req RemoveAcRuleRequest
     * @return RemoveAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveAcRuleResponse RemoveAcRule(RemoveAcRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveAcRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveAcRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveAcRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete enterprise security group rules (new).
     * @param req RemoveEnterpriseSecurityGroupRuleRequest
     * @return RemoveEnterpriseSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveEnterpriseSecurityGroupRuleResponse RemoveEnterpriseSecurityGroupRule(RemoveEnterpriseSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveEnterpriseSecurityGroupRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveEnterpriseSecurityGroupRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveEnterpriseSecurityGroupRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to configure firewall DNAT rules.
     * @param req SetNatFwDnatRuleRequest
     * @return SetNatFwDnatRuleResponse
     * @throws TencentCloudSDKException
     */
    public SetNatFwDnatRuleResponse SetNatFwDnatRule(SetNatFwDnatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetNatFwDnatRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetNatFwDnatRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetNatFwDnatRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the firewall instance EIP. (Available for firewall instances in the "Create new" mode. only)
     * @param req SetNatFwEipRequest
     * @return SetNatFwEipResponse
     * @throws TencentCloudSDKException
     */
    public SetNatFwEipResponse SetNatFwEip(SetNatFwEipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetNatFwEipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetNatFwEipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetNatFwEip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to stop publishing security group rules.
     * @param req StopSecurityGroupRuleDispatchRequest
     * @return StopSecurityGroupRuleDispatchResponse
     * @throws TencentCloudSDKException
     */
    public StopSecurityGroupRuleDispatchResponse StopSecurityGroupRuleDispatch(StopSecurityGroupRuleDispatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopSecurityGroupRuleDispatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopSecurityGroupRuleDispatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopSecurityGroupRuleDispatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
