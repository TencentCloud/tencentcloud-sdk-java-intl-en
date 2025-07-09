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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel {

    /**
    * Instance ID, which uniquely identifies a TDSQL instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Customizable instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Application ID of instance
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Project ID of instance
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Instance region name, such as ap-shanghai
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance AZ name, such as ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC ID, which is 0 if the basic network is used
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Subnet ID, which is 0 if the basic network is used
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Private IP address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private network port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Domain name for public network access, which can be resolved by the public network
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public IP address, which can be accessed over the public network
    */
    @SerializedName("WanVip")
    @Expose
    private String WanVip;

    /**
    * Public network port
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Instance creation time in the format of `2006-01-02 15:04:05`
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last updated time of instance in the format of `2006-01-02 15:04:05`
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Auto-renewal flag. 0: no, 1: yes
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Instance expiration time in the format of `2006-01-02 15:04:05`
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Instance account
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * TDSQL version information
    */
    @SerializedName("TdsqlVersion")
    @Expose
    private String TdsqlVersion;

    /**
    * Instance memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * VPC ID in string type
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * VPC subnet ID in string type
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * Original ID of instance (this field is obsolete and should not be depended on)
    */
    @SerializedName("OriginSerialId")
    @Expose
    private String OriginSerialId;

    /**
    * Number of nodes. 2: one master and one slave, 3: one master and two slaves
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Whether it is a temp instance. 0: no, non-zero value: yes
    */
    @SerializedName("IsTmp")
    @Expose
    private Long IsTmp;

    /**
    * Dedicated cluster ID. If this parameter is empty, the instance is a general instance
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

    /**
    * Numeric ID of instance (this field is obsolete and should not be depended on)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Product type ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Maximum QPS value
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Locker")
    @Expose
    private Long Locker;

    /**
    * Current instance running status description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Public network access status. 0: not enabled, 1: enabled, 2: disabled, 3: enabling
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * Whether the instance supports audit. 1: yes, 0: no
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Long IsAuditSupported;

    /**
    * Model
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * Whether data encryption is supported. 1: yes, 0: no
    */
    @SerializedName("IsEncryptSupported")
    @Expose
    private Long IsEncryptSupported;

    /**
    * Number of CPU cores of instance
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanVipv6")
    @Expose
    private String WanVipv6;

    /**
    * Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanPortIpv6")
    @Expose
    private Long WanPortIpv6;

    /**
    * Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanStatusIpv6")
    @Expose
    private Long WanStatusIpv6;

    /**
    * Database engine
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbEngine")
    @Expose
    private String DbEngine;

    /**
    * Database version
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DcnFlag")
    @Expose
    private Long DcnFlag;

    /**
    * DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DcnStatus")
    @Expose
    private Long DcnStatus;

    /**
    * The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DcnDstNum")
    @Expose
    private Long DcnDstNum;

    /**
    * Instance type. Valid values: `1` (dedicated primary instance), `2` (primary instance), `3` (disaster recovery instance), and `4` (dedicated disaster recovery instance).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * Database version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
     * Get Instance ID, which uniquely identifies a TDSQL instance 
     * @return InstanceId Instance ID, which uniquely identifies a TDSQL instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which uniquely identifies a TDSQL instance
     * @param InstanceId Instance ID, which uniquely identifies a TDSQL instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Customizable instance name 
     * @return InstanceName Customizable instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Customizable instance name
     * @param InstanceName Customizable instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Application ID of instance 
     * @return AppId Application ID of instance
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID of instance
     * @param AppId Application ID of instance
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Project ID of instance 
     * @return ProjectId Project ID of instance
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of instance
     * @param ProjectId Project ID of instance
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance region name, such as ap-shanghai 
     * @return Region Instance region name, such as ap-shanghai
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region name, such as ap-shanghai
     * @param Region Instance region name, such as ap-shanghai
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance AZ name, such as ap-guangzhou-1 
     * @return Zone Instance AZ name, such as ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ name, such as ap-guangzhou-1
     * @param Zone Instance AZ name, such as ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC ID, which is 0 if the basic network is used 
     * @return VpcId VPC ID, which is 0 if the basic network is used
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, which is 0 if the basic network is used
     * @param VpcId VPC ID, which is 0 if the basic network is used
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID, which is 0 if the basic network is used 
     * @return SubnetId Subnet ID, which is 0 if the basic network is used
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID, which is 0 if the basic network is used
     * @param SubnetId Subnet ID, which is 0 if the basic network is used
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data) 
     * @return Status Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data)
     * @param Status Instance status. Valid values: `0` (creating), `1` (running task), `2` (running), `3` (uninitialized), `-1` (isolated), `4` (initializing), `5` (eliminating), `6` (restarting), `7` (migrating data)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Private IP address 
     * @return Vip Private IP address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP address
     * @param Vip Private IP address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private network port 
     * @return Vport Private network port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private network port
     * @param Vport Private network port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Domain name for public network access, which can be resolved by the public network 
     * @return WanDomain Domain name for public network access, which can be resolved by the public network
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Domain name for public network access, which can be resolved by the public network
     * @param WanDomain Domain name for public network access, which can be resolved by the public network
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public IP address, which can be accessed over the public network 
     * @return WanVip Public IP address, which can be accessed over the public network
     */
    public String getWanVip() {
        return this.WanVip;
    }

    /**
     * Set Public IP address, which can be accessed over the public network
     * @param WanVip Public IP address, which can be accessed over the public network
     */
    public void setWanVip(String WanVip) {
        this.WanVip = WanVip;
    }

    /**
     * Get Public network port 
     * @return WanPort Public network port
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public network port
     * @param WanPort Public network port
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Instance creation time in the format of `2006-01-02 15:04:05` 
     * @return CreateTime Instance creation time in the format of `2006-01-02 15:04:05`
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Instance creation time in the format of `2006-01-02 15:04:05`
     * @param CreateTime Instance creation time in the format of `2006-01-02 15:04:05`
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last updated time of instance in the format of `2006-01-02 15:04:05` 
     * @return UpdateTime Last updated time of instance in the format of `2006-01-02 15:04:05`
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last updated time of instance in the format of `2006-01-02 15:04:05`
     * @param UpdateTime Last updated time of instance in the format of `2006-01-02 15:04:05`
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Auto-renewal flag. 0: no, 1: yes 
     * @return AutoRenewFlag Auto-renewal flag. 0: no, 1: yes
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. 0: no, 1: yes
     * @param AutoRenewFlag Auto-renewal flag. 0: no, 1: yes
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Instance expiration time in the format of `2006-01-02 15:04:05` 
     * @return PeriodEndTime Instance expiration time in the format of `2006-01-02 15:04:05`
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Instance expiration time in the format of `2006-01-02 15:04:05`
     * @param PeriodEndTime Instance expiration time in the format of `2006-01-02 15:04:05`
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Instance account 
     * @return Uin Instance account
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Instance account
     * @param Uin Instance account
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get TDSQL version information 
     * @return TdsqlVersion TDSQL version information
     */
    public String getTdsqlVersion() {
        return this.TdsqlVersion;
    }

    /**
     * Set TDSQL version information
     * @param TdsqlVersion TDSQL version information
     */
    public void setTdsqlVersion(String TdsqlVersion) {
        this.TdsqlVersion = TdsqlVersion;
    }

    /**
     * Get Instance memory size in GB 
     * @return Memory Instance memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB
     * @param Memory Instance memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance storage capacity in GB 
     * @return Storage Instance storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance storage capacity in GB
     * @param Storage Instance storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get VPC ID in string type 
     * @return UniqueVpcId VPC ID in string type
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set VPC ID in string type
     * @param UniqueVpcId VPC ID in string type
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get VPC subnet ID in string type 
     * @return UniqueSubnetId VPC subnet ID in string type
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set VPC subnet ID in string type
     * @param UniqueSubnetId VPC subnet ID in string type
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get Original ID of instance (this field is obsolete and should not be depended on) 
     * @return OriginSerialId Original ID of instance (this field is obsolete and should not be depended on)
     */
    public String getOriginSerialId() {
        return this.OriginSerialId;
    }

    /**
     * Set Original ID of instance (this field is obsolete and should not be depended on)
     * @param OriginSerialId Original ID of instance (this field is obsolete and should not be depended on)
     */
    public void setOriginSerialId(String OriginSerialId) {
        this.OriginSerialId = OriginSerialId;
    }

    /**
     * Get Number of nodes. 2: one master and one slave, 3: one master and two slaves 
     * @return NodeCount Number of nodes. 2: one master and one slave, 3: one master and two slaves
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes. 2: one master and one slave, 3: one master and two slaves
     * @param NodeCount Number of nodes. 2: one master and one slave, 3: one master and two slaves
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Whether it is a temp instance. 0: no, non-zero value: yes 
     * @return IsTmp Whether it is a temp instance. 0: no, non-zero value: yes
     */
    public Long getIsTmp() {
        return this.IsTmp;
    }

    /**
     * Set Whether it is a temp instance. 0: no, non-zero value: yes
     * @param IsTmp Whether it is a temp instance. 0: no, non-zero value: yes
     */
    public void setIsTmp(Long IsTmp) {
        this.IsTmp = IsTmp;
    }

    /**
     * Get Dedicated cluster ID. If this parameter is empty, the instance is a general instance 
     * @return ExclusterId Dedicated cluster ID. If this parameter is empty, the instance is a general instance
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set Dedicated cluster ID. If this parameter is empty, the instance is a general instance
     * @param ExclusterId Dedicated cluster ID. If this parameter is empty, the instance is a general instance
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
    }

    /**
     * Get Numeric ID of instance (this field is obsolete and should not be depended on) 
     * @return Id Numeric ID of instance (this field is obsolete and should not be depended on)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Numeric ID of instance (this field is obsolete and should not be depended on)
     * @param Id Numeric ID of instance (this field is obsolete and should not be depended on)
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Product type ID 
     * @return Pid Product type ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Product type ID
     * @param Pid Product type ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Maximum QPS value 
     * @return Qps Maximum QPS value
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Maximum QPS value
     * @param Qps Maximum QPS value
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Billing mode
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Paymode Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Paymode Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Locker Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLocker() {
        return this.Locker;
    }

    /**
     * Set Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Locker Async task flow ID when an async task is in progress on an instance
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLocker(Long Locker) {
        this.Locker = Locker;
    }

    /**
     * Get Current instance running status description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusDesc Current instance running status description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Current instance running status description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusDesc Current instance running status description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Public network access status. 0: not enabled, 1: enabled, 2: disabled, 3: enabling 
     * @return WanStatus Public network access status. 0: not enabled, 1: enabled, 2: disabled, 3: enabling
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network access status. 0: not enabled, 1: enabled, 2: disabled, 3: enabling
     * @param WanStatus Public network access status. 0: not enabled, 1: enabled, 2: disabled, 3: enabling
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get Whether the instance supports audit. 1: yes, 0: no 
     * @return IsAuditSupported Whether the instance supports audit. 1: yes, 0: no
     */
    public Long getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * Set Whether the instance supports audit. 1: yes, 0: no
     * @param IsAuditSupported Whether the instance supports audit. 1: yes, 0: no
     */
    public void setIsAuditSupported(Long IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
    }

    /**
     * Get Model 
     * @return Machine Model
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * Set Model
     * @param Machine Model
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * Get Whether data encryption is supported. 1: yes, 0: no 
     * @return IsEncryptSupported Whether data encryption is supported. 1: yes, 0: no
     */
    public Long getIsEncryptSupported() {
        return this.IsEncryptSupported;
    }

    /**
     * Set Whether data encryption is supported. 1: yes, 0: no
     * @param IsEncryptSupported Whether data encryption is supported. 1: yes, 0: no
     */
    public void setIsEncryptSupported(Long IsEncryptSupported) {
        this.IsEncryptSupported = IsEncryptSupported;
    }

    /**
     * Get Number of CPU cores of instance 
     * @return Cpu Number of CPU cores of instance
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores of instance
     * @param Cpu Number of CPU cores of instance
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Ipv6Flag Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Ipv6Flag Indicates whether the instance uses IPv6
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Vipv6 Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Vipv6 Private network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WanVipv6 Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getWanVipv6() {
        return this.WanVipv6;
    }

    /**
     * Set Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WanVipv6 Public network IPv6 address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWanVipv6(String WanVipv6) {
        this.WanVipv6 = WanVipv6;
    }

    /**
     * Get Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WanPortIpv6 Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWanPortIpv6() {
        return this.WanPortIpv6;
    }

    /**
     * Set Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WanPortIpv6 Public network IPv6 port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWanPortIpv6(Long WanPortIpv6) {
        this.WanPortIpv6 = WanPortIpv6;
    }

    /**
     * Get Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WanStatusIpv6 Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWanStatusIpv6() {
        return this.WanStatusIpv6;
    }

    /**
     * Set Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WanStatusIpv6 Public network IPv6 status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWanStatusIpv6(Long WanStatusIpv6) {
        this.WanStatusIpv6 = WanStatusIpv6;
    }

    /**
     * Get Database engine
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DbEngine Database engine
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDbEngine() {
        return this.DbEngine;
    }

    /**
     * Set Database engine
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DbEngine Database engine
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDbEngine(String DbEngine) {
        this.DbEngine = DbEngine;
    }

    /**
     * Get Database version
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DbVersion Database version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database version
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DbVersion Database version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DcnFlag DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDcnFlag() {
        return this.DcnFlag;
    }

    /**
     * Set DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DcnFlag DCN type. Valid values: 0 (null), 1 (primary instance), 2 (disaster recovery instance)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDcnFlag(Long DcnFlag) {
        this.DcnFlag = DcnFlag;
    }

    /**
     * Get DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DcnStatus DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDcnStatus() {
        return this.DcnStatus;
    }

    /**
     * Set DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DcnStatus DCN status. Valid values: 0 (null), 1 (creating), 2 (syncing), 3 (disconnected)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDcnStatus(Long DcnStatus) {
        this.DcnStatus = DcnStatus;
    }

    /**
     * Get The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DcnDstNum The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDcnDstNum() {
        return this.DcnDstNum;
    }

    /**
     * Set The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DcnDstNum The number of DCN disaster recovery instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDcnDstNum(Long DcnDstNum) {
        this.DcnDstNum = DcnDstNum;
    }

    /**
     * Get Instance type. Valid values: `1` (dedicated primary instance), `2` (primary instance), `3` (disaster recovery instance), and `4` (dedicated disaster recovery instance).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Instance type. Valid values: `1` (dedicated primary instance), `2` (primary instance), `3` (disaster recovery instance), and `4` (dedicated disaster recovery instance).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values: `1` (dedicated primary instance), `2` (primary instance), `3` (disaster recovery instance), and `4` (dedicated disaster recovery instance).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Instance type. Valid values: `1` (dedicated primary instance), `2` (primary instance), `3` (disaster recovery instance), and `4` (dedicated disaster recovery instance).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceTags Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceTags Instance tag information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Database version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbVersionId Database version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set Database version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbVersionId Database version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    public DBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstance(DBInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanVip != null) {
            this.WanVip = new String(source.WanVip);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.TdsqlVersion != null) {
            this.TdsqlVersion = new String(source.TdsqlVersion);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.OriginSerialId != null) {
            this.OriginSerialId = new String(source.OriginSerialId);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.IsTmp != null) {
            this.IsTmp = new Long(source.IsTmp);
        }
        if (source.ExclusterId != null) {
            this.ExclusterId = new String(source.ExclusterId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Paymode != null) {
            this.Paymode = new String(source.Paymode);
        }
        if (source.Locker != null) {
            this.Locker = new Long(source.Locker);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new Long(source.WanStatus);
        }
        if (source.IsAuditSupported != null) {
            this.IsAuditSupported = new Long(source.IsAuditSupported);
        }
        if (source.Machine != null) {
            this.Machine = new String(source.Machine);
        }
        if (source.IsEncryptSupported != null) {
            this.IsEncryptSupported = new Long(source.IsEncryptSupported);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.Vipv6 != null) {
            this.Vipv6 = new String(source.Vipv6);
        }
        if (source.WanVipv6 != null) {
            this.WanVipv6 = new String(source.WanVipv6);
        }
        if (source.WanPortIpv6 != null) {
            this.WanPortIpv6 = new Long(source.WanPortIpv6);
        }
        if (source.WanStatusIpv6 != null) {
            this.WanStatusIpv6 = new Long(source.WanStatusIpv6);
        }
        if (source.DbEngine != null) {
            this.DbEngine = new String(source.DbEngine);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.DcnFlag != null) {
            this.DcnFlag = new Long(source.DcnFlag);
        }
        if (source.DcnStatus != null) {
            this.DcnStatus = new Long(source.DcnStatus);
        }
        if (source.DcnDstNum != null) {
            this.DcnDstNum = new Long(source.DcnDstNum);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanVip", this.WanVip);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TdsqlVersion", this.TdsqlVersion);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "OriginSerialId", this.OriginSerialId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "IsTmp", this.IsTmp);
        this.setParamSimple(map, prefix + "ExclusterId", this.ExclusterId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "IsAuditSupported", this.IsAuditSupported);
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "IsEncryptSupported", this.IsEncryptSupported);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamSimple(map, prefix + "Vipv6", this.Vipv6);
        this.setParamSimple(map, prefix + "WanVipv6", this.WanVipv6);
        this.setParamSimple(map, prefix + "WanPortIpv6", this.WanPortIpv6);
        this.setParamSimple(map, prefix + "WanStatusIpv6", this.WanStatusIpv6);
        this.setParamSimple(map, prefix + "DbEngine", this.DbEngine);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "DcnFlag", this.DcnFlag);
        this.setParamSimple(map, prefix + "DcnStatus", this.DcnStatus);
        this.setParamSimple(map, prefix + "DcnDstNum", this.DcnDstNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);

    }
}

