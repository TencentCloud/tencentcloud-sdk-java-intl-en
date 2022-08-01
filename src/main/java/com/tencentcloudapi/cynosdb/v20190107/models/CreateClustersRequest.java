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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClustersRequest extends AbstractModel{

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Database type. Valid values: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Database version. Valid values: 
<li> Valid values for `MYSQL`: 5.7 and 8.0 </li>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * It is required when `DbMode` is set to `NORMAL` or left empty.
Number of CPU cores of normal instance
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * It is required when `DbMode` is set to `NORMAL` or left empty.
Memory of a non-serverless instance in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * This parameter has been deprecated.
Storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Cluster name, which can contain less than 64 letters, digits, or symbols (-_.).
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Account password, which must contain 8-64 characters in at least three of the following four types: uppercase letters, lowercase letters, digits, and symbols (~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/).
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * Port. Valid range: [0, 65535). Default value: 3306
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Billing mode. `0`: pay-as-you-go; `1`: monthly subscription. Default value: `0`
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Number of purchased clusters. Valid range: [1,50]. Default value: 1
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Rollback type:
noneRollback: no rollback;
snapRollback: rollback by snapshot;
timeRollback: rollback by time point
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * `snapshotId` for snapshot rollback or `queryId` for time point rollback. 0 indicates to determine whether the time point is valid
    */
    @SerializedName("RollbackId")
    @Expose
    private Long RollbackId;

    /**
    * The source cluster ID passed in during rollback to find the source `poolId`
    */
    @SerializedName("OriginalClusterId")
    @Expose
    private String OriginalClusterId;

    /**
    * Specified time for time point rollback or snapshot time for snapshot rollback
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * This parameter has been deprecated.
Specified allowed time range for time point rollback
    */
    @SerializedName("ExpectTimeThresh")
    @Expose
    private Long ExpectTimeThresh;

    /**
    * Storage upper limit of normal instance in GB
If `DbType` is `MYSQL` and the storage billing mode is monthly subscription, the parameter value can’t exceed the maximum storage corresponding to the CPU and memory specifications.
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Number of Instances. Valid range: (0,16]
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Purchase duration of monthly subscription plan
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Duration unit of monthly subscription. Valid values: `s`, `d`, `m`, `y`
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Whether auto-renewal is enabled for monthly subscription plan. Default value: `0`
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether to automatically select a voucher. `1`: yes; `0`: no. Default value: `0`
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Number of instances (this parameter has been disused and is retained only for compatibility with existing instances)
    */
    @SerializedName("HaCount")
    @Expose
    private Long HaCount;

    /**
    * Order source
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * Array of tags to be bound to the created cluster
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Database type
Valid values when `DbType` is `MYSQL` (default value: `NORMAL`):
<li>NORMAL</li>
<li>SERVERLESS</li>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * This parameter is required if `DbMode` is `SERVERLESS`.
Minimum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`.
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * This parameter is required if `DbMode` is `SERVERLESS`.
Maximum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`.
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * This parameter specifies whether the cluster will be automatically paused if `DbMode` is `SERVERLESS`. Valid values:
<li>yes</li>
<li>no</li>
Default value: yes
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * This parameter specifies the delay for automatic cluster pause in seconds if `DbMode` is `SERVERLESS`. Value range: [600,691200]
Default value: `600`
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * The billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription). Default value: `0`.
If `DbType` is `MYSQL` and the billing mode of cluster compute is pay-as-you-go (or the `DbMode` is `SERVERLESS`), the billing mode of cluster storage must be pay-as-you-go.
Clusters with storage billed in monthly subscription can’t be cloned or rolled back.
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * Array of security group IDs
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Array of alarm policy IDs
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

    /**
    * Array of parameters
    */
    @SerializedName("ClusterParams")
    @Expose
    private ParamItem [] ClusterParams;

    /**
    * Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * Parameter template ID, which can be obtained by querying parameter template information “DescribeParamTemplates”
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * Multi-AZ address
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Database type. Valid values: 
<li> MYSQL </li> 
     * @return DbType Database type. Valid values: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database type. Valid values: 
<li> MYSQL </li>
     * @param DbType Database type. Valid values: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Database version. Valid values: 
<li> Valid values for `MYSQL`: 5.7 and 8.0 </li> 
     * @return DbVersion Database version. Valid values: 
<li> Valid values for `MYSQL`: 5.7 and 8.0 </li>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database version. Valid values: 
<li> Valid values for `MYSQL`: 5.7 and 8.0 </li>
     * @param DbVersion Database version. Valid values: 
<li> Valid values for `MYSQL`: 5.7 and 8.0 </li>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

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
     * Get It is required when `DbMode` is set to `NORMAL` or left empty.
Number of CPU cores of normal instance 
     * @return Cpu It is required when `DbMode` is set to `NORMAL` or left empty.
Number of CPU cores of normal instance
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set It is required when `DbMode` is set to `NORMAL` or left empty.
Number of CPU cores of normal instance
     * @param Cpu It is required when `DbMode` is set to `NORMAL` or left empty.
Number of CPU cores of normal instance
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get It is required when `DbMode` is set to `NORMAL` or left empty.
Memory of a non-serverless instance in GB 
     * @return Memory It is required when `DbMode` is set to `NORMAL` or left empty.
Memory of a non-serverless instance in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set It is required when `DbMode` is set to `NORMAL` or left empty.
Memory of a non-serverless instance in GB
     * @param Memory It is required when `DbMode` is set to `NORMAL` or left empty.
Memory of a non-serverless instance in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get This parameter has been deprecated.
Storage capacity in GB 
     * @return Storage This parameter has been deprecated.
Storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set This parameter has been deprecated.
Storage capacity in GB
     * @param Storage This parameter has been deprecated.
Storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Cluster name, which can contain less than 64 letters, digits, or symbols (-_.). 
     * @return ClusterName Cluster name, which can contain less than 64 letters, digits, or symbols (-_.).
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name, which can contain less than 64 letters, digits, or symbols (-_.).
     * @param ClusterName Cluster name, which can contain less than 64 letters, digits, or symbols (-_.).
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Account password, which must contain 8-64 characters in at least three of the following four types: uppercase letters, lowercase letters, digits, and symbols (~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/). 
     * @return AdminPassword Account password, which must contain 8-64 characters in at least three of the following four types: uppercase letters, lowercase letters, digits, and symbols (~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/).
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set Account password, which must contain 8-64 characters in at least three of the following four types: uppercase letters, lowercase letters, digits, and symbols (~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/).
     * @param AdminPassword Account password, which must contain 8-64 characters in at least three of the following four types: uppercase letters, lowercase letters, digits, and symbols (~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/).
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get Port. Valid range: [0, 65535). Default value: 3306 
     * @return Port Port. Valid range: [0, 65535). Default value: 3306
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port. Valid range: [0, 65535). Default value: 3306
     * @param Port Port. Valid range: [0, 65535). Default value: 3306
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Billing mode. `0`: pay-as-you-go; `1`: monthly subscription. Default value: `0` 
     * @return PayMode Billing mode. `0`: pay-as-you-go; `1`: monthly subscription. Default value: `0`
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. `0`: pay-as-you-go; `1`: monthly subscription. Default value: `0`
     * @param PayMode Billing mode. `0`: pay-as-you-go; `1`: monthly subscription. Default value: `0`
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Number of purchased clusters. Valid range: [1,50]. Default value: 1 
     * @return Count Number of purchased clusters. Valid range: [1,50]. Default value: 1
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of purchased clusters. Valid range: [1,50]. Default value: 1
     * @param Count Number of purchased clusters. Valid range: [1,50]. Default value: 1
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Rollback type:
noneRollback: no rollback;
snapRollback: rollback by snapshot;
timeRollback: rollback by time point 
     * @return RollbackStrategy Rollback type:
noneRollback: no rollback;
snapRollback: rollback by snapshot;
timeRollback: rollback by time point
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set Rollback type:
noneRollback: no rollback;
snapRollback: rollback by snapshot;
timeRollback: rollback by time point
     * @param RollbackStrategy Rollback type:
noneRollback: no rollback;
snapRollback: rollback by snapshot;
timeRollback: rollback by time point
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get `snapshotId` for snapshot rollback or `queryId` for time point rollback. 0 indicates to determine whether the time point is valid 
     * @return RollbackId `snapshotId` for snapshot rollback or `queryId` for time point rollback. 0 indicates to determine whether the time point is valid
     */
    public Long getRollbackId() {
        return this.RollbackId;
    }

    /**
     * Set `snapshotId` for snapshot rollback or `queryId` for time point rollback. 0 indicates to determine whether the time point is valid
     * @param RollbackId `snapshotId` for snapshot rollback or `queryId` for time point rollback. 0 indicates to determine whether the time point is valid
     */
    public void setRollbackId(Long RollbackId) {
        this.RollbackId = RollbackId;
    }

    /**
     * Get The source cluster ID passed in during rollback to find the source `poolId` 
     * @return OriginalClusterId The source cluster ID passed in during rollback to find the source `poolId`
     */
    public String getOriginalClusterId() {
        return this.OriginalClusterId;
    }

    /**
     * Set The source cluster ID passed in during rollback to find the source `poolId`
     * @param OriginalClusterId The source cluster ID passed in during rollback to find the source `poolId`
     */
    public void setOriginalClusterId(String OriginalClusterId) {
        this.OriginalClusterId = OriginalClusterId;
    }

    /**
     * Get Specified time for time point rollback or snapshot time for snapshot rollback 
     * @return ExpectTime Specified time for time point rollback or snapshot time for snapshot rollback
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set Specified time for time point rollback or snapshot time for snapshot rollback
     * @param ExpectTime Specified time for time point rollback or snapshot time for snapshot rollback
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get This parameter has been deprecated.
Specified allowed time range for time point rollback 
     * @return ExpectTimeThresh This parameter has been deprecated.
Specified allowed time range for time point rollback
     */
    public Long getExpectTimeThresh() {
        return this.ExpectTimeThresh;
    }

    /**
     * Set This parameter has been deprecated.
Specified allowed time range for time point rollback
     * @param ExpectTimeThresh This parameter has been deprecated.
Specified allowed time range for time point rollback
     */
    public void setExpectTimeThresh(Long ExpectTimeThresh) {
        this.ExpectTimeThresh = ExpectTimeThresh;
    }

    /**
     * Get Storage upper limit of normal instance in GB
If `DbType` is `MYSQL` and the storage billing mode is monthly subscription, the parameter value can’t exceed the maximum storage corresponding to the CPU and memory specifications. 
     * @return StorageLimit Storage upper limit of normal instance in GB
If `DbType` is `MYSQL` and the storage billing mode is monthly subscription, the parameter value can’t exceed the maximum storage corresponding to the CPU and memory specifications.
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage upper limit of normal instance in GB
If `DbType` is `MYSQL` and the storage billing mode is monthly subscription, the parameter value can’t exceed the maximum storage corresponding to the CPU and memory specifications.
     * @param StorageLimit Storage upper limit of normal instance in GB
If `DbType` is `MYSQL` and the storage billing mode is monthly subscription, the parameter value can’t exceed the maximum storage corresponding to the CPU and memory specifications.
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Number of Instances. Valid range: (0,16] 
     * @return InstanceCount Number of Instances. Valid range: (0,16]
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of Instances. Valid range: (0,16]
     * @param InstanceCount Number of Instances. Valid range: (0,16]
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Purchase duration of monthly subscription plan 
     * @return TimeSpan Purchase duration of monthly subscription plan
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase duration of monthly subscription plan
     * @param TimeSpan Purchase duration of monthly subscription plan
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Duration unit of monthly subscription. Valid values: `s`, `d`, `m`, `y` 
     * @return TimeUnit Duration unit of monthly subscription. Valid values: `s`, `d`, `m`, `y`
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Duration unit of monthly subscription. Valid values: `s`, `d`, `m`, `y`
     * @param TimeUnit Duration unit of monthly subscription. Valid values: `s`, `d`, `m`, `y`
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Whether auto-renewal is enabled for monthly subscription plan. Default value: `0` 
     * @return AutoRenewFlag Whether auto-renewal is enabled for monthly subscription plan. Default value: `0`
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether auto-renewal is enabled for monthly subscription plan. Default value: `0`
     * @param AutoRenewFlag Whether auto-renewal is enabled for monthly subscription plan. Default value: `0`
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether to automatically select a voucher. `1`: yes; `0`: no. Default value: `0` 
     * @return AutoVoucher Whether to automatically select a voucher. `1`: yes; `0`: no. Default value: `0`
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select a voucher. `1`: yes; `0`: no. Default value: `0`
     * @param AutoVoucher Whether to automatically select a voucher. `1`: yes; `0`: no. Default value: `0`
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Number of instances (this parameter has been disused and is retained only for compatibility with existing instances) 
     * @return HaCount Number of instances (this parameter has been disused and is retained only for compatibility with existing instances)
     */
    public Long getHaCount() {
        return this.HaCount;
    }

    /**
     * Set Number of instances (this parameter has been disused and is retained only for compatibility with existing instances)
     * @param HaCount Number of instances (this parameter has been disused and is retained only for compatibility with existing instances)
     */
    public void setHaCount(Long HaCount) {
        this.HaCount = HaCount;
    }

    /**
     * Get Order source 
     * @return OrderSource Order source
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set Order source
     * @param OrderSource Order source
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get Array of tags to be bound to the created cluster 
     * @return ResourceTags Array of tags to be bound to the created cluster
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Array of tags to be bound to the created cluster
     * @param ResourceTags Array of tags to be bound to the created cluster
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Database type
Valid values when `DbType` is `MYSQL` (default value: `NORMAL`):
<li>NORMAL</li>
<li>SERVERLESS</li> 
     * @return DbMode Database type
Valid values when `DbType` is `MYSQL` (default value: `NORMAL`):
<li>NORMAL</li>
<li>SERVERLESS</li>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database type
Valid values when `DbType` is `MYSQL` (default value: `NORMAL`):
<li>NORMAL</li>
<li>SERVERLESS</li>
     * @param DbMode Database type
Valid values when `DbType` is `MYSQL` (default value: `NORMAL`):
<li>NORMAL</li>
<li>SERVERLESS</li>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get This parameter is required if `DbMode` is `SERVERLESS`.
Minimum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`. 
     * @return MinCpu This parameter is required if `DbMode` is `SERVERLESS`.
Minimum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`.
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set This parameter is required if `DbMode` is `SERVERLESS`.
Minimum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`.
     * @param MinCpu This parameter is required if `DbMode` is `SERVERLESS`.
Minimum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`.
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get This parameter is required if `DbMode` is `SERVERLESS`.
Maximum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`. 
     * @return MaxCpu This parameter is required if `DbMode` is `SERVERLESS`.
Maximum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`.
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set This parameter is required if `DbMode` is `SERVERLESS`.
Maximum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`.
     * @param MaxCpu This parameter is required if `DbMode` is `SERVERLESS`.
Maximum number of CPU cores. For the value range, see the returned result of `DescribeServerlessInstanceSpecs`.
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get This parameter specifies whether the cluster will be automatically paused if `DbMode` is `SERVERLESS`. Valid values:
<li>yes</li>
<li>no</li>
Default value: yes 
     * @return AutoPause This parameter specifies whether the cluster will be automatically paused if `DbMode` is `SERVERLESS`. Valid values:
<li>yes</li>
<li>no</li>
Default value: yes
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set This parameter specifies whether the cluster will be automatically paused if `DbMode` is `SERVERLESS`. Valid values:
<li>yes</li>
<li>no</li>
Default value: yes
     * @param AutoPause This parameter specifies whether the cluster will be automatically paused if `DbMode` is `SERVERLESS`. Valid values:
<li>yes</li>
<li>no</li>
Default value: yes
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get This parameter specifies the delay for automatic cluster pause in seconds if `DbMode` is `SERVERLESS`. Value range: [600,691200]
Default value: `600` 
     * @return AutoPauseDelay This parameter specifies the delay for automatic cluster pause in seconds if `DbMode` is `SERVERLESS`. Value range: [600,691200]
Default value: `600`
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set This parameter specifies the delay for automatic cluster pause in seconds if `DbMode` is `SERVERLESS`. Value range: [600,691200]
Default value: `600`
     * @param AutoPauseDelay This parameter specifies the delay for automatic cluster pause in seconds if `DbMode` is `SERVERLESS`. Value range: [600,691200]
Default value: `600`
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get The billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription). Default value: `0`.
If `DbType` is `MYSQL` and the billing mode of cluster compute is pay-as-you-go (or the `DbMode` is `SERVERLESS`), the billing mode of cluster storage must be pay-as-you-go.
Clusters with storage billed in monthly subscription can’t be cloned or rolled back. 
     * @return StoragePayMode The billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription). Default value: `0`.
If `DbType` is `MYSQL` and the billing mode of cluster compute is pay-as-you-go (or the `DbMode` is `SERVERLESS`), the billing mode of cluster storage must be pay-as-you-go.
Clusters with storage billed in monthly subscription can’t be cloned or rolled back.
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set The billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription). Default value: `0`.
If `DbType` is `MYSQL` and the billing mode of cluster compute is pay-as-you-go (or the `DbMode` is `SERVERLESS`), the billing mode of cluster storage must be pay-as-you-go.
Clusters with storage billed in monthly subscription can’t be cloned or rolled back.
     * @param StoragePayMode The billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription). Default value: `0`.
If `DbType` is `MYSQL` and the billing mode of cluster compute is pay-as-you-go (or the `DbMode` is `SERVERLESS`), the billing mode of cluster storage must be pay-as-you-go.
Clusters with storage billed in monthly subscription can’t be cloned or rolled back.
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get Array of security group IDs 
     * @return SecurityGroupIds Array of security group IDs
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Array of security group IDs
     * @param SecurityGroupIds Array of security group IDs
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Array of alarm policy IDs 
     * @return AlarmPolicyIds Array of alarm policy IDs
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set Array of alarm policy IDs
     * @param AlarmPolicyIds Array of alarm policy IDs
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    /**
     * Get Array of parameters 
     * @return ClusterParams Array of parameters
     */
    public ParamItem [] getClusterParams() {
        return this.ClusterParams;
    }

    /**
     * Set Array of parameters
     * @param ClusterParams Array of parameters
     */
    public void setClusterParams(ParamItem [] ClusterParams) {
        this.ClusterParams = ClusterParams;
    }

    /**
     * Get Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order) 
     * @return DealMode Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
     * @param DealMode Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get Parameter template ID, which can be obtained by querying parameter template information “DescribeParamTemplates” 
     * @return ParamTemplateId Parameter template ID, which can be obtained by querying parameter template information “DescribeParamTemplates”
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set Parameter template ID, which can be obtained by querying parameter template information “DescribeParamTemplates”
     * @param ParamTemplateId Parameter template ID, which can be obtained by querying parameter template information “DescribeParamTemplates”
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get Multi-AZ address 
     * @return SlaveZone Multi-AZ address
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set Multi-AZ address
     * @param SlaveZone Multi-AZ address
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    public CreateClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClustersRequest(CreateClustersRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RollbackStrategy != null) {
            this.RollbackStrategy = new String(source.RollbackStrategy);
        }
        if (source.RollbackId != null) {
            this.RollbackId = new Long(source.RollbackId);
        }
        if (source.OriginalClusterId != null) {
            this.OriginalClusterId = new String(source.OriginalClusterId);
        }
        if (source.ExpectTime != null) {
            this.ExpectTime = new String(source.ExpectTime);
        }
        if (source.ExpectTimeThresh != null) {
            this.ExpectTimeThresh = new Long(source.ExpectTimeThresh);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.HaCount != null) {
            this.HaCount = new Long(source.HaCount);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new String(source.AutoPause);
        }
        if (source.AutoPauseDelay != null) {
            this.AutoPauseDelay = new Long(source.AutoPauseDelay);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AlarmPolicyIds != null) {
            this.AlarmPolicyIds = new String[source.AlarmPolicyIds.length];
            for (int i = 0; i < source.AlarmPolicyIds.length; i++) {
                this.AlarmPolicyIds[i] = new String(source.AlarmPolicyIds[i]);
            }
        }
        if (source.ClusterParams != null) {
            this.ClusterParams = new ParamItem[source.ClusterParams.length];
            for (int i = 0; i < source.ClusterParams.length; i++) {
                this.ClusterParams[i] = new ParamItem(source.ClusterParams[i]);
            }
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RollbackStrategy", this.RollbackStrategy);
        this.setParamSimple(map, prefix + "RollbackId", this.RollbackId);
        this.setParamSimple(map, prefix + "OriginalClusterId", this.OriginalClusterId);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "ExpectTimeThresh", this.ExpectTimeThresh);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "HaCount", this.HaCount);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIds.", this.AlarmPolicyIds);
        this.setParamArrayObj(map, prefix + "ClusterParams.", this.ClusterParams);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);

    }
}

