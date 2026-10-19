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
package com.tencentcloudapi.config.v20220802;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.config.v20220802.models.*;

public class ConfigClient extends AbstractClient{
    private static String endpoint = "config.intl.tencentcloudapi.com";
    private static String service = "config";
    private static String version = "2022-08-02";

    public ConfigClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ConfigClient(Credential credential, String region, ClientProfile profile) {
        super(ConfigClient.endpoint, ConfigClient.version, credential, region, profile);
    }

    /**
     *This API is used to create compliance packages for account groups.
     * @param req AddAggregateCompliancePackRequest
     * @return AddAggregateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public AddAggregateCompliancePackResponse AddAggregateCompliancePack(AddAggregateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAggregateCompliancePack", AddAggregateCompliancePackResponse.class);
    }

    /**
     *This API is used to create rules for account groups.
     * @param req AddAggregateConfigRuleRequest
     * @return AddAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddAggregateConfigRuleResponse AddAggregateConfigRule(AddAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAggregateConfigRule", AddAggregateConfigRuleResponse.class);
    }

    /**
     *This API is used to add alarm monitoring rules.
     * @param req AddAlarmPolicyRequest
     * @return AddAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public AddAlarmPolicyResponse AddAlarmPolicy(AddAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAlarmPolicy", AddAlarmPolicyResponse.class);
    }

    /**
     *This API is used to create a compliance package.
     * @param req AddCompliancePackRequest
     * @return AddCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public AddCompliancePackResponse AddCompliancePack(AddCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCompliancePack", AddCompliancePackResponse.class);
    }

    /**
     *This API is used to create rules.
     * @param req AddConfigRuleRequest
     * @return AddConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddConfigRuleResponse AddConfigRule(AddConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddConfigRule", AddConfigRuleResponse.class);
    }

    /**
     *This API is used to close rules for account groups.
     * @param req CloseAggregateConfigRuleRequest
     * @return CloseAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public CloseAggregateConfigRuleResponse CloseAggregateConfigRule(CloseAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseAggregateConfigRule", CloseAggregateConfigRuleResponse.class);
    }

    /**
     *This API is used to manage resource monitoring - disabling monitoring.
     * @param req CloseConfigRecorderRequest
     * @return CloseConfigRecorderResponse
     * @throws TencentCloudSDKException
     */
    public CloseConfigRecorderResponse CloseConfigRecorder(CloseConfigRecorderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseConfigRecorder", CloseConfigRecorderResponse.class);
    }

    /**
     *Close rules
     * @param req CloseConfigRuleRequest
     * @return CloseConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public CloseConfigRuleResponse CloseConfigRule(CloseConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseConfigRule", CloseConfigRuleResponse.class);
    }

    /**
     *This API is used to create account groups.
     * @param req CreateAggregatorRequest
     * @return CreateAggregatorResponse
     * @throws TencentCloudSDKException
     */
    public CreateAggregatorResponse CreateAggregator(CreateAggregatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAggregator", CreateAggregatorResponse.class);
    }

    /**
     *This API is used to add rule remediation settings.
     * @param req CreateRemediationRequest
     * @return CreateRemediationResponse
     * @throws TencentCloudSDKException
     */
    public CreateRemediationResponse CreateRemediation(CreateRemediationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRemediation", CreateRemediationResponse.class);
    }

    /**
     *This API is used to delete compliance packages for account groups.
     * @param req DeleteAggregateCompliancePackRequest
     * @return DeleteAggregateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAggregateCompliancePackResponse DeleteAggregateCompliancePack(DeleteAggregateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAggregateCompliancePack", DeleteAggregateCompliancePackResponse.class);
    }

    /**
     *This API is used to delete rules for account groups.
     * @param req DeleteAggregateConfigRuleRequest
     * @return DeleteAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAggregateConfigRuleResponse DeleteAggregateConfigRule(DeleteAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAggregateConfigRule", DeleteAggregateConfigRuleResponse.class);
    }

    /**
     *This API is used to delete account groups.
     * @param req DeleteAggregatorsRequest
     * @return DeleteAggregatorsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAggregatorsResponse DeleteAggregators(DeleteAggregatorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAggregators", DeleteAggregatorsResponse.class);
    }

    /**
     *Deletes alarm rules
     * @param req DeleteAlarmPolicyRequest
     * @return DeleteAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmPolicyResponse DeleteAlarmPolicy(DeleteAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmPolicy", DeleteAlarmPolicyResponse.class);
    }

    /**
     *This API is used to delete compliance packages.
     * @param req DeleteCompliancePackRequest
     * @return DeleteCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCompliancePackResponse DeleteCompliancePack(DeleteCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCompliancePack", DeleteCompliancePackResponse.class);
    }

    /**
     *Delete a rule
     * @param req DeleteConfigRuleRequest
     * @return DeleteConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigRuleResponse DeleteConfigRule(DeleteConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigRule", DeleteConfigRuleResponse.class);
    }

    /**
     *This API is used to delete rule remediation settings.
     * @param req DeleteRemediationsRequest
     * @return DeleteRemediationsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRemediationsResponse DeleteRemediations(DeleteRemediationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRemediations", DeleteRemediationsResponse.class);
    }

    /**
     *This API is used to query compliance package details for account groups.
     * @param req DescribeAggregateCompliancePackRequest
     * @return DescribeAggregateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregateCompliancePackResponse DescribeAggregateCompliancePack(DescribeAggregateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregateCompliancePack", DescribeAggregateCompliancePackResponse.class);
    }

    /**
     *This API is used to query delivery setting details for account groups.
     * @param req DescribeAggregateConfigDeliverRequest
     * @return DescribeAggregateConfigDeliverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregateConfigDeliverResponse DescribeAggregateConfigDeliver(DescribeAggregateConfigDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregateConfigDeliver", DescribeAggregateConfigDeliverResponse.class);
    }

    /**
     *This API is used to query rule details for account groups.
     * @param req DescribeAggregateConfigRuleRequest
     * @return DescribeAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregateConfigRuleResponse DescribeAggregateConfigRule(DescribeAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregateConfigRule", DescribeAggregateConfigRuleResponse.class);
    }

    /**
     *This API is used to query resource details for account groups.
     * @param req DescribeAggregateDiscoveredResourceRequest
     * @return DescribeAggregateDiscoveredResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregateDiscoveredResourceResponse DescribeAggregateDiscoveredResource(DescribeAggregateDiscoveredResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregateDiscoveredResource", DescribeAggregateDiscoveredResourceResponse.class);
    }

    /**
     *This example shows you how to query account group details.
     * @param req DescribeAggregatorRequest
     * @return DescribeAggregatorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAggregatorResponse DescribeAggregator(DescribeAggregatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAggregator", DescribeAggregatorResponse.class);
    }

    /**
     *This API is used to query compliance package details.
     * @param req DescribeCompliancePackRequest
     * @return DescribeCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompliancePackResponse DescribeCompliancePack(DescribeCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCompliancePack", DescribeCompliancePackResponse.class);
    }

    /**
     *This API is used to query delivery setting details.
     * @param req DescribeConfigDeliverRequest
     * @return DescribeConfigDeliverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigDeliverResponse DescribeConfigDeliver(DescribeConfigDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigDeliver", DescribeConfigDeliverResponse.class);
    }

    /**
     *This API is used to query monitoring details.
     * @param req DescribeConfigRecorderRequest
     * @return DescribeConfigRecorderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigRecorderResponse DescribeConfigRecorder(DescribeConfigRecorderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigRecorder", DescribeConfigRecorderResponse.class);
    }

    /**
     *This example shows you how to query rule details.
     * @param req DescribeConfigRuleRequest
     * @return DescribeConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigRuleResponse DescribeConfigRule(DescribeConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigRule", DescribeConfigRuleResponse.class);
    }

    /**
     *Resource details.
     * @param req DescribeDiscoveredResourceRequest
     * @return DescribeDiscoveredResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiscoveredResourceResponse DescribeDiscoveredResource(DescribeDiscoveredResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDiscoveredResource", DescribeDiscoveredResourceResponse.class);
    }

    /**
     *This API is used to query the system compliance package details.
     * @param req DescribeSystemCompliancePackRequest
     * @return DescribeSystemCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemCompliancePackResponse DescribeSystemCompliancePack(DescribeSystemCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemCompliancePack", DescribeSystemCompliancePackResponse.class);
    }

    /**
     *This API is used to preset rule details.
     * @param req DescribeSystemRuleRequest
     * @return DescribeSystemRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSystemRuleResponse DescribeSystemRule(DescribeSystemRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSystemRule", DescribeSystemRuleResponse.class);
    }

    /**
     *This API is used to remove rules from compliance packages for account groups.
     * @param req DetachAggregateConfigRuleToCompliancePackRequest
     * @return DetachAggregateConfigRuleToCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DetachAggregateConfigRuleToCompliancePackResponse DetachAggregateConfigRuleToCompliancePack(DetachAggregateConfigRuleToCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachAggregateConfigRuleToCompliancePack", DetachAggregateConfigRuleToCompliancePackResponse.class);
    }

    /**
     *This API is used to remove rules for a compliance package.
     * @param req DetachConfigRuleToCompliancePackRequest
     * @return DetachConfigRuleToCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public DetachConfigRuleToCompliancePackResponse DetachConfigRuleToCompliancePack(DetachConfigRuleToCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachConfigRuleToCompliancePack", DetachConfigRuleToCompliancePackResponse.class);
    }

    /**
     *This API is used to query the list of compliance packages for account groups.
     * @param req ListAggregateCompliancePacksRequest
     * @return ListAggregateCompliancePacksResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateCompliancePacksResponse ListAggregateCompliancePacks(ListAggregateCompliancePacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateCompliancePacks", ListAggregateCompliancePacksResponse.class);
    }

    /**
     *This API is used to query evaluation results from the rule dimension for account groups (the list of evaluation results for resources under a specific rule).
     * @param req ListAggregateConfigRuleEvaluationResultsRequest
     * @return ListAggregateConfigRuleEvaluationResultsResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateConfigRuleEvaluationResultsResponse ListAggregateConfigRuleEvaluationResults(ListAggregateConfigRuleEvaluationResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateConfigRuleEvaluationResults", ListAggregateConfigRuleEvaluationResultsResponse.class);
    }

    /**
     *This API is used to list resource evaluation results of compliance rules in account groups.
     * @param req ListAggregateConfigRuleResourceEvaluationResultsRequest
     * @return ListAggregateConfigRuleResourceEvaluationResultsResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateConfigRuleResourceEvaluationResultsResponse ListAggregateConfigRuleResourceEvaluationResults(ListAggregateConfigRuleResourceEvaluationResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateConfigRuleResourceEvaluationResults", ListAggregateConfigRuleResourceEvaluationResultsResponse.class);
    }

    /**
     *This API is used to query the list of rules for account groups.
     * @param req ListAggregateConfigRulesRequest
     * @return ListAggregateConfigRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateConfigRulesResponse ListAggregateConfigRules(ListAggregateConfigRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateConfigRules", ListAggregateConfigRulesResponse.class);
    }

    /**
     *This API is used to query the list of resources for account groups.
     * @param req ListAggregateDiscoveredResourcesRequest
     * @return ListAggregateDiscoveredResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregateDiscoveredResourcesResponse ListAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregateDiscoveredResources", ListAggregateDiscoveredResourcesResponse.class);
    }

    /**
     *Account group list.
     * @param req ListAggregatorsRequest
     * @return ListAggregatorsResponse
     * @throws TencentCloudSDKException
     */
    public ListAggregatorsResponse ListAggregators(ListAggregatorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAggregators", ListAggregatorsResponse.class);
    }

    /**
     *Alarm rule list
     * @param req ListAlarmPolicyRequest
     * @return ListAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ListAlarmPolicyResponse ListAlarmPolicy(ListAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAlarmPolicy", ListAlarmPolicyResponse.class);
    }

    /**
     *This API is used to query the list of compliance packages.
     * @param req ListCompliancePacksRequest
     * @return ListCompliancePacksResponse
     * @throws TencentCloudSDKException
     */
    public ListCompliancePacksResponse ListCompliancePacks(ListCompliancePacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCompliancePacks", ListCompliancePacksResponse.class);
    }

    /**
     * This API is used to obtain evaluation results from the rule dimension (the list of evaluation results for resources under a specific rule).
     * @param req ListConfigRuleEvaluationResultsRequest
     * @return ListConfigRuleEvaluationResultsResponse
     * @throws TencentCloudSDKException
     */
    public ListConfigRuleEvaluationResultsResponse ListConfigRuleEvaluationResults(ListConfigRuleEvaluationResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConfigRuleEvaluationResults", ListConfigRuleEvaluationResultsResponse.class);
    }

    /**
     *This API is used to query the list of resource evaluation results under configuration rules.
     * @param req ListConfigRuleResourceEvaluationResultsRequest
     * @return ListConfigRuleResourceEvaluationResultsResponse
     * @throws TencentCloudSDKException
     */
    public ListConfigRuleResourceEvaluationResultsResponse ListConfigRuleResourceEvaluationResults(ListConfigRuleResourceEvaluationResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConfigRuleResourceEvaluationResults", ListConfigRuleResourceEvaluationResultsResponse.class);
    }

    /**
     *This example shows you how to query the rule list.
     * @param req ListConfigRulesRequest
     * @return ListConfigRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListConfigRulesResponse ListConfigRules(ListConfigRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConfigRules", ListConfigRulesResponse.class);
    }

    /**
     *Obtaining the Resource List
     * @param req ListDiscoveredResourcesRequest
     * @return ListDiscoveredResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDiscoveredResourcesResponse ListDiscoveredResources(ListDiscoveredResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDiscoveredResources", ListDiscoveredResourcesResponse.class);
    }

    /**
     *Correction records.
     * @param req ListRemediationExecutionsRequest
     * @return ListRemediationExecutionsResponse
     * @throws TencentCloudSDKException
     */
    public ListRemediationExecutionsResponse ListRemediationExecutions(ListRemediationExecutionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRemediationExecutions", ListRemediationExecutionsResponse.class);
    }

    /**
     *This API is used to list remediation settings.
     * @param req ListRemediationsRequest
     * @return ListRemediationsResponse
     * @throws TencentCloudSDKException
     */
    public ListRemediationsResponse ListRemediations(ListRemediationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRemediations", ListRemediationsResponse.class);
    }

    /**
     *This API is used to query the resource type list.
     * @param req ListResourceTypesRequest
     * @return ListResourceTypesResponse
     * @throws TencentCloudSDKException
     */
    public ListResourceTypesResponse ListResourceTypes(ListResourceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListResourceTypes", ListResourceTypesResponse.class);
    }

    /**
     *This API is used to query the list of system compliance packages.
     * @param req ListSystemCompliancePacksRequest
     * @return ListSystemCompliancePacksResponse
     * @throws TencentCloudSDKException
     */
    public ListSystemCompliancePacksResponse ListSystemCompliancePacks(ListSystemCompliancePacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSystemCompliancePacks", ListSystemCompliancePacksResponse.class);
    }

    /**
     *This API is used to query the preset rule list.
     * @param req ListSystemRulesRequest
     * @return ListSystemRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListSystemRulesResponse ListSystemRules(ListSystemRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSystemRules", ListSystemRulesResponse.class);
    }

    /**
     *This API is used to enable a rule for an account group.
     * @param req OpenAggregateConfigRuleRequest
     * @return OpenAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public OpenAggregateConfigRuleResponse OpenAggregateConfigRule(OpenAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenAggregateConfigRule", OpenAggregateConfigRuleResponse.class);
    }

    /**
     *This API is used to manage resource monitoring - enabling monitoring.
     * @param req OpenConfigRecorderRequest
     * @return OpenConfigRecorderResponse
     * @throws TencentCloudSDKException
     */
    public OpenConfigRecorderResponse OpenConfigRecorder(OpenConfigRecorderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenConfigRecorder", OpenConfigRecorderResponse.class);
    }

    /**
     *Enable rules
     * @param req OpenConfigRuleRequest
     * @return OpenConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public OpenConfigRuleResponse OpenConfigRule(OpenConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenConfigRule", OpenConfigRuleResponse.class);
    }

    /**
     *Reporting Evaluation Results Under Custom Rules
     * @param req PutEvaluationsRequest
     * @return PutEvaluationsResponse
     * @throws TencentCloudSDKException
     */
    public PutEvaluationsResponse PutEvaluations(PutEvaluationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutEvaluations", PutEvaluationsResponse.class);
    }

    /**
     *This API is used to trigger evaluation for account groups.
     * @param req StartAggregateConfigRuleEvaluationRequest
     * @return StartAggregateConfigRuleEvaluationResponse
     * @throws TencentCloudSDKException
     */
    public StartAggregateConfigRuleEvaluationResponse StartAggregateConfigRuleEvaluation(StartAggregateConfigRuleEvaluationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartAggregateConfigRuleEvaluation", StartAggregateConfigRuleEvaluationResponse.class);
    }

    /**
     *This API is used to trigger evaluations.
     * @param req StartConfigRuleEvaluationRequest
     * @return StartConfigRuleEvaluationResponse
     * @throws TencentCloudSDKException
     */
    public StartConfigRuleEvaluationResponse StartConfigRuleEvaluation(StartConfigRuleEvaluationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartConfigRuleEvaluation", StartConfigRuleEvaluationResponse.class);
    }

    /**
     *This API is used to manually execute rule repairs.
     * @param req StartRemediationRequest
     * @return StartRemediationResponse
     * @throws TencentCloudSDKException
     */
    public StartRemediationResponse StartRemediation(StartRemediationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartRemediation", StartRemediationResponse.class);
    }

    /**
     *This API is used to edit conformance packages for account groups.
     * @param req UpdateAggregateCompliancePackRequest
     * @return UpdateAggregateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAggregateCompliancePackResponse UpdateAggregateCompliancePack(UpdateAggregateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAggregateCompliancePack", UpdateAggregateCompliancePackResponse.class);
    }

    /**
     *This API is used to enable or disable compliance packages for account groups.
     * @param req UpdateAggregateCompliancePackStatusRequest
     * @return UpdateAggregateCompliancePackStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAggregateCompliancePackStatusResponse UpdateAggregateCompliancePackStatus(UpdateAggregateCompliancePackStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAggregateCompliancePackStatus", UpdateAggregateCompliancePackStatusResponse.class);
    }

    /**
     *This API is used to edit delivery settings for account groups.
     * @param req UpdateAggregateConfigDeliverRequest
     * @return UpdateAggregateConfigDeliverResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAggregateConfigDeliverResponse UpdateAggregateConfigDeliver(UpdateAggregateConfigDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAggregateConfigDeliver", UpdateAggregateConfigDeliverResponse.class);
    }

    /**
     *This API is used to edit rules for account groups.
     * @param req UpdateAggregateConfigRuleRequest
     * @return UpdateAggregateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAggregateConfigRuleResponse UpdateAggregateConfigRule(UpdateAggregateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAggregateConfigRule", UpdateAggregateConfigRuleResponse.class);
    }

    /**
     *Edit an account group.
     * @param req UpdateAggregatorRequest
     * @return UpdateAggregatorResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAggregatorResponse UpdateAggregator(UpdateAggregatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAggregator", UpdateAggregatorResponse.class);
    }

    /**
     *Updating an Alarm Rule
     * @param req UpdateAlarmPolicyRequest
     * @return UpdateAlarmPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlarmPolicyResponse UpdateAlarmPolicy(UpdateAlarmPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlarmPolicy", UpdateAlarmPolicyResponse.class);
    }

    /**
     *This API is used to edit a conformance pack.
     * @param req UpdateCompliancePackRequest
     * @return UpdateCompliancePackResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCompliancePackResponse UpdateCompliancePack(UpdateCompliancePackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCompliancePack", UpdateCompliancePackResponse.class);
    }

    /**
     *This API is used to enable or disable compliance packages.
     * @param req UpdateCompliancePackStatusRequest
     * @return UpdateCompliancePackStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCompliancePackStatusResponse UpdateCompliancePackStatus(UpdateCompliancePackStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCompliancePackStatus", UpdateCompliancePackStatusResponse.class);
    }

    /**
     *This API is used to edit shipping settings.
     * @param req UpdateConfigDeliverRequest
     * @return UpdateConfigDeliverResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConfigDeliverResponse UpdateConfigDeliver(UpdateConfigDeliverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConfigDeliver", UpdateConfigDeliverResponse.class);
    }

    /**
     *Edit the monitoring scope.
     * @param req UpdateConfigRecorderRequest
     * @return UpdateConfigRecorderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConfigRecorderResponse UpdateConfigRecorder(UpdateConfigRecorderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConfigRecorder", UpdateConfigRecorderResponse.class);
    }

    /**
     *This API is used to edit a rule.
     * @param req UpdateConfigRuleRequest
     * @return UpdateConfigRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConfigRuleResponse UpdateConfigRule(UpdateConfigRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConfigRule", UpdateConfigRuleResponse.class);
    }

    /**
     *This API is used to add alarm monitoring rules.
     * @param req UpdateRemediationRequest
     * @return UpdateRemediationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRemediationResponse UpdateRemediation(UpdateRemediationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRemediation", UpdateRemediationResponse.class);
    }

}
