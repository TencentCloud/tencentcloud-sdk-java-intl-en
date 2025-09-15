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

public class ClusterInstancesInfo extends AbstractModel {

    /**
    * ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Cluster ID.
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
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Region ID.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * User AppID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User UIN.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Cluster VPCID.
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Instance status code. Valid range:
<li>2: the cluster is running.</li>
<li>3: the cluster is being created.</li>
<li>4: the cluster is being scaled out.</li>
<li>5: Router nodes are being added to the cluster.</li>
<li>6: components are being installed in the cluster.</li>
<li>7: commands are being executed in the cluster.</li>
<li>8: the service is being restarted.</li>
<li>9: maintenance is in progress.</li>
<li>10: the service is being suspended.</li>
<li>11: the cluster is exiting maintenance.</li>
<li>12: the cluster is exiting suspension.</li>
<li>13: the configuration is being distributed.</li>
<li>14: the cluster is being terminated.</li>
<li>15: the Core node is being destroyed.</li>
<li>16: the Task node is being destroyed.</li>
<li>17: the Router node is being destroyed.</li>
<li>18: the web proxy password is being changed.</li>
<li>19: the cluster is being isolated.</li>
<li>20: the cluster is undergoing a reversal transaction.</li>
<li>21: the cluster is being recycled.</li>
<li>22: the instance is waiting for resizing.</li>
<li>23: the cluster has been isolated.</li>
<li>24: the number of nodes is being reduced.</li>
<li>33: the cluster is waiting for a refund.</li>
<li>34: the cluster has received a refund.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Adding time.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Runtime.
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
    * Public network IP address of the primary node.
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * EMR version.
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * Charge type.
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Transaction version.
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
    * Resource order ID.
    */
    @SerializedName("ResourceOrderId")
    @Expose
    private Long ResourceOrderId;

    /**
    * Whether it is a billing cluster.
    */
    @SerializedName("IsTradeCluster")
    @Expose
    private Long IsTradeCluster;

    /**
    * Alarm information of cluster error status.
    */
    @SerializedName("AlarmInfo")
    @Expose
    private String AlarmInfo;

    /**
    * Whether to adopt new architecture.
    */
    @SerializedName("IsWoodpeckerCluster")
    @Expose
    private Long IsWoodpeckerCluster;

    /**
    * Metadatabase information.
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
    * Hive metadata information.
    */
    @SerializedName("HiveMetaDb")
    @Expose
    private String HiveMetaDb;

    /**
    * Cluster type: EMR,CLICKHOUSE,DRUID.
    */
    @SerializedName("ServiceClass")
    @Expose
    private String ServiceClass;

    /**
    * Alias serialization of all nodes in the cluster.
    */
    @SerializedName("AliasInfo")
    @Expose
    private String AliasInfo;

    /**
    * Cluster version ID.
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Region ID.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Scenario name.
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * Scenario-based cluster type.
    */
    @SerializedName("SceneServiceClass")
    @Expose
    private String SceneServiceClass;

    /**
    * Scenario-based EMR version.
    */
    @SerializedName("SceneEmrVersion")
    @Expose
    private String SceneEmrVersion;

    /**
    * Scenario-based cluster type.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * vpc name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * subnet name
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
    * Cluster vpcid string type.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Subnet ID string type.
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
    * Whether it is a cross-AZ cluster.
    */
    @SerializedName("IsMultiZoneCluster")
    @Expose
    private Boolean IsMultiZoneCluster;

    /**
    * Whether to enable automatic compensation for abnormal nodes.
    */
    @SerializedName("IsCvmReplace")
    @Expose
    private Boolean IsCvmReplace;

    /**
    * Title.
    */
    @SerializedName("ClusterTitle")
    @Expose
    private String ClusterTitle;

    /**
    * Cluster product configuration information

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigDetail")
    @Expose
    private EmrProductConfigDetail ConfigDetail;

    /**
    * Number of file systems bound to a cluster.
    */
    @SerializedName("BindFileSystemNum")
    @Expose
    private Long BindFileSystemNum;

    /**
    * Bound list of the RSS cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterRelationInfoList")
    @Expose
    private ClusterRelationMeta [] ClusterRelationInfoList;

    /**
    * Redis information.
    */
    @SerializedName("RedisId")
    @Expose
    private String RedisId;

    /**
     * Get ID. 
     * @return Id ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID.
     * @param Id ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Title
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Ftitle Title
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getFtitle() {
        return this.Ftitle;
    }

    /**
     * Set Title
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Ftitle Title
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setFtitle(String Ftitle) {
        this.Ftitle = Ftitle;
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
     * Get Region ID. 
     * @return RegionId Region ID.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID.
     * @param RegionId Region ID.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region ID. 
     * @return ZoneId Region ID.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Region ID.
     * @param ZoneId Region ID.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get User AppID. 
     * @return AppId User AppID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppID.
     * @param AppId User AppID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN. 
     * @return Uin User UIN.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN.
     * @param Uin User UIN.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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
     * Get Cluster VPCID. 
     * @return VpcId Cluster VPCID.
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Cluster VPCID.
     * @param VpcId Cluster VPCID.
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
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
     * Get Instance status code. Valid range:
<li>2: the cluster is running.</li>
<li>3: the cluster is being created.</li>
<li>4: the cluster is being scaled out.</li>
<li>5: Router nodes are being added to the cluster.</li>
<li>6: components are being installed in the cluster.</li>
<li>7: commands are being executed in the cluster.</li>
<li>8: the service is being restarted.</li>
<li>9: maintenance is in progress.</li>
<li>10: the service is being suspended.</li>
<li>11: the cluster is exiting maintenance.</li>
<li>12: the cluster is exiting suspension.</li>
<li>13: the configuration is being distributed.</li>
<li>14: the cluster is being terminated.</li>
<li>15: the Core node is being destroyed.</li>
<li>16: the Task node is being destroyed.</li>
<li>17: the Router node is being destroyed.</li>
<li>18: the web proxy password is being changed.</li>
<li>19: the cluster is being isolated.</li>
<li>20: the cluster is undergoing a reversal transaction.</li>
<li>21: the cluster is being recycled.</li>
<li>22: the instance is waiting for resizing.</li>
<li>23: the cluster has been isolated.</li>
<li>24: the number of nodes is being reduced.</li>
<li>33: the cluster is waiting for a refund.</li>
<li>34: the cluster has received a refund.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li> 
     * @return Status Instance status code. Valid range:
<li>2: the cluster is running.</li>
<li>3: the cluster is being created.</li>
<li>4: the cluster is being scaled out.</li>
<li>5: Router nodes are being added to the cluster.</li>
<li>6: components are being installed in the cluster.</li>
<li>7: commands are being executed in the cluster.</li>
<li>8: the service is being restarted.</li>
<li>9: maintenance is in progress.</li>
<li>10: the service is being suspended.</li>
<li>11: the cluster is exiting maintenance.</li>
<li>12: the cluster is exiting suspension.</li>
<li>13: the configuration is being distributed.</li>
<li>14: the cluster is being terminated.</li>
<li>15: the Core node is being destroyed.</li>
<li>16: the Task node is being destroyed.</li>
<li>17: the Router node is being destroyed.</li>
<li>18: the web proxy password is being changed.</li>
<li>19: the cluster is being isolated.</li>
<li>20: the cluster is undergoing a reversal transaction.</li>
<li>21: the cluster is being recycled.</li>
<li>22: the instance is waiting for resizing.</li>
<li>23: the cluster has been isolated.</li>
<li>24: the number of nodes is being reduced.</li>
<li>33: the cluster is waiting for a refund.</li>
<li>34: the cluster has received a refund.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status code. Valid range:
<li>2: the cluster is running.</li>
<li>3: the cluster is being created.</li>
<li>4: the cluster is being scaled out.</li>
<li>5: Router nodes are being added to the cluster.</li>
<li>6: components are being installed in the cluster.</li>
<li>7: commands are being executed in the cluster.</li>
<li>8: the service is being restarted.</li>
<li>9: maintenance is in progress.</li>
<li>10: the service is being suspended.</li>
<li>11: the cluster is exiting maintenance.</li>
<li>12: the cluster is exiting suspension.</li>
<li>13: the configuration is being distributed.</li>
<li>14: the cluster is being terminated.</li>
<li>15: the Core node is being destroyed.</li>
<li>16: the Task node is being destroyed.</li>
<li>17: the Router node is being destroyed.</li>
<li>18: the web proxy password is being changed.</li>
<li>19: the cluster is being isolated.</li>
<li>20: the cluster is undergoing a reversal transaction.</li>
<li>21: the cluster is being recycled.</li>
<li>22: the instance is waiting for resizing.</li>
<li>23: the cluster has been isolated.</li>
<li>24: the number of nodes is being reduced.</li>
<li>33: the cluster is waiting for a refund.</li>
<li>34: the cluster has received a refund.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li>
     * @param Status Instance status code. Valid range:
<li>2: the cluster is running.</li>
<li>3: the cluster is being created.</li>
<li>4: the cluster is being scaled out.</li>
<li>5: Router nodes are being added to the cluster.</li>
<li>6: components are being installed in the cluster.</li>
<li>7: commands are being executed in the cluster.</li>
<li>8: the service is being restarted.</li>
<li>9: maintenance is in progress.</li>
<li>10: the service is being suspended.</li>
<li>11: the cluster is exiting maintenance.</li>
<li>12: the cluster is exiting suspension.</li>
<li>13: the configuration is being distributed.</li>
<li>14: the cluster is being terminated.</li>
<li>15: the Core node is being destroyed.</li>
<li>16: the Task node is being destroyed.</li>
<li>17: the Router node is being destroyed.</li>
<li>18: the web proxy password is being changed.</li>
<li>19: the cluster is being isolated.</li>
<li>20: the cluster is undergoing a reversal transaction.</li>
<li>21: the cluster is being recycled.</li>
<li>22: the instance is waiting for resizing.</li>
<li>23: the cluster has been isolated.</li>
<li>24: the number of nodes is being reduced.</li>
<li>33: the cluster is waiting for a refund.</li>
<li>34: the cluster has received a refund.</li>
<li>301: creation failed.</li>
<li>302: scale-out failed.</li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Adding time. 
     * @return AddTime Adding time.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Adding time.
     * @param AddTime Adding time.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Runtime. 
     * @return RunTime Runtime.
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set Runtime.
     * @param RunTime Runtime.
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get Cluster product configuration information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Config Cluster product configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public EmrProductConfigOutter getConfig() {
        return this.Config;
    }

    /**
     * Set Cluster product configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Config Cluster product configuration information
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setConfig(EmrProductConfigOutter Config) {
        this.Config = Config;
    }

    /**
     * Get Public network IP address of the primary node. 
     * @return MasterIp Public network IP address of the primary node.
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * Set Public network IP address of the primary node.
     * @param MasterIp Public network IP address of the primary node.
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * Get EMR version. 
     * @return EmrVersion EMR version.
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * Set EMR version.
     * @param EmrVersion EMR version.
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * Get Charge type. 
     * @return ChargeType Charge type.
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Charge type.
     * @param ChargeType Charge type.
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Transaction version. 
     * @return TradeVersion Transaction version.
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set Transaction version.
     * @param TradeVersion Transaction version.
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * Get Resource order ID. 
     * @return ResourceOrderId Resource order ID.
     */
    public Long getResourceOrderId() {
        return this.ResourceOrderId;
    }

    /**
     * Set Resource order ID.
     * @param ResourceOrderId Resource order ID.
     */
    public void setResourceOrderId(Long ResourceOrderId) {
        this.ResourceOrderId = ResourceOrderId;
    }

    /**
     * Get Whether it is a billing cluster. 
     * @return IsTradeCluster Whether it is a billing cluster.
     */
    public Long getIsTradeCluster() {
        return this.IsTradeCluster;
    }

    /**
     * Set Whether it is a billing cluster.
     * @param IsTradeCluster Whether it is a billing cluster.
     */
    public void setIsTradeCluster(Long IsTradeCluster) {
        this.IsTradeCluster = IsTradeCluster;
    }

    /**
     * Get Alarm information of cluster error status. 
     * @return AlarmInfo Alarm information of cluster error status.
     */
    public String getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set Alarm information of cluster error status.
     * @param AlarmInfo Alarm information of cluster error status.
     */
    public void setAlarmInfo(String AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get Whether to adopt new architecture. 
     * @return IsWoodpeckerCluster Whether to adopt new architecture.
     */
    public Long getIsWoodpeckerCluster() {
        return this.IsWoodpeckerCluster;
    }

    /**
     * Set Whether to adopt new architecture.
     * @param IsWoodpeckerCluster Whether to adopt new architecture.
     */
    public void setIsWoodpeckerCluster(Long IsWoodpeckerCluster) {
        this.IsWoodpeckerCluster = IsWoodpeckerCluster;
    }

    /**
     * Get Metadatabase information. 
     * @return MetaDb Metadatabase information.
     */
    public String getMetaDb() {
        return this.MetaDb;
    }

    /**
     * Set Metadatabase information.
     * @param MetaDb Metadatabase information.
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
     * Get Hive metadata information. 
     * @return HiveMetaDb Hive metadata information.
     */
    public String getHiveMetaDb() {
        return this.HiveMetaDb;
    }

    /**
     * Set Hive metadata information.
     * @param HiveMetaDb Hive metadata information.
     */
    public void setHiveMetaDb(String HiveMetaDb) {
        this.HiveMetaDb = HiveMetaDb;
    }

    /**
     * Get Cluster type: EMR,CLICKHOUSE,DRUID. 
     * @return ServiceClass Cluster type: EMR,CLICKHOUSE,DRUID.
     */
    public String getServiceClass() {
        return this.ServiceClass;
    }

    /**
     * Set Cluster type: EMR,CLICKHOUSE,DRUID.
     * @param ServiceClass Cluster type: EMR,CLICKHOUSE,DRUID.
     */
    public void setServiceClass(String ServiceClass) {
        this.ServiceClass = ServiceClass;
    }

    /**
     * Get Alias serialization of all nodes in the cluster. 
     * @return AliasInfo Alias serialization of all nodes in the cluster.
     */
    public String getAliasInfo() {
        return this.AliasInfo;
    }

    /**
     * Set Alias serialization of all nodes in the cluster.
     * @param AliasInfo Alias serialization of all nodes in the cluster.
     */
    public void setAliasInfo(String AliasInfo) {
        this.AliasInfo = AliasInfo;
    }

    /**
     * Get Cluster version ID. 
     * @return ProductId Cluster version ID.
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Cluster version ID.
     * @param ProductId Cluster version ID.
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Region ID. 
     * @return Zone Region ID.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region ID.
     * @param Zone Region ID.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Scenario name. 
     * @return SceneName Scenario name.
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set Scenario name.
     * @param SceneName Scenario name.
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get Scenario-based cluster type. 
     * @return SceneServiceClass Scenario-based cluster type.
     */
    public String getSceneServiceClass() {
        return this.SceneServiceClass;
    }

    /**
     * Set Scenario-based cluster type.
     * @param SceneServiceClass Scenario-based cluster type.
     */
    public void setSceneServiceClass(String SceneServiceClass) {
        this.SceneServiceClass = SceneServiceClass;
    }

    /**
     * Get Scenario-based EMR version. 
     * @return SceneEmrVersion Scenario-based EMR version.
     */
    public String getSceneEmrVersion() {
        return this.SceneEmrVersion;
    }

    /**
     * Set Scenario-based EMR version.
     * @param SceneEmrVersion Scenario-based EMR version.
     */
    public void setSceneEmrVersion(String SceneEmrVersion) {
        this.SceneEmrVersion = SceneEmrVersion;
    }

    /**
     * Get Scenario-based cluster type. 
     * @return DisplayName Scenario-based cluster type.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Scenario-based cluster type.
     * @param DisplayName Scenario-based cluster type.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get vpc name 
     * @return VpcName vpc name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc name
     * @param VpcName vpc name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get subnet name 
     * @return SubnetName subnet name
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set subnet name
     * @param SubnetName subnet name
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
     * Get Cluster vpcid string type. 
     * @return UniqVpcId Cluster vpcid string type.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Cluster vpcid string type.
     * @param UniqVpcId Cluster vpcid string type.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Subnet ID string type. 
     * @return UniqSubnetId Subnet ID string type.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet ID string type.
     * @param UniqSubnetId Subnet ID string type.
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
     * Get Whether to enable automatic compensation for abnormal nodes. 
     * @return IsCvmReplace Whether to enable automatic compensation for abnormal nodes.
     */
    public Boolean getIsCvmReplace() {
        return this.IsCvmReplace;
    }

    /**
     * Set Whether to enable automatic compensation for abnormal nodes.
     * @param IsCvmReplace Whether to enable automatic compensation for abnormal nodes.
     */
    public void setIsCvmReplace(Boolean IsCvmReplace) {
        this.IsCvmReplace = IsCvmReplace;
    }

    /**
     * Get Title. 
     * @return ClusterTitle Title.
     */
    public String getClusterTitle() {
        return this.ClusterTitle;
    }

    /**
     * Set Title.
     * @param ClusterTitle Title.
     */
    public void setClusterTitle(String ClusterTitle) {
        this.ClusterTitle = ClusterTitle;
    }

    /**
     * Get Cluster product configuration information

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigDetail Cluster product configuration information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EmrProductConfigDetail getConfigDetail() {
        return this.ConfigDetail;
    }

    /**
     * Set Cluster product configuration information

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigDetail Cluster product configuration information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigDetail(EmrProductConfigDetail ConfigDetail) {
        this.ConfigDetail = ConfigDetail;
    }

    /**
     * Get Number of file systems bound to a cluster. 
     * @return BindFileSystemNum Number of file systems bound to a cluster.
     */
    public Long getBindFileSystemNum() {
        return this.BindFileSystemNum;
    }

    /**
     * Set Number of file systems bound to a cluster.
     * @param BindFileSystemNum Number of file systems bound to a cluster.
     */
    public void setBindFileSystemNum(Long BindFileSystemNum) {
        this.BindFileSystemNum = BindFileSystemNum;
    }

    /**
     * Get Bound list of the RSS cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterRelationInfoList Bound list of the RSS cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ClusterRelationMeta [] getClusterRelationInfoList() {
        return this.ClusterRelationInfoList;
    }

    /**
     * Set Bound list of the RSS cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterRelationInfoList Bound list of the RSS cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterRelationInfoList(ClusterRelationMeta [] ClusterRelationInfoList) {
        this.ClusterRelationInfoList = ClusterRelationInfoList;
    }

    /**
     * Get Redis information. 
     * @return RedisId Redis information.
     */
    public String getRedisId() {
        return this.RedisId;
    }

    /**
     * Set Redis information.
     * @param RedisId Redis information.
     */
    public void setRedisId(String RedisId) {
        this.RedisId = RedisId;
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
        if (source.ClusterTitle != null) {
            this.ClusterTitle = new String(source.ClusterTitle);
        }
        if (source.ConfigDetail != null) {
            this.ConfigDetail = new EmrProductConfigDetail(source.ConfigDetail);
        }
        if (source.BindFileSystemNum != null) {
            this.BindFileSystemNum = new Long(source.BindFileSystemNum);
        }
        if (source.ClusterRelationInfoList != null) {
            this.ClusterRelationInfoList = new ClusterRelationMeta[source.ClusterRelationInfoList.length];
            for (int i = 0; i < source.ClusterRelationInfoList.length; i++) {
                this.ClusterRelationInfoList[i] = new ClusterRelationMeta(source.ClusterRelationInfoList[i]);
            }
        }
        if (source.RedisId != null) {
            this.RedisId = new String(source.RedisId);
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
        this.setParamSimple(map, prefix + "ClusterTitle", this.ClusterTitle);
        this.setParamObj(map, prefix + "ConfigDetail.", this.ConfigDetail);
        this.setParamSimple(map, prefix + "BindFileSystemNum", this.BindFileSystemNum);
        this.setParamArrayObj(map, prefix + "ClusterRelationInfoList.", this.ClusterRelationInfoList);
        this.setParamSimple(map, prefix + "RedisId", this.RedisId);

    }
}

