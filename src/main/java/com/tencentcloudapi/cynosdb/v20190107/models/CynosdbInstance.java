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
    * User `Uin`
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * User `AppId`
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

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
    * Instance status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance status description
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Instance type, which is used to indicate whether it is a serverless instance.
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * Database type
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Database version
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory in GB
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
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Current instance role
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
    * Private IP of instance
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private port of instance
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Billing mode
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance expiration time
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Termination deadline
    */
    @SerializedName("DestroyDeadlineText")
    @Expose
    private String DestroyDeadlineText;

    /**
    * Isolation time
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Network type
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * Public domain name
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public IP
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * Public port
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Public network status
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * Instance termination time
    */
    @SerializedName("DestroyTime")
    @Expose
    private String DestroyTime;

    /**
    * TDSQL-C kernel version
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * Task in progress
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * Renewal flag
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Minimum number of CPU cores for serverless instance
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * Maximum number of CPU cores for serverless instance
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * Serverless instance status. Valid values:
resume
pause
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * Prepayment storage Id.
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * Storage billing mode
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * Physical zone
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * Business type.
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * Task
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * Whether to freeze.
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * The resource tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Primary AZ.
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * Replica AZ
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * Network information of the instance.
    */
    @SerializedName("InstanceNetInfo")
    @Expose
    private InstanceNetInfo [] InstanceNetInfo;

    /**
    * Information of the resource pack bound to an instance when `packageType` is `CCU`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * Specifies the instance index form. valid values include mixedRowColumn (row and column hybrid storage) and onlyRowIndex (row-only storage).
    */
    @SerializedName("InstanceIndexMode")
    @Expose
    private String InstanceIndexMode;

    /**
    * Supported capabilities of the existing instance.
    */
    @SerializedName("InstanceAbility")
    @Expose
    private InstanceAbility InstanceAbility;

    /**
    * Instance machine type.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Specifies the instance storage type.
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * Unknown field.
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * Specifies the node information of libradb.
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
     * Get User `Uin` 
     * @return Uin User `Uin`
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User `Uin`
     * @param Uin User `Uin`
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get User `AppId` 
     * @return AppId User `AppId`
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User `AppId`
     * @param AppId User `AppId`
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

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
     * Get Instance status 
     * @return Status Instance status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status
     * @param Status Instance status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance status description 
     * @return StatusDesc Instance status description
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Instance status description
     * @param StatusDesc Instance status description
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Instance type, which is used to indicate whether it is a serverless instance. 
     * @return DbMode Instance type, which is used to indicate whether it is a serverless instance.
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Instance type, which is used to indicate whether it is a serverless instance.
     * @param DbMode Instance type, which is used to indicate whether it is a serverless instance.
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get Database type 
     * @return DbType Database type
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database type
     * @param DbType Database type
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Database version 
     * @return DbVersion Database version
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database version
     * @param DbVersion Database version
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get Number of CPU cores 
     * @return Cpu Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
     * @param Cpu Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory in GB 
     * @return Memory Memory in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory in GB
     * @param Memory Memory in GB
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
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Current instance role 
     * @return InstanceRole Current instance role
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Current instance role
     * @param InstanceRole Current instance role
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
     * Get Private IP of instance 
     * @return Vip Private IP of instance
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP of instance
     * @param Vip Private IP of instance
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private port of instance 
     * @return Vport Private port of instance
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private port of instance
     * @param Vport Private port of instance
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Billing mode 
     * @return PayMode Billing mode
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode
     * @param PayMode Billing mode
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Instance expiration time 
     * @return PeriodEndTime Instance expiration time
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Instance expiration time
     * @param PeriodEndTime Instance expiration time
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Termination deadline 
     * @return DestroyDeadlineText Termination deadline
     */
    public String getDestroyDeadlineText() {
        return this.DestroyDeadlineText;
    }

    /**
     * Set Termination deadline
     * @param DestroyDeadlineText Termination deadline
     */
    public void setDestroyDeadlineText(String DestroyDeadlineText) {
        this.DestroyDeadlineText = DestroyDeadlineText;
    }

    /**
     * Get Isolation time 
     * @return IsolateTime Isolation time
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Isolation time
     * @param IsolateTime Isolation time
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Network type 
     * @return NetType Network type
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type
     * @param NetType Network type
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Public domain name 
     * @return WanDomain Public domain name
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Public domain name
     * @param WanDomain Public domain name
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public IP 
     * @return WanIP Public IP
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set Public IP
     * @param WanIP Public IP
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get Public port 
     * @return WanPort Public port
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public port
     * @param WanPort Public port
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Public network status 
     * @return WanStatus Public network status
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network status
     * @param WanStatus Public network status
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get Instance termination time 
     * @return DestroyTime Instance termination time
     */
    public String getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set Instance termination time
     * @param DestroyTime Instance termination time
     */
    public void setDestroyTime(String DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get TDSQL-C kernel version 
     * @return CynosVersion TDSQL-C kernel version
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set TDSQL-C kernel version
     * @param CynosVersion TDSQL-C kernel version
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get Task in progress 
     * @return ProcessingTask Task in progress
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set Task in progress
     * @param ProcessingTask Task in progress
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get Renewal flag 
     * @return RenewFlag Renewal flag
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal flag
     * @param RenewFlag Renewal flag
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Minimum number of CPU cores for serverless instance 
     * @return MinCpu Minimum number of CPU cores for serverless instance
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set Minimum number of CPU cores for serverless instance
     * @param MinCpu Minimum number of CPU cores for serverless instance
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get Maximum number of CPU cores for serverless instance 
     * @return MaxCpu Maximum number of CPU cores for serverless instance
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set Maximum number of CPU cores for serverless instance
     * @param MaxCpu Maximum number of CPU cores for serverless instance
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get Serverless instance status. Valid values:
resume
pause 
     * @return ServerlessStatus Serverless instance status. Valid values:
resume
pause
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set Serverless instance status. Valid values:
resume
pause
     * @param ServerlessStatus Serverless instance status. Valid values:
resume
pause
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get Prepayment storage Id. 
     * @return StorageId Prepayment storage Id.
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set Prepayment storage Id.
     * @param StorageId Prepayment storage Id.
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get Storage billing mode 
     * @return StoragePayMode Storage billing mode
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set Storage billing mode
     * @param StoragePayMode Storage billing mode
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get Physical zone 
     * @return PhysicalZone Physical zone
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set Physical zone
     * @param PhysicalZone Physical zone
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get Business type. 
     * @return BusinessType Business type.
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set Business type.
     * @param BusinessType Business type.
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get Task 
     * @return Tasks Task
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task
     * @param Tasks Task
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Whether to freeze. 
     * @return IsFreeze Whether to freeze.
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set Whether to freeze.
     * @param IsFreeze Whether to freeze.
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get The resource tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceTags The resource tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set The resource tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceTags The resource tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Primary AZ. 
     * @return MasterZone Primary AZ.
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set Primary AZ.
     * @param MasterZone Primary AZ.
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get Replica AZ
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SlaveZones Replica AZ
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set Replica AZ
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SlaveZones Replica AZ
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get Network information of the instance. 
     * @return InstanceNetInfo Network information of the instance.
     */
    public InstanceNetInfo [] getInstanceNetInfo() {
        return this.InstanceNetInfo;
    }

    /**
     * Set Network information of the instance.
     * @param InstanceNetInfo Network information of the instance.
     */
    public void setInstanceNetInfo(InstanceNetInfo [] InstanceNetInfo) {
        this.InstanceNetInfo = InstanceNetInfo;
    }

    /**
     * Get Information of the resource pack bound to an instance when `packageType` is `CCU`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourcePackages Information of the resource pack bound to an instance when `packageType` is `CCU`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set Information of the resource pack bound to an instance when `packageType` is `CCU`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourcePackages Information of the resource pack bound to an instance when `packageType` is `CCU`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    /**
     * Get Specifies the instance index form. valid values include mixedRowColumn (row and column hybrid storage) and onlyRowIndex (row-only storage). 
     * @return InstanceIndexMode Specifies the instance index form. valid values include mixedRowColumn (row and column hybrid storage) and onlyRowIndex (row-only storage).
     */
    public String getInstanceIndexMode() {
        return this.InstanceIndexMode;
    }

    /**
     * Set Specifies the instance index form. valid values include mixedRowColumn (row and column hybrid storage) and onlyRowIndex (row-only storage).
     * @param InstanceIndexMode Specifies the instance index form. valid values include mixedRowColumn (row and column hybrid storage) and onlyRowIndex (row-only storage).
     */
    public void setInstanceIndexMode(String InstanceIndexMode) {
        this.InstanceIndexMode = InstanceIndexMode;
    }

    /**
     * Get Supported capabilities of the existing instance. 
     * @return InstanceAbility Supported capabilities of the existing instance.
     */
    public InstanceAbility getInstanceAbility() {
        return this.InstanceAbility;
    }

    /**
     * Set Supported capabilities of the existing instance.
     * @param InstanceAbility Supported capabilities of the existing instance.
     */
    public void setInstanceAbility(InstanceAbility InstanceAbility) {
        this.InstanceAbility = InstanceAbility;
    }

    /**
     * Get Instance machine type. 
     * @return DeviceType Instance machine type.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance machine type.
     * @param DeviceType Instance machine type.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Specifies the instance storage type. 
     * @return InstanceStorageType Specifies the instance storage type.
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set Specifies the instance storage type.
     * @param InstanceStorageType Specifies the instance storage type.
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get Unknown field. 
     * @return CynosVersionTag Unknown field.
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set Unknown field.
     * @param CynosVersionTag Unknown field.
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get Specifies the node information of libradb. 
     * @return NodeList Specifies the node information of libradb.
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set Specifies the node information of libradb.
     * @param NodeList Specifies the node information of libradb.
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
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

    }
}

