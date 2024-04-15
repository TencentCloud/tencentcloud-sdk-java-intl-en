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
package com.tencentcloudapi.redis.v20180412;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.redis.v20180412.models.*;

public class RedisClient extends AbstractClient{
    private static String endpoint = "redis.tencentcloudapi.com";
    private static String service = "redis";
    private static String version = "2018-04-12";
    
    public RedisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RedisClient(Credential credential, String region, ClientProfile profile) {
        super(RedisClient.endpoint, RedisClient.version, credential, region, profile);
    }

    /**
     *This API is used to add replication group members.
     * @param req AddReplicationInstanceRequest
     * @return AddReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public AddReplicationInstanceResponse AddReplicationInstance(AddReplicationInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddReplicationInstance", AddReplicationInstanceResponse.class);
    }

    /**
     *This API is used to enable public network access.
     * @param req AllocateWanAddressRequest
     * @return AllocateWanAddressResponse
     * @throws TencentCloudSDKException
     */
    public AllocateWanAddressResponse AllocateWanAddress(AllocateWanAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateWanAddress", AllocateWanAddressResponse.class);
    }

    /**
     *This API is used to apply a parameter template to instances.
     * @param req ApplyParamsTemplateRequest
     * @return ApplyParamsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ApplyParamsTemplateResponse ApplyParamsTemplate(ApplyParamsTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyParamsTemplate", ApplyParamsTemplateResponse.class);
    }

    /**
     *This API is used to bind a security group to instances in batches.
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify the role of an instance in a replication group.
     * @param req ChangeInstanceRoleRequest
     * @return ChangeInstanceRoleResponse
     * @throws TencentCloudSDKException
     */
    public ChangeInstanceRoleResponse ChangeInstanceRole(ChangeInstanceRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeInstanceRole", ChangeInstanceRoleResponse.class);
    }

    /**
     *This API is used to set a read-only instance in a replication group as a master instance.
     * @param req ChangeMasterInstanceRequest
     * @return ChangeMasterInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ChangeMasterInstanceResponse ChangeMasterInstance(ChangeMasterInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeMasterInstance", ChangeMasterInstanceResponse.class);
    }

    /**
     *This API is used to promote a replica node group to a master node group or a replica node to a master node for an instance.
     * @param req ChangeReplicaToMasterRequest
     * @return ChangeReplicaToMasterResponse
     * @throws TencentCloudSDKException
     */
    public ChangeReplicaToMasterResponse ChangeReplicaToMaster(ChangeReplicaToMasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeReplicaToMaster", ChangeReplicaToMasterResponse.class);
    }

    /**
     *This API is used to eliminate an instance in the recycle bin immediately.
     * @param req CleanUpInstanceRequest
     * @return CleanUpInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CleanUpInstanceResponse CleanUpInstance(CleanUpInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CleanUpInstance", CleanUpInstanceResponse.class);
    }

    /**
     *This API is used to clear the data of a Redis instance.
     * @param req ClearInstanceRequest
     * @return ClearInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ClearInstanceResponse ClearInstance(ClearInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ClearInstance", ClearInstanceResponse.class);
    }

    /**
     *This API is used to clone a complete new instance based on the current instance backup file.
     * @param req CloneInstancesRequest
     * @return CloneInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CloneInstancesResponse CloneInstances(CloneInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneInstances", CloneInstancesResponse.class);
    }

    /**
     *This API is used to disable SSL.
     * @param req CloseSSLRequest
     * @return CloseSSLResponse
     * @throws TencentCloudSDKException
     */
    public CloseSSLResponse CloseSSL(CloseSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseSSL", CloseSSLResponse.class);
    }

    /**
     *This API is used to customize the account for accessing the instance.
     * @param req CreateInstanceAccountRequest
     * @return CreateInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceAccountResponse CreateInstanceAccount(CreateInstanceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceAccount", CreateInstanceAccountResponse.class);
    }

    /**
     *This API is used to create an TencentDB or Redis instance.
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstances", CreateInstancesResponse.class);
    }

    /**
     *This API is used to create a parameter template.
     * @param req CreateParamTemplateRequest
     * @return CreateParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateParamTemplateResponse CreateParamTemplate(CreateParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateParamTemplate", CreateParamTemplateResponse.class);
    }

    /**
     *This API is used to create a replication group.
     * @param req CreateReplicationGroupRequest
     * @return CreateReplicationGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateReplicationGroupResponse CreateReplicationGroup(CreateReplicationGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReplicationGroup", CreateReplicationGroupResponse.class);
    }

    /**
     *This API is used to delete an instance sub-account.
     * @param req DeleteInstanceAccountRequest
     * @return DeleteInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceAccountResponse DeleteInstanceAccount(DeleteInstanceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstanceAccount", DeleteInstanceAccountResponse.class);
    }

    /**
     *This API is used to delete a parameter template.
     * @param req DeleteParamTemplateRequest
     * @return DeleteParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteParamTemplateResponse DeleteParamTemplate(DeleteParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteParamTemplate", DeleteParamTemplateResponse.class);
    }

    /**
     *This API is used to remove replication group members. Note: The API is being deprecated. Please use RemoveReplicationInstance instead.
     * @param req DeleteReplicationInstanceRequest
     * @return DeleteReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReplicationInstanceResponse DeleteReplicationInstance(DeleteReplicationInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReplicationInstance", DeleteReplicationInstanceResponse.class);
    }

    /**
     *This API is used to get the configuration rules for an automatic backup.
     * @param req DescribeAutoBackupConfigRequest
     * @return DescribeAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoBackupConfigResponse DescribeAutoBackupConfig(DescribeAutoBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoBackupConfig", DescribeAutoBackupConfigResponse.class);
    }

    /**
     *This API is used to query the download address for a database backup file in the current region.
     * @param req DescribeBackupDownloadRestrictionRequest
     * @return DescribeBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadRestrictionResponse DescribeBackupDownloadRestriction(DescribeBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadRestriction", DescribeBackupDownloadRestrictionResponse.class);
    }

    /**
     *This API is used to query the download address of a backup RDB file.
     * @param req DescribeBackupUrlRequest
     * @return DescribeBackupUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupUrlResponse DescribeBackupUrl(DescribeBackupUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupUrl", DescribeBackupUrlResponse.class);
    }

    /**
     *This API is used to query the information of instance bandwidth.
     * @param req DescribeBandwidthRangeRequest
     * @return DescribeBandwidthRangeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthRangeResponse DescribeBandwidthRange(DescribeBandwidthRangeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBandwidthRange", DescribeBandwidthRangeResponse.class);
    }

    /**
     *This API has been disused. It was used to query the list of Redis instance information.
     * @param req DescribeCommonDBInstancesRequest
     * @return DescribeCommonDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCommonDBInstancesResponse DescribeCommonDBInstances(DescribeCommonDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCommonDBInstances", DescribeCommonDBInstancesResponse.class);
    }

    /**
     *This API is used to query the security group details of an instance.
     * @param req DescribeDBSecurityGroupsRequest
     * @return DescribeDBSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSecurityGroupsResponse DescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBSecurityGroups", DescribeDBSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the information of an instance sub-account.
     * @param req DescribeInstanceAccountRequest
     * @return DescribeInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAccountResponse DescribeInstanceAccount(DescribeInstanceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceAccount", DescribeInstanceAccountResponse.class);
    }

    /**
     *This API is used to query the backup list of an instance.
     * @param req DescribeInstanceBackupsRequest
     * @return DescribeInstanceBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceBackupsResponse DescribeInstanceBackups(DescribeInstanceBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceBackups", DescribeInstanceBackupsResponse.class);
    }

    /**
     *This API is used to query the DTS task details of an instance.
     * @param req DescribeInstanceDTSInfoRequest
     * @return DescribeInstanceDTSInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDTSInfoResponse DescribeInstanceDTSInfo(DescribeInstanceDTSInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDTSInfo", DescribeInstanceDTSInfoResponse.class);
    }

    /**
     *This API is used to query the order information.
     * @param req DescribeInstanceDealDetailRequest
     * @return DescribeInstanceDealDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceDealDetailResponse DescribeInstanceDealDetail(DescribeInstanceDealDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceDealDetail", DescribeInstanceDealDetailResponse.class);
    }

    /**
     *This API is used to query the event information on a TecentDB for Redis instance.
     * @param req DescribeInstanceEventsRequest
     * @return DescribeInstanceEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceEventsResponse DescribeInstanceEvents(DescribeInstanceEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceEvents", DescribeInstanceEventsResponse.class);
    }

    /**
     *The API for querying big keys of a TencentDB for Redis instance was disused on October 31, 2022. For more information, see [API for Querying Instance Big Key Will Be Disused](https://intl.cloud.tencent.com/document/product/239/81005?from_cn_redirect=1).
     * @param req DescribeInstanceMonitorBigKeyRequest
     * @return DescribeInstanceMonitorBigKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeyResponse DescribeInstanceMonitorBigKey(DescribeInstanceMonitorBigKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorBigKey", DescribeInstanceMonitorBigKeyResponse.class);
    }

    /**
     *The API for querying big keys of a TencentDB for Redis instance was disused on October 31, 2022. For more information, see [API for Querying Instance Big Key Will Be Disused](https://intl.cloud.tencent.com/document/product/239/81005?from_cn_redirect=1).
     * @param req DescribeInstanceMonitorBigKeySizeDistRequest
     * @return DescribeInstanceMonitorBigKeySizeDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeySizeDistResponse DescribeInstanceMonitorBigKeySizeDist(DescribeInstanceMonitorBigKeySizeDistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorBigKeySizeDist", DescribeInstanceMonitorBigKeySizeDistResponse.class);
    }

    /**
     *The API for querying big keys of a TencentDB for Redis instance was disused on October 31, 2022. For more information, see [API for Querying Instance Big Key Will Be Disused](https://intl.cloud.tencent.com/document/product/239/81005?from_cn_redirect=1).
     * @param req DescribeInstanceMonitorBigKeyTypeDistRequest
     * @return DescribeInstanceMonitorBigKeyTypeDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorBigKeyTypeDistResponse DescribeInstanceMonitorBigKeyTypeDist(DescribeInstanceMonitorBigKeyTypeDistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorBigKeyTypeDist", DescribeInstanceMonitorBigKeyTypeDistResponse.class);
    }

    /**
     *This API is used to query the hot key of an instance.
     * @param req DescribeInstanceMonitorHotKeyRequest
     * @return DescribeInstanceMonitorHotKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorHotKeyResponse DescribeInstanceMonitorHotKey(DescribeInstanceMonitorHotKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorHotKey", DescribeInstanceMonitorHotKeyResponse.class);
    }

    /**
     *This API is used to query the access source information of an instance.
     * @param req DescribeInstanceMonitorSIPRequest
     * @return DescribeInstanceMonitorSIPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorSIPResponse DescribeInstanceMonitorSIP(DescribeInstanceMonitorSIPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorSIP", DescribeInstanceMonitorSIPResponse.class);
    }

    /**
     *This API is used to query the distribution of instance access duration.
     * @param req DescribeInstanceMonitorTookDistRequest
     * @return DescribeInstanceMonitorTookDistResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTookDistResponse DescribeInstanceMonitorTookDist(DescribeInstanceMonitorTookDistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorTookDist", DescribeInstanceMonitorTookDistResponse.class);
    }

    /**
     *This API is used to query an instance access command.
     * @param req DescribeInstanceMonitorTopNCmdRequest
     * @return DescribeInstanceMonitorTopNCmdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTopNCmdResponse DescribeInstanceMonitorTopNCmd(DescribeInstanceMonitorTopNCmdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorTopNCmd", DescribeInstanceMonitorTopNCmdResponse.class);
    }

    /**
     *This API is used to query the instance CPU time.
     * @param req DescribeInstanceMonitorTopNCmdTookRequest
     * @return DescribeInstanceMonitorTopNCmdTookResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceMonitorTopNCmdTookResponse DescribeInstanceMonitorTopNCmdTook(DescribeInstanceMonitorTopNCmdTookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceMonitorTopNCmdTook", DescribeInstanceMonitorTopNCmdTookResponse.class);
    }

    /**
     *This API is used to query the information of an instance node.
     * @param req DescribeInstanceNodeInfoRequest
     * @return DescribeInstanceNodeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceNodeInfoResponse DescribeInstanceNodeInfo(DescribeInstanceNodeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceNodeInfo", DescribeInstanceNodeInfoResponse.class);
    }

    /**
     *This API is used to query the list of parameter modifications.
     * @param req DescribeInstanceParamRecordsRequest
     * @return DescribeInstanceParamRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamRecordsResponse DescribeInstanceParamRecords(DescribeInstanceParamRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParamRecords", DescribeInstanceParamRecordsResponse.class);
    }

    /**
     *This API is used to query the parameter list of an instance.
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *This API is used to query the security group information of an instance.
     * @param req DescribeInstanceSecurityGroupRequest
     * @return DescribeInstanceSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSecurityGroupResponse DescribeInstanceSecurityGroup(DescribeInstanceSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSecurityGroup", DescribeInstanceSecurityGroupResponse.class);
    }

    /**
     *This API is used to get the shard information of the instance on cluster architecture.
     * @param req DescribeInstanceShardsRequest
     * @return DescribeInstanceShardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceShardsResponse DescribeInstanceShards(DescribeInstanceShardsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceShards", DescribeInstanceShardsResponse.class);
    }

    /**
     *This API (DescribeInstanceSupportFeature) is used to query the supported features of the instance.
     * @param req DescribeInstanceSupportFeatureRequest
     * @return DescribeInstanceSupportFeatureResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceSupportFeatureResponse DescribeInstanceSupportFeature(DescribeInstanceSupportFeatureRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceSupportFeature", DescribeInstanceSupportFeatureResponse.class);
    }

    /**
     *This API is used to query the details of a Redis node.
     * @param req DescribeInstanceZoneInfoRequest
     * @return DescribeInstanceZoneInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceZoneInfoResponse DescribeInstanceZoneInfo(DescribeInstanceZoneInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceZoneInfo", DescribeInstanceZoneInfoResponse.class);
    }

    /**
     *This API is used to query the list of Redis instances.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to query instance maintenance window. The maintenance window specifies a time period during which compatible version upgrade, architecture upgrade, backend maintenance, and other operations can be performed to avoid affecting business.
     * @param req DescribeMaintenanceWindowRequest
     * @return DescribeMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMaintenanceWindowResponse DescribeMaintenanceWindow(DescribeMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMaintenanceWindow", DescribeMaintenanceWindowResponse.class);
    }

    /**
     *This API is used to query the details of a parameter template.
     * @param req DescribeParamTemplateInfoRequest
     * @return DescribeParamTemplateInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplateInfoResponse DescribeParamTemplateInfo(DescribeParamTemplateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplateInfo", DescribeParamTemplateInfoResponse.class);
    }

    /**
     *This API is used to query the list of parameter templates.
     * @param req DescribeParamTemplatesRequest
     * @return DescribeParamTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeParamTemplatesResponse DescribeParamTemplates(DescribeParamTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeParamTemplates", DescribeParamTemplatesResponse.class);
    }

    /**
     *This API is used to query purchasable TencentDB for Redis specifications in all regions.
     * @param req DescribeProductInfoRequest
     * @return DescribeProductInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductInfoResponse DescribeProductInfo(DescribeProductInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductInfo", DescribeProductInfoResponse.class);
    }

    /**
     *This API is used to query the security group information of a project.
     * @param req DescribeProjectSecurityGroupRequest
     * @return DescribeProjectSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupResponse DescribeProjectSecurityGroup(DescribeProjectSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroup", DescribeProjectSecurityGroupResponse.class);
    }

    /**
     *This API is used to query the security group details of a project.
     * @param req DescribeProjectSecurityGroupsRequest
     * @return DescribeProjectSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectSecurityGroupsResponse DescribeProjectSecurityGroups(DescribeProjectSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectSecurityGroups", DescribeProjectSecurityGroupsResponse.class);
    }

    /**
     *This API is used to query the slow queries of the proxy.
     * @param req DescribeProxySlowLogRequest
     * @return DescribeProxySlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProxySlowLogResponse DescribeProxySlowLog(DescribeProxySlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProxySlowLog", DescribeProxySlowLogResponse.class);
    }

    /**
     *This API is used to query a replication group.
     * @param req DescribeReplicationGroupRequest
     * @return DescribeReplicationGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReplicationGroupResponse DescribeReplicationGroup(DescribeReplicationGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReplicationGroup", DescribeReplicationGroupResponse.class);
    }

    /**
     *This API is used to query the SSL authentication information of an instance, such as enablement status, configuration status, and certificate address.
     * @param req DescribeSSLStatusRequest
     * @return DescribeSSLStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSSLStatusResponse DescribeSSLStatus(DescribeSSLStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSSLStatus", DescribeSSLStatusResponse.class);
    }

    /**
     *This API is used to query the records of slow query.
     * @param req DescribeSlowLogRequest
     * @return DescribeSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogResponse DescribeSlowLog(DescribeSlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLog", DescribeSlowLogResponse.class);
    }

    /**
     *This API is used to get the execution of a specified task.
     * @param req DescribeTaskInfoRequest
     * @return DescribeTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInfoResponse DescribeTaskInfo(DescribeTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskInfo", DescribeTaskInfoResponse.class);
    }

    /**
     *This API is used to query the task list information of a specified instance.
     * @param req DescribeTaskListRequest
     * @return DescribeTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskListResponse DescribeTaskList(DescribeTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskList", DescribeTaskListResponse.class);
    }

    /**
     *This API is used to query slow queries of a Tendis instance.
     * @param req DescribeTendisSlowLogRequest
     * @return DescribeTendisSlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTendisSlowLogResponse DescribeTendisSlowLog(DescribeTendisSlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTendisSlowLog", DescribeTendisSlowLogResponse.class);
    }

    /**
     *This API is used to terminate a pay-as-you-go instance.
     * @param req DestroyPostpaidInstanceRequest
     * @return DestroyPostpaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPostpaidInstanceResponse DestroyPostpaidInstance(DestroyPostpaidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPostpaidInstance", DestroyPostpaidInstanceResponse.class);
    }

    /**
     *This API is used to return a monthly subscribed instance.
     * @param req DestroyPrepaidInstanceRequest
     * @return DestroyPrepaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DestroyPrepaidInstanceResponse DestroyPrepaidInstance(DestroyPrepaidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyPrepaidInstance", DestroyPrepaidInstanceResponse.class);
    }

    /**
     *This API is used to disable read/write separation.
     * @param req DisableReplicaReadonlyRequest
     * @return DisableReplicaReadonlyResponse
     * @throws TencentCloudSDKException
     */
    public DisableReplicaReadonlyResponse DisableReplicaReadonly(DisableReplicaReadonlyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableReplicaReadonly", DisableReplicaReadonlyResponse.class);
    }

    /**
     *This API is used to unbind a security group from instances in batches.
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *This API is used to enable read/write separation.
     * @param req EnableReplicaReadonlyRequest
     * @return EnableReplicaReadonlyResponse
     * @throws TencentCloudSDKException
     */
    public EnableReplicaReadonlyResponse EnableReplicaReadonly(EnableReplicaReadonlyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableReplicaReadonly", EnableReplicaReadonlyResponse.class);
    }

    /**
     *This API is used to query the price for purchasing an instance.
     * @param req InquiryPriceCreateInstanceRequest
     * @return InquiryPriceCreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateInstanceResponse InquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateInstance", InquiryPriceCreateInstanceResponse.class);
    }

    /**
     *This API is used to query the price for scaling an instance.
     * @param req InquiryPriceUpgradeInstanceRequest
     * @return InquiryPriceUpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceUpgradeInstanceResponse InquiryPriceUpgradeInstance(InquiryPriceUpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceUpgradeInstance", InquiryPriceUpgradeInstanceResponse.class);
    }

    /**
     *This API is used to simulate the failure.
     * @param req KillMasterGroupRequest
     * @return KillMasterGroupResponse
     * @throws TencentCloudSDKException
     */
    public KillMasterGroupResponse KillMasterGroup(KillMasterGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillMasterGroup", KillMasterGroupResponse.class);
    }

    /**
     *This API is used to manually back up a Redis instance.
     * @param req ManualBackupInstanceRequest
     * @return ManualBackupInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ManualBackupInstanceResponse ManualBackupInstance(ManualBackupInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManualBackupInstance", ManualBackupInstanceResponse.class);
    }

    /**
     *This API is used to modify the access password for an instance.
     * @param req ModfiyInstancePasswordRequest
     * @return ModfiyInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModfiyInstancePasswordResponse ModfiyInstancePassword(ModfiyInstancePasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModfiyInstancePassword", ModfiyInstancePasswordResponse.class);
    }

    /**
     *This API is used to set the configuration for an automatic backup.
     * @param req ModifyAutoBackupConfigRequest
     * @return ModifyAutoBackupConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoBackupConfigResponse ModifyAutoBackupConfig(ModifyAutoBackupConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAutoBackupConfig", ModifyAutoBackupConfigResponse.class);
    }

    /**
     *This API is used to modify the network information and address for downloading a backup file.
     * @param req ModifyBackupDownloadRestrictionRequest
     * @return ModifyBackupDownloadRestrictionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBackupDownloadRestrictionResponse ModifyBackupDownloadRestriction(ModifyBackupDownloadRestrictionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBackupDownloadRestriction", ModifyBackupDownloadRestrictionResponse.class);
    }

    /**
     *This API is used to modify the connection configuration of an instance, including the bandwidth and maximum number of connections.
     * @param req ModifyConnectionConfigRequest
     * @return ModifyConnectionConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConnectionConfigResponse ModifyConnectionConfig(ModifyConnectionConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConnectionConfig", ModifyConnectionConfigResponse.class);
    }

    /**
     *This API is used to modify the security groups bound to an instance.
     * @param req ModifyDBInstanceSecurityGroupsRequest
     * @return ModifyDBInstanceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupsResponse ModifyDBInstanceSecurityGroups(ModifyDBInstanceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroups", ModifyDBInstanceSecurityGroupsResponse.class);
    }

    /**
     *This API is used to modify instance information.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *This API is used to modify an instance sub-account.
     * @param req ModifyInstanceAccountRequest
     * @return ModifyInstanceAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAccountResponse ModifyInstanceAccount(ModifyInstanceAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceAccount", ModifyInstanceAccountResponse.class);
    }

    /**
     *This API is used to change the availability zone of the instance.
     * @param req ModifyInstanceAvailabilityZonesRequest
     * @return ModifyInstanceAvailabilityZonesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAvailabilityZonesResponse ModifyInstanceAvailabilityZones(ModifyInstanceAvailabilityZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceAvailabilityZones", ModifyInstanceAvailabilityZonesResponse.class);
    }

    /**
     *This API is used to modify the operations event execution schedule of an instance.
     * @param req ModifyInstanceEventRequest
     * @return ModifyInstanceEventResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceEventResponse ModifyInstanceEvent(ModifyInstanceEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceEvent", ModifyInstanceEventResponse.class);
    }

    /**
     *This API is used to modify the parameters of TencentDB for Redis instances
     * @param req ModifyInstanceParamsRequest
     * @return ModifyInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceParamsResponse ModifyInstanceParams(ModifyInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceParams", ModifyInstanceParamsResponse.class);
    }

    /**
     *This API is used to set instance input mode.
     * @param req ModifyInstanceReadOnlyRequest
     * @return ModifyInstanceReadOnlyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceReadOnlyResponse ModifyInstanceReadOnly(ModifyInstanceReadOnlyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceReadOnly", ModifyInstanceReadOnlyResponse.class);
    }

    /**
     *This API is used to modify the instance maintenance time. The maintenance time specifies a time period during which compatible version upgrade, architecture upgrade, backend maintenance, and other operations can be performed to avoid affecting business. Note: if the compatible version upgrade or architecture upgrade task has been initiated for an instance, its maintenance time cannot be modified.
     * @param req ModifyMaintenanceWindowRequest
     * @return ModifyMaintenanceWindowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMaintenanceWindowResponse ModifyMaintenanceWindow(ModifyMaintenanceWindowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMaintenanceWindow", ModifyMaintenanceWindowResponse.class);
    }

    /**
     *This API is used to modify the network configuration of an instance.
     * @param req ModifyNetworkConfigRequest
     * @return ModifyNetworkConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkConfigResponse ModifyNetworkConfig(ModifyNetworkConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkConfig", ModifyNetworkConfigResponse.class);
    }

    /**
     *This API is used to modify a parameter template.
     * @param req ModifyParamTemplateRequest
     * @return ModifyParamTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyParamTemplateResponse ModifyParamTemplate(ModifyParamTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyParamTemplate", ModifyParamTemplateResponse.class);
    }

    /**
     *This API is used to enable SSL.
     * @param req OpenSSLRequest
     * @return OpenSSLResponse
     * @throws TencentCloudSDKException
     */
    public OpenSSLResponse OpenSSL(OpenSSLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenSSL", OpenSSLResponse.class);
    }

    /**
     *This API is used to disable public network access.
     * @param req ReleaseWanAddressRequest
     * @return ReleaseWanAddressResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseWanAddressResponse ReleaseWanAddress(ReleaseWanAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseWanAddress", ReleaseWanAddressResponse.class);
    }

    /**
     *This API is used to remove a member from a replication group.
     * @param req RemoveReplicationInstanceRequest
     * @return RemoveReplicationInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RemoveReplicationInstanceResponse RemoveReplicationInstance(RemoveReplicationInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveReplicationInstance", RemoveReplicationInstanceResponse.class);
    }

    /**
     *This API is used to renew an instance.
     * @param req RenewInstanceRequest
     * @return RenewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewInstanceResponse RenewInstance(RenewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewInstance", RenewInstanceResponse.class);
    }

    /**
     *This API is used to reset a password.
     * @param req ResetPasswordRequest
     * @return ResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetPasswordResponse ResetPassword(ResetPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetPassword", ResetPasswordResponse.class);
    }

    /**
     *This API is used to restore a Redis instance.
     * @param req RestoreInstanceRequest
     * @return RestoreInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestoreInstanceResponse RestoreInstance(RestoreInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestoreInstance", RestoreInstanceResponse.class);
    }

    /**
     *This API is used to deisolate an instance.
     * @param req StartupInstanceRequest
     * @return StartupInstanceResponse
     * @throws TencentCloudSDKException
     */
    public StartupInstanceResponse StartupInstance(StartupInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartupInstance", StartupInstanceResponse.class);
    }

    /**
     *This API is used to immediately switch instances that are in the time window pending switch operation. Users can manually initiate this operation.
     * @param req SwitchAccessNewInstanceRequest
     * @return SwitchAccessNewInstanceResponse
     * @throws TencentCloudSDKException
     */
    public SwitchAccessNewInstanceResponse SwitchAccessNewInstance(SwitchAccessNewInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchAccessNewInstance", SwitchAccessNewInstanceResponse.class);
    }

    /**
     *This API is used to swap the VIPs of instances for instance disaster recovery switch in scenarios where cross-AZ disaster recovery is supported through DTS. After the VIPs of the source and target instances are swapped, the target instance can be written into and the DTS sync task between them will be disconnected.
     * @param req SwitchInstanceVipRequest
     * @return SwitchInstanceVipResponse
     * @throws TencentCloudSDKException
     */
    public SwitchInstanceVipResponse SwitchInstanceVip(SwitchInstanceVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchInstanceVip", SwitchInstanceVipResponse.class);
    }

    /**
     *This API is used to simulate the failure of a proxy node.
     * @param req SwitchProxyRequest
     * @return SwitchProxyResponse
     * @throws TencentCloudSDKException
     */
    public SwitchProxyResponse SwitchProxy(SwitchProxyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchProxy", SwitchProxyResponse.class);
    }

    /**
     *This API is used to modify the instance configuration.
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstance", UpgradeInstanceResponse.class);
    }

    /**
     *This API is used to upgrade the instance to a later version or to upgrade the current standard architecture to the cluster architecture.
     * @param req UpgradeInstanceVersionRequest
     * @return UpgradeInstanceVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceVersionResponse UpgradeInstanceVersion(UpgradeInstanceVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeInstanceVersion", UpgradeInstanceVersionResponse.class);
    }

    /**
     *This API is used to upgrade instance proxy version.
     * @param req UpgradeProxyVersionRequest
     * @return UpgradeProxyVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeProxyVersionResponse UpgradeProxyVersion(UpgradeProxyVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeProxyVersion", UpgradeProxyVersionResponse.class);
    }

    /**
     *This API is used to upgrade instance minor version.
     * @param req UpgradeSmallVersionRequest
     * @return UpgradeSmallVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeSmallVersionResponse UpgradeSmallVersion(UpgradeSmallVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeSmallVersion", UpgradeSmallVersionResponse.class);
    }

    /**
     *This API is used to upgrade an instance to support multi-AZ deployment.
     * @param req UpgradeVersionToMultiAvailabilityZonesRequest
     * @return UpgradeVersionToMultiAvailabilityZonesResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeVersionToMultiAvailabilityZonesResponse UpgradeVersionToMultiAvailabilityZones(UpgradeVersionToMultiAvailabilityZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeVersionToMultiAvailabilityZones", UpgradeVersionToMultiAvailabilityZonesResponse.class);
    }

}
