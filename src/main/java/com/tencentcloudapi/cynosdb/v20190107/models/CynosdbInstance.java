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

public class CynosdbInstance extends AbstractModel {

    /**
    * <p>User Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>User AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Region</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Instance status</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Instance status description in Chinese</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>Instance form, whether it is a serverless instance</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>Database type</p>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>Database version.</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>Cpu, unit: core</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Memory, unit: GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Stored amount, unit: GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>Instance type</p><p>Enumeration value:</p><ul><li>rw: Read-write instance</li><li>ro: Read-only instance</li></ul>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Current instance role</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>VPC network ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Instance private IP address</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Instance Intranet Port</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Payment mode</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Instance expiration time</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>Termination phase</p>
    */
    @SerializedName("DestroyDeadlineText")
    @Expose
    private String DestroyDeadlineText;

    /**
    * <p>Isolation time</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>Network type</p>
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * <p>Public network domain name</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>Public network IP</p>
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * <p>Public network port</p>
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * <p>Public network status</p>
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * <p>Instance destruction time</p>
    */
    @SerializedName("DestroyTime")
    @Expose
    private String DestroyTime;

    /**
    * <p>Cynos kernel version</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>Currently processing task</p>
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * <p>Renewal flag</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>serverless instance cpu minimum</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>cpu cap of the serverless instance</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>serverless instance status, available values:<br>resume<br>pause</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>Prepayment storage Id</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>Storage billing type</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * <p>Physical zone</p>
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * <p>Business type</p>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>Task</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * <p>Whether to freeze</p>
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * <p>Resource tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Primary AZ</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>Standby availability zone</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * <p>Instance network info</p>
    */
    @SerializedName("InstanceNetInfo")
    @Expose
    private InstanceNetInfo [] InstanceNetInfo;

    /**
    * <p>Instance bind resource package info (only return compute resource package, packageType=CCU)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * <p>Instance index form, available values [mixedRowColumn (hybrid row-column storage), onlyRowIndex (row storage only)]</p>
    */
    @SerializedName("InstanceIndexMode")
    @Expose
    private String InstanceIndexMode;

    /**
    * <p>Supported capabilities of the current instance</p>
    */
    @SerializedName("InstanceAbility")
    @Expose
    private InstanceAbility InstanceAbility;

    /**
    * <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Instance storage type</p>
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * <p>Unknown field</p>
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * <p>libradb node information</p>
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * <p>Unique ID of the global database</p>
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
     * Get <p>User Uin</p> 
     * @return Uin <p>User Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>User Uin</p>
     * @param Uin <p>User Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>User AppId</p> 
     * @return AppId <p>User AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User AppId</p>
     * @param AppId <p>User AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Project ID</p> 
     * @return ProjectId <p>Project ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID</p>
     * @param ProjectId <p>Project ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Region</p> 
     * @return Region <p>Region</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region</p>
     * @param Region <p>Region</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

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
     * Get <p>Instance status</p> 
     * @return Status <p>Instance status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status</p>
     * @param Status <p>Instance status</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Instance status description in Chinese</p> 
     * @return StatusDesc <p>Instance status description in Chinese</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>Instance status description in Chinese</p>
     * @param StatusDesc <p>Instance status description in Chinese</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>Instance form, whether it is a serverless instance</p> 
     * @return DbMode <p>Instance form, whether it is a serverless instance</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Instance form, whether it is a serverless instance</p>
     * @param DbMode <p>Instance form, whether it is a serverless instance</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>Database type</p> 
     * @return DbType <p>Database type</p>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>Database type</p>
     * @param DbType <p>Database type</p>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>Database version.</p> 
     * @return DbVersion <p>Database version.</p>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>Database version.</p>
     * @param DbVersion <p>Database version.</p>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get <p>Cpu, unit: core</p> 
     * @return Cpu <p>Cpu, unit: core</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Cpu, unit: core</p>
     * @param Cpu <p>Cpu, unit: core</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Memory, unit: GB</p> 
     * @return Memory <p>Memory, unit: GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory, unit: GB</p>
     * @param Memory <p>Memory, unit: GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Stored amount, unit: GB</p> 
     * @return Storage <p>Stored amount, unit: GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Stored amount, unit: GB</p>
     * @param Storage <p>Stored amount, unit: GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Instance type</p><p>Enumeration value:</p><ul><li>rw: Read-write instance</li><li>ro: Read-only instance</li></ul> 
     * @return InstanceType <p>Instance type</p><p>Enumeration value:</p><ul><li>rw: Read-write instance</li><li>ro: Read-only instance</li></ul>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type</p><p>Enumeration value:</p><ul><li>rw: Read-write instance</li><li>ro: Read-only instance</li></ul>
     * @param InstanceType <p>Instance type</p><p>Enumeration value:</p><ul><li>rw: Read-write instance</li><li>ro: Read-only instance</li></ul>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Current instance role</p> 
     * @return InstanceRole <p>Current instance role</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>Current instance role</p>
     * @param InstanceRole <p>Current instance role</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get <p>Subnet ID.</p> 
     * @return SubnetId <p>Subnet ID.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID.</p>
     * @param SubnetId <p>Subnet ID.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Instance private IP address</p> 
     * @return Vip <p>Instance private IP address</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Instance private IP address</p>
     * @param Vip <p>Instance private IP address</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Instance Intranet Port</p> 
     * @return Vport <p>Instance Intranet Port</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Instance Intranet Port</p>
     * @param Vport <p>Instance Intranet Port</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Payment mode</p> 
     * @return PayMode <p>Payment mode</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode</p>
     * @param PayMode <p>Payment mode</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Instance expiration time</p> 
     * @return PeriodEndTime <p>Instance expiration time</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>Instance expiration time</p>
     * @param PeriodEndTime <p>Instance expiration time</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>Termination phase</p> 
     * @return DestroyDeadlineText <p>Termination phase</p>
     */
    public String getDestroyDeadlineText() {
        return this.DestroyDeadlineText;
    }

    /**
     * Set <p>Termination phase</p>
     * @param DestroyDeadlineText <p>Termination phase</p>
     */
    public void setDestroyDeadlineText(String DestroyDeadlineText) {
        this.DestroyDeadlineText = DestroyDeadlineText;
    }

    /**
     * Get <p>Isolation time</p> 
     * @return IsolateTime <p>Isolation time</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>Isolation time</p>
     * @param IsolateTime <p>Isolation time</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>Network type</p> 
     * @return NetType <p>Network type</p>
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>Network type</p>
     * @param NetType <p>Network type</p>
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>Public network domain name</p> 
     * @return WanDomain <p>Public network domain name</p>
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set <p>Public network domain name</p>
     * @param WanDomain <p>Public network domain name</p>
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get <p>Public network IP</p> 
     * @return WanIP <p>Public network IP</p>
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set <p>Public network IP</p>
     * @param WanIP <p>Public network IP</p>
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get <p>Public network port</p> 
     * @return WanPort <p>Public network port</p>
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set <p>Public network port</p>
     * @param WanPort <p>Public network port</p>
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get <p>Public network status</p> 
     * @return WanStatus <p>Public network status</p>
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set <p>Public network status</p>
     * @param WanStatus <p>Public network status</p>
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get <p>Instance destruction time</p> 
     * @return DestroyTime <p>Instance destruction time</p>
     */
    public String getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set <p>Instance destruction time</p>
     * @param DestroyTime <p>Instance destruction time</p>
     */
    public void setDestroyTime(String DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get <p>Cynos kernel version</p> 
     * @return CynosVersion <p>Cynos kernel version</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>Cynos kernel version</p>
     * @param CynosVersion <p>Cynos kernel version</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get <p>Currently processing task</p> 
     * @return ProcessingTask <p>Currently processing task</p>
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set <p>Currently processing task</p>
     * @param ProcessingTask <p>Currently processing task</p>
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get <p>Renewal flag</p> 
     * @return RenewFlag <p>Renewal flag</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Renewal flag</p>
     * @param RenewFlag <p>Renewal flag</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>serverless instance cpu minimum</p> 
     * @return MinCpu <p>serverless instance cpu minimum</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>serverless instance cpu minimum</p>
     * @param MinCpu <p>serverless instance cpu minimum</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>cpu cap of the serverless instance</p> 
     * @return MaxCpu <p>cpu cap of the serverless instance</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>cpu cap of the serverless instance</p>
     * @param MaxCpu <p>cpu cap of the serverless instance</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>serverless instance status, available values:<br>resume<br>pause</p> 
     * @return ServerlessStatus <p>serverless instance status, available values:<br>resume<br>pause</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>serverless instance status, available values:<br>resume<br>pause</p>
     * @param ServerlessStatus <p>serverless instance status, available values:<br>resume<br>pause</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>Prepayment storage Id</p> 
     * @return StorageId <p>Prepayment storage Id</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>Prepayment storage Id</p>
     * @param StorageId <p>Prepayment storage Id</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>Storage billing type</p> 
     * @return StoragePayMode <p>Storage billing type</p>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>Storage billing type</p>
     * @param StoragePayMode <p>Storage billing type</p>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>Physical zone</p> 
     * @return PhysicalZone <p>Physical zone</p>
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set <p>Physical zone</p>
     * @param PhysicalZone <p>Physical zone</p>
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get <p>Business type</p> 
     * @return BusinessType <p>Business type</p>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set <p>Business type</p>
     * @param BusinessType <p>Business type</p>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get <p>Task</p> 
     * @return Tasks <p>Task</p>
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>Task</p>
     * @param Tasks <p>Task</p>
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>Whether to freeze</p> 
     * @return IsFreeze <p>Whether to freeze</p>
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set <p>Whether to freeze</p>
     * @param IsFreeze <p>Whether to freeze</p>
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get <p>Resource tag</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceTags <p>Resource tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Resource tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceTags <p>Resource tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Primary AZ</p> 
     * @return MasterZone <p>Primary AZ</p>
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set <p>Primary AZ</p>
     * @param MasterZone <p>Primary AZ</p>
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get <p>Standby availability zone</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SlaveZones <p>Standby availability zone</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>Standby availability zone</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SlaveZones <p>Standby availability zone</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get <p>Instance network info</p> 
     * @return InstanceNetInfo <p>Instance network info</p>
     */
    public InstanceNetInfo [] getInstanceNetInfo() {
        return this.InstanceNetInfo;
    }

    /**
     * Set <p>Instance network info</p>
     * @param InstanceNetInfo <p>Instance network info</p>
     */
    public void setInstanceNetInfo(InstanceNetInfo [] InstanceNetInfo) {
        this.InstanceNetInfo = InstanceNetInfo;
    }

    /**
     * Get <p>Instance bind resource package info (only return compute resource package, packageType=CCU)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourcePackages <p>Instance bind resource package info (only return compute resource package, packageType=CCU)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set <p>Instance bind resource package info (only return compute resource package, packageType=CCU)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourcePackages <p>Instance bind resource package info (only return compute resource package, packageType=CCU)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    /**
     * Get <p>Instance index form, available values [mixedRowColumn (hybrid row-column storage), onlyRowIndex (row storage only)]</p> 
     * @return InstanceIndexMode <p>Instance index form, available values [mixedRowColumn (hybrid row-column storage), onlyRowIndex (row storage only)]</p>
     */
    public String getInstanceIndexMode() {
        return this.InstanceIndexMode;
    }

    /**
     * Set <p>Instance index form, available values [mixedRowColumn (hybrid row-column storage), onlyRowIndex (row storage only)]</p>
     * @param InstanceIndexMode <p>Instance index form, available values [mixedRowColumn (hybrid row-column storage), onlyRowIndex (row storage only)]</p>
     */
    public void setInstanceIndexMode(String InstanceIndexMode) {
        this.InstanceIndexMode = InstanceIndexMode;
    }

    /**
     * Get <p>Supported capabilities of the current instance</p> 
     * @return InstanceAbility <p>Supported capabilities of the current instance</p>
     */
    public InstanceAbility getInstanceAbility() {
        return this.InstanceAbility;
    }

    /**
     * Set <p>Supported capabilities of the current instance</p>
     * @param InstanceAbility <p>Supported capabilities of the current instance</p>
     */
    public void setInstanceAbility(InstanceAbility InstanceAbility) {
        this.InstanceAbility = InstanceAbility;
    }

    /**
     * Get <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol> 
     * @return DeviceType <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     * @param DeviceType <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Instance storage type</p> 
     * @return InstanceStorageType <p>Instance storage type</p>
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set <p>Instance storage type</p>
     * @param InstanceStorageType <p>Instance storage type</p>
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get <p>Unknown field</p> 
     * @return CynosVersionTag <p>Unknown field</p>
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set <p>Unknown field</p>
     * @param CynosVersionTag <p>Unknown field</p>
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get <p>libradb node information</p> 
     * @return NodeList <p>libradb node information</p>
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set <p>libradb node information</p>
     * @param NodeList <p>libradb node information</p>
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get <p>Unique ID of the global database</p> 
     * @return GdnId <p>Unique ID of the global database</p>
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set <p>Unique ID of the global database</p>
     * @param GdnId <p>Unique ID of the global database</p>
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    public CynosdbInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbInstance(CynosdbInstance source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
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
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.DestroyDeadlineText != null) {
            this.DestroyDeadlineText = new String(source.DestroyDeadlineText);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new String(source.DestroyTime);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.ProcessingTask != null) {
            this.ProcessingTask = new String(source.ProcessingTask);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new String[source.SlaveZones.length];
            for (int i = 0; i < source.SlaveZones.length; i++) {
                this.SlaveZones[i] = new String(source.SlaveZones[i]);
            }
        }
        if (source.InstanceNetInfo != null) {
            this.InstanceNetInfo = new InstanceNetInfo[source.InstanceNetInfo.length];
            for (int i = 0; i < source.InstanceNetInfo.length; i++) {
                this.InstanceNetInfo[i] = new InstanceNetInfo(source.InstanceNetInfo[i]);
            }
        }
        if (source.ResourcePackages != null) {
            this.ResourcePackages = new ResourcePackage[source.ResourcePackages.length];
            for (int i = 0; i < source.ResourcePackages.length; i++) {
                this.ResourcePackages[i] = new ResourcePackage(source.ResourcePackages[i]);
            }
        }
        if (source.InstanceIndexMode != null) {
            this.InstanceIndexMode = new String(source.InstanceIndexMode);
        }
        if (source.InstanceAbility != null) {
            this.InstanceAbility = new InstanceAbility(source.InstanceAbility);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "DestroyDeadlineText", this.DestroyDeadlineText);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "ProcessingTask", this.ProcessingTask);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamArrayObj(map, prefix + "InstanceNetInfo.", this.InstanceNetInfo);
        this.setParamArrayObj(map, prefix + "ResourcePackages.", this.ResourcePackages);
        this.setParamSimple(map, prefix + "InstanceIndexMode", this.InstanceIndexMode);
        this.setParamObj(map, prefix + "InstanceAbility.", this.InstanceAbility);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);

    }
}

