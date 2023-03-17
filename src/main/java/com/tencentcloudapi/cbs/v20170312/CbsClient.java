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
package com.tencentcloudapi.cbs.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cbs.v20170312.models.*;

public class CbsClient extends AbstractClient{
    private static String endpoint = "cbs.tencentcloudapi.com";
    private static String service = "cbs";
    private static String version = "2017-03-12";

    public CbsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CbsClient(Credential credential, String region, ClientProfile profile) {
        super(CbsClient.endpoint, CbsClient.version, credential, region, profile);
    }

    /**
     *This API is used to roll back a backup point to the original cloud disk.

* Only rollback to the original cloud disk is supported. For a data disk backup point, if you want to copy the backup point data to another cloud disk, use the `CreateSnapshot` API to convert the backup point into a snapshot, use the `CreateDisks` API to create an elastic cloud disk, and then copy the snapshot data to it.
* Only backup points in `NORMAL` status can be rolled back. To query the status of a backup point, call the `DescribeDiskBackups` API and see the `BackupState` field in the response.
* For an elastic cloud disk, it must be in unattached status. To query the status of the cloud disk, call the `DescribeDisks` API and see the `Attached` field in the response. For a non-elastic cloud disk purchased together with an instance, the instance must be in shutdown status, which can be queried through the `DescribeInstancesStatus` API.
     * @param req ApplyDiskBackupRequest
     * @return ApplyDiskBackupResponse
     * @throws TencentCloudSDKException
     */
    public ApplyDiskBackupResponse ApplyDiskBackup(ApplyDiskBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyDiskBackupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyDiskBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyDiskBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ApplySnapshot) is used to roll back a snapshot to the original cloud disk.

* The snapshot can only be rolled back to the original cloud disk. For data disk snapshots, if you need to copy the snapshot data to other cloud disks, use the API [CreateDisks](https://intl.cloud.tencent.com/document/product/362/16312?from_cn_redirect=1) to create an elastic cloud disk and then copy the snapshot data to the created cloud disk. 
* The snapshot for rollback must be in NORMAL status. The snapshot status can be queried in the SnapshotState field in the output parameters through the API [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1).
* For elastic cloud disks, the cloud disk must be in UNMOUNTED status. The cloud disk status can be queried in the Attached field returned by the API [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1). For non-elastic cloud disks purchased together with instances, the instance must be in SHUTDOWN status. The instance status can be queried through the API [DescribeInstancesStatus](https://intl.cloud.tencent.com/document/product/213/15738?from_cn_redirect=1).
     * @param req ApplySnapshotRequest
     * @return ApplySnapshotResponse
     * @throws TencentCloudSDKException
     */
    public ApplySnapshotResponse ApplySnapshot(ApplySnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplySnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplySnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplySnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to mount one or more cloud disks.
 
* Batch operation is supported. You can mount multiple cloud disks to one CVM in a single request. If any of these cloud disks cannot be mounted, the operation fails and a specific error code returns.
* This is an async API. A successful request indicates that the mounting is initiated. You can call the [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1) API to query the status of cloud disks. If the status changes from `ATTACHING` to `ATTACHED`, the mounting is successful.
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (BindAutoSnapshotPolicy) is used to bind the cloud disk to the specified scheduled snapshot policy.

* For the scheduled snapshot policy limit of each region, see [Scheduled Snapshots](https://intl.cloud.tencent.com/document/product/362/8191?from_cn_redirect=1).
* When a cloud disk that is bound to a scheduled snapshot policy is in the unused state (that is, an elastic cloud disk has not been mounted or the server of an inelastic disk is powered off) scheduled snapshots are not created.
     * @param req BindAutoSnapshotPolicyRequest
     * @return BindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoSnapshotPolicyResponse BindAutoSnapshotPolicy(BindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindAutoSnapshotPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindAutoSnapshotPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindAutoSnapshotPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to replicate a snapshot to another region.

* This is an async API. A new snapshot ID is issued when the cross-region replication task is generated. It does not mean that the snapshot has been replicated successfully. You can all the [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1) API in the destination region to check for this snapshot. If the snapshot status is `NORMAL`, the snapshot is replicated successfully.
* The snapshot cross-region replication service will be commercialized in the Q3 of 2022. We will notify users about the commercialization in advance. Please check your messages in the Message Center.
     * @param req CopySnapshotCrossRegionsRequest
     * @return CopySnapshotCrossRegionsResponse
     * @throws TencentCloudSDKException
     */
    public CopySnapshotCrossRegionsResponse CopySnapshotCrossRegions(CopySnapshotCrossRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopySnapshotCrossRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CopySnapshotCrossRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopySnapshotCrossRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateAutoSnapshotPolicy) is used to create a scheduled snapshot policy.

* For the limits on the number of scheduled snapshot policies that can be created in each region, see [Scheduled Snapshots](https://intl.cloud.tencent.com/document/product/362/8191?from_cn_redirect=1).
* The quantity and capacity of the snapshots that can be created in each region are limited. For more information, see the **Snapshots** page on the Tencent Cloud Console. If the number of snapshots exceeds the quota, the creation of the scheduled snapshots will fail.
     * @param req CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoSnapshotPolicyResponse CreateAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAutoSnapshotPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAutoSnapshotPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAutoSnapshotPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a backup point for a cloud disk.
     * @param req CreateDiskBackupRequest
     * @return CreateDiskBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDiskBackupResponse CreateDiskBackup(CreateDiskBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDiskBackupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDiskBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDiskBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create cloud disks.

* This API supports creating a cloud disk with a data disk snapshot so that the snapshot data can be copied to the purchased cloud disk.
* This API is async. A cloud disk ID list will be returned when a request is made successfully, but it does not mean that the creation has been completed. You can call the [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1) API to query cloud disks by `DiskId`. If a new cloud disk can be found and its status is `UNATTACHED` or `ATTACHED`, the cloud disk has been created successfully.
     * @param req CreateDisksRequest
     * @return CreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisksResponse CreateDisks(CreateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a snapshot for the specified cloud disk.

* You can only create snapshots for cloud disks with the snapshot capability. To check whether a cloud disk is snapshot-enabled, call the [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1) API and see the `SnapshotAbility` field in the response.
* For the maximum number of snapshots that can be created, see [Use Limits](https://intl.cloud.tencent.com/doc/product/362/5145?from_cn_redirect=1).
* Currently, you can convert backup points into general snapshots. After the conversion, snapshot usage fees may be charged, backup points will not be retained, and the occupied backup point quota will be released.
     * @param req CreateSnapshotRequest
     * @return CreateSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotResponse CreateSnapshot(CreateSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteAutoSnapshotPolicies) is used to delete scheduled snapshot policies.

* Batch operations are supported. If one of the scheduled snapshot policies in a batch cannot be deleted, the operation is not performed and a specific error code is returned.
     * @param req DeleteAutoSnapshotPoliciesRequest
     * @return DeleteAutoSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoSnapshotPoliciesResponse DeleteAutoSnapshotPolicies(DeleteAutoSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAutoSnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAutoSnapshotPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAutoSnapshotPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete the backup points of the specified cloud disk in batches.
     * @param req DeleteDiskBackupsRequest
     * @return DeleteDiskBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDiskBackupsResponse DeleteDiskBackups(DeleteDiskBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDiskBackupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDiskBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDiskBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete snapshots.

* Only snapshots in the `NORMAL` state can be deleted. To query the state of a snapshot, you can call the [DescribeSnapshots](https://intl.cloud.tencent.com/document/product/362/15647?from_cn_redirect=1) API and check the `SnapshotState` field in the response.
* Batch operations are supported. If there is any snapshot that cannot be deleted, the operation will not be performed and a specific error code will be returned.
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAutoSnapshotPolicies) is used to query scheduled snapshot policies.

* You can query the detailed information of scheduled snapshot policies by ID, name, or status. Insert `AND` between different values. For details on filtering information, see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit`; the default is 20) of the scheduled snapshot policy lists are returned to the current user.

     * @param req DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoSnapshotPoliciesResponse DescribeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoSnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoSnapshotPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoSnapshotPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDiskAssociatedAutoSnapshotPolicy) is used to query the scheduled snapshot policy bound to a cloud disk.
     * @param req DescribeDiskAssociatedAutoSnapshotPolicyRequest
     * @return DescribeDiskAssociatedAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskAssociatedAutoSnapshotPolicyResponse DescribeDiskAssociatedAutoSnapshotPolicy(DescribeDiskAssociatedAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskAssociatedAutoSnapshotPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskAssociatedAutoSnapshotPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskAssociatedAutoSnapshotPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of backup points.

You can filter results by backup point ID. You can also look for certain backup points by specifying the ID or type of the cloud disk for which the backup points are created. The relationship between different filters is logical `AND`. For more information on filters, see `Filter`.
If the parameter is empty, a certain number (as specified by `Limit` and 20 by default) of backup points will be returned.
     * @param req DescribeDiskBackupsRequest
     * @return DescribeDiskBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskBackupsResponse DescribeDiskBackups(DescribeDiskBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskBackupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDiskConfigQuota) is used to query the cloud disk quota.
     * @param req DescribeDiskConfigQuotaRequest
     * @return DescribeDiskConfigQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskConfigQuotaResponse DescribeDiskConfigQuota(DescribeDiskConfigQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskConfigQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskConfigQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskConfigQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口已废弃，切换至云审计接口。见https://tapd.woa.com/pro/prong/stories/view/1010114221880719007

This API has been disused. Use the CloudAudit API instead, For more information, visit https://tapd.woa.com/pro/prong/stories/view/1010114221880719007.

This API is used to query the operation logs of a cloud disk. It will be disused soon. Use [LookUpEvents](https://intl.cloud.tencent.com/document/product/629/12359?from_cn_redirect=1) instead.
     * @param req DescribeDiskOperationLogsRequest
     * @return DescribeDiskOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskOperationLogsResponse DescribeDiskOperationLogs(DescribeDiskOperationLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskOperationLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskOperationLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskOperationLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeDisks) is used to query the list of cloud disks.

* The details of the cloud disk can be queried based on the ID, type or status of the cloud disk. The relationship between different conditions is AND. For more information about filtering, please see the `Filter`.
* If the parameter is empty, a certain number (specified by `Limit`; the default is 20) of cloud disk lists are returned to the current user.
     * @param req DescribeDisksRequest
     * @return DescribeDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksResponse DescribeDisks(DescribeDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeInstancesDiskNum) is used to query the number of cloud disks mounted in the instance.

* Batch operations are supported. If multiple CVM instance IDs are specified, the returned results will list the number of cloud disks mounted on each CVM.
     * @param req DescribeInstancesDiskNumRequest
     * @return DescribeInstancesDiskNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDiskNumResponse DescribeInstancesDiskNum(DescribeInstancesDiskNumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesDiskNumResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesDiskNumResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesDiskNum");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口已废弃，切换至云审计接口。见https://tapd.woa.com/pro/prong/stories/view/1010114221880719007

This API has been disused. Use the CloudAudit API instead, For more information, visit https://tapd.woa.com/pro/prong/stories/view/1010114221880719007.

This API is used to query the operation logs of a snapshot. It will be disused soon. Use [LookUpEvents](https://intl.cloud.tencent.com/document/product/629/12359?from_cn_redirect=1) instead.

     * @param req DescribeSnapshotOperationLogsRequest
     * @return DescribeSnapshotOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotOperationLogsResponse DescribeSnapshotOperationLogs(DescribeSnapshotOperationLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotOperationLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotOperationLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotOperationLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the sharing information of snapshots.
     * @param req DescribeSnapshotSharePermissionRequest
     * @return DescribeSnapshotSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotSharePermissionResponse DescribeSnapshotSharePermission(DescribeSnapshotSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotSharePermissionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotSharePermissionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotSharePermission");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeSnapshots) is used to query the details of snapshots.

* Filter the results by the snapshot ID, the ID of cloud disk, for which the snapshot is created, and the type of cloud disk, for which the snapshot is created. The relationship between different conditions is AND. For more information about filtering, please see `Filter`.
* If the parameter is empty, a certain number (specified by `Limit`; the default is 20) of snapshot lists are returned to the current user.
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unmount one or more cloud disks.

* Batch operation is supported. You can unmount multiple cloud disks from the same CVM in a single request. If any of these cloud disks cannot be unmounted, the operation fails and a specific error code returns.
* This is an async API. A successful request does not mean that the cloud disks have been unmounted successfully. You can call the [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1) API to query the status of cloud disks. When the status changes from `ATTACHED` to `UNATTACHED`, the unmounting is successful.
     * @param req DetachDisksRequest
     * @return DetachDisksResponse
     * @throws TencentCloudSDKException
     */
    public DetachDisksResponse DetachDisks(DetachDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get snapshot overview information.
     * @param req GetSnapOverviewRequest
     * @return GetSnapOverviewResponse
     * @throws TencentCloudSDKException
     */
    public GetSnapOverviewResponse GetSnapOverview(GetSnapOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSnapOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetSnapOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSnapOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reinitialize the cloud disks. Note the following when reinitializing the cloud disks:
1. For a cloud disk created from a snapshot, it is rolled back to the state of the snapshot;
2. For a cloud disk created from the scratch, all data are cleared. Please check and back up the necessary data before the reinitialization;
3. Currently, you can only re-initialize a cloud disk when it’s not attached to a resource and not shared by others;
4. For a cloud disk created from a snapshot, if the snapshot has been deleted, it cannot be reinitialized.
     * @param req InitializeDisksRequest
     * @return InitializeDisksResponse
     * @throws TencentCloudSDKException
     */
    public InitializeDisksResponse InitializeDisks(InitializeDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitializeDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InitializeDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InitializeDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price of a cloud disk after its backup point quota is modified.
     * @param req InquirePriceModifyDiskBackupQuotaRequest
     * @return InquirePriceModifyDiskBackupQuotaResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyDiskBackupQuotaResponse InquirePriceModifyDiskBackupQuota(InquirePriceModifyDiskBackupQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceModifyDiskBackupQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceModifyDiskBackupQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceModifyDiskBackupQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price for adjusting the cloud disk’s extra performance.
     * @param req InquirePriceModifyDiskExtraPerformanceRequest
     * @return InquirePriceModifyDiskExtraPerformanceResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyDiskExtraPerformanceResponse InquirePriceModifyDiskExtraPerformance(InquirePriceModifyDiskExtraPerformanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceModifyDiskExtraPerformanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceModifyDiskExtraPerformanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceModifyDiskExtraPerformance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price of creating cloud disks.

* You can query the price of creating multiple cloud disks in a single request. In this case, the price returned will be the total price.
     * @param req InquiryPriceCreateDisksRequest
     * @return InquiryPriceCreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDisksResponse InquiryPriceCreateDisks(InquiryPriceCreateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the price for expanding cloud disks.
     * @param req InquiryPriceResizeDiskRequest
     * @return InquiryPriceResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResizeDiskResponse InquiryPriceResizeDisk(InquiryPriceResizeDiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResizeDiskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResizeDiskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceResizeDisk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAutoSnapshotPolicyAttribute) is used to modify the attributes of an automatic snapshot policy.

* You can use this API to modify the attributes of a scheduled snapshot policy, including the execution policy, name, and activation.
* When modifying the number of days for retention, you must ensure that there is no clash with the permanent retention attribute. Otherwise, the entire operation will fail and a specific error code will be returned.
     * @param req ModifyAutoSnapshotPolicyAttributeRequest
     * @return ModifyAutoSnapshotPolicyAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoSnapshotPolicyAttributeResponse ModifyAutoSnapshotPolicyAttribute(ModifyAutoSnapshotPolicyAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoSnapshotPolicyAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoSnapshotPolicyAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAutoSnapshotPolicyAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** Only the project ID of elastic cloud disk can be modified. The project ID of the cloud disk created with the CVM is linked with the CVM. The project ID can be can be queried in the Portable field in the output parameters through the API [DescribeDisks](https://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1).
* "Cloud disk name" is only used by users for their management. Tencent Cloud does not use the name as the basis for ticket submission or cloud disk management.
* Batch operations are supported. If multiple cloud disk IDs are specified, all the specified cloud disks must have the same attribute. If there is a cloud disk that does not allow this operation, the operation is not performed and a specific error code is returned.
     * @param req ModifyDiskAttributesRequest
     * @return ModifyDiskAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskAttributesResponse ModifyDiskAttributes(ModifyDiskAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiskAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiskAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDiskAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the cloud disk backup point quota.
     * @param req ModifyDiskBackupQuotaRequest
     * @return ModifyDiskBackupQuotaResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskBackupQuotaResponse ModifyDiskBackupQuota(ModifyDiskBackupQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiskBackupQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiskBackupQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDiskBackupQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to adjust the cloud disk’s extra performance.

* Currently, only Tremendous SSD (CLOUD_TSSD) and Enhanced SSD (CLOUD_HSSD) support extra performance adjustment.
     * @param req ModifyDiskExtraPerformanceRequest
     * @return ModifyDiskExtraPerformanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskExtraPerformanceResponse ModifyDiskExtraPerformance(ModifyDiskExtraPerformanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiskExtraPerformanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiskExtraPerformanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDiskExtraPerformance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifySnapshotAttribute) is used to modify the attributes of a specified snapshot.

* Currently, you can only modify snapshot name and change non-permanent snapshots into permanent snapshots.
* "Snapshot name" is only used by users for their management. Tencent Cloud does not use the name as the basis for ticket submission or snapshot management.
     * @param req ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotAttributeResponse ModifySnapshotAttribute(ModifySnapshotAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySnapshotAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify snapshot sharing information.

After snapshots are shared, the accounts they are shared to can use the snapshot to create cloud disks.
* Each snapshot can be shared to at most 50 accounts.
* You can use a shared snapshot to create cloud disks, but you cannot change its name or description.
* Snapshots can only be shared with accounts in the same region.
* Only data disk snapshots can be shared.
     * @param req ModifySnapshotsSharePermissionRequest
     * @return ModifySnapshotsSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotsSharePermissionResponse ModifySnapshotsSharePermission(ModifySnapshotsSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotsSharePermissionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotsSharePermissionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySnapshotsSharePermission");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to expand the capacity of a cloud disk.

* This API supports only the expansion of elastic cloud disks. To query the type of a cloud disk, you can call the [DescribeDisks](https://intl.cloud.tencent.comhttps://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1?from_cn_redirect=1) API and check the `Portable` field in the response. To expand non-elastic cloud disks, you can call the [ResizeInstanceDisks](https://intl.cloud.tencent.com/document/product/213/15731?from_cn_redirect=1) API.
* This is an async API. A successful return of this API does not mean that the cloud disk has been expanded successfully. You can call the [DescribeDisks](https://intl.cloud.tencent.comhttps://intl.cloud.tencent.com/document/product/362/16315?from_cn_redirect=1?from_cn_redirect=1) API to query the status of a cloud disk. `EXPANDING` indicates that the expansion is in process. 
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResizeDiskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResizeDiskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResizeDisk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return cloud disks.

* You can use this API to return cloud disks you no longer need.
* This API can be used to return pay-as-you-go cloud disks billed on hourly basis. 
* Batch operations are supported. The maximum number of cloud disks in each request is 50. If there is any specified cloud disk that cannot be returned, an error code will be returned.
     * @param req TerminateDisksRequest
     * @return TerminateDisksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDisksResponse TerminateDisks(TerminateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UnbindAutoSnapshotPolicy) is used to unbind the cloud disk from the specified scheduled snapshot policy.

* Batch operations are supported. Multiple cloud disks can be unbound from a snapshot policy at one time. 
* If the passed-in cloud disks are not bound to the current scheduled snapshot policy, they will be skipped. Only cloud disks that are bound to the current scheduled snapshot policy are processed.
     * @param req UnbindAutoSnapshotPolicyRequest
     * @return UnbindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UnbindAutoSnapshotPolicyResponse UnbindAutoSnapshotPolicy(UnbindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindAutoSnapshotPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindAutoSnapshotPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindAutoSnapshotPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
