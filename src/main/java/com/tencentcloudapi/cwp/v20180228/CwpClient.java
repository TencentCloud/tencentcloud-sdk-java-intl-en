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
package com.tencentcloudapi.cwp.v20180228;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cwp.v20180228.models.*;

public class CwpClient extends AbstractClient{
    private static String endpoint = "cwp.intl.tencentcloudapi.com";
    private static String service = "cwp";
    private static String version = "2018-02-28";

    public CwpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CwpClient(Credential credential, String region, ClientProfile profile) {
        super(CwpClient.endpoint, CwpClient.version, credential, region, profile);
    }

    /**
     *This API is used to add cross-region log-in allowlists in batches.
     * @param req AddLoginWhiteListsRequest
     * @return AddLoginWhiteListsResponse
     * @throws TencentCloudSDKException
     */
    public AddLoginWhiteListsResponse AddLoginWhiteLists(AddLoginWhiteListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddLoginWhiteLists", AddLoginWhiteListsResponse.class);
    }

    /**
     *This API is used to unignore the vulnerabilities.
     * @param req CancelIgnoreVulRequest
     * @return CancelIgnoreVulResponse
     * @throws TencentCloudSDKException
     */
    public CancelIgnoreVulResponse CancelIgnoreVul(CancelIgnoreVulRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelIgnoreVul", CancelIgnoreVulResponse.class);
    }

    /**
     *This API is used to ignore events or cancel ignoring in batches based on check item ID or event ID.
     * @param req ChangeRuleEventsIgnoreStatusRequest
     * @return ChangeRuleEventsIgnoreStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeRuleEventsIgnoreStatusResponse ChangeRuleEventsIgnoreStatus(ChangeRuleEventsIgnoreStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeRuleEventsIgnoreStatus", ChangeRuleEventsIgnoreStatusResponse.class);
    }

    /**
     *This API is used to change the policy availability status by policy ID.
     * @param req ChangeStrategyEnableStatusRequest
     * @return ChangeStrategyEnableStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeStrategyEnableStatusResponse ChangeStrategyEnableStatus(ChangeStrategyEnableStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeStrategyEnableStatus", ChangeStrategyEnableStatusResponse.class);
    }

    /**
     *This API is used to verify parameters entered for adding and editing high-risk command user rules.
     * @param req CheckBashPolicyParamsRequest
     * @return CheckBashPolicyParamsResponse
     * @throws TencentCloudSDKException
     */
    public CheckBashPolicyParamsResponse CheckBashPolicyParams(CheckBashPolicyParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckBashPolicyParams", CheckBashPolicyParamsResponse.class);
    }

    /**
     *This API is used to verify parameters entered for adding and editing high-risk command user rules.
     * @param req CheckBashRuleParamsRequest
     * @return CheckBashRuleParamsResponse
     * @throws TencentCloudSDKException
     */
    public CheckBashRuleParamsResponse CheckBashRuleParams(CheckBashRuleParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckBashRuleParams", CheckBashRuleParamsResponse.class);
    }

    /**
     *This API is used to check the rule parameters entered at the core file monitoring frontend.
     * @param req CheckFileTamperRuleRequest
     * @return CheckFileTamperRuleResponse
     * @throws TencentCloudSDKException
     */
    public CheckFileTamperRuleResponse CheckFileTamperRule(CheckFileTamperRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckFileTamperRule", CheckFileTamperRuleResponse.class);
    }

    /**
     *This API is used to query whether the baseline is detected for the first time.
     * @param req CheckFirstScanBaselineRequest
     * @return CheckFirstScanBaselineResponse
     * @throws TencentCloudSDKException
     */
    public CheckFirstScanBaselineResponse CheckFirstScanBaseline(CheckFirstScanBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckFirstScanBaseline", CheckFirstScanBaselineResponse.class);
    }

    /**
     *This API is used to check the connectivity for log shipping from Kafka.
     * @param req CheckLogKafkaConnectionStateRequest
     * @return CheckLogKafkaConnectionStateResponse
     * @throws TencentCloudSDKException
     */
    public CheckLogKafkaConnectionStateResponse CheckLogKafkaConnectionState(CheckLogKafkaConnectionStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckLogKafkaConnectionState", CheckLogKafkaConnectionStateResponse.class);
    }

    /**
     *This API is used to clean up the locally stored data.
     * @param req ClearLocalStorageRequest
     * @return ClearLocalStorageResponse
     * @throws TencentCloudSDKException
     */
    public ClearLocalStorageResponse ClearLocalStorage(ClearLocalStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearLocalStorage", ClearLocalStorageResponse.class);
    }

    /**
     *This API is used to add the list of block allowlists.
     * @param req CreateBanWhiteListRequest
     * @return CreateBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBanWhiteListResponse CreateBanWhiteList(CreateBanWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBanWhiteList", CreateBanWhiteListResponse.class);
    }

    /**
     *This API is used to create a baseline policy based on the policy information.
     * @param req CreateBaselineStrategyRequest
     * @return CreateBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineStrategyResponse CreateBaselineStrategy(CreateBaselineStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaselineStrategy", CreateBaselineStrategyResponse.class);
    }

    /**
     *This API is used to create an automatic binding task for newly purchased authorizations.
     * @param req CreateBuyBindTaskRequest
     * @return CreateBuyBindTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBuyBindTaskResponse CreateBuyBindTask(CreateBuyBindTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBuyBindTask", CreateBuyBindTaskResponse.class);
    }

    /**
     *This API is used to create emergency vulnerability scan tasks.
     * @param req CreateEmergencyVulScanRequest
     * @return CreateEmergencyVulScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateEmergencyVulScanResponse CreateEmergencyVulScan(CreateEmergencyVulScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEmergencyVulScan", CreateEmergencyVulScanResponse.class);
    }

    /**
     *This API is used to trigger event investigation and alarm backtracking for Ultimate Edition machines.
     * @param req CreateIncidentBacktrackingRequest
     * @return CreateIncidentBacktrackingResponse
     * @throws TencentCloudSDKException
     */
    public CreateIncidentBacktrackingResponse CreateIncidentBacktracking(CreateIncidentBacktrackingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIncidentBacktracking", CreateIncidentBacktrackingResponse.class);
    }

    /**
     *This API is used to create Professional/Flagship edition orders
.This API is used to support creating orders through prepaid and pay-as-you-go.
This API is used to directly create postpaid orders.
This API is used to call the billing payment API for payment since prepaid orders are only placed but not paid.
     * @param req CreateLicenseOrderRequest
     * @return CreateLicenseOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateLicenseOrderResponse CreateLicenseOrder(CreateLicenseOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLicenseOrder", CreateLicenseOrderResponse.class);
    }

    /**
     *This API is used to create log download tasks.
     * @param req CreateLogExportRequest
     * @return CreateLogExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogExportResponse CreateLogExport(CreateLogExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogExport", CreateLogExportResponse.class);
    }

    /**
     *This API is used to add malicious request allowlists.
     * @param req CreateMaliciousRequestWhiteListRequest
     * @return CreateMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateMaliciousRequestWhiteListResponse CreateMaliciousRequestWhiteList(CreateMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMaliciousRequestWhiteList", CreateMaliciousRequestWhiteListResponse.class);
    }

    /**
     *This API is used to create the Trojan allowlist.
     * @param req CreateMalwareWhiteListRequest
     * @return CreateMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateMalwareWhiteListResponse CreateMalwareWhiteList(CreateMalwareWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMalwareWhiteList", CreateMalwareWhiteListResponse.class);
    }

    /**
     *This API is used to create a network attack allowlist.
     * @param req CreateNetAttackWhiteListRequest
     * @return CreateNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetAttackWhiteListResponse CreateNetAttackWhiteList(CreateNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetAttackWhiteList", CreateNetAttackWhiteListResponse.class);
    }

    /**
     *This API is used to create or modify anti-ransomware policies.
     * @param req CreateRansomDefenseStrategyRequest
     * @return CreateRansomDefenseStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateRansomDefenseStrategyResponse CreateRansomDefenseStrategy(CreateRansomDefenseStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRansomDefenseStrategy", CreateRansomDefenseStrategyResponse.class);
    }

    /**
     *This API is used to detect the intrusion and virus scanning.
     * @param req CreateScanMalwareSettingRequest
     * @return CreateScanMalwareSettingResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanMalwareSettingResponse CreateScanMalwareSetting(CreateScanMalwareSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScanMalwareSetting", CreateScanMalwareSettingResponse.class);
    }

    /**
     *This API is used to add history search records.
     * @param req CreateSearchLogRequest
     * @return CreateSearchLogResponse
     * @throws TencentCloudSDKException
     */
    public CreateSearchLogResponse CreateSearchLog(CreateSearchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSearchLog", CreateSearchLogResponse.class);
    }

    /**
     *This API is used to add the	retrieval template.
     * @param req CreateSearchTemplateRequest
     * @return CreateSearchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSearchTemplateResponse CreateSearchTemplate(CreateSearchTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSearchTemplate", CreateSearchTemplateResponse.class);
    }

    /**
     *This API is used to submit the vulnerabilities and fix them.
     * @param req CreateVulFixRequest
     * @return CreateVulFixResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulFixResponse CreateVulFix(CreateVulFixRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulFix", CreateVulFixResponse.class);
    }

    /**
     *This API is used to create allowlist orders.
     * @param req CreateWhiteListOrderRequest
     * @return CreateWhiteListOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateWhiteListOrderResponse CreateWhiteListOrder(CreateWhiteListOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWhiteListOrder", CreateWhiteListOrderResponse.class);
    }

    /**
     *This API is used to delete all Java webshell events.
     * @param req DeleteAllJavaMemShellsRequest
     * @return DeleteAllJavaMemShellsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllJavaMemShellsResponse DeleteAllJavaMemShells(DeleteAllJavaMemShellsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAllJavaMemShells", DeleteAllJavaMemShellsResponse.class);
    }

    /**
     *This API is used to delete the list of blocking allowlists.
     * @param req DeleteBanWhiteListRequest
     * @return DeleteBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBanWhiteListResponse DeleteBanWhiteList(DeleteBanWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBanWhiteList", DeleteBanWhiteListResponse.class);
    }

    /**
     *This API is used to delete the baseline policy configuration.
     * @param req DeleteBaselinePolicyRequest
     * @return DeleteBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselinePolicyResponse DeleteBaselinePolicy(DeleteBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaselinePolicy", DeleteBaselinePolicyResponse.class);
    }

    /**
     *This API is used to delete the policy by baseline policy ID.
     * @param req DeleteBaselineStrategyRequest
     * @return DeleteBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineStrategyResponse DeleteBaselineStrategy(DeleteBaselineStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaselineStrategy", DeleteBaselineStrategyResponse.class);
    }

    /**
     *This API is used to delete high-risk command events based on IDs.
     * @param req DeleteBashEventsRequest
     * @return DeleteBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashEventsResponse DeleteBashEvents(DeleteBashEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBashEvents", DeleteBashEventsResponse.class);
    }

    /**
     *This API is used to delete high-risk command policies.
     * @param req DeleteBashPoliciesRequest
     * @return DeleteBashPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashPoliciesResponse DeleteBashPolicies(DeleteBashPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBashPolicies", DeleteBashPoliciesResponse.class);
    }

    /**
     *This API is used to delete high-risk command rules.
     * @param req DeleteBashRulesRequest
     * @return DeleteBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBashRulesResponse DeleteBashRules(DeleteBashRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBashRules", DeleteBashRulesResponse.class);
    }

    /**
     *This API is used to delete brute force attack records.
     * @param req DeleteBruteAttacksRequest
     * @return DeleteBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBruteAttacksResponse DeleteBruteAttacks(DeleteBruteAttacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBruteAttacks", DeleteBruteAttacksResponse.class);
    }

    /**
     *This API is used to delete expired orders in Authorization Management - Order List. (Deleted orders are not counted in statistics.)
     * @param req DeleteLicenseRecordRequest
     * @return DeleteLicenseRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLicenseRecordResponse DeleteLicenseRecord(DeleteLicenseRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLicenseRecord", DeleteLicenseRecordResponse.class);
    }

    /**
     *This API is used to delete all authorization records.
     * @param req DeleteLicenseRecordAllRequest
     * @return DeleteLicenseRecordAllResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLicenseRecordAllResponse DeleteLicenseRecordAll(DeleteLicenseRecordAllRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLicenseRecordAll", DeleteLicenseRecordAllResponse.class);
    }

    /**
     *This API is used to delete log download tasks.
     * @param req DeleteLogExportRequest
     * @return DeleteLogExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogExportResponse DeleteLogExport(DeleteLogExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogExport", DeleteLogExportResponse.class);
    }

    /**
     *This API is used to delete the cross-region log-in allowlist rules.
     * @param req DeleteLoginWhiteListRequest
     * @return DeleteLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoginWhiteListResponse DeleteLoginWhiteList(DeleteLoginWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoginWhiteList", DeleteLoginWhiteListResponse.class);
    }

    /**
     *This API is used to uninstall the CWPP client.
     * @param req DeleteMachineRequest
     * @return DeleteMachineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineResponse DeleteMachine(DeleteMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachine", DeleteMachineResponse.class);
    }

    /**
     *This API is used to delete clearing records of a machine.
     * @param req DeleteMachineClearHistoryRequest
     * @return DeleteMachineClearHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineClearHistoryResponse DeleteMachineClearHistory(DeleteMachineClearHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachineClearHistory", DeleteMachineClearHistoryResponse.class);
    }

    /**
     *This API is used to delete tags associated with the server.
     * @param req DeleteMachineTagRequest
     * @return DeleteMachineTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineTagResponse DeleteMachineTag(DeleteMachineTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachineTag", DeleteMachineTagResponse.class);
    }

    /**
     *This API is used to delete the malicious request allowlist.
     * @param req DeleteMaliciousRequestWhiteListRequest
     * @return DeleteMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaliciousRequestWhiteListResponse DeleteMaliciousRequestWhiteList(DeleteMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMaliciousRequestWhiteList", DeleteMaliciousRequestWhiteListResponse.class);
    }

    /**
     *This API is used to delete malicious request records.
     * @param req DeleteMaliciousRequestsRequest
     * @return DeleteMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMaliciousRequestsResponse DeleteMaliciousRequests(DeleteMaliciousRequestsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMaliciousRequests", DeleteMaliciousRequestsResponse.class);
    }

    /**
     *This API is used to terminate the scan tasks.
     * @param req DeleteMalwareScanTaskRequest
     * @return DeleteMalwareScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwareScanTaskResponse DeleteMalwareScanTask(DeleteMalwareScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMalwareScanTask", DeleteMalwareScanTaskResponse.class);
    }

    /**
     *This API is used to delete the Trojan whitelist.
     * @param req DeleteMalwareWhiteListRequest
     * @return DeleteMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwareWhiteListResponse DeleteMalwareWhiteList(DeleteMalwareWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMalwareWhiteList", DeleteMalwareWhiteListResponse.class);
    }

    /**
     *This API is used to delete Trojan records.
     * @param req DeleteMalwaresRequest
     * @return DeleteMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMalwaresResponse DeleteMalwares(DeleteMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMalwares", DeleteMalwaresResponse.class);
    }

    /**
     *This API is used to delete the network attack allowlist.
     * @param req DeleteNetAttackWhiteListRequest
     * @return DeleteNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetAttackWhiteListResponse DeleteNetAttackWhiteList(DeleteNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetAttackWhiteList", DeleteNetAttackWhiteListResponse.class);
    }

    /**
     *This API is used to delete cross-region log-in records.
     * @param req DeleteNonlocalLoginPlacesRequest
     * @return DeleteNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNonlocalLoginPlacesResponse DeleteNonlocalLoginPlaces(DeleteNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNonlocalLoginPlaces", DeleteNonlocalLoginPlacesResponse.class);
    }

    /**
     *This API is used to delete local privilege escalation based on IDs.
     * @param req DeletePrivilegeEventsRequest
     * @return DeletePrivilegeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivilegeEventsResponse DeletePrivilegeEvents(DeletePrivilegeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivilegeEvents", DeletePrivilegeEventsResponse.class);
    }

    /**
     *This API is used to delete local privilege elevation rules.
     * @param req DeletePrivilegeRulesRequest
     * @return DeletePrivilegeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivilegeRulesResponse DeletePrivilegeRules(DeletePrivilegeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivilegeRules", DeletePrivilegeRulesResponse.class);
    }

    /**
     *This API is used to delete Reverse Shell events based on IDs.
     * @param req DeleteReverseShellEventsRequest
     * @return DeleteReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellEventsResponse DeleteReverseShellEvents(DeleteReverseShellEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReverseShellEvents", DeleteReverseShellEventsResponse.class);
    }

    /**
     *This API is used to delete Reverse Shell rules.
     * @param req DeleteReverseShellRulesRequest
     * @return DeleteReverseShellRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReverseShellRulesResponse DeleteReverseShellRules(DeleteReverseShellRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReverseShellRules", DeleteReverseShellRulesResponse.class);
    }

    /**
     *This API is used to delete malicious request events.
     * @param req DeleteRiskDnsEventRequest
     * @return DeleteRiskDnsEventResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskDnsEventResponse DeleteRiskDnsEvent(DeleteRiskDnsEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskDnsEvent", DeleteRiskDnsEventResponse.class);
    }

    /**
     *This API is used to delete malicious request policies.
     * @param req DeleteRiskDnsPolicyRequest
     * @return DeleteRiskDnsPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskDnsPolicyResponse DeleteRiskDnsPolicy(DeleteRiskDnsPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskDnsPolicy", DeleteRiskDnsPolicyResponse.class);
    }

    /**
     *This API is used to stop scan tasks of a specified type.
     * @param req DeleteScanTaskRequest
     * @return DeleteScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScanTaskResponse DeleteScanTask(DeleteScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScanTask", DeleteScanTaskResponse.class);
    }

    /**
     *This API is used to delete the retrieval template.
     * @param req DeleteSearchTemplateRequest
     * @return DeleteSearchTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSearchTemplateResponse DeleteSearchTemplate(DeleteSearchTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSearchTemplate", DeleteSearchTemplateResponse.class);
    }

    /**
     *This API is used to delete tags.
     * @param req DeleteTagsRequest
     * @return DeleteTagsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagsResponse DeleteTags(DeleteTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTags", DeleteTagsResponse.class);
    }

    /**
     *This API is used to delete alarm policies.
     * @param req DeleteWebHookPolicyRequest
     * @return DeleteWebHookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebHookPolicyResponse DeleteWebHookPolicy(DeleteWebHookPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebHookPolicy", DeleteWebHookPolicyResponse.class);
    }

    /**
     *This API is used to delete the alert recipient.
     * @param req DeleteWebHookReceiverRequest
     * @return DeleteWebHookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebHookReceiverResponse DeleteWebHookReceiver(DeleteWebHookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebHookReceiver", DeleteWebHookReceiverResponse.class);
    }

    /**
     *This API is used to delete the rules of WeCom chatbots.
     * @param req DeleteWebHookRuleRequest
     * @return DeleteWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebHookRuleResponse DeleteWebHookRule(DeleteWebHookRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebHookRule", DeleteWebHookRuleResponse.class);
    }

    /**
     *This API is used to obtain the current grayscale configuration of the user.
     * @param req DescribeABTestConfigRequest
     * @return DescribeABTestConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeABTestConfigResponse DescribeABTestConfig(DescribeABTestConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeABTestConfig", DescribeABTestConfigResponse.class);
    }

    /**
     *This API is used to obtain the configured aeskey and aesiv.
     * @param req DescribeAESKeyRequest
     * @return DescribeAESKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAESKeyResponse DescribeAESKey(DescribeAESKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAESKey", DescribeAESKeyResponse.class);
    }

    /**
     *This API is used to obtain the account statistics data.
     * @param req DescribeAccountStatisticsRequest
     * @return DescribeAccountStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountStatisticsResponse DescribeAccountStatistics(DescribeAccountStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountStatistics", DescribeAccountStatisticsResponse.class);
    }

    /**
     *This API is used to obtain the agent installation command.
     * @param req DescribeAgentInstallCommandRequest
     * @return DescribeAgentInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstallCommandResponse DescribeAgentInstallCommand(DescribeAgentInstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentInstallCommand", DescribeAgentInstallCommandResponse.class);
    }

    /**
     *This API is used to obtain the token for installing the agent in a hybrid cloud environment.
     * @param req DescribeAgentInstallationTokenRequest
     * @return DescribeAgentInstallationTokenResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentInstallationTokenResponse DescribeAgentInstallationToken(DescribeAgentInstallationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentInstallationToken", DescribeAgentInstallationTokenResponse.class);
    }

    /**
     *This API is used to obtain all node information on the event corresponding to an alarm.
     * @param req DescribeAlarmIncidentNodesRequest
     * @return DescribeAlarmIncidentNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmIncidentNodesResponse DescribeAlarmIncidentNodes(DescribeAlarmIncidentNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmIncidentNodes", DescribeAlarmIncidentNodesResponse.class);
    }

    /**
     *This API is used to query the list of alarm IDs.
     * @param req DescribeAlarmVertexIdRequest
     * @return DescribeAlarmVertexIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmVertexIdResponse DescribeAlarmVertexId(DescribeAlarmVertexIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmVertexId", DescribeAlarmVertexIdResponse.class);
    }

    /**
     *This API is used to obtain the number of all software applications.
     * @param req DescribeAssetAppCountRequest
     * @return DescribeAssetAppCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppCountResponse DescribeAssetAppCount(DescribeAssetAppCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetAppCount", DescribeAssetAppCountResponse.class);
    }

    /**
     *This API is used to query the application list.
     * @param req DescribeAssetAppListRequest
     * @return DescribeAssetAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppListResponse DescribeAssetAppList(DescribeAssetAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetAppList", DescribeAssetAppListResponse.class);
    }

    /**
     *This API is used to obtain the list of software's associated processes.
     * @param req DescribeAssetAppProcessListRequest
     * @return DescribeAssetAppProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetAppProcessListResponse DescribeAssetAppProcessList(DescribeAssetAppProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetAppProcessList", DescribeAssetAppProcessListResponse.class);
    }

    /**
     *This API is used to obtain the kernel module details.
     * @param req DescribeAssetCoreModuleInfoRequest
     * @return DescribeAssetCoreModuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetCoreModuleInfoResponse DescribeAssetCoreModuleInfo(DescribeAssetCoreModuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetCoreModuleInfo", DescribeAssetCoreModuleInfoResponse.class);
    }

    /**
     *This API is used to query the list of asset management kernel modules.
     * @param req DescribeAssetCoreModuleListRequest
     * @return DescribeAssetCoreModuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetCoreModuleListResponse DescribeAssetCoreModuleList(DescribeAssetCoreModuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetCoreModuleList", DescribeAssetCoreModuleListResponse.class);
    }

    /**
     *This API is used to obtain the number of all databases.
     * @param req DescribeAssetDatabaseCountRequest
     * @return DescribeAssetDatabaseCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseCountResponse DescribeAssetDatabaseCount(DescribeAssetDatabaseCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDatabaseCount", DescribeAssetDatabaseCountResponse.class);
    }

    /**
     *This API is used to obtain the asset management database details.
     * @param req DescribeAssetDatabaseInfoRequest
     * @return DescribeAssetDatabaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseInfoResponse DescribeAssetDatabaseInfo(DescribeAssetDatabaseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDatabaseInfo", DescribeAssetDatabaseInfoResponse.class);
    }

    /**
     *This API is used to query the list of asset management databases.
     * @param req DescribeAssetDatabaseListRequest
     * @return DescribeAssetDatabaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDatabaseListResponse DescribeAssetDatabaseList(DescribeAssetDatabaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDatabaseList", DescribeAssetDatabaseListResponse.class);
    }

    /**
     *This API is used to obtain the host disk partition list.
     * @param req DescribeAssetDiskListRequest
     * @return DescribeAssetDiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDiskListResponse DescribeAssetDiskList(DescribeAssetDiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDiskList", DescribeAssetDiskListResponse.class);
    }

    /**
     *This API is used to query the list of asset management environment variables.
     * @param req DescribeAssetEnvListRequest
     * @return DescribeAssetEnvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetEnvListResponse DescribeAssetEnvList(DescribeAssetEnvListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetEnvList", DescribeAssetEnvListResponse.class);
    }

    /**
     *This API is used to obtain the total number of resources of the host.
     * @param req DescribeAssetHostTotalCountRequest
     * @return DescribeAssetHostTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetHostTotalCountResponse DescribeAssetHostTotalCount(DescribeAssetHostTotalCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetHostTotalCount", DescribeAssetHostTotalCountResponse.class);
    }

    /**
     *This API is used to obtain the number of assets, including hosts, accounts, ports, processes, software, databases, web applications, web frameworks, web services, and web sites.
     * @param req DescribeAssetInfoRequest
     * @return DescribeAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetInfoResponse DescribeAssetInfo(DescribeAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetInfo", DescribeAssetInfoResponse.class);
    }

    /**
     *This API is used to query the list of asset management start services.
     * @param req DescribeAssetInitServiceListRequest
     * @return DescribeAssetInitServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetInitServiceListResponse DescribeAssetInitServiceList(DescribeAssetInitServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetInitServiceList", DescribeAssetInitServiceListResponse.class);
    }

    /**
     *This API is used to obtain Jar package details.
     * @param req DescribeAssetJarInfoRequest
     * @return DescribeAssetJarInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetJarInfoResponse DescribeAssetJarInfo(DescribeAssetJarInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetJarInfo", DescribeAssetJarInfoResponse.class);
    }

    /**
     *This API is used to query the list of Jar packages.
     * @param req DescribeAssetJarListRequest
     * @return DescribeAssetJarListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetJarListResponse DescribeAssetJarList(DescribeAssetJarListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetJarList", DescribeAssetJarListResponse.class);
    }

    /**
     *This API is used to obtain the utilization of the system load, memory, and hard disk.
     * @param req DescribeAssetLoadInfoRequest
     * @return DescribeAssetLoadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetLoadInfoResponse DescribeAssetLoadInfo(DescribeAssetLoadInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetLoadInfo", DescribeAssetLoadInfoResponse.class);
    }

    /**
     *This API is used to obtain asset management host resource details.
     * @param req DescribeAssetMachineDetailRequest
     * @return DescribeAssetMachineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineDetailResponse DescribeAssetMachineDetail(DescribeAssetMachineDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetMachineDetail", DescribeAssetMachineDetailResponse.class);
    }

    /**
     *This API is used to obtain the resource monitoring list of the asset fingerprint page.
     * @param req DescribeAssetMachineListRequest
     * @return DescribeAssetMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineListResponse DescribeAssetMachineList(DescribeAssetMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetMachineList", DescribeAssetMachineListResponse.class);
    }

    /**
     *This API is used to obtain top 5 host tags.
     * @param req DescribeAssetMachineTagTopRequest
     * @return DescribeAssetMachineTagTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetMachineTagTopResponse DescribeAssetMachineTagTop(DescribeAssetMachineTagTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetMachineTagTop", DescribeAssetMachineTagTopResponse.class);
    }

    /**
     *This API is used to query the list of asset management plan tasks.
     * @param req DescribeAssetPlanTaskListRequest
     * @return DescribeAssetPlanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPlanTaskListResponse DescribeAssetPlanTaskList(DescribeAssetPlanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetPlanTaskList", DescribeAssetPlanTaskListResponse.class);
    }

    /**
     *This API is used to obtain the total number of ports.
     * @param req DescribeAssetPortCountRequest
     * @return DescribeAssetPortCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortCountResponse DescribeAssetPortCount(DescribeAssetPortCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetPortCount", DescribeAssetPortCountResponse.class);
    }

    /**
     *This API is used to obtain the list of asset management ports.
     * @param req DescribeAssetPortInfoListRequest
     * @return DescribeAssetPortInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetPortInfoListResponse DescribeAssetPortInfoList(DescribeAssetPortInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetPortInfoList", DescribeAssetPortInfoListResponse.class);
    }

    /**
     *This API is used to obtain the total number of processes.
     * @param req DescribeAssetProcessCountRequest
     * @return DescribeAssetProcessCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessCountResponse DescribeAssetProcessCount(DescribeAssetProcessCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetProcessCount", DescribeAssetProcessCountResponse.class);
    }

    /**
     *This API is used to obtain the list of asset management processes.
     * @param req DescribeAssetProcessInfoListRequest
     * @return DescribeAssetProcessInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessInfoListResponse DescribeAssetProcessInfoList(DescribeAssetProcessInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetProcessInfoList", DescribeAssetProcessInfoListResponse.class);
    }

    /**
     *This API is used to obtain the latest trend of hosts.
     * @param req DescribeAssetRecentMachineInfoRequest
     * @return DescribeAssetRecentMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetRecentMachineInfoResponse DescribeAssetRecentMachineInfo(DescribeAssetRecentMachineInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetRecentMachineInfo", DescribeAssetRecentMachineInfoResponse.class);
    }

    /**
     *This API is used to obtain the list of system installation packages for asset management.
     * @param req DescribeAssetSystemPackageListRequest
     * @return DescribeAssetSystemPackageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSystemPackageListResponse DescribeAssetSystemPackageList(DescribeAssetSystemPackageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSystemPackageList", DescribeAssetSystemPackageListResponse.class);
    }

    /**
     *This API is used to obtain the number of resources, including hosts, accounts, ports, processes, software, databases, web applications, web frameworks, web services, and web sites.
     * @param req DescribeAssetTotalCountRequest
     * @return DescribeAssetTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTotalCountResponse DescribeAssetTotalCount(DescribeAssetTotalCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTotalCount", DescribeAssetTotalCountResponse.class);
    }

    /**
     *This API is used to obtain Top5 resources of various types.
     * @param req DescribeAssetTypeTopRequest
     * @return DescribeAssetTypeTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTypeTopResponse DescribeAssetTypeTop(DescribeAssetTypeTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTypeTop", DescribeAssetTypeTopResponse.class);
    }

    /**
     *This API is used to obtain the asset fingerprint type list.
     * @param req DescribeAssetTypesRequest
     * @return DescribeAssetTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTypesResponse DescribeAssetTypes(DescribeAssetTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTypes", DescribeAssetTypesResponse.class);
    }

    /**
     *This API is used to obtain the total number of accounts.
     * @param req DescribeAssetUserCountRequest
     * @return DescribeAssetUserCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserCountResponse DescribeAssetUserCount(DescribeAssetUserCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetUserCount", DescribeAssetUserCountResponse.class);
    }

    /**
     *This API is used to obtain host account details.
     * @param req DescribeAssetUserInfoRequest
     * @return DescribeAssetUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserInfoResponse DescribeAssetUserInfo(DescribeAssetUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetUserInfo", DescribeAssetUserInfoResponse.class);
    }

    /**
     *This API is used to obtain the list of host account Keys.
     * @param req DescribeAssetUserKeyListRequest
     * @return DescribeAssetUserKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserKeyListResponse DescribeAssetUserKeyList(DescribeAssetUserKeyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetUserKeyList", DescribeAssetUserKeyListResponse.class);
    }

    /**
     *This API is used to obtain the list of accounts.
     * @param req DescribeAssetUserListRequest
     * @return DescribeAssetUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetUserListResponse DescribeAssetUserList(DescribeAssetUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetUserList", DescribeAssetUserListResponse.class);
    }

    /**
     *This API is used to obtain the number of all web applications.
     * @param req DescribeAssetWebAppCountRequest
     * @return DescribeAssetWebAppCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppCountResponse DescribeAssetWebAppCount(DescribeAssetWebAppCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebAppCount", DescribeAssetWebAppCountResponse.class);
    }

    /**
     *This API is used to obtain the list of asset management web applications.
     * @param req DescribeAssetWebAppListRequest
     * @return DescribeAssetWebAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppListResponse DescribeAssetWebAppList(DescribeAssetWebAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebAppList", DescribeAssetWebAppListResponse.class);
    }

    /**
     *This API is used to obtain the list of asset management Web application plugins.
     * @param req DescribeAssetWebAppPluginListRequest
     * @return DescribeAssetWebAppPluginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebAppPluginListResponse DescribeAssetWebAppPluginList(DescribeAssetWebAppPluginListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebAppPluginList", DescribeAssetWebAppPluginListResponse.class);
    }

    /**
     *This API is used to obtain the number of all Web frameworks.
     * @param req DescribeAssetWebFrameCountRequest
     * @return DescribeAssetWebFrameCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebFrameCountResponse DescribeAssetWebFrameCount(DescribeAssetWebFrameCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebFrameCount", DescribeAssetWebFrameCountResponse.class);
    }

    /**
     *This API is used to obtain the list of asset management Web frameworks.
     * @param req DescribeAssetWebFrameListRequest
     * @return DescribeAssetWebFrameListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebFrameListResponse DescribeAssetWebFrameList(DescribeAssetWebFrameListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebFrameList", DescribeAssetWebFrameListResponse.class);
    }

    /**
     *This API is used to obtain the total number of Web sites.
     * @param req DescribeAssetWebLocationCountRequest
     * @return DescribeAssetWebLocationCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationCountResponse DescribeAssetWebLocationCount(DescribeAssetWebLocationCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebLocationCount", DescribeAssetWebLocationCountResponse.class);
    }

    /**
     *This API is used to obtain the Web site details.
     * @param req DescribeAssetWebLocationInfoRequest
     * @return DescribeAssetWebLocationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationInfoResponse DescribeAssetWebLocationInfo(DescribeAssetWebLocationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebLocationInfo", DescribeAssetWebLocationInfoResponse.class);
    }

    /**
     *This API is used to obtain the list of Web sites.
     * @param req DescribeAssetWebLocationListRequest
     * @return DescribeAssetWebLocationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationListResponse DescribeAssetWebLocationList(DescribeAssetWebLocationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebLocationList", DescribeAssetWebLocationListResponse.class);
    }

    /**
     *This API is used to obtain the list of Web sites' virtual directories.
     * @param req DescribeAssetWebLocationPathListRequest
     * @return DescribeAssetWebLocationPathListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebLocationPathListResponse DescribeAssetWebLocationPathList(DescribeAssetWebLocationPathListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebLocationPathList", DescribeAssetWebLocationPathListResponse.class);
    }

    /**
     *This API is used to obtain the number of all web services.
     * @param req DescribeAssetWebServiceCountRequest
     * @return DescribeAssetWebServiceCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceCountResponse DescribeAssetWebServiceCount(DescribeAssetWebServiceCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebServiceCount", DescribeAssetWebServiceCountResponse.class);
    }

    /**
     *This API is used to query the list of asset management Web services.
     * @param req DescribeAssetWebServiceInfoListRequest
     * @return DescribeAssetWebServiceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceInfoListResponse DescribeAssetWebServiceInfoList(DescribeAssetWebServiceInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebServiceInfoList", DescribeAssetWebServiceInfoListResponse.class);
    }

    /**
     *This API is used to obtain the list of processes associated with Web services.
     * @param req DescribeAssetWebServiceProcessListRequest
     * @return DescribeAssetWebServiceProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetWebServiceProcessListResponse DescribeAssetWebServiceProcessList(DescribeAssetWebServiceProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetWebServiceProcessList", DescribeAssetWebServiceProcessListResponse.class);
    }

    /**
     *This API is used to obtain network attack details.
     * @param req DescribeAttackEventInfoRequest
     * @return DescribeAttackEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackEventInfoResponse DescribeAttackEventInfo(DescribeAttackEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackEventInfo", DescribeAttackEventInfoResponse.class);
    }

    /**
     *This API is used to display the list of network attack detection events in pagination.
     * @param req DescribeAttackEventsRequest
     * @return DescribeAttackEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackEventsResponse DescribeAttackEvents(DescribeAttackEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackEvents", DescribeAttackEventsResponse.class);
    }

    /**
     *DescribeAttackEvents 代替

This API is used to display the list of network attack logs in pagination.
     * @param req DescribeAttackLogsRequest
     * @return DescribeAttackLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackLogsResponse DescribeAttackLogs(DescribeAttackLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackLogs", DescribeAttackLogsResponse.class);
    }

    /**
     *已废弃

This API is used to backtrack attacks.
     * @param req DescribeAttackSourceRequest
     * @return DescribeAttackSourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackSourceResponse DescribeAttackSource(DescribeAttackSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackSource", DescribeAttackSourceResponse.class);
    }

    /**
     *已废弃

This API is used to query attack backtracking events.
     * @param req DescribeAttackSourceEventsRequest
     * @return DescribeAttackSourceEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackSourceEventsResponse DescribeAttackSourceEvents(DescribeAttackSourceEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackSourceEvents", DescribeAttackSourceEventsResponse.class);
    }

    /**
     *This API is used to obtain the statistics of network attack data.
     * @param req DescribeAttackStatisticsRequest
     * @return DescribeAttackStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackStatisticsResponse DescribeAttackStatistics(DescribeAttackStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackStatistics", DescribeAttackStatisticsResponse.class);
    }

    /**
     *This API is used to obtain the list of Top 5 network attacks.
     * @param req DescribeAttackTopRequest
     * @return DescribeAttackTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackTopResponse DescribeAttackTop(DescribeAttackTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackTop", DescribeAttackTopResponse.class);
    }

    /**
     *This API is used to obtain the network attack trend data.
     * @param req DescribeAttackTrendsRequest
     * @return DescribeAttackTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackTrendsResponse DescribeAttackTrends(DescribeAttackTrendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackTrends", DescribeAttackTrendsResponse.class);
    }

    /**
     *This API is used to obtain the list of network attack threat types.
     * @param req DescribeAttackVulTypeListRequest
     * @return DescribeAttackVulTypeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackVulTypeListResponse DescribeAttackVulTypeList(DescribeAttackVulTypeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttackVulTypeList", DescribeAttackVulTypeListResponse.class);
    }

    /**
     *This API is used to obtain available order details.
     * @param req DescribeAvailableExpertServiceDetailRequest
     * @return DescribeAvailableExpertServiceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableExpertServiceDetailResponse DescribeAvailableExpertServiceDetail(DescribeAvailableExpertServiceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableExpertServiceDetail", DescribeAvailableExpertServiceDetailResponse.class);
    }

    /**
     *This API is used to obtain the brute-force blocking mode.
     * @param req DescribeBanModeRequest
     * @return DescribeBanModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanModeResponse DescribeBanMode(DescribeBanModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBanMode", DescribeBanModeResponse.class);
    }

    /**
     *This API is used to obtain the block region.
     * @param req DescribeBanRegionsRequest
     * @return DescribeBanRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanRegionsResponse DescribeBanRegions(DescribeBanRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBanRegions", DescribeBanRegionsResponse.class);
    }

    /**
     *This API is used to obtain the block button status.
     * @param req DescribeBanStatusRequest
     * @return DescribeBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanStatusResponse DescribeBanStatus(DescribeBanStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBanStatus", DescribeBanStatusResponse.class);
    }

    /**
     *This API is used to obtain the blocking allowlist list.
     * @param req DescribeBanWhiteListRequest
     * @return DescribeBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBanWhiteListResponse DescribeBanWhiteList(DescribeBanWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBanWhiteList", DescribeBanWhiteListResponse.class);
    }

    /**
     *This API is used to query the list of baseline basic information.
     * @param req DescribeBaselineBasicInfoRequest
     * @return DescribeBaselineBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineBasicInfoResponse DescribeBaselineBasicInfo(DescribeBaselineBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineBasicInfo", DescribeBaselineBasicInfoResponse.class);
    }

    /**
     *This API is used to query the list information of default policies of the baseline.
     * @param req DescribeBaselineDefaultStrategyListRequest
     * @return DescribeBaselineDefaultStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDefaultStrategyListResponse DescribeBaselineDefaultStrategyList(DescribeBaselineDefaultStrategyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineDefaultStrategyList", DescribeBaselineDefaultStrategyListResponse.class);
    }

    /**
     *This API is used to query baseline details by baseline ID.
     * @param req DescribeBaselineDetailRequest
     * @return DescribeBaselineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineDetailResponse DescribeBaselineDetail(DescribeBaselineDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineDetail", DescribeBaselineDetailResponse.class);
    }

    /**
     *This API is used to query the list of hosts affected by a baseline based on baseline ID.
     * @param req DescribeBaselineEffectHostListRequest
     * @return DescribeBaselineEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineEffectHostListResponse DescribeBaselineEffectHostList(DescribeBaselineEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineEffectHostList", DescribeBaselineEffectHostListResponse.class);
    }

    /**
     *This API is used to obtain the list of hosts for baseline detection.
     * @param req DescribeBaselineHostDetectListRequest
     * @return DescribeBaselineHostDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostDetectListResponse DescribeBaselineHostDetectList(DescribeBaselineHostDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineHostDetectList", DescribeBaselineHostDetectListResponse.class);
    }

    /**
     *This API is used to return Top N risky servers.
     * @param req DescribeBaselineHostTopRequest
     * @return DescribeBaselineHostTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineHostTopResponse DescribeBaselineHostTop(DescribeBaselineHostTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineHostTop", DescribeBaselineHostTopResponse.class);
    }

    /**
     *This API is used to obtain the list of baseline detection items.
     * @param req DescribeBaselineItemDetectListRequest
     * @return DescribeBaselineItemDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemDetectListResponse DescribeBaselineItemDetectList(DescribeBaselineItemDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineItemDetectList", DescribeBaselineItemDetectListResponse.class);
    }

    /**
     *This API is used to obtain the list of check results on baseline check items.
     * @param req DescribeBaselineItemListRequest
     * @return DescribeBaselineItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemListResponse DescribeBaselineItemList(DescribeBaselineItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineItemList", DescribeBaselineItemListResponse.class);
    }

    /**
     *This API is used to query the information of the baseline list.
     * @param req DescribeBaselineListRequest
     * @return DescribeBaselineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineListResponse DescribeBaselineList(DescribeBaselineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineList", DescribeBaselineListResponse.class);
    }

    /**
     *This API is used to obtain the list of baseline policies.
     * @param req DescribeBaselinePolicyListRequest
     * @return DescribeBaselinePolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyListResponse DescribeBaselinePolicyList(DescribeBaselinePolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyList", DescribeBaselinePolicyListResponse.class);
    }

    /**
     *This API is used to query the information on corresponding check items based on baseline ID.
     * @param req DescribeBaselineRuleRequest
     * @return DescribeBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineRuleResponse DescribeBaselineRule(DescribeBaselineRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineRule", DescribeBaselineRuleResponse.class);
    }

    /**
     *This API is used to query the baseline detection progress by task ID.
     * @param req DescribeBaselineScanScheduleRequest
     * @return DescribeBaselineScanScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineScanScheduleResponse DescribeBaselineScanSchedule(DescribeBaselineScanScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineScanSchedule", DescribeBaselineScanScheduleResponse.class);
    }

    /**
     *This API is used to query policy details by baseline policy ID.
     * @param req DescribeBaselineStrategyDetailRequest
     * @return DescribeBaselineStrategyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineStrategyDetailResponse DescribeBaselineStrategyDetail(DescribeBaselineStrategyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineStrategyDetail", DescribeBaselineStrategyDetailResponse.class);
    }

    /**
     *This API is used to query the information of baseline policies under the same user.
     * @param req DescribeBaselineStrategyListRequest
     * @return DescribeBaselineStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineStrategyListResponse DescribeBaselineStrategyList(DescribeBaselineStrategyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineStrategyList", DescribeBaselineStrategyListResponse.class);
    }

    /**
     *This API is used to query TOP baseline detection items based on policy IDs.
     * @param req DescribeBaselineTopRequest
     * @return DescribeBaselineTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineTopResponse DescribeBaselineTop(DescribeBaselineTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineTop", DescribeBaselineTopResponse.class);
    }

    /**
     *This API is used to obtain the list of baseline weak passwords.
     * @param req DescribeBaselineWeakPasswordListRequest
     * @return DescribeBaselineWeakPasswordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineWeakPasswordListResponse DescribeBaselineWeakPasswordList(DescribeBaselineWeakPasswordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineWeakPasswordList", DescribeBaselineWeakPasswordListResponse.class);
    }

    /**
     *This API is used to obtain the high-risk command list.
     * @param req DescribeBashEventsRequest
     * @return DescribeBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsResponse DescribeBashEvents(DescribeBashEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashEvents", DescribeBashEventsResponse.class);
    }

    /**
     *This API is used to query high-risk command event details.
     * @param req DescribeBashEventsInfoRequest
     * @return DescribeBashEventsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsInfoResponse DescribeBashEventsInfo(DescribeBashEventsInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashEventsInfo", DescribeBashEventsInfoResponse.class);
    }

    /**
     *This API is used to query high-risk command event details (new).
     * @param req DescribeBashEventsInfoNewRequest
     * @return DescribeBashEventsInfoNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsInfoNewResponse DescribeBashEventsInfoNew(DescribeBashEventsInfoNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashEventsInfoNew", DescribeBashEventsInfoNewResponse.class);
    }

    /**
     *This API is used to obtain the list of high-risk commands (new).
     * @param req DescribeBashEventsNewRequest
     * @return DescribeBashEventsNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashEventsNewResponse DescribeBashEventsNew(DescribeBashEventsNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashEventsNew", DescribeBashEventsNewResponse.class);
    }

    /**
     *This API is used to obtain the list of high-risk command policies.
     * @param req DescribeBashPoliciesRequest
     * @return DescribeBashPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashPoliciesResponse DescribeBashPolicies(DescribeBashPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashPolicies", DescribeBashPoliciesResponse.class);
    }

    /**
     *This API is used to obtain the list of high-risk command rules.
     * @param req DescribeBashRulesRequest
     * @return DescribeBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBashRulesResponse DescribeBashRules(DescribeBashRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBashRules", DescribeBashRulesResponse.class);
    }

    /**
     *This API is used to obtain the list of password cracking.
     * @param req DescribeBruteAttackListRequest
     * @return DescribeBruteAttackListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttackListResponse DescribeBruteAttackList(DescribeBruteAttackListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBruteAttackList", DescribeBruteAttackListResponse.class);
    }

    /**
     *This API is used to obtain brute force cracking rules.
     * @param req DescribeBruteAttackRulesRequest
     * @return DescribeBruteAttackRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBruteAttackRulesResponse DescribeBruteAttackRules(DescribeBruteAttackRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBruteAttackRules", DescribeBruteAttackRulesResponse.class);
    }

    /**
     *This API is used to query the fixable host information.
     * @param req DescribeCanFixVulMachineRequest
     * @return DescribeCanFixVulMachineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCanFixVulMachineResponse DescribeCanFixVulMachine(DescribeCanFixVulMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCanFixVulMachine", DescribeCanFixVulMachineResponse.class);
    }

    /**
     *This API is used to obtain hosts where Trojans cannot be isolated.
     * @param req DescribeCanNotSeparateMachineRequest
     * @return DescribeCanNotSeparateMachineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCanNotSeparateMachineResponse DescribeCanNotSeparateMachine(DescribeCanNotSeparateMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCanNotSeparateMachine", DescribeCanNotSeparateMachineResponse.class);
    }

    /**
     *This API is used to obtain client exception events.
     * @param req DescribeClientExceptionRequest
     * @return DescribeClientExceptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientExceptionResponse DescribeClientException(DescribeClientExceptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientException", DescribeClientExceptionResponse.class);
    }

    /**
     *接口已无效

This API is used to obtain the data of the component statistics list.
     * @param req DescribeComponentStatisticsRequest
     * @return DescribeComponentStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComponentStatisticsResponse DescribeComponentStatistics(DescribeComponentStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComponentStatistics", DescribeComponentStatisticsResponse.class);
    }

    /**
     *This API is used to obtain vulnerability defense event details.
     * @param req DescribeDefenceEventDetailRequest
     * @return DescribeDefenceEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefenceEventDetailResponse DescribeDefenceEventDetail(DescribeDefenceEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefenceEventDetail", DescribeDefenceEventDetailResponse.class);
    }

    /**
     *This API is used to obtain DC agent installation command, including the token.
     * @param req DescribeDirectConnectInstallCommandRequest
     * @return DescribeDirectConnectInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectInstallCommandResponse DescribeDirectConnectInstallCommand(DescribeDirectConnectInstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDirectConnectInstallCommand", DescribeDirectConnectInstallCommandResponse.class);
    }

    /**
     *This API is used to obtain the aggregation result of the ES field.
     * @param req DescribeESAggregationsRequest
     * @return DescribeESAggregationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeESAggregationsResponse DescribeESAggregations(DescribeESAggregationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeESAggregations", DescribeESAggregationsResponse.class);
    }

    /**
     *This API is used to obtain the emergency response list.
     * @param req DescribeEmergencyResponseListRequest
     * @return DescribeEmergencyResponseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmergencyResponseListResponse DescribeEmergencyResponseList(DescribeEmergencyResponseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmergencyResponseList", DescribeEmergencyResponseListResponse.class);
    }

    /**
     *This API is used to obtain the list of emergency vulnerabilities.
     * @param req DescribeEmergencyVulListRequest
     * @return DescribeEmergencyVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEmergencyVulListResponse DescribeEmergencyVulList(DescribeEmergencyVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEmergencyVulList", DescribeEmergencyVulListResponse.class);
    }

    /**
     *This API is used to query alarm event details based on event table names and IDs.
     * @param req DescribeEventByTableRequest
     * @return DescribeEventByTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventByTableResponse DescribeEventByTable(DescribeEventByTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventByTable", DescribeEventByTableResponse.class);
    }

    /**
     *This API is used to obtain the security manager list.
     * @param req DescribeExpertServiceListRequest
     * @return DescribeExpertServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExpertServiceListResponse DescribeExpertServiceList(DescribeExpertServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExpertServiceList", DescribeExpertServiceListResponse.class);
    }

    /**
     *This API is used to obtain the expert service order list.
     * @param req DescribeExpertServiceOrderListRequest
     * @return DescribeExpertServiceOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExpertServiceOrderListResponse DescribeExpertServiceOrderList(DescribeExpertServiceOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExpertServiceOrderList", DescribeExpertServiceOrderListResponse.class);
    }

    /**
     *This API is used to export the list of hosts in a specific region.
     * @param req DescribeExportMachinesRequest
     * @return DescribeExportMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportMachinesResponse DescribeExportMachines(DescribeExportMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportMachines", DescribeExportMachinesResponse.class);
    }

    /**
     *This API is used to quickly analyze and count logs.
     * @param req DescribeFastAnalysisRequest
     * @return DescribeFastAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFastAnalysisResponse DescribeFastAnalysis(DescribeFastAnalysisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFastAnalysis", DescribeFastAnalysisResponse.class);
    }

    /**
     *This API is used to view the rule details API when an event occurs.
     * @param req DescribeFileTamperEventRuleInfoRequest
     * @return DescribeFileTamperEventRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperEventRuleInfoResponse DescribeFileTamperEventRuleInfo(DescribeFileTamperEventRuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperEventRuleInfo", DescribeFileTamperEventRuleInfoResponse.class);
    }

    /**
     *This API is used to obtain the list of core file monitoring events.
     * @param req DescribeFileTamperEventsRequest
     * @return DescribeFileTamperEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperEventsResponse DescribeFileTamperEvents(DescribeFileTamperEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperEvents", DescribeFileTamperEventsResponse.class);
    }

    /**
     *This API is used to query the number of rules for monitoring files associated with a host.
     * @param req DescribeFileTamperRuleCountRequest
     * @return DescribeFileTamperRuleCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperRuleCountResponse DescribeFileTamperRuleCount(DescribeFileTamperRuleCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperRuleCount", DescribeFileTamperRuleCountResponse.class);
    }

    /**
     *This API is used to query details of a monitoring rule.
     * @param req DescribeFileTamperRuleInfoRequest
     * @return DescribeFileTamperRuleInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperRuleInfoResponse DescribeFileTamperRuleInfo(DescribeFileTamperRuleInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperRuleInfo", DescribeFileTamperRuleInfoResponse.class);
    }

    /**
     *This API is used to obtain the list of core file monitoring rules.
     * @param req DescribeFileTamperRulesRequest
     * @return DescribeFileTamperRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTamperRulesResponse DescribeFileTamperRules(DescribeFileTamperRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileTamperRules", DescribeFileTamperRulesResponse.class);
    }

    /**
     *This API is used to obtain the statistics data of hosts.
     * @param req DescribeGeneralStatRequest
     * @return DescribeGeneralStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGeneralStatResponse DescribeGeneralStat(DescribeGeneralStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGeneralStat", DescribeGeneralStatResponse.class);
    }

    /**
     *This API is used to obtain the data of the account change history list.
     * @param req DescribeHistoryAccountsRequest
     * @return DescribeHistoryAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryAccountsResponse DescribeHistoryAccounts(DescribeHistoryAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHistoryAccounts", DescribeHistoryAccountsResponse.class);
    }

    /**
     *This API is used to query the log retrieval service information.
     * @param req DescribeHistoryServiceRequest
     * @return DescribeHistoryServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryServiceResponse DescribeHistoryService(DescribeHistoryServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHistoryService", DescribeHistoryServiceResponse.class);
    }

    /**
     *This API is used to query the host and tag information.
     * @param req DescribeHostInfoRequest
     * @return DescribeHostInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostInfoResponse DescribeHostInfo(DescribeHostInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostInfo", DescribeHostInfoResponse.class);
    }

    /**
     *This API is used to retrieve the log-in audit list.
     * @param req DescribeHostLoginListRequest
     * @return DescribeHostLoginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLoginListResponse DescribeHostLoginList(DescribeHostLoginListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostLoginList", DescribeHostLoginListResponse.class);
    }

    /**
     *This API is used to obtain hot spot vulnerabilities across the entire network.
     * @param req DescribeHotVulTopRequest
     * @return DescribeHotVulTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHotVulTopResponse DescribeHotVulTop(DescribeHotVulTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHotVulTop", DescribeHotVulTopResponse.class);
    }

    /**
     *This API is used to query the information of ignored inspection items.
     * @param req DescribeIgnoreBaselineRuleRequest
     * @return DescribeIgnoreBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreBaselineRuleResponse DescribeIgnoreBaselineRule(DescribeIgnoreBaselineRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIgnoreBaselineRule", DescribeIgnoreBaselineRuleResponse.class);
    }

    /**
     *This API is used to obtain the information of affected inspection items and hosts ignored with one click.
     * @param req DescribeIgnoreHostAndItemConfigRequest
     * @return DescribeIgnoreHostAndItemConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreHostAndItemConfigResponse DescribeIgnoreHostAndItemConfig(DescribeIgnoreHostAndItemConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIgnoreHostAndItemConfig", DescribeIgnoreHostAndItemConfigResponse.class);
    }

    /**
     *This API is used to query the information on the list of hosts affected by ignored detection items based on detection item IDs and filter criteria.
     * @param req DescribeIgnoreRuleEffectHostListRequest
     * @return DescribeIgnoreRuleEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIgnoreRuleEffectHostListResponse DescribeIgnoreRuleEffectHostList(DescribeIgnoreRuleEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIgnoreRuleEffectHostList", DescribeIgnoreRuleEffectHostListResponse.class);
    }

    /**
     *接口已废弃

This API is used to obtain the index list.
     * @param req DescribeIndexListRequest
     * @return DescribeIndexListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexListResponse DescribeIndexList(DescribeIndexListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndexList", DescribeIndexListResponse.class);
    }

    /**
     *This API is used to query Java webshell event details.
     * @param req DescribeJavaMemShellInfoRequest
     * @return DescribeJavaMemShellInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellInfoResponse DescribeJavaMemShellInfo(DescribeJavaMemShellInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJavaMemShellInfo", DescribeJavaMemShellInfoResponse.class);
    }

    /**
     *This API is used to query the list of Java webshell events.
     * @param req DescribeJavaMemShellListRequest
     * @return DescribeJavaMemShellListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellListResponse DescribeJavaMemShellList(DescribeJavaMemShellListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJavaMemShellList", DescribeJavaMemShellListResponse.class);
    }

    /**
     *This API is used to query the Java webshell plugin information of the given host.
     * @param req DescribeJavaMemShellPluginInfoRequest
     * @return DescribeJavaMemShellPluginInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellPluginInfoResponse DescribeJavaMemShellPluginInfo(DescribeJavaMemShellPluginInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJavaMemShellPluginInfo", DescribeJavaMemShellPluginInfoResponse.class);
    }

    /**
     *This API is used to query the Java webshell plugin list.
     * @param req DescribeJavaMemShellPluginListRequest
     * @return DescribeJavaMemShellPluginListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJavaMemShellPluginListResponse DescribeJavaMemShellPluginList(DescribeJavaMemShellPluginListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJavaMemShellPluginList", DescribeJavaMemShellPluginListResponse.class);
    }

    /**
     *This API is used to query the authorization information.
     * @param req DescribeLicenseRequest
     * @return DescribeLicenseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseResponse DescribeLicense(DescribeLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicense", DescribeLicenseResponse.class);
    }

    /**
     *This API is used to obtain the list of authorized machines bound to an authorization under the Settings Center-Authorization Management.
     * @param req DescribeLicenseBindListRequest
     * @return DescribeLicenseBindListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseBindListResponse DescribeLicenseBindList(DescribeLicenseBindListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseBindList", DescribeLicenseBindListResponse.class);
    }

    /**
     *This API is used to query the binding task progress of the authorization.
     * @param req DescribeLicenseBindScheduleRequest
     * @return DescribeLicenseBindScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseBindScheduleResponse DescribeLicenseBindSchedule(DescribeLicenseBindScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseBindSchedule", DescribeLicenseBindScheduleResponse.class);
    }

    /**
     *This API is used to obtain the authorization overview information.
     * @param req DescribeLicenseGeneralRequest
     * @return DescribeLicenseGeneralResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseGeneralResponse DescribeLicenseGeneral(DescribeLicenseGeneralRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseGeneral", DescribeLicenseGeneralResponse.class);
    }

    /**
     *This API is used to obtain all authorization orders of a user.
     * @param req DescribeLicenseListRequest
     * @return DescribeLicenseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseListResponse DescribeLicenseList(DescribeLicenseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseList", DescribeLicenseListResponse.class);
    }

    /**
     *This API is used to query the available configurations for authorization allowlists.
     * @param req DescribeLicenseWhiteConfigRequest
     * @return DescribeLicenseWhiteConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseWhiteConfigResponse DescribeLicenseWhiteConfig(DescribeLicenseWhiteConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseWhiteConfig", DescribeLicenseWhiteConfigResponse.class);
    }

    /**
     *This API is used to query the list of logs available for shipping to Kafka.
     * @param req DescribeLogDeliveryKafkaOptionsRequest
     * @return DescribeLogDeliveryKafkaOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogDeliveryKafkaOptionsResponse DescribeLogDeliveryKafkaOptions(DescribeLogDeliveryKafkaOptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogDeliveryKafkaOptions", DescribeLogDeliveryKafkaOptionsResponse.class);
    }

    /**
     *This API is used to obtain the list of log download tasks.
     * @param req DescribeLogExportsRequest
     * @return DescribeLogExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogExportsResponse DescribeLogExports(DescribeLogExportsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogExports", DescribeLogExportsResponse.class);
    }

    /**
     *This API is used to obtain the log histogram information.
     * @param req DescribeLogHistogramRequest
     * @return DescribeLogHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogHistogramResponse DescribeLogHistogram(DescribeLogHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogHistogram", DescribeLogHistogramResponse.class);
    }

    /**
     *This API is used to query the index.
     * @param req DescribeLogIndexRequest
     * @return DescribeLogIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogIndexResponse DescribeLogIndex(DescribeLogIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogIndex", DescribeLogIndexResponse.class);
    }

    /**
     *This API is used to obtain the information of Kafka shipping.
     * @param req DescribeLogKafkaDeliverInfoRequest
     * @return DescribeLogKafkaDeliverInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogKafkaDeliverInfoResponse DescribeLogKafkaDeliverInfo(DescribeLogKafkaDeliverInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogKafkaDeliverInfo", DescribeLogKafkaDeliverInfoResponse.class);
    }

    /**
     *This API is used to obtain the log storage configuration.
     * @param req DescribeLogStorageConfigRequest
     * @return DescribeLogStorageConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageConfigResponse DescribeLogStorageConfig(DescribeLogStorageConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogStorageConfig", DescribeLogStorageConfigResponse.class);
    }

    /**
     *This API is used to obtain the record of stored log size.
     * @param req DescribeLogStorageRecordRequest
     * @return DescribeLogStorageRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageRecordResponse DescribeLogStorageRecord(DescribeLogStorageRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogStorageRecord", DescribeLogStorageRecordResponse.class);
    }

    /**
     *This API is used to obtain the statistics of the used log retrieval capacity.
     * @param req DescribeLogStorageStatisticRequest
     * @return DescribeLogStorageStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogStorageStatisticResponse DescribeLogStorageStatistic(DescribeLogStorageStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogStorageStatistic", DescribeLogStorageStatisticResponse.class);
    }

    /**
     *This API is used to obtain log types, and the returned result of this API indicates temporarily filterable log types.
     * @param req DescribeLogTypeRequest
     * @return DescribeLogTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogTypeResponse DescribeLogType(DescribeLogTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogType", DescribeLogTypeResponse.class);
    }

    /**
     *This API is used to obtain the list of cross-region log-in allowlists after merge.
     * @param req DescribeLoginWhiteCombinedListRequest
     * @return DescribeLoginWhiteCombinedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteCombinedListResponse DescribeLoginWhiteCombinedList(DescribeLoginWhiteCombinedListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginWhiteCombinedList", DescribeLoginWhiteCombinedListResponse.class);
    }

    /**
     *This API is used to query the list of allowlisted machines after merge.
     * @param req DescribeLoginWhiteHostListRequest
     * @return DescribeLoginWhiteHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteHostListResponse DescribeLoginWhiteHostList(DescribeLoginWhiteHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginWhiteHostList", DescribeLoginWhiteHostListResponse.class);
    }

    /**
     *This API is used to obtain the cross-region log-in allowlist list.
     * @param req DescribeLoginWhiteListRequest
     * @return DescribeLoginWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginWhiteListResponse DescribeLoginWhiteList(DescribeLoginWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginWhiteList", DescribeLoginWhiteListResponse.class);
    }

    /**
     *This API is used to query the clearing history records of a machine.
     * @param req DescribeMachineClearHistoryRequest
     * @return DescribeMachineClearHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineClearHistoryResponse DescribeMachineClearHistory(DescribeMachineClearHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineClearHistory", DescribeMachineClearHistoryResponse.class);
    }

    /**
     *This API is used to query the statistics of advanced defense events for hosts.
     * @param req DescribeMachineDefenseCntRequest
     * @return DescribeMachineDefenseCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineDefenseCntResponse DescribeMachineDefenseCnt(DescribeMachineDefenseCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineDefenseCnt", DescribeMachineDefenseCntResponse.class);
    }

    /**
     *This API is used to query the list of host-related core file monitoring rules.
     * @param req DescribeMachineFileTamperRulesRequest
     * @return DescribeMachineFileTamperRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineFileTamperRulesResponse DescribeMachineFileTamperRules(DescribeMachineFileTamperRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineFileTamperRules", DescribeMachineFileTamperRulesResponse.class);
    }

    /**
     *This API is used to query the information of the host overview.
     * @param req DescribeMachineGeneralRequest
     * @return DescribeMachineGeneralResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGeneralResponse DescribeMachineGeneral(DescribeMachineGeneralRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineGeneral", DescribeMachineGeneralResponse.class);
    }

    /**
     *This API is used to query the machine authorization information.
     * @param req DescribeMachineLicenseDetailRequest
     * @return DescribeMachineLicenseDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineLicenseDetailResponse DescribeMachineLicenseDetail(DescribeMachineLicenseDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineLicenseDetail", DescribeMachineLicenseDetailResponse.class);
    }

    /**
     *This API is used to query the machine operating system list.
     * @param req DescribeMachineOsListRequest
     * @return DescribeMachineOsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineOsListResponse DescribeMachineOsList(DescribeMachineOsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineOsList", DescribeMachineOsListResponse.class);
    }

    /**
     *This API is used to query the list of host regions.
     * @param req DescribeMachineRegionListRequest
     * @return DescribeMachineRegionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRegionListResponse DescribeMachineRegionList(DescribeMachineRegionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineRegionList", DescribeMachineRegionListResponse.class);
    }

    /**
     *This API is used to obtain the list of machine regions.
     * @param req DescribeMachineRegionsRequest
     * @return DescribeMachineRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRegionsResponse DescribeMachineRegions(DescribeMachineRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineRegions", DescribeMachineRegionsResponse.class);
    }

    /**
     *This API is used to query the statistics of host intrusion detection events.
     * @param req DescribeMachineRiskCntRequest
     * @return DescribeMachineRiskCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineRiskCntResponse DescribeMachineRiskCnt(DescribeMachineRiskCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineRiskCnt", DescribeMachineRiskCntResponse.class);
    }

    /**
     *This API is used to query snapshots created by the host.
     * @param req DescribeMachineSnapshotRequest
     * @return DescribeMachineSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineSnapshotResponse DescribeMachineSnapshot(DescribeMachineSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineSnapshot", DescribeMachineSnapshotResponse.class);
    }

    /**
     *This API is used to obtain the list of hosts in a specific region.
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachines", DescribeMachinesResponse.class);
    }

    /**
     *This API is used to obtain the list of hosts.
     * @param req DescribeMachinesSimpleRequest
     * @return DescribeMachinesSimpleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesSimpleResponse DescribeMachinesSimple(DescribeMachinesSimpleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachinesSimple", DescribeMachinesSimpleResponse.class);
    }

    /**
     *This API is used to obtain the Trojan list.
     * @param req DescribeMalWareListRequest
     * @return DescribeMalWareListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalWareListResponse DescribeMalWareList(DescribeMalWareListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalWareList", DescribeMalWareListResponse.class);
    }

    /**
     *This API is used to query the list of malicious request allowlists.
     * @param req DescribeMaliciousRequestWhiteListRequest
     * @return DescribeMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaliciousRequestWhiteListResponse DescribeMaliciousRequestWhiteList(DescribeMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaliciousRequestWhiteList", DescribeMaliciousRequestWhiteListResponse.class);
    }

    /**
     *This API is used to obtain Trojan file download addresses.
     * @param req DescribeMalwareFileRequest
     * @return DescribeMalwareFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareFileResponse DescribeMalwareFile(DescribeMalwareFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareFile", DescribeMalwareFileResponse.class);
    }

    /**
     *This API is used to view malicious file details.
     * @param req DescribeMalwareInfoRequest
     * @return DescribeMalwareInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareInfoResponse DescribeMalwareInfo(DescribeMalwareInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareInfo", DescribeMalwareInfoResponse.class);
    }

    /**
     *This API is used to obtain the information of virus scanning overview.
     * @param req DescribeMalwareRiskOverviewRequest
     * @return DescribeMalwareRiskOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareRiskOverviewResponse DescribeMalwareRiskOverview(DescribeMalwareRiskOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareRiskOverview", DescribeMalwareRiskOverviewResponse.class);
    }

    /**
     *This API is used to open Intrusion Detection - Virus Scanning, and the risk warning content pops up.
     * @param req DescribeMalwareRiskWarningRequest
     * @return DescribeMalwareRiskWarningResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareRiskWarningResponse DescribeMalwareRiskWarning(DescribeMalwareRiskWarningRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareRiskWarning", DescribeMalwareRiskWarningResponse.class);
    }

    /**
     *This API is used to query the scheduled scan configuration.
     * @param req DescribeMalwareTimingScanSettingRequest
     * @return DescribeMalwareTimingScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareTimingScanSettingResponse DescribeMalwareTimingScanSetting(DescribeMalwareTimingScanSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareTimingScanSetting", DescribeMalwareTimingScanSettingResponse.class);
    }

    /**
     *This API is used to obtain the list of Trojan allowlists.
     * @param req DescribeMalwareWhiteListRequest
     * @return DescribeMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareWhiteListResponse DescribeMalwareWhiteList(DescribeMalwareWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareWhiteList", DescribeMalwareWhiteListResponse.class);
    }

    /**
     *This API is used to obtain the list of affected Trojan allowlists.
     * @param req DescribeMalwareWhiteListAffectListRequest
     * @return DescribeMalwareWhiteListAffectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareWhiteListAffectListResponse DescribeMalwareWhiteListAffectList(DescribeMalwareWhiteListAffectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareWhiteListAffectList", DescribeMalwareWhiteListAffectListResponse.class);
    }

    /**
     *This API is used to download the monthly inspection report of the security manager.
     * @param req DescribeMonthInspectionReportRequest
     * @return DescribeMonthInspectionReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonthInspectionReportResponse DescribeMonthInspectionReport(DescribeMonthInspectionReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonthInspectionReport", DescribeMonthInspectionReportResponse.class);
    }

    /**
     *This API is used to query network attack settings.
     * @param req DescribeNetAttackSettingRequest
     * @return DescribeNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetAttackSettingResponse DescribeNetAttackSetting(DescribeNetAttackSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetAttackSetting", DescribeNetAttackSettingResponse.class);
    }

    /**
     *This API is used to obtain the network attack allowlist list.
     * @param req DescribeNetAttackWhiteListRequest
     * @return DescribeNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetAttackWhiteListResponse DescribeNetAttackWhiteList(DescribeNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetAttackWhiteList", DescribeNetAttackWhiteListResponse.class);
    }

    /**
     *This API is used to obtain the list of port statistics.
     * @param req DescribeOpenPortStatisticsRequest
     * @return DescribeOpenPortStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOpenPortStatisticsResponse DescribeOpenPortStatistics(DescribeOpenPortStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOpenPortStatistics", DescribeOpenPortStatisticsResponse.class);
    }

    /**
     *This API is used to obtain the overview statistics.
     * @param req DescribeOverviewStatisticsRequest
     * @return DescribeOverviewStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewStatisticsResponse DescribeOverviewStatistics(DescribeOverviewStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewStatistics", DescribeOverviewStatisticsResponse.class);
    }

    /**
     *This API is used to obtain local privilege escalation information details.
     * @param req DescribePrivilegeEventInfoRequest
     * @return DescribePrivilegeEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivilegeEventInfoResponse DescribePrivilegeEventInfo(DescribePrivilegeEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivilegeEventInfo", DescribePrivilegeEventInfoResponse.class);
    }

    /**
     *This API is used to obtain the list of local privilege escalation rules.
     * @param req DescribePrivilegeRulesRequest
     * @return DescribePrivilegeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivilegeRulesResponse DescribePrivilegeRules(DescribePrivilegeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivilegeRules", DescribePrivilegeRulesResponse.class);
    }

    /**
     *This API is used to obtain the overview information of the Professional edition.
     * @param req DescribeProVersionInfoRequest
     * @return DescribeProVersionInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionInfoResponse DescribeProVersionInfo(DescribeProVersionInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProVersionInfo", DescribeProVersionInfoResponse.class);
    }

    /**
     *This API is used to check whether a single host or all hosts enable the professional version.
     * @param req DescribeProVersionStatusRequest
     * @return DescribeProVersionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProVersionStatusResponse DescribeProVersionStatus(DescribeProVersionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProVersionStatus", DescribeProVersionStatusResponse.class);
    }

    /**
     *This API is used to obtain the process statistics data.
     * @param req DescribeProcessStatisticsRequest
     * @return DescribeProcessStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessStatisticsResponse DescribeProcessStatistics(DescribeProcessStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcessStatistics", DescribeProcessStatisticsResponse.class);
    }

    /**
     *This API is used to query the product trial status.
     * @param req DescribeProductStatusRequest
     * @return DescribeProductStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductStatusResponse DescribeProductStatus(DescribeProductStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductStatus", DescribeProductStatusResponse.class);
    }

    /**
     *This API is used to obtain the installation command of the public network access proxy.
     * @param req DescribePublicProxyInstallCommandRequest
     * @return DescribePublicProxyInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicProxyInstallCommandResponse DescribePublicProxyInstallCommand(DescribePublicProxyInstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicProxyInstallCommand", DescribePublicProxyInstallCommandResponse.class);
    }

    /**
     *This API is used to query the list of host snapshot backups.
     * @param req DescribeRansomDefenseBackupListRequest
     * @return DescribeRansomDefenseBackupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseBackupListResponse DescribeRansomDefenseBackupList(DescribeRansomDefenseBackupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseBackupList", DescribeRansomDefenseBackupListResponse.class);
    }

    /**
     *This API is used to query the anti-ransomware event list.
     * @param req DescribeRansomDefenseEventsListRequest
     * @return DescribeRansomDefenseEventsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseEventsListResponse DescribeRansomDefenseEventsList(DescribeRansomDefenseEventsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseEventsList", DescribeRansomDefenseEventsListResponse.class);
    }

    /**
     *This API is used to query the list of backup details.
     * @param req DescribeRansomDefenseMachineListRequest
     * @return DescribeRansomDefenseMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseMachineListResponse DescribeRansomDefenseMachineList(DescribeRansomDefenseMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseMachineList", DescribeRansomDefenseMachineListResponse.class);
    }

    /**
     *This API is used to obtain the list of policies bound to a host.
     * @param req DescribeRansomDefenseMachineStrategyInfoRequest
     * @return DescribeRansomDefenseMachineStrategyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseMachineStrategyInfoResponse DescribeRansomDefenseMachineStrategyInfo(DescribeRansomDefenseMachineStrategyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseMachineStrategyInfo", DescribeRansomDefenseMachineStrategyInfoResponse.class);
    }

    /**
     *This API is used to query the rollback task list.
     * @param req DescribeRansomDefenseRollBackTaskListRequest
     * @return DescribeRansomDefenseRollBackTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseRollBackTaskListResponse DescribeRansomDefenseRollBackTaskList(DescribeRansomDefenseRollBackTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseRollBackTaskList", DescribeRansomDefenseRollBackTaskListResponse.class);
    }

    /**
     *This API is used to obtain user anti-ransomware trends.
     * @param req DescribeRansomDefenseStateRequest
     * @return DescribeRansomDefenseStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStateResponse DescribeRansomDefenseState(DescribeRansomDefenseStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseState", DescribeRansomDefenseStateResponse.class);
    }

    /**
     *This API is used to obtain the policy details.
     * @param req DescribeRansomDefenseStrategyDetailRequest
     * @return DescribeRansomDefenseStrategyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStrategyDetailResponse DescribeRansomDefenseStrategyDetail(DescribeRansomDefenseStrategyDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseStrategyDetail", DescribeRansomDefenseStrategyDetailResponse.class);
    }

    /**
     *This API is used to query the list of anti-ransomware policies.
     * @param req DescribeRansomDefenseStrategyListRequest
     * @return DescribeRansomDefenseStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStrategyListResponse DescribeRansomDefenseStrategyList(DescribeRansomDefenseStrategyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseStrategyList", DescribeRansomDefenseStrategyListResponse.class);
    }

    /**
     *This API is used to query the list of machines bound to an anti-ransomware policy.
     * @param req DescribeRansomDefenseStrategyMachinesRequest
     * @return DescribeRansomDefenseStrategyMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseStrategyMachinesResponse DescribeRansomDefenseStrategyMachines(DescribeRansomDefenseStrategyMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseStrategyMachines", DescribeRansomDefenseStrategyMachinesResponse.class);
    }

    /**
     *This API is used to obtain the ransomware situation across the entire network.
     * @param req DescribeRansomDefenseTrendRequest
     * @return DescribeRansomDefenseTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRansomDefenseTrendResponse DescribeRansomDefenseTrend(DescribeRansomDefenseTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRansomDefenseTrend", DescribeRansomDefenseTrendResponse.class);
    }

    /**
     *This API is used to query the recommended number of protection cores for purchase.
     * @param req DescribeRecommendedProtectCpuRequest
     * @return DescribeRecommendedProtectCpuResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecommendedProtectCpuResponse DescribeRecommendedProtectCpu(DescribeRecommendedProtectCpuRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecommendedProtectCpu", DescribeRecommendedProtectCpuResponse.class);
    }

    /**
     *This API is used to query reverse shell details.
     * @param req DescribeReverseShellEventInfoRequest
     * @return DescribeReverseShellEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventInfoResponse DescribeReverseShellEventInfo(DescribeReverseShellEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellEventInfo", DescribeReverseShellEventInfoResponse.class);
    }

    /**
     *This API is used to obtain the list of Reverse Shell.
     * @param req DescribeReverseShellEventsRequest
     * @return DescribeReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellEventsResponse DescribeReverseShellEvents(DescribeReverseShellEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellEvents", DescribeReverseShellEventsResponse.class);
    }

    /**
     *This API is used to obtain the list of Reverse Shell rules.
     * @param req DescribeReverseShellRulesRequest
     * @return DescribeReverseShellRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellRulesResponse DescribeReverseShellRules(DescribeReverseShellRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellRules", DescribeReverseShellRulesResponse.class);
    }

    /**
     *This API is used to query if the intrusion detection event update task is completed.
     * @param req DescribeRiskBatchStatusRequest
     * @return DescribeRiskBatchStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskBatchStatusResponse DescribeRiskBatchStatus(DescribeRiskBatchStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskBatchStatus", DescribeRiskBatchStatusResponse.class);
    }

    /**
     *This API is used to query malicious request event details.
     * @param req DescribeRiskDnsEventInfoRequest
     * @return DescribeRiskDnsEventInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsEventInfoResponse DescribeRiskDnsEventInfo(DescribeRiskDnsEventInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsEventInfo", DescribeRiskDnsEventInfoResponse.class);
    }

    /**
     *This API is used to obtain the list of malicious request events.
     * @param req DescribeRiskDnsEventListRequest
     * @return DescribeRiskDnsEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsEventListResponse DescribeRiskDnsEventList(DescribeRiskDnsEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsEventList", DescribeRiskDnsEventListResponse.class);
    }

    /**
     *This API is used to query malicious request details.
     * @param req DescribeRiskDnsInfoRequest
     * @return DescribeRiskDnsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsInfoResponse DescribeRiskDnsInfo(DescribeRiskDnsInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsInfo", DescribeRiskDnsInfoResponse.class);
    }

    /**
     *This API is used to obtain the malicious request list.
     * @param req DescribeRiskDnsListRequest
     * @return DescribeRiskDnsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsListResponse DescribeRiskDnsList(DescribeRiskDnsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsList", DescribeRiskDnsListResponse.class);
    }

    /**
     *This API is used to obtain the list of malicious request policies.
     * @param req DescribeRiskDnsPolicyListRequest
     * @return DescribeRiskDnsPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDnsPolicyListResponse DescribeRiskDnsPolicyList(DescribeRiskDnsPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDnsPolicyList", DescribeRiskDnsPolicyListResponse.class);
    }

    /**
     *This API is used to obtain the list of abnormal processes.
     * @param req DescribeRiskProcessEventsRequest
     * @return DescribeRiskProcessEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskProcessEventsResponse DescribeRiskProcessEvents(DescribeRiskProcessEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskProcessEvents", DescribeRiskProcessEventsResponse.class);
    }

    /**
     *This API is used to query the .security notification information.
     * @param req DescribeSafeInfoRequest
     * @return DescribeSafeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeInfoResponse DescribeSafeInfo(DescribeSafeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSafeInfo", DescribeSafeInfoResponse.class);
    }

    /**
     *This API is used to query the Trojan scan progress.
     * @param req DescribeScanMalwareScheduleRequest
     * @return DescribeScanMalwareScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanMalwareScheduleResponse DescribeScanMalwareSchedule(DescribeScanMalwareScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanMalwareSchedule", DescribeScanMalwareScheduleResponse.class);
    }

    /**
     *This API is used to query the detection progress by taskid.
     * @param req DescribeScanScheduleRequest
     * @return DescribeScanScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanScheduleResponse DescribeScanSchedule(DescribeScanScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanSchedule", DescribeScanScheduleResponse.class);
    }

    /**
     *This API is used to query the status of recent scan tasks of the corresponding module.
     * @param req DescribeScanStateRequest
     * @return DescribeScanStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanStateResponse DescribeScanState(DescribeScanStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanState", DescribeScanStateResponse.class);
    }

    /**
     *This API is used to query the scan task details and scan progress information/exceptions.
     * @param req DescribeScanTaskDetailsRequest
     * @return DescribeScanTaskDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskDetailsResponse DescribeScanTaskDetails(DescribeScanTaskDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskDetails", DescribeScanTaskDetailsResponse.class);
    }

    /**
     *This API is used to query the list of machine scan statuses for filtering.
     * @param req DescribeScanTaskStatusRequest
     * @return DescribeScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskStatusResponse DescribeScanTaskStatus(DescribeScanTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskStatus", DescribeScanTaskStatusResponse.class);
    }

    /**
     *This API is used to query the configuration for regular detection.
     * @param req DescribeScanVulSettingRequest
     * @return DescribeScanVulSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanVulSettingResponse DescribeScanVulSetting(DescribeScanVulSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanVulSetting", DescribeScanVulSettingResponse.class);
    }

    /**
     *This API is used to visually obtain the attacked hot spots across the entire network on the large screen.
     * @param req DescribeScreenAttackHotspotRequest
     * @return DescribeScreenAttackHotspotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenAttackHotspotResponse DescribeScreenAttackHotspot(DescribeScreenAttackHotspotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenAttackHotspot", DescribeScreenAttackHotspotResponse.class);
    }

    /**
     *This API is used to obtain the security report on the large screen.
     * @param req DescribeScreenBroadcastsRequest
     * @return DescribeScreenBroadcastsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenBroadcastsResponse DescribeScreenBroadcasts(DescribeScreenBroadcastsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenBroadcasts", DescribeScreenBroadcastsResponse.class);
    }

    /**
     *This API is used to obtain the visualized attack and defense trends on the large screen.
     * @param req DescribeScreenDefenseTrendsRequest
     * @return DescribeScreenDefenseTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenDefenseTrendsResponse DescribeScreenDefenseTrends(DescribeScreenDefenseTrendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenDefenseTrends", DescribeScreenDefenseTrendsResponse.class);
    }

    /**
     *This API is used to obtain the visualized emergency notification on the large screen.
     * @param req DescribeScreenEmergentMsgRequest
     * @return DescribeScreenEmergentMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenEmergentMsgResponse DescribeScreenEmergentMsg(DescribeScreenEmergentMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenEmergentMsg", DescribeScreenEmergentMsgResponse.class);
    }

    /**
     *This API is used to obtain the statistics data of events on the security overview page.
     * @param req DescribeScreenEventsCntRequest
     * @return DescribeScreenEventsCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenEventsCntResponse DescribeScreenEventsCnt(DescribeScreenEventsCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenEventsCnt", DescribeScreenEventsCntResponse.class);
    }

    /**
     *This API is used to obtain the visualized statistics data of hosts on the screen.
     * @param req DescribeScreenGeneralStatRequest
     * @return DescribeScreenGeneralStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenGeneralStatResponse DescribeScreenGeneralStat(DescribeScreenGeneralStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenGeneralStat", DescribeScreenGeneralStatResponse.class);
    }

    /**
     *This API is used to obtain the visualized host intrusion details on the large screen.
     * @param req DescribeScreenHostInvasionRequest
     * @return DescribeScreenHostInvasionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenHostInvasionResponse DescribeScreenHostInvasion(DescribeScreenHostInvasionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenHostInvasion", DescribeScreenHostInvasionResponse.class);
    }

    /**
     *This API is used to obtain the list of available visualized host regions on the large screen.
     * @param req DescribeScreenMachineRegionsRequest
     * @return DescribeScreenMachineRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenMachineRegionsResponse DescribeScreenMachineRegions(DescribeScreenMachineRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenMachineRegions", DescribeScreenMachineRegionsResponse.class);
    }

    /**
     *This API is used to obtain the visualized list of host regions on the large screen.
     * @param req DescribeScreenMachinesRequest
     * @return DescribeScreenMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenMachinesResponse DescribeScreenMachines(DescribeScreenMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenMachines", DescribeScreenMachinesResponse.class);
    }

    /**
     *This API is used to obtain the visualized introduction of CWPP engine on the large screen.
     * @param req DescribeScreenProtectionCntRequest
     * @return DescribeScreenProtectionCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenProtectionCntResponse DescribeScreenProtectionCnt(DescribeScreenProtectionCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenProtectionCnt", DescribeScreenProtectionCntResponse.class);
    }

    /**
     *This API is used to obtain the security protection status on the large screen.
     * @param req DescribeScreenProtectionStatRequest
     * @return DescribeScreenProtectionStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenProtectionStatResponse DescribeScreenProtectionStat(DescribeScreenProtectionStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenProtectionStat", DescribeScreenProtectionStatResponse.class);
    }

    /**
     *This API is used to count today's risky assets.
     * @param req DescribeScreenRiskAssetsTopRequest
     * @return DescribeScreenRiskAssetsTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScreenRiskAssetsTopResponse DescribeScreenRiskAssetsTop(DescribeScreenRiskAssetsTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScreenRiskAssetsTop", DescribeScreenRiskAssetsTopResponse.class);
    }

    /**
     *This API is used to obtain historical search records.
     * @param req DescribeSearchLogsRequest
     * @return DescribeSearchLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchLogsResponse DescribeSearchLogs(DescribeSearchLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchLogs", DescribeSearchLogsResponse.class);
    }

    /**
     *This API is used to obtain the list of quick retrievals.
     * @param req DescribeSearchTemplatesRequest
     * @return DescribeSearchTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchTemplatesResponse DescribeSearchTemplates(DescribeSearchTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchTemplates", DescribeSearchTemplatesResponse.class);
    }

    /**
     *This API is used to query the information of security report articles.
     * @param req DescribeSecurityBroadcastInfoRequest
     * @return DescribeSecurityBroadcastInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityBroadcastInfoResponse DescribeSecurityBroadcastInfo(DescribeSecurityBroadcastInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityBroadcastInfo", DescribeSecurityBroadcastInfoResponse.class);
    }

    /**
     *This API is used to obtain the security report list page.
     * @param req DescribeSecurityBroadcastsRequest
     * @return DescribeSecurityBroadcastsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityBroadcastsResponse DescribeSecurityBroadcasts(DescribeSecurityBroadcastsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityBroadcasts", DescribeSecurityBroadcastsResponse.class);
    }

    /**
     *This API is used to obtain the dynamic message data of security events.
     * @param req DescribeSecurityDynamicsRequest
     * @return DescribeSecurityDynamicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityDynamicsResponse DescribeSecurityDynamics(DescribeSecurityDynamicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityDynamics", DescribeSecurityDynamicsResponse.class);
    }

    /**
     *This API is used to obtain the statistics of security events.
     * @param req DescribeSecurityEventStatRequest
     * @return DescribeSecurityEventStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityEventStatResponse DescribeSecurityEventStat(DescribeSecurityEventStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityEventStat", DescribeSecurityEventStatResponse.class);
    }

    /**
     *This API is used to obtain the statistics data of security overview-related events.
     * @param req DescribeSecurityEventsCntRequest
     * @return DescribeSecurityEventsCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityEventsCntResponse DescribeSecurityEventsCnt(DescribeSecurityEventsCntRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityEventsCnt", DescribeSecurityEventsCntResponse.class);
    }

    /**
     *接口已无效

This API is used to obtain the summary of security protection statuses.
     * @param req DescribeSecurityProtectionStatRequest
     * @return DescribeSecurityProtectionStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityProtectionStatResponse DescribeSecurityProtectionStat(DescribeSecurityProtectionStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityProtectionStat", DescribeSecurityProtectionStatResponse.class);
    }

    /**
     *This API is used to obtain the security event statistics data.
     * @param req DescribeSecurityTrendsRequest
     * @return DescribeSecurityTrendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityTrendsResponse DescribeSecurityTrends(DescribeSecurityTrendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityTrends", DescribeSecurityTrendsResponse.class);
    }

    /**
     *This API is used to obtain the number of risky files pending to be processed + the number of affected servers + whether to try to detect + last detection time.
     * @param req DescribeServersAndRiskAndFirstInfoRequest
     * @return DescribeServersAndRiskAndFirstInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServersAndRiskAndFirstInfoResponse DescribeServersAndRiskAndFirstInfo(DescribeServersAndRiskAndFirstInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServersAndRiskAndFirstInfo", DescribeServersAndRiskAndFirstInfoResponse.class);
    }

    /**
     *This API is used to query whether a policy exists by policy name.
     * @param req DescribeStrategyExistRequest
     * @return DescribeStrategyExistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStrategyExistResponse DescribeStrategyExist(DescribeStrategyExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStrategyExist", DescribeStrategyExistResponse.class);
    }

    /**
     *This API is used to obtain the server information associated with the specified tag.
     * @param req DescribeTagMachinesRequest
     * @return DescribeTagMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagMachinesResponse DescribeTagMachines(DescribeTagMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagMachines", DescribeTagMachinesResponse.class);
    }

    /**
     *This API is used to obtain all host tags.
     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTags", DescribeTagsResponse.class);
    }

    /**
     *This API is used to query the CWPP authorized trial report (only available for console applications).
     * @param req DescribeTrialReportRequest
     * @return DescribeTrialReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrialReportResponse DescribeTrialReport(DescribeTrialReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrialReport", DescribeTrialReportResponse.class);
    }

    /**
     *This API is used to obtain the number of pending vulnerabilities of a specified category and the number of hosts in the vulnerability management module.
     * @param req DescribeUndoVulCountsRequest
     * @return DescribeUndoVulCountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUndoVulCountsResponse DescribeUndoVulCounts(DescribeUndoVulCountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUndoVulCounts", DescribeUndoVulCountsResponse.class);
    }

    /**
     *This API is used to query the user's custom configurations.
     * @param req DescribeUsersConfigRequest
     * @return DescribeUsersConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersConfigResponse DescribeUsersConfig(DescribeUsersConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsersConfig", DescribeUsersConfigResponse.class);
    }

    /**
     *This API is used to query common log-in locations.
     * @param req DescribeUsualLoginPlacesRequest
     * @return DescribeUsualLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsualLoginPlacesResponse DescribeUsualLoginPlaces(DescribeUsualLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsualLoginPlaces", DescribeUsualLoginPlacesResponse.class);
    }

    /**
     *This API is used to obtain virus database and POC updates.
     * @param req DescribeVdbAndPocInfoRequest
     * @return DescribeVdbAndPocInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVdbAndPocInfoResponse DescribeVdbAndPocInfo(DescribeVdbAndPocInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVdbAndPocInfo", DescribeVdbAndPocInfoResponse.class);
    }

    /**
     *This API is used to obtain the version comparison information.
     * @param req DescribeVersionCompareChartRequest
     * @return DescribeVersionCompareChartResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionCompareChartResponse DescribeVersionCompareChart(DescribeVersionCompareChartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVersionCompareChart", DescribeVersionCompareChartResponse.class);
    }

    /**
     *This API is used to count the number of machines of Professional and Basic editions.
     * @param req DescribeVersionStatisticsRequest
     * @return DescribeVersionStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionStatisticsResponse DescribeVersionStatistics(DescribeVersionStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVersionStatistics", DescribeVersionStatisticsResponse.class);
    }

    /**
     *This API is used to obtain the attribute information of the specified point.
     * @param req DescribeVertexDetailRequest
     * @return DescribeVertexDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVertexDetailResponse DescribeVertexDetail(DescribeVertexDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVertexDetail", DescribeVertexDetailResponse.class);
    }

    /**
     *This API is used to obtain the number of vulnerabilities of specified types in recent days and the number of hosts.
     * @param req DescribeVulCountByDatesRequest
     * @return DescribeVulCountByDatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulCountByDatesResponse DescribeVulCountByDates(DescribeVulCountByDatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulCountByDates", DescribeVulCountByDatesResponse.class);
    }

    /**
     *This API is used to query vulnerability details by CveId.
     * @param req DescribeVulCveIdInfoRequest
     * @return DescribeVulCveIdInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulCveIdInfoResponse DescribeVulCveIdInfo(DescribeVulCveIdInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulCveIdInfo", DescribeVulCveIdInfoResponse.class);
    }

    /**
     *This API is used to obtain the list of vulnerability defense events.
     * @param req DescribeVulDefenceEventRequest
     * @return DescribeVulDefenceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceEventResponse DescribeVulDefenceEvent(DescribeVulDefenceEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceEvent", DescribeVulDefenceEventResponse.class);
    }

    /**
     *This API is used to query the vulnerability defense list.
     * @param req DescribeVulDefenceListRequest
     * @return DescribeVulDefenceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceListResponse DescribeVulDefenceList(DescribeVulDefenceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceList", DescribeVulDefenceListResponse.class);
    }

    /**
     *This API is used to obtain the vulnerability defense overview information, including event trend and plugin enabling status.
     * @param req DescribeVulDefenceOverviewRequest
     * @return DescribeVulDefenceOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceOverviewResponse DescribeVulDefenceOverview(DescribeVulDefenceOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceOverview", DescribeVulDefenceOverviewResponse.class);
    }

    /**
     *This API is used to obtain the vulnerability defense plugin information on a single host.
     * @param req DescribeVulDefencePluginDetailRequest
     * @return DescribeVulDefencePluginDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginDetailResponse DescribeVulDefencePluginDetail(DescribeVulDefencePluginDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefencePluginDetail", DescribeVulDefencePluginDetailResponse.class);
    }

    /**
     *This API is used to obtain the current number of abnormal plugins.
     * @param req DescribeVulDefencePluginExceptionCountRequest
     * @return DescribeVulDefencePluginExceptionCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginExceptionCountResponse DescribeVulDefencePluginExceptionCount(DescribeVulDefencePluginExceptionCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefencePluginExceptionCount", DescribeVulDefencePluginExceptionCountResponse.class);
    }

    /**
     *This API is used to obtain the vulnerability defense plugin status of each host.
     * @param req DescribeVulDefencePluginStatusRequest
     * @return DescribeVulDefencePluginStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefencePluginStatusResponse DescribeVulDefencePluginStatus(DescribeVulDefencePluginStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefencePluginStatus", DescribeVulDefencePluginStatusResponse.class);
    }

    /**
     *This API is used to obtain the current vulnerability defense plugin settings.
     * @param req DescribeVulDefenceSettingRequest
     * @return DescribeVulDefenceSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDefenceSettingResponse DescribeVulDefenceSetting(DescribeVulDefenceSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDefenceSetting", DescribeVulDefenceSettingResponse.class);
    }

    /**
     *This API is used to obtain the list of hosts affected by vulnerabilities.
     * @param req DescribeVulEffectHostListRequest
     * @return DescribeVulEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEffectHostListResponse DescribeVulEffectHostList(DescribeVulEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulEffectHostList", DescribeVulEffectHostListResponse.class);
    }

    /**
     *This API is used to obtain the list of components affected by vulnerabilities.
     * @param req DescribeVulEffectModulesRequest
     * @return DescribeVulEffectModulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEffectModulesResponse DescribeVulEffectModules(DescribeVulEffectModulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulEffectModules", DescribeVulEffectModulesResponse.class);
    }

    /**
     *This API is used to obtain vulnerability emergency notifications.
     * @param req DescribeVulEmergentMsgRequest
     * @return DescribeVulEmergentMsgResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulEmergentMsgResponse DescribeVulEmergentMsg(DescribeVulEmergentMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulEmergentMsg", DescribeVulEmergentMsgResponse.class);
    }

    /**
     *This API is used to check the host vulnerability fixing progress.
     * @param req DescribeVulFixStatusRequest
     * @return DescribeVulFixStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixStatusResponse DescribeVulFixStatus(DescribeVulFixStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixStatus", DescribeVulFixStatusResponse.class);
    }

    /**
     *This API is used to obtain the number of vulnerabilities pending to be processed and affected hosts.
     * @param req DescribeVulHostCountScanTimeRequest
     * @return DescribeVulHostCountScanTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulHostCountScanTimeResponse DescribeVulHostCountScanTime(DescribeVulHostCountScanTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulHostCountScanTime", DescribeVulHostCountScanTimeResponse.class);
    }

    /**
     *This API is used to obtain the list of top server risks.
     * @param req DescribeVulHostTopRequest
     * @return DescribeVulHostTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulHostTopResponse DescribeVulHostTop(DescribeVulHostTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulHostTop", DescribeVulHostTopResponse.class);
    }

    /**
     *This API is used to obtain vulnerability details with the CVSS version.
     * @param req DescribeVulInfoCvssRequest
     * @return DescribeVulInfoCvssResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulInfoCvssResponse DescribeVulInfoCvss(DescribeVulInfoCvssRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulInfoCvss", DescribeVulInfoCvssResponse.class);
    }

    /**
     *This API is used to obtain the list of all user vulnerability tags.
     * @param req DescribeVulLabelsRequest
     * @return DescribeVulLabelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLabelsResponse DescribeVulLabels(DescribeVulLabelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulLabels", DescribeVulLabelsResponse.class);
    }

    /**
     *This API is used to obtain the statistics of vulnerability quantity and level distribution.
     * @param req DescribeVulLevelCountRequest
     * @return DescribeVulLevelCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLevelCountResponse DescribeVulLevelCount(DescribeVulLevelCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulLevelCount", DescribeVulLevelCountResponse.class);
    }

    /**
     *This API is used to obtain the data of the vulnerability list.
     * @param req DescribeVulListRequest
     * @return DescribeVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulListResponse DescribeVulList(DescribeVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulList", DescribeVulListResponse.class);
    }

    /**
     *This API is used to obtain the data for the vulnerability overview.
     * @param req DescribeVulOverviewRequest
     * @return DescribeVulOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulOverviewResponse DescribeVulOverview(DescribeVulOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulOverview", DescribeVulOverviewResponse.class);
    }

    /**
     *This API is used to obtain the vulnerability database list.
     * @param req DescribeVulStoreListRequest
     * @return DescribeVulStoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulStoreListResponse DescribeVulStoreList(DescribeVulStoreListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulStoreList", DescribeVulStoreListResponse.class);
    }

    /**
     *This API is used to count top vulnerabilities.
     * @param req DescribeVulTopRequest
     * @return DescribeVulTopResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTopResponse DescribeVulTop(DescribeVulTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulTop", DescribeVulTopResponse.class);
    }

    /**
     *This API is used to obtain information of the vulnerability situation.
     * @param req DescribeVulTrendRequest
     * @return DescribeVulTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulTrendResponse DescribeVulTrend(DescribeVulTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulTrend", DescribeVulTrendResponse.class);
    }

    /**
     *This API is used to query the alarming machine scope settings.
     * @param req DescribeWarningHostConfigRequest
     * @return DescribeWarningHostConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningHostConfigResponse DescribeWarningHostConfig(DescribeWarningHostConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWarningHostConfig", DescribeWarningHostConfigResponse.class);
    }

    /**
     *This API is used to obtain the list of the current user's alarms.
     * @param req DescribeWarningListRequest
     * @return DescribeWarningListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningListResponse DescribeWarningList(DescribeWarningListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWarningList", DescribeWarningListResponse.class);
    }

    /**
     *This API is used to query alarm policies.
     * @param req DescribeWebHookPolicyRequest
     * @return DescribeWebHookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookPolicyResponse DescribeWebHookPolicy(DescribeWebHookPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookPolicy", DescribeWebHookPolicyResponse.class);
    }

    /**
     *This API is used to query the list of alarm recipients.
     * @param req DescribeWebHookReceiverRequest
     * @return DescribeWebHookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookReceiverResponse DescribeWebHookReceiver(DescribeWebHookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookReceiver", DescribeWebHookReceiverResponse.class);
    }

    /**
     *This API is used to query the usage of policies associated with the specified alarm recipient.
     * @param req DescribeWebHookReceiverUsageRequest
     * @return DescribeWebHookReceiverUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookReceiverUsageResponse DescribeWebHookReceiverUsage(DescribeWebHookReceiverUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookReceiverUsage", DescribeWebHookReceiverUsageResponse.class);
    }

    /**
     *This API is used to obtain the details of the WeCom chatbot rules.
     * @param req DescribeWebHookRuleRequest
     * @return DescribeWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookRuleResponse DescribeWebHookRule(DescribeWebHookRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookRule", DescribeWebHookRuleResponse.class);
    }

    /**
     *This API is used to obtain the list of WeCom chatbot rules.
     * @param req DescribeWebHookRulesRequest
     * @return DescribeWebHookRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebHookRulesResponse DescribeWebHookRules(DescribeWebHookRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebHookRules", DescribeWebHookRulesResponse.class);
    }

    /**
     *This API is used to terminate resources.
     * @param req DestroyOrderRequest
     * @return DestroyOrderResponse
     * @throws TencentCloudSDKException
     */
    public DestroyOrderResponse DestroyOrder(DestroyOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyOrder", DestroyOrderResponse.class);
    }

    /**
     *This API is used to add or modify high-risk command rules.
     * @param req EditBashRulesRequest
     * @return EditBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditBashRulesResponse EditBashRules(EditBashRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditBashRules", EditBashRulesResponse.class);
    }

    /**
     *This API is used to add or modify local privilege escalation rules (multiple servers supported).
     * @param req EditPrivilegeRulesRequest
     * @return EditPrivilegeRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditPrivilegeRulesResponse EditPrivilegeRules(EditPrivilegeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditPrivilegeRules", EditPrivilegeRulesResponse.class);
    }

    /**
     *This API is used to edit reverse shell rules (multiple servers supported).

     * @param req EditReverseShellRulesRequest
     * @return EditReverseShellRulesResponse
     * @throws TencentCloudSDKException
     */
    public EditReverseShellRulesResponse EditReverseShellRules(EditReverseShellRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditReverseShellRules", EditReverseShellRulesResponse.class);
    }

    /**
     *This API is used to add or edit tags.
     * @param req EditTagsRequest
     * @return EditTagsResponse
     * @throws TencentCloudSDKException
     */
    public EditTagsResponse EditTags(EditTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditTags", EditTagsResponse.class);
    }

    /**
     *This API is used to export the list of asset management applications.
     * @param req ExportAssetAppListRequest
     * @return ExportAssetAppListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetAppListResponse ExportAssetAppList(ExportAssetAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetAppList", ExportAssetAppListResponse.class);
    }

    /**
     *This API is used to export the list of asset management kernel modules.
     * @param req ExportAssetCoreModuleListRequest
     * @return ExportAssetCoreModuleListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetCoreModuleListResponse ExportAssetCoreModuleList(ExportAssetCoreModuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetCoreModuleList", ExportAssetCoreModuleListResponse.class);
    }

    /**
     *This API is used to export the list of asset management databases.
     * @param req ExportAssetDatabaseListRequest
     * @return ExportAssetDatabaseListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetDatabaseListResponse ExportAssetDatabaseList(ExportAssetDatabaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetDatabaseList", ExportAssetDatabaseListResponse.class);
    }

    /**
     *This API is used to export the list of asset management environment variables.
     * @param req ExportAssetEnvListRequest
     * @return ExportAssetEnvListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetEnvListResponse ExportAssetEnvList(ExportAssetEnvListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetEnvList", ExportAssetEnvListResponse.class);
    }

    /**
     *This API is used to export the list of asset management startup services.
     * @param req ExportAssetInitServiceListRequest
     * @return ExportAssetInitServiceListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetInitServiceListResponse ExportAssetInitServiceList(ExportAssetInitServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetInitServiceList", ExportAssetInitServiceListResponse.class);
    }

    /**
     *This API is used to export the list of Jar packages.
     * @param req ExportAssetJarListRequest
     * @return ExportAssetJarListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetJarListResponse ExportAssetJarList(ExportAssetJarListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetJarList", ExportAssetJarListResponse.class);
    }

    /**
     *This API is used to export asset management host resource details.
     * @param req ExportAssetMachineDetailRequest
     * @return ExportAssetMachineDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetMachineDetailResponse ExportAssetMachineDetail(ExportAssetMachineDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetMachineDetail", ExportAssetMachineDetailResponse.class);
    }

    /**
     *This API is used to export the list of resource monitoring.
     * @param req ExportAssetMachineListRequest
     * @return ExportAssetMachineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetMachineListResponse ExportAssetMachineList(ExportAssetMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetMachineList", ExportAssetMachineListResponse.class);
    }

    /**
     *This API is used to export the list of scheduled asset management tasks.
     * @param req ExportAssetPlanTaskListRequest
     * @return ExportAssetPlanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetPlanTaskListResponse ExportAssetPlanTaskList(ExportAssetPlanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetPlanTaskList", ExportAssetPlanTaskListResponse.class);
    }

    /**
     *This API is used to export the list of asset management ports.
     * @param req ExportAssetPortInfoListRequest
     * @return ExportAssetPortInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetPortInfoListResponse ExportAssetPortInfoList(ExportAssetPortInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetPortInfoList", ExportAssetPortInfoListResponse.class);
    }

    /**
     *This API is used to export the asset management process list.
     * @param req ExportAssetProcessInfoListRequest
     * @return ExportAssetProcessInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetProcessInfoListResponse ExportAssetProcessInfoList(ExportAssetProcessInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetProcessInfoList", ExportAssetProcessInfoListResponse.class);
    }

    /**
     *This API is used to export host trends of recent days (up to last 90 days).
     * @param req ExportAssetRecentMachineInfoRequest
     * @return ExportAssetRecentMachineInfoResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetRecentMachineInfoResponse ExportAssetRecentMachineInfo(ExportAssetRecentMachineInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetRecentMachineInfo", ExportAssetRecentMachineInfoResponse.class);
    }

    /**
     *This API is used to export the list of system installation packages for asset management.
     * @param req ExportAssetSystemPackageListRequest
     * @return ExportAssetSystemPackageListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetSystemPackageListResponse ExportAssetSystemPackageList(ExportAssetSystemPackageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetSystemPackageList", ExportAssetSystemPackageListResponse.class);
    }

    /**
     *This API is used to export the account list.
     * @param req ExportAssetUserListRequest
     * @return ExportAssetUserListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetUserListResponse ExportAssetUserList(ExportAssetUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetUserList", ExportAssetUserListResponse.class);
    }

    /**
     *This API is used to export the list of asset management Web applications.
     * @param req ExportAssetWebAppListRequest
     * @return ExportAssetWebAppListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebAppListResponse ExportAssetWebAppList(ExportAssetWebAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetWebAppList", ExportAssetWebAppListResponse.class);
    }

    /**
     *This API is used to export the list of asset management Web frameworks.
     * @param req ExportAssetWebFrameListRequest
     * @return ExportAssetWebFrameListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebFrameListResponse ExportAssetWebFrameList(ExportAssetWebFrameListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetWebFrameList", ExportAssetWebFrameListResponse.class);
    }

    /**
     *This API is used to export the list of Web sites.
     * @param req ExportAssetWebLocationListRequest
     * @return ExportAssetWebLocationListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebLocationListResponse ExportAssetWebLocationList(ExportAssetWebLocationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetWebLocationList", ExportAssetWebLocationListResponse.class);
    }

    /**
     *This API is used to export the list of asset management Web services.
     * @param req ExportAssetWebServiceInfoListRequest
     * @return ExportAssetWebServiceInfoListResponse
     * @throws TencentCloudSDKException
     */
    public ExportAssetWebServiceInfoListResponse ExportAssetWebServiceInfoList(ExportAssetWebServiceInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAssetWebServiceInfoList", ExportAssetWebServiceInfoListResponse.class);
    }

    /**
     *This API is used to export network attack events.
     * @param req ExportAttackEventsRequest
     * @return ExportAttackEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportAttackEventsResponse ExportAttackEvents(ExportAttackEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportAttackEvents", ExportAttackEventsResponse.class);
    }

    /**
     *This API is used to export the list of hosts affected by baseline.
     * @param req ExportBaselineEffectHostListRequest
     * @return ExportBaselineEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineEffectHostListResponse ExportBaselineEffectHostList(ExportBaselineEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineEffectHostList", ExportBaselineEffectHostListResponse.class);
    }

    /**
     *This API is used to export the list of fixing baselines.
     * @param req ExportBaselineFixListRequest
     * @return ExportBaselineFixListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineFixListResponse ExportBaselineFixList(ExportBaselineFixListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineFixList", ExportBaselineFixListResponse.class);
    }

    /**
     *This API is used to export the baseline for host detection.
     * @param req ExportBaselineHostDetectListRequest
     * @return ExportBaselineHostDetectListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineHostDetectListResponse ExportBaselineHostDetectList(ExportBaselineHostDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineHostDetectList", ExportBaselineHostDetectListResponse.class);
    }

    /**
     *This API is used to export baseline check items.
     * @param req ExportBaselineItemDetectListRequest
     * @return ExportBaselineItemDetectListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineItemDetectListResponse ExportBaselineItemDetectList(ExportBaselineItemDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineItemDetectList", ExportBaselineItemDetectListResponse.class);
    }

    /**
     *This API is used to export the list of baselines.
     * @param req ExportBaselineListRequest
     * @return ExportBaselineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportBaselineListResponse ExportBaselineList(ExportBaselineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBaselineList", ExportBaselineListResponse.class);
    }

    /**
     *This API is used to export high-risk command events.
     * @param req ExportBashEventsRequest
     * @return ExportBashEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashEventsResponse ExportBashEvents(ExportBashEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBashEvents", ExportBashEventsResponse.class);
    }

    /**
     *This API is used to export high-risk command events (new).
     * @param req ExportBashEventsNewRequest
     * @return ExportBashEventsNewResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashEventsNewResponse ExportBashEventsNew(ExportBashEventsNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBashEventsNew", ExportBashEventsNewResponse.class);
    }

    /**
     *This API is used to export the high-risk command policy.
     * @param req ExportBashPoliciesRequest
     * @return ExportBashPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ExportBashPoliciesResponse ExportBashPolicies(ExportBashPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBashPolicies", ExportBashPoliciesResponse.class);
    }

    /**
     *This API is used to export password cracking records to a CSV file.
     * @param req ExportBruteAttacksRequest
     * @return ExportBruteAttacksResponse
     * @throws TencentCloudSDKException
     */
    public ExportBruteAttacksResponse ExportBruteAttacks(ExportBruteAttacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportBruteAttacks", ExportBruteAttacksResponse.class);
    }

    /**
     *This API is used to export core file events.
     * @param req ExportFileTamperEventsRequest
     * @return ExportFileTamperEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportFileTamperEventsResponse ExportFileTamperEvents(ExportFileTamperEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportFileTamperEvents", ExportFileTamperEventsResponse.class);
    }

    /**
     *This API is used to export core file monitoring rules.
     * @param req ExportFileTamperRulesRequest
     * @return ExportFileTamperRulesResponse
     * @throws TencentCloudSDKException
     */
    public ExportFileTamperRulesResponse ExportFileTamperRules(ExportFileTamperRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportFileTamperRules", ExportFileTamperRulesResponse.class);
    }

    /**
     *This API is used to export information of ignored baseline detection items.
     * @param req ExportIgnoreBaselineRuleRequest
     * @return ExportIgnoreBaselineRuleResponse
     * @throws TencentCloudSDKException
     */
    public ExportIgnoreBaselineRuleResponse ExportIgnoreBaselineRule(ExportIgnoreBaselineRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportIgnoreBaselineRule", ExportIgnoreBaselineRuleResponse.class);
    }

    /**
     *This API is used to export the list of hosts affected by ignored detection items based on detection item IDs.
     * @param req ExportIgnoreRuleEffectHostListRequest
     * @return ExportIgnoreRuleEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportIgnoreRuleEffectHostListResponse ExportIgnoreRuleEffectHostList(ExportIgnoreRuleEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportIgnoreRuleEffectHostList", ExportIgnoreRuleEffectHostListResponse.class);
    }

    /**
     *This API is used to export the Java webshell plugin information.
     * @param req ExportJavaMemShellPluginsRequest
     * @return ExportJavaMemShellPluginsResponse
     * @throws TencentCloudSDKException
     */
    public ExportJavaMemShellPluginsResponse ExportJavaMemShellPlugins(ExportJavaMemShellPluginsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportJavaMemShellPlugins", ExportJavaMemShellPluginsResponse.class);
    }

    /**
     *This API is used to export the list of Java webshell events.
     * @param req ExportJavaMemShellsRequest
     * @return ExportJavaMemShellsResponse
     * @throws TencentCloudSDKException
     */
    public ExportJavaMemShellsResponse ExportJavaMemShells(ExportJavaMemShellsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportJavaMemShells", ExportJavaMemShellsResponse.class);
    }

    /**
     *This API is used to export authorization details.
     * @param req ExportLicenseDetailRequest
     * @return ExportLicenseDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportLicenseDetailResponse ExportLicenseDetail(ExportLicenseDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportLicenseDetail", ExportLicenseDetailResponse.class);
    }

    /**
     *This API is used to export the downloaded malicious request files.
     * @param req ExportMaliciousRequestsRequest
     * @return ExportMaliciousRequestsResponse
     * @throws TencentCloudSDKException
     */
    public ExportMaliciousRequestsResponse ExportMaliciousRequests(ExportMaliciousRequestsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportMaliciousRequests", ExportMaliciousRequestsResponse.class);
    }

    /**
     *This API is used to export Trojan records to a CSV file.
     * @param req ExportMalwaresRequest
     * @return ExportMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public ExportMalwaresResponse ExportMalwares(ExportMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportMalwares", ExportMalwaresResponse.class);
    }

    /**
     *This API is used to export cross-region log-in event records in CSV format.
     * @param req ExportNonlocalLoginPlacesRequest
     * @return ExportNonlocalLoginPlacesResponse
     * @throws TencentCloudSDKException
     */
    public ExportNonlocalLoginPlacesResponse ExportNonlocalLoginPlaces(ExportNonlocalLoginPlacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportNonlocalLoginPlaces", ExportNonlocalLoginPlacesResponse.class);
    }

    /**
     *This API is used to export local privilege escalation events.
     * @param req ExportPrivilegeEventsRequest
     * @return ExportPrivilegeEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportPrivilegeEventsResponse ExportPrivilegeEvents(ExportPrivilegeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportPrivilegeEvents", ExportPrivilegeEventsResponse.class);
    }

    /**
     *This API is used to export the list of host snapshot backups.
     * @param req ExportRansomDefenseBackupListRequest
     * @return ExportRansomDefenseBackupListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseBackupListResponse ExportRansomDefenseBackupList(ExportRansomDefenseBackupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseBackupList", ExportRansomDefenseBackupListResponse.class);
    }

    /**
     *This API is used to export the list of anti-ransomware events.
     * @param req ExportRansomDefenseEventsListRequest
     * @return ExportRansomDefenseEventsListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseEventsListResponse ExportRansomDefenseEventsList(ExportRansomDefenseEventsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseEventsList", ExportRansomDefenseEventsListResponse.class);
    }

    /**
     *This API is used to export the backup details list.
     * @param req ExportRansomDefenseMachineListRequest
     * @return ExportRansomDefenseMachineListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseMachineListResponse ExportRansomDefenseMachineList(ExportRansomDefenseMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseMachineList", ExportRansomDefenseMachineListResponse.class);
    }

    /**
     *This API is used to export the anti-ransomware policy list.
     * @param req ExportRansomDefenseStrategyListRequest
     * @return ExportRansomDefenseStrategyListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseStrategyListResponse ExportRansomDefenseStrategyList(ExportRansomDefenseStrategyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseStrategyList", ExportRansomDefenseStrategyListResponse.class);
    }

    /**
     *This API is used to export the list of machines bound to ransomware defense policies.
     * @param req ExportRansomDefenseStrategyMachinesRequest
     * @return ExportRansomDefenseStrategyMachinesResponse
     * @throws TencentCloudSDKException
     */
    public ExportRansomDefenseStrategyMachinesResponse ExportRansomDefenseStrategyMachines(ExportRansomDefenseStrategyMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRansomDefenseStrategyMachines", ExportRansomDefenseStrategyMachinesResponse.class);
    }

    /**
     *This API is used to export reverse shell events.
     * @param req ExportReverseShellEventsRequest
     * @return ExportReverseShellEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportReverseShellEventsResponse ExportReverseShellEvents(ExportReverseShellEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportReverseShellEvents", ExportReverseShellEventsResponse.class);
    }

    /**
     *This API is used to export the malicious request event list.
     * @param req ExportRiskDnsEventListRequest
     * @return ExportRiskDnsEventListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRiskDnsEventListResponse ExportRiskDnsEventList(ExportRiskDnsEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRiskDnsEventList", ExportRiskDnsEventListResponse.class);
    }

    /**
     *This API is used to export the malicious request policy list.
     * @param req ExportRiskDnsPolicyListRequest
     * @return ExportRiskDnsPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public ExportRiskDnsPolicyListResponse ExportRiskDnsPolicyList(ExportRiskDnsPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRiskDnsPolicyList", ExportRiskDnsPolicyListResponse.class);
    }

    /**
     *This API is used to export abnormal process events.
     * @param req ExportRiskProcessEventsRequest
     * @return ExportRiskProcessEventsResponse
     * @throws TencentCloudSDKException
     */
    public ExportRiskProcessEventsResponse ExportRiskProcessEvents(ExportRiskProcessEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportRiskProcessEvents", ExportRiskProcessEventsResponse.class);
    }

    /**
     *This API is used to export the specified scan task details by task ID.
     * @param req ExportScanTaskDetailsRequest
     * @return ExportScanTaskDetailsResponse
     * @throws TencentCloudSDKException
     */
    public ExportScanTaskDetailsResponse ExportScanTaskDetails(ExportScanTaskDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportScanTaskDetails", ExportScanTaskDetailsResponse.class);
    }

    /**
     *This API is used to export risk trends.
     * @param req ExportSecurityTrendsRequest
     * @return ExportSecurityTrendsResponse
     * @throws TencentCloudSDKException
     */
    public ExportSecurityTrendsResponse ExportSecurityTrends(ExportSecurityTrendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportSecurityTrends", ExportSecurityTrendsResponse.class);
    }

    /**
     *This API is used to export log files with large data volumes asynchronously.
     * @param req ExportTasksRequest
     * @return ExportTasksResponse
     * @throws TencentCloudSDKException
     */
    public ExportTasksResponse ExportTasks(ExportTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportTasks", ExportTasksResponse.class);
    }

    /**
     *This API is used to export vulnerability defense events.
     * @param req ExportVulDefenceEventRequest
     * @return ExportVulDefenceEventResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDefenceEventResponse ExportVulDefenceEvent(ExportVulDefenceEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDefenceEvent", ExportVulDefenceEventResponse.class);
    }

    /**
     *This API is used to export the list of vulnerability defenses.
     * @param req ExportVulDefenceListRequest
     * @return ExportVulDefenceListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDefenceListResponse ExportVulDefenceList(ExportVulDefenceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDefenceList", ExportVulDefenceListResponse.class);
    }

    /**
     *This API is used to export vulnerability defense plugin events.
     * @param req ExportVulDefencePluginEventRequest
     * @return ExportVulDefencePluginEventResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDefencePluginEventResponse ExportVulDefencePluginEvent(ExportVulDefencePluginEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDefencePluginEvent", ExportVulDefencePluginEventResponse.class);
    }

    /**
     *This API is used to export the vulnerability detection Excel document.
     * @param req ExportVulDetectionExcelRequest
     * @return ExportVulDetectionExcelResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDetectionExcelResponse ExportVulDetectionExcel(ExportVulDetectionExcelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDetectionExcel", ExportVulDetectionExcelResponse.class);
    }

    /**
     *This API is used to export the vulnerability detection report.
     * @param req ExportVulDetectionReportRequest
     * @return ExportVulDetectionReportResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulDetectionReportResponse ExportVulDetectionReport(ExportVulDetectionReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulDetectionReport", ExportVulDetectionReportResponse.class);
    }

    /**
     *This API is used to export the list of hosts affected by vulnerabilities.
     * @param req ExportVulEffectHostListRequest
     * @return ExportVulEffectHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulEffectHostListResponse ExportVulEffectHostList(ExportVulEffectHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulEffectHostList", ExportVulEffectHostListResponse.class);
    }

    /**
     *This API is used to export the vulnerability information, including the list of affected hosts and component information.
     * @param req ExportVulInfoRequest
     * @return ExportVulInfoResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulInfoResponse ExportVulInfo(ExportVulInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulInfo", ExportVulInfoResponse.class);
    }

    /**
     *This API is used to export the vulnerability list.
     * @param req ExportVulListRequest
     * @return ExportVulListResponse
     * @throws TencentCloudSDKException
     */
    public ExportVulListResponse ExportVulList(ExportVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportVulList", ExportVulListResponse.class);
    }

    /**
     *This API is used to obtain the locally stored data.
     * @param req GetLocalStorageItemRequest
     * @return GetLocalStorageItemResponse
     * @throws TencentCloudSDKException
     */
    public GetLocalStorageItemResponse GetLocalStorageItem(GetLocalStorageItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLocalStorageItem", GetLocalStorageItemResponse.class);
    }

    /**
     *This API is used to ignore vulnerabilities.
     * @param req IgnoreImpactedHostsRequest
     * @return IgnoreImpactedHostsResponse
     * @throws TencentCloudSDKException
     */
    public IgnoreImpactedHostsResponse IgnoreImpactedHosts(IgnoreImpactedHostsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IgnoreImpactedHosts", IgnoreImpactedHostsResponse.class);
    }

    /**
     *This API is used to obtain the list of locally stored key values.
     * @param req KeysLocalStorageRequest
     * @return KeysLocalStorageResponse
     * @throws TencentCloudSDKException
     */
    public KeysLocalStorageResponse KeysLocalStorage(KeysLocalStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KeysLocalStorage", KeysLocalStorageResponse.class);
    }

    /**
     *This API is used to enable the configuration of automatically enabling the professional protection configuration for newly added hosts.
     * @param req ModifyAutoOpenProVersionConfigRequest
     * @return ModifyAutoOpenProVersionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoOpenProVersionConfigResponse ModifyAutoOpenProVersionConfig(ModifyAutoOpenProVersionConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoOpenProVersionConfig", ModifyAutoOpenProVersionConfigResponse.class);
    }

    /**
     *This API is used to modify the brute-force blocking mode.
     * @param req ModifyBanModeRequest
     * @return ModifyBanModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBanModeResponse ModifyBanMode(ModifyBanModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBanMode", ModifyBanModeResponse.class);
    }

    /**
     *This API is used to set the block switch status.
     * @param req ModifyBanStatusRequest
     * @return ModifyBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBanStatusResponse ModifyBanStatus(ModifyBanStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBanStatus", ModifyBanStatusResponse.class);
    }

    /**
     *This API is used to modify the blocking allowlist.
     * @param req ModifyBanWhiteListRequest
     * @return ModifyBanWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBanWhiteListResponse ModifyBanWhiteList(ModifyBanWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBanWhiteList", ModifyBanWhiteListResponse.class);
    }

    /**
     *This API is used to change the baseline policy settings.
     * @param req ModifyBaselinePolicyRequest
     * @return ModifyBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselinePolicyResponse ModifyBaselinePolicy(ModifyBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselinePolicy", ModifyBaselinePolicyResponse.class);
    }

    /**
     *This API is used to add or modify high-risk command policies.
     * @param req ModifyBashPolicyRequest
     * @return ModifyBashPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBashPolicyResponse ModifyBashPolicy(ModifyBashPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBashPolicy", ModifyBashPolicyResponse.class);
    }

    /**
     *This API is used to switch the statuses of high-risk command policies.
     * @param req ModifyBashPolicyStatusRequest
     * @return ModifyBashPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBashPolicyStatusResponse ModifyBashPolicyStatus(ModifyBashPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBashPolicyStatus", ModifyBashPolicyStatusResponse.class);
    }

    /**
     *This API is used to modify brute force cracking rules.
     * @param req ModifyBruteAttackRulesRequest
     * @return ModifyBruteAttackRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBruteAttackRulesResponse ModifyBruteAttackRules(ModifyBruteAttackRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBruteAttackRules", ModifyBruteAttackRulesResponse.class);
    }

    /**
     *This API is used to modify the status of network attack events.
     * @param req ModifyEventAttackStatusRequest
     * @return ModifyEventAttackStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEventAttackStatusResponse ModifyEventAttackStatus(ModifyEventAttackStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEventAttackStatus", ModifyEventAttackStatusResponse.class);
    }

    /**
     *This API is used to update the core file events.
     * @param req ModifyFileTamperEventsRequest
     * @return ModifyFileTamperEventsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileTamperEventsResponse ModifyFileTamperEvents(ModifyFileTamperEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileTamperEvents", ModifyFileTamperEventsResponse.class);
    }

    /**
     *This API is used to edit and add core file monitoring rules.
     * @param req ModifyFileTamperRuleRequest
     * @return ModifyFileTamperRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileTamperRuleResponse ModifyFileTamperRule(ModifyFileTamperRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileTamperRule", ModifyFileTamperRuleResponse.class);
    }

    /**
     *This API is used to update the core file rule status (batch deletion and disabling supported).
     * @param req ModifyFileTamperRuleStatusRequest
     * @return ModifyFileTamperRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileTamperRuleStatusResponse ModifyFileTamperRuleStatus(ModifyFileTamperRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileTamperRuleStatus", ModifyFileTamperRuleStatusResponse.class);
    }

    /**
     *This API is used to enable and disable Java webshell plugins.
     * @param req ModifyJavaMemShellPluginSwitchRequest
     * @return ModifyJavaMemShellPluginSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJavaMemShellPluginSwitchResponse ModifyJavaMemShellPluginSwitch(ModifyJavaMemShellPluginSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyJavaMemShellPluginSwitch", ModifyJavaMemShellPluginSwitchResponse.class);
    }

    /**
     *This API is used to modify the Java webshell event status.
     * @param req ModifyJavaMemShellsStatusRequest
     * @return ModifyJavaMemShellsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJavaMemShellsStatusResponse ModifyJavaMemShellsStatus(ModifyJavaMemShellsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyJavaMemShellsStatus", ModifyJavaMemShellsStatusResponse.class);
    }

    /**
     *This API is used to bind machines to an authorization in batches.
     * @param req ModifyLicenseBindsRequest
     * @return ModifyLicenseBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLicenseBindsResponse ModifyLicenseBinds(ModifyLicenseBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLicenseBinds", ModifyLicenseBindsResponse.class);
    }

    /**
     *This API is used to edit CWPP - pay-as-you-go authorization orders.
     * @param req ModifyLicenseOrderRequest
     * @return ModifyLicenseOrderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLicenseOrderResponse ModifyLicenseOrder(ModifyLicenseOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLicenseOrder", ModifyLicenseOrderResponse.class);
    }

    /**
     *This API is used to add or modify the access configuration of logs shipped to Kafka.
     * @param req ModifyLogKafkaAccessRequest
     * @return ModifyLogKafkaAccessResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogKafkaAccessResponse ModifyLogKafkaAccess(ModifyLogKafkaAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogKafkaAccess", ModifyLogKafkaAccessResponse.class);
    }

    /**
     *This API is used to modify the shipping configuration and switch of the specified log category.
     * @param req ModifyLogKafkaDeliverTypeRequest
     * @return ModifyLogKafkaDeliverTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogKafkaDeliverTypeResponse ModifyLogKafkaDeliverType(ModifyLogKafkaDeliverTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogKafkaDeliverType", ModifyLogKafkaDeliverTypeResponse.class);
    }

    /**
     *This API is used to modify the information of log shipping statuses.
     * @param req ModifyLogKafkaStateRequest
     * @return ModifyLogKafkaStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogKafkaStateResponse ModifyLogKafkaState(ModifyLogKafkaStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogKafkaState", ModifyLogKafkaStateResponse.class);
    }

    /**
     *This API is used to modify the log storage configuration.
     * @param req ModifyLogStorageConfigRequest
     * @return ModifyLogStorageConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogStorageConfigResponse ModifyLogStorageConfig(ModifyLogStorageConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogStorageConfig", ModifyLogStorageConfigResponse.class);
    }

    /**
     *This API is used to update the log-in audit allowlist information.
     * @param req ModifyLoginWhiteInfoRequest
     * @return ModifyLoginWhiteInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoginWhiteInfoResponse ModifyLoginWhiteInfo(ModifyLoginWhiteInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoginWhiteInfo", ModifyLoginWhiteInfoResponse.class);
    }

    /**
     *This API is used to update the log-in audit allowlist information. (The number of server lists needs to be less than 1,000.)
     * @param req ModifyLoginWhiteRecordRequest
     * @return ModifyLoginWhiteRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoginWhiteRecordResponse ModifyLoginWhiteRecord(ModifyLoginWhiteRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoginWhiteRecord", ModifyLoginWhiteRecordResponse.class);
    }

    /**
     *This API is used to modify the cleanup configuration of the machine.
     * @param req ModifyMachineAutoClearConfigRequest
     * @return ModifyMachineAutoClearConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineAutoClearConfigResponse ModifyMachineAutoClearConfig(ModifyMachineAutoClearConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMachineAutoClearConfig", ModifyMachineAutoClearConfigResponse.class);
    }

    /**
     *This API is used to update the malicious request allowlist.
     * @param req ModifyMaliciousRequestWhiteListRequest
     * @return ModifyMaliciousRequestWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaliciousRequestWhiteListResponse ModifyMaliciousRequestWhiteList(ModifyMaliciousRequestWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaliciousRequestWhiteList", ModifyMaliciousRequestWhiteListResponse.class);
    }

    /**
     *This API is used to set scheduled scan.
     * @param req ModifyMalwareTimingScanSettingsRequest
     * @return ModifyMalwareTimingScanSettingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMalwareTimingScanSettingsResponse ModifyMalwareTimingScanSettings(ModifyMalwareTimingScanSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMalwareTimingScanSettings", ModifyMalwareTimingScanSettingsResponse.class);
    }

    /**
     *This API is used to edit the Trojan allowlist.
     * @param req ModifyMalwareWhiteListRequest
     * @return ModifyMalwareWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMalwareWhiteListResponse ModifyMalwareWhiteList(ModifyMalwareWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMalwareWhiteList", ModifyMalwareWhiteListResponse.class);
    }

    /**
     *This API is used to modify network attack settings.
     * @param req ModifyNetAttackSettingRequest
     * @return ModifyNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetAttackSettingResponse ModifyNetAttackSetting(ModifyNetAttackSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetAttackSetting", ModifyNetAttackSettingResponse.class);
    }

    /**
     *This API is used to edit the network attack whitelist.
     * @param req ModifyNetAttackWhiteListRequest
     * @return ModifyNetAttackWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetAttackWhiteListResponse ModifyNetAttackWhiteList(ModifyNetAttackWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetAttackWhiteList", ModifyNetAttackWhiteListResponse.class);
    }

    /**
     *This API is used to modify the status of anti-ransomware events.
     * @param req ModifyRansomDefenseEventsStatusRequest
     * @return ModifyRansomDefenseEventsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRansomDefenseEventsStatusResponse ModifyRansomDefenseEventsStatus(ModifyRansomDefenseEventsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRansomDefenseEventsStatus", ModifyRansomDefenseEventsStatusResponse.class);
    }

    /**
     *This API is used to modify the anti-ransomware policy status in batches.
     * @param req ModifyRansomDefenseStrategyStatusRequest
     * @return ModifyRansomDefenseStrategyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRansomDefenseStrategyStatusResponse ModifyRansomDefenseStrategyStatus(ModifyRansomDefenseStrategyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRansomDefenseStrategyStatus", ModifyRansomDefenseStrategyStatusResponse.class);
    }

    /**
     *This API is used to modify malicious request policies.
     * @param req ModifyRiskDnsPolicyRequest
     * @return ModifyRiskDnsPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskDnsPolicyResponse ModifyRiskDnsPolicy(ModifyRiskDnsPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskDnsPolicy", ModifyRiskDnsPolicyResponse.class);
    }

    /**
     *This API is used to modify the status of malicious request policies.
     * @param req ModifyRiskDnsPolicyStatusRequest
     * @return ModifyRiskDnsPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskDnsPolicyStatusResponse ModifyRiskDnsPolicyStatus(ModifyRiskDnsPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskDnsPolicyStatus", ModifyRiskDnsPolicyStatusResponse.class);
    }

    /**
     *This API is used to change the status of intrusion detection events, including virus scanning, abnormal log-ins, password cracking, high-risk commands, reverse shells, and local privilege escalations.
     * @param req ModifyRiskEventsStatusRequest
     * @return ModifyRiskEventsStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskEventsStatusResponse ModifyRiskEventsStatus(ModifyRiskEventsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskEventsStatus", ModifyRiskEventsStatusResponse.class);
    }

    /**
     *This API is used to create or modify user custom settings.
     * @param req ModifyUsersConfigRequest
     * @return ModifyUsersConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUsersConfigResponse ModifyUsersConfig(ModifyUsersConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUsersConfig", ModifyUsersConfigResponse.class);
    }

    /**
     *This API is used to change the vulnerability defense event status. (Vulnerability fixing is carried out using another API.)
     * @param req ModifyVulDefenceEventStatusRequest
     * @return ModifyVulDefenceEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulDefenceEventStatusResponse ModifyVulDefenceEventStatus(ModifyVulDefenceEventStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulDefenceEventStatus", ModifyVulDefenceEventStatusResponse.class);
    }

    /**
     *This API is used to modify vulnerability defense plugin settings.
1) The new settings apply to new hosts automatically. scope is set to 1, and quuids is left blank.
2) The new settings do not apply to Ultimate Edition hosts. scope is set to 0, and the current QUUID list is specified as the value of quuids.
3) For a given QUUID list, when scope is set to 0, QUUID selected by the user is specified as the value of quuids.
     * @param req ModifyVulDefenceSettingRequest
     * @return ModifyVulDefenceSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulDefenceSettingResponse ModifyVulDefenceSetting(ModifyVulDefenceSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulDefenceSetting", ModifyVulDefenceSettingResponse.class);
    }

    /**
     *This API is used to modify the alarming machine scope settings.
     * @param req ModifyWarningHostConfigRequest
     * @return ModifyWarningHostConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWarningHostConfigResponse ModifyWarningHostConfig(ModifyWarningHostConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWarningHostConfig", ModifyWarningHostConfigResponse.class);
    }

    /**
     *This API is used to modify alarm settings.
     * @param req ModifyWarningSettingRequest
     * @return ModifyWarningSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWarningSettingResponse ModifyWarningSetting(ModifyWarningSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWarningSetting", ModifyWarningSettingResponse.class);
    }

    /**
     *This API is used to add or modify alarm policies.
     * @param req ModifyWebHookPolicyRequest
     * @return ModifyWebHookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookPolicyResponse ModifyWebHookPolicy(ModifyWebHookPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookPolicy", ModifyWebHookPolicyResponse.class);
    }

    /**
     *This API is used to modify the alarm policy switch.
     * @param req ModifyWebHookPolicyStatusRequest
     * @return ModifyWebHookPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookPolicyStatusResponse ModifyWebHookPolicyStatus(ModifyWebHookPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookPolicyStatus", ModifyWebHookPolicyStatusResponse.class);
    }

    /**
     *This API is used to add or update the alarm recipient.
     * @param req ModifyWebHookReceiverRequest
     * @return ModifyWebHookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookReceiverResponse ModifyWebHookReceiver(ModifyWebHookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookReceiver", ModifyWebHookReceiverResponse.class);
    }

    /**
     *This API is used to add or modify the rules of WeCom chatbots.
     * @param req ModifyWebHookRuleRequest
     * @return ModifyWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookRuleResponse ModifyWebHookRule(ModifyWebHookRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookRule", ModifyWebHookRuleResponse.class);
    }

    /**
     *This API is used to modify the rules of WeCom chatbots.
     * @param req ModifyWebHookRuleStatusRequest
     * @return ModifyWebHookRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebHookRuleStatusResponse ModifyWebHookRuleStatus(ModifyWebHookRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebHookRuleStatus", ModifyWebHookRuleStatusResponse.class);
    }

    /**
     *This API is used to enable or disable website anti-tampering protection.
     * @param req ModifyWebPageProtectSwitchRequest
     * @return ModifyWebPageProtectSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebPageProtectSwitchResponse ModifyWebPageProtectSwitch(ModifyWebPageProtectSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebPageProtectSwitch", ModifyWebPageProtectSwitchResponse.class);
    }

    /**
     *This API is used to roll back anti-ransomware snapshots.
     * @param req RansomDefenseRollbackRequest
     * @return RansomDefenseRollbackResponse
     * @throws TencentCloudSDKException
     */
    public RansomDefenseRollbackResponse RansomDefenseRollback(RansomDefenseRollbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RansomDefenseRollback", RansomDefenseRollbackResponse.class);
    }

    /**
     *This API is used to batch recover quarantined Trojan files.
     * @param req RecoverMalwaresRequest
     * @return RecoverMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public RecoverMalwaresResponse RecoverMalwares(RecoverMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RecoverMalwares", RecoverMalwaresResponse.class);
    }

    /**
     *This API is used to delete the locally stored data.
     * @param req RemoveLocalStorageItemRequest
     * @return RemoveLocalStorageItemResponse
     * @throws TencentCloudSDKException
     */
    public RemoveLocalStorageItemResponse RemoveLocalStorageItem(RemoveLocalStorageItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveLocalStorageItem", RemoveLocalStorageItemResponse.class);
    }

    /**
     *This API is used to delete all records of the host. Currently, it only supports non-Tencent Cloud hosts, and the host needs to be offline.
     * @param req RemoveMachineRequest
     * @return RemoveMachineResponse
     * @throws TencentCloudSDKException
     */
    public RemoveMachineResponse RemoveMachine(RemoveMachineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveMachine", RemoveMachineResponse.class);
    }

    /**
     *This API is used to retry to create snapshots and automatically fix vulnerabilities when the creation fails.
     * @param req RetryCreateSnapshotRequest
     * @return RetryCreateSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public RetryCreateSnapshotResponse RetryCreateSnapshot(RetryCreateSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryCreateSnapshot", RetryCreateSnapshotResponse.class);
    }

    /**
     *This API is used to fix vulnerabilities on a single host when the fix fails.
     * @param req RetryVulFixRequest
     * @return RetryVulFixResponse
     * @throws TencentCloudSDKException
     */
    public RetryVulFixResponse RetryVulFix(RetryVulFixRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryVulFix", RetryVulFixResponse.class);
    }

    /**
     *This API is used to obtain baseline detection and re-detection APIs.
     * @param req ScanBaselineRequest
     * @return ScanBaselineResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselineResponse ScanBaseline(ScanBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaseline", ScanBaselineResponse.class);
    }

    /**
     *This API is used to restart the scan task. Specifying the machine is supported.
     * @param req ScanTaskAgainRequest
     * @return ScanTaskAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanTaskAgainResponse ScanTaskAgain(ScanTaskAgainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanTaskAgain", ScanTaskAgainResponse.class);
    }

    /**
     *This API is used to perform one-click vulnerability scans.
     * @param req ScanVulRequest
     * @return ScanVulResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulResponse ScanVul(ScanVulRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanVul", ScanVulResponse.class);
    }

    /**
     *This API is used to redetect the API.
     * @param req ScanVulAgainRequest
     * @return ScanVulAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulAgainResponse ScanVulAgain(ScanVulAgainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanVulAgain", ScanVulAgainResponse.class);
    }

    /**
     *This API is used to complete regular vulnerability scan settings.
     * @param req ScanVulSettingRequest
     * @return ScanVulSettingResponse
     * @throws TencentCloudSDKException
     */
    public ScanVulSettingResponse ScanVulSetting(ScanVulSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanVulSetting", ScanVulSettingResponse.class);
    }

    /**
     *This API is used to query logs.
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchLog", SearchLogResponse.class);
    }

    /**
     *This API is used to isolate Trojans.
     * @param req SeparateMalwaresRequest
     * @return SeparateMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public SeparateMalwaresResponse SeparateMalwares(SeparateMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SeparateMalwares", SeparateMalwaresResponse.class);
    }

    /**
     *This API is used to set the high-risk command event status.
     * @param req SetBashEventsStatusRequest
     * @return SetBashEventsStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetBashEventsStatusResponse SetBashEventsStatus(SetBashEventsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetBashEventsStatus", SetBashEventsStatusResponse.class);
    }

    /**
     *This API is used to set the expiration time of the locally stored data.
     * @param req SetLocalStorageExpireRequest
     * @return SetLocalStorageExpireResponse
     * @throws TencentCloudSDKException
     */
    public SetLocalStorageExpireResponse SetLocalStorageExpire(SetLocalStorageExpireRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLocalStorageExpire", SetLocalStorageExpireResponse.class);
    }

    /**
     *This API is used to set the locally stored data.
     * @param req SetLocalStorageItemRequest
     * @return SetLocalStorageItemResponse
     * @throws TencentCloudSDKException
     */
    public SetLocalStorageItemResponse SetLocalStorageItem(SetLocalStorageItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLocalStorageItem", SetLocalStorageItemResponse.class);
    }

    /**
     *This API is used to perform baseline checks.
     * @param req StartBaselineDetectRequest
     * @return StartBaselineDetectResponse
     * @throws TencentCloudSDKException
     */
    public StartBaselineDetectResponse StartBaselineDetect(StartBaselineDetectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartBaselineDetect", StartBaselineDetectResponse.class);
    }

    /**
     *This API is used to stop the asset scan task.
     * @param req StopAssetScanRequest
     * @return StopAssetScanResponse
     * @throws TencentCloudSDKException
     */
    public StopAssetScanResponse StopAssetScan(StopAssetScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAssetScan", StopAssetScanResponse.class);
    }

    /**
     *This API is used to stop baseline check.
     * @param req StopBaselineDetectRequest
     * @return StopBaselineDetectResponse
     * @throws TencentCloudSDKException
     */
    public StopBaselineDetectResponse StopBaselineDetect(StopBaselineDetectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopBaselineDetect", StopBaselineDetectResponse.class);
    }

    /**
     *This API is used to stop displaying pop-up prompts about brute force cracking blocking.
     * @param req StopNoticeBanTipsRequest
     * @return StopNoticeBanTipsResponse
     * @throws TencentCloudSDKException
     */
    public StopNoticeBanTipsResponse StopNoticeBanTips(StopNoticeBanTipsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopNoticeBanTips", StopNoticeBanTipsResponse.class);
    }

    /**
     *This API is used to switch the statuses of high-risk command rules.
     * @param req SwitchBashRulesRequest
     * @return SwitchBashRulesResponse
     * @throws TencentCloudSDKException
     */
    public SwitchBashRulesResponse SwitchBashRules(SwitchBashRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchBashRules", SwitchBashRulesResponse.class);
    }

    /**
     *This API is used to synchronize the asset scan information.
     * @param req SyncAssetScanRequest
     * @return SyncAssetScanResponse
     * @throws TencentCloudSDKException
     */
    public SyncAssetScanResponse SyncAssetScan(SyncAssetScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncAssetScan", SyncAssetScanResponse.class);
    }

    /**
     *This API is used to sync the summary of baseline detection progress.
     * @param req SyncBaselineDetectSummaryRequest
     * @return SyncBaselineDetectSummaryResponse
     * @throws TencentCloudSDKException
     */
    public SyncBaselineDetectSummaryResponse SyncBaselineDetectSummary(SyncBaselineDetectSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncBaselineDetectSummary", SyncBaselineDetectSummaryResponse.class);
    }

    /**
     *This API is used to sync the machine information.
     * @param req SyncMachinesRequest
     * @return SyncMachinesResponse
     * @throws TencentCloudSDKException
     */
    public SyncMachinesResponse SyncMachines(SyncMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncMachines", SyncMachinesResponse.class);
    }

    /**
     *This API is used to test the rules of WeCom chatbots.
     * @param req TestWebHookRuleRequest
     * @return TestWebHookRuleResponse
     * @throws TencentCloudSDKException
     */
    public TestWebHookRuleResponse TestWebHookRule(TestWebHookRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TestWebHookRule", TestWebHookRuleResponse.class);
    }

    /**
     *This API is used to mark identified Trojan files as Trusted.
     * @param req TrustMalwaresRequest
     * @return TrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public TrustMalwaresResponse TrustMalwares(TrustMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TrustMalwares", TrustMalwaresResponse.class);
    }

    /**
     *This API is used to untrust Trojan files.
     * @param req UntrustMalwaresRequest
     * @return UntrustMalwaresResponse
     * @throws TencentCloudSDKException
     */
    public UntrustMalwaresResponse UntrustMalwares(UntrustMalwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UntrustMalwares", UntrustMalwaresResponse.class);
    }

    /**
     *This API is used to update the policy information based on baseline policy IDs.
     * @param req UpdateBaselineStrategyRequest
     * @return UpdateBaselineStrategyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateBaselineStrategyResponse UpdateBaselineStrategy(UpdateBaselineStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateBaselineStrategy", UpdateBaselineStrategyResponse.class);
    }

    /**
     *This API is used to obtain the list of tags associated with machines.
     * @param req UpdateMachineTagsRequest
     * @return UpdateMachineTagsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateMachineTagsResponse UpdateMachineTags(UpdateMachineTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateMachineTags", UpdateMachineTagsResponse.class);
    }

}
