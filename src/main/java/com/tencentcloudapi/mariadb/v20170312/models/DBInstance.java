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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel{

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
    * Instance status. 0: creating, 1: processing, 2: running, 3: instance not initialized, -1: instance isolated, -2: instance deleted
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
    * Number of nodes. 2: one primary and one secondary, 3: one primary and two secondaries
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
     * Get Instance status. 0: creating, 1: processing, 2: running, 3: instance not initialized, -1: instance isolated, -2: instance deleted 
     * @return Status Instance status. 0: creating, 1: processing, 2: running, 3: instance not initialized, -1: instance isolated, -2: instance deleted
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. 0: creating, 1: processing, 2: running, 3: instance not initialized, -1: instance isolated, -2: instance deleted
     * @param Status Instance status. 0: creating, 1: processing, 2: running, 3: instance not initialized, -1: instance isolated, -2: instance deleted
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
     * Get Number of nodes. 2: one primary and one secondary, 3: one primary and two secondaries 
     * @return NodeCount Number of nodes. 2: one primary and one secondary, 3: one primary and two secondaries
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes. 2: one primary and one secondary, 3: one primary and two secondaries
     * @param NodeCount Number of nodes. 2: one primary and one secondary, 3: one primary and two secondaries
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

    }
}

