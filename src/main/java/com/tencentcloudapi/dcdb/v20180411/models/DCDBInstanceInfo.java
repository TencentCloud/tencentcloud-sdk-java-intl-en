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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DCDBInstanceInfo extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Numeric ID of a VPC
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Subnet数字ID
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Status description
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Private IP
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
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Auto-renewal flag
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage capacity in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Number of shards
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * Expiration time
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Isolation time
    */
    @SerializedName("IsolatedTimestamp")
    @Expose
    private String IsolatedTimestamp;

    /**
    * UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Shard details
    */
    @SerializedName("ShardDetail")
    @Expose
    private ShardInfo [] ShardDetail;

    /**
    * Number of nodes. 2: one master and one slave; 3: one master and two slaves
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Temporary instance flag. 0: non-temporary instance
    */
    @SerializedName("IsTmp")
    @Expose
    private Long IsTmp;

    /**
    * Exclusive cluster ID. If this parameter is left empty, the instance is a non-dedicated cluster instance
    */
    @SerializedName("ExclusterId")
    @Expose
    private String ExclusterId;

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
    * Numeric ID of an instance (this field is obsolete and should not be depended on)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
    * Product type ID (this field is obsolete and should not be depended on)
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Last updated time of an instance in the format of 2006-01-02 15:04:05
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Database engine
    */
    @SerializedName("DbEngine")
    @Expose
    private String DbEngine;

    /**
    * Database engine version
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Billing mode
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
    * Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * Whether the instance supports audit. 1: yes; 0: no
    */
    @SerializedName("IsAuditSupported")
    @Expose
    private Long IsAuditSupported;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get APPID 
     * @return AppId APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set APPID
     * @param AppId APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

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
     * Get Numeric ID of a VPC 
     * @return VpcId Numeric ID of a VPC
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Numeric ID of a VPC
     * @param VpcId Numeric ID of a VPC
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet数字ID 
     * @return SubnetId Subnet数字ID
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet数字ID
     * @param SubnetId Subnet数字ID
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Status description 
     * @return StatusDesc Status description
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description
     * @param StatusDesc Status description
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Private IP 
     * @return Vip Private IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP
     * @param Vip Private IP
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
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Auto-renewal flag 
     * @return AutoRenewFlag Auto-renewal flag
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag
     * @param AutoRenewFlag Auto-renewal flag
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Memory size in GB 
     * @return Memory Memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB
     * @param Memory Memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage capacity in GB 
     * @return Storage Storage capacity in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage capacity in GB
     * @param Storage Storage capacity in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Number of shards 
     * @return ShardCount Number of shards
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set Number of shards
     * @param ShardCount Number of shards
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get Expiration time 
     * @return PeriodEndTime Expiration time
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Expiration time
     * @param PeriodEndTime Expiration time
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Isolation time 
     * @return IsolatedTimestamp Isolation time
     */
    public String getIsolatedTimestamp() {
        return this.IsolatedTimestamp;
    }

    /**
     * Set Isolation time
     * @param IsolatedTimestamp Isolation time
     */
    public void setIsolatedTimestamp(String IsolatedTimestamp) {
        this.IsolatedTimestamp = IsolatedTimestamp;
    }

    /**
     * Get UIN 
     * @return Uin UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set UIN
     * @param Uin UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Shard details 
     * @return ShardDetail Shard details
     */
    public ShardInfo [] getShardDetail() {
        return this.ShardDetail;
    }

    /**
     * Set Shard details
     * @param ShardDetail Shard details
     */
    public void setShardDetail(ShardInfo [] ShardDetail) {
        this.ShardDetail = ShardDetail;
    }

    /**
     * Get Number of nodes. 2: one master and one slave; 3: one master and two slaves 
     * @return NodeCount Number of nodes. 2: one master and one slave; 3: one master and two slaves
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes. 2: one master and one slave; 3: one master and two slaves
     * @param NodeCount Number of nodes. 2: one master and one slave; 3: one master and two slaves
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Temporary instance flag. 0: non-temporary instance 
     * @return IsTmp Temporary instance flag. 0: non-temporary instance
     */
    public Long getIsTmp() {
        return this.IsTmp;
    }

    /**
     * Set Temporary instance flag. 0: non-temporary instance
     * @param IsTmp Temporary instance flag. 0: non-temporary instance
     */
    public void setIsTmp(Long IsTmp) {
        this.IsTmp = IsTmp;
    }

    /**
     * Get Exclusive cluster ID. If this parameter is left empty, the instance is a non-dedicated cluster instance 
     * @return ExclusterId Exclusive cluster ID. If this parameter is left empty, the instance is a non-dedicated cluster instance
     */
    public String getExclusterId() {
        return this.ExclusterId;
    }

    /**
     * Set Exclusive cluster ID. If this parameter is left empty, the instance is a non-dedicated cluster instance
     * @param ExclusterId Exclusive cluster ID. If this parameter is left empty, the instance is a non-dedicated cluster instance
     */
    public void setExclusterId(String ExclusterId) {
        this.ExclusterId = ExclusterId;
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
     * Get Numeric ID of an instance (this field is obsolete and should not be depended on) 
     * @return Id Numeric ID of an instance (this field is obsolete and should not be depended on)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Numeric ID of an instance (this field is obsolete and should not be depended on)
     * @param Id Numeric ID of an instance (this field is obsolete and should not be depended on)
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get Product type ID (this field is obsolete and should not be depended on) 
     * @return Pid Product type ID (this field is obsolete and should not be depended on)
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Product type ID (this field is obsolete and should not be depended on)
     * @param Pid Product type ID (this field is obsolete and should not be depended on)
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Last updated time of an instance in the format of 2006-01-02 15:04:05 
     * @return UpdateTime Last updated time of an instance in the format of 2006-01-02 15:04:05
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last updated time of an instance in the format of 2006-01-02 15:04:05
     * @param UpdateTime Last updated time of an instance in the format of 2006-01-02 15:04:05
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Database engine 
     * @return DbEngine Database engine
     */
    public String getDbEngine() {
        return this.DbEngine;
    }

    /**
     * Set Database engine
     * @param DbEngine Database engine
     */
    public void setDbEngine(String DbEngine) {
        this.DbEngine = DbEngine;
    }

    /**
     * Get Database engine version 
     * @return DbVersion Database engine version
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database engine version
     * @param DbVersion Database engine version
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get Billing mode 
     * @return Paymode Billing mode
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set Billing mode
     * @param Paymode Billing mode
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
     * Get Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling 
     * @return WanStatus Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling
     * @param WanStatus Public network access status. 0: not enabled; 1: enabled; 2: disabled; 3: enabling
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get Whether the instance supports audit. 1: yes; 0: no 
     * @return IsAuditSupported Whether the instance supports audit. 1: yes; 0: no
     */
    public Long getIsAuditSupported() {
        return this.IsAuditSupported;
    }

    /**
     * Set Whether the instance supports audit. 1: yes; 0: no
     * @param IsAuditSupported Whether the instance supports audit. 1: yes; 0: no
     */
    public void setIsAuditSupported(Long IsAuditSupported) {
        this.IsAuditSupported = IsAuditSupported;
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
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "IsolatedTimestamp", this.IsolatedTimestamp);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamArrayObj(map, prefix + "ShardDetail.", this.ShardDetail);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "IsTmp", this.IsTmp);
        this.setParamSimple(map, prefix + "ExclusterId", this.ExclusterId);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanVip", this.WanVip);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DbEngine", this.DbEngine);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "IsAuditSupported", this.IsAuditSupported);

    }
}

