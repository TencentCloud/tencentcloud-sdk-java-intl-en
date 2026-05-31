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

public class LibraDBClusterDetail extends AbstractModel {

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
    * <p>Status</p>
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
    * <p>Storage size</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

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
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Database version</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

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
    * <p>vport</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>vip address and vport of the cluster read-only instance</p>
    */
    @SerializedName("RoAddr")
    @Expose
    private RoAddr [] RoAddr;

    /**
    * <p>cynos version</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

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
    * <p>Instance collection</p>
    */
    @SerializedName("InstanceSet")
    @Expose
    private InstanceSet [] InstanceSet;

    /**
    * <p>Payment mode</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Expiry time</p>
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
    * <p>Auto-renewal flag</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>Version tag</p>
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * <p>Additions are not supported when ro is yes. Additions are supported when ro is no/null/&quot;&quot;.</p>
    */
    @SerializedName("NoSupportAddRo")
    @Expose
    private String NoSupportAddRo;

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
    * <p>Grayscale information for version upgrade</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnalysisUpgradeVersionInfo")
    @Expose
    private UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo;

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
     * Get <p>Status</p> 
     * @return Status <p>Status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status</p>
     * @param Status <p>Status</p>
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
     * Get <p>Storage size</p> 
     * @return Storage <p>Storage size</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Storage size</p>
     * @param Storage <p>Storage size</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
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
     * Get <p>vport</p> 
     * @return Vport <p>vport</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>vport</p>
     * @param Vport <p>vport</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>vip address and vport of the cluster read-only instance</p> 
     * @return RoAddr <p>vip address and vport of the cluster read-only instance</p>
     */
    public RoAddr [] getRoAddr() {
        return this.RoAddr;
    }

    /**
     * Set <p>vip address and vport of the cluster read-only instance</p>
     * @param RoAddr <p>vip address and vport of the cluster read-only instance</p>
     */
    public void setRoAddr(RoAddr [] RoAddr) {
        this.RoAddr = RoAddr;
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
     * Get <p>Instance collection</p> 
     * @return InstanceSet <p>Instance collection</p>
     */
    public InstanceSet [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set <p>Instance collection</p>
     * @param InstanceSet <p>Instance collection</p>
     */
    public void setInstanceSet(InstanceSet [] InstanceSet) {
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
     * Get <p>Expiry time</p> 
     * @return PeriodEndTime <p>Expiry time</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>Expiry time</p>
     * @param PeriodEndTime <p>Expiry time</p>
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
     * Get <p>Auto-renewal flag</p> 
     * @return RenewFlag <p>Auto-renewal flag</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>Auto-renewal flag</p>
     * @param RenewFlag <p>Auto-renewal flag</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
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
     * Get <p>Additions are not supported when ro is yes. Additions are supported when ro is no/null/&quot;&quot;.</p> 
     * @return NoSupportAddRo <p>Additions are not supported when ro is yes. Additions are supported when ro is no/null/&quot;&quot;.</p>
     */
    public String getNoSupportAddRo() {
        return this.NoSupportAddRo;
    }

    /**
     * Set <p>Additions are not supported when ro is yes. Additions are supported when ro is no/null/&quot;&quot;.</p>
     * @param NoSupportAddRo <p>Additions are not supported when ro is yes. Additions are supported when ro is no/null/&quot;&quot;.</p>
     */
    public void setNoSupportAddRo(String NoSupportAddRo) {
        this.NoSupportAddRo = NoSupportAddRo;
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
     * Get <p>Grayscale information for version upgrade</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AnalysisUpgradeVersionInfo <p>Grayscale information for version upgrade</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UpgradeAnalysisInstanceVersionInfo getAnalysisUpgradeVersionInfo() {
        return this.AnalysisUpgradeVersionInfo;
    }

    /**
     * Set <p>Grayscale information for version upgrade</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AnalysisUpgradeVersionInfo <p>Grayscale information for version upgrade</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnalysisUpgradeVersionInfo(UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo) {
        this.AnalysisUpgradeVersionInfo = AnalysisUpgradeVersionInfo;
    }

    public LibraDBClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBClusterDetail(LibraDBClusterDetail source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
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
            this.RoAddr = new RoAddr[source.RoAddr.length];
            for (int i = 0; i < source.RoAddr.length; i++) {
                this.RoAddr[i] = new RoAddr(source.RoAddr[i]);
            }
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
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
        if (source.InstanceSet != null) {
            this.InstanceSet = new InstanceSet[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new InstanceSet(source.InstanceSet[i]);
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
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
        }
        if (source.NoSupportAddRo != null) {
            this.NoSupportAddRo = new String(source.NoSupportAddRo);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.AnalysisUpgradeVersionInfo != null) {
            this.AnalysisUpgradeVersionInfo = new UpgradeAnalysisInstanceVersionInfo(source.AnalysisUpgradeVersionInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamArrayObj(map, prefix + "RoAddr.", this.RoAddr);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
        this.setParamSimple(map, prefix + "NoSupportAddRo", this.NoSupportAddRo);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamObj(map, prefix + "AnalysisUpgradeVersionInfo.", this.AnalysisUpgradeVersionInfo);

    }
}

