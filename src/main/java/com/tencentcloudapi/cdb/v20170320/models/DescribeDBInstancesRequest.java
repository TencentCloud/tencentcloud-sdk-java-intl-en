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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel{

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
    * Instance status. Value range: <br>0 - creating <br>1 - running <br>4 - isolating <br>5 - isolated (the instance can be restored and started in the recycle bin)
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
    * Billing method. Value range: 0 (monthly subscribed), 1 (hourly).
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
    * Instance task status. Valid values: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - enabling secondary instance access <br>4 - enabling public network access <br>5 - batch operation in progress <br>6 - rolling back <br>7 - disabling public network access <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built database <br>13 - dropping tables <br>14 - Disaster recovery instance creating sync task <br>15 - waiting for switch <br>16 - switching <br>17 - upgrade and switch completed <br>19 - parameter settings to be executed
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
    * Lock flag.
    */
    @SerializedName("CdbErrors")
    @Expose
    private Long [] CdbErrors;

    /**
    * Sort by field of the returned result set. Currently, supported values include "InstanceId", "InstanceName", "CreateTime", and "DeadlineTime".
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method of the returned result set. Currently, "ASC" or "DESC" is supported.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * Whether security group ID is used as a filter
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
     * Get Instance status. Value range: <br>0 - creating <br>1 - running <br>4 - isolating <br>5 - isolated (the instance can be restored and started in the recycle bin) 
     * @return Status Instance status. Value range: <br>0 - creating <br>1 - running <br>4 - isolating <br>5 - isolated (the instance can be restored and started in the recycle bin)
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Value range: <br>0 - creating <br>1 - running <br>4 - isolating <br>5 - isolated (the instance can be restored and started in the recycle bin)
     * @param Status Instance status. Value range: <br>0 - creating <br>1 - running <br>4 - isolating <br>5 - isolated (the instance can be restored and started in the recycle bin)
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
     * Get Billing method. Value range: 0 (monthly subscribed), 1 (hourly). 
     * @return PayTypes Billing method. Value range: 0 (monthly subscribed), 1 (hourly).
     */
    public Long [] getPayTypes() {
        return this.PayTypes;
    }

    /**
     * Set Billing method. Value range: 0 (monthly subscribed), 1 (hourly).
     * @param PayTypes Billing method. Value range: 0 (monthly subscribed), 1 (hourly).
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
     * Get Instance task status. Valid values: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - enabling secondary instance access <br>4 - enabling public network access <br>5 - batch operation in progress <br>6 - rolling back <br>7 - disabling public network access <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built database <br>13 - dropping tables <br>14 - Disaster recovery instance creating sync task <br>15 - waiting for switch <br>16 - switching <br>17 - upgrade and switch completed <br>19 - parameter settings to be executed 
     * @return TaskStatus Instance task status. Valid values: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - enabling secondary instance access <br>4 - enabling public network access <br>5 - batch operation in progress <br>6 - rolling back <br>7 - disabling public network access <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built database <br>13 - dropping tables <br>14 - Disaster recovery instance creating sync task <br>15 - waiting for switch <br>16 - switching <br>17 - upgrade and switch completed <br>19 - parameter settings to be executed
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Instance task status. Valid values: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - enabling secondary instance access <br>4 - enabling public network access <br>5 - batch operation in progress <br>6 - rolling back <br>7 - disabling public network access <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built database <br>13 - dropping tables <br>14 - Disaster recovery instance creating sync task <br>15 - waiting for switch <br>16 - switching <br>17 - upgrade and switch completed <br>19 - parameter settings to be executed
     * @param TaskStatus Instance task status. Valid values: <br>0 - no task <br>1 - upgrading <br>2 - importing data <br>3 - enabling secondary instance access <br>4 - enabling public network access <br>5 - batch operation in progress <br>6 - rolling back <br>7 - disabling public network access <br>8 - modifying password <br>9 - renaming instance <br>10 - restarting <br>12 - migrating self-built database <br>13 - dropping tables <br>14 - Disaster recovery instance creating sync task <br>15 - waiting for switch <br>16 - switching <br>17 - upgrade and switch completed <br>19 - parameter settings to be executed
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
     * Get Lock flag. 
     * @return CdbErrors Lock flag.
     */
    public Long [] getCdbErrors() {
        return this.CdbErrors;
    }

    /**
     * Set Lock flag.
     * @param CdbErrors Lock flag.
     */
    public void setCdbErrors(Long [] CdbErrors) {
        this.CdbErrors = CdbErrors;
    }

    /**
     * Get Sort by field of the returned result set. Currently, supported values include "InstanceId", "InstanceName", "CreateTime", and "DeadlineTime". 
     * @return OrderBy Sort by field of the returned result set. Currently, supported values include "InstanceId", "InstanceName", "CreateTime", and "DeadlineTime".
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort by field of the returned result set. Currently, supported values include "InstanceId", "InstanceName", "CreateTime", and "DeadlineTime".
     * @param OrderBy Sort by field of the returned result set. Currently, supported values include "InstanceId", "InstanceName", "CreateTime", and "DeadlineTime".
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method of the returned result set. Currently, "ASC" or "DESC" is supported. 
     * @return OrderDirection Sorting method of the returned result set. Currently, "ASC" or "DESC" is supported.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Sorting method of the returned result set. Currently, "ASC" or "DESC" is supported.
     * @param OrderDirection Sorting method of the returned result set. Currently, "ASC" or "DESC" is supported.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get Whether security group ID is used as a filter 
     * @return WithSecurityGroup Whether security group ID is used as a filter
     */
    public Long getWithSecurityGroup() {
        return this.WithSecurityGroup;
    }

    /**
     * Set Whether security group ID is used as a filter
     * @param WithSecurityGroup Whether security group ID is used as a filter
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

    }
}

