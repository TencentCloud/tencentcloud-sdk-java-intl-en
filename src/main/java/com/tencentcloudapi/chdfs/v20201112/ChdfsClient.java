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
package com.tencentcloudapi.chdfs.v20201112;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.chdfs.v20201112.models.*;

public class ChdfsClient extends AbstractClient{
    private static String endpoint = "chdfs.tencentcloudapi.com";
    private static String service = "chdfs";
    private static String version = "2020-11-12";
    
    public ChdfsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ChdfsClient(Credential credential, String region, ClientProfile profile) {
        super(ChdfsClient.endpoint, ChdfsClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind multiple permission groups to a mount point.
     * @param req AssociateAccessGroupsRequest
     * @return AssociateAccessGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAccessGroupsResponse AssociateAccessGroups(AssociateAccessGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateAccessGroups", AssociateAccessGroupsResponse.class);
    }

    /**
     *This API is used to create a permission group.
     * @param req CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessGroupResponse CreateAccessGroup(CreateAccessGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessGroup", CreateAccessGroupResponse.class);
    }

    /**
     *This API is used to batch create permission rules. You don't need to enter the permission rule IDs and creation time.
     * @param req CreateAccessRulesRequest
     * @return CreateAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessRulesResponse CreateAccessRules(CreateAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessRules", CreateAccessRulesResponse.class);
    }

    /**
     *This API is used to create a file system (asynchronously).
     * @param req CreateFileSystemRequest
     * @return CreateFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileSystemResponse CreateFileSystem(CreateFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileSystem", CreateFileSystemResponse.class);
    }

    /**
     *This API is used to batch create lifecycle rules. You don't need to enter the lifecycle rule IDs and creation time.
     * @param req CreateLifeCycleRulesRequest
     * @return CreateLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateLifeCycleRulesResponse CreateLifeCycleRules(CreateLifeCycleRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLifeCycleRules", CreateLifeCycleRulesResponse.class);
    }

    /**
     *This API is used to create a mount point for a successfully created file system.
     * @param req CreateMountPointRequest
     * @return CreateMountPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateMountPointResponse CreateMountPoint(CreateMountPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMountPoint", CreateMountPointResponse.class);
    }

    /**
     *This API is used to batch create restoration tasks. You don't need to enter the restoration task IDs, status, and creation time.
     * @param req CreateRestoreTasksRequest
     * @return CreateRestoreTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateRestoreTasksResponse CreateRestoreTasks(CreateRestoreTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRestoreTasks", CreateRestoreTasksResponse.class);
    }

    /**
     *This API is used to delete a permission group.
     * @param req DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessGroupResponse DeleteAccessGroup(DeleteAccessGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccessGroup", DeleteAccessGroupResponse.class);
    }

    /**
     *This API is used to batch delete permission rules.
     * @param req DeleteAccessRulesRequest
     * @return DeleteAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessRulesResponse DeleteAccessRules(DeleteAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccessRules", DeleteAccessRulesResponse.class);
    }

    /**
     *This API is used to delete a file system. Non-empty file systems cannot be deleted.
     * @param req DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileSystemResponse DeleteFileSystem(DeleteFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFileSystem", DeleteFileSystemResponse.class);
    }

    /**
     *This API is used to batch delete lifecycle rules.
     * @param req DeleteLifeCycleRulesRequest
     * @return DeleteLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLifeCycleRulesResponse DeleteLifeCycleRules(DeleteLifeCycleRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLifeCycleRules", DeleteLifeCycleRulesResponse.class);
    }

    /**
     *This API is used to delete a mount point.
     * @param req DeleteMountPointRequest
     * @return DeleteMountPointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMountPointResponse DeleteMountPoint(DeleteMountPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMountPoint", DeleteMountPointResponse.class);
    }

    /**
     *This API is used to view the details of a permission group.
     * @param req DescribeAccessGroupRequest
     * @return DescribeAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessGroupResponse DescribeAccessGroup(DescribeAccessGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessGroup", DescribeAccessGroupResponse.class);
    }

    /**
     *This API is used to view the list of permission groups.
     * @param req DescribeAccessGroupsRequest
     * @return DescribeAccessGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessGroupsResponse DescribeAccessGroups(DescribeAccessGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessGroups", DescribeAccessGroupsResponse.class);
    }

    /**
     *This API is used to view the list of permission rules by permission group ID.
     * @param req DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRulesResponse DescribeAccessRules(DescribeAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessRules", DescribeAccessRulesResponse.class);
    }

    /**
     *This API is used to view the details of a file system.
     * @param req DescribeFileSystemRequest
     * @return DescribeFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemResponse DescribeFileSystem(DescribeFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileSystem", DescribeFileSystemResponse.class);
    }

    /**
     *This API is used to view the list of file systems.
     * @param req DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemsResponse DescribeFileSystems(DescribeFileSystemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileSystems", DescribeFileSystemsResponse.class);
    }

    /**
     *This API is used to view the list of lifecycle rules by file system ID.
     * @param req DescribeLifeCycleRulesRequest
     * @return DescribeLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLifeCycleRulesResponse DescribeLifeCycleRules(DescribeLifeCycleRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLifeCycleRules", DescribeLifeCycleRulesResponse.class);
    }

    /**
     *This API is used to view the details of a mount point.
     * @param req DescribeMountPointRequest
     * @return DescribeMountPointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountPointResponse DescribeMountPoint(DescribeMountPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMountPoint", DescribeMountPointResponse.class);
    }

    /**
     *This API is used to view the list of mount points.
     * @param req DescribeMountPointsRequest
     * @return DescribeMountPointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountPointsResponse DescribeMountPoints(DescribeMountPointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMountPoints", DescribeMountPointsResponse.class);
    }

    /**
     *This API is used to view the list of resource tags by file system ID.
     * @param req DescribeResourceTagsRequest
     * @return DescribeResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsResponse DescribeResourceTags(DescribeResourceTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTags", DescribeResourceTagsResponse.class);
    }

    /**
     *This API is used to view the list of restoration tasks by file system ID.
     * @param req DescribeRestoreTasksRequest
     * @return DescribeRestoreTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRestoreTasksResponse DescribeRestoreTasks(DescribeRestoreTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRestoreTasks", DescribeRestoreTasksResponse.class);
    }

    /**
     *This API is used to unbind multiple permission groups from a mount point.
     * @param req DisassociateAccessGroupsRequest
     * @return DisassociateAccessGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAccessGroupsResponse DisassociateAccessGroups(DisassociateAccessGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateAccessGroups", DisassociateAccessGroupsResponse.class);
    }

    /**
     *This API is used to modify the attributes of a permission group.
     * @param req ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessGroupResponse ModifyAccessGroup(ModifyAccessGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessGroup", ModifyAccessGroupResponse.class);
    }

    /**
     *This API is used to batch modify the attributes of permission rules, such as address, access mode, and priority. You must specify the permission rule IDs.
     * @param req ModifyAccessRulesRequest
     * @return ModifyAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessRulesResponse ModifyAccessRules(ModifyAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessRules", ModifyAccessRulesResponse.class);
    }

    /**
     *This API is used to modify the attributes of a successfully created file system.
     * @param req ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileSystemResponse ModifyFileSystem(ModifyFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileSystem", ModifyFileSystemResponse.class);
    }

    /**
     *This API is used to batch modify the attributes of lifecycle rules, such as name, path, transition list, and status. You must specify the lifecycle rule IDs.
     * @param req ModifyLifeCycleRulesRequest
     * @return ModifyLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLifeCycleRulesResponse ModifyLifeCycleRules(ModifyLifeCycleRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLifeCycleRules", ModifyLifeCycleRulesResponse.class);
    }

    /**
     *This API is used to modify the attributes of a mount point.
     * @param req ModifyMountPointRequest
     * @return ModifyMountPointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMountPointResponse ModifyMountPoint(ModifyMountPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMountPoint", ModifyMountPointResponse.class);
    }

    /**
     *This API is used to modify the list of resource tags by overwriting them all.
     * @param req ModifyResourceTagsRequest
     * @return ModifyResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceTagsResponse ModifyResourceTags(ModifyResourceTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceTags", ModifyResourceTagsResponse.class);
    }

}
