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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrListInstance extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Common status: cluster in production, cluster running, cluster creating, cluster closed, and cluster deleted.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster region
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * User APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Creation time
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Running time
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * Cluster IP
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * Cluster version
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * Cluster billing mode
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * EMR ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Product ID.
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Region.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Network ID.
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Region.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Status code. Valid values: -2 (cluster deleted), -1 (cluster closed), 0 (cluster in production), 2 (cluster running), 3 (cluster creating).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance tag
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Alarm information.
    */
    @SerializedName("AlarmInfo")
    @Expose
    private String AlarmInfo;

    /**
    * Whether it is a Woodpecker cluster.
    */
    @SerializedName("IsWoodpeckerCluster")
    @Expose
    private Long IsWoodpeckerCluster;

    /**
    * VPC name in Chinese.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Subnet in Chinese.
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * String VpcId.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * String subnet.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Cluster type.
    */
    @SerializedName("ClusterClass")
    @Expose
    private String ClusterClass;

    /**
    * Whether it is a cross-AZ cluster.
    */
    @SerializedName("IsMultiZoneCluster")
    @Expose
    private Boolean IsMultiZoneCluster;

    /**
    * Whether it is a cluster created by a cluster CVM.
    */
    @SerializedName("IsHandsCluster")
    @Expose
    private Boolean IsHandsCluster;

    /**
    * Client component information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutSideSoftInfo")
    @Expose
    private SoftDependInfo [] OutSideSoftInfo;

    /**
    * Whether the current cluster's scenarios support external clients.
    */
    @SerializedName("IsSupportOutsideCluster")
    @Expose
    private Boolean IsSupportOutsideCluster;

    /**
    * Whether the cluster is used in a dedicated cluster scenario.
    */
    @SerializedName("IsDedicatedCluster")
    @Expose
    private Boolean IsDedicatedCluster;

    /**
    * Cluster supports for cloning.
    */
    @SerializedName("IsSupportClone")
    @Expose
    private Boolean IsSupportClone;

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
     * Get Common status: cluster in production, cluster running, cluster creating, cluster closed, and cluster deleted. 
     * @return StatusDesc Common status: cluster in production, cluster running, cluster creating, cluster closed, and cluster deleted.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Common status: cluster in production, cluster running, cluster creating, cluster closed, and cluster deleted.
     * @param StatusDesc Common status: cluster in production, cluster running, cluster creating, cluster closed, and cluster deleted.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
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
     * Get Cluster region 
     * @return ZoneId Cluster region
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Cluster region
     * @param ZoneId Cluster region
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get User APPID 
     * @return AppId User APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User APPID
     * @param AppId User APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Creation time 
     * @return AddTime Creation time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time
     * @param AddTime Creation time
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Running time 
     * @return RunTime Running time
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set Running time
     * @param RunTime Running time
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get Cluster IP 
     * @return MasterIp Cluster IP
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * Set Cluster IP
     * @param MasterIp Cluster IP
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * Get Cluster version 
     * @return EmrVersion Cluster version
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * Set Cluster version
     * @param EmrVersion Cluster version
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * Get Cluster billing mode 
     * @return ChargeType Cluster billing mode
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Cluster billing mode
     * @param ChargeType Cluster billing mode
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get EMR ID 
     * @return Id EMR ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set EMR ID
     * @param Id EMR ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Product ID. 
     * @return ProductId Product ID.
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID.
     * @param ProductId Product ID.
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Region. 
     * @return RegionId Region.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region.
     * @param RegionId Region.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Subnet ID. 
     * @return SubnetId Subnet ID.
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID.
     * @param SubnetId Subnet ID.
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Network ID. 
     * @return VpcId Network ID.
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Network ID.
     * @param VpcId Network ID.
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Region. 
     * @return Zone Region.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region.
     * @param Zone Region.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Status code. Valid values: -2 (cluster deleted), -1 (cluster closed), 0 (cluster in production), 2 (cluster running), 3 (cluster creating). 
     * @return Status Status code. Valid values: -2 (cluster deleted), -1 (cluster closed), 0 (cluster in production), 2 (cluster running), 3 (cluster creating).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status code. Valid values: -2 (cluster deleted), -1 (cluster closed), 0 (cluster in production), 2 (cluster running), 3 (cluster creating).
     * @param Status Status code. Valid values: -2 (cluster deleted), -1 (cluster closed), 0 (cluster in production), 2 (cluster running), 3 (cluster creating).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance tag
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Tags Instance tag
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Instance tag
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Tags Instance tag
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Alarm information. 
     * @return AlarmInfo Alarm information.
     */
    public String getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set Alarm information.
     * @param AlarmInfo Alarm information.
     */
    public void setAlarmInfo(String AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get Whether it is a Woodpecker cluster. 
     * @return IsWoodpeckerCluster Whether it is a Woodpecker cluster.
     */
    public Long getIsWoodpeckerCluster() {
        return this.IsWoodpeckerCluster;
    }

    /**
     * Set Whether it is a Woodpecker cluster.
     * @param IsWoodpeckerCluster Whether it is a Woodpecker cluster.
     */
    public void setIsWoodpeckerCluster(Long IsWoodpeckerCluster) {
        this.IsWoodpeckerCluster = IsWoodpeckerCluster;
    }

    /**
     * Get VPC name in Chinese. 
     * @return VpcName VPC name in Chinese.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name in Chinese.
     * @param VpcName VPC name in Chinese.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Subnet in Chinese. 
     * @return SubnetName Subnet in Chinese.
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet in Chinese.
     * @param SubnetName Subnet in Chinese.
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get String VpcId. 
     * @return UniqVpcId String VpcId.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set String VpcId.
     * @param UniqVpcId String VpcId.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get String subnet. 
     * @return UniqSubnetId String subnet.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set String subnet.
     * @param UniqSubnetId String subnet.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Cluster type. 
     * @return ClusterClass Cluster type.
     */
    public String getClusterClass() {
        return this.ClusterClass;
    }

    /**
     * Set Cluster type.
     * @param ClusterClass Cluster type.
     */
    public void setClusterClass(String ClusterClass) {
        this.ClusterClass = ClusterClass;
    }

    /**
     * Get Whether it is a cross-AZ cluster. 
     * @return IsMultiZoneCluster Whether it is a cross-AZ cluster.
     */
    public Boolean getIsMultiZoneCluster() {
        return this.IsMultiZoneCluster;
    }

    /**
     * Set Whether it is a cross-AZ cluster.
     * @param IsMultiZoneCluster Whether it is a cross-AZ cluster.
     */
    public void setIsMultiZoneCluster(Boolean IsMultiZoneCluster) {
        this.IsMultiZoneCluster = IsMultiZoneCluster;
    }

    /**
     * Get Whether it is a cluster created by a cluster CVM. 
     * @return IsHandsCluster Whether it is a cluster created by a cluster CVM.
     */
    public Boolean getIsHandsCluster() {
        return this.IsHandsCluster;
    }

    /**
     * Set Whether it is a cluster created by a cluster CVM.
     * @param IsHandsCluster Whether it is a cluster created by a cluster CVM.
     */
    public void setIsHandsCluster(Boolean IsHandsCluster) {
        this.IsHandsCluster = IsHandsCluster;
    }

    /**
     * Get Client component information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutSideSoftInfo Client component information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SoftDependInfo [] getOutSideSoftInfo() {
        return this.OutSideSoftInfo;
    }

    /**
     * Set Client component information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutSideSoftInfo Client component information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutSideSoftInfo(SoftDependInfo [] OutSideSoftInfo) {
        this.OutSideSoftInfo = OutSideSoftInfo;
    }

    /**
     * Get Whether the current cluster's scenarios support external clients. 
     * @return IsSupportOutsideCluster Whether the current cluster's scenarios support external clients.
     */
    public Boolean getIsSupportOutsideCluster() {
        return this.IsSupportOutsideCluster;
    }

    /**
     * Set Whether the current cluster's scenarios support external clients.
     * @param IsSupportOutsideCluster Whether the current cluster's scenarios support external clients.
     */
    public void setIsSupportOutsideCluster(Boolean IsSupportOutsideCluster) {
        this.IsSupportOutsideCluster = IsSupportOutsideCluster;
    }

    /**
     * Get Whether the cluster is used in a dedicated cluster scenario. 
     * @return IsDedicatedCluster Whether the cluster is used in a dedicated cluster scenario.
     */
    public Boolean getIsDedicatedCluster() {
        return this.IsDedicatedCluster;
    }

    /**
     * Set Whether the cluster is used in a dedicated cluster scenario.
     * @param IsDedicatedCluster Whether the cluster is used in a dedicated cluster scenario.
     */
    public void setIsDedicatedCluster(Boolean IsDedicatedCluster) {
        this.IsDedicatedCluster = IsDedicatedCluster;
    }

    /**
     * Get Cluster supports for cloning. 
     * @return IsSupportClone Cluster supports for cloning.
     */
    public Boolean getIsSupportClone() {
        return this.IsSupportClone;
    }

    /**
     * Set Cluster supports for cloning.
     * @param IsSupportClone Cluster supports for cloning.
     */
    public void setIsSupportClone(Boolean IsSupportClone) {
        this.IsSupportClone = IsSupportClone;
    }

    public EmrListInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrListInstance(EmrListInstance source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.RunTime != null) {
            this.RunTime = new String(source.RunTime);
        }
        if (source.MasterIp != null) {
            this.MasterIp = new String(source.MasterIp);
        }
        if (source.EmrVersion != null) {
            this.EmrVersion = new String(source.EmrVersion);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AlarmInfo != null) {
            this.AlarmInfo = new String(source.AlarmInfo);
        }
        if (source.IsWoodpeckerCluster != null) {
            this.IsWoodpeckerCluster = new Long(source.IsWoodpeckerCluster);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ClusterClass != null) {
            this.ClusterClass = new String(source.ClusterClass);
        }
        if (source.IsMultiZoneCluster != null) {
            this.IsMultiZoneCluster = new Boolean(source.IsMultiZoneCluster);
        }
        if (source.IsHandsCluster != null) {
            this.IsHandsCluster = new Boolean(source.IsHandsCluster);
        }
        if (source.OutSideSoftInfo != null) {
            this.OutSideSoftInfo = new SoftDependInfo[source.OutSideSoftInfo.length];
            for (int i = 0; i < source.OutSideSoftInfo.length; i++) {
                this.OutSideSoftInfo[i] = new SoftDependInfo(source.OutSideSoftInfo[i]);
            }
        }
        if (source.IsSupportOutsideCluster != null) {
            this.IsSupportOutsideCluster = new Boolean(source.IsSupportOutsideCluster);
        }
        if (source.IsDedicatedCluster != null) {
            this.IsDedicatedCluster = new Boolean(source.IsDedicatedCluster);
        }
        if (source.IsSupportClone != null) {
            this.IsSupportClone = new Boolean(source.IsSupportClone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "RunTime", this.RunTime);
        this.setParamSimple(map, prefix + "MasterIp", this.MasterIp);
        this.setParamSimple(map, prefix + "EmrVersion", this.EmrVersion);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AlarmInfo", this.AlarmInfo);
        this.setParamSimple(map, prefix + "IsWoodpeckerCluster", this.IsWoodpeckerCluster);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ClusterClass", this.ClusterClass);
        this.setParamSimple(map, prefix + "IsMultiZoneCluster", this.IsMultiZoneCluster);
        this.setParamSimple(map, prefix + "IsHandsCluster", this.IsHandsCluster);
        this.setParamArrayObj(map, prefix + "OutSideSoftInfo.", this.OutSideSoftInfo);
        this.setParamSimple(map, prefix + "IsSupportOutsideCluster", this.IsSupportOutsideCluster);
        this.setParamSimple(map, prefix + "IsDedicatedCluster", this.IsDedicatedCluster);
        this.setParamSimple(map, prefix + "IsSupportClone", this.IsSupportClone);

    }
}

