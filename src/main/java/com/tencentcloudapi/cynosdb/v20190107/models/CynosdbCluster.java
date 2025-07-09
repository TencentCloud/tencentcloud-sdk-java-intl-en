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
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Engine type.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * User appid.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Cluster status description
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Cluster Creation Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Payment mode. 0: pay-as-you-go; 1: monthly subscription.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Expiration time.
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Cluster read/write vip.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Cluster read/write vport.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Project ID
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * Specifies the virtual private cloud ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Specifies the subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Specifies the cynos kernel version.
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * Specifies the storage capacity.
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Renewal Flag
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Task being processed.
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * Task array of the cluster.
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * Array of tags bound to the cluster.
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Db type (NORMAL, SERVERLESS).
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * Specifies the status of the SERVERLESS cluster when the Db type is SERVERLESS. valid values:.
resume
pause
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * Cluster prepaid storage size.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Cluster storage ID for prepaid storage, specifies the storage ID used for prepaid storage modification.
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription.
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * Minimum storage value corresponding to cluster computing specifications.
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * The maximum storage value corresponding to the cluster computing specification.
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * Specifies the cluster network information.
    */
    @SerializedName("NetAddrs")
    @Expose
    private NetAddr [] NetAddrs;

    /**
    * Physical availability zone.
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * Primary AZ.
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * Whether there is an availability zone.
    */
    @SerializedName("HasSlaveZone")
    @Expose
    private String HasSlaveZone;

    /**
    * Secondary AZ.
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * Business type.
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * Whether to freeze.
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * Order Source
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * Capacity.
    */
    @SerializedName("Ability")
    @Expose
    private Ability Ability;

    /**
    * Specifies the information of the resource package bound to the instance (only the storage resource package is returned here, that is, packageType=DISK).	
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
     * @return Uin User UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
     * @param Uin User UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Engine type. 
     * @return DbType Engine type.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Engine type.
     * @param DbType Engine type.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get User appid. 
     * @return AppId User appid.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid.
     * @param AppId User appid.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Cluster status description 
     * @return StatusDesc Cluster status description
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Cluster status description
     * @param StatusDesc Cluster status description
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Cluster Creation Time 
     * @return CreateTime Cluster Creation Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Cluster Creation Time
     * @param CreateTime Cluster Creation Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Payment mode. 0: pay-as-you-go; 1: monthly subscription. 
     * @return PayMode Payment mode. 0: pay-as-you-go; 1: monthly subscription.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode. 0: pay-as-you-go; 1: monthly subscription.
     * @param PayMode Payment mode. 0: pay-as-you-go; 1: monthly subscription.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Expiration time. 
     * @return PeriodEndTime Expiration time.
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Expiration time.
     * @param PeriodEndTime Expiration time.
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Cluster read/write vip. 
     * @return Vip Cluster read/write vip.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Cluster read/write vip.
     * @param Vip Cluster read/write vip.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Cluster read/write vport. 
     * @return Vport Cluster read/write vport.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Cluster read/write vport.
     * @param Vport Cluster read/write vport.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
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
     * Get Specifies the virtual private cloud ID. 
     * @return VpcId Specifies the virtual private cloud ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Specifies the virtual private cloud ID.
     * @param VpcId Specifies the virtual private cloud ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Specifies the subnet ID. 
     * @return SubnetId Specifies the subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Specifies the subnet ID.
     * @param SubnetId Specifies the subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Specifies the cynos kernel version. 
     * @return CynosVersion Specifies the cynos kernel version.
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set Specifies the cynos kernel version.
     * @param CynosVersion Specifies the cynos kernel version.
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get Specifies the storage capacity. 
     * @return StorageLimit Specifies the storage capacity.
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Specifies the storage capacity.
     * @param StorageLimit Specifies the storage capacity.
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Renewal Flag 
     * @return RenewFlag Renewal Flag
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal Flag
     * @param RenewFlag Renewal Flag
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Task being processed. 
     * @return ProcessingTask Task being processed.
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set Task being processed.
     * @param ProcessingTask Task being processed.
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get Task array of the cluster. 
     * @return Tasks Task array of the cluster.
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task array of the cluster.
     * @param Tasks Task array of the cluster.
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Array of tags bound to the cluster. 
     * @return ResourceTags Array of tags bound to the cluster.
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Array of tags bound to the cluster.
     * @param ResourceTags Array of tags bound to the cluster.
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Db type (NORMAL, SERVERLESS). 
     * @return DbMode Db type (NORMAL, SERVERLESS).
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Db type (NORMAL, SERVERLESS).
     * @param DbMode Db type (NORMAL, SERVERLESS).
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get Specifies the status of the SERVERLESS cluster when the Db type is SERVERLESS. valid values:.
resume
pause 
     * @return ServerlessStatus Specifies the status of the SERVERLESS cluster when the Db type is SERVERLESS. valid values:.
resume
pause
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set Specifies the status of the SERVERLESS cluster when the Db type is SERVERLESS. valid values:.
resume
pause
     * @param ServerlessStatus Specifies the status of the SERVERLESS cluster when the Db type is SERVERLESS. valid values:.
resume
pause
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get Cluster prepaid storage size. 
     * @return Storage Cluster prepaid storage size.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Cluster prepaid storage size.
     * @param Storage Cluster prepaid storage size.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Cluster storage ID for prepaid storage, specifies the storage ID used for prepaid storage modification. 
     * @return StorageId Cluster storage ID for prepaid storage, specifies the storage ID used for prepaid storage modification.
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set Cluster storage ID for prepaid storage, specifies the storage ID used for prepaid storage modification.
     * @param StorageId Cluster storage ID for prepaid storage, specifies the storage ID used for prepaid storage modification.
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription. 
     * @return StoragePayMode Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription.
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription.
     * @param StoragePayMode Cluster storage payment mode. 0: pay-as-you-go; 1: monthly subscription.
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get Minimum storage value corresponding to cluster computing specifications. 
     * @return MinStorageSize Minimum storage value corresponding to cluster computing specifications.
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set Minimum storage value corresponding to cluster computing specifications.
     * @param MinStorageSize Minimum storage value corresponding to cluster computing specifications.
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get The maximum storage value corresponding to the cluster computing specification. 
     * @return MaxStorageSize The maximum storage value corresponding to the cluster computing specification.
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set The maximum storage value corresponding to the cluster computing specification.
     * @param MaxStorageSize The maximum storage value corresponding to the cluster computing specification.
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get Specifies the cluster network information. 
     * @return NetAddrs Specifies the cluster network information.
     */
    public NetAddr [] getNetAddrs() {
        return this.NetAddrs;
    }

    /**
     * Set Specifies the cluster network information.
     * @param NetAddrs Specifies the cluster network information.
     */
    public void setNetAddrs(NetAddr [] NetAddrs) {
        this.NetAddrs = NetAddrs;
    }

    /**
     * Get Physical availability zone. 
     * @return PhysicalZone Physical availability zone.
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set Physical availability zone.
     * @param PhysicalZone Physical availability zone.
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
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
     * Get Whether there is an availability zone. 
     * @return HasSlaveZone Whether there is an availability zone.
     */
    public String getHasSlaveZone() {
        return this.HasSlaveZone;
    }

    /**
     * Set Whether there is an availability zone.
     * @param HasSlaveZone Whether there is an availability zone.
     */
    public void setHasSlaveZone(String HasSlaveZone) {
        this.HasSlaveZone = HasSlaveZone;
    }

    /**
     * Get Secondary AZ. 
     * @return SlaveZones Secondary AZ.
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set Secondary AZ.
     * @param SlaveZones Secondary AZ.
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
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
     * Get Order Source 
     * @return OrderSource Order Source
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set Order Source
     * @param OrderSource Order Source
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get Capacity. 
     * @return Ability Capacity.
     */
    public Ability getAbility() {
        return this.Ability;
    }

    /**
     * Set Capacity.
     * @param Ability Capacity.
     */
    public void setAbility(Ability Ability) {
        this.Ability = Ability;
    }

    /**
     * Get Specifies the information of the resource package bound to the instance (only the storage resource package is returned here, that is, packageType=DISK).	 
     * @return ResourcePackages Specifies the information of the resource package bound to the instance (only the storage resource package is returned here, that is, packageType=DISK).	
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set Specifies the information of the resource package bound to the instance (only the storage resource package is returned here, that is, packageType=DISK).	
     * @param ResourcePackages Specifies the information of the resource package bound to the instance (only the storage resource package is returned here, that is, packageType=DISK).	
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

