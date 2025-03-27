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
package com.tencentcloudapi.cfs.v20190719;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cfs.v20190719.models.*;

public class CfsClient extends AbstractClient{
    private static String endpoint = "cfs.intl.tencentcloudapi.com";
    private static String service = "cfs";
    private static String version = "2019-07-19";
    
    public CfsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CfsClient(Credential credential, String region, ClientProfile profile) {
        super(CfsClient.endpoint, CfsClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind one or multiple file systems to a snapshot policy. A file system can be bound to only one policy.
     * @param req BindAutoSnapshotPolicyRequest
     * @return BindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoSnapshotPolicyResponse BindAutoSnapshotPolicy(BindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindAutoSnapshotPolicy", BindAutoSnapshotPolicyResponse.class);
    }

    /**
     *This API is used to create a scheduled snapshot policy.
     * @param req CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoSnapshotPolicyResponse CreateAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoSnapshotPolicy", CreateAutoSnapshotPolicyResponse.class);
    }

    /**
     *This API is used to create a file system.
     * @param req CreateCfsFileSystemRequest
     * @return CreateCfsFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsFileSystemResponse CreateCfsFileSystem(CreateCfsFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCfsFileSystem", CreateCfsFileSystemResponse.class);
    }

    /**
     *This API is used to create a permission group.
     * @param req CreateCfsPGroupRequest
     * @return CreateCfsPGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsPGroupResponse CreateCfsPGroup(CreateCfsPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCfsPGroup", CreateCfsPGroupResponse.class);
    }

    /**
     *This API is used to create a permission group rule.
     * @param req CreateCfsRuleRequest
     * @return CreateCfsRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsRuleResponse CreateCfsRule(CreateCfsRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCfsRule", CreateCfsRuleResponse.class);
    }

    /**
     *This API is used to create a file system snapshot.
     * @param req CreateCfsSnapshotRequest
     * @return CreateCfsSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateCfsSnapshotResponse CreateCfsSnapshot(CreateCfsSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCfsSnapshot", CreateCfsSnapshotResponse.class);
    }

    /**
     *This API is used to create a migration task.
To use this API, submit a ticket for us to add you to the allowlist.
     * @param req CreateMigrationTaskRequest
     * @return CreateMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateMigrationTaskResponse CreateMigrationTask(CreateMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMigrationTask", CreateMigrationTaskResponse.class);
    }

    /**
     *This API is used to delete a scheduled snapshot policy.
     * @param req DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoSnapshotPolicyResponse DeleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAutoSnapshotPolicy", DeleteAutoSnapshotPolicyResponse.class);
    }

    /**
     *This API is used to delete a file system.
     * @param req DeleteCfsFileSystemRequest
     * @return DeleteCfsFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsFileSystemResponse DeleteCfsFileSystem(DeleteCfsFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCfsFileSystem", DeleteCfsFileSystemResponse.class);
    }

    /**
     *This API is used to delete a permission group.
     * @param req DeleteCfsPGroupRequest
     * @return DeleteCfsPGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsPGroupResponse DeleteCfsPGroup(DeleteCfsPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCfsPGroup", DeleteCfsPGroupResponse.class);
    }

    /**
     *This API is used to delete a permission group rule.
     * @param req DeleteCfsRuleRequest
     * @return DeleteCfsRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsRuleResponse DeleteCfsRule(DeleteCfsRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCfsRule", DeleteCfsRuleResponse.class);
    }

    /**
     *This API is used to delete a file system snapshot.
     * @param req DeleteCfsSnapshotRequest
     * @return DeleteCfsSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCfsSnapshotResponse DeleteCfsSnapshot(DeleteCfsSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCfsSnapshot", DeleteCfsSnapshotResponse.class);
    }

    /**
     *This API is used to delete a migration task.
To use this API, submit a ticket for us to add you to the allowlist.
     * @param req DeleteMigrationTaskRequest
     * @return DeleteMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMigrationTaskResponse DeleteMigrationTask(DeleteMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMigrationTask", DeleteMigrationTaskResponse.class);
    }

    /**
     *This API is used to delete a mount target.
     * @param req DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMountTargetResponse DeleteMountTarget(DeleteMountTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMountTarget", DeleteMountTargetResponse.class);
    }

    /**
     *This API is used to query the list of scheduled snapshot policies of a file system.
     * @param req DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoSnapshotPoliciesResponse DescribeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoSnapshotPolicies", DescribeAutoSnapshotPoliciesResponse.class);
    }

    /**
     *This API is used to query the availability of a region.
     * @param req DescribeAvailableZoneInfoRequest
     * @return DescribeAvailableZoneInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableZoneInfoResponse DescribeAvailableZoneInfo(DescribeAvailableZoneInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableZoneInfo", DescribeAvailableZoneInfoResponse.class);
    }

    /**
     *This API is used to get the list of data source buckets.
To use this API, submit a ticket for us to add you to the allowlist.
     * @param req DescribeBucketListRequest
     * @return DescribeBucketListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBucketListResponse DescribeBucketList(DescribeBucketListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBucketList", DescribeBucketListResponse.class);
    }

    /**
     *This API is used to query clients on which this file system is mounted. To do so, the client needs to have the CFS monitoring plugin installed.
     * @param req DescribeCfsFileSystemClientsRequest
     * @return DescribeCfsFileSystemClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsFileSystemClientsResponse DescribeCfsFileSystemClients(DescribeCfsFileSystemClientsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsFileSystemClients", DescribeCfsFileSystemClientsResponse.class);
    }

    /**
     *This API is used to query file systems.
     * @param req DescribeCfsFileSystemsRequest
     * @return DescribeCfsFileSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsFileSystemsResponse DescribeCfsFileSystems(DescribeCfsFileSystemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsFileSystems", DescribeCfsFileSystemsResponse.class);
    }

    /**
     *This API is used to query the list of permission groups.
     * @param req DescribeCfsPGroupsRequest
     * @return DescribeCfsPGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsPGroupsResponse DescribeCfsPGroups(DescribeCfsPGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsPGroups", DescribeCfsPGroupsResponse.class);
    }

    /**
     *This API is used to query the list of permission group rules.
     * @param req DescribeCfsRulesRequest
     * @return DescribeCfsRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsRulesResponse DescribeCfsRules(DescribeCfsRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsRules", DescribeCfsRulesResponse.class);
    }

    /**
     *This API is used to query the status of the CFS service.
     * @param req DescribeCfsServiceStatusRequest
     * @return DescribeCfsServiceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsServiceStatusResponse DescribeCfsServiceStatus(DescribeCfsServiceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsServiceStatus", DescribeCfsServiceStatusResponse.class);
    }

    /**
     *This API is used to get the snapshot overview of a file system.
     * @param req DescribeCfsSnapshotOverviewRequest
     * @return DescribeCfsSnapshotOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsSnapshotOverviewResponse DescribeCfsSnapshotOverview(DescribeCfsSnapshotOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsSnapshotOverview", DescribeCfsSnapshotOverviewResponse.class);
    }

    /**
     *This API is used to query the list of snapshots of a file system.
     * @param req DescribeCfsSnapshotsRequest
     * @return DescribeCfsSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfsSnapshotsResponse DescribeCfsSnapshots(DescribeCfsSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfsSnapshots", DescribeCfsSnapshotsResponse.class);
    }

    /**
     *This API is used to get the list of migration tasks.
To use this API, submit a ticket for us to add you to the allowlist.
     * @param req DescribeMigrationTasksRequest
     * @return DescribeMigrationTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationTasksResponse DescribeMigrationTasks(DescribeMigrationTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMigrationTasks", DescribeMigrationTasksResponse.class);
    }

    /**
     *This API is used to query the mount targets of a file system.
     * @param req DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountTargetsResponse DescribeMountTargets(DescribeMountTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMountTargets", DescribeMountTargetsResponse.class);
    }

    /**
     *This API is used to query the operation logs of a snapshot.
     * @param req DescribeSnapshotOperationLogsRequest
     * @return DescribeSnapshotOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotOperationLogsResponse DescribeSnapshotOperationLogs(DescribeSnapshotOperationLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotOperationLogs", DescribeSnapshotOperationLogsResponse.class);
    }

    /**
     *This API is used to modify the scaling policy of a file system.
     * @param req ModifyFileSystemAutoScaleUpRuleRequest
     * @return ModifyFileSystemAutoScaleUpRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileSystemAutoScaleUpRuleResponse ModifyFileSystemAutoScaleUpRule(ModifyFileSystemAutoScaleUpRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileSystemAutoScaleUpRule", ModifyFileSystemAutoScaleUpRuleResponse.class);
    }

    /**
     *This API is used to scale up a Turbo file system.
     * @param req ScaleUpFileSystemRequest
     * @return ScaleUpFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public ScaleUpFileSystemResponse ScaleUpFileSystem(ScaleUpFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleUpFileSystem", ScaleUpFileSystemResponse.class);
    }

    /**
     *This API is used to activate the CFS service.
     * @param req SignUpCfsServiceRequest
     * @return SignUpCfsServiceResponse
     * @throws TencentCloudSDKException
     */
    public SignUpCfsServiceResponse SignUpCfsService(SignUpCfsServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SignUpCfsService", SignUpCfsServiceResponse.class);
    }

    /**
     *This API is used to stop a migration task.
To use this API, submit a ticket for us to add you to the allowlist.
     * @param req StopMigrationTaskRequest
     * @return StopMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopMigrationTaskResponse StopMigrationTask(StopMigrationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopMigrationTask", StopMigrationTaskResponse.class);
    }

    /**
     *This API is used to unbind a snapshot policy from a file system.
     * @param req UnbindAutoSnapshotPolicyRequest
     * @return UnbindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UnbindAutoSnapshotPolicyResponse UnbindAutoSnapshotPolicy(UnbindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindAutoSnapshotPolicy", UnbindAutoSnapshotPolicyResponse.class);
    }

    /**
     *This API is used to update a scheduled snapshot policy.
     * @param req UpdateAutoSnapshotPolicyRequest
     * @return UpdateAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAutoSnapshotPolicyResponse UpdateAutoSnapshotPolicy(UpdateAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAutoSnapshotPolicy", UpdateAutoSnapshotPolicyResponse.class);
    }

    /**
     *This API is used to update a file system name.
     * @param req UpdateCfsFileSystemNameRequest
     * @return UpdateCfsFileSystemNameResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsFileSystemNameResponse UpdateCfsFileSystemName(UpdateCfsFileSystemNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsFileSystemName", UpdateCfsFileSystemNameResponse.class);
    }

    /**
     *This API is used to update the permission group used by a file system.
     * @param req UpdateCfsFileSystemPGroupRequest
     * @return UpdateCfsFileSystemPGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsFileSystemPGroupResponse UpdateCfsFileSystemPGroup(UpdateCfsFileSystemPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsFileSystemPGroup", UpdateCfsFileSystemPGroupResponse.class);
    }

    /**
     *This API is used to update the capacity limit of a file system.
     * @param req UpdateCfsFileSystemSizeLimitRequest
     * @return UpdateCfsFileSystemSizeLimitResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsFileSystemSizeLimitResponse UpdateCfsFileSystemSizeLimit(UpdateCfsFileSystemSizeLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsFileSystemSizeLimit", UpdateCfsFileSystemSizeLimitResponse.class);
    }

    /**
     *This API is used to update the information of a permission group.
     * @param req UpdateCfsPGroupRequest
     * @return UpdateCfsPGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsPGroupResponse UpdateCfsPGroup(UpdateCfsPGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsPGroup", UpdateCfsPGroupResponse.class);
    }

    /**
     *This API is used to update a permission rule.
     * @param req UpdateCfsRuleRequest
     * @return UpdateCfsRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsRuleResponse UpdateCfsRule(UpdateCfsRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsRule", UpdateCfsRuleResponse.class);
    }

    /**
     *This API is used to update the name and retention period of a file system snapshot.
     * @param req UpdateCfsSnapshotAttributeRequest
     * @return UpdateCfsSnapshotAttributeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCfsSnapshotAttributeResponse UpdateCfsSnapshotAttribute(UpdateCfsSnapshotAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCfsSnapshotAttribute", UpdateCfsSnapshotAttributeResponse.class);
    }

}
