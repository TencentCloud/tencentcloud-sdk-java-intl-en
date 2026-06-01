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
    * <p>Instance type. Valid values: 1 - Primary instance, 2 - Disaster recovery instance, 3 - Read-only instance.</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private Long [] InstanceTypes;

    /**
    * <p>Private IP address of the instance.</p>
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * <p>Instance status. Valid values:<br>0 - Creating<br>1 - Running<br>4 - Isolation operation in progress<br>5 - Isolated (can be restored from the Recycle Bin)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>Offset. Default value is 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of items returned per request. Default value: 20. Maximum value: 2000.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Security group ID. When using security group ID as the filter condition, the WithSecurityGroup parameter needs to be specified as 1.</p>
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * <p>Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour.</p>
    */
    @SerializedName("PayTypes")
    @Expose
    private Long [] PayTypes;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * <p>Instance task status, possible values:<br>0 - No tasks<br>1 - Upgrading<br>2 - Data import in progress<br>3 - Enabling Slave<br>4 - Enabling public network access<br>5 - Batch operation in progress<br>6 - Rolling back<br>7 - Disabling public network access<br>8 - Password change in progress<br>9 - Renaming instance<br>10 - Restarting<br>12 - Self-built migration in progress<br>13 - Deleting database table<br>14 - Disaster recovery instance creation sync in progress<br>15 - Upgrade pending switch<br>16 - Upgrade and switch in progress<br>17 - Switch completed<br>19 - Parameter setting pending execution<br>34 - Node in-place upgrade to be executed</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * <p>Database engine version of the instance. Possible values: 5.1, 5.5, 5.6, and 5.7.</p>
    */
    @SerializedName("EngineVersions")
    @Expose
    private String [] EngineVersions;

    /**
    * <p>VPC ID.</p>
    */
    @SerializedName("VpcIds")
    @Expose
    private Long [] VpcIds;

    /**
    * <p>Availability zone ID.</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>Subnet ID.</p>
    */
    @SerializedName("SubnetIds")
    @Expose
    private Long [] SubnetIds;

    /**
    * <p>Whether to set the lock flag. Available values: 0 - not lock, 1 - lock. Default is 0.</p>
    */
    @SerializedName("CdbErrors")
    @Expose
    private Long [] CdbErrors;

    /**
    * <p>Sorting field of the returned result set. Currently supports: "instanceId", "instanceName", "createTime", and "deadlineTime".</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default is "DESC".</p>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * <p>Whether to use security group ID as the filter condition.<br>Description: 0 indicates no, 1 indicates yes.</p>
    */
    @SerializedName("WithSecurityGroup")
    @Expose
    private Long WithSecurityGroup;

    /**
    * <p>Whether the exclusive cluster detail is included. Value range: 0 - not contained, 1 - contained.</p>
    */
    @SerializedName("WithExCluster")
    @Expose
    private Long WithExCluster;

    /**
    * <p>Dedicated cluster ID.</p>
    */
    @SerializedName("ExClusterId")
    @Expose
    private String ExClusterId;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Initialization flag. Valid values: 0 - uninitialized, 1 - initialized.</p>
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * <p>Whether the corresponding instance in the disaster recovery relationship is included. Valid values: 0 - excluding, 1 - included. Default value: 1. If pulling the primary instance, the data of the disaster recovery relationship is in the DrInfo field. If pulling the disaster recovery instance, the data of the disaster recovery relationship is in the MasterInfo field. The disaster recovery relationship only contains partial basic data. Detailed data must be pulled manually via the interface.</p>
    */
    @SerializedName("WithDr")
    @Expose
    private Long WithDr;

    /**
    * <p>Whether it contains read-only instances. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p>
    */
    @SerializedName("WithRo")
    @Expose
    private Long WithRo;

    /**
    * <p>Whether the primary instance is included. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p>
    */
    @SerializedName("WithMaster")
    @Expose
    private Long WithMaster;

    /**
    * <p>Placement group ID list.</p>
    */
    @SerializedName("DeployGroupIds")
    @Expose
    private String [] DeployGroupIds;

    /**
    * <p>Filter by tag key.</p>
    */
    @SerializedName("TagKeysForSearch")
    @Expose
    private String [] TagKeysForSearch;

    /**
    * <p>Financial Enclosure ID.</p>
    */
    @SerializedName("CageIds")
    @Expose
    private String [] CageIds;

    /**
    * <p>Tag value</p>
    */
    @SerializedName("TagValues")
    @Expose
    private String [] TagValues;

    /**
    * <p>Character type VPC ID</p>
    */
    @SerializedName("UniqueVpcIds")
    @Expose
    private String [] UniqueVpcIds;

    /**
    * <p>VPC character type subnetId</p>
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * <p>Tag key value<br>Please note, tags of the instance being created are unable to query.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Database proxy IP.</p>
    */
    @SerializedName("ProxyVips")
    @Expose
    private String [] ProxyVips;

    /**
    * <p>Database proxy ID.</p>
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * <p>Database engine type. Valid values: InnoDB, RocksDB.</p>
    */
    @SerializedName("EngineTypes")
    @Expose
    private String [] EngineTypes;

    /**
    * <p>Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false.</p>
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
     * Get <p>Instance type. Valid values: 1 - Primary instance, 2 - Disaster recovery instance, 3 - Read-only instance.</p> 
     * @return InstanceTypes <p>Instance type. Valid values: 1 - Primary instance, 2 - Disaster recovery instance, 3 - Read-only instance.</p>
     */
    public Long [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>Instance type. Valid values: 1 - Primary instance, 2 - Disaster recovery instance, 3 - Read-only instance.</p>
     * @param InstanceTypes <p>Instance type. Valid values: 1 - Primary instance, 2 - Disaster recovery instance, 3 - Read-only instance.</p>
     */
    public void setInstanceTypes(Long [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>Private IP address of the instance.</p> 
     * @return Vips <p>Private IP address of the instance.</p>
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set <p>Private IP address of the instance.</p>
     * @param Vips <p>Private IP address of the instance.</p>
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get <p>Instance status. Valid values:<br>0 - Creating<br>1 - Running<br>4 - Isolation operation in progress<br>5 - Isolated (can be restored from the Recycle Bin)</p> 
     * @return Status <p>Instance status. Valid values:<br>0 - Creating<br>1 - Running<br>4 - Isolation operation in progress<br>5 - Isolated (can be restored from the Recycle Bin)</p>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status. Valid values:<br>0 - Creating<br>1 - Running<br>4 - Isolation operation in progress<br>5 - Isolated (can be restored from the Recycle Bin)</p>
     * @param Status <p>Instance status. Valid values:<br>0 - Creating<br>1 - Running<br>4 - Isolation operation in progress<br>5 - Isolated (can be restored from the Recycle Bin)</p>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Offset. Default value is 0.</p> 
     * @return Offset <p>Offset. Default value is 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value is 0.</p>
     * @param Offset <p>Offset. Default value is 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of items returned per request. Default value: 20. Maximum value: 2000.</p> 
     * @return Limit <p>Number of items returned per request. Default value: 20. Maximum value: 2000.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items returned per request. Default value: 20. Maximum value: 2000.</p>
     * @param Limit <p>Number of items returned per request. Default value: 20. Maximum value: 2000.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Security group ID. When using security group ID as the filter condition, the WithSecurityGroup parameter needs to be specified as 1.</p> 
     * @return SecurityGroupId <p>Security group ID. When using security group ID as the filter condition, the WithSecurityGroup parameter needs to be specified as 1.</p>
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set <p>Security group ID. When using security group ID as the filter condition, the WithSecurityGroup parameter needs to be specified as 1.</p>
     * @param SecurityGroupId <p>Security group ID. When using security group ID as the filter condition, the WithSecurityGroup parameter needs to be specified as 1.</p>
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get <p>Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour.</p> 
     * @return PayTypes <p>Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour.</p>
     */
    public Long [] getPayTypes() {
        return this.PayTypes;
    }

    /**
     * Set <p>Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour.</p>
     * @param PayTypes <p>Payment type. Valid values: 0 - yearly/monthly subscription; 1 - bill by hour.</p>
     */
    public void setPayTypes(Long [] PayTypes) {
        this.PayTypes = PayTypes;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceNames <p>Instance name.</p>
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceNames <p>Instance name.</p>
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get <p>Instance task status, possible values:<br>0 - No tasks<br>1 - Upgrading<br>2 - Data import in progress<br>3 - Enabling Slave<br>4 - Enabling public network access<br>5 - Batch operation in progress<br>6 - Rolling back<br>7 - Disabling public network access<br>8 - Password change in progress<br>9 - Renaming instance<br>10 - Restarting<br>12 - Self-built migration in progress<br>13 - Deleting database table<br>14 - Disaster recovery instance creation sync in progress<br>15 - Upgrade pending switch<br>16 - Upgrade and switch in progress<br>17 - Switch completed<br>19 - Parameter setting pending execution<br>34 - Node in-place upgrade to be executed</p> 
     * @return TaskStatus <p>Instance task status, possible values:<br>0 - No tasks<br>1 - Upgrading<br>2 - Data import in progress<br>3 - Enabling Slave<br>4 - Enabling public network access<br>5 - Batch operation in progress<br>6 - Rolling back<br>7 - Disabling public network access<br>8 - Password change in progress<br>9 - Renaming instance<br>10 - Restarting<br>12 - Self-built migration in progress<br>13 - Deleting database table<br>14 - Disaster recovery instance creation sync in progress<br>15 - Upgrade pending switch<br>16 - Upgrade and switch in progress<br>17 - Switch completed<br>19 - Parameter setting pending execution<br>34 - Node in-place upgrade to be executed</p>
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Instance task status, possible values:<br>0 - No tasks<br>1 - Upgrading<br>2 - Data import in progress<br>3 - Enabling Slave<br>4 - Enabling public network access<br>5 - Batch operation in progress<br>6 - Rolling back<br>7 - Disabling public network access<br>8 - Password change in progress<br>9 - Renaming instance<br>10 - Restarting<br>12 - Self-built migration in progress<br>13 - Deleting database table<br>14 - Disaster recovery instance creation sync in progress<br>15 - Upgrade pending switch<br>16 - Upgrade and switch in progress<br>17 - Switch completed<br>19 - Parameter setting pending execution<br>34 - Node in-place upgrade to be executed</p>
     * @param TaskStatus <p>Instance task status, possible values:<br>0 - No tasks<br>1 - Upgrading<br>2 - Data import in progress<br>3 - Enabling Slave<br>4 - Enabling public network access<br>5 - Batch operation in progress<br>6 - Rolling back<br>7 - Disabling public network access<br>8 - Password change in progress<br>9 - Renaming instance<br>10 - Restarting<br>12 - Self-built migration in progress<br>13 - Deleting database table<br>14 - Disaster recovery instance creation sync in progress<br>15 - Upgrade pending switch<br>16 - Upgrade and switch in progress<br>17 - Switch completed<br>19 - Parameter setting pending execution<br>34 - Node in-place upgrade to be executed</p>
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Database engine version of the instance. Possible values: 5.1, 5.5, 5.6, and 5.7.</p> 
     * @return EngineVersions <p>Database engine version of the instance. Possible values: 5.1, 5.5, 5.6, and 5.7.</p>
     */
    public String [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * Set <p>Database engine version of the instance. Possible values: 5.1, 5.5, 5.6, and 5.7.</p>
     * @param EngineVersions <p>Database engine version of the instance. Possible values: 5.1, 5.5, 5.6, and 5.7.</p>
     */
    public void setEngineVersions(String [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    /**
     * Get <p>VPC ID.</p> 
     * @return VpcIds <p>VPC ID.</p>
     */
    public Long [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set <p>VPC ID.</p>
     * @param VpcIds <p>VPC ID.</p>
     */
    public void setVpcIds(Long [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get <p>Availability zone ID.</p> 
     * @return ZoneIds <p>Availability zone ID.</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>Availability zone ID.</p>
     * @param ZoneIds <p>Availability zone ID.</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>Subnet ID.</p> 
     * @return SubnetIds <p>Subnet ID.</p>
     */
    public Long [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>Subnet ID.</p>
     * @param SubnetIds <p>Subnet ID.</p>
     */
    public void setSubnetIds(Long [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>Whether to set the lock flag. Available values: 0 - not lock, 1 - lock. Default is 0.</p> 
     * @return CdbErrors <p>Whether to set the lock flag. Available values: 0 - not lock, 1 - lock. Default is 0.</p>
     */
    public Long [] getCdbErrors() {
        return this.CdbErrors;
    }

    /**
     * Set <p>Whether to set the lock flag. Available values: 0 - not lock, 1 - lock. Default is 0.</p>
     * @param CdbErrors <p>Whether to set the lock flag. Available values: 0 - not lock, 1 - lock. Default is 0.</p>
     */
    public void setCdbErrors(Long [] CdbErrors) {
        this.CdbErrors = CdbErrors;
    }

    /**
     * Get <p>Sorting field of the returned result set. Currently supports: "instanceId", "instanceName", "createTime", and "deadlineTime".</p> 
     * @return OrderBy <p>Sorting field of the returned result set. Currently supports: "instanceId", "instanceName", "createTime", and "deadlineTime".</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field of the returned result set. Currently supports: "instanceId", "instanceName", "createTime", and "deadlineTime".</p>
     * @param OrderBy <p>Sorting field of the returned result set. Currently supports: "instanceId", "instanceName", "createTime", and "deadlineTime".</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default is "DESC".</p> 
     * @return OrderDirection <p>Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default is "DESC".</p>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default is "DESC".</p>
     * @param OrderDirection <p>Sorting method of the returned result set. Valid values: "ASC" - ascending order; "DESC" - descending order. The default is "DESC".</p>
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get <p>Whether to use security group ID as the filter condition.<br>Description: 0 indicates no, 1 indicates yes.</p> 
     * @return WithSecurityGroup <p>Whether to use security group ID as the filter condition.<br>Description: 0 indicates no, 1 indicates yes.</p>
     */
    public Long getWithSecurityGroup() {
        return this.WithSecurityGroup;
    }

    /**
     * Set <p>Whether to use security group ID as the filter condition.<br>Description: 0 indicates no, 1 indicates yes.</p>
     * @param WithSecurityGroup <p>Whether to use security group ID as the filter condition.<br>Description: 0 indicates no, 1 indicates yes.</p>
     */
    public void setWithSecurityGroup(Long WithSecurityGroup) {
        this.WithSecurityGroup = WithSecurityGroup;
    }

    /**
     * Get <p>Whether the exclusive cluster detail is included. Value range: 0 - not contained, 1 - contained.</p> 
     * @return WithExCluster <p>Whether the exclusive cluster detail is included. Value range: 0 - not contained, 1 - contained.</p>
     */
    public Long getWithExCluster() {
        return this.WithExCluster;
    }

    /**
     * Set <p>Whether the exclusive cluster detail is included. Value range: 0 - not contained, 1 - contained.</p>
     * @param WithExCluster <p>Whether the exclusive cluster detail is included. Value range: 0 - not contained, 1 - contained.</p>
     */
    public void setWithExCluster(Long WithExCluster) {
        this.WithExCluster = WithExCluster;
    }

    /**
     * Get <p>Dedicated cluster ID.</p> 
     * @return ExClusterId <p>Dedicated cluster ID.</p>
     */
    public String getExClusterId() {
        return this.ExClusterId;
    }

    /**
     * Set <p>Dedicated cluster ID.</p>
     * @param ExClusterId <p>Dedicated cluster ID.</p>
     */
    public void setExClusterId(String ExClusterId) {
        this.ExClusterId = ExClusterId;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceIds <p>Instance ID.</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceIds <p>Instance ID.</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Initialization flag. Valid values: 0 - uninitialized, 1 - initialized.</p> 
     * @return InitFlag <p>Initialization flag. Valid values: 0 - uninitialized, 1 - initialized.</p>
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set <p>Initialization flag. Valid values: 0 - uninitialized, 1 - initialized.</p>
     * @param InitFlag <p>Initialization flag. Valid values: 0 - uninitialized, 1 - initialized.</p>
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get <p>Whether the corresponding instance in the disaster recovery relationship is included. Valid values: 0 - excluding, 1 - included. Default value: 1. If pulling the primary instance, the data of the disaster recovery relationship is in the DrInfo field. If pulling the disaster recovery instance, the data of the disaster recovery relationship is in the MasterInfo field. The disaster recovery relationship only contains partial basic data. Detailed data must be pulled manually via the interface.</p> 
     * @return WithDr <p>Whether the corresponding instance in the disaster recovery relationship is included. Valid values: 0 - excluding, 1 - included. Default value: 1. If pulling the primary instance, the data of the disaster recovery relationship is in the DrInfo field. If pulling the disaster recovery instance, the data of the disaster recovery relationship is in the MasterInfo field. The disaster recovery relationship only contains partial basic data. Detailed data must be pulled manually via the interface.</p>
     */
    public Long getWithDr() {
        return this.WithDr;
    }

    /**
     * Set <p>Whether the corresponding instance in the disaster recovery relationship is included. Valid values: 0 - excluding, 1 - included. Default value: 1. If pulling the primary instance, the data of the disaster recovery relationship is in the DrInfo field. If pulling the disaster recovery instance, the data of the disaster recovery relationship is in the MasterInfo field. The disaster recovery relationship only contains partial basic data. Detailed data must be pulled manually via the interface.</p>
     * @param WithDr <p>Whether the corresponding instance in the disaster recovery relationship is included. Valid values: 0 - excluding, 1 - included. Default value: 1. If pulling the primary instance, the data of the disaster recovery relationship is in the DrInfo field. If pulling the disaster recovery instance, the data of the disaster recovery relationship is in the MasterInfo field. The disaster recovery relationship only contains partial basic data. Detailed data must be pulled manually via the interface.</p>
     */
    public void setWithDr(Long WithDr) {
        this.WithDr = WithDr;
    }

    /**
     * Get <p>Whether it contains read-only instances. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p> 
     * @return WithRo <p>Whether it contains read-only instances. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p>
     */
    public Long getWithRo() {
        return this.WithRo;
    }

    /**
     * Set <p>Whether it contains read-only instances. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p>
     * @param WithRo <p>Whether it contains read-only instances. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p>
     */
    public void setWithRo(Long WithRo) {
        this.WithRo = WithRo;
    }

    /**
     * Get <p>Whether the primary instance is included. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p> 
     * @return WithMaster <p>Whether the primary instance is included. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p>
     */
    public Long getWithMaster() {
        return this.WithMaster;
    }

    /**
     * Set <p>Whether the primary instance is included. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p>
     * @param WithMaster <p>Whether the primary instance is included. Valid values: 0 - does not include, 1 - includes. Default value is 1.</p>
     */
    public void setWithMaster(Long WithMaster) {
        this.WithMaster = WithMaster;
    }

    /**
     * Get <p>Placement group ID list.</p> 
     * @return DeployGroupIds <p>Placement group ID list.</p>
     */
    public String [] getDeployGroupIds() {
        return this.DeployGroupIds;
    }

    /**
     * Set <p>Placement group ID list.</p>
     * @param DeployGroupIds <p>Placement group ID list.</p>
     */
    public void setDeployGroupIds(String [] DeployGroupIds) {
        this.DeployGroupIds = DeployGroupIds;
    }

    /**
     * Get <p>Filter by tag key.</p> 
     * @return TagKeysForSearch <p>Filter by tag key.</p>
     */
    public String [] getTagKeysForSearch() {
        return this.TagKeysForSearch;
    }

    /**
     * Set <p>Filter by tag key.</p>
     * @param TagKeysForSearch <p>Filter by tag key.</p>
     */
    public void setTagKeysForSearch(String [] TagKeysForSearch) {
        this.TagKeysForSearch = TagKeysForSearch;
    }

    /**
     * Get <p>Financial Enclosure ID.</p> 
     * @return CageIds <p>Financial Enclosure ID.</p>
     */
    public String [] getCageIds() {
        return this.CageIds;
    }

    /**
     * Set <p>Financial Enclosure ID.</p>
     * @param CageIds <p>Financial Enclosure ID.</p>
     */
    public void setCageIds(String [] CageIds) {
        this.CageIds = CageIds;
    }

    /**
     * Get <p>Tag value</p> 
     * @return TagValues <p>Tag value</p>
     */
    public String [] getTagValues() {
        return this.TagValues;
    }

    /**
     * Set <p>Tag value</p>
     * @param TagValues <p>Tag value</p>
     */
    public void setTagValues(String [] TagValues) {
        this.TagValues = TagValues;
    }

    /**
     * Get <p>Character type VPC ID</p> 
     * @return UniqueVpcIds <p>Character type VPC ID</p>
     */
    public String [] getUniqueVpcIds() {
        return this.UniqueVpcIds;
    }

    /**
     * Set <p>Character type VPC ID</p>
     * @param UniqueVpcIds <p>Character type VPC ID</p>
     */
    public void setUniqueVpcIds(String [] UniqueVpcIds) {
        this.UniqueVpcIds = UniqueVpcIds;
    }

    /**
     * Get <p>VPC character type subnetId</p> 
     * @return UniqSubnetIds <p>VPC character type subnetId</p>
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set <p>VPC character type subnetId</p>
     * @param UniqSubnetIds <p>VPC character type subnetId</p>
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get <p>Tag key value<br>Please note, tags of the instance being created are unable to query.</p> 
     * @return Tags <p>Tag key value<br>Please note, tags of the instance being created are unable to query.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag key value<br>Please note, tags of the instance being created are unable to query.</p>
     * @param Tags <p>Tag key value<br>Please note, tags of the instance being created are unable to query.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Database proxy IP.</p> 
     * @return ProxyVips <p>Database proxy IP.</p>
     */
    public String [] getProxyVips() {
        return this.ProxyVips;
    }

    /**
     * Set <p>Database proxy IP.</p>
     * @param ProxyVips <p>Database proxy IP.</p>
     */
    public void setProxyVips(String [] ProxyVips) {
        this.ProxyVips = ProxyVips;
    }

    /**
     * Get <p>Database proxy ID.</p> 
     * @return ProxyIds <p>Database proxy ID.</p>
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set <p>Database proxy ID.</p>
     * @param ProxyIds <p>Database proxy ID.</p>
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get <p>Database engine type. Valid values: InnoDB, RocksDB.</p> 
     * @return EngineTypes <p>Database engine type. Valid values: InnoDB, RocksDB.</p>
     */
    public String [] getEngineTypes() {
        return this.EngineTypes;
    }

    /**
     * Set <p>Database engine type. Valid values: InnoDB, RocksDB.</p>
     * @param EngineTypes <p>Database engine type. Valid values: InnoDB, RocksDB.</p>
     */
    public void setEngineTypes(String [] EngineTypes) {
        this.EngineTypes = EngineTypes;
    }

    /**
     * Get <p>Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false.</p> 
     * @return QueryClusterInfo <p>Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false.</p>
     */
    public Boolean getQueryClusterInfo() {
        return this.QueryClusterInfo;
    }

    /**
     * Set <p>Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false.</p>
     * @param QueryClusterInfo <p>Whether to obtain the Cluster Edition instance node information. Valid values: true or false. The default value is false.</p>
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

