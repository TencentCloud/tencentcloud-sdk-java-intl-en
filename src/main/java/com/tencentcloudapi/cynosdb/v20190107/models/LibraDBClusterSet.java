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

public class LibraDBClusterSet extends AbstractModel {

    /**
    * User ID
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
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * cynos version
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * Version tag
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * Database version.
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Instance count
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * Whether to freeze
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * Network address.
    */
    @SerializedName("NetAddrs")
    @Expose
    private NetAddr [] NetAddrs;

    /**
    * Payment mode
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
    * Project ID
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status description.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Storage size in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Task list
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * Account ID.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * VIP address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Unique ID of VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vport port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Primary AZ.
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * physical AZ
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get User ID 
     * @return AppId User ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID
     * @param AppId User ID
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
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get cynos version 
     * @return CynosVersion cynos version
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set cynos version
     * @param CynosVersion cynos version
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get Version tag 
     * @return CynosVersionTag Version tag
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set Version tag
     * @param CynosVersionTag Version tag
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get Database version. 
     * @return DbVersion Database version.
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database version.
     * @param DbVersion Database version.
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get Instance count 
     * @return InstanceNum Instance count
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set Instance count
     * @param InstanceNum Instance count
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get Whether to freeze 
     * @return IsFreeze Whether to freeze
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set Whether to freeze
     * @param IsFreeze Whether to freeze
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get Network address. 
     * @return NetAddrs Network address.
     */
    public NetAddr [] getNetAddrs() {
        return this.NetAddrs;
    }

    /**
     * Set Network address.
     * @param NetAddrs Network address.
     */
    public void setNetAddrs(NetAddr [] NetAddrs) {
        this.NetAddrs = NetAddrs;
    }

    /**
     * Get Payment mode 
     * @return PayMode Payment mode
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode
     * @param PayMode Payment mode
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
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration. 
     * @return RenewFlag Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration.
     * @param RenewFlag Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Status description. 
     * @return StatusDesc Status description.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description.
     * @param StatusDesc Status description.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Storage size in GB 
     * @return Storage Storage size in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage size in GB
     * @param Storage Storage size in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Subnet ID. 
     * @return SubnetId Subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID.
     * @param SubnetId Subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Task list 
     * @return Tasks Task list
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task list
     * @param Tasks Task list
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Account ID. 
     * @return Uin Account ID.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account ID.
     * @param Uin Account ID.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get VIP address 
     * @return Vip VIP address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP address
     * @param Vip VIP address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Unique ID of VPC 
     * @return VpcId Unique ID of VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique ID of VPC
     * @param VpcId Unique ID of VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vport port 
     * @return Vport vport port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set vport port
     * @param Vport vport port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
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
     * Get physical AZ 
     * @return PhysicalZone physical AZ
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set physical AZ
     * @param PhysicalZone physical AZ
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public LibraDBClusterSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBClusterSet(LibraDBClusterSet source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.NetAddrs != null) {
            this.NetAddrs = new NetAddr[source.NetAddrs.length];
            for (int i = 0; i < source.NetAddrs.length; i++) {
                this.NetAddrs[i] = new NetAddr(source.NetAddrs[i]);
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
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
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "NetAddrs.", this.NetAddrs);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

