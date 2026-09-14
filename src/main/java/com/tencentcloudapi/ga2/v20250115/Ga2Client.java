/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ga2.v20250115;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ga2.v20250115.models.*;

public class Ga2Client extends AbstractClient{
    private static String endpoint = "ga2.intl.tencentcloudapi.com";
    private static String service = "ga2";
    private static String version = "2025-01-15";

    public Ga2Client(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public Ga2Client(Credential credential, String region, ClientProfile profile) {
        super(Ga2Client.endpoint, Ga2Client.version, credential, region, profile);
    }

    /**
     *This API is used to create an acceleration region.
     * @param req CreateAccelerateAreasRequest
     * @return CreateAccelerateAreasResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccelerateAreasResponse CreateAccelerateAreas(CreateAccelerateAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccelerateAreas", CreateAccelerateAreasResponse.class);
    }

    /**
     *This API is used to create a terminal node group.
     * @param req CreateEndpointGroupRequest
     * @return CreateEndpointGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateEndpointGroupResponse CreateEndpointGroup(CreateEndpointGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEndpointGroup", CreateEndpointGroupResponse.class);
    }

    /**
     *Create a layer-7 forwarding policy.
     * @param req CreateForwardingPolicyRequest
     * @return CreateForwardingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateForwardingPolicyResponse CreateForwardingPolicy(CreateForwardingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateForwardingPolicy", CreateForwardingPolicyResponse.class);
    }

    /**
     *Create a Layer 7 forwarding rule
     * @param req CreateForwardingRuleRequest
     * @return CreateForwardingRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateForwardingRuleResponse CreateForwardingRule(CreateForwardingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateForwardingRule", CreateForwardingRuleResponse.class);
    }

    /**
     *This API is used to create a global acceleration instance.
     * @param req CreateGlobalAcceleratorRequest
     * @return CreateGlobalAcceleratorResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalAcceleratorResponse CreateGlobalAccelerator(CreateGlobalAcceleratorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalAccelerator", CreateGlobalAcceleratorResponse.class);
    }

    /**
     *Create a GA access log
     * @param req CreateGlobalAcceleratorAccessLogRequest
     * @return CreateGlobalAcceleratorAccessLogResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalAcceleratorAccessLogResponse CreateGlobalAcceleratorAccessLog(CreateGlobalAcceleratorAccessLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalAcceleratorAccessLog", CreateGlobalAcceleratorAccessLogResponse.class);
    }

    /**
     *Create access control policy
     * @param req CreateGlobalAcceleratorAclPolicyRequest
     * @return CreateGlobalAcceleratorAclPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalAcceleratorAclPolicyResponse CreateGlobalAcceleratorAclPolicy(CreateGlobalAcceleratorAclPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalAcceleratorAclPolicy", CreateGlobalAcceleratorAclPolicyResponse.class);
    }

    /**
     *Create an ACL rule
     * @param req CreateGlobalAcceleratorAclRuleRequest
     * @return CreateGlobalAcceleratorAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalAcceleratorAclRuleResponse CreateGlobalAcceleratorAclRule(CreateGlobalAcceleratorAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalAcceleratorAclRule", CreateGlobalAcceleratorAclRuleResponse.class);
    }

    /**
     *This API is used to create a listener.
     * @param req CreateListenerRequest
     * @return CreateListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerResponse CreateListener(CreateListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateListener", CreateListenerResponse.class);
    }

    /**
     *Add an extension certificate.
     * @param req CreateListenerAdditionalCertRequest
     * @return CreateListenerAdditionalCertResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerAdditionalCertResponse CreateListenerAdditionalCert(CreateListenerAdditionalCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateListenerAdditionalCert", CreateListenerAdditionalCertResponse.class);
    }

    /**
     *Delete an acceleration region
     * @param req DeleteAccelerateAreasRequest
     * @return DeleteAccelerateAreasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccelerateAreasResponse DeleteAccelerateAreas(DeleteAccelerateAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccelerateAreas", DeleteAccelerateAreasResponse.class);
    }

    /**
     *Delete a terminal node group.
     * @param req DeleteEndpointGroupsRequest
     * @return DeleteEndpointGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEndpointGroupsResponse DeleteEndpointGroups(DeleteEndpointGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEndpointGroups", DeleteEndpointGroupsResponse.class);
    }

    /**
     *Delete a layer-7 forwarding policy.
     * @param req DeleteForwardingPolicyRequest
     * @return DeleteForwardingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteForwardingPolicyResponse DeleteForwardingPolicy(DeleteForwardingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteForwardingPolicy", DeleteForwardingPolicyResponse.class);
    }

    /**
     *Delete a Layer 7 forwarding rule
     * @param req DeleteForwardingRuleRequest
     * @return DeleteForwardingRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteForwardingRuleResponse DeleteForwardingRule(DeleteForwardingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteForwardingRule", DeleteForwardingRuleResponse.class);
    }

    /**
     *Deletes a global acceleration instance
     * @param req DeleteGlobalAcceleratorRequest
     * @return DeleteGlobalAcceleratorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlobalAcceleratorResponse DeleteGlobalAccelerator(DeleteGlobalAcceleratorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlobalAccelerator", DeleteGlobalAcceleratorResponse.class);
    }

    /**
     *This API is used to delete a GA log task.
     * @param req DeleteGlobalAcceleratorAccessLogRequest
     * @return DeleteGlobalAcceleratorAccessLogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlobalAcceleratorAccessLogResponse DeleteGlobalAcceleratorAccessLog(DeleteGlobalAcceleratorAccessLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlobalAcceleratorAccessLog", DeleteGlobalAcceleratorAccessLogResponse.class);
    }

    /**
     *Delete access control policy
     * @param req DeleteGlobalAcceleratorAclPolicyRequest
     * @return DeleteGlobalAcceleratorAclPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlobalAcceleratorAclPolicyResponse DeleteGlobalAcceleratorAclPolicy(DeleteGlobalAcceleratorAclPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlobalAcceleratorAclPolicy", DeleteGlobalAcceleratorAclPolicyResponse.class);
    }

    /**
     *Delete ACL rule
     * @param req DeleteGlobalAcceleratorAclRuleRequest
     * @return DeleteGlobalAcceleratorAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlobalAcceleratorAclRuleResponse DeleteGlobalAcceleratorAclRule(DeleteGlobalAcceleratorAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlobalAcceleratorAclRule", DeleteGlobalAcceleratorAclRuleResponse.class);
    }

    /**
     *This API is used to delete a listener.
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListener", DeleteListenerResponse.class);
    }

    /**
     *Delete the extension certificate.
     * @param req DeleteListenerAdditionalCertRequest
     * @return DeleteListenerAdditionalCertResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerAdditionalCertResponse DeleteListenerAdditionalCert(DeleteListenerAdditionalCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListenerAdditionalCert", DeleteListenerAdditionalCertResponse.class);
    }

    /**
     *Queries acceleration regions
     * @param req DescribeAccelerateAreasRequest
     * @return DescribeAccelerateAreasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccelerateAreasResponse DescribeAccelerateAreas(DescribeAccelerateAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccelerateAreas", DescribeAccelerateAreasResponse.class);
    }

    /**
     *Queries selectable acceleration regions.
     * @param req DescribeAccelerateRegionsRequest
     * @return DescribeAccelerateRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccelerateRegionsResponse DescribeAccelerateRegions(DescribeAccelerateRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccelerateRegions", DescribeAccelerateRegionsResponse.class);
    }

    /**
     *View access log reporting parameters
     * @param req DescribeAccessLogParamRequest
     * @return DescribeAccessLogParamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessLogParamResponse DescribeAccessLogParam(DescribeAccessLogParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessLogParam", DescribeAccessLogParamResponse.class);
    }

    /**
     *Querying Cross-Border Bills
     * @param req DescribeCrossBorderSettlementRequest
     * @return DescribeCrossBorderSettlementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderSettlementResponse DescribeCrossBorderSettlement(DescribeCrossBorderSettlementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossBorderSettlement", DescribeCrossBorderSettlementResponse.class);
    }

    /**
     *Query a terminal node group.
     * @param req DescribeEndpointGroupsRequest
     * @return DescribeEndpointGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndpointGroupsResponse DescribeEndpointGroups(DescribeEndpointGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEndpointGroups", DescribeEndpointGroupsResponse.class);
    }

    /**
     *View a layer-7 forwarding policy
     * @param req DescribeForwardingPolicyRequest
     * @return DescribeForwardingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForwardingPolicyResponse DescribeForwardingPolicy(DescribeForwardingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeForwardingPolicy", DescribeForwardingPolicyResponse.class);
    }

    /**
     *View a Layer 7 forwarding rule
     * @param req DescribeForwardingRuleRequest
     * @return DescribeForwardingRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForwardingRuleResponse DescribeForwardingRule(DescribeForwardingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeForwardingRule", DescribeForwardingRuleResponse.class);
    }

    /**
     *Query log tasks
     * @param req DescribeGlobalAcceleratorAccessLogRequest
     * @return DescribeGlobalAcceleratorAccessLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalAcceleratorAccessLogResponse DescribeGlobalAcceleratorAccessLog(DescribeGlobalAcceleratorAccessLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalAcceleratorAccessLog", DescribeGlobalAcceleratorAccessLogResponse.class);
    }

    /**
     *View the access control policy
     * @param req DescribeGlobalAcceleratorAclPoliciesRequest
     * @return DescribeGlobalAcceleratorAclPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalAcceleratorAclPoliciesResponse DescribeGlobalAcceleratorAclPolicies(DescribeGlobalAcceleratorAclPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalAcceleratorAclPolicies", DescribeGlobalAcceleratorAclPoliciesResponse.class);
    }

    /**
     *View ACL rules
     * @param req DescribeGlobalAcceleratorAclRulesRequest
     * @return DescribeGlobalAcceleratorAclRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalAcceleratorAclRulesResponse DescribeGlobalAcceleratorAclRules(DescribeGlobalAcceleratorAclRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalAcceleratorAclRules", DescribeGlobalAcceleratorAclRulesResponse.class);
    }

    /**
     *Modify a global acceleration instance
     * @param req DescribeGlobalAcceleratorsRequest
     * @return DescribeGlobalAcceleratorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalAcceleratorsResponse DescribeGlobalAccelerators(DescribeGlobalAcceleratorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalAccelerators", DescribeGlobalAcceleratorsResponse.class);
    }

    /**
     *This API is used to query listeners.
     * @param req DescribeListenersRequest
     * @return DescribeListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenersResponse DescribeListeners(DescribeListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListeners", DescribeListenersResponse.class);
    }

    /**
     *Query asynchronous task result
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskResult", DescribeTaskResultResponse.class);
    }

    /**
     *Modify acceleration region
     * @param req ModifyAccelerateAreasRequest
     * @return ModifyAccelerateAreasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerateAreasResponse ModifyAccelerateAreas(ModifyAccelerateAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccelerateAreas", ModifyAccelerateAreasResponse.class);
    }

    /**
     *Modify the status of a log task
     * @param req ModifyAccessLogStatusRequest
     * @return ModifyAccessLogStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessLogStatusResponse ModifyAccessLogStatus(ModifyAccessLogStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessLogStatus", ModifyAccessLogStatusResponse.class);
    }

    /**
     *This API is used to modify a terminal node group.
     * @param req ModifyEndpointGroupRequest
     * @return ModifyEndpointGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEndpointGroupResponse ModifyEndpointGroup(ModifyEndpointGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEndpointGroup", ModifyEndpointGroupResponse.class);
    }

    /**
     *Modify a layer-7 forwarding policy
     * @param req ModifyForwardingPolicyRequest
     * @return ModifyForwardingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyForwardingPolicyResponse ModifyForwardingPolicy(ModifyForwardingPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyForwardingPolicy", ModifyForwardingPolicyResponse.class);
    }

    /**
     *This API is used to modify a Layer 7 forwarding rule.
     * @param req ModifyForwardingRuleRequest
     * @return ModifyForwardingRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyForwardingRuleResponse ModifyForwardingRule(ModifyForwardingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyForwardingRule", ModifyForwardingRuleResponse.class);
    }

    /**
     *Modify a global acceleration instance
     * @param req ModifyGlobalAcceleratorRequest
     * @return ModifyGlobalAcceleratorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalAcceleratorResponse ModifyGlobalAccelerator(ModifyGlobalAcceleratorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalAccelerator", ModifyGlobalAcceleratorResponse.class);
    }

    /**
     *Modify GA access logs
     * @param req ModifyGlobalAcceleratorAccessLogRequest
     * @return ModifyGlobalAcceleratorAccessLogResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalAcceleratorAccessLogResponse ModifyGlobalAcceleratorAccessLog(ModifyGlobalAcceleratorAccessLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalAcceleratorAccessLog", ModifyGlobalAcceleratorAccessLogResponse.class);
    }

    /**
     *Modify the status of an access control policy
     * @param req ModifyGlobalAcceleratorAclPolicyRequest
     * @return ModifyGlobalAcceleratorAclPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalAcceleratorAclPolicyResponse ModifyGlobalAcceleratorAclPolicy(ModifyGlobalAcceleratorAclPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalAcceleratorAclPolicy", ModifyGlobalAcceleratorAclPolicyResponse.class);
    }

    /**
     *Modify ACL rules
     * @param req ModifyGlobalAcceleratorAclRuleRequest
     * @return ModifyGlobalAcceleratorAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalAcceleratorAclRuleResponse ModifyGlobalAcceleratorAclRule(ModifyGlobalAcceleratorAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalAcceleratorAclRule", ModifyGlobalAcceleratorAclRuleResponse.class);
    }

    /**
     *Modify a listener
     * @param req ModifyListenerRequest
     * @return ModifyListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyListenerResponse ModifyListener(ModifyListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyListener", ModifyListenerResponse.class);
    }

    /**
     *Replace the extension certificate.
     * @param req ReplaceListenerAdditionalCertRequest
     * @return ReplaceListenerAdditionalCertResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceListenerAdditionalCertResponse ReplaceListenerAdditionalCert(ReplaceListenerAdditionalCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceListenerAdditionalCert", ReplaceListenerAdditionalCertResponse.class);
    }

}
