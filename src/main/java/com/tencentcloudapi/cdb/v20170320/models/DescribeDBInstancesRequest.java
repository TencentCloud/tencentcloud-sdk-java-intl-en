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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only).
    */
    @SerializedName("InstanceTypes")
    @Expose
    private Long [] InstanceTypes;

    /**
    * Private IP address of the instance.
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * Instance status. Valid values: <br>`0` (creating) <br>`1` (running) <br>`4` (isolating) <br>`5` (isolated; the instance can be restored and started in the recycle bin)
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Security group ID. When it is used as a filter, the `WithSecurityGroup` parameter should be set to 1.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour.
    */
    @SerializedName("PayTypes")
    @Expose
    private Long [] PayTypes;

    /**
    * Instance name.
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * Instance task status. Valid values:<br>0 - no task;<br>1 - upgrading;<br>2 - importing data;<br>3 - enabling secondary nodes;<br>4 - enabling public network access;<br>5 - executing batch operations;<br>6 - rolling back;<br>7 - disabling public network access;<br>8 - changing the password;<br>9 - renaming the instance;<br>10 - restarting;<br>12 - migrating self-built databases;<br>13 - deleting databases and tables;<br>14 - synchronizing the creation of disaster recovery instances;<br>15 - pending upgrade switch;<br>16 - under upgrade switch;<br>17 - upgrade switch completed;<br>19 - parameter settings pending execution;<br>34 - in-place upgrade pending execution.
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * Version of the instance database engine. Value range: 5.1, 5.5, 5.6, 5.7.
    */
    @SerializedName("EngineVersions")
    @Expose
    private String [] EngineVersions;

    /**
    * VPC ID.
    */
    @SerializedName("VpcIds")
    @Expose
    private Long [] VpcIds;

    /**
    * AZ ID.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetIds")
    @Expose
    private Long [] SubnetIds;

    /**
    * Whether to lock disk write. Valid values: `0`(unlock), `1`(lock). Default value: 0.
    */
    @SerializedName("CdbErrors")
    @Expose
    private Long [] CdbErrors;

    /**
    * Sorting field of the query results. Valid values: "instanceId", "instanceName", "createTime", and "deadlineTime".
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default value is "DESC".
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * Whether to use the security group ID as the filter condition.
Note: 0 indicates no; 1 indicates yes.
    */
    @SerializedName("WithSecurityGroup")
    @Expose
    private Long WithSecurityGroup;

    /**
    * Whether dedicated cluster details are included. Value range: 0 (not included), 1 (included)
    */
    @SerializedName("WithExCluster")
    @Expose
    private Long WithExCluster;

    /**
    * Exclusive cluster ID.
    */
    @SerializedName("ExClusterId")
    @Expose
    private String ExClusterId;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Initialization flag. Value range: 0 (not initialized), 1 (initialized).
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * Whether instances corresponding to the disaster recovery relationship are included. Valid values: 0 (not included), 1 (included). Default value: 1. If a primary instance is pulled, the data of the disaster recovery relationship will be in the `DrInfo` field. If a disaster recovery instance is pulled, the data of the disaster recovery relationship will be in the `MasterInfo` field. The disaster recovery relationship contains only partial basic data. To get the detailed data, you need to call an API to pull it.
    */
    @SerializedName("WithDr")
    @Expose
    private Long WithDr;

    /**
    * Whether read-only instances are included. Valid values: 0 (not included), 1 (included). Default value: 1.
    */
    @SerializedName("WithRo")
    @Expose
    private Long WithRo;

    /**
    * Whether primary instances are included. Valid values: 0 (not included), 1 (included). Default value: 1.
    */
    @SerializedName("WithMaster")
    @Expose
    private Long WithMaster;

    /**
    * Placement group ID list.
    */
    @SerializedName("DeployGroupIds")
    @Expose
    private String [] DeployGroupIds;

    /**
    * Whether to use the tag key as a filter condition
    */
    @SerializedName("TagKeysForSearch")
    @Expose
    private String [] TagKeysForSearch;

    /**
    * Financial cage IDs.
    */
    @SerializedName("CageIds")
    @Expose
    private String [] CageIds;

    /**
    * Tag value
    */
    @SerializedName("TagValues")
    @Expose
    private String [] TagValues;

    /**
    * VPC character vpcId
    */
    @SerializedName("UniqueVpcIds")
    @Expose
    private String [] UniqueVpcIds;

    /**
    * VPC character subnetId
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * Tag key value.
Note that tags cannot be queried for instances being created.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Database proxy IP
    */
    @SerializedName("ProxyVips")
    @Expose
    private String [] ProxyVips;

    /**
    * Database proxy ID
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * Database engine type. Valid values: InnoDB; RocksDB.
    */
    @SerializedName("EngineTypes")
    @Expose
    private String [] EngineTypes;

    /**
    * Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false.
    */
    @SerializedName("QueryClusterInfo")
    @Expose
    private Boolean QueryClusterInfo;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only). 
     * @return InstanceTypes Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only).
     */
    public Long [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only).
     * @param InstanceTypes Instance type. Value range: 1 (primary), 2 (disaster recovery), 3 (read-only).
     */
    public void setInstanceTypes(Long [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get Private IP address of the instance. 
     * @return Vips Private IP address of the instance.
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set Private IP address of the instance.
     * @param Vips Private IP address of the instance.
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get Instance status. Valid values: <br>`0` (creating) <br>`1` (running) <br>`4` (isolating) <br>`5` (isolated; the instance can be restored and started in the recycle bin) 
     * @return Status Instance status. Valid values: <br>`0` (creating) <br>`1` (running) <br>`4` (isolating) <br>`5` (isolated; the instance can be restored and started in the recycle bin)
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: <br>`0` (creating) <br>`1` (running) <br>`4` (isolating) <br>`5` (isolated; the instance can be restored and started in the recycle bin)
     * @param Status Instance status. Valid values: <br>`0` (creating) <br>`1` (running) <br>`4` (isolating) <br>`5` (isolated; the instance can be restored and started in the recycle bin)
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000. 
     * @return Limit Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000.
     * @param Limit Number of results to be returned for a single request. Default value: 20. Maximum value: 2,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Security group ID. When it is used as a filter, the `WithSecurityGroup` parameter should be set to 1. 
     * @return SecurityGroupId Security group ID. When it is used as a filter, the `WithSecurityGroup` parameter should be set to 1.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID. When it is used as a filter, the `WithSecurityGroup` parameter should be set to 1.
     * @param SecurityGroupId Security group ID. When it is used as a filter, the `WithSecurityGroup` parameter should be set to 1.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour. 
     * @return PayTypes Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour.
     */
    public Long [] getPayTypes() {
        return this.PayTypes;
    }

    /**
     * Set Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour.
     * @param PayTypes Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour.
     */
    public void setPayTypes(Long [] PayTypes) {
        this.PayTypes = PayTypes;
    }

    /**
     * Get Instance name. 
     * @return InstanceNames Instance name.
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set Instance name.
     * @param InstanceNames Instance name.
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get Instance task status. Valid values:<br>0 - no task;<br>1 - upgrading;<br>2 - importing data;<br>3 - enabling secondary nodes;<br>4 - enabling public network access;<br>5 - executing batch operations;<br>6 - rolling back;<br>7 - disabling public network access;<br>8 - changing the password;<br>9 - renaming the instance;<br>10 - restarting;<br>12 - migrating self-built databases;<br>13 - deleting databases and tables;<br>14 - synchronizing the creation of disaster recovery instances;<br>15 - pending upgrade switch;<br>16 - under upgrade switch;<br>17 - upgrade switch completed;<br>19 - parameter settings pending execution;<br>34 - in-place upgrade pending execution. 
     * @return TaskStatus Instance task status. Valid values:<br>0 - no task;<br>1 - upgrading;<br>2 - importing data;<br>3 - enabling secondary nodes;<br>4 - enabling public network access;<br>5 - executing batch operations;<br>6 - rolling back;<br>7 - disabling public network access;<br>8 - changing the password;<br>9 - renaming the instance;<br>10 - restarting;<br>12 - migrating self-built databases;<br>13 - deleting databases and tables;<br>14 - synchronizing the creation of disaster recovery instances;<br>15 - pending upgrade switch;<br>16 - under upgrade switch;<br>17 - upgrade switch completed;<br>19 - parameter settings pending execution;<br>34 - in-place upgrade pending execution.
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Instance task status. Valid values:<br>0 - no task;<br>1 - upgrading;<br>2 - importing data;<br>3 - enabling secondary nodes;<br>4 - enabling public network access;<br>5 - executing batch operations;<br>6 - rolling back;<br>7 - disabling public network access;<br>8 - changing the password;<br>9 - renaming the instance;<br>10 - restarting;<br>12 - migrating self-built databases;<br>13 - deleting databases and tables;<br>14 - synchronizing the creation of disaster recovery instances;<br>15 - pending upgrade switch;<br>16 - under upgrade switch;<br>17 - upgrade switch completed;<br>19 - parameter settings pending execution;<br>34 - in-place upgrade pending execution.
     * @param TaskStatus Instance task status. Valid values:<br>0 - no task;<br>1 - upgrading;<br>2 - importing data;<br>3 - enabling secondary nodes;<br>4 - enabling public network access;<br>5 - executing batch operations;<br>6 - rolling back;<br>7 - disabling public network access;<br>8 - changing the password;<br>9 - renaming the instance;<br>10 - restarting;<br>12 - migrating self-built databases;<br>13 - deleting databases and tables;<br>14 - synchronizing the creation of disaster recovery instances;<br>15 - pending upgrade switch;<br>16 - under upgrade switch;<br>17 - upgrade switch completed;<br>19 - parameter settings pending execution;<br>34 - in-place upgrade pending execution.
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Version of the instance database engine. Value range: 5.1, 5.5, 5.6, 5.7. 
     * @return EngineVersions Version of the instance database engine. Value range: 5.1, 5.5, 5.6, 5.7.
     */
    public String [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * Set Version of the instance database engine. Value range: 5.1, 5.5, 5.6, 5.7.
     * @param EngineVersions Version of the instance database engine. Value range: 5.1, 5.5, 5.6, 5.7.
     */
    public void setEngineVersions(String [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    /**
     * Get VPC ID. 
     * @return VpcIds VPC ID.
     */
    public Long [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set VPC ID.
     * @param VpcIds VPC ID.
     */
    public void setVpcIds(Long [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get AZ ID. 
     * @return ZoneIds AZ ID.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set AZ ID.
     * @param ZoneIds AZ ID.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Subnet ID. 
     * @return SubnetIds Subnet ID.
     */
    public Long [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set Subnet ID.
     * @param SubnetIds Subnet ID.
     */
    public void setSubnetIds(Long [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Whether to lock disk write. Valid values: `0`(unlock), `1`(lock). Default value: 0. 
     * @return CdbErrors Whether to lock disk write. Valid values: `0`(unlock), `1`(lock). Default value: 0.
     */
    public Long [] getCdbErrors() {
        return this.CdbErrors;
    }

    /**
     * Set Whether to lock disk write. Valid values: `0`(unlock), `1`(lock). Default value: 0.
     * @param CdbErrors Whether to lock disk write. Valid values: `0`(unlock), `1`(lock). Default value: 0.
     */
    public void setCdbErrors(Long [] CdbErrors) {
        this.CdbErrors = CdbErrors;
    }

    /**
     * Get Sorting field of the query results. Valid values: "instanceId", "instanceName", "createTime", and "deadlineTime". 
     * @return OrderBy Sorting field of the query results. Valid values: "instanceId", "instanceName", "createTime", and "deadlineTime".
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field of the query results. Valid values: "instanceId", "instanceName", "createTime", and "deadlineTime".
     * @param OrderBy Sorting field of the query results. Valid values: "instanceId", "instanceName", "createTime", and "deadlineTime".
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default value is "DESC". 
     * @return OrderDirection Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default value is "DESC".
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default value is "DESC".
     * @param OrderDirection Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default value is "DESC".
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get Whether to use the security group ID as the filter condition.
Note: 0 indicates no; 1 indicates yes. 
     * @return WithSecurityGroup Whether to use the security group ID as the filter condition.
Note: 0 indicates no; 1 indicates yes.
     */
    public Long getWithSecurityGroup() {
        return this.WithSecurityGroup;
    }

    /**
     * Set Whether to use the security group ID as the filter condition.
Note: 0 indicates no; 1 indicates yes.
     * @param WithSecurityGroup Whether to use the security group ID as the filter condition.
Note: 0 indicates no; 1 indicates yes.
     */
    public void setWithSecurityGroup(Long WithSecurityGroup) {
        this.WithSecurityGroup = WithSecurityGroup;
    }

    /**
     * Get Whether dedicated cluster details are included. Value range: 0 (not included), 1 (included) 
     * @return WithExCluster Whether dedicated cluster details are included. Value range: 0 (not included), 1 (included)
     */
    public Long getWithExCluster() {
        return this.WithExCluster;
    }

    /**
     * Set Whether dedicated cluster details are included. Value range: 0 (not included), 1 (included)
     * @param WithExCluster Whether dedicated cluster details are included. Value range: 0 (not included), 1 (included)
     */
    public void setWithExCluster(Long WithExCluster) {
        this.WithExCluster = WithExCluster;
    }

    /**
     * Get Exclusive cluster ID. 
     * @return ExClusterId Exclusive cluster ID.
     */
    public String getExClusterId() {
        return this.ExClusterId;
    }

    /**
     * Set Exclusive cluster ID.
     * @param ExClusterId Exclusive cluster ID.
     */
    public void setExClusterId(String ExClusterId) {
        this.ExClusterId = ExClusterId;
    }

    /**
     * Get Instance ID. 
     * @return InstanceIds Instance ID.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID.
     * @param InstanceIds Instance ID.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Initialization flag. Value range: 0 (not initialized), 1 (initialized). 
     * @return InitFlag Initialization flag. Value range: 0 (not initialized), 1 (initialized).
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set Initialization flag. Value range: 0 (not initialized), 1 (initialized).
     * @param InitFlag Initialization flag. Value range: 0 (not initialized), 1 (initialized).
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get Whether instances corresponding to the disaster recovery relationship are included. Valid values: 0 (not included), 1 (included). Default value: 1. If a primary instance is pulled, the data of the disaster recovery relationship will be in the `DrInfo` field. If a disaster recovery instance is pulled, the data of the disaster recovery relationship will be in the `MasterInfo` field. The disaster recovery relationship contains only partial basic data. To get the detailed data, you need to call an API to pull it. 
     * @return WithDr Whether instances corresponding to the disaster recovery relationship are included. Valid values: 0 (not included), 1 (included). Default value: 1. If a primary instance is pulled, the data of the disaster recovery relationship will be in the `DrInfo` field. If a disaster recovery instance is pulled, the data of the disaster recovery relationship will be in the `MasterInfo` field. The disaster recovery relationship contains only partial basic data. To get the detailed data, you need to call an API to pull it.
     */
    public Long getWithDr() {
        return this.WithDr;
    }

    /**
     * Set Whether instances corresponding to the disaster recovery relationship are included. Valid values: 0 (not included), 1 (included). Default value: 1. If a primary instance is pulled, the data of the disaster recovery relationship will be in the `DrInfo` field. If a disaster recovery instance is pulled, the data of the disaster recovery relationship will be in the `MasterInfo` field. The disaster recovery relationship contains only partial basic data. To get the detailed data, you need to call an API to pull it.
     * @param WithDr Whether instances corresponding to the disaster recovery relationship are included. Valid values: 0 (not included), 1 (included). Default value: 1. If a primary instance is pulled, the data of the disaster recovery relationship will be in the `DrInfo` field. If a disaster recovery instance is pulled, the data of the disaster recovery relationship will be in the `MasterInfo` field. The disaster recovery relationship contains only partial basic data. To get the detailed data, you need to call an API to pull it.
     */
    public void setWithDr(Long WithDr) {
        this.WithDr = WithDr;
    }

    /**
     * Get Whether read-only instances are included. Valid values: 0 (not included), 1 (included). Default value: 1. 
     * @return WithRo Whether read-only instances are included. Valid values: 0 (not included), 1 (included). Default value: 1.
     */
    public Long getWithRo() {
        return this.WithRo;
    }

    /**
     * Set Whether read-only instances are included. Valid values: 0 (not included), 1 (included). Default value: 1.
     * @param WithRo Whether read-only instances are included. Valid values: 0 (not included), 1 (included). Default value: 1.
     */
    public void setWithRo(Long WithRo) {
        this.WithRo = WithRo;
    }

    /**
     * Get Whether primary instances are included. Valid values: 0 (not included), 1 (included). Default value: 1. 
     * @return WithMaster Whether primary instances are included. Valid values: 0 (not included), 1 (included). Default value: 1.
     */
    public Long getWithMaster() {
        return this.WithMaster;
    }

    /**
     * Set Whether primary instances are included. Valid values: 0 (not included), 1 (included). Default value: 1.
     * @param WithMaster Whether primary instances are included. Valid values: 0 (not included), 1 (included). Default value: 1.
     */
    public void setWithMaster(Long WithMaster) {
        this.WithMaster = WithMaster;
    }

    /**
     * Get Placement group ID list. 
     * @return DeployGroupIds Placement group ID list.
     */
    public String [] getDeployGroupIds() {
        return this.DeployGroupIds;
    }

    /**
     * Set Placement group ID list.
     * @param DeployGroupIds Placement group ID list.
     */
    public void setDeployGroupIds(String [] DeployGroupIds) {
        this.DeployGroupIds = DeployGroupIds;
    }

    /**
     * Get Whether to use the tag key as a filter condition 
     * @return TagKeysForSearch Whether to use the tag key as a filter condition
     */
    public String [] getTagKeysForSearch() {
        return this.TagKeysForSearch;
    }

    /**
     * Set Whether to use the tag key as a filter condition
     * @param TagKeysForSearch Whether to use the tag key as a filter condition
     */
    public void setTagKeysForSearch(String [] TagKeysForSearch) {
        this.TagKeysForSearch = TagKeysForSearch;
    }

    /**
     * Get Financial cage IDs. 
     * @return CageIds Financial cage IDs.
     */
    public String [] getCageIds() {
        return this.CageIds;
    }

    /**
     * Set Financial cage IDs.
     * @param CageIds Financial cage IDs.
     */
    public void setCageIds(String [] CageIds) {
        this.CageIds = CageIds;
    }

    /**
     * Get Tag value 
     * @return TagValues Tag value
     */
    public String [] getTagValues() {
        return this.TagValues;
    }

    /**
     * Set Tag value
     * @param TagValues Tag value
     */
    public void setTagValues(String [] TagValues) {
        this.TagValues = TagValues;
    }

    /**
     * Get VPC character vpcId 
     * @return UniqueVpcIds VPC character vpcId
     */
    public String [] getUniqueVpcIds() {
        return this.UniqueVpcIds;
    }

    /**
     * Set VPC character vpcId
     * @param UniqueVpcIds VPC character vpcId
     */
    public void setUniqueVpcIds(String [] UniqueVpcIds) {
        this.UniqueVpcIds = UniqueVpcIds;
    }

    /**
     * Get VPC character subnetId 
     * @return UniqSubnetIds VPC character subnetId
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set VPC character subnetId
     * @param UniqSubnetIds VPC character subnetId
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get Tag key value.
Note that tags cannot be queried for instances being created. 
     * @return Tags Tag key value.
Note that tags cannot be queried for instances being created.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag key value.
Note that tags cannot be queried for instances being created.
     * @param Tags Tag key value.
Note that tags cannot be queried for instances being created.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Database proxy IP 
     * @return ProxyVips Database proxy IP
     */
    public String [] getProxyVips() {
        return this.ProxyVips;
    }

    /**
     * Set Database proxy IP
     * @param ProxyVips Database proxy IP
     */
    public void setProxyVips(String [] ProxyVips) {
        this.ProxyVips = ProxyVips;
    }

    /**
     * Get Database proxy ID 
     * @return ProxyIds Database proxy ID
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set Database proxy ID
     * @param ProxyIds Database proxy ID
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get Database engine type. Valid values: InnoDB; RocksDB. 
     * @return EngineTypes Database engine type. Valid values: InnoDB; RocksDB.
     */
    public String [] getEngineTypes() {
        return this.EngineTypes;
    }

    /**
     * Set Database engine type. Valid values: InnoDB; RocksDB.
     * @param EngineTypes Database engine type. Valid values: InnoDB; RocksDB.
     */
    public void setEngineTypes(String [] EngineTypes) {
        this.EngineTypes = EngineTypes;
    }

    /**
     * Get Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false. 
     * @return QueryClusterInfo Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false.
     */
    public Boolean getQueryClusterInfo() {
        return this.QueryClusterInfo;
    }

    /**
     * Set Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false.
     * @param QueryClusterInfo Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false.
     */
    public void setQueryClusterInfo(Boolean QueryClusterInfo) {
        this.QueryClusterInfo = QueryClusterInfo;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new Long[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new Long(source.InstanceTypes[i]);
            }
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.PayTypes != null) {
            this.PayTypes = new Long[source.PayTypes.length];
            for (int i = 0; i < source.PayTypes.length; i++) {
                this.PayTypes[i] = new Long(source.PayTypes[i]);
            }
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long[source.TaskStatus.length];
            for (int i = 0; i < source.TaskStatus.length; i++) {
                this.TaskStatus[i] = new Long(source.TaskStatus[i]);
            }
        }
        if (source.EngineVersions != null) {
            this.EngineVersions = new String[source.EngineVersions.length];
            for (int i = 0; i < source.EngineVersions.length; i++) {
                this.EngineVersions[i] = new String(source.EngineVersions[i]);
            }
        }
        if (source.VpcIds != null) {
            this.VpcIds = new Long[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new Long(source.VpcIds[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new Long[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new Long(source.SubnetIds[i]);
            }
        }
        if (source.CdbErrors != null) {
            this.CdbErrors = new Long[source.CdbErrors.length];
            for (int i = 0; i < source.CdbErrors.length; i++) {
                this.CdbErrors[i] = new Long(source.CdbErrors[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.WithSecurityGroup != null) {
            this.WithSecurityGroup = new Long(source.WithSecurityGroup);
        }
        if (source.WithExCluster != null) {
            this.WithExCluster = new Long(source.WithExCluster);
        }
        if (source.ExClusterId != null) {
            this.ExClusterId = new String(source.ExClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InitFlag != null) {
            this.InitFlag = new Long(source.InitFlag);
        }
        if (source.WithDr != null) {
            this.WithDr = new Long(source.WithDr);
        }
        if (source.WithRo != null) {
            this.WithRo = new Long(source.WithRo);
        }
        if (source.WithMaster != null) {
            this.WithMaster = new Long(source.WithMaster);
        }
        if (source.DeployGroupIds != null) {
            this.DeployGroupIds = new String[source.DeployGroupIds.length];
            for (int i = 0; i < source.DeployGroupIds.length; i++) {
                this.DeployGroupIds[i] = new String(source.DeployGroupIds[i]);
            }
        }
        if (source.TagKeysForSearch != null) {
            this.TagKeysForSearch = new String[source.TagKeysForSearch.length];
            for (int i = 0; i < source.TagKeysForSearch.length; i++) {
                this.TagKeysForSearch[i] = new String(source.TagKeysForSearch[i]);
            }
        }
        if (source.CageIds != null) {
            this.CageIds = new String[source.CageIds.length];
            for (int i = 0; i < source.CageIds.length; i++) {
                this.CageIds[i] = new String(source.CageIds[i]);
            }
        }
        if (source.TagValues != null) {
            this.TagValues = new String[source.TagValues.length];
            for (int i = 0; i < source.TagValues.length; i++) {
                this.TagValues[i] = new String(source.TagValues[i]);
            }
        }
        if (source.UniqueVpcIds != null) {
            this.UniqueVpcIds = new String[source.UniqueVpcIds.length];
            for (int i = 0; i < source.UniqueVpcIds.length; i++) {
                this.UniqueVpcIds[i] = new String(source.UniqueVpcIds[i]);
            }
        }
        if (source.UniqSubnetIds != null) {
            this.UniqSubnetIds = new String[source.UniqSubnetIds.length];
            for (int i = 0; i < source.UniqSubnetIds.length; i++) {
                this.UniqSubnetIds[i] = new String(source.UniqSubnetIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ProxyVips != null) {
            this.ProxyVips = new String[source.ProxyVips.length];
            for (int i = 0; i < source.ProxyVips.length; i++) {
                this.ProxyVips[i] = new String(source.ProxyVips[i]);
            }
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
            }
        }
        if (source.EngineTypes != null) {
            this.EngineTypes = new String[source.EngineTypes.length];
            for (int i = 0; i < source.EngineTypes.length; i++) {
                this.EngineTypes[i] = new String(source.EngineTypes[i]);
            }
        }
        if (source.QueryClusterInfo != null) {
            this.QueryClusterInfo = new Boolean(source.QueryClusterInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "PayTypes.", this.PayTypes);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "EngineVersions.", this.EngineVersions);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "CdbErrors.", this.CdbErrors);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "WithSecurityGroup", this.WithSecurityGroup);
        this.setParamSimple(map, prefix + "WithExCluster", this.WithExCluster);
        this.setParamSimple(map, prefix + "ExClusterId", this.ExClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InitFlag", this.InitFlag);
        this.setParamSimple(map, prefix + "WithDr", this.WithDr);
        this.setParamSimple(map, prefix + "WithRo", this.WithRo);
        this.setParamSimple(map, prefix + "WithMaster", this.WithMaster);
        this.setParamArraySimple(map, prefix + "DeployGroupIds.", this.DeployGroupIds);
        this.setParamArraySimple(map, prefix + "TagKeysForSearch.", this.TagKeysForSearch);
        this.setParamArraySimple(map, prefix + "CageIds.", this.CageIds);
        this.setParamArraySimple(map, prefix + "TagValues.", this.TagValues);
        this.setParamArraySimple(map, prefix + "UniqueVpcIds.", this.UniqueVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "ProxyVips.", this.ProxyVips);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);
        this.setParamArraySimple(map, prefix + "EngineTypes.", this.EngineTypes);
        this.setParamSimple(map, prefix + "QueryClusterInfo", this.QueryClusterInfo);

    }
}

