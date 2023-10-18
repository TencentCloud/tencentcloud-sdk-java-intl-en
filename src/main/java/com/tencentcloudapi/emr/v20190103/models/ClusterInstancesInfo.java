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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstancesInfo extends AbstractModel {

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
    * Instance status code. Value range:
<li>2: cluster running</li>
<li>3: creating cluster.</li>
<li>4: scaling out cluster.</li>
<li>5: adding router node in cluster.</li>
<li>6: installing component in cluster.</li>
<li>7: cluster executing command.</li>
<li>8: restarting service.</li>
<li>9: entering maintenance.</li>
<li>10: suspending service.</li>
<li>11: exiting maintenance.</li>
<li>12: exiting suspension.</li>
<li>13: delivering configuration.</li>
<li>14: terminating cluster.</li>
<li>15: terminating core node.</li>
<li>16: terminating task node.</li>
<li>17: terminating router node.</li>
<li>18: changing webproxy password.</li>
<li>19: isolating cluster.</li>
<li>20: resuming cluster.</li>
<li>21: repossessing cluster.</li>
<li>22: waiting for configuration adjustment.</li>
<li>23: cluster isolated.</li>
<li>24: removing node.</li>
<li>33: waiting for refund.</li>
<li>34: refunded.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li>
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
    * Hive metadata
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HiveMetaDb")
    @Expose
    private String HiveMetaDb;

    /**
    * Cluster type: EMR, CLICKHOUSE, DRUID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceClass")
    @Expose
    private String ServiceClass;

    /**
    * Alias serialization of all nodes in cluster
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AliasInfo")
    @Expose
    private String AliasInfo;

    /**
    * Cluster version ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Availability zone
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Scenario name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SceneServiceClass")
    @Expose
    private String SceneServiceClass;

    /**
    * Scenario-based EMR version
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SceneEmrVersion")
    @Expose
    private String SceneEmrVersion;

    /**
    * Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * VPC name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Subnet name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * Cluster dependency
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ClusterExternalServiceInfo")
    @Expose
    private ClusterExternalServiceInfo [] ClusterExternalServiceInfo;

    /**
    * The VPC ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * The subnet ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Node information
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TopologyInfoList")
    @Expose
    private TopologyInfo [] TopologyInfoList;

    /**
    * Multi-AZ cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IsMultiZoneCluster")
    @Expose
    private Boolean IsMultiZoneCluster;

    /**
    * Whether the feature of automatic abnormal node replacement is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCvmReplace")
    @Expose
    private Boolean IsCvmReplace;

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
     * Get Instance status code. Value range:
<li>2: cluster running</li>
<li>3: creating cluster.</li>
<li>4: scaling out cluster.</li>
<li>5: adding router node in cluster.</li>
<li>6: installing component in cluster.</li>
<li>7: cluster executing command.</li>
<li>8: restarting service.</li>
<li>9: entering maintenance.</li>
<li>10: suspending service.</li>
<li>11: exiting maintenance.</li>
<li>12: exiting suspension.</li>
<li>13: delivering configuration.</li>
<li>14: terminating cluster.</li>
<li>15: terminating core node.</li>
<li>16: terminating task node.</li>
<li>17: terminating router node.</li>
<li>18: changing webproxy password.</li>
<li>19: isolating cluster.</li>
<li>20: resuming cluster.</li>
<li>21: repossessing cluster.</li>
<li>22: waiting for configuration adjustment.</li>
<li>23: cluster isolated.</li>
<li>24: removing node.</li>
<li>33: waiting for refund.</li>
<li>34: refunded.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Instance status code. Value range:
<li>2: cluster running</li>
<li>3: creating cluster.</li>
<li>4: scaling out cluster.</li>
<li>5: adding router node in cluster.</li>
<li>6: installing component in cluster.</li>
<li>7: cluster executing command.</li>
<li>8: restarting service.</li>
<li>9: entering maintenance.</li>
<li>10: suspending service.</li>
<li>11: exiting maintenance.</li>
<li>12: exiting suspension.</li>
<li>13: delivering configuration.</li>
<li>14: terminating cluster.</li>
<li>15: terminating core node.</li>
<li>16: terminating task node.</li>
<li>17: terminating router node.</li>
<li>18: changing webproxy password.</li>
<li>19: isolating cluster.</li>
<li>20: resuming cluster.</li>
<li>21: repossessing cluster.</li>
<li>22: waiting for configuration adjustment.</li>
<li>23: cluster isolated.</li>
<li>24: removing node.</li>
<li>33: waiting for refund.</li>
<li>34: refunded.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status code. Value range:
<li>2: cluster running</li>
<li>3: creating cluster.</li>
<li>4: scaling out cluster.</li>
<li>5: adding router node in cluster.</li>
<li>6: installing component in cluster.</li>
<li>7: cluster executing command.</li>
<li>8: restarting service.</li>
<li>9: entering maintenance.</li>
<li>10: suspending service.</li>
<li>11: exiting maintenance.</li>
<li>12: exiting suspension.</li>
<li>13: delivering configuration.</li>
<li>14: terminating cluster.</li>
<li>15: terminating core node.</li>
<li>16: terminating task node.</li>
<li>17: terminating router node.</li>
<li>18: changing webproxy password.</li>
<li>19: isolating cluster.</li>
<li>20: resuming cluster.</li>
<li>21: repossessing cluster.</li>
<li>22: waiting for configuration adjustment.</li>
<li>23: cluster isolated.</li>
<li>24: removing node.</li>
<li>33: waiting for refund.</li>
<li>34: refunded.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Instance status code. Value range:
<li>2: cluster running</li>
<li>3: creating cluster.</li>
<li>4: scaling out cluster.</li>
<li>5: adding router node in cluster.</li>
<li>6: installing component in cluster.</li>
<li>7: cluster executing command.</li>
<li>8: restarting service.</li>
<li>9: entering maintenance.</li>
<li>10: suspending service.</li>
<li>11: exiting maintenance.</li>
<li>12: exiting suspension.</li>
<li>13: delivering configuration.</li>
<li>14: terminating cluster.</li>
<li>15: terminating core node.</li>
<li>16: terminating task node.</li>
<li>17: terminating router node.</li>
<li>18: changing webproxy password.</li>
<li>19: isolating cluster.</li>
<li>20: resuming cluster.</li>
<li>21: repossessing cluster.</li>
<li>22: waiting for configuration adjustment.</li>
<li>23: cluster isolated.</li>
<li>24: removing node.</li>
<li>33: waiting for refund.</li>
<li>34: refunded.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li>
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
     * Get Hive metadata
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HiveMetaDb Hive metadata
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHiveMetaDb() {
        return this.HiveMetaDb;
    }

    /**
     * Set Hive metadata
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HiveMetaDb Hive metadata
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHiveMetaDb(String HiveMetaDb) {
        this.HiveMetaDb = HiveMetaDb;
    }

    /**
     * Get Cluster type: EMR, CLICKHOUSE, DRUID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceClass Cluster type: EMR, CLICKHOUSE, DRUID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceClass() {
        return this.ServiceClass;
    }

    /**
     * Set Cluster type: EMR, CLICKHOUSE, DRUID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceClass Cluster type: EMR, CLICKHOUSE, DRUID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceClass(String ServiceClass) {
        this.ServiceClass = ServiceClass;
    }

    /**
     * Get Alias serialization of all nodes in cluster
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AliasInfo Alias serialization of all nodes in cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAliasInfo() {
        return this.AliasInfo;
    }

    /**
     * Set Alias serialization of all nodes in cluster
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AliasInfo Alias serialization of all nodes in cluster
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAliasInfo(String AliasInfo) {
        this.AliasInfo = AliasInfo;
    }

    /**
     * Get Cluster version ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProductId Cluster version ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Cluster version ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProductId Cluster version ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Availability zone
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Zone Availability zone
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Zone Availability zone
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Scenario name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SceneName Scenario name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set Scenario name
Note: This field may return `null`, indicating that no valid value was found.
     * @param SceneName Scenario name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SceneServiceClass Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getSceneServiceClass() {
        return this.SceneServiceClass;
    }

    /**
     * Set Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found.
     * @param SceneServiceClass Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSceneServiceClass(String SceneServiceClass) {
        this.SceneServiceClass = SceneServiceClass;
    }

    /**
     * Get Scenario-based EMR version
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SceneEmrVersion Scenario-based EMR version
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getSceneEmrVersion() {
        return this.SceneEmrVersion;
    }

    /**
     * Set Scenario-based EMR version
Note: This field may return `null`, indicating that no valid value was found.
     * @param SceneEmrVersion Scenario-based EMR version
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSceneEmrVersion(String SceneEmrVersion) {
        this.SceneEmrVersion = SceneEmrVersion;
    }

    /**
     * Get Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found. 
     * @return DisplayName Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found.
     * @param DisplayName Scenario-based cluster type
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get VPC name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return VpcName VPC name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
Note: This field may return `null`, indicating that no valid value was found.
     * @param VpcName VPC name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Subnet name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SubnetName Subnet name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet name
Note: This field may return `null`, indicating that no valid value was found.
     * @param SubnetName Subnet name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get Cluster dependency
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ClusterExternalServiceInfo Cluster dependency
Note: This field may return `null`, indicating that no valid value was found.
     */
    public ClusterExternalServiceInfo [] getClusterExternalServiceInfo() {
        return this.ClusterExternalServiceInfo;
    }

    /**
     * Set Cluster dependency
Note: This field may return `null`, indicating that no valid value was found.
     * @param ClusterExternalServiceInfo Cluster dependency
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setClusterExternalServiceInfo(ClusterExternalServiceInfo [] ClusterExternalServiceInfo) {
        this.ClusterExternalServiceInfo = ClusterExternalServiceInfo;
    }

    /**
     * Get The VPC ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return UniqVpcId The VPC ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set The VPC ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param UniqVpcId The VPC ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get The subnet ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return UniqSubnetId The subnet ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set The subnet ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param UniqSubnetId The subnet ID string type of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Node information
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TopologyInfoList Node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public TopologyInfo [] getTopologyInfoList() {
        return this.TopologyInfoList;
    }

    /**
     * Set Node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TopologyInfoList Node information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTopologyInfoList(TopologyInfo [] TopologyInfoList) {
        this.TopologyInfoList = TopologyInfoList;
    }

    /**
     * Get Multi-AZ cluster
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IsMultiZoneCluster Multi-AZ cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getIsMultiZoneCluster() {
        return this.IsMultiZoneCluster;
    }

    /**
     * Set Multi-AZ cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IsMultiZoneCluster Multi-AZ cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsMultiZoneCluster(Boolean IsMultiZoneCluster) {
        this.IsMultiZoneCluster = IsMultiZoneCluster;
    }

    /**
     * Get Whether the feature of automatic abnormal node replacement is enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsCvmReplace Whether the feature of automatic abnormal node replacement is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsCvmReplace() {
        return this.IsCvmReplace;
    }

    /**
     * Set Whether the feature of automatic abnormal node replacement is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsCvmReplace Whether the feature of automatic abnormal node replacement is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsCvmReplace(Boolean IsCvmReplace) {
        this.IsCvmReplace = IsCvmReplace;
    }

    public ClusterInstancesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInstancesInfo(ClusterInstancesInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Ftitle != null) {
            this.Ftitle = new String(source.Ftitle);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.RunTime != null) {
            this.RunTime = new String(source.RunTime);
        }
        if (source.Config != null) {
            this.Config = new EmrProductConfigOutter(source.Config);
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
        if (source.TradeVersion != null) {
            this.TradeVersion = new Long(source.TradeVersion);
        }
        if (source.ResourceOrderId != null) {
            this.ResourceOrderId = new Long(source.ResourceOrderId);
        }
        if (source.IsTradeCluster != null) {
            this.IsTradeCluster = new Long(source.IsTradeCluster);
        }
        if (source.AlarmInfo != null) {
            this.AlarmInfo = new String(source.AlarmInfo);
        }
        if (source.IsWoodpeckerCluster != null) {
            this.IsWoodpeckerCluster = new Long(source.IsWoodpeckerCluster);
        }
        if (source.MetaDb != null) {
            this.MetaDb = new String(source.MetaDb);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HiveMetaDb != null) {
            this.HiveMetaDb = new String(source.HiveMetaDb);
        }
        if (source.ServiceClass != null) {
            this.ServiceClass = new String(source.ServiceClass);
        }
        if (source.AliasInfo != null) {
            this.AliasInfo = new String(source.AliasInfo);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.SceneServiceClass != null) {
            this.SceneServiceClass = new String(source.SceneServiceClass);
        }
        if (source.SceneEmrVersion != null) {
            this.SceneEmrVersion = new String(source.SceneEmrVersion);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.ClusterExternalServiceInfo != null) {
            this.ClusterExternalServiceInfo = new ClusterExternalServiceInfo[source.ClusterExternalServiceInfo.length];
            for (int i = 0; i < source.ClusterExternalServiceInfo.length; i++) {
                this.ClusterExternalServiceInfo[i] = new ClusterExternalServiceInfo(source.ClusterExternalServiceInfo[i]);
            }
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.TopologyInfoList != null) {
            this.TopologyInfoList = new TopologyInfo[source.TopologyInfoList.length];
            for (int i = 0; i < source.TopologyInfoList.length; i++) {
                this.TopologyInfoList[i] = new TopologyInfo(source.TopologyInfoList[i]);
            }
        }
        if (source.IsMultiZoneCluster != null) {
            this.IsMultiZoneCluster = new Boolean(source.IsMultiZoneCluster);
        }
        if (source.IsCvmReplace != null) {
            this.IsCvmReplace = new Boolean(source.IsCvmReplace);
        }
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
        this.setParamSimple(map, prefix + "ServiceClass", this.ServiceClass);
        this.setParamSimple(map, prefix + "AliasInfo", this.AliasInfo);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "SceneServiceClass", this.SceneServiceClass);
        this.setParamSimple(map, prefix + "SceneEmrVersion", this.SceneEmrVersion);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamArrayObj(map, prefix + "ClusterExternalServiceInfo.", this.ClusterExternalServiceInfo);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamArrayObj(map, prefix + "TopologyInfoList.", this.TopologyInfoList);
        this.setParamSimple(map, prefix + "IsMultiZoneCluster", this.IsMultiZoneCluster);
        this.setParamSimple(map, prefix + "IsCvmReplace", this.IsCvmReplace);

    }
}

