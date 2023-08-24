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

public class CynosdbClusterDetail extends AbstractModel{

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
    * Physical AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status description
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
resuming
pause
pausing
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * Storage ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * Storage capacity in GB
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Maximum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * Minimum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * Storage billing mode. Valid values: `1` (monthly subscription), `0` (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * VPC name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Unique VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet name
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Character set
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Database type
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Database type. Valid values: `normal`, `serverless`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * Database version
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Maximum storage space
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Used capacity
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * VIP u200dand vport of the read-only instance in a cluster
    */
    @SerializedName("RoAddr")
    @Expose
    private Addr [] RoAddr;

    /**
    * Features supported by the cluster
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ability")
    @Expose
    private Ability Ability;

    /**
    * TDSQL-C version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * Business type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * Whether there is a secondary AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasSlaveZone")
    @Expose
    private String HasSlaveZone;

    /**
    * Whether to freeze
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * Task list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * Primary AZ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * Secondary AZ list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * Instance information
    */
    @SerializedName("InstanceSet")
    @Expose
    private ClusterInstanceDetail [] InstanceSet;

    /**
    * Billing mode
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Expiration time
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Project ID
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * Array of tags bound to instance
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Proxy status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyStatus")
    @Expose
    private String ProxyStatus;

    /**
    * Binlog switch. Valid values: `ON`, `OFF`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogBin")
    @Expose
    private String LogBin;

    /**
    * Whether to skip the transaction
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSkipTrade")
    @Expose
    private String IsSkipTrade;

    /**
    * PITR type. Valid values: `normal`, `redo_pitr`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PitrType")
    @Expose
    private String PitrType;

    /**
    * Whether to enable password complexity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsOpenPasswordComplexity")
    @Expose
    private String IsOpenPasswordComplexity;

    /**
    * Network type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkStatus")
    @Expose
    private String NetworkStatus;

    /**
    * Information of the resource pack bound to a cluster Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * The auto-renewal flag. Valid values: `0`: (manual renewal, default), `1` (auto-renewal). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

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
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
resuming
pause
pausing 
     * @return ServerlessStatus Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
resuming
pause
pausing
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
resuming
pause
pausing
     * @param ServerlessStatus Serverless cluster status when the database type is `SERVERLESS`. Valid values:
resume
resuming
pause
pausing
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get Storage ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageId Storage ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set Storage ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageId Storage ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get Storage capacity in GB
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Storage Storage capacity in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage capacity in GB
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Storage Storage capacity in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Maximum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxStorageSize Maximum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set Maximum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxStorageSize Maximum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get Minimum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinStorageSize Minimum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set Minimum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinStorageSize Minimum storage specification in GB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get Storage billing mode. Valid values: `1` (monthly subscription), `0` (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StoragePayMode Storage billing mode. Valid values: `1` (monthly subscription), `0` (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set Storage billing mode. Valid values: `1` (monthly subscription), `0` (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StoragePayMode Storage billing mode. Valid values: `1` (monthly subscription), `0` (pay-as-you-go).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get VPC name 
     * @return VpcName VPC name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
     * @param VpcName VPC name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Unique VPC ID 
     * @return VpcId Unique VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique VPC ID
     * @param VpcId Unique VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet name 
     * @return SubnetName Subnet name
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet name
     * @param SubnetName Subnet name
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
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
     * Get Character set 
     * @return Charset Character set
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set Character set
     * @param Charset Character set
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
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
     * Get Database type. Valid values: `normal`, `serverless`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbMode Database type. Valid values: `normal`, `serverless`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database type. Valid values: `normal`, `serverless`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbMode Database type. Valid values: `normal`, `serverless`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
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
     * Get Maximum storage space
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageLimit Maximum storage space
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Maximum storage space
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageLimit Maximum storage space
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Used capacity 
     * @return UsedStorage Used capacity
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set Used capacity
     * @param UsedStorage Used capacity
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get VIP 
     * @return Vip VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP
     * @param Vip VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get vport 
     * @return Vport vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set vport
     * @param Vport vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get VIP u200dand vport of the read-only instance in a cluster 
     * @return RoAddr VIP u200dand vport of the read-only instance in a cluster
     */
    public Addr [] getRoAddr() {
        return this.RoAddr;
    }

    /**
     * Set VIP u200dand vport of the read-only instance in a cluster
     * @param RoAddr VIP u200dand vport of the read-only instance in a cluster
     */
    public void setRoAddr(Addr [] RoAddr) {
        this.RoAddr = RoAddr;
    }

    /**
     * Get Features supported by the cluster
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ability Features supported by the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Ability getAbility() {
        return this.Ability;
    }

    /**
     * Set Features supported by the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ability Features supported by the cluster
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAbility(Ability Ability) {
        this.Ability = Ability;
    }

    /**
     * Get TDSQL-C version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CynosVersion TDSQL-C version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set TDSQL-C version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CynosVersion TDSQL-C version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
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
     * Get Task list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tasks Task list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tasks Task list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
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
     * Get Secondary AZ list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SlaveZones Secondary AZ list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set Secondary AZ list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SlaveZones Secondary AZ list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get Instance information 
     * @return InstanceSet Instance information
     */
    public ClusterInstanceDetail [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set Instance information
     * @param InstanceSet Instance information
     */
    public void setInstanceSet(ClusterInstanceDetail [] InstanceSet) {
        this.InstanceSet = InstanceSet;
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
     * Get Project ID 
     * @return ProjectID Project ID
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set Project ID
     * @param ProjectID Project ID
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get Array of tags bound to instance 
     * @return ResourceTags Array of tags bound to instance
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Array of tags bound to instance
     * @param ResourceTags Array of tags bound to instance
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Proxy status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyStatus Proxy status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProxyStatus() {
        return this.ProxyStatus;
    }

    /**
     * Set Proxy status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyStatus Proxy status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyStatus(String ProxyStatus) {
        this.ProxyStatus = ProxyStatus;
    }

    /**
     * Get Binlog switch. Valid values: `ON`, `OFF`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogBin Binlog switch. Valid values: `ON`, `OFF`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogBin() {
        return this.LogBin;
    }

    /**
     * Set Binlog switch. Valid values: `ON`, `OFF`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogBin Binlog switch. Valid values: `ON`, `OFF`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogBin(String LogBin) {
        this.LogBin = LogBin;
    }

    /**
     * Get Whether to skip the transaction
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSkipTrade Whether to skip the transaction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsSkipTrade() {
        return this.IsSkipTrade;
    }

    /**
     * Set Whether to skip the transaction
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSkipTrade Whether to skip the transaction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSkipTrade(String IsSkipTrade) {
        this.IsSkipTrade = IsSkipTrade;
    }

    /**
     * Get PITR type. Valid values: `normal`, `redo_pitr`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PitrType PITR type. Valid values: `normal`, `redo_pitr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPitrType() {
        return this.PitrType;
    }

    /**
     * Set PITR type. Valid values: `normal`, `redo_pitr`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PitrType PITR type. Valid values: `normal`, `redo_pitr`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPitrType(String PitrType) {
        this.PitrType = PitrType;
    }

    /**
     * Get Whether to enable password complexity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsOpenPasswordComplexity Whether to enable password complexity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsOpenPasswordComplexity() {
        return this.IsOpenPasswordComplexity;
    }

    /**
     * Set Whether to enable password complexity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsOpenPasswordComplexity Whether to enable password complexity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsOpenPasswordComplexity(String IsOpenPasswordComplexity) {
        this.IsOpenPasswordComplexity = IsOpenPasswordComplexity;
    }

    /**
     * Get Network type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkStatus Network type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNetworkStatus() {
        return this.NetworkStatus;
    }

    /**
     * Set Network type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkStatus Network type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkStatus(String NetworkStatus) {
        this.NetworkStatus = NetworkStatus;
    }

    /**
     * Get Information of the resource pack bound to a cluster Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourcePackages Information of the resource pack bound to a cluster Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set Information of the resource pack bound to a cluster Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourcePackages Information of the resource pack bound to a cluster Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    /**
     * Get The auto-renewal flag. Valid values: `0`: (manual renewal, default), `1` (auto-renewal). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag The auto-renewal flag. Valid values: `0`: (manual renewal, default), `1` (auto-renewal). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set The auto-renewal flag. Valid values: `0`: (manual renewal, default), `1` (auto-renewal). Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag The auto-renewal flag. Valid values: `0`: (manual renewal, default), `1` (auto-renewal). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
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

    }
}

