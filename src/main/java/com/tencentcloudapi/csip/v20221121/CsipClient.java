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
package com.tencentcloudapi.csip.v20221121;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.csip.v20221121.models.*;

public class CsipClient extends AbstractClient{
    private static String endpoint = "csip.intl.tencentcloudapi.com";
    private static String service = "csip";
    private static String version = "2022-11-21";

    public CsipClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CsipClient(Credential credential, String region, ClientProfile profile) {
        super(CsipClient.endpoint, CsipClient.version, credential, region, profile);
    }

    /**
     *This API is used to create or modify SMTP mailbox access requests.
     * @param req AccessAIAnalysisSMTPRequest
     * @return AccessAIAnalysisSMTPResponse
     * @throws TencentCloudSDKException
     */
    public AccessAIAnalysisSMTPResponse AccessAIAnalysisSMTP(AccessAIAnalysisSMTPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AccessAIAnalysisSMTP", AccessAIAnalysisSMTPResponse.class);
    }

    /**
     *Add asset administrator
     * @param req AddDspmAssetManagerRequest
     * @return AddDspmAssetManagerResponse
     * @throws TencentCloudSDKException
     */
    public AddDspmAssetManagerResponse AddDspmAssetManager(AddDspmAssetManagerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDspmAssetManager", AddDspmAssetManagerResponse.class);
    }

    /**
     *Add mirror repository information.
     * @param req AddImageRegistryRequest
     * @return AddImageRegistryResponse
     * @throws TencentCloudSDKException
     */
    public AddImageRegistryResponse AddImageRegistry(AddImageRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddImageRegistry", AddImageRegistryResponse.class);
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
     *CSIP Role Authorization Binding API
     * @param req AddNewBindRoleUserRequest
     * @return AddNewBindRoleUserResponse
     * @throws TencentCloudSDKException
     */
    public AddNewBindRoleUserResponse AddNewBindRoleUser(AddNewBindRoleUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNewBindRoleUser", AddNewBindRoleUserResponse.class);
    }

    /**
     *Add a vulnerability allowlist
     * @param req AddVulWhitelistRequest
     * @return AddVulWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public AddVulWhitelistResponse AddVulWhitelist(AddVulWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddVulWhitelist", AddVulWhitelistResponse.class);
    }

    /**
     *Batch modify the "periodic scan configuration / automatic synchronization of newly-added detection items / detection item hit configuration / customized detection items" settings in the baseline policy. Only fields passed in the request are modified.
     * @param req BatchModifyBaselinePolicyRequest
     * @return BatchModifyBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyBaselinePolicyResponse BatchModifyBaselinePolicy(BatchModifyBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyBaselinePolicy", BatchModifyBaselinePolicyResponse.class);
    }

    /**
     *Batch modify the scheduled scan task configurations of image repositories.
     * @param req BatchModifyImageRegistryTimedScanTaskConfigRequest
     * @return BatchModifyImageRegistryTimedScanTaskConfigResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyImageRegistryTimedScanTaskConfigResponse BatchModifyImageRegistryTimedScanTaskConfig(BatchModifyImageRegistryTimedScanTaskConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyImageRegistryTimedScanTaskConfig", BatchModifyImageRegistryTimedScanTaskConfigResponse.class);
    }

    /**
     *Batch Modify Sensitive Information Allowlist for Container Images
     * @param req BatchModifyImageSensitiveWhitelistRequest
     * @return BatchModifyImageSensitiveWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyImageSensitiveWhitelistResponse BatchModifyImageSensitiveWhitelist(BatchModifyImageSensitiveWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyImageSensitiveWhitelist", BatchModifyImageSensitiveWhitelistResponse.class);
    }

    /**
     *Batch modify the Trojan allowlist for images.
     * @param req BatchModifyImageVirusWhitelistRequest
     * @return BatchModifyImageVirusWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyImageVirusWhitelistResponse BatchModifyImageVirusWhitelist(BatchModifyImageVirusWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyImageVirusWhitelist", BatchModifyImageVirusWhitelistResponse.class);
    }

    /**
     *Batch Modify Vulnerability Allowlist for Container Images
     * @param req BatchModifyImageVulWhitelistRequest
     * @return BatchModifyImageVulWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyImageVulWhitelistResponse BatchModifyImageVulWhitelist(BatchModifyImageVulWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyImageVulWhitelist", BatchModifyImageVulWhitelistResponse.class);
    }

    /**
     *Cancel a permanently ignored EDR multi-behavior alarm. Remove the corresponding host and rule record from the AI-Link permanent ignore allowlist and restore the alarm status to PENDING.
     * @param req CancelEdrAlertIgnoreRequest
     * @return CancelEdrAlertIgnoreResponse
     * @throws TencentCloudSDKException
     */
    public CancelEdrAlertIgnoreResponse CancelEdrAlertIgnore(CancelEdrAlertIgnoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelEdrAlertIgnore", CancelEdrAlertIgnoreResponse.class);
    }

    /**
     *Determine whether the current user is on the flagship edition for hosts.
     * @param req CheckCWPExposePathPermissionRequest
     * @return CheckCWPExposePathPermissionResponse
     * @throws TencentCloudSDKException
     */
    public CheckCWPExposePathPermissionResponse CheckCWPExposePathPermission(CheckCWPExposePathPermissionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCWPExposePathPermission", CheckCWPExposePathPermissionResponse.class);
    }

    /**
     *Check whether the image repository instance name is duplicate.
     * @param req CheckImageRegistryInstanceNameDuplicateRequest
     * @return CheckImageRegistryInstanceNameDuplicateResponse
     * @throws TencentCloudSDKException
     */
    public CheckImageRegistryInstanceNameDuplicateResponse CheckImageRegistryInstanceNameDuplicate(CheckImageRegistryInstanceNameDuplicateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckImageRegistryInstanceNameDuplicate", CheckImageRegistryInstanceNameDuplicateResponse.class);
    }

    /**
     *Determine whether the current user is on the flagship edition.
     * @param req CheckIsUltimateVersionRequest
     * @return CheckIsUltimateVersionResponse
     * @throws TencentCloudSDKException
     */
    public CheckIsUltimateVersionResponse CheckIsUltimateVersion(CheckIsUltimateVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckIsUltimateVersion", CheckIsUltimateVersionResponse.class);
    }

    /**
     *Risk verification example
     * @param req CheckRiskRequest
     * @return CheckRiskResponse
     * @throws TencentCloudSDKException
     */
    public CheckRiskResponse CheckRisk(CheckRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckRisk", CheckRiskResponse.class);
    }

    /**
     *Replicate a custom baseline policy.
     * @param req CopyBaselinePolicyRequest
     * @return CopyBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CopyBaselinePolicyResponse CopyBaselinePolicy(CopyBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyBaselinePolicy", CopyBaselinePolicyResponse.class);
    }

    /**
     *Create an AI scheduled task.

Create an AI scheduled task by entering the task name, prompt content, and trigger configuration. The AI scheduled task ID will be returned after successful creation.
     * @param req CreateAIScheduleRequest
     * @return CreateAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIScheduleResponse CreateAISchedule(CreateAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAISchedule", CreateAIScheduleResponse.class);
    }

    /**
     *Detect async tasks of AK
     * @param req CreateAccessKeyCheckTaskRequest
     * @return CreateAccessKeyCheckTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeyCheckTaskResponse CreateAccessKeyCheckTask(CreateAccessKeyCheckTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessKeyCheckTask", CreateAccessKeyCheckTaskResponse.class);
    }

    /**
     *Trigger an AK asset sync task.
     * @param req CreateAccessKeySyncTaskRequest
     * @return CreateAccessKeySyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeySyncTaskResponse CreateAccessKeySyncTask(CreateAccessKeySyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessKeySyncTask", CreateAccessKeySyncTaskResponse.class);
    }

    /**
     *Creates a task to export all assets.
     * @param req CreateAllAssetsExportJobRequest
     * @return CreateAllAssetsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAllAssetsExportJobResponse CreateAllAssetsExportJob(CreateAllAssetsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAllAssetsExportJob", CreateAllAssetsExportJobResponse.class);
    }

    /**
     *Creates a component list export task for image assets.
     * @param req CreateAssetComponentListExportJobRequest
     * @return CreateAssetComponentListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetComponentListExportJobResponse CreateAssetComponentListExportJob(CreateAssetComponentListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetComponentListExportJob", CreateAssetComponentListExportJobResponse.class);
    }

    /**
     *Create a mirror repository component associated image list export task.
     * @param req CreateAssetComponentRelatedImageListExportJobRequest
     * @return CreateAssetComponentRelatedImageListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetComponentRelatedImageListExportJobResponse CreateAssetComponentRelatedImageListExportJob(CreateAssetComponentRelatedImageListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetComponentRelatedImageListExportJob", CreateAssetComponentRelatedImageListExportJobResponse.class);
    }

    /**
     *Create an asset search view.
     * @param req CreateAssetFilterViewRequest
     * @return CreateAssetFilterViewResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetFilterViewResponse CreateAssetFilterView(CreateAssetFilterViewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetFilterView", CreateAssetFilterViewResponse.class);
    }

    /**
     *Create a host process list export task
     * @param req CreateAssetProcessExportJobRequest
     * @return CreateAssetProcessExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetProcessExportJobResponse CreateAssetProcessExportJob(CreateAssetProcessExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetProcessExportJob", CreateAssetProcessExportJobResponse.class);
    }

    /**
     *This API is used to create an asset sync task.
     * @param req CreateAssetSyncTaskRequest
     * @return CreateAssetSyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetSyncTaskResponse CreateAssetSyncTask(CreateAssetSyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetSyncTask", CreateAssetSyncTaskResponse.class);
    }

    /**
     *Create an asset tag.
     * @param req CreateAssetTagRequest
     * @return CreateAssetTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetTagResponse CreateAssetTag(CreateAssetTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetTag", CreateAssetTagResponse.class);
    }

    /**
     *Create a sample risk list export task from the asset perspective
     * @param req CreateAssetViewRisksExportJobRequest
     * @return CreateAssetViewRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetViewRisksExportJobResponse CreateAssetViewRisksExportJob(CreateAssetViewRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssetViewRisksExportJob", CreateAssetViewRisksExportJobResponse.class);
    }

    /**
     *Create a baseline aggregation detection item export task. Use ExportType to select exporting statistics or risk details. You can limit the range by conditions such as policy and category. The task executes asynchronously in the backend. Once completed, you can download the result file from the export task list.
     * @param req CreateBaselineAggregatedItemExportJobRequest
     * @return CreateBaselineAggregatedItemExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineAggregatedItemExportJobResponse CreateBaselineAggregatedItemExportJob(CreateBaselineAggregatedItemExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaselineAggregatedItemExportJob", CreateBaselineAggregatedItemExportJobResponse.class);
    }

    /**
     *This API is used to create a baseline fix record export task to export the records of fixed detection items, including detection item information, asset information, and repair time. The task executes asynchronously in the backend. Once completed, the result file can be downloaded from the export task list.
     * @param req CreateBaselineFixRecordExportJobRequest
     * @return CreateBaselineFixRecordExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineFixRecordExportJobResponse CreateBaselineFixRecordExportJob(CreateBaselineFixRecordExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaselineFixRecordExportJob", CreateBaselineFixRecordExportJobResponse.class);
    }

    /**
     *Create a baseline main task export task to export detection items and subtask data under the specified main task. The task executes asynchronously in the backend. Once completed, the result file can be downloaded in the export task list.
     * @param req CreateBaselineMainTaskExportJobRequest
     * @return CreateBaselineMainTaskExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateBaselineMainTaskExportJobResponse CreateBaselineMainTaskExportJob(CreateBaselineMainTaskExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBaselineMainTaskExportJob", CreateBaselineMainTaskExportJobResponse.class);
    }

    /**
     *Example of creating an export task for a cloud resource configuration detection PDF report.
     * @param req CreateCFGRiskPDFReportExportJobRequest
     * @return CreateCFGRiskPDFReportExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCFGRiskPDFReportExportJobResponse CreateCFGRiskPDFReportExportJob(CreateCFGRiskPDFReportExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCFGRiskPDFReportExportJob", CreateCFGRiskPDFReportExportJobResponse.class);
    }

    /**
     *Example of creating an asset perspective risk list export task
     * @param req CreateCFGRisksExportJobRequest
     * @return CreateCFGRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCFGRisksExportJobResponse CreateCFGRisksExportJob(CreateCFGRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCFGRisksExportJob", CreateCFGRisksExportJobResponse.class);
    }

    /**
     *This API is used to create a CSIP manual scan.
     * @param req CreateCSIPManualMalwareScanRequest
     * @return CreateCSIPManualMalwareScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateCSIPManualMalwareScanResponse CreateCSIPManualMalwareScan(CreateCSIPManualMalwareScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCSIPManualMalwareScan", CreateCSIPManualMalwareScanResponse.class);
    }

    /**
     *Create a sample risk list export task from the asset perspective
     * @param req CreateCheckViewRisksExportJobRequest
     * @return CreateCheckViewRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCheckViewRisksExportJobResponse CreateCheckViewRisksExportJob(CreateCheckViewRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCheckViewRisksExportJob", CreateCheckViewRisksExportJobResponse.class);
    }

    /**
     *This API is used to create an SCF export task.
     * @param req CreateCloudFunctionExportJobRequest
     * @return CreateCloudFunctionExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudFunctionExportJobResponse CreateCloudFunctionExportJob(CreateCloudFunctionExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudFunctionExportJob", CreateCloudFunctionExportJobResponse.class);
    }

    /**
     *This API is used to create a cluster asset sync task.
     * @param req CreateClusterAssetSyncTaskRequest
     * @return CreateClusterAssetSyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterAssetSyncTaskResponse CreateClusterAssetSyncTask(CreateClusterAssetSyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterAssetSyncTask", CreateClusterAssetSyncTaskResponse.class);
    }

    /**
     *Creates a cluster container list export task
     * @param req CreateClusterContainerListExportJobRequest
     * @return CreateClusterContainerListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterContainerListExportJobResponse CreateClusterContainerListExportJob(CreateClusterContainerListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterContainerListExportJob", CreateClusterContainerListExportJobResponse.class);
    }

    /**
     *Create a cluster list export task
     * @param req CreateClusterListExportJobRequest
     * @return CreateClusterListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterListExportJobResponse CreateClusterListExportJob(CreateClusterListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterListExportJob", CreateClusterListExportJobResponse.class);
    }

    /**
     *Creates a cluster namespace list export task. The export fields include namespace name, Labels, and creation time. Filter filtering is supported. Export is implemented through an async task. After JobId is returned, the frontend polls to query the export task status.
     * @param req CreateClusterNamespaceListExportJobRequest
     * @return CreateClusterNamespaceListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterNamespaceListExportJobResponse CreateClusterNamespaceListExportJob(CreateClusterNamespaceListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterNamespaceListExportJob", CreateClusterNamespaceListExportJobResponse.class);
    }

    /**
     *This API is used to create a cluster node list export task. The export fields include node ID, node name, public IP address, private IP address, node type, cores, client status, and running state. NodeType, ClientStatus, and RunStatus are internationalized. Filter filtering is supported, including ClientStatus memory filtering. Export is implemented through an async task. After JobId is returned, the frontend polls to query the export task status.
     * @param req CreateClusterNodeListExportJobRequest
     * @return CreateClusterNodeListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterNodeListExportJobResponse CreateClusterNodeListExportJob(CreateClusterNodeListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterNodeListExportJob", CreateClusterNodeListExportJobResponse.class);
    }

    /**
     *Example of creating a risk list export task from a compliance standard aggregation perspective
     * @param req CreateComplianceRiskExportJobRequest
     * @return CreateComplianceRiskExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateComplianceRiskExportJobResponse CreateComplianceRiskExportJob(CreateComplianceRiskExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateComplianceRiskExportJob", CreateComplianceRiskExportJobResponse.class);
    }

    /**
     *Create Domain and IP Information
     * @param req CreateDomainAndIpRequest
     * @return CreateDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainAndIpResponse CreateDomainAndIp(CreateDomainAndIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainAndIp", CreateDomainAndIpResponse.class);
    }

    /**
     *Creates a Dspm access record export task
     * @param req CreateDspmAccessExportJobRequest
     * @return CreateDspmAccessExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmAccessExportJobResponse CreateDspmAccessExportJob(CreateDspmAccessExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmAccessExportJob", CreateDspmAccessExportJobResponse.class);
    }

    /**
     *This API is used to create a Dspm application.
     * @param req CreateDspmApplyOrderRequest
     * @return CreateDspmApplyOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmApplyOrderResponse CreateDspmApplyOrder(CreateDspmApplyOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmApplyOrder", CreateDspmApplyOrderResponse.class);
    }

    /**
     *Creates a Dspm approval history export task
     * @param req CreateDspmApproveHistoryExportJobRequest
     * @return CreateDspmApproveHistoryExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmApproveHistoryExportJobResponse CreateDspmApproveHistoryExportJob(CreateDspmApproveHistoryExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmApproveHistoryExportJob", CreateDspmApproveHistoryExportJobResponse.class);
    }

    /**
     *This API is used to create a Dspm asset access topology export task.
     * @param req CreateDspmAssetAccessTopologyExportJobRequest
     * @return CreateDspmAssetAccessTopologyExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmAssetAccessTopologyExportJobResponse CreateDspmAssetAccessTopologyExportJob(CreateDspmAssetAccessTopologyExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmAssetAccessTopologyExportJob", CreateDspmAssetAccessTopologyExportJobResponse.class);
    }

    /**
     *Create an asset list export task for Dspm.
     * @param req CreateDspmAssetIdentifyInfoExportJobRequest
     * @return CreateDspmAssetIdentifyInfoExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmAssetIdentifyInfoExportJobResponse CreateDspmAssetIdentifyInfoExportJob(CreateDspmAssetIdentifyInfoExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmAssetIdentifyInfoExportJob", CreateDspmAssetIdentifyInfoExportJobResponse.class);
    }

    /**
     *Creates a Dspm asset list export task
     * @param req CreateDspmAssetsExportJobRequest
     * @return CreateDspmAssetsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmAssetsExportJobResponse CreateDspmAssetsExportJob(CreateDspmAssetsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmAssetsExportJob", CreateDspmAssetsExportJobResponse.class);
    }

    /**
     *This API is used to create a Dspm audit filter policy.
     * @param req CreateDspmAuditFilterStrategyRequest
     * @return CreateDspmAuditFilterStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmAuditFilterStrategyResponse CreateDspmAuditFilterStrategy(CreateDspmAuditFilterStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmAuditFilterStrategy", CreateDspmAuditFilterStrategyResponse.class);
    }

    /**
     *This API is used to create log export tasks.
     * @param req CreateDspmExportTaskRequest
     * @return CreateDspmExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmExportTaskResponse CreateDspmExportTask(CreateDspmExportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmExportTask", CreateDspmExportTaskResponse.class);
    }

    /**
     *This API is used to create a dspm data identification category.
     * @param req CreateDspmIdentifyCategoryRequest
     * @return CreateDspmIdentifyCategoryResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyCategoryResponse CreateDspmIdentifyCategory(CreateDspmIdentifyCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyCategory", CreateDspmIdentifyCategoryResponse.class);
    }

    /**
     *This API is used to create a dspm data identification template category association.
     * @param req CreateDspmIdentifyComplianceCategoryRelationRequest
     * @return CreateDspmIdentifyComplianceCategoryRelationResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyComplianceCategoryRelationResponse CreateDspmIdentifyComplianceCategoryRelation(CreateDspmIdentifyComplianceCategoryRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyComplianceCategoryRelation", CreateDspmIdentifyComplianceCategoryRelationResponse.class);
    }

    /**
     *This API is used to create a dspm data identification template.
     * @param req CreateDspmIdentifyComplianceGroupRequest
     * @return CreateDspmIdentifyComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyComplianceGroupResponse CreateDspmIdentifyComplianceGroup(CreateDspmIdentifyComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyComplianceGroup", CreateDspmIdentifyComplianceGroupResponse.class);
    }

    /**
     *Replicate a dspm data identification template.
     * @param req CreateDspmIdentifyComplianceGroupCopyRequest
     * @return CreateDspmIdentifyComplianceGroupCopyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyComplianceGroupCopyResponse CreateDspmIdentifyComplianceGroupCopy(CreateDspmIdentifyComplianceGroupCopyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyComplianceGroupCopy", CreateDspmIdentifyComplianceGroupCopyResponse.class);
    }

    /**
     *Creates a dspm data identification template data item association
     * @param req CreateDspmIdentifyComplianceRuleRelationRequest
     * @return CreateDspmIdentifyComplianceRuleRelationResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyComplianceRuleRelationResponse CreateDspmIdentifyComplianceRuleRelation(CreateDspmIdentifyComplianceRuleRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyComplianceRuleRelation", CreateDspmIdentifyComplianceRuleRelationResponse.class);
    }

    /**
     *This API is used to create a Dspm identity list export task.
     * @param req CreateDspmIdentifyInfoListExportJobRequest
     * @return CreateDspmIdentifyInfoListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyInfoListExportJobResponse CreateDspmIdentifyInfoListExportJob(CreateDspmIdentifyInfoListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyInfoListExportJob", CreateDspmIdentifyInfoListExportJobResponse.class);
    }

    /**
     *Creating a dspm Data Identification and Classification Group
     * @param req CreateDspmIdentifyLevelGroupRequest
     * @return CreateDspmIdentifyLevelGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyLevelGroupResponse CreateDspmIdentifyLevelGroup(CreateDspmIdentifyLevelGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyLevelGroup", CreateDspmIdentifyLevelGroupResponse.class);
    }

    /**
     *This API is used to create a dspm identification data item.
     * @param req CreateDspmIdentifyRuleRequest
     * @return CreateDspmIdentifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmIdentifyRuleResponse CreateDspmIdentifyRule(CreateDspmIdentifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmIdentifyRule", CreateDspmIdentifyRuleResponse.class);
    }

    /**
     *Create a Dspm personal identity id.
     * @param req CreateDspmPersonalIdentifyRequest
     * @return CreateDspmPersonalIdentifyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmPersonalIdentifyResponse CreateDspmPersonalIdentify(CreateDspmPersonalIdentifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmPersonalIdentify", CreateDspmPersonalIdentifyResponse.class);
    }

    /**
     *Create a Dspm instance
     * @param req CreateDspmResourceRequest
     * @return CreateDspmResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmResourceResponse CreateDspmResource(CreateDspmResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmResource", CreateDspmResourceResponse.class);
    }

    /**
     *Create a Dspm risk export task
     * @param req CreateDspmRiskExportJobRequest
     * @return CreateDspmRiskExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmRiskExportJobResponse CreateDspmRiskExportJob(CreateDspmRiskExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmRiskExportJob", CreateDspmRiskExportJobResponse.class);
    }

    /**
     *This API is used to create a Dspm custom risk policy.
     * @param req CreateDspmRiskStrategyRequest
     * @return CreateDspmRiskStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmRiskStrategyResponse CreateDspmRiskStrategy(CreateDspmRiskStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmRiskStrategy", CreateDspmRiskStrategyResponse.class);
    }

    /**
     *Create a Dspm allowlist policy.
     * @param req CreateDspmWhitelistStrategyRequest
     * @return CreateDspmWhitelistStrategyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDspmWhitelistStrategyResponse CreateDspmWhitelistStrategy(CreateDspmWhitelistStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDspmWhitelistStrategy", CreateDspmWhitelistStrategyResponse.class);
    }

    /**
     *Creates a public network asset export task
     * @param req CreateDynamicAssetsExportJobRequest
     * @return CreateDynamicAssetsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateDynamicAssetsExportJobResponse CreateDynamicAssetsExportJob(CreateDynamicAssetsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDynamicAssetsExportJob", CreateDynamicAssetsExportJobResponse.class);
    }

    /**
     *Triggered after you click start scanning. It supports multi-account and multiple asset types. When both hosts and container clusters are selected, it splits into two independent tasks (host + container).
     * @param req CreateEDRManualScanRequest
     * @return CreateEDRManualScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateEDRManualScanResponse CreateEDRManualScan(CreateEDRManualScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEDRManualScan", CreateEDRManualScanResponse.class);
    }

    /**
     *This API is used to create an EDR alert export task.
     * @param req CreateEdrAlertExportJobRequest
     * @return CreateEdrAlertExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdrAlertExportJobResponse CreateEdrAlertExportJob(CreateEdrAlertExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdrAlertExportJob", CreateEdrAlertExportJobResponse.class);
    }

    /**
     *This API is used to create an EDR alert ordinary export task.
     * @param req CreateEdrLessAlertExportJobRequest
     * @return CreateEdrLessAlertExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdrLessAlertExportJobResponse CreateEdrLessAlertExportJob(CreateEdrLessAlertExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdrLessAlertExportJob", CreateEdrLessAlertExportJobResponse.class);
    }

    /**
     *Create rules for automatic cloud boundary tagging.
     * @param req CreateExposureAutoTagRuleRequest
     * @return CreateExposureAutoTagRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateExposureAutoTagRuleResponse CreateExposureAutoTagRule(CreateExposureAutoTagRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExposureAutoTagRule", CreateExposureAutoTagRuleResponse.class);
    }

    /**
     *Export Task for Exposed Assets
     * @param req CreateExposuresExportJobRequest
     * @return CreateExposuresExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateExposuresExportJobResponse CreateExposuresExportJob(CreateExposuresExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExposuresExportJob", CreateExposuresExportJobResponse.class);
    }

    /**
     *This API is used to create a high-risk baseline risk export task.
     * @param req CreateHighBaseLineRisksExportJobRequest
     * @return CreateHighBaseLineRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateHighBaseLineRisksExportJobResponse CreateHighBaseLineRisksExportJob(CreateHighBaseLineRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHighBaseLineRisksExportJob", CreateHighBaseLineRisksExportJobResponse.class);
    }

    /**
     *Create a local image list export task. The export fields include image ID, image name, mirror version, number of associated containers, number of associated hosts, creation time, account nickname, and risk fields such as scan status, vulnerability, Trojan, and sensitive information. Filtering is supported. Export is implemented through an async task. After JobId is returned, the frontend polls to query the export task status. In single account mode, the NickName field is automatically excluded.
     * @param req CreateHostImageListExportJobRequest
     * @return CreateHostImageListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostImageListExportJobResponse CreateHostImageListExportJob(CreateHostImageListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHostImageListExportJob", CreateHostImageListExportJobResponse.class);
    }

    /**
     *This API is used to create a host vulnerability table export task.
     * @param req CreateHostVulExportJobRequest
     * @return CreateHostVulExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostVulExportJobResponse CreateHostVulExportJob(CreateHostVulExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHostVulExportJob", CreateHostVulExportJobResponse.class);
    }

    /**
     *Create an IaC detection integration Token.
     * @param req CreateIaCAccessTokenRequest
     * @return CreateIaCAccessTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateIaCAccessTokenResponse CreateIaCAccessToken(CreateIaCAccessTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIaCAccessToken", CreateIaCAccessTokenResponse.class);
    }

    /**
     *Creates an IaC detection file export task
     * @param req CreateIaCFileExportJobRequest
     * @return CreateIaCFileExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateIaCFileExportJobResponse CreateIaCFileExportJob(CreateIaCFileExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIaCFileExportJob", CreateIaCFileExportJobResponse.class);
    }

    /**
     *This API is used to create an IaC detection file rescan task.
     * @param req CreateIaCFileReScanTaskRequest
     * @return CreateIaCFileReScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateIaCFileReScanTaskResponse CreateIaCFileReScanTask(CreateIaCFileReScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIaCFileReScanTask", CreateIaCFileReScanTaskResponse.class);
    }

    /**
     *Create an image asset list export task
     * @param req CreateImageAssetListExportJobRequest
     * @return CreateImageAssetListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageAssetListExportJobResponse CreateImageAssetListExportJob(CreateImageAssetListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageAssetListExportJob", CreateImageAssetListExportJobResponse.class);
    }

    /**
     *Create an image associated container asset export task
     * @param req CreateImageAssociatedContainerListExportJobRequest
     * @return CreateImageAssociatedContainerListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageAssociatedContainerListExportJobResponse CreateImageAssociatedContainerListExportJob(CreateImageAssociatedContainerListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageAssociatedContainerListExportJob", CreateImageAssociatedContainerListExportJobResponse.class);
    }

    /**
     *Create image associated host asset list export task
     * @param req CreateImageAssociatedHostListExportJobRequest
     * @return CreateImageAssociatedHostListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageAssociatedHostListExportJobResponse CreateImageAssociatedHostListExportJob(CreateImageAssociatedHostListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageAssociatedHostListExportJob", CreateImageAssociatedHostListExportJobResponse.class);
    }

    /**
     *Create an image component list export task.
     * @param req CreateImageComponentListExportJobRequest
     * @return CreateImageComponentListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageComponentListExportJobResponse CreateImageComponentListExportJob(CreateImageComponentListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageComponentListExportJob", CreateImageComponentListExportJobResponse.class);
    }

    /**
     *Create Image Layer Vulnerability List Export Task
     * @param req CreateImageLayerVulListExportJobRequest
     * @return CreateImageLayerVulListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageLayerVulListExportJobResponse CreateImageLayerVulListExportJob(CreateImageLayerVulListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageLayerVulListExportJob", CreateImageLayerVulListExportJobResponse.class);
    }

    /**
     *This API is used to create a mirror repository connectivity check task.
     * @param req CreateImageRegistryConnectivityTaskRequest
     * @return CreateImageRegistryConnectivityTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageRegistryConnectivityTaskResponse CreateImageRegistryConnectivityTask(CreateImageRegistryConnectivityTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageRegistryConnectivityTask", CreateImageRegistryConnectivityTaskResponse.class);
    }

    /**
     *This API is used to create an image repository list export task.
     * @param req CreateImageRegistryListExportJobRequest
     * @return CreateImageRegistryListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageRegistryListExportJobResponse CreateImageRegistryListExportJob(CreateImageRegistryListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageRegistryListExportJob", CreateImageRegistryListExportJobResponse.class);
    }

    /**
     *Creating an Image Scanning Task
     * @param req CreateImageRegistryScanTaskRequest
     * @return CreateImageRegistryScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageRegistryScanTaskResponse CreateImageRegistryScanTask(CreateImageRegistryScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageRegistryScanTask", CreateImageRegistryScanTaskResponse.class);
    }

    /**
     *Create an image scanning task configuration for an image repository
     * @param req CreateImageRegistryTimedScanTaskConfigRequest
     * @return CreateImageRegistryTimedScanTaskConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageRegistryTimedScanTaskConfigResponse CreateImageRegistryTimedScanTaskConfig(CreateImageRegistryTimedScanTaskConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageRegistryTimedScanTaskConfig", CreateImageRegistryTimedScanTaskConfigResponse.class);
    }

    /**
     *Create Image Sensitive Information List Export Task
     * @param req CreateImageSensitiveInfoListExportJobRequest
     * @return CreateImageSensitiveInfoListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageSensitiveInfoListExportJobResponse CreateImageSensitiveInfoListExportJob(CreateImageSensitiveInfoListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageSensitiveInfoListExportJob", CreateImageSensitiveInfoListExportJobResponse.class);
    }

    /**
     *This API is used to create an allowlist for sensitive information in container images.
     * @param req CreateImageSensitiveWhitelistRequest
     * @return CreateImageSensitiveWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageSensitiveWhitelistResponse CreateImageSensitiveWhitelist(CreateImageSensitiveWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageSensitiveWhitelist", CreateImageSensitiveWhitelistResponse.class);
    }

    /**
     *Create an image Trojan virus list export task
     * @param req CreateImageVirusListExportJobRequest
     * @return CreateImageVirusListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageVirusListExportJobResponse CreateImageVirusListExportJob(CreateImageVirusListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageVirusListExportJob", CreateImageVirusListExportJobResponse.class);
    }

    /**
     *This API is used to create an image Trojan allowlist.
     * @param req CreateImageVirusWhitelistRequest
     * @return CreateImageVirusWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageVirusWhitelistResponse CreateImageVirusWhitelist(CreateImageVirusWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageVirusWhitelist", CreateImageVirusWhitelistResponse.class);
    }

    /**
     *This API is used to create a task of exporting the image vulnerability list.
     * @param req CreateImageVulListExportJobRequest
     * @return CreateImageVulListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageVulListExportJobResponse CreateImageVulListExportJob(CreateImageVulListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageVulListExportJob", CreateImageVulListExportJobResponse.class);
    }

    /**
     *Creates an export task for the vulnerability overview list of an image.
     * @param req CreateImageVulSummaryListExportJobRequest
     * @return CreateImageVulSummaryListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageVulSummaryListExportJobResponse CreateImageVulSummaryListExportJob(CreateImageVulSummaryListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageVulSummaryListExportJob", CreateImageVulSummaryListExportJobResponse.class);
    }

    /**
     *This API is used to create a vulnerability allowlist for container images.
     * @param req CreateImageVulWhitelistRequest
     * @return CreateImageVulWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageVulWhitelistResponse CreateImageVulWhitelist(CreateImageVulWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageVulWhitelist", CreateImageVulWhitelistResponse.class);
    }

    /**
     *This API is used to create a Pod associated container list export task. Export fields include container ID, container name, running state, node ID, node type, image ID, image name, and isolation status. Filtering is supported. Export is implemented through an async task. After JobId is returned, front-end polling is used to query the export task status.
     * @param req CreatePodContainerListExportJobRequest
     * @return CreatePodContainerListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePodContainerListExportJobResponse CreatePodContainerListExportJob(CreatePodContainerListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePodContainerListExportJob", CreatePodContainerListExportJobResponse.class);
    }

    /**
     *Creates a Pod Association service list export task. The export fields include service name, type, Selector, namespace, and creation time. Filtering is supported. When PodUniqueID is input, the Pod Association matching logic of DescribeClusterServiceList is reused. Export is implemented through an async task, and after JobId is returned, the frontend polls to query the export task status.
     * @param req CreatePodServiceListExportJobRequest
     * @return CreatePodServiceListExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePodServiceListExportJobResponse CreatePodServiceListExportJob(CreatePodServiceListExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePodServiceListExportJob", CreatePodServiceListExportJobResponse.class);
    }

    /**
     *This API is used to create a public network asset export task.
     * @param req CreatePublicAssetsExportJobRequest
     * @return CreatePublicAssetsExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreatePublicAssetsExportJobResponse CreatePublicAssetsExportJob(CreatePublicAssetsExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePublicAssetsExportJob", CreatePublicAssetsExportJobResponse.class);
    }

    /**
     *Create Risk Center Scan Task
     * @param req CreateRiskCenterScanTaskRequest
     * @return CreateRiskCenterScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRiskCenterScanTaskResponse CreateRiskCenterScanTask(CreateRiskCenterScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRiskCenterScanTask", CreateRiskCenterScanTaskResponse.class);
    }

    /**
     *Sample code for creating a cloud resource configuration check risk details export task
     * @param req CreateRiskDetailExportJobRequest
     * @return CreateRiskDetailExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateRiskDetailExportJobResponse CreateRiskDetailExportJob(CreateRiskDetailExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRiskDetailExportJob", CreateRiskDetailExportJobResponse.class);
    }

    /**
     *This API is used to create an ACL user access control rule. You can refer to several system rules or define a custom rule. At least one of them must be provided.
     * @param req CreateSandboxACLRuleRequest
     * @return CreateSandboxACLRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateSandboxACLRuleResponse CreateSandboxACLRule(CreateSandboxACLRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSandboxACLRule", CreateSandboxACLRuleResponse.class);
    }

    /**
     *Create a DLP user rule. You can reference several system rules (SystemRuleIDList) or define a custom rule (UserRuleContent, name + regular). At least one of both is required. UserRuleInfo is a newly-added optional structured input parameter. When it is passed together with UserRuleContent, UserRuleInfo takes precedence.
     * @param req CreateSandboxDLPRuleRequest
     * @return CreateSandboxDLPRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateSandboxDLPRuleResponse CreateSandboxDLPRule(CreateSandboxDLPRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSandboxDLPRule", CreateSandboxDLPRuleResponse.class);
    }

    /**
     *Create command sandbox file access policy
     * @param req CreateSandboxFileRuleRequest
     * @return CreateSandboxFileRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateSandboxFileRuleResponse CreateSandboxFileRule(CreateSandboxFileRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSandboxFileRule", CreateSandboxFileRuleResponse.class);
    }

    /**
     *This API is used to create an LLM audit user rule. It must refer to at least one system rule and does not support user customization of rule content.
     * @param req CreateSandboxLLMAuditRuleRequest
     * @return CreateSandboxLLMAuditRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateSandboxLLMAuditRuleResponse CreateSandboxLLMAuditRule(CreateSandboxLLMAuditRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSandboxLLMAuditRule", CreateSandboxLLMAuditRuleResponse.class);
    }

    /**
     *Exported task for exposed surface scanning results
     * @param req CreateScanStatisticExportJobRequest
     * @return CreateScanStatisticExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanStatisticExportJobResponse CreateScanStatisticExportJob(CreateScanStatisticExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScanStatisticExportJob", CreateScanStatisticExportJobResponse.class);
    }

    /**
     *This API is used to create an immediate detection task.
     * @param req CreateScanTaskRequest
     * @return CreateScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanTaskResponse CreateScanTask(CreateScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScanTask", CreateScanTaskResponse.class);
    }

    /**
     *Upload a Skill ZIP file to trigger asynchronous security detection. After a successful upload, poll the DescribeSkillScanResult API using the returned ContentHash and EngineVersion to obtain the result. The upload API is idempotent. Re-uploading a file with the same Hash does not create a repetition task. Detection results are retained for 90 days. Re-upload for detection after the retention period expires.
     * @param req CreateSkillScanRequest
     * @return CreateSkillScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateSkillScanResponse CreateSkillScan(CreateSkillScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSkillScan", CreateSkillScanResponse.class);
    }

    /**
     *Retry the vulnerability repair task that failed to fix, and redispatch the repair instruction only for the hosts of the original task that failed to fix. Retry is allowed only when the task status is partially or totally failed to fix.
     * @param req CreateVulFixRetryTaskRequest
     * @return CreateVulFixRetryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulFixRetryTaskResponse CreateVulFixRetryTask(CreateVulFixRetryTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulFixRetryTask", CreateVulFixRetryTaskResponse.class);
    }

    /**
     *Users manually submit vulnerability repair tasks, specify the vulnerabilities and target hosts that need to be repaired, and the system creates fixing tasks and dispatches execution. It supports options such as specifying the repair timeout period and whether to create a snapshot. The FixItems array is used to precisely control which hosts each vulnerability or KB patch repairs.
     * @param req CreateVulFixTaskRequest
     * @return CreateVulFixTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulFixTaskResponse CreateVulFixTask(CreateVulFixTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulFixTask", CreateVulFixTaskResponse.class);
    }

    /**
     *Create an export task for the list of fixed vulnerabilities. It supports the same filter criteria as DescribeVulFixedList. The export is implemented via an asynchronous task. After a JobID is returned, the frontend polls to query the export task status. The export fields include vulnerability ID, vulnerability name, vulnerability level, VPR rating, vulnerability type, CVE ID, host name, instance ID, associated component & path, and repair time.
     * @param req CreateVulFixedExportJobRequest
     * @return CreateVulFixedExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulFixedExportJobResponse CreateVulFixedExportJob(CreateVulFixedExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulFixedExportJob", CreateVulFixedExportJobResponse.class);
    }

    /**
     *This API is used to create a vulnerability rescan
     * @param req CreateVulReScanRequest
     * @return CreateVulReScanResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulReScanResponse CreateVulReScan(CreateVulReScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulReScan", CreateVulReScanResponse.class);
    }

    /**
     *This API is used to create a vulnerability risk export task.
     * @param req CreateVulRisksExportJobRequest
     * @return CreateVulRisksExportJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulRisksExportJobResponse CreateVulRisksExportJob(CreateVulRisksExportJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulRisksExportJob", CreateVulRisksExportJobResponse.class);
    }

    /**
     *This API is used to create a vulnerability scanning (one-click scan).
     * @param req CreateVulScanManualRequest
     * @return CreateVulScanManualResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulScanManualResponse CreateVulScanManual(CreateVulScanManualRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVulScanManual", CreateVulScanManualResponse.class);
    }

    /**
     *Delete the SMTP mailbox access information of the AI assistant.
     * @param req DeleteAIAnalysisSMTPAccessRequest
     * @return DeleteAIAnalysisSMTPAccessResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIAnalysisSMTPAccessResponse DeleteAIAnalysisSMTPAccess(DeleteAIAnalysisSMTPAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAIAnalysisSMTPAccess", DeleteAIAnalysisSMTPAccessResponse.class);
    }

    /**
     *This API is used to delete AI scheduled tasks.

This API is used to delete a scheduled task based on the specified AI scheduled task ID. Deletion is irreversible.
     * @param req DeleteAIScheduleRequest
     * @return DeleteAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAIScheduleResponse DeleteAISchedule(DeleteAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAISchedule", DeleteAIScheduleResponse.class);
    }

    /**
     *Delete the search view of a user-created specified asset
     * @param req DeleteAssetFilterViewRequest
     * @return DeleteAssetFilterViewResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssetFilterViewResponse DeleteAssetFilterView(DeleteAssetFilterViewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAssetFilterView", DeleteAssetFilterViewResponse.class);
    }

    /**
     *Delete asset tag
     * @param req DeleteAssetTagRequest
     * @return DeleteAssetTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssetTagResponse DeleteAssetTag(DeleteAssetTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAssetTag", DeleteAssetTagResponse.class);
    }

    /**
     *Delete custom baseline policies in batches. Only support deletion of policies with PolicyType=SELF. After deletion, historical risk records are retained, but no new results are generated.
     * @param req DeleteBaselineSelfDefinedPolicyListRequest
     * @return DeleteBaselineSelfDefinedPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBaselineSelfDefinedPolicyListResponse DeleteBaselineSelfDefinedPolicyList(DeleteBaselineSelfDefinedPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBaselineSelfDefinedPolicyList", DeleteBaselineSelfDefinedPolicyListResponse.class);
    }

    /**
     *CSIP manual scan task delete API
     * @param req DeleteCSIPMalwareScanTaskRequest
     * @return DeleteCSIPMalwareScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCSIPMalwareScanTaskResponse DeleteCSIPMalwareScanTask(DeleteCSIPMalwareScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCSIPMalwareScanTask", DeleteCSIPMalwareScanTaskResponse.class);
    }

    /**
     *Deleting a cluster
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *Delete Domain and IP Request
     * @param req DeleteDomainAndIpRequest
     * @return DeleteDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainAndIpResponse DeleteDomainAndIp(DeleteDomainAndIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainAndIp", DeleteDomainAndIpResponse.class);
    }

    /**
     *Deletes a Dspm application form.
     * @param req DeleteDspmApplyOrderRequest
     * @return DeleteDspmApplyOrderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmApplyOrderResponse DeleteDspmApplyOrder(DeleteDspmApplyOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmApplyOrder", DeleteDspmApplyOrderResponse.class);
    }

    /**
     *Delete a Dspm asset account
     * @param req DeleteDspmAssetAccountRequest
     * @return DeleteDspmAssetAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmAssetAccountResponse DeleteDspmAssetAccount(DeleteDspmAssetAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmAssetAccount", DeleteDspmAssetAccountResponse.class);
    }

    /**
     *Delete a Dspm audit filter policy
     * @param req DeleteDspmAuditFilterStrategyRequest
     * @return DeleteDspmAuditFilterStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmAuditFilterStrategyResponse DeleteDspmAuditFilterStrategy(DeleteDspmAuditFilterStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmAuditFilterStrategy", DeleteDspmAuditFilterStrategyResponse.class);
    }

    /**
     *This API is used to delete the backup logs.
     * @param req DeleteDspmBackupLogListRequest
     * @return DeleteDspmBackupLogListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmBackupLogListResponse DeleteDspmBackupLogList(DeleteDspmBackupLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmBackupLogList", DeleteDspmBackupLogListResponse.class);
    }

    /**
     *This API is used to cancel the log shipping configuration.
     * @param req DeleteDspmCkafkaConfigRequest
     * @return DeleteDspmCkafkaConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmCkafkaConfigResponse DeleteDspmCkafkaConfig(DeleteDspmCkafkaConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmCkafkaConfig", DeleteDspmCkafkaConfigResponse.class);
    }

    /**
     *This API is used to delete export tasks.
     * @param req DeleteDspmExportTaskRequest
     * @return DeleteDspmExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmExportTaskResponse DeleteDspmExportTask(DeleteDspmExportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmExportTask", DeleteDspmExportTaskResponse.class);
    }

    /**
     *Delete dspm data identification category
     * @param req DeleteDspmIdentifyCategoryRequest
     * @return DeleteDspmIdentifyCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyCategoryResponse DeleteDspmIdentifyCategory(DeleteDspmIdentifyCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyCategory", DeleteDspmIdentifyCategoryResponse.class);
    }

    /**
     *Deletes classification association from a dspm identification template
     * @param req DeleteDspmIdentifyComplianceCategoryRelationRequest
     * @return DeleteDspmIdentifyComplianceCategoryRelationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyComplianceCategoryRelationResponse DeleteDspmIdentifyComplianceCategoryRelation(DeleteDspmIdentifyComplianceCategoryRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyComplianceCategoryRelation", DeleteDspmIdentifyComplianceCategoryRelationResponse.class);
    }

    /**
     *Delete dspm data identification template
     * @param req DeleteDspmIdentifyComplianceGroupRequest
     * @return DeleteDspmIdentifyComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyComplianceGroupResponse DeleteDspmIdentifyComplianceGroup(DeleteDspmIdentifyComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyComplianceGroup", DeleteDspmIdentifyComplianceGroupResponse.class);
    }

    /**
     *Delete dspm data identification template data item association
     * @param req DeleteDspmIdentifyComplianceRuleRelationRequest
     * @return DeleteDspmIdentifyComplianceRuleRelationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyComplianceRuleRelationResponse DeleteDspmIdentifyComplianceRuleRelation(DeleteDspmIdentifyComplianceRuleRelationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyComplianceRuleRelation", DeleteDspmIdentifyComplianceRuleRelationResponse.class);
    }

    /**
     *Delete a dspm data identification classification group
     * @param req DeleteDspmIdentifyLevelGroupRequest
     * @return DeleteDspmIdentifyLevelGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyLevelGroupResponse DeleteDspmIdentifyLevelGroup(DeleteDspmIdentifyLevelGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyLevelGroup", DeleteDspmIdentifyLevelGroupResponse.class);
    }

    /**
     *Delete dspm data identification data item
     * @param req DeleteDspmIdentifyRuleRequest
     * @return DeleteDspmIdentifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmIdentifyRuleResponse DeleteDspmIdentifyRule(DeleteDspmIdentifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmIdentifyRule", DeleteDspmIdentifyRuleResponse.class);
    }

    /**
     *Delete a Dspm personal identity id.
     * @param req DeleteDspmPersonalIdentifyRequest
     * @return DeleteDspmPersonalIdentifyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmPersonalIdentifyResponse DeleteDspmPersonalIdentify(DeleteDspmPersonalIdentifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmPersonalIdentify", DeleteDspmPersonalIdentifyResponse.class);
    }

    /**
     *Delete restore logs
     * @param req DeleteDspmRestoreLogListRequest
     * @return DeleteDspmRestoreLogListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmRestoreLogListResponse DeleteDspmRestoreLogList(DeleteDspmRestoreLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmRestoreLogList", DeleteDspmRestoreLogListResponse.class);
    }

    /**
     *This API is used to delete a DSPM custom risk policy. It only supports deletion of custom policies with rule_source=custom. Built-in policies are non-deletable. Disable them by setting IsEnabled in ModifyDspmRiskStrategy.
     * @param req DeleteDspmRiskStrategyRequest
     * @return DeleteDspmRiskStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmRiskStrategyResponse DeleteDspmRiskStrategy(DeleteDspmRiskStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmRiskStrategy", DeleteDspmRiskStrategyResponse.class);
    }

    /**
     *Delete dspmg shared account data
     * @param req DeleteDspmShareUserDataRequest
     * @return DeleteDspmShareUserDataResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmShareUserDataResponse DeleteDspmShareUserData(DeleteDspmShareUserDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmShareUserData", DeleteDspmShareUserDataResponse.class);
    }

    /**
     *Delete a Dspm allowlist policy.
     * @param req DeleteDspmWhitelistStrategyRequest
     * @return DeleteDspmWhitelistStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDspmWhitelistStrategyResponse DeleteDspmWhitelistStrategy(DeleteDspmWhitelistStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDspmWhitelistStrategy", DeleteDspmWhitelistStrategyResponse.class);
    }

    /**
     *This API is used to delete EDR policies.
     * @param req DeleteEDRRulesRequest
     * @return DeleteEDRRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEDRRulesResponse DeleteEDRRules(DeleteEDRRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEDRRules", DeleteEDRRulesResponse.class);
    }

    /**
     *This API is used to delete terminated scan tasks by physically deleting the primary and detailed tables. Only tasks in the final state can be deleted, and only the creator can perform the deletion.
     * @param req DeleteEDRScanTaskRequest
     * @return DeleteEDRScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEDRScanTaskResponse DeleteEDRScanTask(DeleteEDRScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEDRScanTask", DeleteEDRScanTaskResponse.class);
    }

    /**
     *Delete EDR log collection path configurations in batches.
     * @param req DeleteEdrLogCollectPathsRequest
     * @return DeleteEdrLogCollectPathsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdrLogCollectPathsResponse DeleteEdrLogCollectPaths(DeleteEdrLogCollectPathsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdrLogCollectPaths", DeleteEdrLogCollectPathsResponse.class);
    }

    /**
     *Delete rules for automatic cloud boundary tagging.
     * @param req DeleteExposureAutoTagRuleRequest
     * @return DeleteExposureAutoTagRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExposureAutoTagRuleResponse DeleteExposureAutoTagRule(DeleteExposureAutoTagRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExposureAutoTagRule", DeleteExposureAutoTagRuleResponse.class);
    }

    /**
     *Delete an IaC detection integration Token
     * @param req DeleteIaCAccessTokenRequest
     * @return DeleteIaCAccessTokenResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIaCAccessTokenResponse DeleteIaCAccessToken(DeleteIaCAccessTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIaCAccessToken", DeleteIaCAccessTokenResponse.class);
    }

    /**
     *Delete an IaC detection file
     * @param req DeleteIaCFileRequest
     * @return DeleteIaCFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIaCFileResponse DeleteIaCFile(DeleteIaCFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIaCFile", DeleteIaCFileResponse.class);
    }

    /**
     *Delete image repository information.
     * @param req DeleteImageRegistryRequest
     * @return DeleteImageRegistryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageRegistryResponse DeleteImageRegistry(DeleteImageRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageRegistry", DeleteImageRegistryResponse.class);
    }

    /**
     *Deletes an image repository scanning task.
     * @param req DeleteImageRegistryScanTaskRequest
     * @return DeleteImageRegistryScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageRegistryScanTaskResponse DeleteImageRegistryScanTask(DeleteImageRegistryScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageRegistryScanTask", DeleteImageRegistryScanTaskResponse.class);
    }

    /**
     *Delete the scheduled scan task configuration of an image repository.
     * @param req DeleteImageRegistryTimedScanTaskConfigRequest
     * @return DeleteImageRegistryTimedScanTaskConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageRegistryTimedScanTaskConfigResponse DeleteImageRegistryTimedScanTaskConfig(DeleteImageRegistryTimedScanTaskConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageRegistryTimedScanTaskConfig", DeleteImageRegistryTimedScanTaskConfigResponse.class);
    }

    /**
     *This API is used to delete an allowlist for sensitive information from a container image.
     * @param req DeleteImageSensitiveWhitelistRequest
     * @return DeleteImageSensitiveWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageSensitiveWhitelistResponse DeleteImageSensitiveWhitelist(DeleteImageSensitiveWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageSensitiveWhitelist", DeleteImageSensitiveWhitelistResponse.class);
    }

    /**
     *This API is used to delete the image Trojan allowlist.
     * @param req DeleteImageVirusWhitelistRequest
     * @return DeleteImageVirusWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageVirusWhitelistResponse DeleteImageVirusWhitelist(DeleteImageVirusWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageVirusWhitelist", DeleteImageVirusWhitelistResponse.class);
    }

    /**
     *Deletes the vulnerability allowlist of a container image
     * @param req DeleteImageVulWhitelistRequest
     * @return DeleteImageVulWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageVulWhitelistResponse DeleteImageVulWhitelist(DeleteImageVulWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageVulWhitelist", DeleteImageVulWhitelistResponse.class);
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
     *Delete Risk Center Scan Task
     * @param req DeleteRiskScanTaskRequest
     * @return DeleteRiskScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskScanTaskResponse DeleteRiskScanTask(DeleteRiskScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskScanTask", DeleteRiskScanTaskResponse.class);
    }

    /**
     *Delete ACL user rules in batches. After deletion, rules are no longer returned in list queries and no longer take effect on traffic. If any ID does not exist or belongs to another tenant, an error is returned overall.
     * @param req DeleteSandboxACLRuleRequest
     * @return DeleteSandboxACLRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSandboxACLRuleResponse DeleteSandboxACLRule(DeleteSandboxACLRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSandboxACLRule", DeleteSandboxACLRuleResponse.class);
    }

    /**
     *Batch delete DLP user rules. If any ID does not exist or belongs to another tenant, an error is returned for the entire request.
     * @param req DeleteSandboxDLPRuleRequest
     * @return DeleteSandboxDLPRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSandboxDLPRuleResponse DeleteSandboxDLPRule(DeleteSandboxDLPRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSandboxDLPRule", DeleteSandboxDLPRuleResponse.class);
    }

    /**
     *Create command sandbox file access policy
     * @param req DeleteSandboxFileRuleRequest
     * @return DeleteSandboxFileRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSandboxFileRuleResponse DeleteSandboxFileRule(DeleteSandboxFileRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSandboxFileRule", DeleteSandboxFileRuleResponse.class);
    }

    /**
     *Batch delete LLM audit user rules. If any ID does not exist or belongs to another tenant, an error is returned overall.
     * @param req DeleteSandboxLLMAuditRuleRequest
     * @return DeleteSandboxLLMAuditRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSandboxLLMAuditRuleResponse DeleteSandboxLLMAuditRule(DeleteSandboxLLMAuditRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSandboxLLMAuditRule", DeleteSandboxLLMAuditRuleResponse.class);
    }

    /**
     *This API is used to delete a vulnerability allowlist.
     * @param req DeleteVulWhitelistRequest
     * @return DeleteVulWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVulWhitelistResponse DeleteVulWhitelist(DeleteVulWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVulWhitelist", DeleteVulWhitelistResponse.class);
    }

    /**
     *Delete notification policies in batches.
     * @param req DeleteWebhookPoliciesRequest
     * @return DeleteWebhookPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebhookPoliciesResponse DeleteWebhookPolicies(DeleteWebhookPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebhookPolicies", DeleteWebhookPoliciesResponse.class);
    }

    /**
     *Delete receiving robots in batches. Before deletion, the reference relationships are automatically removed from all policies that refer to these robots.
     * @param req DeleteWebhookReceiversRequest
     * @return DeleteWebhookReceiversResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWebhookReceiversResponse DeleteWebhookReceivers(DeleteWebhookReceiversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWebhookReceivers", DeleteWebhookReceiversResponse.class);
    }

    /**
     *Search for AI agent asset list.
     * @param req DescribeAIAgentAssetListRequest
     * @return DescribeAIAgentAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAgentAssetListResponse DescribeAIAgentAssetList(DescribeAIAgentAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAgentAssetList", DescribeAIAgentAssetListResponse.class);
    }

    /**
     *Retrieves the scan list of AIAgent asset credentials
     * @param req DescribeAIAgentCredentialListRequest
     * @return DescribeAIAgentCredentialListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAgentCredentialListResponse DescribeAIAgentCredentialList(DescribeAIAgentCredentialListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAgentCredentialList", DescribeAIAgentCredentialListResponse.class);
    }

    /**
     *This API is used to query the leaked location list of one credential by credential group row ID in pages. It is used with the DescribeAIAgentCredentialList interface in the split and unfold scenario to avoid performance issues caused by pulling hundreds of thousands of locations at once in data skew scenarios.
     * @param req DescribeAIAgentCredentialLocationListRequest
     * @return DescribeAIAgentCredentialLocationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAgentCredentialLocationListResponse DescribeAIAgentCredentialLocationList(DescribeAIAgentCredentialLocationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAgentCredentialLocationList", DescribeAIAgentCredentialLocationListResponse.class);
    }

    /**
     *Search the skill list of an AI Agent
     * @param req DescribeAIAgentSkillListRequest
     * @return DescribeAIAgentSkillListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAgentSkillListResponse DescribeAIAgentSkillList(DescribeAIAgentSkillListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAgentSkillList", DescribeAIAgentSkillListResponse.class);
    }

    /**
     *Get the temporary download link of an AI analysis file.

The original address of the input file. Returns a signed temporary download link with a validity period of 2 hours.
     * @param req DescribeAIAnalysisFileDownloadURLRequest
     * @return DescribeAIAnalysisFileDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisFileDownloadURLResponse DescribeAIAnalysisFileDownloadURL(DescribeAIAnalysisFileDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisFileDownloadURL", DescribeAIAnalysisFileDownloadURLResponse.class);
    }

    /**
     *Retrieve historical analysis records of the cloud security AI assistant.
     * @param req DescribeAIAnalysisHistoryRequest
     * @return DescribeAIAnalysisHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisHistoryResponse DescribeAIAnalysisHistory(DescribeAIAnalysisHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisHistory", DescribeAIAnalysisHistoryResponse.class);
    }

    /**
     *Retrieve recommended questions for AI QA.
     * @param req DescribeAIAnalysisRecommendQuestionsRequest
     * @return DescribeAIAnalysisRecommendQuestionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisRecommendQuestionsResponse DescribeAIAnalysisRecommendQuestions(DescribeAIAnalysisRecommendQuestionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisRecommendQuestions", DescribeAIAnalysisRecommendQuestionsResponse.class);
    }

    /**
     *This API is used to obtain basic information of the Cloud Security AI Assistant.
     * @param req DescribeAIAnalysisRobotInfoRequest
     * @return DescribeAIAnalysisRobotInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisRobotInfoResponse DescribeAIAnalysisRobotInfo(DescribeAIAnalysisRobotInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisRobotInfo", DescribeAIAnalysisRobotInfoResponse.class);
    }

    /**
     *Query SMTP mailbox access information of the AI assistant
     * @param req DescribeAIAnalysisSMTPRequest
     * @return DescribeAIAnalysisSMTPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIAnalysisSMTPResponse DescribeAIAnalysisSMTP(DescribeAIAnalysisSMTPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIAnalysisSMTP", DescribeAIAnalysisSMTPResponse.class);
    }

    /**
     *Query the AI-Link engine configuration
     * @param req DescribeAILinkSettingRequest
     * @return DescribeAILinkSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAILinkSettingResponse DescribeAILinkSetting(DescribeAILinkSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAILinkSetting", DescribeAILinkSettingResponse.class);
    }

    /**
     *Query the list of AI scheduled tasks.

Supports paging query and status filtering, and returns the scheduled task list and total number of entries.
     * @param req DescribeAIScheduleListRequest
     * @return DescribeAIScheduleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIScheduleListResponse DescribeAIScheduleList(DescribeAIScheduleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIScheduleList", DescribeAIScheduleListResponse.class);
    }

    /**
     *Queries AI scheduled task trigger plans.

This API is used to query the future trigger plan list of a specified AI scheduled task within a given time window.
     * @param req DescribeAISchedulePlanListRequest
     * @return DescribeAISchedulePlanListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAISchedulePlanListResponse DescribeAISchedulePlanList(DescribeAISchedulePlanListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAISchedulePlanList", DescribeAISchedulePlanListResponse.class);
    }

    /**
     *Queries AI scheduled task statistics information.

Returns the total number of scheduled tasks and the number of running tasks for the current user.
     * @param req DescribeAIScheduleStatsRequest
     * @return DescribeAIScheduleStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIScheduleStatsResponse DescribeAIScheduleStats(DescribeAIScheduleStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIScheduleStats", DescribeAIScheduleStatsResponse.class);
    }

    /**
     *Queries the details of AI scheduled task executions.

This API is used to query the detailed information of a specified task execution by task ID, including the execution status and results.
     * @param req DescribeAIScheduleTaskDetailRequest
     * @return DescribeAIScheduleTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIScheduleTaskDetailResponse DescribeAIScheduleTaskDetail(DescribeAIScheduleTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIScheduleTaskDetail", DescribeAIScheduleTaskDetailResponse.class);
    }

    /**
     *This API is used to query the scheduled AI task execution list.

Queries the historical execution records of AI scheduled tasks. Supports pagination and filtering by scheduled task ID.
     * @param req DescribeAIScheduleTaskListRequest
     * @return DescribeAIScheduleTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIScheduleTaskListResponse DescribeAIScheduleTaskList(DescribeAIScheduleTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIScheduleTaskList", DescribeAIScheduleTaskListResponse.class);
    }

    /**
     *Access key alarm record AI analysis result details
     * @param req DescribeAKAnalysisDetailRequest
     * @return DescribeAKAnalysisDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAKAnalysisDetailResponse DescribeAKAnalysisDetail(DescribeAKAnalysisDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAKAnalysisDetail", DescribeAKAnalysisDetailResponse.class);
    }

    /**
     *Determine whether the user is a grayscale user
     * @param req DescribeAbTestUserRequest
     * @return DescribeAbTestUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbTestUserResponse DescribeAbTestUser(DescribeAbTestUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbTestUser", DescribeAbTestUserResponse.class);
    }

    /**
     *Get the call record list
     * @param req DescribeAbnormalCallRecordRequest
     * @return DescribeAbnormalCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalCallRecordResponse DescribeAbnormalCallRecord(DescribeAbnormalCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalCallRecord", DescribeAbnormalCallRecordResponse.class);
    }

    /**
     *List of access key alarm records
     * @param req DescribeAccessKeyAlarmRequest
     * @return DescribeAccessKeyAlarmResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAlarmResponse DescribeAccessKeyAlarm(DescribeAccessKeyAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAlarm", DescribeAccessKeyAlarmResponse.class);
    }

    /**
     *Access key alarm record details
     * @param req DescribeAccessKeyAlarmDetailRequest
     * @return DescribeAccessKeyAlarmDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAlarmDetailResponse DescribeAccessKeyAlarmDetail(DescribeAccessKeyAlarmDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAlarmDetail", DescribeAccessKeyAlarmDetailResponse.class);
    }

    /**
     *Retrieve the user access key asset list
     * @param req DescribeAccessKeyAssetRequest
     * @return DescribeAccessKeyAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAssetResponse DescribeAccessKeyAsset(DescribeAccessKeyAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAsset", DescribeAccessKeyAssetResponse.class);
    }

    /**
     *List of access key risk records
     * @param req DescribeAccessKeyRiskRequest
     * @return DescribeAccessKeyRiskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyRiskResponse DescribeAccessKeyRisk(DescribeAccessKeyRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyRisk", DescribeAccessKeyRiskResponse.class);
    }

    /**
     *Access key risk record details
     * @param req DescribeAccessKeyRiskDetailRequest
     * @return DescribeAccessKeyRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyRiskDetailResponse DescribeAccessKeyRiskDetail(DescribeAccessKeyRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyRiskDetail", DescribeAccessKeyRiskDetailResponse.class);
    }

    /**
     *This API is used to query account details of a user.
     * @param req DescribeAccessKeyUserDetailRequest
     * @return DescribeAccessKeyUserDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyUserDetailResponse DescribeAccessKeyUserDetail(DescribeAccessKeyUserDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyUserDetail", DescribeAccessKeyUserDetailResponse.class);
    }

    /**
     *Query user account list
     * @param req DescribeAccessKeyUserListRequest
     * @return DescribeAccessKeyUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyUserListResponse DescribeAccessKeyUserList(DescribeAccessKeyUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyUserList", DescribeAccessKeyUserListResponse.class);
    }

    /**
     *Access key alarm record list
     * @param req DescribeAccessKeyWhiteListRequest
     * @return DescribeAccessKeyWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyWhiteListResponse DescribeAccessKeyWhiteList(DescribeAccessKeyWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyWhiteList", DescribeAccessKeyWhiteListResponse.class);
    }

    /**
     *Query client configuration settings (configuration group). This is a standalone API split from DescribeAgentRunMode.
     * @param req DescribeAgentConfigSettingRequest
     * @return DescribeAgentConfigSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentConfigSettingResponse DescribeAgentConfigSetting(DescribeAgentConfigSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentConfigSetting", DescribeAgentConfigSettingResponse.class);
    }

    /**
     *Get the client running mode and runtime configuration information
     * @param req DescribeAgentRunModeRequest
     * @return DescribeAgentRunModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentRunModeResponse DescribeAgentRunMode(DescribeAgentRunModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentRunMode", DescribeAgentRunModeResponse.class);
    }

    /**
     *Query client running policies (policy groups). This is a standalone API split from DescribeAgentRunMode.
     * @param req DescribeAgentRunPolicyRequest
     * @return DescribeAgentRunPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentRunPolicyResponse DescribeAgentRunPolicy(DescribeAgentRunPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAgentRunPolicy", DescribeAgentRunPolicyResponse.class);
    }

    /**
     *Alarm Center full alarm list API
     * @param req DescribeAlertListRequest
     * @return DescribeAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertListResponse DescribeAlertList(DescribeAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertList", DescribeAlertListResponse.class);
    }

    /**
     *Query the component list in an asset.
     * @param req DescribeAssetComponentListRequest
     * @return DescribeAssetComponentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetComponentListResponse DescribeAssetComponentList(DescribeAssetComponentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetComponentList", DescribeAssetComponentListResponse.class);
    }

    /**
     *Queries the list of associated images of image repository components.
     * @param req DescribeAssetComponentRelatedImageListRequest
     * @return DescribeAssetComponentRelatedImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetComponentRelatedImageListResponse DescribeAssetComponentRelatedImageList(DescribeAssetComponentRelatedImageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetComponentRelatedImageList", DescribeAssetComponentRelatedImageListResponse.class);
    }

    /**
     *Asset detail information
     * @param req DescribeAssetDetailRequest
     * @return DescribeAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDetailResponse DescribeAssetDetail(DescribeAssetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDetail", DescribeAssetDetailResponse.class);
    }

    /**
     *Asset search view
     * @param req DescribeAssetFilterViewsRequest
     * @return DescribeAssetFilterViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetFilterViewsResponse DescribeAssetFilterViews(DescribeAssetFilterViewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetFilterViews", DescribeAssetFilterViewsResponse.class);
    }

    /**
     *Asset information
     * @param req DescribeAssetInfoRequest
     * @return DescribeAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetInfoResponse DescribeAssetInfo(DescribeAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetInfo", DescribeAssetInfoResponse.class);
    }

    /**
     *Last Synchronization Time of Assets
     * @param req DescribeAssetLastSyncTimeRequest
     * @return DescribeAssetLastSyncTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetLastSyncTimeResponse DescribeAssetLastSyncTime(DescribeAssetLastSyncTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetLastSyncTime", DescribeAssetLastSyncTimeResponse.class);
    }

    /**
     *Asset Overview statistics
     * @param req DescribeAssetOverviewRequest
     * @return DescribeAssetOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetOverviewResponse DescribeAssetOverview(DescribeAssetOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetOverview", DescribeAssetOverviewResponse.class);
    }

    /**
     *This API is used to query the process list of host nodes on exposed paths in cloud boundary analysis.
     * @param req DescribeAssetProcessListRequest
     * @return DescribeAssetProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessListResponse DescribeAssetProcessList(DescribeAssetProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetProcessList", DescribeAssetProcessListResponse.class);
    }

    /**
     *Asset risk details
     * @param req DescribeAssetRiskDetailRequest
     * @return DescribeAssetRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetRiskDetailResponse DescribeAssetRiskDetail(DescribeAssetRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetRiskDetail", DescribeAssetRiskDetailResponse.class);
    }

    /**
     *Cloud resource configuration risk list from the asset perspective
     * @param req DescribeAssetRiskListRequest
     * @return DescribeAssetRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetRiskListResponse DescribeAssetRiskList(DescribeAssetRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetRiskList", DescribeAssetRiskListResponse.class);
    }

    /**
     *Asset sync task status
     * @param req DescribeAssetSyncTaskStatusRequest
     * @return DescribeAssetSyncTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSyncTaskStatusResponse DescribeAssetSyncTaskStatus(DescribeAssetSyncTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSyncTaskStatus", DescribeAssetSyncTaskStatusResponse.class);
    }

    /**
     *Retrieves asset tag attributes
     * @param req DescribeAssetTagAttributesRequest
     * @return DescribeAssetTagAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTagAttributesResponse DescribeAssetTagAttributes(DescribeAssetTagAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTagAttributes", DescribeAssetTagAttributesResponse.class);
    }

    /**
     *Asset tag tree structured data
     * @param req DescribeAssetTagTreeRequest
     * @return DescribeAssetTagTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTagTreeResponse DescribeAssetTagTree(DescribeAssetTagTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTagTree", DescribeAssetTagTreeResponse.class);
    }

    /**
     *All assets
     * @param req DescribeAssetTagsRequest
     * @return DescribeAssetTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTagsResponse DescribeAssetTags(DescribeAssetTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTags", DescribeAssetTagsResponse.class);
    }

    /**
     *Asset tree structure
     * @param req DescribeAssetTreeRequest
     * @return DescribeAssetTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetTreeResponse DescribeAssetTree(DescribeAssetTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetTree", DescribeAssetTreeResponse.class);
    }

    /**
     *Obtain Vulnerability Risk List from Asset's Perspective
     * @param req DescribeAssetViewVulRiskListRequest
     * @return DescribeAssetViewVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetViewVulRiskListResponse DescribeAssetViewVulRiskList(DescribeAssetViewVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetViewVulRiskList", DescribeAssetViewVulRiskListResponse.class);
    }

    /**
     *This API is used to query the region list of the backend scanning engine.
     * @param req DescribeBackendScanEngineRegionListRequest
     * @return DescribeBackendScanEngineRegionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackendScanEngineRegionListResponse DescribeBackendScanEngineRegionList(DescribeBackendScanEngineRegionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackendScanEngineRegionList", DescribeBackendScanEngineRegionListResponse.class);
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
     *This API is used to obtain the aggregated scan result list by detection item, for showing the number of passed and failed assets by detection item on the "Detection Item" Tab of the policy details page.
     * @param req DescribeBaselineAggregatedItemListRequest
     * @return DescribeBaselineAggregatedItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineAggregatedItemListResponse DescribeBaselineAggregatedItemList(DescribeBaselineAggregatedItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineAggregatedItemList", DescribeBaselineAggregatedItemListResponse.class);
    }

    /**
     *This API is used to get the aggregation scan result list by baseline policy dimension, for the "Baseline Scan Policy" module on the overview page to display pass/fail status by policy.
     * @param req DescribeBaselineAggregatedPolicyListRequest
     * @return DescribeBaselineAggregatedPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineAggregatedPolicyListResponse DescribeBaselineAggregatedPolicyList(DescribeBaselineAggregatedPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineAggregatedPolicyList", DescribeBaselineAggregatedPolicyListResponse.class);
    }

    /**
     *Queries the list of Policy IDs currently at the "statistical calculation" status, used for frontend polling to judge whether the scan results statistics are ready.
     * @param req DescribeBaselineCalculatingStatisticsPolicyIDListRequest
     * @return DescribeBaselineCalculatingStatisticsPolicyIDListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineCalculatingStatisticsPolicyIDListResponse DescribeBaselineCalculatingStatisticsPolicyIDList(DescribeBaselineCalculatingStatisticsPolicyIDListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineCalculatingStatisticsPolicyIDList", DescribeBaselineCalculatingStatisticsPolicyIDListResponse.class);
    }

    /**
     *This API is used to query the detection item list of a category.
     * @param req DescribeBaselineCategoryItemListRequest
     * @return DescribeBaselineCategoryItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineCategoryItemListResponse DescribeBaselineCategoryItemList(DescribeBaselineCategoryItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineCategoryItemList", DescribeBaselineCategoryItemListResponse.class);
    }

    /**
     *Get the historical record list of baseline risk corrections, used to show fixed detection items and corresponding assets on the "Correction Record" page.
     * @param req DescribeBaselineFixRecordListRequest
     * @return DescribeBaselineFixRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineFixRecordListResponse DescribeBaselineFixRecordList(DescribeBaselineFixRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineFixRecordList", DescribeBaselineFixRecordListResponse.class);
    }

    /**
     *This API is used to retrieve the risk record list of detection item dimensions.
     * @param req DescribeBaselineItemRiskListRequest
     * @return DescribeBaselineItemRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineItemRiskListResponse DescribeBaselineItemRiskList(DescribeBaselineItemRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineItemRiskList", DescribeBaselineItemRiskListResponse.class);
    }

    /**
     *Get the detection item list of built-in baseline classifications (parent category -> subcategory -> built-in detection item ID list) for selecting baseline detection items on the policy editing page.
     * @param req DescribeBaselineMainTaskItemListRequest
     * @return DescribeBaselineMainTaskItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineMainTaskItemListResponse DescribeBaselineMainTaskItemList(DescribeBaselineMainTaskItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineMainTaskItemList", DescribeBaselineMainTaskItemListResponse.class);
    }

    /**
     *Get the scan main task list for the Task Record page to show the history and results of one-click scan, period scanning, and disperse scan.
     * @param req DescribeBaselineMainTaskListRequest
     * @return DescribeBaselineMainTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineMainTaskListResponse DescribeBaselineMainTaskList(DescribeBaselineMainTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineMainTaskList", DescribeBaselineMainTaskListResponse.class);
    }

    /**
     *Retrieve header data of the baseline overview page, including the total count of failed detection items, the number of fixes in the past one year, the last scan time, and whether period scanning is currently enabled.
     * @param req DescribeBaselineOverviewRequest
     * @return DescribeBaselineOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineOverviewResponse DescribeBaselineOverview(DescribeBaselineOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineOverview", DescribeBaselineOverviewResponse.class);
    }

    /**
     *This API is used to retrieve the built-in baseline classification tree (parent category → subcategory → built-in detection item ID list) for policy details display.
     * @param req DescribeBaselinePolicyCategoryListRequest
     * @return DescribeBaselinePolicyCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyCategoryListResponse DescribeBaselinePolicyCategoryList(DescribeBaselinePolicyCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyCategoryList", DescribeBaselinePolicyCategoryListResponse.class);
    }

    /**
     *Get the Detection Item List configured in a policy.
     * @param req DescribeBaselinePolicyItemListRequest
     * @return DescribeBaselinePolicyItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyItemListResponse DescribeBaselinePolicyItemList(DescribeBaselinePolicyItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyItemList", DescribeBaselinePolicyItemListResponse.class);
    }

    /**
     *This API is used to obtain the list of baseline policies for list page display of system and custom policies and their configuration status in scenarios such as cycle plan management.
     * @param req DescribeBaselinePolicyListRequest
     * @return DescribeBaselinePolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyListResponse DescribeBaselinePolicyList(DescribeBaselinePolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyList", DescribeBaselinePolicyListResponse.class);
    }

    /**
     *This API is used to obtain the list of existing users for a baseline policy name.
     * @param req DescribeBaselinePolicyNameExistAppidListRequest
     * @return DescribeBaselinePolicyNameExistAppidListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselinePolicyNameExistAppidListResponse DescribeBaselinePolicyNameExistAppidList(DescribeBaselinePolicyNameExistAppidListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselinePolicyNameExistAppidList", DescribeBaselinePolicyNameExistAppidListResponse.class);
    }

    /**
     *Get the scan subtask list to show the scan status and failure reason of each host or cluster in the "Asset dimension" section of the task details page.
     * @param req DescribeBaselineSubTaskListRequest
     * @return DescribeBaselineSubTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineSubTaskListResponse DescribeBaselineSubTaskList(DescribeBaselineSubTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineSubTaskList", DescribeBaselineSubTaskListResponse.class);
    }

    /**
     *This API is used to get the baseline synchronization configuration of the current admin account. Only the Group Administrator can call this API. For ordinary member accounts, please use DescribeBaselineUserOtherConf.
     * @param req DescribeBaselineSyncConfRequest
     * @return DescribeBaselineSyncConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineSyncConfResponse DescribeBaselineSyncConf(DescribeBaselineSyncConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineSyncConf", DescribeBaselineSyncConfResponse.class);
    }

    /**
     *Obtain the system built-in baseline classification tree (parent category → subcategory → built-in detection item ID list), used for selecting baseline detection items on the policy editing page.
     * @param req DescribeBaselineSystemCategoryListRequest
     * @return DescribeBaselineSystemCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineSystemCategoryListResponse DescribeBaselineSystemCategoryList(DescribeBaselineSystemCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineSystemCategoryList", DescribeBaselineSystemCategoryListResponse.class);
    }

    /**
     *Retrieve user-level baseline configuration for the current account.
     * @param req DescribeBaselineUserOtherConfRequest
     * @return DescribeBaselineUserOtherConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineUserOtherConfResponse DescribeBaselineUserOtherConf(DescribeBaselineUserOtherConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineUserOtherConf", DescribeBaselineUserOtherConfResponse.class);
    }

    /**
     *This API is used to search for the custom dictionary of weak passwords for users under the current account.
     * @param req DescribeBaselineUserWeakPasswordConfRequest
     * @return DescribeBaselineUserWeakPasswordConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaselineUserWeakPasswordConfResponse DescribeBaselineUserWeakPasswordConf(DescribeBaselineUserWeakPasswordConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaselineUserWeakPasswordConf", DescribeBaselineUserWeakPasswordConfResponse.class);
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
     *Risk statistics for cloud resource configuration check reports
     * @param req DescribeCFGRiskReportStatisticsRequest
     * @return DescribeCFGRiskReportStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCFGRiskReportStatisticsResponse DescribeCFGRiskReportStatistics(DescribeCFGRiskReportStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCFGRiskReportStatistics", DescribeCFGRiskReportStatisticsResponse.class);
    }

    /**
     *Query the statistical information of scanning results.
     * @param req DescribeCFGRiskStatisticsRequest
     * @return DescribeCFGRiskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCFGRiskStatisticsResponse DescribeCFGRiskStatistics(DescribeCFGRiskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCFGRiskStatistics", DescribeCFGRiskStatisticsResponse.class);
    }

    /**
     *Cloud Defense Asset Center Statistics
     * @param req DescribeCFWAssetStatisticsRequest
     * @return DescribeCFWAssetStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCFWAssetStatisticsResponse DescribeCFWAssetStatistics(DescribeCFWAssetStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCFWAssetStatistics", DescribeCFWAssetStatisticsResponse.class);
    }

    /**
     *Get log index information
     * @param req DescribeCLSLogIndexV3Request
     * @return DescribeCLSLogIndexV3Response
     * @throws TencentCloudSDKException
     */
    public DescribeCLSLogIndexV3Response DescribeCLSLogIndexV3(DescribeCLSLogIndexV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCLSLogIndexV3", DescribeCLSLogIndexV3Response.class);
    }

    /**
     *Log analytics retrieval interface v3
     * @param req DescribeCLSLogListV3Request
     * @return DescribeCLSLogListV3Response
     * @throws TencentCloudSDKException
     */
    public DescribeCLSLogListV3Response DescribeCLSLogListV3(DescribeCLSLogListV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCLSLogListV3", DescribeCLSLogListV3Response.class);
    }

    /**
     *Query the consolidated billing information of the current account, including order status, payment mode, quotas, and other detailed information.
     * @param req DescribeCSCPayInfoRequest
     * @return DescribeCSCPayInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSCPayInfoResponse DescribeCSCPayInfo(DescribeCSCPayInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSCPayInfo", DescribeCSCPayInfoResponse.class);
    }

    /**
     *Query the progress of the async binding task returned by ModifyCSIPLicenseBinds.
     * @param req DescribeCSIPLicenseBindScheduleRequest
     * @return DescribeCSIPLicenseBindScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPLicenseBindScheduleResponse DescribeCSIPLicenseBindSchedule(DescribeCSIPLicenseBindScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPLicenseBindSchedule", DescribeCSIPLicenseBindScheduleResponse.class);
    }

    /**
     *This API is used to get host details of a CSIP scan task.
     * @param req DescribeCSIPMalwareScanTaskDetailRequest
     * @return DescribeCSIPMalwareScanTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPMalwareScanTaskDetailResponse DescribeCSIPMalwareScanTaskDetail(DescribeCSIPMalwareScanTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPMalwareScanTaskDetail", DescribeCSIPMalwareScanTaskDetailResponse.class);
    }

    /**
     *This API is used to query the progress of CSIP manual scan.
     * @param req DescribeCSIPMalwareScanTaskProgressRequest
     * @return DescribeCSIPMalwareScanTaskProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPMalwareScanTaskProgressResponse DescribeCSIPMalwareScanTaskProgress(DescribeCSIPMalwareScanTaskProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPMalwareScanTaskProgress", DescribeCSIPMalwareScanTaskProgressResponse.class);
    }

    /**
     *Obtain risk center risk overview sample code
     * @param req DescribeCSIPRiskStatisticsRequest
     * @return DescribeCSIPRiskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPRiskStatisticsResponse DescribeCSIPRiskStatistics(DescribeCSIPRiskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPRiskStatistics", DescribeCSIPRiskStatisticsResponse.class);
    }

    /**
     *This API is used to obtain purchased CSPM order information.
     * @param req DescribeCSPMPayInfoRequest
     * @return DescribeCSPMPayInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSPMPayInfoResponse DescribeCSPMPayInfo(DescribeCSPMPayInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSPMPayInfo", DescribeCSPMPayInfoResponse.class);
    }

    /**
     *CVM Details
     * @param req DescribeCVMAssetInfoRequest
     * @return DescribeCVMAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetInfoResponse DescribeCVMAssetInfo(DescribeCVMAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCVMAssetInfo", DescribeCVMAssetInfoResponse.class);
    }

    /**
     *Get cvm list
     * @param req DescribeCVMAssetsRequest
     * @return DescribeCVMAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetsResponse DescribeCVMAssets(DescribeCVMAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCVMAssets", DescribeCVMAssetsResponse.class);
    }

    /**
     *Queries cloud boundary analysis path nodes (dedicated for hosts)
     * @param req DescribeCWPExposePathRequest
     * @return DescribeCWPExposePathResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPExposePathResponse DescribeCWPExposePath(DescribeCWPExposePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPExposePath", DescribeCWPExposePathResponse.class);
    }

    /**
     *Cloud boundary analysis asset list (suitable for host assets)
     * @param req DescribeCWPExposuresRequest
     * @return DescribeCWPExposuresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPExposuresResponse DescribeCWPExposures(DescribeCWPExposuresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPExposures", DescribeCWPExposuresResponse.class);
    }

    /**
     *This API is used to query the binding task progress of the authorization.
     * @param req DescribeCWPLicenseBindScheduleRequest
     * @return DescribeCWPLicenseBindScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPLicenseBindScheduleResponse DescribeCWPLicenseBindSchedule(DescribeCWPLicenseBindScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPLicenseBindSchedule", DescribeCWPLicenseBindScheduleResponse.class);
    }

    /**
     *Host details
     * @param req DescribeCWPMachineDetailRequest
     * @return DescribeCWPMachineDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPMachineDetailResponse DescribeCWPMachineDetail(DescribeCWPMachineDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPMachineDetail", DescribeCWPMachineDetailResponse.class);
    }

    /**
     *This API is used to query the machine operating system list.
     * @param req DescribeCWPMachineOsListRequest
     * @return DescribeCWPMachineOsListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPMachineOsListResponse DescribeCWPMachineOsList(DescribeCWPMachineOsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPMachineOsList", DescribeCWPMachineOsListResponse.class);
    }

    /**
     *Host list
     * @param req DescribeCWPMachinesRequest
     * @return DescribeCWPMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPMachinesResponse DescribeCWPMachines(DescribeCWPMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPMachines", DescribeCWPMachinesResponse.class);
    }

    /**
     *Query the resource order list.
     * @param req DescribeCWPOrderListRequest
     * @return DescribeCWPOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPOrderListResponse DescribeCWPOrderList(DescribeCWPOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPOrderList", DescribeCWPOrderListResponse.class);
    }

    /**
     *Query Tencent Cloud scan IP information
     * @param req DescribeCWPScanIpInfoRequest
     * @return DescribeCWPScanIpInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPScanIpInfoResponse DescribeCWPScanIpInfo(DescribeCWPScanIpInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPScanIpInfo", DescribeCWPScanIpInfoResponse.class);
    }

    /**
     *Obtain Task Distribution Duration
     * @param req DescribeCWPTaskDurationRequest
     * @return DescribeCWPTaskDurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCWPTaskDurationResponse DescribeCWPTaskDuration(DescribeCWPTaskDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCWPTaskDuration", DescribeCWPTaskDurationResponse.class);
    }

    /**
     *Query the call record list
     * @param req DescribeCallRecordRequest
     * @return DescribeCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallRecordResponse DescribeCallRecord(DescribeCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallRecord", DescribeCallRecordResponse.class);
    }

    /**
     *Query the list of connectivity detection hosts
     * @param req DescribeCheckConnectivityHostListRequest
     * @return DescribeCheckConnectivityHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckConnectivityHostListResponse DescribeCheckConnectivityHostList(DescribeCheckConnectivityHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckConnectivityHostList", DescribeCheckConnectivityHostListResponse.class);
    }

    /**
     *Cloud resource configuration risk list from the check perspective
     * @param req DescribeCheckViewRisksRequest
     * @return DescribeCheckViewRisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckViewRisksResponse DescribeCheckViewRisks(DescribeCheckViewRisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckViewRisks", DescribeCheckViewRisksResponse.class);
    }

    /**
     *Queries the listener list corresponding to a specified Tencent Cloud CLB instance.
     * @param req DescribeClbListenerListRequest
     * @return DescribeClbListenerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClbListenerListResponse DescribeClbListenerList(DescribeClbListenerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClbListenerList", DescribeClbListenerListResponse.class);
    }

    /**
     *Queries the list of Layer 7 forwarding rules corresponding to a specified CLB instance.
     * @param req DescribeClbListenerRulesRequest
     * @return DescribeClbListenerRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClbListenerRulesResponse DescribeClbListenerRules(DescribeClbListenerRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClbListenerRules", DescribeClbListenerRulesResponse.class);
    }

    /**
     *Query the CLB backend service list
     * @param req DescribeClbTargetsRequest
     * @return DescribeClbTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClbTargetsResponse DescribeClbTargets(DescribeClbTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClbTargets", DescribeClbTargetsResponse.class);
    }

    /**
     *All assets
     * @param req DescribeCloudAssetsRequest
     * @return DescribeCloudAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudAssetsResponse DescribeCloudAssets(DescribeCloudAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudAssets", DescribeCloudAssetsResponse.class);
    }

    /**
     *Function list
     * @param req DescribeCloudFunctionListRequest
     * @return DescribeCloudFunctionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudFunctionListResponse DescribeCloudFunctionList(DescribeCloudFunctionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudFunctionList", DescribeCloudFunctionListResponse.class);
    }

    /**
     *Queries the asset list of a container cluster
     * @param req DescribeClusterAssetListRequest
     * @return DescribeClusterAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAssetListResponse DescribeClusterAssetList(DescribeClusterAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAssetList", DescribeClusterAssetListResponse.class);
    }

    /**
     *This API is used to query the synchronization task status of cluster assets.
     * @param req DescribeClusterAssetSyncTaskStatusRequest
     * @return DescribeClusterAssetSyncTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAssetSyncTaskStatusResponse DescribeClusterAssetSyncTaskStatus(DescribeClusterAssetSyncTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAssetSyncTaskStatus", DescribeClusterAssetSyncTaskStatusResponse.class);
    }

    /**
     *This example shows you how to obtain the cluster list.
     * @param req DescribeClusterAssetsRequest
     * @return DescribeClusterAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAssetsResponse DescribeClusterAssets(DescribeClusterAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAssets", DescribeClusterAssetsResponse.class);
    }

    /**
     *This API is used to query the associated application list of a container. It retrieves associated application service information by container ID and supports pagination.
     * @param req DescribeClusterContainerAppListRequest
     * @return DescribeClusterContainerAppListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerAppListResponse DescribeClusterContainerAppList(DescribeClusterContainerAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerAppList", DescribeClusterContainerAppListResponse.class);
    }

    /**
     *Query the list of components associated with a container. Get associated component information by container ID. Pagination is supported.
     * @param req DescribeClusterContainerComponentListRequest
     * @return DescribeClusterContainerComponentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerComponentListResponse DescribeClusterContainerComponentList(DescribeClusterContainerComponentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerComponentList", DescribeClusterContainerComponentListResponse.class);
    }

    /**
     *This API is used to query cluster container details. It retrieves basic container info, mirror information, mount information, network info, and associated node information by container ID.
     * @param req DescribeClusterContainerDetailRequest
     * @return DescribeClusterContainerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerDetailResponse DescribeClusterContainerDetail(DescribeClusterContainerDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerDetail", DescribeClusterContainerDetailResponse.class);
    }

    /**
     *Query the container list of a cluster.
     * @param req DescribeClusterContainerListRequest
     * @return DescribeClusterContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerListResponse DescribeClusterContainerList(DescribeClusterContainerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerList", DescribeClusterContainerListResponse.class);
    }

    /**
     *Query the list of ports associated with a container. This API is used to obtain associated port information by container ID and supports pagination.
     * @param req DescribeClusterContainerPortListRequest
     * @return DescribeClusterContainerPortListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerPortListResponse DescribeClusterContainerPortList(DescribeClusterContainerPortListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerPortList", DescribeClusterContainerPortListResponse.class);
    }

    /**
     *This API is used to query the associated process list of a container. It obtains associated process information by container ID, supports time sorting and pagination. Filter.By supports StartTime; Filter.Order supports ASC/DESC.
     * @param req DescribeClusterContainerProcessListRequest
     * @return DescribeClusterContainerProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerProcessListResponse DescribeClusterContainerProcessList(DescribeClusterContainerProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerProcessList", DescribeClusterContainerProcessListResponse.class);
    }

    /**
     *This API is used to query the associated Web Service List of a container. It retrieves associated web service information by container ID and supports pagination.
     * @param req DescribeClusterContainerWebServiceListRequest
     * @return DescribeClusterContainerWebServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterContainerWebServiceListResponse DescribeClusterContainerWebServiceList(DescribeClusterContainerWebServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterContainerWebServiceList", DescribeClusterContainerWebServiceListResponse.class);
    }

    /**
     *Querying Cluster Details
     * @param req DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterDetailResponse DescribeClusterDetail(DescribeClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterDetail", DescribeClusterDetailResponse.class);
    }

    /**
     *Query the cluster installation command
     * @param req DescribeClusterInstallCommandRequest
     * @return DescribeClusterInstallCommandResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstallCommandResponse DescribeClusterInstallCommand(DescribeClusterInstallCommandRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstallCommand", DescribeClusterInstallCommandResponse.class);
    }

    /**
     *Query the cluster namespace list.
     * @param req DescribeClusterNamespaceListRequest
     * @return DescribeClusterNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNamespaceListResponse DescribeClusterNamespaceList(DescribeClusterNamespaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNamespaceList", DescribeClusterNamespaceListResponse.class);
    }

    /**
     *Query the cluster node list.
     * @param req DescribeClusterNodeListRequest
     * @return DescribeClusterNodeListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodeListResponse DescribeClusterNodeList(DescribeClusterNodeListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNodeList", DescribeClusterNodeListResponse.class);
    }

    /**
     *Cluster Pod List
     * @param req DescribeClusterPodAssetsRequest
     * @return DescribeClusterPodAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPodAssetsResponse DescribeClusterPodAssets(DescribeClusterPodAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPodAssets", DescribeClusterPodAssetsResponse.class);
    }

    /**
     *This API is used to query Pod details in A cluster. It is A new Type A API for the container asset revision and serves as the main entrance to the Pod Asset Details Page. The input parameter is only UniqueID. The output parameters cover asset information, cluster, namespace, node, Workload, as well as the number of risk events and alarm events grouped by four risk levels.
     * @param req DescribeClusterPodDetailRequest
     * @return DescribeClusterPodDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPodDetailResponse DescribeClusterPodDetail(DescribeClusterPodDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPodDetail", DescribeClusterPodDetailResponse.class);
    }

    /**
     *Inquires the cluster pod list
     * @param req DescribeClusterPodListRequest
     * @return DescribeClusterPodListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPodListResponse DescribeClusterPodList(DescribeClusterPodListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPodList", DescribeClusterPodListResponse.class);
    }

    /**
     *Query the cluster service list.
     * @param req DescribeClusterServiceListRequest
     * @return DescribeClusterServiceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterServiceListResponse DescribeClusterServiceList(DescribeClusterServiceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterServiceList", DescribeClusterServiceListResponse.class);
    }

    /**
     *Query cluster overview data
     * @param req DescribeClusterSummaryRequest
     * @return DescribeClusterSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSummaryResponse DescribeClusterSummary(DescribeClusterSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterSummary", DescribeClusterSummaryResponse.class);
    }

    /**
     *This API is used to query super node details in a cluster and return basic info (region, availability zone, last asset update time, node origin, subnet, and core count) and cluster information (cluster name, Cluster ID, cluster status, Kubernetes version, and Kubelet version).
     * @param req DescribeClusterSuperNodeInfoRequest
     * @return DescribeClusterSuperNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSuperNodeInfoResponse DescribeClusterSuperNodeInfo(DescribeClusterSuperNodeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterSuperNodeInfo", DescribeClusterSuperNodeInfoResponse.class);
    }

    /**
     *Cloud resource configuration detection compliance overview
     * @param req DescribeComplianceOverviewRequest
     * @return DescribeComplianceOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceOverviewResponse DescribeComplianceOverview(DescribeComplianceOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceOverview", DescribeComplianceOverviewResponse.class);
    }

    /**
     *Cloud resource configuration risk list from the compliance standard aggregation perspective
     * @param req DescribeComplianceRiskListRequest
     * @return DescribeComplianceRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceRiskListResponse DescribeComplianceRiskList(DescribeComplianceRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceRiskList", DescribeComplianceRiskListResponse.class);
    }

    /**
     *Cloud resource configuration inspection standard chapter clause tree
     * @param req DescribeComplianceStandardTermTreeRequest
     * @return DescribeComplianceStandardTermTreeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceStandardTermTreeResponse DescribeComplianceStandardTermTree(DescribeComplianceStandardTermTreeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceStandardTermTree", DescribeComplianceStandardTermTreeResponse.class);
    }

    /**
     *Category statistics for cloud resource configuration detection specifications
     * @param req DescribeComplianceStatisticsRequest
     * @return DescribeComplianceStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceStatisticsResponse DescribeComplianceStatistics(DescribeComplianceStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceStatistics", DescribeComplianceStatisticsResponse.class);
    }

    /**
     *Example of cloud resource configuration risk rule list
     * @param req DescribeConfigCheckRulesRequest
     * @return DescribeConfigCheckRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigCheckRulesResponse DescribeConfigCheckRules(DescribeConfigCheckRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigCheckRules", DescribeConfigCheckRulesResponse.class);
    }

    /**
     *This API is used to query the CSPM auto quota shared configuration.
     * @param req DescribeCspmShardConfigRequest
     * @return DescribeCspmShardConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCspmShardConfigResponse DescribeCspmShardConfig(DescribeCspmShardConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCspmShardConfig", DescribeCspmShardConfigResponse.class);
    }

    /**
     *number of user-customized tags
     * @param req DescribeCustomAssetTagCountRequest
     * @return DescribeCustomAssetTagCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomAssetTagCountResponse DescribeCustomAssetTagCount(DescribeCustomAssetTagCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomAssetTagCount", DescribeCustomAssetTagCountResponse.class);
    }

    /**
     *Example of a custom risk rule configuration detail list
     * @param req DescribeCustomRiskRuleDetailRequest
     * @return DescribeCustomRiskRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRiskRuleDetailResponse DescribeCustomRiskRuleDetail(DescribeCustomRiskRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomRiskRuleDetail", DescribeCustomRiskRuleDetailResponse.class);
    }

    /**
     *Lists the configuration of custom risk rules
     * @param req DescribeCustomRiskRulesRequest
     * @return DescribeCustomRiskRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRiskRulesResponse DescribeCustomRiskRules(DescribeCustomRiskRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomRiskRules", DescribeCustomRiskRulesResponse.class);
    }

    /**
     *DB Asset Details
     * @param req DescribeDbAssetInfoRequest
     * @return DescribeDbAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetInfoResponse DescribeDbAssetInfo(DescribeDbAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbAssetInfo", DescribeDbAssetInfoResponse.class);
    }

    /**
     *Database Asset List
     * @param req DescribeDbAssetsRequest
     * @return DescribeDbAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetsResponse DescribeDbAssets(DescribeDbAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbAssets", DescribeDbAssetsResponse.class);
    }

    /**
     *Retrieve the built-in default security scoring rules for resetting custom rules.
     * @param req DescribeDefaultSecurityScoreRuleRequest
     * @return DescribeDefaultSecurityScoreRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultSecurityScoreRuleResponse DescribeDefaultSecurityScoreRule(DescribeDefaultSecurityScoreRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultSecurityScoreRule", DescribeDefaultSecurityScoreRuleResponse.class);
    }

    /**
     *Domain name list
     * @param req DescribeDomainAssetsRequest
     * @return DescribeDomainAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAssetsResponse DescribeDomainAssets(DescribeDomainAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainAssets", DescribeDomainAssetsResponse.class);
    }

    /**
     *Query Dspm access records
     * @param req DescribeDspmAccessRecordRequest
     * @return DescribeDspmAccessRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAccessRecordResponse DescribeDspmAccessRecord(DescribeDspmAccessRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAccessRecord", DescribeDspmAccessRecordResponse.class);
    }

    /**
     *Queries the Dspm access topology account list
     * @param req DescribeDspmAccessTopologyAccountsRequest
     * @return DescribeDspmAccessTopologyAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAccessTopologyAccountsResponse DescribeDspmAccessTopologyAccounts(DescribeDspmAccessTopologyAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAccessTopologyAccounts", DescribeDspmAccessTopologyAccountsResponse.class);
    }

    /**
     *Query the Dspm access topology asset list
     * @param req DescribeDspmAccessTopologyAssetsRequest
     * @return DescribeDspmAccessTopologyAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAccessTopologyAssetsResponse DescribeDspmAccessTopologyAssets(DescribeDspmAccessTopologyAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAccessTopologyAssets", DescribeDspmAccessTopologyAssetsResponse.class);
    }

    /**
     *Query the Dspm access topology ip list
     * @param req DescribeDspmAccessTopologyIpsRequest
     * @return DescribeDspmAccessTopologyIpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAccessTopologyIpsResponse DescribeDspmAccessTopologyIps(DescribeDspmAccessTopologyIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAccessTopologyIps", DescribeDspmAccessTopologyIpsResponse.class);
    }

    /**
     *Queries Dspm application history
     * @param req DescribeDspmApplyHistoryRequest
     * @return DescribeDspmApplyHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmApplyHistoryResponse DescribeDspmApplyHistory(DescribeDspmApplyHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmApplyHistory", DescribeDspmApplyHistoryResponse.class);
    }

    /**
     *Queries the Dspm application form list
     * @param req DescribeDspmApplyOrderListRequest
     * @return DescribeDspmApplyOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmApplyOrderListResponse DescribeDspmApplyOrderList(DescribeDspmApplyOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmApplyOrderList", DescribeDspmApplyOrderListResponse.class);
    }

    /**
     *Query Dspm approval history
     * @param req DescribeDspmApproveHistoryRequest
     * @return DescribeDspmApproveHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmApproveHistoryResponse DescribeDspmApproveHistory(DescribeDspmApproveHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmApproveHistory", DescribeDspmApproveHistoryResponse.class);
    }

    /**
     *Queries Dspm approval form list
     * @param req DescribeDspmApproveOrderListRequest
     * @return DescribeDspmApproveOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmApproveOrderListResponse DescribeDspmApproveOrderList(DescribeDspmApproveOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmApproveOrderList", DescribeDspmApproveOrderListResponse.class);
    }

    /**
     *Query the Dspm asset access topology
     * @param req DescribeDspmAssetAccessTopologyRequest
     * @return DescribeDspmAssetAccessTopologyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccessTopologyResponse DescribeDspmAssetAccessTopology(DescribeDspmAssetAccessTopologyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccessTopology", DescribeDspmAssetAccessTopologyResponse.class);
    }

    /**
     *Query Dspm asset account identity information
     * @param req DescribeDspmAssetAccountIdentifyRequest
     * @return DescribeDspmAssetAccountIdentifyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccountIdentifyResponse DescribeDspmAssetAccountIdentify(DescribeDspmAssetAccountIdentifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccountIdentify", DescribeDspmAssetAccountIdentifyResponse.class);
    }

    /**
     *Querying preset privileged information of Dspm asset accounts
     * @param req DescribeDspmAssetAccountPresetPrivilegesRequest
     * @return DescribeDspmAssetAccountPresetPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccountPresetPrivilegesResponse DescribeDspmAssetAccountPresetPrivileges(DescribeDspmAssetAccountPresetPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccountPresetPrivileges", DescribeDspmAssetAccountPresetPrivilegesResponse.class);
    }

    /**
     *Querying privileged information of Dspm asset accounts after recycling
     * @param req DescribeDspmAssetAccountRecycledPrivilegesRequest
     * @return DescribeDspmAssetAccountRecycledPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccountRecycledPrivilegesResponse DescribeDspmAssetAccountRecycledPrivileges(DescribeDspmAssetAccountRecycledPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccountRecycledPrivileges", DescribeDspmAssetAccountRecycledPrivilegesResponse.class);
    }

    /**
     *Query the Dspm asset account list.
     * @param req DescribeDspmAssetAccountsRequest
     * @return DescribeDspmAssetAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetAccountsResponse DescribeDspmAssetAccounts(DescribeDspmAssetAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetAccounts", DescribeDspmAssetAccountsResponse.class);
    }

    /**
     *This API is used to query asset database information.
     * @param req DescribeDspmAssetDatabaseListRequest
     * @return DescribeDspmAssetDatabaseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetDatabaseListResponse DescribeDspmAssetDatabaseList(DescribeDspmAssetDatabaseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetDatabaseList", DescribeDspmAssetDatabaseListResponse.class);
    }

    /**
     *This API is used to query the list of Dspm asset databases.
     * @param req DescribeDspmAssetDatabasesRequest
     * @return DescribeDspmAssetDatabasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetDatabasesResponse DescribeDspmAssetDatabases(DescribeDspmAssetDatabasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetDatabases", DescribeDspmAssetDatabasesResponse.class);
    }

    /**
     *Queries the dspm asset field information
     * @param req DescribeDspmAssetFieldListRequest
     * @return DescribeDspmAssetFieldListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetFieldListResponse DescribeDspmAssetFieldList(DescribeDspmAssetFieldListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetFieldList", DescribeDspmAssetFieldListResponse.class);
    }

    /**
     *Query sample values of dspm asset fields
     * @param req DescribeDspmAssetFieldSamplesRequest
     * @return DescribeDspmAssetFieldSamplesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetFieldSamplesResponse DescribeDspmAssetFieldSamples(DescribeDspmAssetFieldSamplesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetFieldSamples", DescribeDspmAssetFieldSamplesResponse.class);
    }

    /**
     *Queries the dspm asset data recognition information list
     * @param req DescribeDspmAssetIdentifyInfoListRequest
     * @return DescribeDspmAssetIdentifyInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetIdentifyInfoListResponse DescribeDspmAssetIdentifyInfoList(DescribeDspmAssetIdentifyInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetIdentifyInfoList", DescribeDspmAssetIdentifyInfoListResponse.class);
    }

    /**
     *Queries the list of Dspm asset IDs
     * @param req DescribeDspmAssetIdsRequest
     * @return DescribeDspmAssetIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetIdsResponse DescribeDspmAssetIds(DescribeDspmAssetIdsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetIds", DescribeDspmAssetIdsResponse.class);
    }

    /**
     *Query Dspm asset login credentials
     * @param req DescribeDspmAssetLoginCredentialRequest
     * @return DescribeDspmAssetLoginCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetLoginCredentialResponse DescribeDspmAssetLoginCredential(DescribeDspmAssetLoginCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetLoginCredential", DescribeDspmAssetLoginCredentialResponse.class);
    }

    /**
     *Query the security analysis status of Dspm assets.
     * @param req DescribeDspmAssetSecurityAnalyseStatusRequest
     * @return DescribeDspmAssetSecurityAnalyseStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetSecurityAnalyseStatusResponse DescribeDspmAssetSecurityAnalyseStatus(DescribeDspmAssetSecurityAnalyseStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetSecurityAnalyseStatus", DescribeDspmAssetSecurityAnalyseStatusResponse.class);
    }

    /**
     *Queries supported permissions for Dspm assets
     * @param req DescribeDspmAssetSupportedPrivilegesRequest
     * @return DescribeDspmAssetSupportedPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetSupportedPrivilegesResponse DescribeDspmAssetSupportedPrivileges(DescribeDspmAssetSupportedPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetSupportedPrivileges", DescribeDspmAssetSupportedPrivilegesResponse.class);
    }

    /**
     *This API is used to query asset table information.
     * @param req DescribeDspmAssetTableListRequest
     * @return DescribeDspmAssetTableListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetTableListResponse DescribeDspmAssetTableList(DescribeDspmAssetTableListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssetTableList", DescribeDspmAssetTableListResponse.class);
    }

    /**
     *Queries the Dspm asset list.
     * @param req DescribeDspmAssetsRequest
     * @return DescribeDspmAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAssetsResponse DescribeDspmAssets(DescribeDspmAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAssets", DescribeDspmAssetsResponse.class);
    }

    /**
     *Query dspm audit filter policies
     * @param req DescribeDspmAuditFilterStrategyRequest
     * @return DescribeDspmAuditFilterStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmAuditFilterStrategyResponse DescribeDspmAuditFilterStrategy(DescribeDspmAuditFilterStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmAuditFilterStrategy", DescribeDspmAuditFilterStrategyResponse.class);
    }

    /**
     *This API is used to query the backup log list.
     * @param req DescribeDspmBackupLogListRequest
     * @return DescribeDspmBackupLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmBackupLogListResponse DescribeDspmBackupLogList(DescribeDspmBackupLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmBackupLogList", DescribeDspmBackupLogListResponse.class);
    }

    /**
     *This API is used to query the log backup configuration.
     * @param req DescribeDspmBackupSettingRequest
     * @return DescribeDspmBackupSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmBackupSettingResponse DescribeDspmBackupSetting(DescribeDspmBackupSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmBackupSetting", DescribeDspmBackupSettingResponse.class);
    }

    /**
     *This API is used to query the routing information of the CKafka instance.
     * @param req DescribeDspmCkafkaRouteListRequest
     * @return DescribeDspmCkafkaRouteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmCkafkaRouteListResponse DescribeDspmCkafkaRouteList(DescribeDspmCkafkaRouteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmCkafkaRouteList", DescribeDspmCkafkaRouteListResponse.class);
    }

    /**
     *This API is used to query the topic list of the instance.
     * @param req DescribeDspmCkafkaTopicListRequest
     * @return DescribeDspmCkafkaTopicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmCkafkaTopicListResponse DescribeDspmCkafkaTopicList(DescribeDspmCkafkaTopicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmCkafkaTopicList", DescribeDspmCkafkaTopicListResponse.class);
    }

    /**
     *Query the list of dspm dictionary information
     * @param req DescribeDspmDictionaryListRequest
     * @return DescribeDspmDictionaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmDictionaryListResponse DescribeDspmDictionaryList(DescribeDspmDictionaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmDictionaryList", DescribeDspmDictionaryListResponse.class);
    }

    /**
     *This API is used to query export tasks.
     * @param req DescribeDspmExportTaskRequest
     * @return DescribeDspmExportTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmExportTaskResponse DescribeDspmExportTask(DescribeDspmExportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmExportTask", DescribeDspmExportTaskResponse.class);
    }

    /**
     *Querying the dspm data identification classification list
     * @param req DescribeDspmIdentifyCategoryListRequest
     * @return DescribeDspmIdentifyCategoryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyCategoryListResponse DescribeDspmIdentifyCategoryList(DescribeDspmIdentifyCategoryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyCategoryList", DescribeDspmIdentifyCategoryListResponse.class);
    }

    /**
     *This API is used to query the list of data items associated with dspm data recognition template classifications.
     * @param req DescribeDspmIdentifyComplianceCategoryRuleListRequest
     * @return DescribeDspmIdentifyComplianceCategoryRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyComplianceCategoryRuleListResponse DescribeDspmIdentifyComplianceCategoryRuleList(DescribeDspmIdentifyComplianceCategoryRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyComplianceCategoryRuleList", DescribeDspmIdentifyComplianceCategoryRuleListResponse.class);
    }

    /**
     *Query dspm identification template details
     * @param req DescribeDspmIdentifyComplianceGroupDetailRequest
     * @return DescribeDspmIdentifyComplianceGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyComplianceGroupDetailResponse DescribeDspmIdentifyComplianceGroupDetail(DescribeDspmIdentifyComplianceGroupDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyComplianceGroupDetail", DescribeDspmIdentifyComplianceGroupDetailResponse.class);
    }

    /**
     *Queries the dspm data identification template list
     * @param req DescribeDspmIdentifyComplianceGroupListRequest
     * @return DescribeDspmIdentifyComplianceGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyComplianceGroupListResponse DescribeDspmIdentifyComplianceGroupList(DescribeDspmIdentifyComplianceGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyComplianceGroupList", DescribeDspmIdentifyComplianceGroupListResponse.class);
    }

    /**
     *Querying dspm data identification distribution statistics
     * @param req DescribeDspmIdentifyDistributionStatisticsRequest
     * @return DescribeDspmIdentifyDistributionStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyDistributionStatisticsResponse DescribeDspmIdentifyDistributionStatistics(DescribeDspmIdentifyDistributionStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyDistributionStatistics", DescribeDspmIdentifyDistributionStatisticsResponse.class);
    }

    /**
     *Query the Dspm identity ID list.
     * @param req DescribeDspmIdentifyIdListRequest
     * @return DescribeDspmIdentifyIdListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyIdListResponse DescribeDspmIdentifyIdList(DescribeDspmIdentifyIdListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyIdList", DescribeDspmIdentifyIdListResponse.class);
    }

    /**
     *Queries the Dspm identity information.
     * @param req DescribeDspmIdentifyInfoRequest
     * @return DescribeDspmIdentifyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyInfoResponse DescribeDspmIdentifyInfo(DescribeDspmIdentifyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyInfo", DescribeDspmIdentifyInfoResponse.class);
    }

    /**
     *Query the Dspm identity information list
     * @param req DescribeDspmIdentifyInfoListRequest
     * @return DescribeDspmIdentifyInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyInfoListResponse DescribeDspmIdentifyInfoList(DescribeDspmIdentifyInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyInfoList", DescribeDspmIdentifyInfoListResponse.class);
    }

    /**
     *Query the dspm data identification classification group list
     * @param req DescribeDspmIdentifyLevelGroupListRequest
     * @return DescribeDspmIdentifyLevelGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyLevelGroupListResponse DescribeDspmIdentifyLevelGroupList(DescribeDspmIdentifyLevelGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyLevelGroupList", DescribeDspmIdentifyLevelGroupListResponse.class);
    }

    /**
     *Queries the dspm data identification data item details
     * @param req DescribeDspmIdentifyRuleDetailRequest
     * @return DescribeDspmIdentifyRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyRuleDetailResponse DescribeDspmIdentifyRuleDetail(DescribeDspmIdentifyRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyRuleDetail", DescribeDspmIdentifyRuleDetailResponse.class);
    }

    /**
     *Query the list of dspm identification data items.
     * @param req DescribeDspmIdentifyRuleListRequest
     * @return DescribeDspmIdentifyRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyRuleListResponse DescribeDspmIdentifyRuleList(DescribeDspmIdentifyRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyRuleList", DescribeDspmIdentifyRuleListResponse.class);
    }

    /**
     *This API is used to query verification results of dspm data identification data items.
     * @param req DescribeDspmIdentifyRuleTestResultRequest
     * @return DescribeDspmIdentifyRuleTestResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmIdentifyRuleTestResultResponse DescribeDspmIdentifyRuleTestResult(DescribeDspmIdentifyRuleTestResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmIdentifyRuleTestResult", DescribeDspmIdentifyRuleTestResultResponse.class);
    }

    /**
     *This API is used to query the log type for log shipping.
     * @param req DescribeDspmLogDeliveryTypeRequest
     * @return DescribeDspmLogDeliveryTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmLogDeliveryTypeResponse DescribeDspmLogDeliveryType(DescribeDspmLogDeliveryTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmLogDeliveryType", DescribeDspmLogDeliveryTypeResponse.class);
    }

    /**
     *This API is used to query the log list information.
     * @param req DescribeDspmLogListRequest
     * @return DescribeDspmLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmLogListResponse DescribeDspmLogList(DescribeDspmLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmLogList", DescribeDspmLogListResponse.class);
    }

    /**
     *This API is used to query the log shipping configuration of a tenant.
     * @param req DescribeDspmLogTypeConfigListRequest
     * @return DescribeDspmLogTypeConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmLogTypeConfigListResponse DescribeDspmLogTypeConfigList(DescribeDspmLogTypeConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmLogTypeConfigList", DescribeDspmLogTypeConfigListResponse.class);
    }

    /**
     *Get purchased Dspm order information
     * @param req DescribeDspmPayInfoRequest
     * @return DescribeDspmPayInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmPayInfoResponse DescribeDspmPayInfo(DescribeDspmPayInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmPayInfo", DescribeDspmPayInfoResponse.class);
    }

    /**
     *Queries Dspm visitor application records.
     * @param req DescribeDspmPersonApplyHistoryRequest
     * @return DescribeDspmPersonApplyHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmPersonApplyHistoryResponse DescribeDspmPersonApplyHistory(DescribeDspmPersonApplyHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmPersonApplyHistory", DescribeDspmPersonApplyHistoryResponse.class);
    }

    /**
     *Query the list of Dspm personal identification information.
     * @param req DescribeDspmPersonalIdentifyListRequest
     * @return DescribeDspmPersonalIdentifyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmPersonalIdentifyListResponse DescribeDspmPersonalIdentifyList(DescribeDspmPersonalIdentifyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmPersonalIdentifyList", DescribeDspmPersonalIdentifyListResponse.class);
    }

    /**
     *Queries Dspm instances
     * @param req DescribeDspmResourceRequest
     * @return DescribeDspmResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmResourceResponse DescribeDspmResource(DescribeDspmResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmResource", DescribeDspmResourceResponse.class);
    }

    /**
     *Queries Dspm risk records
     * @param req DescribeDspmRiskRequest
     * @return DescribeDspmRiskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskResponse DescribeDspmRisk(DescribeDspmRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRisk", DescribeDspmRiskResponse.class);
    }

    /**
     *Queries Dspm risk details
     * @param req DescribeDspmRiskDetailRequest
     * @return DescribeDspmRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskDetailResponse DescribeDspmRiskDetail(DescribeDspmRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRiskDetail", DescribeDspmRiskDetailResponse.class);
    }

    /**
     *Queries Dspm risk policies
     * @param req DescribeDspmRiskStrategyRequest
     * @return DescribeDspmRiskStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskStrategyResponse DescribeDspmRiskStrategy(DescribeDspmRiskStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRiskStrategy", DescribeDspmRiskStrategyResponse.class);
    }

    /**
     *Query Dspm risk group policies
     * @param req DescribeDspmRiskStrategyGroupRequest
     * @return DescribeDspmRiskStrategyGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskStrategyGroupResponse DescribeDspmRiskStrategyGroup(DescribeDspmRiskStrategyGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRiskStrategyGroup", DescribeDspmRiskStrategyGroupResponse.class);
    }

    /**
     *Query Dspm risk trends.
     * @param req DescribeDspmRiskTendencyRequest
     * @return DescribeDspmRiskTendencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmRiskTendencyResponse DescribeDspmRiskTendency(DescribeDspmRiskTendencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmRiskTendency", DescribeDspmRiskTendencyResponse.class);
    }

    /**
     *This API is used to query the audit session list information.
     * @param req DescribeDspmSessionListRequest
     * @return DescribeDspmSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmSessionListResponse DescribeDspmSessionList(DescribeDspmSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmSessionList", DescribeDspmSessionListResponse.class);
    }

    /**
     *Query Dspm statistical information
     * @param req DescribeDspmStatisticsRequest
     * @return DescribeDspmStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmStatisticsResponse DescribeDspmStatistics(DescribeDspmStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmStatistics", DescribeDspmStatisticsResponse.class);
    }

    /**
     *Queries information on asset types supported by Dspm.
     * @param req DescribeDspmSupportedAssetTypeRequest
     * @return DescribeDspmSupportedAssetTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmSupportedAssetTypeResponse DescribeDspmSupportedAssetType(DescribeDspmSupportedAssetTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmSupportedAssetType", DescribeDspmSupportedAssetTypeResponse.class);
    }

    /**
     *Query the Dspm asset status synchronization.
     * @param req DescribeDspmSyncAssetsStatusRequest
     * @return DescribeDspmSyncAssetsStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmSyncAssetsStatusResponse DescribeDspmSyncAssetsStatus(DescribeDspmSyncAssetsStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmSyncAssetsStatus", DescribeDspmSyncAssetsStatusResponse.class);
    }

    /**
     *Query the Dspm user synchronization status.
     * @param req DescribeDspmSyncUsersStatusRequest
     * @return DescribeDspmSyncUsersStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmSyncUsersStatusResponse DescribeDspmSyncUsersStatus(DescribeDspmSyncUsersStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmSyncUsersStatus", DescribeDspmSyncUsersStatusResponse.class);
    }

    /**
     *This API is used to query the tenant CKafka instance list.
     * @param req DescribeDspmUserCkafkaInstanceListRequest
     * @return DescribeDspmUserCkafkaInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmUserCkafkaInstanceListResponse DescribeDspmUserCkafkaInstanceList(DescribeDspmUserCkafkaInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmUserCkafkaInstanceList", DescribeDspmUserCkafkaInstanceListResponse.class);
    }

    /**
     *Query the Dspm allowlist policy.
     * @param req DescribeDspmWhitelistStrategyRequest
     * @return DescribeDspmWhitelistStrategyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDspmWhitelistStrategyResponse DescribeDspmWhitelistStrategy(DescribeDspmWhitelistStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDspmWhitelistStrategy", DescribeDspmWhitelistStrategyResponse.class);
    }

    /**
     *List of specified asset types
     * @param req DescribeDynamicAssetsRequest
     * @return DescribeDynamicAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDynamicAssetsResponse DescribeDynamicAssets(DescribeDynamicAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDynamicAssets", DescribeDynamicAssetsResponse.class);
    }

    /**
     *This API is used to obtain the list of EDR policies.
     * @param req DescribeEDRRuleListRequest
     * @return DescribeEDRRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEDRRuleListResponse DescribeEDRRuleList(DescribeEDRRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEDRRuleList", DescribeEDRRuleListResponse.class);
    }

    /**
     *This API is used to query the scan task list. Filter.Filters supports Name: Keyword (blurry, OperatorType=9), ScanType (MANUAL/CYCLE), TaskType (HOST/CONTAINER), Status (WAIT/SCANNING/FINISHED/FAILED/CANCELED), AppId (account).
     * @param req DescribeEDRScanRecordListRequest
     * @return DescribeEDRScanRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEDRScanRecordListResponse DescribeEDRScanRecordList(DescribeEDRScanRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEDRScanRecordList", DescribeEDRScanRecordListResponse.class);
    }

    /**
     *Query scan task details. Filter.Filters supports Name: Status (asset scan status, OperatorType=7 IN match, Value: WAIT/SCANNING/FINISHED/FAILED).
     * @param req DescribeEDRScanTaskDetailRequest
     * @return DescribeEDRScanTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEDRScanTaskDetailResponse DescribeEDRScanTaskDetail(DescribeEDRScanTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEDRScanTaskDetail", DescribeEDRScanTaskDetailResponse.class);
    }

    /**
     *This API is used to obtain EDR alarm quantity statistics for the asset module. It queries the EDR alarm table based on the passed-in MemberId and InstanceIDs and returns the number of alarm records. If InstanceIDs is empty, summarized statistics are returned. Otherwise, statistics are returned by InstanceID granularity.
     * @param req DescribeEdrAlertCountForAssetRequest
     * @return DescribeEdrAlertCountForAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertCountForAssetResponse DescribeEdrAlertCountForAsset(DescribeEdrAlertCountForAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertCountForAsset", DescribeEdrAlertCountForAssetResponse.class);
    }

    /**
     *Alarm quantity statistics in the container scenario.
     * @param req DescribeEdrAlertCountForContainerRequest
     * @return DescribeEdrAlertCountForContainerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertCountForContainerResponse DescribeEdrAlertCountForContainer(DescribeEdrAlertCountForContainerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertCountForContainer", DescribeEdrAlertCountForContainerResponse.class);
    }

    /**
     *This API is used to obtain EDR alert details, including complete information such as alert content JSON, asset enrichment, and intelligence enrichment.
     * @param req DescribeEdrAlertInfoRequest
     * @return DescribeEdrAlertInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertInfoResponse DescribeEdrAlertInfo(DescribeEdrAlertInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertInfo", DescribeEdrAlertInfoResponse.class);
    }

    /**
     *Query the EDR alarm list.
     * @param req DescribeEdrAlertListRequest
     * @return DescribeEdrAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertListResponse DescribeEdrAlertList(DescribeEdrAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertList", DescribeEdrAlertListResponse.class);
    }

    /**
     *EDR alert multi-attack stage queries
     * @param req DescribeEdrAlertMultiAttackStagesRequest
     * @return DescribeEdrAlertMultiAttackStagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertMultiAttackStagesResponse DescribeEdrAlertMultiAttackStages(DescribeEdrAlertMultiAttackStagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertMultiAttackStages", DescribeEdrAlertMultiAttackStagesResponse.class);
    }

    /**
     *Retrieves EDR alarm statistics
     * @param req DescribeEdrAlertSummaryRequest
     * @return DescribeEdrAlertSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertSummaryResponse DescribeEdrAlertSummary(DescribeEdrAlertSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertSummary", DescribeEdrAlertSummaryResponse.class);
    }

    /**
     *This API is used to query EDR alarm tags in batches.
     * @param req DescribeEdrAlertThreatTagsRequest
     * @return DescribeEdrAlertThreatTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrAlertThreatTagsResponse DescribeEdrAlertThreatTags(DescribeEdrAlertThreatTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrAlertThreatTags", DescribeEdrAlertThreatTagsResponse.class);
    }

    /**
     *This API is used to query the exclusion network segment configurations for EDR log collection. TCP logs from network segments in the exclusion list will not be collected. If no user configuration exists, the system-recommended default network segments will be returned.
     * @param req DescribeEdrExcludeNetworkSegmentsRequest
     * @return DescribeEdrExcludeNetworkSegmentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrExcludeNetworkSegmentsResponse DescribeEdrExcludeNetworkSegments(DescribeEdrExcludeNetworkSegmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrExcludeNetworkSegments", DescribeEdrExcludeNetworkSegmentsResponse.class);
    }

    /**
     *Query the EDR export download link
     * @param req DescribeEdrExportJobDownloadURLRequest
     * @return DescribeEdrExportJobDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrExportJobDownloadURLResponse DescribeEdrExportJobDownloadURL(DescribeEdrExportJobDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrExportJobDownloadURL", DescribeEdrExportJobDownloadURLResponse.class);
    }

    /**
     *Export the EDR task list.
     * @param req DescribeEdrExportJobListRequest
     * @return DescribeEdrExportJobListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrExportJobListResponse DescribeEdrExportJobList(DescribeEdrExportJobListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrExportJobList", DescribeEdrExportJobListResponse.class);
    }

    /**
     *This API is used to query the collection path configuration.
     * @param req DescribeEdrLogCollectPathsRequest
     * @return DescribeEdrLogCollectPathsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdrLogCollectPathsResponse DescribeEdrLogCollectPaths(DescribeEdrLogCollectPathsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdrLogCollectPaths", DescribeEdrLogCollectPathsResponse.class);
    }

    /**
     *Result download URL of an export task
     * @param req DescribeExportJobDownloadURLRequest
     * @return DescribeExportJobDownloadURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobDownloadURLResponse DescribeExportJobDownloadURL(DescribeExportJobDownloadURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportJobDownloadURL", DescribeExportJobDownloadURLResponse.class);
    }

    /**
     *Exports the task list
     * @param req DescribeExportJobManageListRequest
     * @return DescribeExportJobManageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportJobManageListResponse DescribeExportJobManageList(DescribeExportJobManageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExportJobManageList", DescribeExportJobManageListResponse.class);
    }

    /**
     *Cloud boundary analysis asset category
     * @param req DescribeExposeAssetCategoryRequest
     * @return DescribeExposeAssetCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeAssetCategoryResponse DescribeExposeAssetCategory(DescribeExposeAssetCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeAssetCategory", DescribeExposeAssetCategoryResponse.class);
    }

    /**
     *Query the cloud boundary analysis path node
     * @param req DescribeExposePathRequest
     * @return DescribeExposePathResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposePathResponse DescribeExposePath(DescribeExposePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposePath", DescribeExposePathResponse.class);
    }

    /**
     *Pending risks to be governed for cloud boundaries
     * @param req DescribeExposeRiskStatisticsRequest
     * @return DescribeExposeRiskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeRiskStatisticsResponse DescribeExposeRiskStatistics(DescribeExposeRiskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeRiskStatistics", DescribeExposeRiskStatisticsResponse.class);
    }

    /**
     *List of pending risks in cloud boundaries
     * @param req DescribeExposeRisksRequest
     * @return DescribeExposeRisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeRisksResponse DescribeExposeRisks(DescribeExposeRisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeRisks", DescribeExposeRisksResponse.class);
    }

    /**
     *List of boundary rules
     * @param req DescribeExposeRulesRequest
     * @return DescribeExposeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeRulesResponse DescribeExposeRules(DescribeExposeRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeRules", DescribeExposeRulesResponse.class);
    }

    /**
     *Rule attributes for automatic tagging at cloud boundaries
     * @param req DescribeExposureAutoTagAttributeRequest
     * @return DescribeExposureAutoTagAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposureAutoTagAttributeResponse DescribeExposureAutoTagAttribute(DescribeExposureAutoTagAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposureAutoTagAttribute", DescribeExposureAutoTagAttributeResponse.class);
    }

    /**
     *Automatic tagging of cloud boundaries - rule list
     * @param req DescribeExposureAutoTagRulesRequest
     * @return DescribeExposureAutoTagRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposureAutoTagRulesResponse DescribeExposureAutoTagRules(DescribeExposureAutoTagRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposureAutoTagRules", DescribeExposureAutoTagRulesResponse.class);
    }

    /**
     *Query Internet exposure cycle count trend statistics.
     * @param req DescribeExposureTrendRequest
     * @return DescribeExposureTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposureTrendResponse DescribeExposureTrend(DescribeExposureTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposureTrend", DescribeExposureTrendResponse.class);
    }

    /**
     *Cloud boundary analysis asset list
     * @param req DescribeExposuresRequest
     * @return DescribeExposuresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposuresResponse DescribeExposures(DescribeExposuresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposures", DescribeExposuresResponse.class);
    }

    /**
     *Obtain Gateway List
     * @param req DescribeGatewayAssetsRequest
     * @return DescribeGatewayAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayAssetsResponse DescribeGatewayAssets(DescribeGatewayAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayAssets", DescribeGatewayAssetsResponse.class);
    }

    /**
     *Query the high-risk baseline risk list of host nodes under the cloud boundary analysis exposed path.
     * @param req DescribeHighBaseLineRiskListRequest
     * @return DescribeHighBaseLineRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHighBaseLineRiskListResponse DescribeHighBaseLineRiskList(DescribeHighBaseLineRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHighBaseLineRiskList", DescribeHighBaseLineRiskListResponse.class);
    }

    /**
     *Search the host kb risk list.
     * @param req DescribeHostKBRiskListRequest
     * @return DescribeHostKBRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostKBRiskListResponse DescribeHostKBRiskList(DescribeHostKBRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostKBRiskList", DescribeHostKBRiskListResponse.class);
    }

    /**
     *This API is used to obtain host vulnerability VPR information.
     * @param req DescribeHostVulItemVPRInfoRequest
     * @return DescribeHostVulItemVPRInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostVulItemVPRInfoResponse DescribeHostVulItemVPRInfo(DescribeHostVulItemVPRInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostVulItemVPRInfo", DescribeHostVulItemVPRInfoResponse.class);
    }

    /**
     *This API is used to obtain the host vulnerability overview.
     * @param req DescribeHostVulOverviewRequest
     * @return DescribeHostVulOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostVulOverviewResponse DescribeHostVulOverview(DescribeHostVulOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostVulOverview", DescribeHostVulOverviewResponse.class);
    }

    /**
     *This API is used to retrieve the host vulnerability risk list.
     * @param req DescribeHostVulRiskListRequest
     * @return DescribeHostVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostVulRiskListResponse DescribeHostVulRiskList(DescribeHostVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostVulRiskList", DescribeHostVulRiskListResponse.class);
    }

    /**
     *Retrieve the IaC detection file list.
     * @param req DescribeIaCFileListRequest
     * @return DescribeIaCFileListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIaCFileListResponse DescribeIaCFileList(DescribeIaCFileListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIaCFileList", DescribeIaCFileListResponse.class);
    }

    /**
     *Obtain the IaC detection file overview.
     * @param req DescribeIaCFileOverviewRequest
     * @return DescribeIaCFileOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIaCFileOverviewResponse DescribeIaCFileOverview(DescribeIaCFileOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIaCFileOverview", DescribeIaCFileOverviewResponse.class);
    }

    /**
     *Obtain the IaC detection file report.
     * @param req DescribeIaCFileReportRequest
     * @return DescribeIaCFileReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIaCFileReportResponse DescribeIaCFileReport(DescribeIaCFileReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIaCFileReport", DescribeIaCFileReportResponse.class);
    }

    /**
     *This API is used to search the IaC detection integration Token list.
     * @param req DescribeIaCTokenListRequest
     * @return DescribeIaCTokenListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIaCTokenListResponse DescribeIaCTokenList(DescribeIaCTokenListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIaCTokenList", DescribeIaCTokenListResponse.class);
    }

    /**
     *Queries image asset details.
     * @param req DescribeImageAssetDetailRequest
     * @return DescribeImageAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAssetDetailResponse DescribeImageAssetDetail(DescribeImageAssetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAssetDetail", DescribeImageAssetDetailResponse.class);
    }

    /**
     *Query the image asset list
     * @param req DescribeImageAssetListRequest
     * @return DescribeImageAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAssetListResponse DescribeImageAssetList(DescribeImageAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAssetList", DescribeImageAssetListResponse.class);
    }

    /**
     *Query the number of related assets of an image.
     * @param req DescribeImageAssociatedAssetCountRequest
     * @return DescribeImageAssociatedAssetCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAssociatedAssetCountResponse DescribeImageAssociatedAssetCount(DescribeImageAssociatedAssetCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAssociatedAssetCount", DescribeImageAssociatedAssetCountResponse.class);
    }

    /**
     *Queries the container assets associated with an image.
     * @param req DescribeImageAssociatedContainerListRequest
     * @return DescribeImageAssociatedContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAssociatedContainerListResponse DescribeImageAssociatedContainerList(DescribeImageAssociatedContainerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAssociatedContainerList", DescribeImageAssociatedContainerListResponse.class);
    }

    /**
     *Query the asset list of hosts associated with the image.
     * @param req DescribeImageAssociatedHostListRequest
     * @return DescribeImageAssociatedHostListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageAssociatedHostListResponse DescribeImageAssociatedHostList(DescribeImageAssociatedHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageAssociatedHostList", DescribeImageAssociatedHostListResponse.class);
    }

    /**
     *Queries the image component list.
     * @param req DescribeImageComponentListRequest
     * @return DescribeImageComponentListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageComponentListResponse DescribeImageComponentList(DescribeImageComponentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageComponentList", DescribeImageComponentListResponse.class);
    }

    /**
     *Queries the image repository export task list
     * @param req DescribeImageExportJobListRequest
     * @return DescribeImageExportJobListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageExportJobListResponse DescribeImageExportJobList(DescribeImageExportJobListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageExportJobList", DescribeImageExportJobListResponse.class);
    }

    /**
     *Query the image layer information list
     * @param req DescribeImageLayerListRequest
     * @return DescribeImageLayerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageLayerListResponse DescribeImageLayerList(DescribeImageLayerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageLayerList", DescribeImageLayerListResponse.class);
    }

    /**
     *Queries the list of vulnerabilities in an image layer
     * @param req DescribeImageLayerVulListRequest
     * @return DescribeImageLayerVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageLayerVulListResponse DescribeImageLayerVulList(DescribeImageLayerVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageLayerVulList", DescribeImageLayerVulListResponse.class);
    }

    /**
     *Query the repository asset overview of images
     * @param req DescribeImageRegistryAssetOverviewRequest
     * @return DescribeImageRegistryAssetOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryAssetOverviewResponse DescribeImageRegistryAssetOverview(DescribeImageRegistryAssetOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryAssetOverview", DescribeImageRegistryAssetOverviewResponse.class);
    }

    /**
     *Query the connectivity check task result of an image repository.
     * @param req DescribeImageRegistryConnectivityTaskResultRequest
     * @return DescribeImageRegistryConnectivityTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryConnectivityTaskResultResponse DescribeImageRegistryConnectivityTaskResult(DescribeImageRegistryConnectivityTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryConnectivityTaskResult", DescribeImageRegistryConnectivityTaskResultResponse.class);
    }

    /**
     *This API is used to query the image repository list.
     * @param req DescribeImageRegistryListRequest
     * @return DescribeImageRegistryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryListResponse DescribeImageRegistryList(DescribeImageRegistryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryList", DescribeImageRegistryListResponse.class);
    }

    /**
     *This API is used to query the mirror repository namespace list.
     * @param req DescribeImageRegistryNamespaceListRequest
     * @return DescribeImageRegistryNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryNamespaceListResponse DescribeImageRegistryNamespaceList(DescribeImageRegistryNamespaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryNamespaceList", DescribeImageRegistryNamespaceListResponse.class);
    }

    /**
     *Query subtask information of image repository scanning
     * @param req DescribeImageRegistryScanSubTaskListRequest
     * @return DescribeImageRegistryScanSubTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryScanSubTaskListResponse DescribeImageRegistryScanSubTaskList(DescribeImageRegistryScanSubTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryScanSubTaskList", DescribeImageRegistryScanSubTaskListResponse.class);
    }

    /**
     *Query the image repository scan task list
     * @param req DescribeImageRegistryScanTaskListRequest
     * @return DescribeImageRegistryScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryScanTaskListResponse DescribeImageRegistryScanTaskList(DescribeImageRegistryScanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryScanTaskList", DescribeImageRegistryScanTaskListResponse.class);
    }

    /**
     *View the scheduled scan task configuration of a mirror repository
     * @param req DescribeImageRegistryTimedScanTaskConfigRequest
     * @return DescribeImageRegistryTimedScanTaskConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryTimedScanTaskConfigResponse DescribeImageRegistryTimedScanTaskConfig(DescribeImageRegistryTimedScanTaskConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryTimedScanTaskConfig", DescribeImageRegistryTimedScanTaskConfigResponse.class);
    }

    /**
     *Query the preview of a scheduled scan task in the mirror repository
     * @param req DescribeImageRegistryTimedScanTaskPreviewRequest
     * @return DescribeImageRegistryTimedScanTaskPreviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageRegistryTimedScanTaskPreviewResponse DescribeImageRegistryTimedScanTaskPreview(DescribeImageRegistryTimedScanTaskPreviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageRegistryTimedScanTaskPreview", DescribeImageRegistryTimedScanTaskPreviewResponse.class);
    }

    /**
     *Query the sensitive information list of an image
     * @param req DescribeImageSensitiveInfoListRequest
     * @return DescribeImageSensitiveInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSensitiveInfoListResponse DescribeImageSensitiveInfoList(DescribeImageSensitiveInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageSensitiveInfoList", DescribeImageSensitiveInfoListResponse.class);
    }

    /**
     *Query the sensitive information allowlist for container images
     * @param req DescribeImageSensitiveWhitelistRequest
     * @return DescribeImageSensitiveWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSensitiveWhitelistResponse DescribeImageSensitiveWhitelist(DescribeImageSensitiveWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageSensitiveWhitelist", DescribeImageSensitiveWhitelistResponse.class);
    }

    /**
     *Queries the Trojan virus list of an image
     * @param req DescribeImageVirusListRequest
     * @return DescribeImageVirusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageVirusListResponse DescribeImageVirusList(DescribeImageVirusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageVirusList", DescribeImageVirusListResponse.class);
    }

    /**
     *This API is used to query the Trojan allowlist of an image.
     * @param req DescribeImageVirusWhitelistRequest
     * @return DescribeImageVirusWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageVirusWhitelistResponse DescribeImageVirusWhitelist(DescribeImageVirusWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageVirusWhitelist", DescribeImageVirusWhitelistResponse.class);
    }

    /**
     *Queries the detailed information of the Trojan allowlist of an image.
     * @param req DescribeImageVirusWhitelistDetailRequest
     * @return DescribeImageVirusWhitelistDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageVirusWhitelistDetailResponse DescribeImageVirusWhitelistDetail(DescribeImageVirusWhitelistDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageVirusWhitelistDetail", DescribeImageVirusWhitelistDetailResponse.class);
    }

    /**
     *This API is used to query the image vulnerability list.
     * @param req DescribeImageVulListRequest
     * @return DescribeImageVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageVulListResponse DescribeImageVulList(DescribeImageVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageVulList", DescribeImageVulListResponse.class);
    }

    /**
     *Queries the image vulnerability overview list
     * @param req DescribeImageVulSummaryListRequest
     * @return DescribeImageVulSummaryListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageVulSummaryListResponse DescribeImageVulSummaryList(DescribeImageVulSummaryListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageVulSummaryList", DescribeImageVulSummaryListResponse.class);
    }

    /**
     *This API is used to query the vulnerability allowlist of a container image.
     * @param req DescribeImageVulWhitelistRequest
     * @return DescribeImageVulWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageVulWhitelistResponse DescribeImageVulWhitelist(DescribeImageVulWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageVulWhitelist", DescribeImageVulWhitelistResponse.class);
    }

    /**
     *Query the details of a single Windows KB patch based on the user's input KB internal ID, and return the basic KB info, release time, whether restart is required, as well as the list of vulnerabilities associated with the KB.
     * @param req DescribeKBDetailRequest
     * @return DescribeKBDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBDetailResponse DescribeKBDetail(DescribeKBDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKBDetail", DescribeKBDetailResponse.class);
    }

    /**
     *Query the list of hosts that can update a specified KB patch. This API is used for Windows patch repair scenarios to query which hosts lack the patch and support auto-update before user-submitted KB patch update tasks.
     * @param req DescribeKBUpdatableMachineListRequest
     * @return DescribeKBUpdatableMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKBUpdatableMachineListResponse DescribeKBUpdatableMachineList(DescribeKBUpdatableMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKBUpdatableMachineList", DescribeKBUpdatableMachineListResponse.class);
    }

    /**
     *This API is used to query credential details and return credential metadata and masked credential data. The access type returns an Access array (original Key, masked Value), and the sts type returns an STS object (original System, masked SecretID and SecretKey).
     * @param req DescribeKeySandboxCredentialRequest
     * @return DescribeKeySandboxCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeySandboxCredentialResponse DescribeKeySandboxCredential(DescribeKeySandboxCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeySandboxCredential", DescribeKeySandboxCredentialResponse.class);
    }

    /**
     *Query the voucher list.
     * @param req DescribeKeySandboxCredentialListRequest
     * @return DescribeKeySandboxCredentialListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKeySandboxCredentialListResponse DescribeKeySandboxCredentialList(DescribeKeySandboxCredentialListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKeySandboxCredentialList", DescribeKeySandboxCredentialListResponse.class);
    }

    /**
     *Get last check-now task info
     * @param req DescribeLastScanTaskInfoRequest
     * @return DescribeLastScanTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLastScanTaskInfoResponse DescribeLastScanTaskInfo(DescribeLastScanTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLastScanTaskInfo", DescribeLastScanTaskInfoResponse.class);
    }

    /**
     *Queries the overall status of all valid authorizations under the current account, returns total count, used, remaining, and expiry time grouped by billing item, and also returns the auto-purchase switch status and merged remaining unbind count. The output sequence is fixed as: flagship edition → pro edition → RASP → other.
     * @param req DescribeLicenseStatusRequest
     * @return DescribeLicenseStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLicenseStatusResponse DescribeLicenseStatus(DescribeLicenseStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLicenseStatus", DescribeLicenseStatusResponse.class);
    }

    /**
     *Query the firewall rules of a lightweight application server
     * @param req DescribeLighthouseFirewallRulesRequest
     * @return DescribeLighthouseFirewallRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLighthouseFirewallRulesResponse DescribeLighthouseFirewallRules(DescribeLighthouseFirewallRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLighthouseFirewallRules", DescribeLighthouseFirewallRulesResponse.class);
    }

    /**
     *Query CLB Listener List
     * @param req DescribeListenerListRequest
     * @return DescribeListenerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerListResponse DescribeListenerList(DescribeListenerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerList", DescribeListenerListResponse.class);
    }

    /**
     *This API is used to obtain the global configuration for anti-uninstallation.
     * @param req DescribeLoginTypeGlobalConfRequest
     * @return DescribeLoginTypeGlobalConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginTypeGlobalConfResponse DescribeLoginTypeGlobalConf(DescribeLoginTypeGlobalConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginTypeGlobalConf", DescribeLoginTypeGlobalConfResponse.class);
    }

    /**
     *Get the host list for QR code log-in
     * @param req DescribeLoginTypeHostRequest
     * @return DescribeLoginTypeHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoginTypeHostResponse DescribeLoginTypeHost(DescribeLoginTypeHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoginTypeHost", DescribeLoginTypeHostResponse.class);
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
     *This API is used to obtain the host login method.
     * @param req DescribeMachineLoginTypeRequest
     * @return DescribeMachineLoginTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineLoginTypeResponse DescribeMachineLoginType(DescribeMachineLoginTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineLoginType", DescribeMachineLoginTypeResponse.class);
    }

    /**
     *This API is used to query the scheduled scan configuration for file scan and removal.
     * @param req DescribeMalwareTimingScanSettingRequest
     * @return DescribeMalwareTimingScanSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMalwareTimingScanSettingResponse DescribeMalwareTimingScanSetting(DescribeMalwareTimingScanSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMalwareTimingScanSetting", DescribeMalwareTimingScanSettingResponse.class);
    }

    /**
     *Show mandatory vulnerability intelligence for businesses.
     * @param req DescribeMandatoryVulSetRequest
     * @return DescribeMandatoryVulSetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMandatoryVulSetResponse DescribeMandatoryVulSet(DescribeMandatoryVulSetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMandatoryVulSet", DescribeMandatoryVulSetResponse.class);
    }

    /**
     *This API is used to obtain a list of batch tasks for modification of host login methods.
     * @param req DescribeModifyMachinesLoginTypeTasksRequest
     * @return DescribeModifyMachinesLoginTypeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModifyMachinesLoginTypeTasksResponse DescribeModifyMachinesLoginTypeTasks(DescribeModifyMachinesLoginTypeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModifyMachinesLoginTypeTasks", DescribeModifyMachinesLoginTypeTasksResponse.class);
    }

    /**
     *Retrieve the total number of assets integrated across multiple clouds (Tencent Cloud, Alibaba Cloud, AWS, Huawei Cloud, Azure, etc.) and the details of asset counts for each cloud service provider.
     * @param req DescribeMultiCloudAssetCountRequest
     * @return DescribeMultiCloudAssetCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiCloudAssetCountResponse DescribeMultiCloudAssetCount(DescribeMultiCloudAssetCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMultiCloudAssetCount", DescribeMultiCloudAssetCountResponse.class);
    }

    /**
     *This API is used to obtain the global configuration for NFS scanning.
     * @param req DescribeNFSScanConfRequest
     * @return DescribeNFSScanConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNFSScanConfResponse DescribeNFSScanConf(DescribeNFSScanConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNFSScanConf", DescribeNFSScanConfResponse.class);
    }

    /**
     *This API is used to query the host list for QR code log-in.
     * @param req DescribeNFSScanHostRequest
     * @return DescribeNFSScanHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNFSScanHostResponse DescribeNFSScanHost(DescribeNFSScanHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNFSScanHost", DescribeNFSScanHostResponse.class);
    }

    /**
     *Obtain Network Interface Card List
     * @param req DescribeNICAssetsRequest
     * @return DescribeNICAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNICAssetsResponse DescribeNICAssets(DescribeNICAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNICAssets", DescribeNICAssetsResponse.class);
    }

    /**
     *Query the nat policy corresponding to a Tencent Cloud nat gateway instance
     * @param req DescribeNatRulesRequest
     * @return DescribeNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatRulesResponse DescribeNatRules(DescribeNatRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatRules", DescribeNatRulesResponse.class);
    }

    /**
     *Query the cyber attack detection switch and asset scope configuration
     * @param req DescribeNetAttackSettingRequest
     * @return DescribeNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetAttackSettingResponse DescribeNetAttackSetting(DescribeNetAttackSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetAttackSetting", DescribeNetAttackSettingResponse.class);
    }

    /**
     *Query client offline duration
     * @param req DescribeNotifyAgentOfflineDurationRequest
     * @return DescribeNotifyAgentOfflineDurationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotifyAgentOfflineDurationResponse DescribeNotifyAgentOfflineDuration(DescribeNotifyAgentOfflineDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotifyAgentOfflineDuration", DescribeNotifyAgentOfflineDurationResponse.class);
    }

    /**
     *Get the notification asset scope configuration.
     * @param req DescribeNotifyAssetConfigRequest
     * @return DescribeNotifyAssetConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotifyAssetConfigResponse DescribeNotifyAssetConfig(DescribeNotifyAssetConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotifyAssetConfig", DescribeNotifyAssetConfigResponse.class);
    }

    /**
     *Get notification settings
     * @param req DescribeNotifySettingRequest
     * @return DescribeNotifySettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotifySettingResponse DescribeNotifySetting(DescribeNotifySettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotifySetting", DescribeNotifySettingResponse.class);
    }

    /**
     *Gets notification settings for risk governance.
     * @param req DescribeNotifySettingAkRequest
     * @return DescribeNotifySettingAkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotifySettingAkResponse DescribeNotifySettingAk(DescribeNotifySettingAkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotifySettingAk", DescribeNotifySettingAkResponse.class);
    }

    /**
     *This API is used to obtain advanced configurations for alarm center notifications.
     * @param req DescribeNotifySettingAlertRequest
     * @return DescribeNotifySettingAlertResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotifySettingAlertResponse DescribeNotifySettingAlert(DescribeNotifySettingAlertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotifySettingAlert", DescribeNotifySettingAlertResponse.class);
    }

    /**
     *Query Group Account Details
     * @param req DescribeOrganizationInfoRequest
     * @return DescribeOrganizationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationInfoResponse DescribeOrganizationInfo(DescribeOrganizationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationInfo", DescribeOrganizationInfoResponse.class);
    }

    /**
     *Query Group Account User List
     * @param req DescribeOrganizationUserInfoRequest
     * @return DescribeOrganizationUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationUserInfoResponse DescribeOrganizationUserInfo(DescribeOrganizationUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationUserInfo", DescribeOrganizationUserInfoResponse.class);
    }

    /**
     *Asset list
     * @param req DescribeOtherCloudAssetsRequest
     * @return DescribeOtherCloudAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOtherCloudAssetsResponse DescribeOtherCloudAssets(DescribeOtherCloudAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOtherCloudAssets", DescribeOtherCloudAssetsResponse.class);
    }

    /**
     *Query the container list associated with a Pod
     * @param req DescribePodContainerListRequest
     * @return DescribePodContainerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePodContainerListResponse DescribePodContainerList(DescribePodContainerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePodContainerList", DescribePodContainerListResponse.class);
    }

    /**
     *Port detection list
     * @param req DescribePortDetectListRequest
     * @return DescribePortDetectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePortDetectListResponse DescribePortDetectList(DescribePortDetectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePortDetectList", DescribePortDetectListResponse.class);
    }

    /**
     *Query the number of port scanning tasks under the current account.
     * @param req DescribePortScanTaskCountRequest
     * @return DescribePortScanTaskCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribePortScanTaskCountResponse DescribePortScanTaskCount(DescribePortScanTaskCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePortScanTaskCount", DescribePortScanTaskCountResponse.class);
    }

    /**
     *This API is used to obtain the global configuration for anti-uninstallation.
     * @param req DescribePreventUninstallGlobalConfRequest
     * @return DescribePreventUninstallGlobalConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribePreventUninstallGlobalConfResponse DescribePreventUninstallGlobalConf(DescribePreventUninstallGlobalConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePreventUninstallGlobalConf", DescribePreventUninstallGlobalConfResponse.class);
    }

    /**
     *Retrieve the host list for uninstallation prevention.
     * @param req DescribePreventUninstallHostRequest
     * @return DescribePreventUninstallHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribePreventUninstallHostResponse DescribePreventUninstallHost(DescribePreventUninstallHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePreventUninstallHost", DescribePreventUninstallHostResponse.class);
    }

    /**
     *Obtain the global configuration for process protection.
     * @param req DescribeProcessDaemonGlobalConfRequest
     * @return DescribeProcessDaemonGlobalConfResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessDaemonGlobalConfResponse DescribeProcessDaemonGlobalConf(DescribeProcessDaemonGlobalConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcessDaemonGlobalConf", DescribeProcessDaemonGlobalConfResponse.class);
    }

    /**
     *Get the process daemon host list.
     * @param req DescribeProcessDaemonHostRequest
     * @return DescribeProcessDaemonHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProcessDaemonHostResponse DescribeProcessDaemonHost(DescribeProcessDaemonHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProcessDaemonHost", DescribeProcessDaemonHostResponse.class);
    }

    /**
     *Public network asset
     * @param req DescribePublicCloudAssetsRequest
     * @return DescribePublicCloudAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicCloudAssetsResponse DescribePublicCloudAssets(DescribePublicCloudAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicCloudAssets", DescribePublicCloudAssetsResponse.class);
    }

    /**
     *IP Public Network List
     * @param req DescribePublicIpAssetsRequest
     * @return DescribePublicIpAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicIpAssetsResponse DescribePublicIpAssets(DescribePublicIpAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicIpAssets", DescribePublicIpAssetsResponse.class);
    }

    /**
     *This API is used to query the authorization list for application protection.
     * @param req DescribeRaspLicenseListRequest
     * @return DescribeRaspLicenseListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRaspLicenseListResponse DescribeRaspLicenseList(DescribeRaspLicenseListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRaspLicenseList", DescribeRaspLicenseListResponse.class);
    }

    /**
     *Query repository overview
     * @param req DescribeRegistryOverviewRequest
     * @return DescribeRegistryOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegistryOverviewResponse DescribeRegistryOverview(DescribeRegistryOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegistryOverview", DescribeRegistryOverviewResponse.class);
    }

    /**
     *Queries the region list of an image repository.
     * @param req DescribeRegistryRegionListRequest
     * @return DescribeRegistryRegionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegistryRegionListResponse DescribeRegistryRegionList(DescribeRegistryRegionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegistryRegionList", DescribeRegistryRegionListResponse.class);
    }

    /**
     *Repository Image List
     * @param req DescribeRepositoryImageAssetsRequest
     * @return DescribeRepositoryImageAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryImageAssetsResponse DescribeRepositoryImageAssets(DescribeRepositoryImageAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepositoryImageAssets", DescribeRepositoryImageAssetsResponse.class);
    }

    /**
     *This API is used to query the intranet alert and asset scope configuration for rebound Shell.
     * @param req DescribeReverseShellSystemPolicyConfigRequest
     * @return DescribeReverseShellSystemPolicyConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReverseShellSystemPolicyConfigResponse DescribeReverseShellSystemPolicyConfig(DescribeReverseShellSystemPolicyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReverseShellSystemPolicyConfig", DescribeReverseShellSystemPolicyConfigResponse.class);
    }

    /**
     *This API is used to obtain the risk call record list.
     * @param req DescribeRiskCallRecordRequest
     * @return DescribeRiskCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCallRecordResponse DescribeRiskCallRecord(DescribeRiskCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCallRecord", DescribeRiskCallRecordResponse.class);
    }

    /**
     *Obtain Configuration Risk List from Asset's Perspective
     * @param req DescribeRiskCenterAssetViewCFGRiskListRequest
     * @return DescribeRiskCenterAssetViewCFGRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewCFGRiskListResponse DescribeRiskCenterAssetViewCFGRiskList(DescribeRiskCenterAssetViewCFGRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewCFGRiskList", DescribeRiskCenterAssetViewCFGRiskListResponse.class);
    }

    /**
     *Obtain Port Risk List from Asset's Perspective
     * @param req DescribeRiskCenterAssetViewPortRiskListRequest
     * @return DescribeRiskCenterAssetViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewPortRiskListResponse DescribeRiskCenterAssetViewPortRiskList(DescribeRiskCenterAssetViewPortRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewPortRiskList", DescribeRiskCenterAssetViewPortRiskListResponse.class);
    }

    /**
     *Obtain Vulnerability Risk List from Asset's Perspective
     * @param req DescribeRiskCenterAssetViewVULRiskListRequest
     * @return DescribeRiskCenterAssetViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewVULRiskListResponse DescribeRiskCenterAssetViewVULRiskList(DescribeRiskCenterAssetViewVULRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewVULRiskList", DescribeRiskCenterAssetViewVULRiskListResponse.class);
    }

    /**
     *Obtain Weak Password Risk List from Asset's Perspective
     * @param req DescribeRiskCenterAssetViewWeakPasswordRiskListRequest
     * @return DescribeRiskCenterAssetViewWeakPasswordRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewWeakPasswordRiskListResponse DescribeRiskCenterAssetViewWeakPasswordRiskList(DescribeRiskCenterAssetViewWeakPasswordRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewWeakPasswordRiskList", DescribeRiskCenterAssetViewWeakPasswordRiskListResponse.class);
    }

    /**
     *Obtain Configuration Risk List from Configuration's Perspective
     * @param req DescribeRiskCenterCFGViewCFGRiskListRequest
     * @return DescribeRiskCenterCFGViewCFGRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterCFGViewCFGRiskListResponse DescribeRiskCenterCFGViewCFGRiskList(DescribeRiskCenterCFGViewCFGRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterCFGViewCFGRiskList", DescribeRiskCenterCFGViewCFGRiskListResponse.class);
    }

    /**
     *Obtain Port Risk List from Port's Perspective
     * @param req DescribeRiskCenterPortViewPortRiskListRequest
     * @return DescribeRiskCenterPortViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterPortViewPortRiskListResponse DescribeRiskCenterPortViewPortRiskList(DescribeRiskCenterPortViewPortRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterPortViewPortRiskList", DescribeRiskCenterPortViewPortRiskListResponse.class);
    }

    /**
     *Sample code for obtaining risk trend analysis
     * @param req DescribeRiskCenterRiskTrendAnalysisRequest
     * @return DescribeRiskCenterRiskTrendAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterRiskTrendAnalysisResponse DescribeRiskCenterRiskTrendAnalysis(DescribeRiskCenterRiskTrendAnalysisRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterRiskTrendAnalysis", DescribeRiskCenterRiskTrendAnalysisResponse.class);
    }

    /**
     *Obtain Risk Service List
     * @param req DescribeRiskCenterServerRiskListRequest
     * @return DescribeRiskCenterServerRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterServerRiskListResponse DescribeRiskCenterServerRiskList(DescribeRiskCenterServerRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterServerRiskList", DescribeRiskCenterServerRiskListResponse.class);
    }

    /**
     *Obtain Vulnerability Risk List from Vulnerability's Perspective
     * @param req DescribeRiskCenterVULViewVULRiskListRequest
     * @return DescribeRiskCenterVULViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterVULViewVULRiskListResponse DescribeRiskCenterVULViewVULRiskList(DescribeRiskCenterVULViewVULRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterVULViewVULRiskList", DescribeRiskCenterVULViewVULRiskListResponse.class);
    }

    /**
     *Obtain Content Risk List
     * @param req DescribeRiskCenterWebsiteRiskListRequest
     * @return DescribeRiskCenterWebsiteRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterWebsiteRiskListResponse DescribeRiskCenterWebsiteRiskList(DescribeRiskCenterWebsiteRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterWebsiteRiskList", DescribeRiskCenterWebsiteRiskListResponse.class);
    }

    /**
     *Sample risk detail list
     * @param req DescribeRiskDetailListRequest
     * @return DescribeRiskDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDetailListResponse DescribeRiskDetailList(DescribeRiskDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDetailList", DescribeRiskDetailListResponse.class);
    }

    /**
     *Sample code for querying risk rule details
     * @param req DescribeRiskRuleDetailRequest
     * @return DescribeRiskRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskRuleDetailResponse DescribeRiskRuleDetail(DescribeRiskRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskRuleDetail", DescribeRiskRuleDetailResponse.class);
    }

    /**
     *Illustrative example of the advanced configuration risk rule list
     * @param req DescribeRiskRulesRequest
     * @return DescribeRiskRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskRulesResponse DescribeRiskRules(DescribeRiskRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskRules", DescribeRiskRulesResponse.class);
    }

    /**
     *Get the periodic schedule for risk scans
     * @param req DescribeRiskScanCronConfigRequest
     * @return DescribeRiskScanCronConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskScanCronConfigResponse DescribeRiskScanCronConfig(DescribeRiskScanCronConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskScanCronConfig", DescribeRiskScanCronConfigResponse.class);
    }

    /**
     *Queries the alias list of a specified SCF function.
     * @param req DescribeSCFAliasListRequest
     * @return DescribeSCFAliasListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSCFAliasListResponse DescribeSCFAliasList(DescribeSCFAliasListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSCFAliasList", DescribeSCFAliasListResponse.class);
    }

    /**
     *Query the list of SCF functions in the specified namespace. Only functions of the Event trigger type are returned.
     * @param req DescribeSCFFunctionListRequest
     * @return DescribeSCFFunctionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSCFFunctionListResponse DescribeSCFFunctionList(DescribeSCFFunctionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSCFFunctionList", DescribeSCFFunctionListResponse.class);
    }

    /**
     *Queries the version list of a specified SCF function.
     * @param req DescribeSCFFunctionVersionListRequest
     * @return DescribeSCFFunctionVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSCFFunctionVersionListResponse DescribeSCFFunctionVersionList(DescribeSCFFunctionVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSCFFunctionVersionList", DescribeSCFFunctionVersionListResponse.class);
    }

    /**
     *Queries the namespace list of SCF in the designated region for the current user.
     * @param req DescribeSCFNamespaceListRequest
     * @return DescribeSCFNamespaceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSCFNamespaceListResponse DescribeSCFNamespaceList(DescribeSCFNamespaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSCFNamespaceList", DescribeSCFNamespaceListResponse.class);
    }

    /**
     *This API is used to query the ACL access control alarm log list by paging. It supports precise filtering of a single alarm by Filter.Name=ID for the details page scenario.
     * @param req DescribeSandboxACLAlertListRequest
     * @return DescribeSandboxACLAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxACLAlertListResponse DescribeSandboxACLAlertList(DescribeSandboxACLAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxACLAlertList", DescribeSandboxACLAlertListResponse.class);
    }

    /**
     *This API is used to query the access control rule list for ACL users under the current tenant. Import Filter.Name=RuleID to query an individual rule precisely.
     * @param req DescribeSandboxACLRuleListRequest
     * @return DescribeSandboxACLRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxACLRuleListResponse DescribeSandboxACLRuleList(DescribeSandboxACLRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxACLRuleList", DescribeSandboxACLRuleListResponse.class);
    }

    /**
     *Queries the traffic sandbox access control (ACL) system rule list. System rules are built into the CSIP platform and can be referenced by user rules.
     * @param req DescribeSandboxACLSystemRuleListRequest
     * @return DescribeSandboxACLSystemRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxACLSystemRuleListResponse DescribeSandboxACLSystemRuleList(DescribeSandboxACLSystemRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxACLSystemRuleList", DescribeSandboxACLSystemRuleListResponse.class);
    }

    /**
     *Paging query for the DLP data leakage alert log list. Supports precise filtering of a single alert by Filter.Name=ID for the details page scenario.
     * @param req DescribeSandboxDLPAlertListRequest
     * @return DescribeSandboxDLPAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxDLPAlertListResponse DescribeSandboxDLPAlertList(DescribeSandboxDLPAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxDLPAlertList", DescribeSandboxDLPAlertListResponse.class);
    }

    /**
     *Query the DLP user rule list of the current tenant. Input Filter.Name=RuleID to query an individual rule for the details page scenario.
     * @param req DescribeSandboxDLPRuleListRequest
     * @return DescribeSandboxDLPRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxDLPRuleListResponse DescribeSandboxDLPRuleList(DescribeSandboxDLPRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxDLPRuleList", DescribeSandboxDLPRuleListResponse.class);
    }

    /**
     *Queries the traffic sandbox data leakage protection (DLP) system rule list. System rules are built into the CSIP platform and can be referenced by user rules.
     * @param req DescribeSandboxDLPSystemRuleListRequest
     * @return DescribeSandboxDLPSystemRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxDLPSystemRuleListResponse DescribeSandboxDLPSystemRuleList(DescribeSandboxDLPSystemRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxDLPSystemRuleList", DescribeSandboxDLPSystemRuleListResponse.class);
    }

    /**
     *Query the command sandbox file rule list.
     * @param req DescribeSandboxFileRuleListRequest
     * @return DescribeSandboxFileRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxFileRuleListResponse DescribeSandboxFileRuleList(DescribeSandboxFileRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxFileRuleList", DescribeSandboxFileRuleListResponse.class);
    }

    /**
     *Paging query for the LLM audit alarm log list. Supports precise filtering of a single alarm by Filter.Name=ID for the details page scenario.
     * @param req DescribeSandboxLLMAuditAlertListRequest
     * @return DescribeSandboxLLMAuditAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxLLMAuditAlertListResponse DescribeSandboxLLMAuditAlertList(DescribeSandboxLLMAuditAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxLLMAuditAlertList", DescribeSandboxLLMAuditAlertListResponse.class);
    }

    /**
     *Queries the LLM audit user rule list for the current tenant. LLM audit rules do not support user-defined content and can only refer to system rule composites. Import Filter.Name=RuleID for exact querying of an individual rule (for details page scenarios).
     * @param req DescribeSandboxLLMAuditRuleListRequest
     * @return DescribeSandboxLLMAuditRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxLLMAuditRuleListResponse DescribeSandboxLLMAuditRuleList(DescribeSandboxLLMAuditRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxLLMAuditRuleList", DescribeSandboxLLMAuditRuleListResponse.class);
    }

    /**
     *This API is used to query the rule list of the LLM audit system. System rules are built into the CSIP platform and originate from the LLM audit system rule base. They are split into two flat rule arrays by LLM reasoning protection and ToolCall protection and can be referenced by user rules.
     * @param req DescribeSandboxLLMAuditSystemRuleListRequest
     * @return DescribeSandboxLLMAuditSystemRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSandboxLLMAuditSystemRuleListResponse DescribeSandboxLLMAuditSystemRuleList(DescribeSandboxLLMAuditSystemRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSandboxLLMAuditSystemRuleList", DescribeSandboxLLMAuditSystemRuleListResponse.class);
    }

    /**
     *Obtain Scan Report List
     * @param req DescribeScanReportListRequest
     * @return DescribeScanReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanReportListResponse DescribeScanReportList(DescribeScanReportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanReportList", DescribeScanReportListResponse.class);
    }

    /**
     *This API is used to query result statistics of cloud boundary analysis scans.
     * @param req DescribeScanStatisticRequest
     * @return DescribeScanStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanStatisticResponse DescribeScanStatistic(DescribeScanStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanStatistic", DescribeScanStatisticResponse.class);
    }

    /**
     *Obtain Scan Task List
     * @param req DescribeScanTaskListRequest
     * @return DescribeScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskListResponse DescribeScanTaskList(DescribeScanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskList", DescribeScanTaskListResponse.class);
    }

    /**
     *This API is used to query the scan task record list.
     * @param req DescribeScanTaskRecordListRequest
     * @return DescribeScanTaskRecordListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskRecordListResponse DescribeScanTaskRecordList(DescribeScanTaskRecordListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskRecordList", DescribeScanTaskRecordListResponse.class);
    }

    /**
     *Query the list of custom domain name endpoints for Tencent Cloud SCF
     * @param req DescribeScfCustomDomainEndpointsRequest
     * @return DescribeScfCustomDomainEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScfCustomDomainEndpointsResponse DescribeScfCustomDomainEndpoints(DescribeScfCustomDomainEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScfCustomDomainEndpoints", DescribeScfCustomDomainEndpointsResponse.class);
    }

    /**
     *Query vulnerability information in the three-dimensional protection center.
     * @param req DescribeSearchBugInfoRequest
     * @return DescribeSearchBugInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchBugInfoResponse DescribeSearchBugInfo(DescribeSearchBugInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchBugInfo", DescribeSearchBugInfoResponse.class);
    }

    /**
     *Query the security group rules correspond to the specified security group ID.
     * @param req DescribeSecurityGroupPolicyRequest
     * @return DescribeSecurityGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupPolicyResponse DescribeSecurityGroupPolicy(DescribeSecurityGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupPolicy", DescribeSecurityGroupPolicyResponse.class);
    }

    /**
     *This API is used to obtain security risk trends and return the daily number of risks grouped by dimension.
     * @param req DescribeSecurityRiskTrendRequest
     * @return DescribeSecurityRiskTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityRiskTrendResponse DescribeSecurityRiskTrend(DescribeSecurityRiskTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityRiskTrend", DescribeSecurityRiskTrendResponse.class);
    }

    /**
     *This API is used to obtain the security score overview and real-time compute point deductions in each dimension and sub-item.
     * @param req DescribeSecurityScoreOverviewRequest
     * @return DescribeSecurityScoreOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityScoreOverviewResponse DescribeSecurityScoreOverview(DescribeSecurityScoreOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityScoreOverview", DescribeSecurityScoreOverviewResponse.class);
    }

    /**
     *Retrieve the security scoring rules for the current account. If no custom rules exist, return the built-in default.
     * @param req DescribeSecurityScoreRuleRequest
     * @return DescribeSecurityScoreRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityScoreRuleResponse DescribeSecurityScoreRule(DescribeSecurityScoreRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityScoreRule", DescribeSecurityScoreRuleResponse.class);
    }

    /**
     *This API is used to query Skill security detection alarm details, including local alarm information and engine real-time detection data.
     * @param req DescribeSkillScanAlertDetailRequest
     * @return DescribeSkillScanAlertDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillScanAlertDetailResponse DescribeSkillScanAlertDetail(DescribeSkillScanAlertDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillScanAlertDetail", DescribeSkillScanAlertDetailResponse.class);
    }

    /**
     *Queries the Skill security detection alarm list with pagination, filtering, and sorting supported.
     * @param req DescribeSkillScanAlertListRequest
     * @return DescribeSkillScanAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillScanAlertListResponse DescribeSkillScanAlertList(DescribeSkillScanAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillScanAlertList", DescribeSkillScanAlertListResponse.class);
    }

    /**
     *This API is used to query Skill security detection billing information, including order status, total quota, consumed quota, expiration time, and payment mode. If no order exists, zero values are returned (only TimeNow and BetaEndTime). Trial orders are claimed through ModifyTrialStatus(Module=9), and official orders are created through the billing system.
     * @param req DescribeSkillScanPayInfoRequest
     * @return DescribeSkillScanPayInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillScanPayInfoResponse DescribeSkillScanPayInfo(DescribeSkillScanPayInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillScanPayInfo", DescribeSkillScanPayInfoResponse.class);
    }

    /**
     *Queries the security detection result of a skill. After calling CreateSkillScan successfully, use the returned ContentHash + EngineVersion to poll this API to obtain the result. We recommend polling for the first time 5 minutes after a successful upload. If detection is not completed, poll once every 1 minute afterward. The response uses the Status field to distinguish four statuses: detection completed (SUCCESS), detecting (SCANNING), no record (NOT_FOUND), and detection failed (FAILED). Note: Detection results are retained for 90 days. NOT_FOUND will be returned after they expire.
     * @param req DescribeSkillScanResultRequest
     * @return DescribeSkillScanResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillScanResultResponse DescribeSkillScanResult(DescribeSkillScanResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillScanResult", DescribeSkillScanResultResponse.class);
    }

    /**
     *Retrieve the user access key asset list from an IP perspective.
     * @param req DescribeSourceIPAssetRequest
     * @return DescribeSourceIPAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceIPAssetResponse DescribeSourceIPAsset(DescribeSourceIPAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSourceIPAsset", DescribeSourceIPAssetResponse.class);
    }

    /**
     *This API is used to query user access key asset list from source IP perspective.
     * @param req DescribeSourceIPDetailRequest
     * @return DescribeSourceIPDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceIPDetailResponse DescribeSourceIPDetail(DescribeSourceIPDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSourceIPDetail", DescribeSourceIPDetailResponse.class);
    }

    /**
     *Query the sub-account list of a group
     * @param req DescribeSubUserInfoRequest
     * @return DescribeSubUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubUserInfoResponse DescribeSubUserInfo(DescribeSubUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubUserInfo", DescribeSubUserInfoResponse.class);
    }

    /**
     *Obtain Subnet List
     * @param req DescribeSubnetAssetsRequest
     * @return DescribeSubnetAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetAssetsResponse DescribeSubnetAssets(DescribeSubnetAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubnetAssets", DescribeSubnetAssetsResponse.class);
    }

    /**
     *This API is used to obtain the TCR instance list.
     * @param req DescribeTCRInstanceListRequest
     * @return DescribeTCRInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTCRInstanceListResponse DescribeTCRInstanceList(DescribeTCRInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTCRInstanceList", DescribeTCRInstanceListResponse.class);
    }

    /**
     *Tagging policy enforcement asset list
     * @param req DescribeTagRuleAssetsRequest
     * @return DescribeTagRuleAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagRuleAssetsResponse DescribeTagRuleAssets(DescribeTagRuleAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTagRuleAssets", DescribeTagRuleAssetsResponse.class);
    }

    /**
     *Obtain Task Scan Report List
     * @param req DescribeTaskLogListRequest
     * @return DescribeTaskLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogListResponse DescribeTaskLogList(DescribeTaskLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogList", DescribeTaskLogListResponse.class);
    }

    /**
     *Obtain the Temporary Link for Report Download
     * @param req DescribeTaskLogURLRequest
     * @return DescribeTaskLogURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogURLResponse DescribeTaskLogURL(DescribeTaskLogURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogURL", DescribeTaskLogURLResponse.class);
    }

    /**
     *Obtain the pre-consumed quota for scans.
     * @param req DescribeTaskPredictCostQuotaRequest
     * @return DescribeTaskPredictCostQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskPredictCostQuotaResponse DescribeTaskPredictCostQuota(DescribeTaskPredictCostQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskPredictCostQuota", DescribeTaskPredictCostQuotaResponse.class);
    }

    /**
     *Query TOP attack information
     * @param req DescribeTopAttackInfoRequest
     * @return DescribeTopAttackInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopAttackInfoResponse DescribeTopAttackInfo(DescribeTopAttackInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopAttackInfo", DescribeTopAttackInfoResponse.class);
    }

    /**
     *Queries the behavior overview of user behavior analysis.
     * @param req DescribeUebaBehaviorSummaryRequest
     * @return DescribeUebaBehaviorSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUebaBehaviorSummaryResponse DescribeUebaBehaviorSummary(DescribeUebaBehaviorSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUebaBehaviorSummary", DescribeUebaBehaviorSummaryResponse.class);
    }

    /**
     *Query the list of user behavior analysis policies
     * @param req DescribeUebaRuleRequest
     * @return DescribeUebaRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUebaRuleResponse DescribeUebaRule(DescribeUebaRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUebaRule", DescribeUebaRuleResponse.class);
    }

    /**
     *This API is used to get the user overview of the user behavior analysis module.
     * @param req DescribeUebaUserSummaryRequest
     * @return DescribeUebaUserSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUebaUserSummaryResponse DescribeUebaUserSummary(DescribeUebaUserSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUebaUserSummary", DescribeUebaUserSummaryResponse.class);
    }

    /**
     *Obtain AK information of the account
     * @param req DescribeUserAKInfoListRequest
     * @return DescribeUserAKInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserAKInfoListResponse DescribeUserAKInfoList(DescribeUserAKInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserAKInfoList", DescribeUserAKInfoListResponse.class);
    }

    /**
     *This API is used to obtain CSPM information of an account.
     * @param req DescribeUserCSPMInfoListRequest
     * @return DescribeUserCSPMInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCSPMInfoListResponse DescribeUserCSPMInfoList(DescribeUserCSPMInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserCSPMInfoList", DescribeUserCSPMInfoListResponse.class);
    }

    /**
     *This API is used to obtain the account call record list.
     * @param req DescribeUserCallRecordRequest
     * @return DescribeUserCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCallRecordResponse DescribeUserCallRecord(DescribeUserCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserCallRecord", DescribeUserCallRecordResponse.class);
    }

    /**
     *Get the dspm information list of an account
     * @param req DescribeUserDspmInfoListRequest
     * @return DescribeUserDspmInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDspmInfoListResponse DescribeUserDspmInfoList(DescribeUserDspmInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDspmInfoList", DescribeUserDspmInfoListResponse.class);
    }

    /**
     *CSPM quota information of a user
     * @param req DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInfoResponse DescribeUserInfo(DescribeUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserInfo", DescribeUserInfoResponse.class);
    }

    /**
     *Vulnerability list in the risk center of the new security center
     * @param req DescribeVULListRequest
     * @return DescribeVULListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULListResponse DescribeVULList(DescribeVULListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULList", DescribeVULListResponse.class);
    }

    /**
     *Query Vulnerability Risk Advanced Configuration
     * @param req DescribeVULRiskAdvanceCFGListRequest
     * @return DescribeVULRiskAdvanceCFGListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULRiskAdvanceCFGListResponse DescribeVULRiskAdvanceCFGList(DescribeVULRiskAdvanceCFGListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULRiskAdvanceCFGList", DescribeVULRiskAdvanceCFGListResponse.class);
    }

    /**
     *Retrieve vulnerability details
     * @param req DescribeVULRiskDetailRequest
     * @return DescribeVULRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULRiskDetailResponse DescribeVULRiskDetail(DescribeVULRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULRiskDetail", DescribeVULRiskDetailResponse.class);
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
     *Check whether the current user is eligible to claim vouchers for the designated promotion.
     * @param req DescribeVoucherEligibilityRequest
     * @return DescribeVoucherEligibilityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoucherEligibilityResponse DescribeVoucherEligibility(DescribeVoucherEligibilityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVoucherEligibility", DescribeVoucherEligibilityResponse.class);
    }

    /**
     *Obtain VPC List
     * @param req DescribeVpcAssetsRequest
     * @return DescribeVpcAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcAssetsResponse DescribeVpcAssets(DescribeVpcAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcAssets", DescribeVpcAssetsResponse.class);
    }

    /**
     *This API is used to query the associated server of a vulnerable component.
     * @param req DescribeVulComponentRelateHostRequest
     * @return DescribeVulComponentRelateHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulComponentRelateHostResponse DescribeVulComponentRelateHost(DescribeVulComponentRelateHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulComponentRelateHost", DescribeVulComponentRelateHostResponse.class);
    }

    /**
     *This API is used to query the details of a specified vulnerability repair task, including detailed data such as remediation status and snapshot status for each host, and supports pagination and filtering.
     * @param req DescribeVulFixTaskDetailRequest
     * @return DescribeVulFixTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixTaskDetailResponse DescribeVulFixTaskDetail(DescribeVulFixTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixTaskDetail", DescribeVulFixTaskDetailResponse.class);
    }

    /**
     *This API is used to query the vulnerability repair task record list with paging, support by conditional filtering such as remediation status and time range, and show summary information for each repair task.
     * @param req DescribeVulFixTaskListRequest
     * @return DescribeVulFixTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixTaskListResponse DescribeVulFixTaskList(DescribeVulFixTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixTaskList", DescribeVulFixTaskListResponse.class);
    }

    /**
     *This API is used to query the host list where specified vulnerabilities can be repaired. Before a user submits a repair task, it is necessary to query which hosts support automatic fix, providing data support for users to select repair targets.
     * @param req DescribeVulFixableMachineListRequest
     * @return DescribeVulFixableMachineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixableMachineListResponse DescribeVulFixableMachineList(DescribeVulFixableMachineListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixableMachineList", DescribeVulFixableMachineListResponse.class);
    }

    /**
     *This API is used to query the repair details of a certain fixed vulnerability on a specified host, including basic information about the vulnerability, repair host information, and a detailed list of associated components and paths (component name, version number hit, associated path, repair command).
     * @param req DescribeVulFixedHostDetailRequest
     * @return DescribeVulFixedHostDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixedHostDetailResponse DescribeVulFixedHostDetail(DescribeVulFixedHostDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixedHostDetail", DescribeVulFixedHostDetailResponse.class);
    }

    /**
     *This API is used to query the list of repaired vulnerabilities, show vulnerability information with successful fixes and statistics on repair conditions, helping users understand the repair results.
     * @param req DescribeVulFixedListRequest
     * @return DescribeVulFixedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulFixedListResponse DescribeVulFixedList(DescribeVulFixedListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulFixedList", DescribeVulFixedListResponse.class);
    }

    /**
     *This API is used to query host-associated vulnerability components.
     * @param req DescribeVulHostRelateComponentRequest
     * @return DescribeVulHostRelateComponentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulHostRelateComponentResponse DescribeVulHostRelateComponent(DescribeVulHostRelateComponentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulHostRelateComponent", DescribeVulHostRelateComponentResponse.class);
    }

    /**
     *This API is used to retrieve the vulnerability ignore list.
     * @param req DescribeVulIgnoreRuleListRequest
     * @return DescribeVulIgnoreRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulIgnoreRuleListResponse DescribeVulIgnoreRuleList(DescribeVulIgnoreRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulIgnoreRuleList", DescribeVulIgnoreRuleListResponse.class);
    }

    /**
     *This API is used to obtain vulnerability list
     * @param req DescribeVulItemListRequest
     * @return DescribeVulItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulItemListResponse DescribeVulItemList(DescribeVulItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulItemList", DescribeVulItemListResponse.class);
    }

    /**
     *Obtains the vulnerability tag list
     * @param req DescribeVulLabelListRequest
     * @return DescribeVulLabelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulLabelListResponse DescribeVulLabelList(DescribeVulLabelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulLabelList", DescribeVulLabelListResponse.class);
    }

    /**
     *Query the list of vulnerabilities on host nodes under the exposed path in cloud boundary analysis.
     * @param req DescribeVulRiskListRequest
     * @return DescribeVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulRiskListResponse DescribeVulRiskList(DescribeVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulRiskList", DescribeVulRiskListResponse.class);
    }

    /**
     *Retrieve the associated component of a vulnerability
     * @param req DescribeVulRiskRelateComponentRequest
     * @return DescribeVulRiskRelateComponentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulRiskRelateComponentResponse DescribeVulRiskRelateComponent(DescribeVulRiskRelateComponentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulRiskRelateComponent", DescribeVulRiskRelateComponentResponse.class);
    }

    /**
     *Search for hosts associated with vulnerabilities or KBs
     * @param req DescribeVulRiskRelateHostRequest
     * @return DescribeVulRiskRelateHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulRiskRelateHostResponse DescribeVulRiskRelateHost(DescribeVulRiskRelateHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulRiskRelateHost", DescribeVulRiskRelateHostResponse.class);
    }

    /**
     *This API is used to obtain vulnerability scanning (period scanning).
     * @param req DescribeVulScanPeriodicRequest
     * @return DescribeVulScanPeriodicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanPeriodicResponse DescribeVulScanPeriodic(DescribeVulScanPeriodicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanPeriodic", DescribeVulScanPeriodicResponse.class);
    }

    /**
     *This API is used to retrieve vulnerability scanning task detail
     * @param req DescribeVulScanTaskDetailRequest
     * @return DescribeVulScanTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanTaskDetailResponse DescribeVulScanTaskDetail(DescribeVulScanTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanTaskDetail", DescribeVulScanTaskDetailResponse.class);
    }

    /**
     *This API is used to search vulnerability scanning task history
     * @param req DescribeVulScanTaskListRequest
     * @return DescribeVulScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulScanTaskListResponse DescribeVulScanTaskList(DescribeVulScanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulScanTaskList", DescribeVulScanTaskListResponse.class);
    }

    /**
     *Obtain Vulnerability Risk List from Vulnerability's Perspective
     * @param req DescribeVulViewVulRiskListRequest
     * @return DescribeVulViewVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulViewVulRiskListResponse DescribeVulViewVulRiskList(DescribeVulViewVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulViewVulRiskList", DescribeVulViewVulRiskListResponse.class);
    }

    /**
     *This API is used to query the notification policy list for the current tenant by page, corresponding to the table on the Notification Policy Configuration Tab in Notification Center - Robot Notification. The returned fields are simplified info required for row display. Use DescribeWebhookPolicy for complete configuration in editing scenarios. Each tenant can have up to 100 notification policies.
     * @param req DescribeWebhookPolicyListRequest
     * @return DescribeWebhookPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookPolicyListResponse DescribeWebhookPolicyList(DescribeWebhookPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebhookPolicyList", DescribeWebhookPolicyListResponse.class);
    }

    /**
     *This API is used to query the list of receiving robots for the current tenant by page, corresponding to the table on the Receive Bot Management Tab in Notification Center - Robot Notification. Each tenant can have up to 50 robots.
     * @param req DescribeWebhookReceiverListRequest
     * @return DescribeWebhookReceiverListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebhookReceiverListResponse DescribeWebhookReceiverList(DescribeWebhookReceiverListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWebhookReceiverList", DescribeWebhookReceiverListResponse.class);
    }

    /**
     *Disable scheduled AI tasks.

Set the status of the specified AI scheduled task to disabled. After it is disabled, the task will suspend automatic execution.
     * @param req DisableAIScheduleRequest
     * @return DisableAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public DisableAIScheduleResponse DisableAISchedule(DisableAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableAISchedule", DisableAIScheduleResponse.class);
    }

    /**
     *This API is used to download export logs.
     * @param req DownloadDspmExportLogRequest
     * @return DownloadDspmExportLogResponse
     * @throws TencentCloudSDKException
     */
    public DownloadDspmExportLogResponse DownloadDspmExportLog(DownloadDspmExportLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadDspmExportLog", DownloadDspmExportLogResponse.class);
    }

    /**
     *Enable AI scheduled tasks.

Set the status of the specified AI scheduled task to enabled. After it is enabled, the task will automatically execute based on the trigger configuration.
     * @param req EnableAIScheduleRequest
     * @return EnableAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public EnableAIScheduleResponse EnableAISchedule(EnableAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableAISchedule", EnableAIScheduleResponse.class);
    }

    /**
     *Exports host details of a CSIP scan task to Excel files. This API is used to query the download link through DescribeExportMachines after asynchronous generation.
     * @param req ExportCSIPMalwareScanTaskDetailRequest
     * @return ExportCSIPMalwareScanTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public ExportCSIPMalwareScanTaskDetailResponse ExportCSIPMalwareScanTaskDetail(ExportCSIPMalwareScanTaskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportCSIPMalwareScanTaskDetail", ExportCSIPMalwareScanTaskDetailResponse.class);
    }

    /**
     *Export the host list for client settings.
     * @param req ExportClientSettingHostListRequest
     * @return ExportClientSettingHostListResponse
     * @throws TencentCloudSDKException
     */
    public ExportClientSettingHostListResponse ExportClientSettingHostList(ExportClientSettingHostListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportClientSettingHostList", ExportClientSettingHostListResponse.class);
    }

    /**
     *This API is used to export the EDR policy list.
     * @param req ExportEDRRulesRequest
     * @return ExportEDRRulesResponse
     * @throws TencentCloudSDKException
     */
    public ExportEDRRulesResponse ExportEDRRules(ExportEDRRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExportEDRRules", ExportEDRRulesResponse.class);
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
     *Install Agent for cluster container security (parallel container installation method).

capi layer processing process:
1. Query the DB cluster list by ClusterCaMD5List (only used for resolving the appid ownership of each cluster, not for existence/type verification)
2. Group by appid and pass through to the access side ClusterInstall RPC

Description (container asset revision 2026 H1): This API is a passthrough API. The capi layer does not verify the existence, data type, or format of ClusterCaMD5. ClusterCaMD5 values that miss in the DB are silently skipped with no error reported.
     * @param req InstallClusterAgentRequest
     * @return InstallClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public InstallClusterAgentResponse InstallClusterAgent(InstallClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallClusterAgent", InstallClusterAgentResponse.class);
    }

    /**
     *Install the key sandbox SKILL on specified machine instances. Batch operations are supported, allowing input of multiple instance IDs at once. After installation, the AI Agent on the target machine can access credentials through the key sandbox proxy without being exposed to plaintext keys. Duplicate invocations on installed instances will not trigger an error (idempotent) and are deemed successful.
     * @param req InstallKeySandboxSkillRequest
     * @return InstallKeySandboxSkillResponse
     * @throws TencentCloudSDKException
     */
    public InstallKeySandboxSkillResponse InstallKeySandboxSkill(InstallKeySandboxSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallKeySandboxSkill", InstallKeySandboxSkillResponse.class);
    }

    /**
     *Trigger installation of the traffic sandbox plugin to AI Agent assets in a specified range. Use BelongAssetType to distinguish host or container dimensions, and use EffectScope to specify the installation target (INCLUDE = install only to specified assets, EXCLUDE = all assets minus specified assets). This API only triggers the action and does not wait for completion.
     * @param req InstallSandboxPluginRequest
     * @return InstallSandboxPluginResponse
     * @throws TencentCloudSDKException
     */
    public InstallSandboxPluginResponse InstallSandboxPlugin(InstallSandboxPluginRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallSandboxPlugin", InstallSandboxPluginResponse.class);
    }

    /**
     *Modify the AI-Link engine configuration.
     * @param req ModifyAILinkSettingRequest
     * @return ModifyAILinkSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAILinkSettingResponse ModifyAILinkSetting(ModifyAILinkSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAILinkSetting", ModifyAILinkSettingResponse.class);
    }

    /**
     *Modify a scheduled AI task.

Partial update is supported. Only the passed-in optional fields are updated. Whether the trigger list is fully replaced is controlled by the UpdateTriggers flag.
     * @param req ModifyAIScheduleRequest
     * @return ModifyAIScheduleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAIScheduleResponse ModifyAISchedule(ModifyAIScheduleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAISchedule", ModifyAIScheduleResponse.class);
    }

    /**
     *This API is used to modify client log collection settings exclusive to CSIP. It allows you to set the log collection type and asset scope for which the settings take effect.
     * @param req ModifyAgentConfigSettingRequest
     * @return ModifyAgentConfigSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentConfigSettingResponse ModifyAgentConfigSetting(ModifyAgentConfigSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentConfigSetting", ModifyAgentConfigSettingResponse.class);
    }

    /**
     *Set the client running mode and configuration
     * @param req ModifyAgentRunModeRequest
     * @return ModifyAgentRunModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentRunModeResponse ModifyAgentRunMode(ModifyAgentRunModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentRunMode", ModifyAgentRunModeResponse.class);
    }

    /**
     *Modify the client running policy group. This API is used to set custom policies and associate machine lists.
     * @param req ModifyAgentRunPolicyRequest
     * @return ModifyAgentRunPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAgentRunPolicyResponse ModifyAgentRunPolicy(ModifyAgentRunPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAgentRunPolicy", ModifyAgentRunPolicyResponse.class);
    }

    /**
     *Tag an asset as core or not.
     * @param req ModifyAssetCoreAttributeRequest
     * @return ModifyAssetCoreAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetCoreAttributeResponse ModifyAssetCoreAttribute(ModifyAssetCoreAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetCoreAttribute", ModifyAssetCoreAttributeResponse.class);
    }

    /**
     *Update the asset search view.
     * @param req ModifyAssetFilterViewRequest
     * @return ModifyAssetFilterViewResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetFilterViewResponse ModifyAssetFilterView(ModifyAssetFilterViewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetFilterView", ModifyAssetFilterViewResponse.class);
    }

    /**
     *This API is used to edit asset tags.
     * @param req ModifyAssetTagRequest
     * @return ModifyAssetTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetTagResponse ModifyAssetTag(ModifyAssetTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetTag", ModifyAssetTagResponse.class);
    }

    /**
     *Operate assets to edit tags.
     * @param req ModifyAssetTagsRequest
     * @return ModifyAssetTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetTagsResponse ModifyAssetTags(ModifyAssetTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetTags", ModifyAssetTagsResponse.class);
    }

    /**
     *Operate assets and edit tags.
     * @param req ModifyAssetTagsByAssetInfoRequest
     * @return ModifyAssetTagsByAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetTagsByAssetInfoResponse ModifyAssetTagsByAssetInfo(ModifyAssetTagsByAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetTagsByAssetInfo", ModifyAssetTagsByAssetInfoResponse.class);
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
     *Create or edit a baseline policy. Policy.ID 0 means create, non-zero means edit. Name is required when creating or editing. CheckAssetType and Type must comply with the CheckAssetType and PolicyType enums.
     * @param req ModifyBaselinePolicyRequest
     * @return ModifyBaselinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselinePolicyResponse ModifyBaselinePolicy(ModifyBaselinePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselinePolicy", ModifyBaselinePolicyResponse.class);
    }

    /**
     *Batch enable or disable baseline policies. Once disabled, a policy will no longer be included in scans and statistics.
     * @param req ModifyBaselinePolicyEnableRequest
     * @return ModifyBaselinePolicyEnableResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselinePolicyEnableResponse ModifyBaselinePolicyEnable(ModifyBaselinePolicyEnableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselinePolicyEnable", ModifyBaselinePolicyEnableResponse.class);
    }

    /**
     *This API is used to update the baseline synchronization configuration of the current account (admin). When AutoSync is true, TargetAppidList cannot be empty and its elements cannot be 0.
     * @param req ModifyBaselineSyncConfRequest
     * @return ModifyBaselineSyncConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineSyncConfResponse ModifyBaselineSyncConf(ModifyBaselineSyncConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineSyncConf", ModifyBaselineSyncConfResponse.class);
    }

    /**
     *This API is used to update user-level baseline configurations for the current account, including sync permission, offline risk clearing, and Agent scan timeout.
     * @param req ModifyBaselineUserOtherConfRequest
     * @return ModifyBaselineUserOtherConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineUserOtherConfResponse ModifyBaselineUserOtherConf(ModifyBaselineUserOtherConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineUserOtherConf", ModifyBaselineUserOtherConfResponse.class);
    }

    /**
     *Update the custom "user weak password" dictionary for the current account. The dictionary content is stored after server encryption. Input an empty string to clear it.
     * @param req ModifyBaselineUserWeakPasswordConfRequest
     * @return ModifyBaselineUserWeakPasswordConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBaselineUserWeakPasswordConfResponse ModifyBaselineUserWeakPasswordConf(ModifyBaselineUserWeakPasswordConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBaselineUserWeakPasswordConf", ModifyBaselineUserWeakPasswordConfResponse.class);
    }

    /**
     *This API is used to set the status of brute force attack blocking.
     * @param req ModifyBruteAttackBanStatusRequest
     * @return ModifyBruteAttackBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBruteAttackBanStatusResponse ModifyBruteAttackBanStatus(ModifyBruteAttackBanStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBruteAttackBanStatus", ModifyBruteAttackBanStatusResponse.class);
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
     *Bind host authorization or RASP authorization to a specified order. Execute asynchronously and return TaskId to query progress. Specify the authorized version by LicenseType.
     * @param req ModifyCSIPLicenseBindsRequest
     * @return ModifyCSIPLicenseBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCSIPLicenseBindsResponse ModifyCSIPLicenseBinds(ModifyCSIPLicenseBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCSIPLicenseBinds", ModifyCSIPLicenseBindsResponse.class);
    }

    /**
     *Manually unbind host authorization. Execute synchronously and return results directly. Only unbind host authorization (category=0, including Pro and Ultimate editions). In single order mode, appid can locate the order without the need to pass ResourceId. For RASP unbinding, use ModifyCSIPRaspLicenseUnBinds.
     * @param req ModifyCSIPLicenseUnBindsRequest
     * @return ModifyCSIPLicenseUnBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCSIPLicenseUnBindsResponse ModifyCSIPLicenseUnBinds(ModifyCSIPLicenseUnBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCSIPLicenseUnBinds", ModifyCSIPLicenseUnBindsResponse.class);
    }

    /**
     *Bind RASP or Flagship Edition Authorization to a specified order. Execute asynchronously and return TaskId to query progress. LicenseType=rasp binds RASP, LicenseType=enterprise_hp binds flagship host authorization. AssetType is case-sensitive for host/container node/EKS.
     * @param req ModifyCSIPRaspLicenseBindsRequest
     * @return ModifyCSIPRaspLicenseBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCSIPRaspLicenseBindsResponse ModifyCSIPRaspLicenseBinds(ModifyCSIPRaspLicenseBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCSIPRaspLicenseBinds", ModifyCSIPRaspLicenseBindsResponse.class);
    }

    /**
     *Manually unbind RASP authorization. Execute synchronously and return results directly. Only unbind RASP authorization (category=1), with no unbinding frequency limit. In single order mode, appid can locate the order without the need to pass ResourceId.
     * @param req ModifyCSIPRaspLicenseUnBindsRequest
     * @return ModifyCSIPRaspLicenseUnBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCSIPRaspLicenseUnBindsResponse ModifyCSIPRaspLicenseUnBinds(ModifyCSIPRaspLicenseUnBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCSIPRaspLicenseUnBinds", ModifyCSIPRaspLicenseUnBindsResponse.class);
    }

    /**
     *Modify the cluster protection status.
     * @param req ModifyClusterDefendStatusRequest
     * @return ModifyClusterDefendStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterDefendStatusResponse ModifyClusterDefendStatus(ModifyClusterDefendStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterDefendStatus", ModifyClusterDefendStatusResponse.class);
    }

    /**
     *Modify the bucket monitoring status.
     * @param req ModifyCosAuditBucketMonitorStatusRequest
     * @return ModifyCosAuditBucketMonitorStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCosAuditBucketMonitorStatusResponse ModifyCosAuditBucketMonitorStatus(ModifyCosAuditBucketMonitorStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCosAuditBucketMonitorStatus", ModifyCosAuditBucketMonitorStatusResponse.class);
    }

    /**
     *Updates the CSPM automated quota manager shared switch.
     * @param req ModifyCspmShardConfigRequest
     * @return ModifyCspmShardConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCspmShardConfigResponse ModifyCspmShardConfig(ModifyCspmShardConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCspmShardConfig", ModifyCspmShardConfigResponse.class);
    }

    /**
     *Modify Dspm access management information
     * @param req ModifyDspmAccessRecordRequest
     * @return ModifyDspmAccessRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAccessRecordResponse ModifyDspmAccessRecord(ModifyDspmAccessRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAccessRecord", ModifyDspmAccessRecordResponse.class);
    }

    /**
     *Modifies the data identification template of the current dspm application
     * @param req ModifyDspmApplyingIdentifyComplianceGroupRequest
     * @return ModifyDspmApplyingIdentifyComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmApplyingIdentifyComplianceGroupResponse ModifyDspmApplyingIdentifyComplianceGroup(ModifyDspmApplyingIdentifyComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmApplyingIdentifyComplianceGroup", ModifyDspmApplyingIdentifyComplianceGroupResponse.class);
    }

    /**
     *Modifies the Dspm approval form status.
     * @param req ModifyDspmApproveStatusRequest
     * @return ModifyDspmApproveStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmApproveStatusResponse ModifyDspmApproveStatus(ModifyDspmApproveStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmApproveStatus", ModifyDspmApproveStatusResponse.class);
    }

    /**
     *Modify Dspm asset account information.
     * @param req ModifyDspmAssetAccountRequest
     * @return ModifyDspmAssetAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetAccountResponse ModifyDspmAssetAccount(ModifyDspmAssetAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetAccount", ModifyDspmAssetAccountResponse.class);
    }

    /**
     *Modify Dspm asset account permissions
     * @param req ModifyDspmAssetAccountPrivilegesRequest
     * @return ModifyDspmAssetAccountPrivilegesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetAccountPrivilegesResponse ModifyDspmAssetAccountPrivileges(ModifyDspmAssetAccountPrivilegesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetAccountPrivileges", ModifyDspmAssetAccountPrivilegesResponse.class);
    }

    /**
     *Modifies a Dspm Asset Data scan task
     * @param req ModifyDspmAssetDataScanTaskRequest
     * @return ModifyDspmAssetDataScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetDataScanTaskResponse ModifyDspmAssetDataScanTask(ModifyDspmAssetDataScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetDataScanTask", ModifyDspmAssetDataScanTaskResponse.class);
    }

    /**
     *Modify the status of a Dspm Asset Data scan task
     * @param req ModifyDspmAssetDataScanTaskStatusRequest
     * @return ModifyDspmAssetDataScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetDataScanTaskStatusResponse ModifyDspmAssetDataScanTaskStatus(ModifyDspmAssetDataScanTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetDataScanTaskStatus", ModifyDspmAssetDataScanTaskStatusResponse.class);
    }

    /**
     *Modify the Dspm asset log delivery switch.
     * @param req ModifyDspmAssetLogDeliverySwitchRequest
     * @return ModifyDspmAssetLogDeliverySwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetLogDeliverySwitchResponse ModifyDspmAssetLogDeliverySwitch(ModifyDspmAssetLogDeliverySwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetLogDeliverySwitch", ModifyDspmAssetLogDeliverySwitchResponse.class);
    }

    /**
     *Modify the Dspm asset log delivery switch
     * @param req ModifyDspmAssetSecurityAnalysisSwitchRequest
     * @return ModifyDspmAssetSecurityAnalysisSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAssetSecurityAnalysisSwitchResponse ModifyDspmAssetSecurityAnalysisSwitch(ModifyDspmAssetSecurityAnalysisSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAssetSecurityAnalysisSwitch", ModifyDspmAssetSecurityAnalysisSwitchResponse.class);
    }

    /**
     *Modify a Dspm audit filter policy
     * @param req ModifyDspmAuditFilterStrategyRequest
     * @return ModifyDspmAuditFilterStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmAuditFilterStrategyResponse ModifyDspmAuditFilterStrategy(ModifyDspmAuditFilterStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmAuditFilterStrategy", ModifyDspmAuditFilterStrategyResponse.class);
    }

    /**
     *This API is used to modify the log backup settings.
     * @param req ModifyDspmBackupSettingRequest
     * @return ModifyDspmBackupSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmBackupSettingResponse ModifyDspmBackupSetting(ModifyDspmBackupSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmBackupSetting", ModifyDspmBackupSettingResponse.class);
    }

    /**
     *This API is used to save the tenant CKafka configuration.
     * @param req ModifyDspmCkafkaSaveRequest
     * @return ModifyDspmCkafkaSaveResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmCkafkaSaveResponse ModifyDspmCkafkaSave(ModifyDspmCkafkaSaveRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmCkafkaSave", ModifyDspmCkafkaSaveResponse.class);
    }

    /**
     *This API is used to enable the log shipping.
     * @param req ModifyDspmCkafkaStartRequest
     * @return ModifyDspmCkafkaStartResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmCkafkaStartResponse ModifyDspmCkafkaStart(ModifyDspmCkafkaStartRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmCkafkaStart", ModifyDspmCkafkaStartResponse.class);
    }

    /**
     *This API is used to disable the log type shipping.
     * @param req ModifyDspmCkafkaStopRequest
     * @return ModifyDspmCkafkaStopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmCkafkaStopResponse ModifyDspmCkafkaStop(ModifyDspmCkafkaStopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmCkafkaStop", ModifyDspmCkafkaStopResponse.class);
    }

    /**
     *Modifies dspm data identification categorization
     * @param req ModifyDspmIdentifyCategoryRequest
     * @return ModifyDspmIdentifyCategoryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyCategoryResponse ModifyDspmIdentifyCategory(ModifyDspmIdentifyCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyCategory", ModifyDspmIdentifyCategoryResponse.class);
    }

    /**
     *Modifies a dspm data identification template
     * @param req ModifyDspmIdentifyComplianceGroupRequest
     * @return ModifyDspmIdentifyComplianceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyComplianceGroupResponse ModifyDspmIdentifyComplianceGroup(ModifyDspmIdentifyComplianceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyComplianceGroup", ModifyDspmIdentifyComplianceGroupResponse.class);
    }

    /**
     *Modifies the status of a dspm data identification template
     * @param req ModifyDspmIdentifyComplianceGroupStatusRequest
     * @return ModifyDspmIdentifyComplianceGroupStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyComplianceGroupStatusResponse ModifyDspmIdentifyComplianceGroupStatus(ModifyDspmIdentifyComplianceGroupStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyComplianceGroupStatus", ModifyDspmIdentifyComplianceGroupStatusResponse.class);
    }

    /**
     *This API is used to modify association level information of dspm data identification template data items.
     * @param req ModifyDspmIdentifyComplianceRuleLevelInfoRequest
     * @return ModifyDspmIdentifyComplianceRuleLevelInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyComplianceRuleLevelInfoResponse ModifyDspmIdentifyComplianceRuleLevelInfo(ModifyDspmIdentifyComplianceRuleLevelInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyComplianceRuleLevelInfo", ModifyDspmIdentifyComplianceRuleLevelInfoResponse.class);
    }

    /**
     *Modify Dspm identity information.
     * @param req ModifyDspmIdentifyInfoRequest
     * @return ModifyDspmIdentifyInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyInfoResponse ModifyDspmIdentifyInfo(ModifyDspmIdentifyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyInfo", ModifyDspmIdentifyInfoResponse.class);
    }

    /**
     *Modifies dspm data identification classification groups
     * @param req ModifyDspmIdentifyLevelGroupRequest
     * @return ModifyDspmIdentifyLevelGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyLevelGroupResponse ModifyDspmIdentifyLevelGroup(ModifyDspmIdentifyLevelGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyLevelGroup", ModifyDspmIdentifyLevelGroupResponse.class);
    }

    /**
     *Modify dspm data identification grading information.
     * @param req ModifyDspmIdentifyLevelItemRequest
     * @return ModifyDspmIdentifyLevelItemResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyLevelItemResponse ModifyDspmIdentifyLevelItem(ModifyDspmIdentifyLevelItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyLevelItem", ModifyDspmIdentifyLevelItemResponse.class);
    }

    /**
     *Modify a dspm identification data item
     * @param req ModifyDspmIdentifyRuleRequest
     * @return ModifyDspmIdentifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyRuleResponse ModifyDspmIdentifyRule(ModifyDspmIdentifyRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyRule", ModifyDspmIdentifyRuleResponse.class);
    }

    /**
     *Modifies the status of a dspm identification data item
     * @param req ModifyDspmIdentifyRuleStatusRequest
     * @return ModifyDspmIdentifyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIdentifyRuleStatusResponse ModifyDspmIdentifyRuleStatus(ModifyDspmIdentifyRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIdentifyRuleStatus", ModifyDspmIdentifyRuleStatusResponse.class);
    }

    /**
     *Modify DspmIp information.
     * @param req ModifyDspmIpInfoRequest
     * @return ModifyDspmIpInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmIpInfoResponse ModifyDspmIpInfo(ModifyDspmIpInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmIpInfo", ModifyDspmIpInfoResponse.class);
    }

    /**
     *This API is used to modify the log shipping configuration information.
     * @param req ModifyDspmLogDeliveryTypeRequest
     * @return ModifyDspmLogDeliveryTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmLogDeliveryTypeResponse ModifyDspmLogDeliveryType(ModifyDspmLogDeliveryTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmLogDeliveryType", ModifyDspmLogDeliveryTypeResponse.class);
    }

    /**
     *Modifies the Dspm personal identity ID.
     * @param req ModifyDspmPersonalIdentifyRequest
     * @return ModifyDspmPersonalIdentifyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmPersonalIdentifyResponse ModifyDspmPersonalIdentify(ModifyDspmPersonalIdentifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmPersonalIdentify", ModifyDspmPersonalIdentifyResponse.class);
    }

    /**
     *This API is used to restore the backup logs.
     * @param req ModifyDspmRestoreLogTaskRequest
     * @return ModifyDspmRestoreLogTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmRestoreLogTaskResponse ModifyDspmRestoreLogTask(ModifyDspmRestoreLogTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmRestoreLogTask", ModifyDspmRestoreLogTaskResponse.class);
    }

    /**
     *Modifies Dspm risk information
     * @param req ModifyDspmRiskInfoRequest
     * @return ModifyDspmRiskInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmRiskInfoResponse ModifyDspmRiskInfo(ModifyDspmRiskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmRiskInfo", ModifyDspmRiskInfoResponse.class);
    }

    /**
     *Modifies Dspm risk policies
     * @param req ModifyDspmRiskStrategyRequest
     * @return ModifyDspmRiskStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmRiskStrategyResponse ModifyDspmRiskStrategy(ModifyDspmRiskStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmRiskStrategy", ModifyDspmRiskStrategyResponse.class);
    }

    /**
     *Modify the Dspm allowlist policy
     * @param req ModifyDspmWhitelistStrategyRequest
     * @return ModifyDspmWhitelistStrategyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDspmWhitelistStrategyResponse ModifyDspmWhitelistStrategy(ModifyDspmWhitelistStrategyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDspmWhitelistStrategy", ModifyDspmWhitelistStrategyResponse.class);
    }

    /**
     *This API is used to edit or create an EDR policy.
     * @param req ModifyEDRRuleRequest
     * @return ModifyEDRRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEDRRuleResponse ModifyEDRRule(ModifyEDRRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEDRRule", ModifyEDRRuleResponse.class);
    }

    /**
     *This API is used to modify the switch status of EDR policies.
     * @param req ModifyEDRRuleStatusRequest
     * @return ModifyEDRRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEDRRuleStatusResponse ModifyEDRRuleStatus(ModifyEDRRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEDRRuleStatus", ModifyEDRRuleStatusResponse.class);
    }

    /**
     *Batch modify EDR policy actions.
     * @param req ModifyEDRRulesActionRequest
     * @return ModifyEDRRulesActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEDRRulesActionResponse ModifyEDRRulesAction(ModifyEDRRulesActionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEDRRulesAction", ModifyEDRRulesActionResponse.class);
    }

    /**
     *EDR alert quarantine and recovery
     * @param req ModifyEdrAlertIsolationRequest
     * @return ModifyEdrAlertIsolationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrAlertIsolationResponse ModifyEdrAlertIsolation(ModifyEdrAlertIsolationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrAlertIsolation", ModifyEdrAlertIsolationResponse.class);
    }

    /**
     *Permanently ignore EDR multi-behavior alarms. Add the host and rule corresponding to the alarm to the AI-Link permanent ignore allowlist. Subsequently, alarms of the same type will be automatically discarded.
     * @param req ModifyEdrAlertPermanentIgnoreRequest
     * @return ModifyEdrAlertPermanentIgnoreResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrAlertPermanentIgnoreResponse ModifyEdrAlertPermanentIgnore(ModifyEdrAlertPermanentIgnoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrAlertPermanentIgnore", ModifyEdrAlertPermanentIgnoreResponse.class);
    }

    /**
     *Handle the status of an EDR alert
     * @param req ModifyEdrAlertStatusRequest
     * @return ModifyEdrAlertStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrAlertStatusResponse ModifyEdrAlertStatus(ModifyEdrAlertStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrAlertStatus", ModifyEdrAlertStatusResponse.class);
    }

    /**
     *This API is used to modify the CIDR block exclusion settings for log collection. IPs, IP ranges, and CIDR formats are supported, with up to 100 entries.
     * @param req ModifyEdrExcludeNetworkSegmentsRequest
     * @return ModifyEdrExcludeNetworkSegmentsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrExcludeNetworkSegmentsResponse ModifyEdrExcludeNetworkSegments(ModifyEdrExcludeNetworkSegmentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrExcludeNetworkSegments", ModifyEdrExcludeNetworkSegmentsResponse.class);
    }

    /**
     *This API is used to modify path configurations for application log collection.
     * @param req ModifyEdrLogCollectPathRequest
     * @return ModifyEdrLogCollectPathResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdrLogCollectPathResponse ModifyEdrLogCollectPath(ModifyEdrLogCollectPathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdrLogCollectPath", ModifyEdrLogCollectPathResponse.class);
    }

    /**
     *Update automatic cloud boundary tagging rules
     * @param req ModifyExposureAutoTagRuleRequest
     * @return ModifyExposureAutoTagRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExposureAutoTagRuleResponse ModifyExposureAutoTagRule(ModifyExposureAutoTagRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExposureAutoTagRule", ModifyExposureAutoTagRuleResponse.class);
    }

    /**
     *Enable or disable automatic cloud boundary tagging rules.
     * @param req ModifyExposureAutoTagRuleStatusRequest
     * @return ModifyExposureAutoTagRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExposureAutoTagRuleStatusResponse ModifyExposureAutoTagRuleStatus(ModifyExposureAutoTagRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExposureAutoTagRuleStatus", ModifyExposureAutoTagRuleStatusResponse.class);
    }

    /**
     *Update custom tags for cloud boundaries
     * @param req ModifyExposureTagRequest
     * @return ModifyExposureTagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExposureTagResponse ModifyExposureTag(ModifyExposureTagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExposureTag", ModifyExposureTagResponse.class);
    }

    /**
     *Modify the storage cycle of IaC detection integration tokens.
     * @param req ModifyIaCTokenPeriodRequest
     * @return ModifyIaCTokenPeriodResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIaCTokenPeriodResponse ModifyIaCTokenPeriod(ModifyIaCTokenPeriodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIaCTokenPeriod", ModifyIaCTokenPeriodResponse.class);
    }

    /**
     *Modify image repository information.
     * @param req ModifyImageRegistryRequest
     * @return ModifyImageRegistryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageRegistryResponse ModifyImageRegistry(ModifyImageRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageRegistry", ModifyImageRegistryResponse.class);
    }

    /**
     *Modify the scheduled scan task configuration of an image repository
     * @param req ModifyImageRegistryTimedScanTaskConfigRequest
     * @return ModifyImageRegistryTimedScanTaskConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageRegistryTimedScanTaskConfigResponse ModifyImageRegistryTimedScanTaskConfig(ModifyImageRegistryTimedScanTaskConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageRegistryTimedScanTaskConfig", ModifyImageRegistryTimedScanTaskConfigResponse.class);
    }

    /**
     *Modifies the Sensitive Information Allowlist of a Container Image
     * @param req ModifyImageSensitiveWhitelistRequest
     * @return ModifyImageSensitiveWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSensitiveWhitelistResponse ModifyImageSensitiveWhitelist(ModifyImageSensitiveWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageSensitiveWhitelist", ModifyImageSensitiveWhitelistResponse.class);
    }

    /**
     *This API is used to query asset database information.
     * @param req ModifyImageVirusWhitelistRequest
     * @return ModifyImageVirusWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageVirusWhitelistResponse ModifyImageVirusWhitelist(ModifyImageVirusWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageVirusWhitelist", ModifyImageVirusWhitelistResponse.class);
    }

    /**
     *Modifies the vulnerability allowlist of a container image.
     * @param req ModifyImageVulWhitelistRequest
     * @return ModifyImageVulWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageVulWhitelistResponse ModifyImageVulWhitelist(ModifyImageVulWhitelistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageVulWhitelist", ModifyImageVulWhitelistResponse.class);
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
     *Modify the remark information of a host asset
     * @param req ModifyMachineRemarkRequest
     * @return ModifyMachineRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineRemarkResponse ModifyMachineRemark(ModifyMachineRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMachineRemark", ModifyMachineRemarkResponse.class);
    }

    /**
     *This API is used to modify host login methods in batches.
     * @param req ModifyMachinesLoginTypeRequest
     * @return ModifyMachinesLoginTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachinesLoginTypeResponse ModifyMachinesLoginType(ModifyMachinesLoginTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMachinesLoginType", ModifyMachinesLoginTypeResponse.class);
    }

    /**
     *Modify the scheduled scan configuration for malicious file scan, including scan cycle, detection mode, asset scope, engine selection, and quarantine configuration.
     * @param req ModifyMalwareTimingScanSettingsRequest
     * @return ModifyMalwareTimingScanSettingsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMalwareTimingScanSettingsResponse ModifyMalwareTimingScanSettings(ModifyMalwareTimingScanSettingsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMalwareTimingScanSettings", ModifyMalwareTimingScanSettingsResponse.class);
    }

    /**
     *This API is used to add or update the global configuration for NFS scanning.
     * @param req ModifyNFSScanConfRequest
     * @return ModifyNFSScanConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNFSScanConfResponse ModifyNFSScanConf(ModifyNFSScanConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNFSScanConf", ModifyNFSScanConfResponse.class);
    }

    /**
     *This API is used to disable process guard.
     * @param req ModifyNFSScanHostRequest
     * @return ModifyNFSScanHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNFSScanHostResponse ModifyNFSScanHost(ModifyNFSScanHostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNFSScanHost", ModifyNFSScanHostResponse.class);
    }

    /**
     *Modify the network attack detection switch and asset scope configuration.
     * @param req ModifyNetAttackSettingRequest
     * @return ModifyNetAttackSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetAttackSettingResponse ModifyNetAttackSetting(ModifyNetAttackSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetAttackSetting", ModifyNetAttackSettingResponse.class);
    }

    /**
     *This API is used to modify client offline duration.
     * @param req ModifyNotifyAgentOfflineDurationRequest
     * @return ModifyNotifyAgentOfflineDurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifyAgentOfflineDurationResponse ModifyNotifyAgentOfflineDuration(ModifyNotifyAgentOfflineDurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifyAgentOfflineDuration", ModifyNotifyAgentOfflineDurationResponse.class);
    }

    /**
     *Modify the asset scope configuration for notifications
     * @param req ModifyNotifyAssetConfigRequest
     * @return ModifyNotifyAssetConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifyAssetConfigResponse ModifyNotifyAssetConfig(ModifyNotifyAssetConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifyAssetConfig", ModifyNotifyAssetConfigResponse.class);
    }

    /**
     *Modify the member account for notification.
     * @param req ModifyNotifyMemberRequest
     * @return ModifyNotifyMemberResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifyMemberResponse ModifyNotifyMember(ModifyNotifyMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifyMember", ModifyNotifyMemberResponse.class);
    }

    /**
     *Modifies notification settings
     * @param req ModifyNotifySettingRequest
     * @return ModifyNotifySettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifySettingResponse ModifyNotifySetting(ModifyNotifySettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifySetting", ModifyNotifySettingResponse.class);
    }

    /**
     *Modify notification settings
     * @param req ModifyNotifySettingAkRequest
     * @return ModifyNotifySettingAkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifySettingAkResponse ModifyNotifySettingAk(ModifyNotifySettingAkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifySettingAk", ModifyNotifySettingAkResponse.class);
    }

    /**
     *Modify alarm center notification advanced configuration
     * @param req ModifyNotifySettingAlertRequest
     * @return ModifyNotifySettingAlertResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotifySettingAlertResponse ModifyNotifySettingAlert(ModifyNotifySettingAlertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotifySettingAlert", ModifyNotifySettingAlertResponse.class);
    }

    /**
     *Modify Group Account Status
     * @param req ModifyOrganizationAccountStatusRequest
     * @return ModifyOrganizationAccountStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrganizationAccountStatusResponse ModifyOrganizationAccountStatus(ModifyOrganizationAccountStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOrganizationAccountStatus", ModifyOrganizationAccountStatusResponse.class);
    }

    /**
     *Modify the auto-scaling configuration (multi-module and expandable; only the CWP module is available in the current period).

Auto-scaling is an external user-oriented concept equivalent to automatic purchase (auto_repurchase) at the underlying layer: when an account has new assets, the desired authorization is automatically purchased.

Supplemental description:
1. In the current period, only the HostConfig module is implemented for host security. Subsequent scalability allows named module fields for container security and AI-Agent security. Configuration fields of each module can be heterogeneous.
2. Partial update semantics: An empty module object indicates that the module is not modified, and an empty field in the module indicates that this field is not modified;
3. HostConfig.Switch linkage map: auto_repurchase_switch; auto_bind_switch is always on and not modified by this API.
4. Auto renewal (renew_flag) is not modified by this API; to query the limit/amount, call DescribeLicenseStatus.
5. The top auto scaling global switch state is aggregated by the frontend based on each module switch. The backend does not store or return the global switch.
     * @param req ModifyPayConfigRequest
     * @return ModifyPayConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPayConfigResponse ModifyPayConfig(ModifyPayConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPayConfig", ModifyPayConfigResponse.class);
    }

    /**
     *This API is used to configure protection settings for the major event protection package.
     * @param req ModifyProtectionSettingRequest
     * @return ModifyProtectionSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectionSettingResponse ModifyProtectionSetting(ModifyProtectionSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProtectionSetting", ModifyProtectionSettingResponse.class);
    }

    /**
     *Bind an important period guarantee protection authorization package.
     * @param req ModifyRaspLicenseBindsRequest
     * @return ModifyRaspLicenseBindsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRaspLicenseBindsResponse ModifyRaspLicenseBinds(ModifyRaspLicenseBindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRaspLicenseBinds", ModifyRaspLicenseBindsResponse.class);
    }

    /**
     *This API is used to modify the intranet alert and asset scope configuration for rebound Shell.
     * @param req ModifyReverseShellSystemPolicyConfigRequest
     * @return ModifyReverseShellSystemPolicyConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReverseShellSystemPolicyConfigResponse ModifyReverseShellSystemPolicyConfig(ModifyReverseShellSystemPolicyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReverseShellSystemPolicyConfig", ModifyReverseShellSystemPolicyConfigResponse.class);
    }

    /**
     *Modify Risk Center Risk Status
     * @param req ModifyRiskCenterRiskStatusRequest
     * @return ModifyRiskCenterRiskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskCenterRiskStatusResponse ModifyRiskCenterRiskStatus(ModifyRiskCenterRiskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskCenterRiskStatus", ModifyRiskCenterRiskStatusResponse.class);
    }

    /**
     *Modify Risk Center Scan Task
     * @param req ModifyRiskCenterScanTaskRequest
     * @return ModifyRiskCenterScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskCenterScanTaskResponse ModifyRiskCenterScanTask(ModifyRiskCenterScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskCenterScanTask", ModifyRiskCenterScanTaskResponse.class);
    }

    /**
     *Update the periodic scanning plan
     * @param req ModifyRiskScanCronConfigRequest
     * @return ModifyRiskScanCronConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskScanCronConfigResponse ModifyRiskScanCronConfig(ModifyRiskScanCronConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskScanCronConfig", ModifyRiskScanCronConfigResponse.class);
    }

    /**
     *Modify an existing ACL user rule. Fields not passed retain their original values, and partial field update is supported.
     * @param req ModifySandboxACLRuleRequest
     * @return ModifySandboxACLRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySandboxACLRuleResponse ModifySandboxACLRule(ModifySandboxACLRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySandboxACLRule", ModifySandboxACLRuleResponse.class);
    }

    /**
     *Batch switch the enable/disable status of ACL user rules. If any rule does not exist, belongs to another tenant, or has been deleted, an error is returned for the entirety.
     * @param req ModifySandboxACLRuleStatusRequest
     * @return ModifySandboxACLRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySandboxACLRuleStatusResponse ModifySandboxACLRuleStatus(ModifySandboxACLRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySandboxACLRuleStatus", ModifySandboxACLRuleStatusResponse.class);
    }

    /**
     *Batch update traffic sandbox alarms (overwrite ACL, DLP, and LLM audit). Locate the alarm source by AlertType + BelongAssetType. Status supports HANDLED / IGNORE to modify status, as well as DELETE to delete. If any alarm ID does not exist or belongs to another tenant, an error is returned overall. Note: Whitelisting (PASS) is not handled by this interface. It is triggered by Create/Modify***Rule writing back through AlertID.
     * @param req ModifySandboxAlertStatusRequest
     * @return ModifySandboxAlertStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySandboxAlertStatusResponse ModifySandboxAlertStatus(ModifySandboxAlertStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySandboxAlertStatus", ModifySandboxAlertStatusResponse.class);
    }

    /**
     *Modify an existing DLP user rule. Fields not passed retain their original values, and partial field update is supported. BelongAssetType cannot be modified.
     * @param req ModifySandboxDLPRuleRequest
     * @return ModifySandboxDLPRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySandboxDLPRuleResponse ModifySandboxDLPRule(ModifySandboxDLPRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySandboxDLPRule", ModifySandboxDLPRuleResponse.class);
    }

    /**
     *Batch switch the enable/disable status of DLP user rules. If any rule does not exist, belongs to another tenant, or has been deleted, an error is returned for the entirety.
     * @param req ModifySandboxDLPRuleStatusRequest
     * @return ModifySandboxDLPRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySandboxDLPRuleStatusResponse ModifySandboxDLPRuleStatus(ModifySandboxDLPRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySandboxDLPRuleStatus", ModifySandboxDLPRuleStatusResponse.class);
    }

    /**
     *Modify command sandbox file access rule
     * @param req ModifySandboxFileRuleRequest
     * @return ModifySandboxFileRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySandboxFileRuleResponse ModifySandboxFileRule(ModifySandboxFileRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySandboxFileRule", ModifySandboxFileRuleResponse.class);
    }

    /**
     *Batch enable or disable command sandbox file access rules.
     * @param req ModifySandboxFileRuleStatusRequest
     * @return ModifySandboxFileRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySandboxFileRuleStatusResponse ModifySandboxFileRuleStatus(ModifySandboxFileRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySandboxFileRuleStatus", ModifySandboxFileRuleStatusResponse.class);
    }

    /**
     *Modify an existing LLM audit user rule. Fields not passed retain their original values, and partial field update is supported.
     * @param req ModifySandboxLLMAuditRuleRequest
     * @return ModifySandboxLLMAuditRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySandboxLLMAuditRuleResponse ModifySandboxLLMAuditRule(ModifySandboxLLMAuditRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySandboxLLMAuditRule", ModifySandboxLLMAuditRuleResponse.class);
    }

    /**
     *Batch switch the enable or disable status of LLM audit user rules. If any rule does not exist, belongs to another tenant, or has been deleted, an error is returned overall.
     * @param req ModifySandboxLLMAuditRuleStatusRequest
     * @return ModifySandboxLLMAuditRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySandboxLLMAuditRuleStatusResponse ModifySandboxLLMAuditRuleStatus(ModifySandboxLLMAuditRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySandboxLLMAuditRuleStatus", ModifySandboxLLMAuditRuleStatusResponse.class);
    }

    /**
     *Modify a security scoring rule. You need to pass in a complete rule set.
     * @param req ModifySecurityScoreRuleRequest
     * @return ModifySecurityScoreRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityScoreRuleResponse ModifySecurityScoreRule(ModifySecurityScoreRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityScoreRule", ModifySecurityScoreRuleResponse.class);
    }

    /**
     *Edit the ak monitoring account.
     * @param req ModifyShareUserAKRequest
     * @return ModifyShareUserAKResponse
     * @throws TencentCloudSDKException
     */
    public ModifyShareUserAKResponse ModifyShareUserAK(ModifyShareUserAKRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyShareUserAK", ModifyShareUserAKResponse.class);
    }

    /**
     *Edit a CSPM shared account
     * @param req ModifyShareUserCSPMRequest
     * @return ModifyShareUserCSPMResponse
     * @throws TencentCloudSDKException
     */
    public ModifyShareUserCSPMResponse ModifyShareUserCSPM(ModifyShareUserCSPMRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyShareUserCSPM", ModifyShareUserCSPMResponse.class);
    }

    /**
     *Edit dspm monitored account
     * @param req ModifyShareUserDspmRequest
     * @return ModifyShareUserDspmResponse
     * @throws TencentCloudSDKException
     */
    public ModifyShareUserDspmResponse ModifyShareUserDspm(ModifyShareUserDspmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyShareUserDspm", ModifyShareUserDspmResponse.class);
    }

    /**
     *Batch modify the processing status of Skill security detection alarms.
     * @param req ModifySkillScanAlertStatusRequest
     * @return ModifySkillScanAlertStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySkillScanAlertStatusResponse ModifySkillScanAlertStatus(ModifySkillScanAlertStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySkillScanAlertStatus", ModifySkillScanAlertStatusResponse.class);
    }

    /**
     *Update the switch of a custom policy
     * @param req ModifyUebaRuleSwitchRequest
     * @return ModifyUebaRuleSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUebaRuleSwitchResponse ModifyUebaRuleSwitch(ModifyUebaRuleSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUebaRuleSwitch", ModifyUebaRuleSwitchResponse.class);
    }

    /**
     *This API is used to modify vulnerability scanning (period scanning).
     * @param req ModifyVulScanPeriodicRequest
     * @return ModifyVulScanPeriodicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulScanPeriodicResponse ModifyVulScanPeriodic(ModifyVulScanPeriodicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulScanPeriodic", ModifyVulScanPeriodicResponse.class);
    }

    /**
     *This API is used to modify the vulnerability allowlist configuration.
     * @param req ModifyVulWhitelistConfigRequest
     * @return ModifyVulWhitelistConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulWhitelistConfigResponse ModifyVulWhitelistConfig(ModifyVulWhitelistConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulWhitelistConfig", ModifyVulWhitelistConfigResponse.class);
    }

    /**
     *This API is used to modify the vulnerability allowlist switch.
     * @param req ModifyVulWhitelistSwitchRequest
     * @return ModifyVulWhitelistSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVulWhitelistSwitchResponse ModifyVulWhitelistSwitch(ModifyVulWhitelistSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVulWhitelistSwitch", ModifyVulWhitelistSwitchResponse.class);
    }

    /**
     *Add or modify a notification policy. ID > 0 means modification; ID = 0 or not passed means adding new. When MemberAppIds is configured as empty, the policy only acts on current root account events; when not empty, it acts on the self account + listed member accounts at the same time.
     * @param req ModifyWebhookPolicyRequest
     * @return ModifyWebhookPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebhookPolicyResponse ModifyWebhookPolicy(ModifyWebhookPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebhookPolicy", ModifyWebhookPolicyResponse.class);
    }

    /**
     *Switch the enable status of the notification policy.
     * @param req ModifyWebhookPolicyStatusRequest
     * @return ModifyWebhookPolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebhookPolicyStatusResponse ModifyWebhookPolicyStatus(ModifyWebhookPolicyStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebhookPolicyStatus", ModifyWebhookPolicyStatusResponse.class);
    }

    /**
     *Add or modify a receiving robot. ID > 0 means modifying an existing record; ID = 0 or not passed means adding new. The robot type is determined by the Type field. When Type=WEBHOOK, WebhookAddr is required. When Type=SCF, SCFRegion/Namespace/FunctionName/FunctionVersion/Alias/MaxWaitSeconds are all required. Type is not allowed to be changed during modification.
     * @param req ModifyWebhookReceiverRequest
     * @return ModifyWebhookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebhookReceiverResponse ModifyWebhookReceiver(ModifyWebhookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWebhookReceiver", ModifyWebhookReceiverResponse.class);
    }

    /**
     *Risk operation example
     * @param req OperateRiskRequest
     * @return OperateRiskResponse
     * @throws TencentCloudSDKException
     */
    public OperateRiskResponse OperateRisk(OperateRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OperateRisk", OperateRiskResponse.class);
    }

    /**
     *Custom risk rule
     * @param req OperateRiskRulePolicyRequest
     * @return OperateRiskRulePolicyResponse
     * @throws TencentCloudSDKException
     */
    public OperateRiskRulePolicyResponse OperateRiskRulePolicy(OperateRiskRulePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OperateRiskRulePolicy", OperateRiskRulePolicyResponse.class);
    }

    /**
     *Reset the Dspm asset account password.
     * @param req ResetDspmAssetAccountPasswordRequest
     * @return ResetDspmAssetAccountPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetDspmAssetAccountPasswordResponse ResetDspmAssetAccountPassword(ResetDspmAssetAccountPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetDspmAssetAccountPassword", ResetDspmAssetAccountPasswordResponse.class);
    }

    /**
     *RetryExportLog
     * @param req RetryDspmExportLogRequest
     * @return RetryDspmExportLogResponse
     * @throws TencentCloudSDKException
     */
    public RetryDspmExportLogResponse RetryDspmExportLog(RetryDspmExportLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryDspmExportLog", RetryDspmExportLogResponse.class);
    }

    /**
     *Restore a Dspm asset account.
     * @param req RevertDspmAssetAccountRequest
     * @return RevertDspmAssetAccountResponse
     * @throws TencentCloudSDKException
     */
    public RevertDspmAssetAccountResponse RevertDspmAssetAccount(RevertDspmAssetAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevertDspmAssetAccount", RevertDspmAssetAccountResponse.class);
    }

    /**
     *This API is used to trigger a rescan of some detection items for a single asset.
     * @param req ScanBaselineAssetItemListRequest
     * @return ScanBaselineAssetItemListResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselineAssetItemListResponse ScanBaselineAssetItemList(ScanBaselineAssetItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaselineAssetItemList", ScanBaselineAssetItemListResponse.class);
    }

    /**
     *This API is used to rescan detection items under a specified policy.
     * @param req ScanBaselineItemListRequest
     * @return ScanBaselineItemListResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselineItemListResponse ScanBaselineItemList(ScanBaselineItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaselineItemList", ScanBaselineItemListResponse.class);
    }

    /**
     *Trigger a holistic rescan for a batch of baseline policies via the one-click scan entry on the strategy list page. All assets within the policy hit scope will be rescanned.
     * @param req ScanBaselinePolicyListRequest
     * @return ScanBaselinePolicyListResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselinePolicyListResponse ScanBaselinePolicyList(ScanBaselinePolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaselinePolicyList", ScanBaselinePolicyListResponse.class);
    }

    /**
     *Triggers a rescan for a batch of risk records. It is commonly used for rescanning after selecting multiple risks on the Risk List page.
     * @param req ScanBaselineRiskListRequest
     * @return ScanBaselineRiskListResponse
     * @throws TencentCloudSDKException
     */
    public ScanBaselineRiskListResponse ScanBaselineRiskList(ScanBaselineRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanBaselineRiskList", ScanBaselineRiskListResponse.class);
    }

    /**
     *This API is used to delete CSIP manual scan tasks.
     * @param req ScanCSIPTaskAgainRequest
     * @return ScanCSIPTaskAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanCSIPTaskAgainResponse ScanCSIPTaskAgain(ScanCSIPTaskAgainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanCSIPTaskAgain", ScanCSIPTaskAgainResponse.class);
    }

    /**
     *Create a scan task based on the original task configuration. If AssetId is empty, get all asset info from TaskId. If AssetId is not empty, only the single asset is included.
     * @param req ScanEDRTaskAgainRequest
     * @return ScanEDRTaskAgainResponse
     * @throws TencentCloudSDKException
     */
    public ScanEDRTaskAgainResponse ScanEDRTaskAgain(ScanEDRTaskAgainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScanEDRTaskAgain", ScanEDRTaskAgainResponse.class);
    }

    /**
     *Sends the access verification code for a Dspm asset
     * @param req SendDspmAssetLoginSmsCodeRequest
     * @return SendDspmAssetLoginSmsCodeResponse
     * @throws TencentCloudSDKException
     */
    public SendDspmAssetLoginSmsCodeResponse SendDspmAssetLoginSmsCode(SendDspmAssetLoginSmsCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendDspmAssetLoginSmsCode", SendDspmAssetLoginSmsCodeResponse.class);
    }

    /**
     *This API is used to test the tenant CKafka connectivity.
     * @param req SendDspmCkafkaTestRequest
     * @return SendDspmCkafkaTestResponse
     * @throws TencentCloudSDKException
     */
    public SendDspmCkafkaTestResponse SendDspmCkafkaTest(SendDspmCkafkaTestRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendDspmCkafkaTest", SendDspmCkafkaTestResponse.class);
    }

    /**
     *Enable or modify the anti-uninstall feature configuration.
     * @param req StartOrModifyPreventUninstallRequest
     * @return StartOrModifyPreventUninstallResponse
     * @throws TencentCloudSDKException
     */
    public StartOrModifyPreventUninstallResponse StartOrModifyPreventUninstall(StartOrModifyPreventUninstallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartOrModifyPreventUninstall", StartOrModifyPreventUninstallResponse.class);
    }

    /**
     *This API is used to enable or modify process guard feature configurations.
     * @param req StartOrModifyProcessDaemonRequest
     * @return StartOrModifyProcessDaemonResponse
     * @throws TencentCloudSDKException
     */
    public StartOrModifyProcessDaemonResponse StartOrModifyProcessDaemon(StartOrModifyProcessDaemonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartOrModifyProcessDaemon", StartOrModifyProcessDaemonResponse.class);
    }

    /**
     *This API is used to stop a specified baseline scan main task. It only takes effect for tasks in the INIT, SUBTASK_CREATING, or SCANNING status.
     * @param req StopBaselineScanTaskRequest
     * @return StopBaselineScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopBaselineScanTaskResponse StopBaselineScanTask(StopBaselineScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopBaselineScanTask", StopBaselineScanTaskResponse.class);
    }

    /**
     *CSIP manual scan stop API
     * @param req StopCSIPManualMalwareScanRequest
     * @return StopCSIPManualMalwareScanResponse
     * @throws TencentCloudSDKException
     */
    public StopCSIPManualMalwareScanResponse StopCSIPManualMalwareScan(StopCSIPManualMalwareScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCSIPManualMalwareScan", StopCSIPManualMalwareScanResponse.class);
    }

    /**
     *Stop or cancel a scan task. For tasks in SCANNING status, call RPC to stop them. For tasks in WAIT status, update the database directly to cancel them. Only the task creator can perform these operations.
     * @param req StopEDRScanTaskRequest
     * @return StopEDRScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopEDRScanTaskResponse StopEDRScanTask(StopEDRScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopEDRScanTask", StopEDRScanTaskResponse.class);
    }

    /**
     *Terminate an image scanning task in a mirror repository
     * @param req StopImageRegistryScanTaskRequest
     * @return StopImageRegistryScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopImageRegistryScanTaskResponse StopImageRegistryScanTask(StopImageRegistryScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopImageRegistryScanTask", StopImageRegistryScanTaskResponse.class);
    }

    /**
     *This API is used to disable the anti-uninstallation feature.
     * @param req StopPreventUninstallRequest
     * @return StopPreventUninstallResponse
     * @throws TencentCloudSDKException
     */
    public StopPreventUninstallResponse StopPreventUninstall(StopPreventUninstallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopPreventUninstall", StopPreventUninstallResponse.class);
    }

    /**
     *This API is used to disable process guard.
     * @param req StopProcessDaemonRequest
     * @return StopProcessDaemonResponse
     * @throws TencentCloudSDKException
     */
    public StopProcessDaemonResponse StopProcessDaemon(StopProcessDaemonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopProcessDaemon", StopProcessDaemonResponse.class);
    }

    /**
     *Stop Scanning Tasks of Risk Center
     * @param req StopRiskCenterTaskRequest
     * @return StopRiskCenterTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRiskCenterTaskResponse StopRiskCenterTask(StopRiskCenterTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRiskCenterTask", StopRiskCenterTaskResponse.class);
    }

    /**
     *Stop vulnerability scanning (task scan).
     * @param req StopVulScanTaskRequest
     * @return StopVulScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopVulScanTaskResponse StopVulScanTask(StopVulScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopVulScanTask", StopVulScanTaskResponse.class);
    }

    /**
     *Synchronize assets supported by dspm
     * @param req SyncDspmAssetsRequest
     * @return SyncDspmAssetsResponse
     * @throws TencentCloudSDKException
     */
    public SyncDspmAssetsResponse SyncDspmAssets(SyncDspmAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncDspmAssets", SyncDspmAssetsResponse.class);
    }

    /**
     *Synchronize the list of dspm users.
     * @param req SyncDspmUsersRequest
     * @return SyncDspmUsersResponse
     * @throws TencentCloudSDKException
     */
    public SyncDspmUsersResponse SyncDspmUsers(SyncDspmUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncDspmUsers", SyncDspmUsersResponse.class);
    }

    /**
     *Synchronize the mirror repository
     * @param req SyncImageRegistryRequest
     * @return SyncImageRegistryResponse
     * @throws TencentCloudSDKException
     */
    public SyncImageRegistryResponse SyncImageRegistry(SyncImageRegistryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncImageRegistry", SyncImageRegistryResponse.class);
    }

    /**
     *Send a test message to the designated receiving robot to verify reachability and configuration. Use the "Test" button in the corresponding table row.
     * @param req TestWebhookReceiverRequest
     * @return TestWebhookReceiverResponse
     * @throws TencentCloudSDKException
     */
    public TestWebhookReceiverResponse TestWebhookReceiver(TestWebhookReceiverRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TestWebhookReceiver", TestWebhookReceiverResponse.class);
    }

    /**
     *Uninstall the cluster container security Agent.
     * @param req UninstallClusterAgentRequest
     * @return UninstallClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public UninstallClusterAgentResponse UninstallClusterAgent(UninstallClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallClusterAgent", UninstallClusterAgentResponse.class);
    }

    /**
     *Uninstall the key sandbox SKILL from designated machine instances. Support batch operations, allowing multiple instance IDs at once. After uninstallation, the AI Agent on the target machine will not be able to access credentials via the key sandbox proxy. Repeated calls on instances not installed will not trigger an error (idempotent), and are directly deemed successful.
     * @param req UninstallKeySandboxSkillRequest
     * @return UninstallKeySandboxSkillResponse
     * @throws TencentCloudSDKException
     */
    public UninstallKeySandboxSkillResponse UninstallKeySandboxSkill(UninstallKeySandboxSkillRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallKeySandboxSkill", UninstallKeySandboxSkillResponse.class);
    }

    /**
     *Tag risks or alarms as processed or ignored.
     * @param req UpdateAccessKeyAlarmStatusRequest
     * @return UpdateAccessKeyAlarmStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyAlarmStatusResponse UpdateAccessKeyAlarmStatus(UpdateAccessKeyAlarmStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccessKeyAlarmStatus", UpdateAccessKeyAlarmStatusResponse.class);
    }

    /**
     *Edit the remark of an access key/source IP.
     * @param req UpdateAccessKeyRemarkRequest
     * @return UpdateAccessKeyRemarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyRemarkResponse UpdateAccessKeyRemark(UpdateAccessKeyRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccessKeyRemark", UpdateAccessKeyRemarkResponse.class);
    }

    /**
     *This API is used to handle alarm status in batches.
     * @param req UpdateAlertStatusListRequest
     * @return UpdateAlertStatusListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertStatusListResponse UpdateAlertStatusList(UpdateAlertStatusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlertStatusList", UpdateAlertStatusListResponse.class);
    }

    /**
     *Bind and update a cluster owner
     * @param req UpdateClusterOwnerRequest
     * @return UpdateClusterOwnerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateClusterOwnerResponse UpdateClusterOwner(UpdateClusterOwnerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateClusterOwner", UpdateClusterOwnerResponse.class);
    }

    /**
     *Verify the login verification code for a Dspm asset.
     * @param req VerifyDspmAssetLoginCodeRequest
     * @return VerifyDspmAssetLoginCodeResponse
     * @throws TencentCloudSDKException
     */
    public VerifyDspmAssetLoginCodeResponse VerifyDspmAssetLoginCode(VerifyDspmAssetLoginCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "VerifyDspmAssetLoginCode", VerifyDspmAssetLoginCodeResponse.class);
    }

}
