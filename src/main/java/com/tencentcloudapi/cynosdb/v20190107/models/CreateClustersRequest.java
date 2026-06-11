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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClustersRequest extends AbstractModel {

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>VPC network ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Database type</p><p>Enumeration value:</p><ul><li>MYSQL: MYSQL</li></ul>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>Database version</p><p>Enumeration value:</p><ul><li>5.7: MySQL 5.7 edition</li><li>8.0: MySQL 8.0 edition</li></ul>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>project-ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Required when DbMode is NORMAL or left blank<br>Cpu cores of the regular instance</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Required when DbMode is NORMAL or left blank<br>Ordinary instance memory in GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Instance count</p><p>Value ranges from [1, 16]</p><p>Default value: 2</p><ul><li>A value of 2 means one rw instance + one ro instance.</li><li>The transmitted n refers to one rw instance + n-1 ro instances (identical specifications).</li><li>For a more precise cluster composition collocation, please use InstanceInitInfos.</li><li>The value set by this parameter is suitable for provisioned resource cluster. If needed to set the specifications and quantity of Serverless cluster, please use the InstanceInitInfo structure in InstanceInitInfos.n.</li></ul>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>This parameter is meaningless and abandoned.<br>Storage size, in GB.</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>Cluster name, length less than 64 characters, each character value ranges from uppercase/lowercase letters, digits, special symbols ('-', '_', '.')</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Account (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&amp;*_-+=|(){}[]:;&#39;&lt;&gt;,.?/ with any three types required)</p>
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * <p>Port, default 3306, in the range of [0, 65535)</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Pay-as-you-go billing</li><li>1: Monthly Subscription</li></ul><p>Default value: 0</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Number of clusters to purchase. Optional value range: [1,50]. Default is 1.</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>Rollback type</p><p>Enumeration value:</p><ul><li>noneRollback: No rollback</li><li>snapRollback: Snapshot rollback</li><li>timeRollback: Point-in-time rollback</li></ul>
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p>
    */
    @SerializedName("RollbackId")
    @Expose
    private Long RollbackId;

    /**
    * <p>During rollback, input the source cluster ID to search for the source poolId</p>
    */
    @SerializedName("OriginalClusterId")
    @Expose
    private String OriginalClusterId;

    /**
    * <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p>
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * <p>This parameter is meaningless and abandoned.<br>Point-in-time rollback, allowed range of specified time.</p>
    */
    @SerializedName("ExpectTimeThresh")
    @Expose
    private Long ExpectTimeThresh;

    /**
    * <p>Ordinary instance storage cap, in GB<br>When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory.</p>
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * <p>Annual and monthly subscription duration</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>Annual and monthly subscription duration unit, ['s', 'd', 'm', 'y']</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Whether Annual/Monthly Subscription is auto-renewed</p><p>Enumeration value:</p><ul><li>0: Default renewal method</li><li>1: Auto-renewal</li><li>2: No auto-renewal</li></ul><p>Default value: 0</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>Whether to automatically select voucher 1 Yes 0 No Default value: 0</p><p>Enumeration value:</p><ul><li>1: Yes</li><li>0: No</li></ul><p>Default value: 0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>Instance count (this parameter is deprecated and only for existing accommodative)</p>
    */
    @SerializedName("HaCount")
    @Expose
    private Long HaCount;

    /**
    * <p>Order source</p>
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * <p>tag Array info that should be bound for cluster creation</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Db type</p><p>Enumeration value:</p><ul><li>NORMAL: NORMAL instance</li><li>SERVERLESS: SERVERLESS instance</li></ul><p>Default value: NORMAL</p><p>Selectable when DbType is MYSQL (default NORMAL)</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>Required when DbMode is SERVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>Required when DbMode is SERVERLESS:<br>Maximum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs.</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>No auto pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: yes</p><p>Take effect when DbMode is SERVERLESS</p>
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * <p>When DbMode is SERVERLESS, specify the delay for Cluster Auto-Pause in seconds. Optional range: [600,691200]<br>Default value: 600</p>
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * <p>The storage billing mode of the cluster. Pay-As-You-Go: 0, Monthly Subscription: 1. Default is Pay-As-You-Go.<br>When DbType is MYSQL and the compute billing mode of the cluster is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be Pay-As-You-Go.<br>Rollback and clone do not support Monthly Subscription storage.</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * <p>Security group id array</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>Alarm policy Id array</p>
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

    /**
    * <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive</p>
    */
    @SerializedName("ClusterParams")
    @Expose
    private ParamItem [] ClusterParams;

    /**
    * <p>Transaction mode</p><p>Enumeration value:</p><ul><li>0: Place order and pay</li><li>1: Place order</li></ul><p>Default value: 0</p>
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>Multi-AZ address</p>
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p>
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private InstanceInitInfo [] InstanceInitInfos;

    /**
    * <p>Global database unique ID</p>
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * <p>Database proxy configuration</p>
    */
    @SerializedName("ProxyConfig")
    @Expose
    private ProxyConfig ProxyConfig;

    /**
    * <p>Auto archive or not</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: no</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS</p>
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
    * <p>Archiving processing time after pausing</p><p>Measurement unit: hour</p><p>Default value: 12</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS.</p>
    */
    @SerializedName("AutoArchiveDelayHours")
    @Expose
    private Long AutoArchiveDelayHours;

    /**
    * <p>Cluster level, optional. Example: P0, P1. (This field can be ignored)</p>
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * <p>Kernel minor version</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
     * Get <p>AZ.</p> 
     * @return Zone <p>AZ.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ.</p>
     * @param Zone <p>AZ.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>VPC network ID</p> 
     * @return VpcId <p>VPC network ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC network ID</p>
     * @param VpcId <p>VPC network ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID</p> 
     * @return SubnetId <p>Subnet ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID</p>
     * @param SubnetId <p>Subnet ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Database type</p><p>Enumeration value:</p><ul><li>MYSQL: MYSQL</li></ul> 
     * @return DbType <p>Database type</p><p>Enumeration value:</p><ul><li>MYSQL: MYSQL</li></ul>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>Database type</p><p>Enumeration value:</p><ul><li>MYSQL: MYSQL</li></ul>
     * @param DbType <p>Database type</p><p>Enumeration value:</p><ul><li>MYSQL: MYSQL</li></ul>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>Database version</p><p>Enumeration value:</p><ul><li>5.7: MySQL 5.7 edition</li><li>8.0: MySQL 8.0 edition</li></ul> 
     * @return DbVersion <p>Database version</p><p>Enumeration value:</p><ul><li>5.7: MySQL 5.7 edition</li><li>8.0: MySQL 8.0 edition</li></ul>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>Database version</p><p>Enumeration value:</p><ul><li>5.7: MySQL 5.7 edition</li><li>8.0: MySQL 8.0 edition</li></ul>
     * @param DbVersion <p>Database version</p><p>Enumeration value:</p><ul><li>5.7: MySQL 5.7 edition</li><li>8.0: MySQL 8.0 edition</li></ul>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get <p>project-ID</p> 
     * @return ProjectId <p>project-ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>project-ID</p>
     * @param ProjectId <p>project-ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Required when DbMode is NORMAL or left blank<br>Cpu cores of the regular instance</p> 
     * @return Cpu <p>Required when DbMode is NORMAL or left blank<br>Cpu cores of the regular instance</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Required when DbMode is NORMAL or left blank<br>Cpu cores of the regular instance</p>
     * @param Cpu <p>Required when DbMode is NORMAL or left blank<br>Cpu cores of the regular instance</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Required when DbMode is NORMAL or left blank<br>Ordinary instance memory in GB</p> 
     * @return Memory <p>Required when DbMode is NORMAL or left blank<br>Ordinary instance memory in GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Required when DbMode is NORMAL or left blank<br>Ordinary instance memory in GB</p>
     * @param Memory <p>Required when DbMode is NORMAL or left blank<br>Ordinary instance memory in GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Instance count</p><p>Value ranges from [1, 16]</p><p>Default value: 2</p><ul><li>A value of 2 means one rw instance + one ro instance.</li><li>The transmitted n refers to one rw instance + n-1 ro instances (identical specifications).</li><li>For a more precise cluster composition collocation, please use InstanceInitInfos.</li><li>The value set by this parameter is suitable for provisioned resource cluster. If needed to set the specifications and quantity of Serverless cluster, please use the InstanceInitInfo structure in InstanceInitInfos.n.</li></ul> 
     * @return InstanceCount <p>Instance count</p><p>Value ranges from [1, 16]</p><p>Default value: 2</p><ul><li>A value of 2 means one rw instance + one ro instance.</li><li>The transmitted n refers to one rw instance + n-1 ro instances (identical specifications).</li><li>For a more precise cluster composition collocation, please use InstanceInitInfos.</li><li>The value set by this parameter is suitable for provisioned resource cluster. If needed to set the specifications and quantity of Serverless cluster, please use the InstanceInitInfo structure in InstanceInitInfos.n.</li></ul>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>Instance count</p><p>Value ranges from [1, 16]</p><p>Default value: 2</p><ul><li>A value of 2 means one rw instance + one ro instance.</li><li>The transmitted n refers to one rw instance + n-1 ro instances (identical specifications).</li><li>For a more precise cluster composition collocation, please use InstanceInitInfos.</li><li>The value set by this parameter is suitable for provisioned resource cluster. If needed to set the specifications and quantity of Serverless cluster, please use the InstanceInitInfo structure in InstanceInitInfos.n.</li></ul>
     * @param InstanceCount <p>Instance count</p><p>Value ranges from [1, 16]</p><p>Default value: 2</p><ul><li>A value of 2 means one rw instance + one ro instance.</li><li>The transmitted n refers to one rw instance + n-1 ro instances (identical specifications).</li><li>For a more precise cluster composition collocation, please use InstanceInitInfos.</li><li>The value set by this parameter is suitable for provisioned resource cluster. If needed to set the specifications and quantity of Serverless cluster, please use the InstanceInitInfo structure in InstanceInitInfos.n.</li></ul>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>This parameter is meaningless and abandoned.<br>Storage size, in GB.</p> 
     * @return Storage <p>This parameter is meaningless and abandoned.<br>Storage size, in GB.</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>This parameter is meaningless and abandoned.<br>Storage size, in GB.</p>
     * @param Storage <p>This parameter is meaningless and abandoned.<br>Storage size, in GB.</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Cluster name, length less than 64 characters, each character value ranges from uppercase/lowercase letters, digits, special symbols ('-', '_', '.')</p> 
     * @return ClusterName <p>Cluster name, length less than 64 characters, each character value ranges from uppercase/lowercase letters, digits, special symbols ('-', '_', '.')</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name, length less than 64 characters, each character value ranges from uppercase/lowercase letters, digits, special symbols ('-', '_', '.')</p>
     * @param ClusterName <p>Cluster name, length less than 64 characters, each character value ranges from uppercase/lowercase letters, digits, special symbols ('-', '_', '.')</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Account (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&amp;*_-+=|(){}[]:;&#39;&lt;&gt;,.?/ with any three types required)</p> 
     * @return AdminPassword <p>Account (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&amp;*_-+=|(){}[]:;&#39;&lt;&gt;,.?/ with any three types required)</p>
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set <p>Account (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&amp;*_-+=|(){}[]:;&#39;&lt;&gt;,.?/ with any three types required)</p>
     * @param AdminPassword <p>Account (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&amp;*_-+=|(){}[]:;&#39;&lt;&gt;,.?/ with any three types required)</p>
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get <p>Port, default 3306, in the range of [0, 65535)</p> 
     * @return Port <p>Port, default 3306, in the range of [0, 65535)</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Port, default 3306, in the range of [0, 65535)</p>
     * @param Port <p>Port, default 3306, in the range of [0, 65535)</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Pay-as-you-go billing</li><li>1: Monthly Subscription</li></ul><p>Default value: 0</p> 
     * @return PayMode <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Pay-as-you-go billing</li><li>1: Monthly Subscription</li></ul><p>Default value: 0</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Pay-as-you-go billing</li><li>1: Monthly Subscription</li></ul><p>Default value: 0</p>
     * @param PayMode <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Pay-as-you-go billing</li><li>1: Monthly Subscription</li></ul><p>Default value: 0</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Number of clusters to purchase. Optional value range: [1,50]. Default is 1.</p> 
     * @return Count <p>Number of clusters to purchase. Optional value range: [1,50]. Default is 1.</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>Number of clusters to purchase. Optional value range: [1,50]. Default is 1.</p>
     * @param Count <p>Number of clusters to purchase. Optional value range: [1,50]. Default is 1.</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>Rollback type</p><p>Enumeration value:</p><ul><li>noneRollback: No rollback</li><li>snapRollback: Snapshot rollback</li><li>timeRollback: Point-in-time rollback</li></ul> 
     * @return RollbackStrategy <p>Rollback type</p><p>Enumeration value:</p><ul><li>noneRollback: No rollback</li><li>snapRollback: Snapshot rollback</li><li>timeRollback: Point-in-time rollback</li></ul>
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set <p>Rollback type</p><p>Enumeration value:</p><ul><li>noneRollback: No rollback</li><li>snapRollback: Snapshot rollback</li><li>timeRollback: Point-in-time rollback</li></ul>
     * @param RollbackStrategy <p>Rollback type</p><p>Enumeration value:</p><ul><li>noneRollback: No rollback</li><li>snapRollback: Snapshot rollback</li><li>timeRollback: Point-in-time rollback</li></ul>
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p> 
     * @return RollbackId <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p>
     */
    public Long getRollbackId() {
        return this.RollbackId;
    }

    /**
     * Set <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p>
     * @param RollbackId <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p>
     */
    public void setRollbackId(Long RollbackId) {
        this.RollbackId = RollbackId;
    }

    /**
     * Get <p>During rollback, input the source cluster ID to search for the source poolId</p> 
     * @return OriginalClusterId <p>During rollback, input the source cluster ID to search for the source poolId</p>
     */
    public String getOriginalClusterId() {
        return this.OriginalClusterId;
    }

    /**
     * Set <p>During rollback, input the source cluster ID to search for the source poolId</p>
     * @param OriginalClusterId <p>During rollback, input the source cluster ID to search for the source poolId</p>
     */
    public void setOriginalClusterId(String OriginalClusterId) {
        this.OriginalClusterId = OriginalClusterId;
    }

    /**
     * Get <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p> 
     * @return ExpectTime <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p>
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p>
     * @param ExpectTime <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p>
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get <p>This parameter is meaningless and abandoned.<br>Point-in-time rollback, allowed range of specified time.</p> 
     * @return ExpectTimeThresh <p>This parameter is meaningless and abandoned.<br>Point-in-time rollback, allowed range of specified time.</p>
     */
    public Long getExpectTimeThresh() {
        return this.ExpectTimeThresh;
    }

    /**
     * Set <p>This parameter is meaningless and abandoned.<br>Point-in-time rollback, allowed range of specified time.</p>
     * @param ExpectTimeThresh <p>This parameter is meaningless and abandoned.<br>Point-in-time rollback, allowed range of specified time.</p>
     */
    public void setExpectTimeThresh(Long ExpectTimeThresh) {
        this.ExpectTimeThresh = ExpectTimeThresh;
    }

    /**
     * Get <p>Ordinary instance storage cap, in GB<br>When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory.</p> 
     * @return StorageLimit <p>Ordinary instance storage cap, in GB<br>When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory.</p>
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set <p>Ordinary instance storage cap, in GB<br>When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory.</p>
     * @param StorageLimit <p>Ordinary instance storage cap, in GB<br>When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory.</p>
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get <p>Annual and monthly subscription duration</p> 
     * @return TimeSpan <p>Annual and monthly subscription duration</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Annual and monthly subscription duration</p>
     * @param TimeSpan <p>Annual and monthly subscription duration</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>Annual and monthly subscription duration unit, ['s', 'd', 'm', 'y']</p> 
     * @return TimeUnit <p>Annual and monthly subscription duration unit, ['s', 'd', 'm', 'y']</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>Annual and monthly subscription duration unit, ['s', 'd', 'm', 'y']</p>
     * @param TimeUnit <p>Annual and monthly subscription duration unit, ['s', 'd', 'm', 'y']</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>Whether Annual/Monthly Subscription is auto-renewed</p><p>Enumeration value:</p><ul><li>0: Default renewal method</li><li>1: Auto-renewal</li><li>2: No auto-renewal</li></ul><p>Default value: 0</p> 
     * @return AutoRenewFlag <p>Whether Annual/Monthly Subscription is auto-renewed</p><p>Enumeration value:</p><ul><li>0: Default renewal method</li><li>1: Auto-renewal</li><li>2: No auto-renewal</li></ul><p>Default value: 0</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>Whether Annual/Monthly Subscription is auto-renewed</p><p>Enumeration value:</p><ul><li>0: Default renewal method</li><li>1: Auto-renewal</li><li>2: No auto-renewal</li></ul><p>Default value: 0</p>
     * @param AutoRenewFlag <p>Whether Annual/Monthly Subscription is auto-renewed</p><p>Enumeration value:</p><ul><li>0: Default renewal method</li><li>1: Auto-renewal</li><li>2: No auto-renewal</li></ul><p>Default value: 0</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>Whether to automatically select voucher 1 Yes 0 No Default value: 0</p><p>Enumeration value:</p><ul><li>1: Yes</li><li>0: No</li></ul><p>Default value: 0</p> 
     * @return AutoVoucher <p>Whether to automatically select voucher 1 Yes 0 No Default value: 0</p><p>Enumeration value:</p><ul><li>1: Yes</li><li>0: No</li></ul><p>Default value: 0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>Whether to automatically select voucher 1 Yes 0 No Default value: 0</p><p>Enumeration value:</p><ul><li>1: Yes</li><li>0: No</li></ul><p>Default value: 0</p>
     * @param AutoVoucher <p>Whether to automatically select voucher 1 Yes 0 No Default value: 0</p><p>Enumeration value:</p><ul><li>1: Yes</li><li>0: No</li></ul><p>Default value: 0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>Instance count (this parameter is deprecated and only for existing accommodative)</p> 
     * @return HaCount <p>Instance count (this parameter is deprecated and only for existing accommodative)</p>
     */
    public Long getHaCount() {
        return this.HaCount;
    }

    /**
     * Set <p>Instance count (this parameter is deprecated and only for existing accommodative)</p>
     * @param HaCount <p>Instance count (this parameter is deprecated and only for existing accommodative)</p>
     */
    public void setHaCount(Long HaCount) {
        this.HaCount = HaCount;
    }

    /**
     * Get <p>Order source</p> 
     * @return OrderSource <p>Order source</p>
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set <p>Order source</p>
     * @param OrderSource <p>Order source</p>
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get <p>tag Array info that should be bound for cluster creation</p> 
     * @return ResourceTags <p>tag Array info that should be bound for cluster creation</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>tag Array info that should be bound for cluster creation</p>
     * @param ResourceTags <p>tag Array info that should be bound for cluster creation</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Db type</p><p>Enumeration value:</p><ul><li>NORMAL: NORMAL instance</li><li>SERVERLESS: SERVERLESS instance</li></ul><p>Default value: NORMAL</p><p>Selectable when DbType is MYSQL (default NORMAL)</p> 
     * @return DbMode <p>Db type</p><p>Enumeration value:</p><ul><li>NORMAL: NORMAL instance</li><li>SERVERLESS: SERVERLESS instance</li></ul><p>Default value: NORMAL</p><p>Selectable when DbType is MYSQL (default NORMAL)</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Db type</p><p>Enumeration value:</p><ul><li>NORMAL: NORMAL instance</li><li>SERVERLESS: SERVERLESS instance</li></ul><p>Default value: NORMAL</p><p>Selectable when DbType is MYSQL (default NORMAL)</p>
     * @param DbMode <p>Db type</p><p>Enumeration value:</p><ul><li>NORMAL: NORMAL instance</li><li>SERVERLESS: SERVERLESS instance</li></ul><p>Default value: NORMAL</p><p>Selectable when DbType is MYSQL (default NORMAL)</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>Required when DbMode is SERVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p> 
     * @return MinCpu <p>Required when DbMode is SERVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>Required when DbMode is SERVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p>
     * @param MinCpu <p>Required when DbMode is SERVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>Required when DbMode is SERVERLESS:<br>Maximum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs.</p> 
     * @return MaxCpu <p>Required when DbMode is SERVERLESS:<br>Maximum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs.</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>Required when DbMode is SERVERLESS:<br>Maximum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs.</p>
     * @param MaxCpu <p>Required when DbMode is SERVERLESS:<br>Maximum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs.</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>No auto pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: yes</p><p>Take effect when DbMode is SERVERLESS</p> 
     * @return AutoPause <p>No auto pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: yes</p><p>Take effect when DbMode is SERVERLESS</p>
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set <p>No auto pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: yes</p><p>Take effect when DbMode is SERVERLESS</p>
     * @param AutoPause <p>No auto pause</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: yes</p><p>Take effect when DbMode is SERVERLESS</p>
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get <p>When DbMode is SERVERLESS, specify the delay for Cluster Auto-Pause in seconds. Optional range: [600,691200]<br>Default value: 600</p> 
     * @return AutoPauseDelay <p>When DbMode is SERVERLESS, specify the delay for Cluster Auto-Pause in seconds. Optional range: [600,691200]<br>Default value: 600</p>
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set <p>When DbMode is SERVERLESS, specify the delay for Cluster Auto-Pause in seconds. Optional range: [600,691200]<br>Default value: 600</p>
     * @param AutoPauseDelay <p>When DbMode is SERVERLESS, specify the delay for Cluster Auto-Pause in seconds. Optional range: [600,691200]<br>Default value: 600</p>
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get <p>The storage billing mode of the cluster. Pay-As-You-Go: 0, Monthly Subscription: 1. Default is Pay-As-You-Go.<br>When DbType is MYSQL and the compute billing mode of the cluster is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be Pay-As-You-Go.<br>Rollback and clone do not support Monthly Subscription storage.</p> 
     * @return StoragePayMode <p>The storage billing mode of the cluster. Pay-As-You-Go: 0, Monthly Subscription: 1. Default is Pay-As-You-Go.<br>When DbType is MYSQL and the compute billing mode of the cluster is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be Pay-As-You-Go.<br>Rollback and clone do not support Monthly Subscription storage.</p>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>The storage billing mode of the cluster. Pay-As-You-Go: 0, Monthly Subscription: 1. Default is Pay-As-You-Go.<br>When DbType is MYSQL and the compute billing mode of the cluster is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be Pay-As-You-Go.<br>Rollback and clone do not support Monthly Subscription storage.</p>
     * @param StoragePayMode <p>The storage billing mode of the cluster. Pay-As-You-Go: 0, Monthly Subscription: 1. Default is Pay-As-You-Go.<br>When DbType is MYSQL and the compute billing mode of the cluster is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be Pay-As-You-Go.<br>Rollback and clone do not support Monthly Subscription storage.</p>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>Security group id array</p> 
     * @return SecurityGroupIds <p>Security group id array</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Security group id array</p>
     * @param SecurityGroupIds <p>Security group id array</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>Alarm policy Id array</p> 
     * @return AlarmPolicyIds <p>Alarm policy Id array</p>
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set <p>Alarm policy Id array</p>
     * @param AlarmPolicyIds <p>Alarm policy Id array</p>
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    /**
     * Get <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive</p> 
     * @return ClusterParams <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive</p>
     */
    public ParamItem [] getClusterParams() {
        return this.ClusterParams;
    }

    /**
     * Set <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive</p>
     * @param ClusterParams <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive</p>
     */
    public void setClusterParams(ParamItem [] ClusterParams) {
        this.ClusterParams = ClusterParams;
    }

    /**
     * Get <p>Transaction mode</p><p>Enumeration value:</p><ul><li>0: Place order and pay</li><li>1: Place order</li></ul><p>Default value: 0</p> 
     * @return DealMode <p>Transaction mode</p><p>Enumeration value:</p><ul><li>0: Place order and pay</li><li>1: Place order</li></ul><p>Default value: 0</p>
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set <p>Transaction mode</p><p>Enumeration value:</p><ul><li>0: Place order and pay</li><li>1: Place order</li></ul><p>Default value: 0</p>
     * @param DealMode <p>Transaction mode</p><p>Enumeration value:</p><ul><li>0: Place order and pay</li><li>1: Place order</li></ul><p>Default value: 0</p>
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p> 
     * @return ParamTemplateId <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p>
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p>
     * @param ParamTemplateId <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p>
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>Multi-AZ address</p> 
     * @return SlaveZone <p>Multi-AZ address</p>
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set <p>Multi-AZ address</p>
     * @param SlaveZone <p>Multi-AZ address</p>
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p> 
     * @return InstanceInitInfos <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p>
     */
    public InstanceInitInfo [] getInstanceInitInfos() {
        return this.InstanceInitInfos;
    }

    /**
     * Set <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p>
     * @param InstanceInitInfos <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p>
     */
    public void setInstanceInitInfos(InstanceInitInfo [] InstanceInitInfos) {
        this.InstanceInitInfos = InstanceInitInfos;
    }

    /**
     * Get <p>Global database unique ID</p> 
     * @return GdnId <p>Global database unique ID</p>
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set <p>Global database unique ID</p>
     * @param GdnId <p>Global database unique ID</p>
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get <p>Database proxy configuration</p> 
     * @return ProxyConfig <p>Database proxy configuration</p>
     */
    public ProxyConfig getProxyConfig() {
        return this.ProxyConfig;
    }

    /**
     * Set <p>Database proxy configuration</p>
     * @param ProxyConfig <p>Database proxy configuration</p>
     */
    public void setProxyConfig(ProxyConfig ProxyConfig) {
        this.ProxyConfig = ProxyConfig;
    }

    /**
     * Get <p>Auto archive or not</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: no</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS</p> 
     * @return AutoArchive <p>Auto archive or not</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: no</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS</p>
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set <p>Auto archive or not</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: no</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS</p>
     * @param AutoArchive <p>Auto archive or not</p><p>Enumeration value:</p><ul><li>yes: Yes</li><li>no: No</li></ul><p>Default value: no</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS</p>
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    /**
     * Get <p>Archiving processing time after pausing</p><p>Measurement unit: hour</p><p>Default value: 12</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS.</p> 
     * @return AutoArchiveDelayHours <p>Archiving processing time after pausing</p><p>Measurement unit: hour</p><p>Default value: 12</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS.</p>
     */
    public Long getAutoArchiveDelayHours() {
        return this.AutoArchiveDelayHours;
    }

    /**
     * Set <p>Archiving processing time after pausing</p><p>Measurement unit: hour</p><p>Default value: 12</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS.</p>
     * @param AutoArchiveDelayHours <p>Archiving processing time after pausing</p><p>Measurement unit: hour</p><p>Default value: 12</p><p>This parameter takes effect only when the primary instance of the current cluster is SERVERLESS.</p>
     */
    public void setAutoArchiveDelayHours(Long AutoArchiveDelayHours) {
        this.AutoArchiveDelayHours = AutoArchiveDelayHours;
    }

    /**
     * Get <p>Cluster level, optional. Example: P0, P1. (This field can be ignored)</p> 
     * @return ClusterLevel <p>Cluster level, optional. Example: P0, P1. (This field can be ignored)</p>
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set <p>Cluster level, optional. Example: P0, P1. (This field can be ignored)</p>
     * @param ClusterLevel <p>Cluster level, optional. Example: P0, P1. (This field can be ignored)</p>
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get <p>Kernel minor version</p> 
     * @return CynosVersion <p>Kernel minor version</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>Kernel minor version</p>
     * @param CynosVersion <p>Kernel minor version</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
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
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
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
        if (source.InstanceInitInfos != null) {
            this.InstanceInitInfos = new InstanceInitInfo[source.InstanceInitInfos.length];
            for (int i = 0; i < source.InstanceInitInfos.length; i++) {
                this.InstanceInitInfos[i] = new InstanceInitInfo(source.InstanceInitInfos[i]);
            }
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.ProxyConfig != null) {
            this.ProxyConfig = new ProxyConfig(source.ProxyConfig);
        }
        if (source.AutoArchive != null) {
            this.AutoArchive = new String(source.AutoArchive);
        }
        if (source.AutoArchiveDelayHours != null) {
            this.AutoArchiveDelayHours = new Long(source.AutoArchiveDelayHours);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
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
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
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
        this.setParamArrayObj(map, prefix + "InstanceInitInfos.", this.InstanceInitInfos);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);
        this.setParamObj(map, prefix + "ProxyConfig.", this.ProxyConfig);
        this.setParamSimple(map, prefix + "AutoArchive", this.AutoArchive);
        this.setParamSimple(map, prefix + "AutoArchiveDelayHours", this.AutoArchiveDelayHours);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);

    }
}

