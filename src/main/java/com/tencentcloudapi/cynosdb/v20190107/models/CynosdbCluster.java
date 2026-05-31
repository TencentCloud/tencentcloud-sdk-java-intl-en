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

public class CynosdbCluster extends AbstractModel {

    /**
    * <p>Cluster status. Valid values include:<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: De-isolating<br>offlining: Offline<br>offlined: Offline<br>deleting: Deleting<br>deleted: Deleted</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Region</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Database version</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Number of instances</p>
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * <p>User uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Engine type</p>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>User appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Cluster status description</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>Cluster creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Payment mode. 0: pay-as-you-go; 1: monthly subscription</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>End time</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>Cluster read/write vip</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Cluster read/write vport</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>VPC ID</p>
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
    * <p>cynos kernel version</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>cynos version tag</p>
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * <p>Storage capacity</p>
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * <p>Renewal flag</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Currently processing task</p>
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * <p>Task array of the cluster</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * <p>tag Array of cluster binding</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Db type (NORMAL, SERVERLESS)</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>pause</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>Cluster Prepaid storage size</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>Storage ID of cluster storage in prepayment, used for prepaid storage configuration change</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * <p>Minimum storage of the cluster compute specification</p>
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * <p>Maximum storage value of the cluster compute specification</p>
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * <p>Cluster network information</p>
    */
    @SerializedName("NetAddrs")
    @Expose
    private NetAddr [] NetAddrs;

    /**
    * <p>Physical AZ</p>
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * <p>Primary AZ</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>Whether there is a secondary AZ</p>
    */
    @SerializedName("HasSlaveZone")
    @Expose
    private String HasSlaveZone;

    /**
    * <p>Secondary AZ</p>
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * <p>Business type</p>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>Freeze or not</p>
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * <p>Order source</p>
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * <p>Capacity</p>
    */
    @SerializedName("Ability")
    @Expose
    private Ability Ability;

    /**
    * <p>Instance bind resource package info (here only return storage resource package, for example packageType=DISK)</p>
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * <p>Global database unique ID</p>
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * <p>Cluster role. Primary cluster - primary, slave cluster - standby. If GdnId is empty, the field is invalid.</p>
    */
    @SerializedName("GdnRole")
    @Expose
    private String GdnRole;

    /**
     * Get <p>Cluster status. Valid values include:<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: De-isolating<br>offlining: Offline<br>offlined: Offline<br>deleting: Deleting<br>deleted: Deleted</p> 
     * @return Status <p>Cluster status. Valid values include:<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: De-isolating<br>offlining: Offline<br>offlined: Offline<br>deleting: Deleting<br>deleted: Deleted</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Cluster status. Valid values include:<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: De-isolating<br>offlining: Offline<br>offlined: Offline<br>deleting: Deleting<br>deleted: Deleted</p>
     * @param Status <p>Cluster status. Valid values include:<br>creating: Creating<br>running: Running<br>isolating: Isolation<br>isolated: Isolated<br>activating: De-isolating<br>offlining: Offline<br>offlined: Offline<br>deleting: Deleting<br>deleted: Deleted</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>Database version</p> 
     * @return DbVersion <p>Database version</p>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>Database version</p>
     * @param DbVersion <p>Database version</p>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
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
     * Get <p>Number of instances</p> 
     * @return InstanceNum <p>Number of instances</p>
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set <p>Number of instances</p>
     * @param InstanceNum <p>Number of instances</p>
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get <p>User uin</p> 
     * @return Uin <p>User uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>User uin</p>
     * @param Uin <p>User uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Engine type</p> 
     * @return DbType <p>Engine type</p>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>Engine type</p>
     * @param DbType <p>Engine type</p>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>User appid</p> 
     * @return AppId <p>User appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User appid</p>
     * @param AppId <p>User appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Cluster status description</p> 
     * @return StatusDesc <p>Cluster status description</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>Cluster status description</p>
     * @param StatusDesc <p>Cluster status description</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>Cluster creation time</p> 
     * @return CreateTime <p>Cluster creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Cluster creation time</p>
     * @param CreateTime <p>Cluster creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Payment mode. 0: pay-as-you-go; 1: monthly subscription</p> 
     * @return PayMode <p>Payment mode. 0: pay-as-you-go; 1: monthly subscription</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode. 0: pay-as-you-go; 1: monthly subscription</p>
     * @param PayMode <p>Payment mode. 0: pay-as-you-go; 1: monthly subscription</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>End time</p> 
     * @return PeriodEndTime <p>End time</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>End time</p>
     * @param PeriodEndTime <p>End time</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>Cluster read/write vip</p> 
     * @return Vip <p>Cluster read/write vip</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Cluster read/write vip</p>
     * @param Vip <p>Cluster read/write vip</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Cluster read/write vport</p> 
     * @return Vport <p>Cluster read/write vport</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Cluster read/write vport</p>
     * @param Vport <p>Cluster read/write vport</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectID <p>Project ID.</p>
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectID <p>Project ID.</p>
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
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
     * Get <p>cynos kernel version</p> 
     * @return CynosVersion <p>cynos kernel version</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>cynos kernel version</p>
     * @param CynosVersion <p>cynos kernel version</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get <p>cynos version tag</p> 
     * @return CynosVersionTag <p>cynos version tag</p>
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set <p>cynos version tag</p>
     * @param CynosVersionTag <p>cynos version tag</p>
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get <p>Storage capacity</p> 
     * @return StorageLimit <p>Storage capacity</p>
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set <p>Storage capacity</p>
     * @param StorageLimit <p>Storage capacity</p>
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
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
     * Get <p>Task array of the cluster</p> 
     * @return Tasks <p>Task array of the cluster</p>
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>Task array of the cluster</p>
     * @param Tasks <p>Task array of the cluster</p>
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>tag Array of cluster binding</p> 
     * @return ResourceTags <p>tag Array of cluster binding</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>tag Array of cluster binding</p>
     * @param ResourceTags <p>tag Array of cluster binding</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Db type (NORMAL, SERVERLESS)</p> 
     * @return DbMode <p>Db type (NORMAL, SERVERLESS)</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Db type (NORMAL, SERVERLESS)</p>
     * @param DbMode <p>Db type (NORMAL, SERVERLESS)</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>pause</p> 
     * @return ServerlessStatus <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>pause</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>pause</p>
     * @param ServerlessStatus <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>pause</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>Cluster Prepaid storage size</p> 
     * @return Storage <p>Cluster Prepaid storage size</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Cluster Prepaid storage size</p>
     * @param Storage <p>Cluster Prepaid storage size</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Storage ID of cluster storage in prepayment, used for prepaid storage configuration change</p> 
     * @return StorageId <p>Storage ID of cluster storage in prepayment, used for prepaid storage configuration change</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>Storage ID of cluster storage in prepayment, used for prepaid storage configuration change</p>
     * @param StorageId <p>Storage ID of cluster storage in prepayment, used for prepaid storage configuration change</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription</p> 
     * @return StoragePayMode <p>Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription</p>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription</p>
     * @param StoragePayMode <p>Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription</p>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>Minimum storage of the cluster compute specification</p> 
     * @return MinStorageSize <p>Minimum storage of the cluster compute specification</p>
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set <p>Minimum storage of the cluster compute specification</p>
     * @param MinStorageSize <p>Minimum storage of the cluster compute specification</p>
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get <p>Maximum storage value of the cluster compute specification</p> 
     * @return MaxStorageSize <p>Maximum storage value of the cluster compute specification</p>
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set <p>Maximum storage value of the cluster compute specification</p>
     * @param MaxStorageSize <p>Maximum storage value of the cluster compute specification</p>
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get <p>Cluster network information</p> 
     * @return NetAddrs <p>Cluster network information</p>
     */
    public NetAddr [] getNetAddrs() {
        return this.NetAddrs;
    }

    /**
     * Set <p>Cluster network information</p>
     * @param NetAddrs <p>Cluster network information</p>
     */
    public void setNetAddrs(NetAddr [] NetAddrs) {
        this.NetAddrs = NetAddrs;
    }

    /**
     * Get <p>Physical AZ</p> 
     * @return PhysicalZone <p>Physical AZ</p>
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set <p>Physical AZ</p>
     * @param PhysicalZone <p>Physical AZ</p>
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
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
     * Get <p>Whether there is a secondary AZ</p> 
     * @return HasSlaveZone <p>Whether there is a secondary AZ</p>
     */
    public String getHasSlaveZone() {
        return this.HasSlaveZone;
    }

    /**
     * Set <p>Whether there is a secondary AZ</p>
     * @param HasSlaveZone <p>Whether there is a secondary AZ</p>
     */
    public void setHasSlaveZone(String HasSlaveZone) {
        this.HasSlaveZone = HasSlaveZone;
    }

    /**
     * Get <p>Secondary AZ</p> 
     * @return SlaveZones <p>Secondary AZ</p>
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>Secondary AZ</p>
     * @param SlaveZones <p>Secondary AZ</p>
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
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
     * Get <p>Freeze or not</p> 
     * @return IsFreeze <p>Freeze or not</p>
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set <p>Freeze or not</p>
     * @param IsFreeze <p>Freeze or not</p>
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
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
     * Get <p>Capacity</p> 
     * @return Ability <p>Capacity</p>
     */
    public Ability getAbility() {
        return this.Ability;
    }

    /**
     * Set <p>Capacity</p>
     * @param Ability <p>Capacity</p>
     */
    public void setAbility(Ability Ability) {
        this.Ability = Ability;
    }

    /**
     * Get <p>Instance bind resource package info (here only return storage resource package, for example packageType=DISK)</p> 
     * @return ResourcePackages <p>Instance bind resource package info (here only return storage resource package, for example packageType=DISK)</p>
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set <p>Instance bind resource package info (here only return storage resource package, for example packageType=DISK)</p>
     * @param ResourcePackages <p>Instance bind resource package info (here only return storage resource package, for example packageType=DISK)</p>
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
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
     * Get <p>Cluster role. Primary cluster - primary, slave cluster - standby. If GdnId is empty, the field is invalid.</p> 
     * @return GdnRole <p>Cluster role. Primary cluster - primary, slave cluster - standby. If GdnId is empty, the field is invalid.</p>
     */
    public String getGdnRole() {
        return this.GdnRole;
    }

    /**
     * Set <p>Cluster role. Primary cluster - primary, slave cluster - standby. If GdnId is empty, the field is invalid.</p>
     * @param GdnRole <p>Cluster role. Primary cluster - primary, slave cluster - standby. If GdnId is empty, the field is invalid.</p>
     */
    public void setGdnRole(String GdnRole) {
        this.GdnRole = GdnRole;
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
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
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
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.GdnRole != null) {
            this.GdnRole = new String(source.GdnRole);
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
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
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
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);
        this.setParamSimple(map, prefix + "GdnRole", this.GdnRole);

    }
}

