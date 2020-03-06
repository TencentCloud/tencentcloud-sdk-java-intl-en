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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstancesInfo extends AbstractModel{

    /**
    * ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Cluster ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Title
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ftitle")
    @Expose
    private String Ftitle;

    /**
    * Cluster name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Region ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * User APPID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User UIN
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Project ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Cluster `VPCID`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Subnet ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Execution duration
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * Cluster product configuration information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Config")
    @Expose
    private EmrProductConfigOutter Config;

    /**
    * Public IP of master node
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * EMR version
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Transaction version
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
    * Resource order ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceOrderId")
    @Expose
    private Long ResourceOrderId;

    /**
    * Whether this is a paid cluster
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsTradeCluster")
    @Expose
    private Long IsTradeCluster;

    /**
    * Alarm information for cluster error
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmInfo")
    @Expose
    private String AlarmInfo;

    /**
    * Whether the new architecture is used
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsWoodpeckerCluster")
    @Expose
    private Long IsWoodpeckerCluster;

    /**
    * Metadatabase information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaDb")
    @Expose
    private String MetaDb;

    /**
    * Tag information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 
    */
    @SerializedName("HiveMetaDb")
    @Expose
    private String HiveMetaDb;

    /**
     * Get ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Id ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Id ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Cluster ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId Cluster ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterId Cluster ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Title
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Ftitle Title
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFtitle() {
        return this.Ftitle;
    }

    /**
     * Set Title
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Ftitle Title
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFtitle(String Ftitle) {
        this.Ftitle = Ftitle;
    }

    /**
     * Get Cluster name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterName Cluster name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterName Cluster name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Region ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId Region ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Region ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ZoneId Region ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get User APPID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AppId User APPID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User APPID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AppId User APPID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Uin User UIN
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Uin User UIN
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Project ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cluster `VPCID`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VpcId Cluster `VPCID`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Cluster `VPCID`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VpcId Cluster `VPCID`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Execution duration
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RunTime Execution duration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set Execution duration
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RunTime Execution duration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get Cluster product configuration information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Config Cluster product configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public EmrProductConfigOutter getConfig() {
        return this.Config;
    }

    /**
     * Set Cluster product configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Config Cluster product configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConfig(EmrProductConfigOutter Config) {
        this.Config = Config;
    }

    /**
     * Get Public IP of master node
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MasterIp Public IP of master node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * Set Public IP of master node
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MasterIp Public IP of master node
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * Get EMR version
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EmrVersion EMR version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * Set EMR version
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EmrVersion EMR version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * Get Billing mode
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ChargeType Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Transaction version
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TradeVersion Transaction version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set Transaction version
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TradeVersion Transaction version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * Get Resource order ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResourceOrderId Resource order ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getResourceOrderId() {
        return this.ResourceOrderId;
    }

    /**
     * Set Resource order ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResourceOrderId Resource order ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceOrderId(Long ResourceOrderId) {
        this.ResourceOrderId = ResourceOrderId;
    }

    /**
     * Get Whether this is a paid cluster
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsTradeCluster Whether this is a paid cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsTradeCluster() {
        return this.IsTradeCluster;
    }

    /**
     * Set Whether this is a paid cluster
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsTradeCluster Whether this is a paid cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsTradeCluster(Long IsTradeCluster) {
        this.IsTradeCluster = IsTradeCluster;
    }

    /**
     * Get Alarm information for cluster error
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AlarmInfo Alarm information for cluster error
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set Alarm information for cluster error
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AlarmInfo Alarm information for cluster error
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAlarmInfo(String AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get Whether the new architecture is used
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsWoodpeckerCluster Whether the new architecture is used
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsWoodpeckerCluster() {
        return this.IsWoodpeckerCluster;
    }

    /**
     * Set Whether the new architecture is used
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsWoodpeckerCluster Whether the new architecture is used
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsWoodpeckerCluster(Long IsWoodpeckerCluster) {
        this.IsWoodpeckerCluster = IsWoodpeckerCluster;
    }

    /**
     * Get Metadatabase information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MetaDb Metadatabase information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMetaDb() {
        return this.MetaDb;
    }

    /**
     * Set Metadatabase information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MetaDb Metadatabase information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaDb(String MetaDb) {
        this.MetaDb = MetaDb;
    }

    /**
     * Get Tag information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get  
     * @return HiveMetaDb 
     */
    public String getHiveMetaDb() {
        return this.HiveMetaDb;
    }

    /**
     * Set 
     * @param HiveMetaDb 
     */
    public void setHiveMetaDb(String HiveMetaDb) {
        this.HiveMetaDb = HiveMetaDb;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Ftitle", this.Ftitle);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "RunTime", this.RunTime);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "MasterIp", this.MasterIp);
        this.setParamSimple(map, prefix + "EmrVersion", this.EmrVersion);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "TradeVersion", this.TradeVersion);
        this.setParamSimple(map, prefix + "ResourceOrderId", this.ResourceOrderId);
        this.setParamSimple(map, prefix + "IsTradeCluster", this.IsTradeCluster);
        this.setParamSimple(map, prefix + "AlarmInfo", this.AlarmInfo);
        this.setParamSimple(map, prefix + "IsWoodpeckerCluster", this.IsWoodpeckerCluster);
        this.setParamSimple(map, prefix + "MetaDb", this.MetaDb);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HiveMetaDb", this.HiveMetaDb);

    }
}

