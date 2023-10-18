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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbCluster extends AbstractModel {

    /**
    * Cluster status. Valid values are as follows:
creating
running
isolating
isolated
activating (removing isolation)
offlining (deactivating)
offlined (deactivated)
deleting
deleted
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Database version
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Number of instances
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * User UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Engine type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * User `appid`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Cluster status description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Cluster creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Billing mode. `0`: Pay-as-you-go; `1`: Monthly subscription.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * End time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Cluster read-write VIP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Cluster read-write vport
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Project ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * TDSQL-C kernel version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * Storage capacity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Renewal flag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Task in progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * Array of tasks in the cluster
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * Array of tags bound to the cluster
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Database type. Valid values: `NORMAL`, `SERVERLESS`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * Serverless cluster status when the database type is `SERVERLESS`. Valid values:
`resume`
`pause`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * Prepaid cluster storage capacity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Cluster storage ID used in prepaid storage modification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * Billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * The minimum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * The maximum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * Network information of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetAddrs")
    @Expose
    private NetAddr [] NetAddrs;

    /**
    * Physical AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * Primary AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * Whether there is a secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasSlaveZone")
    @Expose
    private String HasSlaveZone;

    /**
    * Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * Business type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * Whether to freeze
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * Order source
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * Capability
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ability")
    @Expose
    private Ability Ability;

    /**
    * Information of the resource pack bound to an instance when `packageType` is `DISK`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
     * Get Cluster status. Valid values are as follows:
creating
running
isolating
isolated
activating (removing isolation)
offlining (deactivating)
offlined (deactivated)
deleting
deleted 
     * @return Status Cluster status. Valid values are as follows:
creating
running
isolating
isolated
activating (removing isolation)
offlining (deactivating)
offlined (deactivated)
deleting
deleted
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. Valid values are as follows:
creating
running
isolating
isolated
activating (removing isolation)
offlining (deactivating)
offlined (deactivated)
deleting
deleted
     * @param Status Cluster status. Valid values are as follows:
creating
running
isolating
isolated
activating (removing isolation)
offlining (deactivating)
offlined (deactivated)
deleting
deleted
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Number of instances 
     * @return InstanceNum Number of instances
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set Number of instances
     * @param InstanceNum Number of instances
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get User UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Engine type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbType Engine type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Engine type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbType Engine type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get User `appid`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId User `appid`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User `appid`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId User `appid`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Cluster status description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusDesc Cluster status description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Cluster status description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusDesc Cluster status description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Cluster creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Cluster creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Cluster creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Cluster creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Billing mode. `0`: Pay-as-you-go; `1`: Monthly subscription.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode Billing mode. `0`: Pay-as-you-go; `1`: Monthly subscription.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. `0`: Pay-as-you-go; `1`: Monthly subscription.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode Billing mode. `0`: Pay-as-you-go; `1`: Monthly subscription.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get End time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PeriodEndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set End time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PeriodEndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Cluster read-write VIP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vip Cluster read-write VIP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Cluster read-write VIP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vip Cluster read-write VIP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Cluster read-write vport
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vport Cluster read-write vport
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Cluster read-write vport
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vport Cluster read-write vport
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Project ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectID Project ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set Project ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectID Project ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get VPC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get TDSQL-C kernel version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CynosVersion TDSQL-C kernel version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set TDSQL-C kernel version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CynosVersion TDSQL-C kernel version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get Storage capacity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageLimit Storage capacity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage capacity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageLimit Storage capacity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Renewal flag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Renewal flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal flag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Renewal flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Task in progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessingTask Task in progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set Task in progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessingTask Task in progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get Array of tasks in the cluster
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tasks Array of tasks in the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Array of tasks in the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tasks Array of tasks in the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Array of tags bound to the cluster
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceTags Array of tags bound to the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Array of tags bound to the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceTags Array of tags bound to the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Database type. Valid values: `NORMAL`, `SERVERLESS`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbMode Database type. Valid values: `NORMAL`, `SERVERLESS`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database type. Valid values: `NORMAL`, `SERVERLESS`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbMode Database type. Valid values: `NORMAL`, `SERVERLESS`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get Serverless cluster status when the database type is `SERVERLESS`. Valid values:
`resume`
`pause`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerlessStatus Serverless cluster status when the database type is `SERVERLESS`. Valid values:
`resume`
`pause`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set Serverless cluster status when the database type is `SERVERLESS`. Valid values:
`resume`
`pause`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerlessStatus Serverless cluster status when the database type is `SERVERLESS`. Valid values:
`resume`
`pause`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get Prepaid cluster storage capacity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Storage Prepaid cluster storage capacity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Prepaid cluster storage capacity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Storage Prepaid cluster storage capacity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Cluster storage ID used in prepaid storage modification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageId Cluster storage ID used in prepaid storage modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set Cluster storage ID used in prepaid storage modification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageId Cluster storage ID used in prepaid storage modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get Billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StoragePayMode Billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set Billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StoragePayMode Billing mode of cluster storage. Valid values: `0` (pay-as-you-go), `1` (monthly subscription).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get The minimum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinStorageSize The minimum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set The minimum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinStorageSize The minimum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get The maximum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxStorageSize The maximum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set The maximum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxStorageSize The maximum storage corresponding to the compute specification of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get Network information of the cluster
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetAddrs Network information of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NetAddr [] getNetAddrs() {
        return this.NetAddrs;
    }

    /**
     * Set Network information of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetAddrs Network information of the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetAddrs(NetAddr [] NetAddrs) {
        this.NetAddrs = NetAddrs;
    }

    /**
     * Get Physical AZ
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhysicalZone Physical AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set Physical AZ
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhysicalZone Physical AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get Primary AZ
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MasterZone Primary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set Primary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MasterZone Primary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get Whether there is a secondary AZ
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HasSlaveZone Whether there is a secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHasSlaveZone() {
        return this.HasSlaveZone;
    }

    /**
     * Set Whether there is a secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HasSlaveZone Whether there is a secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHasSlaveZone(String HasSlaveZone) {
        this.HasSlaveZone = HasSlaveZone;
    }

    /**
     * Get Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SlaveZones Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SlaveZones Secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get Business type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusinessType Business type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set Business type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusinessType Business type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get Whether to freeze
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsFreeze Whether to freeze
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set Whether to freeze
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsFreeze Whether to freeze
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get Order source
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrderSource Order source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set Order source
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrderSource Order source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get Capability
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ability Capability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Ability getAbility() {
        return this.Ability;
    }

    /**
     * Set Capability
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ability Capability
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAbility(Ability Ability) {
        this.Ability = Ability;
    }

    /**
     * Get Information of the resource pack bound to an instance when `packageType` is `DISK`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourcePackages Information of the resource pack bound to an instance when `packageType` is `DISK`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set Information of the resource pack bound to an instance when `packageType` is `DISK`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourcePackages Information of the resource pack bound to an instance when `packageType` is `DISK`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    public CynosdbCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbCluster(CynosdbCluster source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ProcessingTask != null) {
            this.ProcessingTask = new String(source.ProcessingTask);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
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
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.NetAddrs != null) {
            this.NetAddrs = new NetAddr[source.NetAddrs.length];
            for (int i = 0; i < source.NetAddrs.length; i++) {
                this.NetAddrs[i] = new NetAddr(source.NetAddrs[i]);
            }
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.HasSlaveZone != null) {
            this.HasSlaveZone = new String(source.HasSlaveZone);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new String[source.SlaveZones.length];
            for (int i = 0; i < source.SlaveZones.length; i++) {
                this.SlaveZones[i] = new String(source.SlaveZones[i]);
            }
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.Ability != null) {
            this.Ability = new Ability(source.Ability);
        }
        if (source.ResourcePackages != null) {
            this.ResourcePackages = new ResourcePackage[source.ResourcePackages.length];
            for (int i = 0; i < source.ResourcePackages.length; i++) {
                this.ResourcePackages[i] = new ResourcePackage(source.ResourcePackages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ProcessingTask", this.ProcessingTask);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamArrayObj(map, prefix + "NetAddrs.", this.NetAddrs);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamSimple(map, prefix + "HasSlaveZone", this.HasSlaveZone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamObj(map, prefix + "Ability.", this.Ability);
        this.setParamArrayObj(map, prefix + "ResourcePackages.", this.ResourcePackages);

    }
}

