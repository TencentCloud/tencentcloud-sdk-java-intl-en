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
    * <p>ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Title.</p>
    */
    @SerializedName("Ftitle")
    @Expose
    private String Ftitle;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Region ID.</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>Region ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>User APPID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>User UIN.</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Cluster VPC ID.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>Subnet ID.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>Status code of the instance. Valid values:</p><li>2: The cluster is running.</li><li>3: The cluster is being created.</li><li>4: The cluster is being scaled out.</li><li>5: Router nodes are being added to the cluster.</li><li>6: Components are being installed in the cluster.</li><li>7: The cluster is executing a command.</li><li>8: The service is being restarted.</li><li>9: The cluster is entering maintenance.</li><li>10: The service is being paused.</li><li>11: The cluster is exiting maintenance.</li><li>12: The cluster is exiting the pause status.</li><li>13: The configuration is being delivered.</li><li>14: The cluster is being terminated.</li><li>15: Core nodes are being terminated.</li><li>16: Task nodes are being terminated.</li><li>17: Router nodes are being terminated.</li><li>18: The webproxy password is being changed.</li><li>19: The cluster is being isolated.</li><li>20: The cluster is being reconciled.</li><li>21: The cluster is being reclaimed.</li><li>22: The configuration change is waiting.</li><li>23: The cluster has been isolated.</li><li>24: Nodes are being scaled in.</li><li>33: The cluster is waiting for a refund.</li><li>34: The cluster has been refunded.</li><li>301: Creation failed.</li><li>302: Scale-out failed.</li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Addition time.</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>Execution duration.</p>
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * <p>Cluster product configuration information.</p>
    */
    @SerializedName("Config")
    @Expose
    private EmrProductConfigOutter Config;

    /**
    * <p>Public IP address of the Master node.</p>
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * <p>EMR version.</p>
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * <p>Billing mode.</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * <p>Transaction version.</p>
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
    * <p>Resource order ID.</p>
    */
    @SerializedName("ResourceOrderId")
    @Expose
    private Long ResourceOrderId;

    /**
    * <p>Whether it is a billable cluster.</p>
    */
    @SerializedName("IsTradeCluster")
    @Expose
    private Long IsTradeCluster;

    /**
    * <p>Cluster error status alarm information.</p>
    */
    @SerializedName("AlarmInfo")
    @Expose
    private String AlarmInfo;

    /**
    * <p>Whether a new architecture is used.</p>
    */
    @SerializedName("IsWoodpeckerCluster")
    @Expose
    private Long IsWoodpeckerCluster;

    /**
    * <p>Meta database information.</p>
    */
    @SerializedName("MetaDb")
    @Expose
    private String MetaDb;

    /**
    * <p>Tag information.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Hive metadata information.</p>
    */
    @SerializedName("HiveMetaDb")
    @Expose
    private String HiveMetaDb;

    /**
    * <p>Cluster type. Valid values: EMR, CLICKHOUSE, and DRUID.</p>
    */
    @SerializedName("ServiceClass")
    @Expose
    private String ServiceClass;

    /**
    * <p>Serialization of the aliases of all nodes in the cluster.</p>
    */
    @SerializedName("AliasInfo")
    @Expose
    private String AliasInfo;

    /**
    * <p>Cluster version ID.</p>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>Region ID.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Scenario name.</p>
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * <p>Scenario-based cluster type.</p>
    */
    @SerializedName("SceneServiceClass")
    @Expose
    private String SceneServiceClass;

    /**
    * <p>Scenario-based EMR version.</p>
    */
    @SerializedName("SceneEmrVersion")
    @Expose
    private String SceneEmrVersion;

    /**
    * <p>Scenario-based cluster type.</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>vpc name</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>subnet name</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>Cluster dependency.</p>
    */
    @SerializedName("ClusterExternalServiceInfo")
    @Expose
    private ClusterExternalServiceInfo [] ClusterExternalServiceInfo;

    /**
    * <p>Cluster VPC ID, string type.</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>Subnet ID, string type.</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>Node information.</p>
    */
    @SerializedName("TopologyInfoList")
    @Expose
    private TopologyInfo [] TopologyInfoList;

    /**
    * <p>Whether it is a cross-AZ cluster.</p>
    */
    @SerializedName("IsMultiZoneCluster")
    @Expose
    private Boolean IsMultiZoneCluster;

    /**
    * <p>Whether automatic compensation for abnormal nodes is enabled.</p>
    */
    @SerializedName("IsCvmReplace")
    @Expose
    private Boolean IsCvmReplace;

    /**
    * <p>Title.</p>
    */
    @SerializedName("ClusterTitle")
    @Expose
    private String ClusterTitle;

    /**
    * <p>Cluster product configuration information.</p>
    */
    @SerializedName("ConfigDetail")
    @Expose
    private EmrProductConfigDetail ConfigDetail;

    /**
    * <p>Number of file systems bound to the cluster.</p>
    */
    @SerializedName("BindFileSystemNum")
    @Expose
    private Long BindFileSystemNum;

    /**
    * <p>Binding list of the RSS cluster.</p>
    */
    @SerializedName("ClusterRelationInfoList")
    @Expose
    private ClusterRelationMeta [] ClusterRelationInfoList;

    /**
    * <p>Redis information.</p>
    */
    @SerializedName("RedisId")
    @Expose
    private String RedisId;

    /**
    * <p>Whether IO fault self-healing is enabled.</p>
    */
    @SerializedName("IsIOHungSelfRecovery")
    @Expose
    private Boolean IsIOHungSelfRecovery;

    /**
    * <p>Metadata information.</p>
    */
    @SerializedName("MetaDBGroupInfo")
    @Expose
    private CustomMetaDBInfo [] MetaDBGroupInfo;

    /**
     * Get <p>ID.</p> 
     * @return Id <p>ID.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>ID.</p>
     * @param Id <p>ID.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get <p>Title.</p> 
     * @return Ftitle <p>Title.</p>
     * @deprecated
     */
    @Deprecated
    public String getFtitle() {
        return this.Ftitle;
    }

    /**
     * Set <p>Title.</p>
     * @param Ftitle <p>Title.</p>
     * @deprecated
     */
    @Deprecated
    public void setFtitle(String Ftitle) {
        this.Ftitle = Ftitle;
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
     * Get <p>Region ID.</p> 
     * @return RegionId <p>Region ID.</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>Region ID.</p>
     * @param RegionId <p>Region ID.</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>Region ID.</p> 
     * @return ZoneId <p>Region ID.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Region ID.</p>
     * @param ZoneId <p>Region ID.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>User APPID.</p> 
     * @return AppId <p>User APPID.</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User APPID.</p>
     * @param AppId <p>User APPID.</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>User UIN.</p> 
     * @return Uin <p>User UIN.</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>User UIN.</p>
     * @param Uin <p>User UIN.</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectId <p>Project ID.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectId <p>Project ID.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Cluster VPC ID.</p> 
     * @return VpcId <p>Cluster VPC ID.</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Cluster VPC ID.</p>
     * @param VpcId <p>Cluster VPC ID.</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID.</p> 
     * @return SubnetId <p>Subnet ID.</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID.</p>
     * @param SubnetId <p>Subnet ID.</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Status code of the instance. Valid values:</p><li>2: The cluster is running.</li><li>3: The cluster is being created.</li><li>4: The cluster is being scaled out.</li><li>5: Router nodes are being added to the cluster.</li><li>6: Components are being installed in the cluster.</li><li>7: The cluster is executing a command.</li><li>8: The service is being restarted.</li><li>9: The cluster is entering maintenance.</li><li>10: The service is being paused.</li><li>11: The cluster is exiting maintenance.</li><li>12: The cluster is exiting the pause status.</li><li>13: The configuration is being delivered.</li><li>14: The cluster is being terminated.</li><li>15: Core nodes are being terminated.</li><li>16: Task nodes are being terminated.</li><li>17: Router nodes are being terminated.</li><li>18: The webproxy password is being changed.</li><li>19: The cluster is being isolated.</li><li>20: The cluster is being reconciled.</li><li>21: The cluster is being reclaimed.</li><li>22: The configuration change is waiting.</li><li>23: The cluster has been isolated.</li><li>24: Nodes are being scaled in.</li><li>33: The cluster is waiting for a refund.</li><li>34: The cluster has been refunded.</li><li>301: Creation failed.</li><li>302: Scale-out failed.</li> 
     * @return Status <p>Status code of the instance. Valid values:</p><li>2: The cluster is running.</li><li>3: The cluster is being created.</li><li>4: The cluster is being scaled out.</li><li>5: Router nodes are being added to the cluster.</li><li>6: Components are being installed in the cluster.</li><li>7: The cluster is executing a command.</li><li>8: The service is being restarted.</li><li>9: The cluster is entering maintenance.</li><li>10: The service is being paused.</li><li>11: The cluster is exiting maintenance.</li><li>12: The cluster is exiting the pause status.</li><li>13: The configuration is being delivered.</li><li>14: The cluster is being terminated.</li><li>15: Core nodes are being terminated.</li><li>16: Task nodes are being terminated.</li><li>17: Router nodes are being terminated.</li><li>18: The webproxy password is being changed.</li><li>19: The cluster is being isolated.</li><li>20: The cluster is being reconciled.</li><li>21: The cluster is being reclaimed.</li><li>22: The configuration change is waiting.</li><li>23: The cluster has been isolated.</li><li>24: Nodes are being scaled in.</li><li>33: The cluster is waiting for a refund.</li><li>34: The cluster has been refunded.</li><li>301: Creation failed.</li><li>302: Scale-out failed.</li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status code of the instance. Valid values:</p><li>2: The cluster is running.</li><li>3: The cluster is being created.</li><li>4: The cluster is being scaled out.</li><li>5: Router nodes are being added to the cluster.</li><li>6: Components are being installed in the cluster.</li><li>7: The cluster is executing a command.</li><li>8: The service is being restarted.</li><li>9: The cluster is entering maintenance.</li><li>10: The service is being paused.</li><li>11: The cluster is exiting maintenance.</li><li>12: The cluster is exiting the pause status.</li><li>13: The configuration is being delivered.</li><li>14: The cluster is being terminated.</li><li>15: Core nodes are being terminated.</li><li>16: Task nodes are being terminated.</li><li>17: Router nodes are being terminated.</li><li>18: The webproxy password is being changed.</li><li>19: The cluster is being isolated.</li><li>20: The cluster is being reconciled.</li><li>21: The cluster is being reclaimed.</li><li>22: The configuration change is waiting.</li><li>23: The cluster has been isolated.</li><li>24: Nodes are being scaled in.</li><li>33: The cluster is waiting for a refund.</li><li>34: The cluster has been refunded.</li><li>301: Creation failed.</li><li>302: Scale-out failed.</li>
     * @param Status <p>Status code of the instance. Valid values:</p><li>2: The cluster is running.</li><li>3: The cluster is being created.</li><li>4: The cluster is being scaled out.</li><li>5: Router nodes are being added to the cluster.</li><li>6: Components are being installed in the cluster.</li><li>7: The cluster is executing a command.</li><li>8: The service is being restarted.</li><li>9: The cluster is entering maintenance.</li><li>10: The service is being paused.</li><li>11: The cluster is exiting maintenance.</li><li>12: The cluster is exiting the pause status.</li><li>13: The configuration is being delivered.</li><li>14: The cluster is being terminated.</li><li>15: Core nodes are being terminated.</li><li>16: Task nodes are being terminated.</li><li>17: Router nodes are being terminated.</li><li>18: The webproxy password is being changed.</li><li>19: The cluster is being isolated.</li><li>20: The cluster is being reconciled.</li><li>21: The cluster is being reclaimed.</li><li>22: The configuration change is waiting.</li><li>23: The cluster has been isolated.</li><li>24: Nodes are being scaled in.</li><li>33: The cluster is waiting for a refund.</li><li>34: The cluster has been refunded.</li><li>301: Creation failed.</li><li>302: Scale-out failed.</li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Addition time.</p> 
     * @return AddTime <p>Addition time.</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>Addition time.</p>
     * @param AddTime <p>Addition time.</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>Execution duration.</p> 
     * @return RunTime <p>Execution duration.</p>
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set <p>Execution duration.</p>
     * @param RunTime <p>Execution duration.</p>
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get <p>Cluster product configuration information.</p> 
     * @return Config <p>Cluster product configuration information.</p>
     * @deprecated
     */
    @Deprecated
    public EmrProductConfigOutter getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Cluster product configuration information.</p>
     * @param Config <p>Cluster product configuration information.</p>
     * @deprecated
     */
    @Deprecated
    public void setConfig(EmrProductConfigOutter Config) {
        this.Config = Config;
    }

    /**
     * Get <p>Public IP address of the Master node.</p> 
     * @return MasterIp <p>Public IP address of the Master node.</p>
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * Set <p>Public IP address of the Master node.</p>
     * @param MasterIp <p>Public IP address of the Master node.</p>
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * Get <p>EMR version.</p> 
     * @return EmrVersion <p>EMR version.</p>
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * Set <p>EMR version.</p>
     * @param EmrVersion <p>EMR version.</p>
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * Get <p>Billing mode.</p> 
     * @return ChargeType <p>Billing mode.</p>
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>Billing mode.</p>
     * @param ChargeType <p>Billing mode.</p>
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>Transaction version.</p> 
     * @return TradeVersion <p>Transaction version.</p>
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set <p>Transaction version.</p>
     * @param TradeVersion <p>Transaction version.</p>
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * Get <p>Resource order ID.</p> 
     * @return ResourceOrderId <p>Resource order ID.</p>
     */
    public Long getResourceOrderId() {
        return this.ResourceOrderId;
    }

    /**
     * Set <p>Resource order ID.</p>
     * @param ResourceOrderId <p>Resource order ID.</p>
     */
    public void setResourceOrderId(Long ResourceOrderId) {
        this.ResourceOrderId = ResourceOrderId;
    }

    /**
     * Get <p>Whether it is a billable cluster.</p> 
     * @return IsTradeCluster <p>Whether it is a billable cluster.</p>
     */
    public Long getIsTradeCluster() {
        return this.IsTradeCluster;
    }

    /**
     * Set <p>Whether it is a billable cluster.</p>
     * @param IsTradeCluster <p>Whether it is a billable cluster.</p>
     */
    public void setIsTradeCluster(Long IsTradeCluster) {
        this.IsTradeCluster = IsTradeCluster;
    }

    /**
     * Get <p>Cluster error status alarm information.</p> 
     * @return AlarmInfo <p>Cluster error status alarm information.</p>
     */
    public String getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set <p>Cluster error status alarm information.</p>
     * @param AlarmInfo <p>Cluster error status alarm information.</p>
     */
    public void setAlarmInfo(String AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get <p>Whether a new architecture is used.</p> 
     * @return IsWoodpeckerCluster <p>Whether a new architecture is used.</p>
     */
    public Long getIsWoodpeckerCluster() {
        return this.IsWoodpeckerCluster;
    }

    /**
     * Set <p>Whether a new architecture is used.</p>
     * @param IsWoodpeckerCluster <p>Whether a new architecture is used.</p>
     */
    public void setIsWoodpeckerCluster(Long IsWoodpeckerCluster) {
        this.IsWoodpeckerCluster = IsWoodpeckerCluster;
    }

    /**
     * Get <p>Meta database information.</p> 
     * @return MetaDb <p>Meta database information.</p>
     */
    public String getMetaDb() {
        return this.MetaDb;
    }

    /**
     * Set <p>Meta database information.</p>
     * @param MetaDb <p>Meta database information.</p>
     */
    public void setMetaDb(String MetaDb) {
        this.MetaDb = MetaDb;
    }

    /**
     * Get <p>Tag information.</p> 
     * @return Tags <p>Tag information.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag information.</p>
     * @param Tags <p>Tag information.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Hive metadata information.</p> 
     * @return HiveMetaDb <p>Hive metadata information.</p>
     */
    public String getHiveMetaDb() {
        return this.HiveMetaDb;
    }

    /**
     * Set <p>Hive metadata information.</p>
     * @param HiveMetaDb <p>Hive metadata information.</p>
     */
    public void setHiveMetaDb(String HiveMetaDb) {
        this.HiveMetaDb = HiveMetaDb;
    }

    /**
     * Get <p>Cluster type. Valid values: EMR, CLICKHOUSE, and DRUID.</p> 
     * @return ServiceClass <p>Cluster type. Valid values: EMR, CLICKHOUSE, and DRUID.</p>
     */
    public String getServiceClass() {
        return this.ServiceClass;
    }

    /**
     * Set <p>Cluster type. Valid values: EMR, CLICKHOUSE, and DRUID.</p>
     * @param ServiceClass <p>Cluster type. Valid values: EMR, CLICKHOUSE, and DRUID.</p>
     */
    public void setServiceClass(String ServiceClass) {
        this.ServiceClass = ServiceClass;
    }

    /**
     * Get <p>Serialization of the aliases of all nodes in the cluster.</p> 
     * @return AliasInfo <p>Serialization of the aliases of all nodes in the cluster.</p>
     */
    public String getAliasInfo() {
        return this.AliasInfo;
    }

    /**
     * Set <p>Serialization of the aliases of all nodes in the cluster.</p>
     * @param AliasInfo <p>Serialization of the aliases of all nodes in the cluster.</p>
     */
    public void setAliasInfo(String AliasInfo) {
        this.AliasInfo = AliasInfo;
    }

    /**
     * Get <p>Cluster version ID.</p> 
     * @return ProductId <p>Cluster version ID.</p>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>Cluster version ID.</p>
     * @param ProductId <p>Cluster version ID.</p>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>Region ID.</p> 
     * @return Zone <p>Region ID.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Region ID.</p>
     * @param Zone <p>Region ID.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Scenario name.</p> 
     * @return SceneName <p>Scenario name.</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>Scenario name.</p>
     * @param SceneName <p>Scenario name.</p>
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get <p>Scenario-based cluster type.</p> 
     * @return SceneServiceClass <p>Scenario-based cluster type.</p>
     */
    public String getSceneServiceClass() {
        return this.SceneServiceClass;
    }

    /**
     * Set <p>Scenario-based cluster type.</p>
     * @param SceneServiceClass <p>Scenario-based cluster type.</p>
     */
    public void setSceneServiceClass(String SceneServiceClass) {
        this.SceneServiceClass = SceneServiceClass;
    }

    /**
     * Get <p>Scenario-based EMR version.</p> 
     * @return SceneEmrVersion <p>Scenario-based EMR version.</p>
     */
    public String getSceneEmrVersion() {
        return this.SceneEmrVersion;
    }

    /**
     * Set <p>Scenario-based EMR version.</p>
     * @param SceneEmrVersion <p>Scenario-based EMR version.</p>
     */
    public void setSceneEmrVersion(String SceneEmrVersion) {
        this.SceneEmrVersion = SceneEmrVersion;
    }

    /**
     * Get <p>Scenario-based cluster type.</p> 
     * @return DisplayName <p>Scenario-based cluster type.</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>Scenario-based cluster type.</p>
     * @param DisplayName <p>Scenario-based cluster type.</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>vpc name</p> 
     * @return VpcName <p>vpc name</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>vpc name</p>
     * @param VpcName <p>vpc name</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>subnet name</p> 
     * @return SubnetName <p>subnet name</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>subnet name</p>
     * @param SubnetName <p>subnet name</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>Cluster dependency.</p> 
     * @return ClusterExternalServiceInfo <p>Cluster dependency.</p>
     */
    public ClusterExternalServiceInfo [] getClusterExternalServiceInfo() {
        return this.ClusterExternalServiceInfo;
    }

    /**
     * Set <p>Cluster dependency.</p>
     * @param ClusterExternalServiceInfo <p>Cluster dependency.</p>
     */
    public void setClusterExternalServiceInfo(ClusterExternalServiceInfo [] ClusterExternalServiceInfo) {
        this.ClusterExternalServiceInfo = ClusterExternalServiceInfo;
    }

    /**
     * Get <p>Cluster VPC ID, string type.</p> 
     * @return UniqVpcId <p>Cluster VPC ID, string type.</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>Cluster VPC ID, string type.</p>
     * @param UniqVpcId <p>Cluster VPC ID, string type.</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>Subnet ID, string type.</p> 
     * @return UniqSubnetId <p>Subnet ID, string type.</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>Subnet ID, string type.</p>
     * @param UniqSubnetId <p>Subnet ID, string type.</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>Node information.</p> 
     * @return TopologyInfoList <p>Node information.</p>
     */
    public TopologyInfo [] getTopologyInfoList() {
        return this.TopologyInfoList;
    }

    /**
     * Set <p>Node information.</p>
     * @param TopologyInfoList <p>Node information.</p>
     */
    public void setTopologyInfoList(TopologyInfo [] TopologyInfoList) {
        this.TopologyInfoList = TopologyInfoList;
    }

    /**
     * Get <p>Whether it is a cross-AZ cluster.</p> 
     * @return IsMultiZoneCluster <p>Whether it is a cross-AZ cluster.</p>
     */
    public Boolean getIsMultiZoneCluster() {
        return this.IsMultiZoneCluster;
    }

    /**
     * Set <p>Whether it is a cross-AZ cluster.</p>
     * @param IsMultiZoneCluster <p>Whether it is a cross-AZ cluster.</p>
     */
    public void setIsMultiZoneCluster(Boolean IsMultiZoneCluster) {
        this.IsMultiZoneCluster = IsMultiZoneCluster;
    }

    /**
     * Get <p>Whether automatic compensation for abnormal nodes is enabled.</p> 
     * @return IsCvmReplace <p>Whether automatic compensation for abnormal nodes is enabled.</p>
     */
    public Boolean getIsCvmReplace() {
        return this.IsCvmReplace;
    }

    /**
     * Set <p>Whether automatic compensation for abnormal nodes is enabled.</p>
     * @param IsCvmReplace <p>Whether automatic compensation for abnormal nodes is enabled.</p>
     */
    public void setIsCvmReplace(Boolean IsCvmReplace) {
        this.IsCvmReplace = IsCvmReplace;
    }

    /**
     * Get <p>Title.</p> 
     * @return ClusterTitle <p>Title.</p>
     */
    public String getClusterTitle() {
        return this.ClusterTitle;
    }

    /**
     * Set <p>Title.</p>
     * @param ClusterTitle <p>Title.</p>
     */
    public void setClusterTitle(String ClusterTitle) {
        this.ClusterTitle = ClusterTitle;
    }

    /**
     * Get <p>Cluster product configuration information.</p> 
     * @return ConfigDetail <p>Cluster product configuration information.</p>
     */
    public EmrProductConfigDetail getConfigDetail() {
        return this.ConfigDetail;
    }

    /**
     * Set <p>Cluster product configuration information.</p>
     * @param ConfigDetail <p>Cluster product configuration information.</p>
     */
    public void setConfigDetail(EmrProductConfigDetail ConfigDetail) {
        this.ConfigDetail = ConfigDetail;
    }

    /**
     * Get <p>Number of file systems bound to the cluster.</p> 
     * @return BindFileSystemNum <p>Number of file systems bound to the cluster.</p>
     */
    public Long getBindFileSystemNum() {
        return this.BindFileSystemNum;
    }

    /**
     * Set <p>Number of file systems bound to the cluster.</p>
     * @param BindFileSystemNum <p>Number of file systems bound to the cluster.</p>
     */
    public void setBindFileSystemNum(Long BindFileSystemNum) {
        this.BindFileSystemNum = BindFileSystemNum;
    }

    /**
     * Get <p>Binding list of the RSS cluster.</p> 
     * @return ClusterRelationInfoList <p>Binding list of the RSS cluster.</p>
     */
    public ClusterRelationMeta [] getClusterRelationInfoList() {
        return this.ClusterRelationInfoList;
    }

    /**
     * Set <p>Binding list of the RSS cluster.</p>
     * @param ClusterRelationInfoList <p>Binding list of the RSS cluster.</p>
     */
    public void setClusterRelationInfoList(ClusterRelationMeta [] ClusterRelationInfoList) {
        this.ClusterRelationInfoList = ClusterRelationInfoList;
    }

    /**
     * Get <p>Redis information.</p> 
     * @return RedisId <p>Redis information.</p>
     */
    public String getRedisId() {
        return this.RedisId;
    }

    /**
     * Set <p>Redis information.</p>
     * @param RedisId <p>Redis information.</p>
     */
    public void setRedisId(String RedisId) {
        this.RedisId = RedisId;
    }

    /**
     * Get <p>Whether IO fault self-healing is enabled.</p> 
     * @return IsIOHungSelfRecovery <p>Whether IO fault self-healing is enabled.</p>
     */
    public Boolean getIsIOHungSelfRecovery() {
        return this.IsIOHungSelfRecovery;
    }

    /**
     * Set <p>Whether IO fault self-healing is enabled.</p>
     * @param IsIOHungSelfRecovery <p>Whether IO fault self-healing is enabled.</p>
     */
    public void setIsIOHungSelfRecovery(Boolean IsIOHungSelfRecovery) {
        this.IsIOHungSelfRecovery = IsIOHungSelfRecovery;
    }

    /**
     * Get <p>Metadata information.</p> 
     * @return MetaDBGroupInfo <p>Metadata information.</p>
     */
    public CustomMetaDBInfo [] getMetaDBGroupInfo() {
        return this.MetaDBGroupInfo;
    }

    /**
     * Set <p>Metadata information.</p>
     * @param MetaDBGroupInfo <p>Metadata information.</p>
     */
    public void setMetaDBGroupInfo(CustomMetaDBInfo [] MetaDBGroupInfo) {
        this.MetaDBGroupInfo = MetaDBGroupInfo;
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
        if (source.IsIOHungSelfRecovery != null) {
            this.IsIOHungSelfRecovery = new Boolean(source.IsIOHungSelfRecovery);
        }
        if (source.MetaDBGroupInfo != null) {
            this.MetaDBGroupInfo = new CustomMetaDBInfo[source.MetaDBGroupInfo.length];
            for (int i = 0; i < source.MetaDBGroupInfo.length; i++) {
                this.MetaDBGroupInfo[i] = new CustomMetaDBInfo(source.MetaDBGroupInfo[i]);
            }
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
        this.setParamSimple(map, prefix + "IsIOHungSelfRecovery", this.IsIOHungSelfRecovery);
        this.setParamArrayObj(map, prefix + "MetaDBGroupInfo.", this.MetaDBGroupInfo);

    }
}

