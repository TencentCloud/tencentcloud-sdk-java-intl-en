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

public class CynosdbClusterDetail extends AbstractModel {

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
    * <p>Physical AZ</p>
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * <p>Status. Supported values are as follows:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolation</li><li>isolated: Isolated</li><li>activating: Restore from recycle bin</li><li>offlining: Offline</li><li>offlined: Offline</li><li>deleting: Deleting</li><li>deleted: Deleted</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Status description</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>resuming<br>pause<br>pausing</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>Storage Id</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>Storage size in GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>Maximum storage specification, in GB</p>
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * <p>Minimum storage specification, in GB</p>
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * <p>Storage billing type. Valid values: 1 (yearly/monthly subscription); 0 (pay-as-you-go).</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * <p>VPC name</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>vpc Unique id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet name.</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>Subnet ID.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Character set.</p>
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Database type</p>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>Db type: <li>NORMAL</li><li>SERVERLESS</li></p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>Database version</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>Storage space limit</p>
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * <p>Used capacity</p>
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * <p>vip address</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>vport port</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>vip address and vport of the cluster read-only instance</p>
    */
    @SerializedName("RoAddr")
    @Expose
    private Addr [] RoAddr;

    /**
    * <p>Functions supported by the cluster</p>
    */
    @SerializedName("Ability")
    @Expose
    private Ability Ability;

    /**
    * <p>cynos version</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>Business type</p>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>Whether there is a secondary AZ</p>
    */
    @SerializedName("HasSlaveZone")
    @Expose
    private String HasSlaveZone;

    /**
    * <p>Freeze or not</p>
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * <p>Task List</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * <p>Primary AZ</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>From the AZ list</p>
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * <p>Instance information</p>
    */
    @SerializedName("InstanceSet")
    @Expose
    private ClusterInstanceDetail [] InstanceSet;

    /**
    * <p>Payment mode</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Expiry time.</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>tag Array information for instance binding</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Proxy status</p>
    */
    @SerializedName("ProxyStatus")
    @Expose
    private String ProxyStatus;

    /**
    * <p>binlog switch, available values: ON, OFF</p>
    */
    @SerializedName("LogBin")
    @Expose
    private String LogBin;

    /**
    * <p>Skip transaction or not</p>
    */
    @SerializedName("IsSkipTrade")
    @Expose
    private String IsSkipTrade;

    /**
    * <p>PITR type, available values: normal, redo_pitr</p>
    */
    @SerializedName("PitrType")
    @Expose
    private String PitrType;

    /**
    * <p>Whether to toggle on password complexity</p>
    */
    @SerializedName("IsOpenPasswordComplexity")
    @Expose
    private String IsOpenPasswordComplexity;

    /**
    * <p>Network type</p>
    */
    @SerializedName("NetworkStatus")
    @Expose
    private String NetworkStatus;

    /**
    * <p>Package info of the bound resource for the cluster</p>
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * <p>Auto-renewal flag. 1 means auto-renewal, 0 means non-renewal upon expiration.</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Node network type</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>Secondary availability zone property</p>
    */
    @SerializedName("SlaveZoneAttr")
    @Expose
    private SlaveZoneAttrItem [] SlaveZoneAttr;

    /**
    * <p>Version tag</p>
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * <p>Unique ID of the global database network</p>
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * <p>Role of the cluster in the global data network.<br>Primary cluster - primary<br>Slave cluster - standby<br>If empty, the field is invalid.</p>
    */
    @SerializedName("GdnRole")
    @Expose
    private String GdnRole;

    /**
    * <p>Second-level storage usage in GB</p>
    */
    @SerializedName("UsedArchiveStorage")
    @Expose
    private Long UsedArchiveStorage;

    /**
    * <p>Archiving status. Enumeration value <li>normal: Normal</li><li>archiving: Archiving</li><li>resuming: Recovering</li><li>archived: Archived</li></p>
    */
    @SerializedName("ArchiveStatus")
    @Expose
    private String ArchiveStatus;

    /**
    * <p>Archive progress, percentage.</p>
    */
    @SerializedName("ArchiveProgress")
    @Expose
    private Long ArchiveProgress;

    /**
    * <p>Cluster level. For example P0, P1</p>
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * <p>Whether to enable transparent data encryption</p>
    */
    @SerializedName("IsOpenTDE")
    @Expose
    private Boolean IsOpenTDE;

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
     * Get <p>Status. Supported values are as follows:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolation</li><li>isolated: Isolated</li><li>activating: Restore from recycle bin</li><li>offlining: Offline</li><li>offlined: Offline</li><li>deleting: Deleting</li><li>deleted: Deleted</li></ul> 
     * @return Status <p>Status. Supported values are as follows:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolation</li><li>isolated: Isolated</li><li>activating: Restore from recycle bin</li><li>offlining: Offline</li><li>offlined: Offline</li><li>deleting: Deleting</li><li>deleted: Deleted</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status. Supported values are as follows:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolation</li><li>isolated: Isolated</li><li>activating: Restore from recycle bin</li><li>offlining: Offline</li><li>offlined: Offline</li><li>deleting: Deleting</li><li>deleted: Deleted</li></ul>
     * @param Status <p>Status. Supported values are as follows:</p><ul><li>creating: Creating</li><li>running: Running</li><li>isolating: Isolation</li><li>isolated: Isolated</li><li>activating: Restore from recycle bin</li><li>offlining: Offline</li><li>offlined: Offline</li><li>deleting: Deleting</li><li>deleted: Deleted</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Status description</p> 
     * @return StatusDesc <p>Status description</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>Status description</p>
     * @param StatusDesc <p>Status description</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>resuming<br>pause<br>pausing</p> 
     * @return ServerlessStatus <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>resuming<br>pause<br>pausing</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>resuming<br>pause<br>pausing</p>
     * @param ServerlessStatus <p>When the Db type is SERVERLESS, the SERVERLESS cluster status. Available values:<br>resume<br>resuming<br>pause<br>pausing</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>Storage Id</p> 
     * @return StorageId <p>Storage Id</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>Storage Id</p>
     * @param StorageId <p>Storage Id</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>Storage size in GB</p> 
     * @return Storage <p>Storage size in GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Storage size in GB</p>
     * @param Storage <p>Storage size in GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Maximum storage specification, in GB</p> 
     * @return MaxStorageSize <p>Maximum storage specification, in GB</p>
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set <p>Maximum storage specification, in GB</p>
     * @param MaxStorageSize <p>Maximum storage specification, in GB</p>
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get <p>Minimum storage specification, in GB</p> 
     * @return MinStorageSize <p>Minimum storage specification, in GB</p>
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set <p>Minimum storage specification, in GB</p>
     * @param MinStorageSize <p>Minimum storage specification, in GB</p>
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get <p>Storage billing type. Valid values: 1 (yearly/monthly subscription); 0 (pay-as-you-go).</p> 
     * @return StoragePayMode <p>Storage billing type. Valid values: 1 (yearly/monthly subscription); 0 (pay-as-you-go).</p>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>Storage billing type. Valid values: 1 (yearly/monthly subscription); 0 (pay-as-you-go).</p>
     * @param StoragePayMode <p>Storage billing type. Valid values: 1 (yearly/monthly subscription); 0 (pay-as-you-go).</p>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>VPC name</p> 
     * @return VpcName <p>VPC name</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>VPC name</p>
     * @param VpcName <p>VPC name</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>vpc Unique id</p> 
     * @return VpcId <p>vpc Unique id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc Unique id</p>
     * @param VpcId <p>vpc Unique id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet name.</p> 
     * @return SubnetName <p>Subnet name.</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>Subnet name.</p>
     * @param SubnetName <p>Subnet name.</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
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
     * Get <p>Character set.</p> 
     * @return Charset <p>Character set.</p>
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set <p>Character set.</p>
     * @param Charset <p>Character set.</p>
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
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
     * Get <p>Db type: <li>NORMAL</li><li>SERVERLESS</li></p> 
     * @return DbMode <p>Db type: <li>NORMAL</li><li>SERVERLESS</li></p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Db type: <li>NORMAL</li><li>SERVERLESS</li></p>
     * @param DbMode <p>Db type: <li>NORMAL</li><li>SERVERLESS</li></p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
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
     * Get <p>Storage space limit</p> 
     * @return StorageLimit <p>Storage space limit</p>
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set <p>Storage space limit</p>
     * @param StorageLimit <p>Storage space limit</p>
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get <p>Used capacity</p> 
     * @return UsedStorage <p>Used capacity</p>
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set <p>Used capacity</p>
     * @param UsedStorage <p>Used capacity</p>
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get <p>vip address</p> 
     * @return Vip <p>vip address</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>vip address</p>
     * @param Vip <p>vip address</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>vport port</p> 
     * @return Vport <p>vport port</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>vport port</p>
     * @param Vport <p>vport port</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>vip address and vport of the cluster read-only instance</p> 
     * @return RoAddr <p>vip address and vport of the cluster read-only instance</p>
     */
    public Addr [] getRoAddr() {
        return this.RoAddr;
    }

    /**
     * Set <p>vip address and vport of the cluster read-only instance</p>
     * @param RoAddr <p>vip address and vport of the cluster read-only instance</p>
     */
    public void setRoAddr(Addr [] RoAddr) {
        this.RoAddr = RoAddr;
    }

    /**
     * Get <p>Functions supported by the cluster</p> 
     * @return Ability <p>Functions supported by the cluster</p>
     */
    public Ability getAbility() {
        return this.Ability;
    }

    /**
     * Set <p>Functions supported by the cluster</p>
     * @param Ability <p>Functions supported by the cluster</p>
     */
    public void setAbility(Ability Ability) {
        this.Ability = Ability;
    }

    /**
     * Get <p>cynos version</p> 
     * @return CynosVersion <p>cynos version</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>cynos version</p>
     * @param CynosVersion <p>cynos version</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
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
     * Get <p>Task List</p> 
     * @return Tasks <p>Task List</p>
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>Task List</p>
     * @param Tasks <p>Task List</p>
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
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
     * Get <p>From the AZ list</p> 
     * @return SlaveZones <p>From the AZ list</p>
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>From the AZ list</p>
     * @param SlaveZones <p>From the AZ list</p>
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get <p>Instance information</p> 
     * @return InstanceSet <p>Instance information</p>
     */
    public ClusterInstanceDetail [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set <p>Instance information</p>
     * @param InstanceSet <p>Instance information</p>
     */
    public void setInstanceSet(ClusterInstanceDetail [] InstanceSet) {
        this.InstanceSet = InstanceSet;
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
     * Get <p>Expiry time.</p> 
     * @return PeriodEndTime <p>Expiry time.</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>Expiry time.</p>
     * @param PeriodEndTime <p>Expiry time.</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
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
     * Get <p>tag Array information for instance binding</p> 
     * @return ResourceTags <p>tag Array information for instance binding</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>tag Array information for instance binding</p>
     * @param ResourceTags <p>tag Array information for instance binding</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Proxy status</p> 
     * @return ProxyStatus <p>Proxy status</p>
     */
    public String getProxyStatus() {
        return this.ProxyStatus;
    }

    /**
     * Set <p>Proxy status</p>
     * @param ProxyStatus <p>Proxy status</p>
     */
    public void setProxyStatus(String ProxyStatus) {
        this.ProxyStatus = ProxyStatus;
    }

    /**
     * Get <p>binlog switch, available values: ON, OFF</p> 
     * @return LogBin <p>binlog switch, available values: ON, OFF</p>
     */
    public String getLogBin() {
        return this.LogBin;
    }

    /**
     * Set <p>binlog switch, available values: ON, OFF</p>
     * @param LogBin <p>binlog switch, available values: ON, OFF</p>
     */
    public void setLogBin(String LogBin) {
        this.LogBin = LogBin;
    }

    /**
     * Get <p>Skip transaction or not</p> 
     * @return IsSkipTrade <p>Skip transaction or not</p>
     */
    public String getIsSkipTrade() {
        return this.IsSkipTrade;
    }

    /**
     * Set <p>Skip transaction or not</p>
     * @param IsSkipTrade <p>Skip transaction or not</p>
     */
    public void setIsSkipTrade(String IsSkipTrade) {
        this.IsSkipTrade = IsSkipTrade;
    }

    /**
     * Get <p>PITR type, available values: normal, redo_pitr</p> 
     * @return PitrType <p>PITR type, available values: normal, redo_pitr</p>
     */
    public String getPitrType() {
        return this.PitrType;
    }

    /**
     * Set <p>PITR type, available values: normal, redo_pitr</p>
     * @param PitrType <p>PITR type, available values: normal, redo_pitr</p>
     */
    public void setPitrType(String PitrType) {
        this.PitrType = PitrType;
    }

    /**
     * Get <p>Whether to toggle on password complexity</p> 
     * @return IsOpenPasswordComplexity <p>Whether to toggle on password complexity</p>
     */
    public String getIsOpenPasswordComplexity() {
        return this.IsOpenPasswordComplexity;
    }

    /**
     * Set <p>Whether to toggle on password complexity</p>
     * @param IsOpenPasswordComplexity <p>Whether to toggle on password complexity</p>
     */
    public void setIsOpenPasswordComplexity(String IsOpenPasswordComplexity) {
        this.IsOpenPasswordComplexity = IsOpenPasswordComplexity;
    }

    /**
     * Get <p>Network type</p> 
     * @return NetworkStatus <p>Network type</p>
     */
    public String getNetworkStatus() {
        return this.NetworkStatus;
    }

    /**
     * Set <p>Network type</p>
     * @param NetworkStatus <p>Network type</p>
     */
    public void setNetworkStatus(String NetworkStatus) {
        this.NetworkStatus = NetworkStatus;
    }

    /**
     * Get <p>Package info of the bound resource for the cluster</p> 
     * @return ResourcePackages <p>Package info of the bound resource for the cluster</p>
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set <p>Package info of the bound resource for the cluster</p>
     * @param ResourcePackages <p>Package info of the bound resource for the cluster</p>
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    /**
     * Get <p>Auto-renewal flag. 1 means auto-renewal, 0 means non-renewal upon expiration.</p> 
     * @return RenewFlag <p>Auto-renewal flag. 1 means auto-renewal, 0 means non-renewal upon expiration.</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Auto-renewal flag. 1 means auto-renewal, 0 means non-renewal upon expiration.</p>
     * @param RenewFlag <p>Auto-renewal flag. 1 means auto-renewal, 0 means non-renewal upon expiration.</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>Node network type</p> 
     * @return NetworkType <p>Node network type</p>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>Node network type</p>
     * @param NetworkType <p>Node network type</p>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>Secondary availability zone property</p> 
     * @return SlaveZoneAttr <p>Secondary availability zone property</p>
     */
    public SlaveZoneAttrItem [] getSlaveZoneAttr() {
        return this.SlaveZoneAttr;
    }

    /**
     * Set <p>Secondary availability zone property</p>
     * @param SlaveZoneAttr <p>Secondary availability zone property</p>
     */
    public void setSlaveZoneAttr(SlaveZoneAttrItem [] SlaveZoneAttr) {
        this.SlaveZoneAttr = SlaveZoneAttr;
    }

    /**
     * Get <p>Version tag</p> 
     * @return CynosVersionTag <p>Version tag</p>
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set <p>Version tag</p>
     * @param CynosVersionTag <p>Version tag</p>
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get <p>Unique ID of the global database network</p> 
     * @return GdnId <p>Unique ID of the global database network</p>
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set <p>Unique ID of the global database network</p>
     * @param GdnId <p>Unique ID of the global database network</p>
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get <p>Role of the cluster in the global data network.<br>Primary cluster - primary<br>Slave cluster - standby<br>If empty, the field is invalid.</p> 
     * @return GdnRole <p>Role of the cluster in the global data network.<br>Primary cluster - primary<br>Slave cluster - standby<br>If empty, the field is invalid.</p>
     */
    public String getGdnRole() {
        return this.GdnRole;
    }

    /**
     * Set <p>Role of the cluster in the global data network.<br>Primary cluster - primary<br>Slave cluster - standby<br>If empty, the field is invalid.</p>
     * @param GdnRole <p>Role of the cluster in the global data network.<br>Primary cluster - primary<br>Slave cluster - standby<br>If empty, the field is invalid.</p>
     */
    public void setGdnRole(String GdnRole) {
        this.GdnRole = GdnRole;
    }

    /**
     * Get <p>Second-level storage usage in GB</p> 
     * @return UsedArchiveStorage <p>Second-level storage usage in GB</p>
     */
    public Long getUsedArchiveStorage() {
        return this.UsedArchiveStorage;
    }

    /**
     * Set <p>Second-level storage usage in GB</p>
     * @param UsedArchiveStorage <p>Second-level storage usage in GB</p>
     */
    public void setUsedArchiveStorage(Long UsedArchiveStorage) {
        this.UsedArchiveStorage = UsedArchiveStorage;
    }

    /**
     * Get <p>Archiving status. Enumeration value <li>normal: Normal</li><li>archiving: Archiving</li><li>resuming: Recovering</li><li>archived: Archived</li></p> 
     * @return ArchiveStatus <p>Archiving status. Enumeration value <li>normal: Normal</li><li>archiving: Archiving</li><li>resuming: Recovering</li><li>archived: Archived</li></p>
     */
    public String getArchiveStatus() {
        return this.ArchiveStatus;
    }

    /**
     * Set <p>Archiving status. Enumeration value <li>normal: Normal</li><li>archiving: Archiving</li><li>resuming: Recovering</li><li>archived: Archived</li></p>
     * @param ArchiveStatus <p>Archiving status. Enumeration value <li>normal: Normal</li><li>archiving: Archiving</li><li>resuming: Recovering</li><li>archived: Archived</li></p>
     */
    public void setArchiveStatus(String ArchiveStatus) {
        this.ArchiveStatus = ArchiveStatus;
    }

    /**
     * Get <p>Archive progress, percentage.</p> 
     * @return ArchiveProgress <p>Archive progress, percentage.</p>
     */
    public Long getArchiveProgress() {
        return this.ArchiveProgress;
    }

    /**
     * Set <p>Archive progress, percentage.</p>
     * @param ArchiveProgress <p>Archive progress, percentage.</p>
     */
    public void setArchiveProgress(Long ArchiveProgress) {
        this.ArchiveProgress = ArchiveProgress;
    }

    /**
     * Get <p>Cluster level. For example P0, P1</p> 
     * @return ClusterLevel <p>Cluster level. For example P0, P1</p>
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set <p>Cluster level. For example P0, P1</p>
     * @param ClusterLevel <p>Cluster level. For example P0, P1</p>
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get <p>Whether to enable transparent data encryption</p> 
     * @return IsOpenTDE <p>Whether to enable transparent data encryption</p>
     */
    public Boolean getIsOpenTDE() {
        return this.IsOpenTDE;
    }

    /**
     * Set <p>Whether to enable transparent data encryption</p>
     * @param IsOpenTDE <p>Whether to enable transparent data encryption</p>
     */
    public void setIsOpenTDE(Boolean IsOpenTDE) {
        this.IsOpenTDE = IsOpenTDE;
    }

    public CynosdbClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbClusterDetail(CynosdbClusterDetail source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.UsedStorage != null) {
            this.UsedStorage = new Long(source.UsedStorage);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.RoAddr != null) {
            this.RoAddr = new Addr[source.RoAddr.length];
            for (int i = 0; i < source.RoAddr.length; i++) {
                this.RoAddr[i] = new Addr(source.RoAddr[i]);
            }
        }
        if (source.Ability != null) {
            this.Ability = new Ability(source.Ability);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.HasSlaveZone != null) {
            this.HasSlaveZone = new String(source.HasSlaveZone);
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
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
        if (source.InstanceSet != null) {
            this.InstanceSet = new ClusterInstanceDetail[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new ClusterInstanceDetail(source.InstanceSet[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.ProxyStatus != null) {
            this.ProxyStatus = new String(source.ProxyStatus);
        }
        if (source.LogBin != null) {
            this.LogBin = new String(source.LogBin);
        }
        if (source.IsSkipTrade != null) {
            this.IsSkipTrade = new String(source.IsSkipTrade);
        }
        if (source.PitrType != null) {
            this.PitrType = new String(source.PitrType);
        }
        if (source.IsOpenPasswordComplexity != null) {
            this.IsOpenPasswordComplexity = new String(source.IsOpenPasswordComplexity);
        }
        if (source.NetworkStatus != null) {
            this.NetworkStatus = new String(source.NetworkStatus);
        }
        if (source.ResourcePackages != null) {
            this.ResourcePackages = new ResourcePackage[source.ResourcePackages.length];
            for (int i = 0; i < source.ResourcePackages.length; i++) {
                this.ResourcePackages[i] = new ResourcePackage(source.ResourcePackages[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.SlaveZoneAttr != null) {
            this.SlaveZoneAttr = new SlaveZoneAttrItem[source.SlaveZoneAttr.length];
            for (int i = 0; i < source.SlaveZoneAttr.length; i++) {
                this.SlaveZoneAttr[i] = new SlaveZoneAttrItem(source.SlaveZoneAttr[i]);
            }
        }
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.GdnRole != null) {
            this.GdnRole = new String(source.GdnRole);
        }
        if (source.UsedArchiveStorage != null) {
            this.UsedArchiveStorage = new Long(source.UsedArchiveStorage);
        }
        if (source.ArchiveStatus != null) {
            this.ArchiveStatus = new String(source.ArchiveStatus);
        }
        if (source.ArchiveProgress != null) {
            this.ArchiveProgress = new Long(source.ArchiveProgress);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.IsOpenTDE != null) {
            this.IsOpenTDE = new Boolean(source.IsOpenTDE);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamArrayObj(map, prefix + "RoAddr.", this.RoAddr);
        this.setParamObj(map, prefix + "Ability.", this.Ability);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "HasSlaveZone", this.HasSlaveZone);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "ProxyStatus", this.ProxyStatus);
        this.setParamSimple(map, prefix + "LogBin", this.LogBin);
        this.setParamSimple(map, prefix + "IsSkipTrade", this.IsSkipTrade);
        this.setParamSimple(map, prefix + "PitrType", this.PitrType);
        this.setParamSimple(map, prefix + "IsOpenPasswordComplexity", this.IsOpenPasswordComplexity);
        this.setParamSimple(map, prefix + "NetworkStatus", this.NetworkStatus);
        this.setParamArrayObj(map, prefix + "ResourcePackages.", this.ResourcePackages);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamArrayObj(map, prefix + "SlaveZoneAttr.", this.SlaveZoneAttr);
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);
        this.setParamSimple(map, prefix + "GdnRole", this.GdnRole);
        this.setParamSimple(map, prefix + "UsedArchiveStorage", this.UsedArchiveStorage);
        this.setParamSimple(map, prefix + "ArchiveStatus", this.ArchiveStatus);
        this.setParamSimple(map, prefix + "ArchiveProgress", this.ArchiveProgress);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamSimple(map, prefix + "IsOpenTDE", this.IsOpenTDE);

    }
}

