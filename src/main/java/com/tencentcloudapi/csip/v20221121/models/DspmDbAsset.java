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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmDbAsset extends AbstractModel {

    /**
    * <p>Asset instance Id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Asset name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Account number</p>
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * <p>Public network access address. If there are multiple, separate them with ';'.</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>Intranet access address. If there are multiple, separate them with ';'</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>WAN domain address. If there are multiple, separate them with ';'</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>vpc ID of the vpc where the asset is located</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Name of the vpc where the asset is located</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>Subnet ID of the vpc subnet where the asset is located</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Subnet name of the vpc where the asset is located</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>Instance status</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Admin info.</p>
    */
    @SerializedName("Manager")
    @Expose
    private DspmUinUser [] Manager;

    /**
    * <p>Is the identity bound. 0: not bound; 1: bound</p>
    */
    @SerializedName("BindIdentify")
    @Expose
    private Long BindIdentify;

    /**
    * <p>Admin or not</p>
    */
    @SerializedName("IsManager")
    @Expose
    private Long IsManager;

    /**
    * <p>Risk statistics</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * <p>Security recommendation.<br>Resolve immediate problem-solving<br>Reinforcement<br>None no abnormality detected</p>
    */
    @SerializedName("SafetyAdvice")
    @Expose
    private String SafetyAdvice;

    /**
    * <p>Log delivery status.<br>0 - Delivery off. 1 - Delivery on. 2 - Delivery activating. 3 - Delivery closing.</p>
    */
    @SerializedName("LogDeliveryStatus")
    @Expose
    private Long LogDeliveryStatus;

    /**
    * <p>Whether log shipping is supported. 0: no support; 1: support</p>
    */
    @SerializedName("LogDeliverySupported")
    @Expose
    private Long LogDeliverySupported;

    /**
    * <p>Data scanning info</p>
    */
    @SerializedName("DataScanInfo")
    @Expose
    private DspmAssetDataScanDetail DataScanInfo;

    /**
    * <p>app id of the account to which the asset belongs</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Account nickname</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>Account uin of asset ownership</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Security analysis status (0-off, 1-on, 2-activating, 3-disabling)</p>
    */
    @SerializedName("SecurityAnalyseStatus")
    @Expose
    private Long SecurityAnalyseStatus;

    /**
    * <p>Total number of logs for the current instance.</p>
    */
    @SerializedName("TotalAuditLogs")
    @Expose
    private Long TotalAuditLogs;

    /**
    * <p>Reasons why log audit is forbidden. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p>
    */
    @SerializedName("LogDeliveryDisableReason")
    @Expose
    private String LogDeliveryDisableReason;

    /**
    * <p>Start timestamp of online log, accurate to second</p>
    */
    @SerializedName("OldestOnlineLogTimestamp")
    @Expose
    private Long OldestOnlineLogTimestamp;

    /**
    * <p>Latest timestamp of the online log, accurate to the second</p>
    */
    @SerializedName("NewestOnlineLogTimestamp")
    @Expose
    private Long NewestOnlineLogTimestamp;

    /**
    * <p>Operation error information</p>
    */
    @SerializedName("OperationErrorMsg")
    @Expose
    private String OperationErrorMsg;

    /**
    * <p>Whether account operations are supported. 0: not supported; 1: supported</p>
    */
    @SerializedName("AccountOptSupported")
    @Expose
    private Long AccountOptSupported;

    /**
    * <p>Instance type</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>Cluster type (MongoDB), consistent with ClusterType in the cloud API DescribeDBInstances: 0-replica set, 1-sharding; fixed as 0 for non-MongoDB assets</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * <p>Whether sensitive data identification is supported. 0: not supported; 1: supported</p>
    */
    @SerializedName("IdentifyScanSupported")
    @Expose
    private Long IdentifyScanSupported;

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
     * Get <p>Asset instance Id</p> 
     * @return AssetId <p>Asset instance Id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>Asset instance Id</p>
     * @param AssetId <p>Asset instance Id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>Asset type</p> 
     * @return AssetType <p>Asset type</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type</p>
     * @param AssetType <p>Asset type</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Asset name</p> 
     * @return Name <p>Asset name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Asset name</p>
     * @param Name <p>Asset name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Account number</p> 
     * @return AccountCount <p>Account number</p>
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set <p>Account number</p>
     * @param AccountCount <p>Account number</p>
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get <p>Public network access address. If there are multiple, separate them with ';'.</p> 
     * @return PublicIp <p>Public network access address. If there are multiple, separate them with ';'.</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Public network access address. If there are multiple, separate them with ';'.</p>
     * @param PublicIp <p>Public network access address. If there are multiple, separate them with ';'.</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>Intranet access address. If there are multiple, separate them with ';'</p> 
     * @return PrivateIp <p>Intranet access address. If there are multiple, separate them with ';'</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>Intranet access address. If there are multiple, separate them with ';'</p>
     * @param PrivateIp <p>Intranet access address. If there are multiple, separate them with ';'</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>WAN domain address. If there are multiple, separate them with ';'</p> 
     * @return WanDomain <p>WAN domain address. If there are multiple, separate them with ';'</p>
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set <p>WAN domain address. If there are multiple, separate them with ';'</p>
     * @param WanDomain <p>WAN domain address. If there are multiple, separate them with ';'</p>
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>vpc ID of the vpc where the asset is located</p> 
     * @return VpcId <p>vpc ID of the vpc where the asset is located</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc ID of the vpc where the asset is located</p>
     * @param VpcId <p>vpc ID of the vpc where the asset is located</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Name of the vpc where the asset is located</p> 
     * @return VpcName <p>Name of the vpc where the asset is located</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>Name of the vpc where the asset is located</p>
     * @param VpcName <p>Name of the vpc where the asset is located</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>Subnet ID of the vpc subnet where the asset is located</p> 
     * @return SubnetId <p>Subnet ID of the vpc subnet where the asset is located</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID of the vpc subnet where the asset is located</p>
     * @param SubnetId <p>Subnet ID of the vpc subnet where the asset is located</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Subnet name of the vpc where the asset is located</p> 
     * @return SubnetName <p>Subnet name of the vpc where the asset is located</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>Subnet name of the vpc where the asset is located</p>
     * @param SubnetName <p>Subnet name of the vpc where the asset is located</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>Instance status</p> 
     * @return Status <p>Instance status</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status</p>
     * @param Status <p>Instance status</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get <p>Admin info.</p> 
     * @return Manager <p>Admin info.</p>
     */
    public DspmUinUser [] getManager() {
        return this.Manager;
    }

    /**
     * Set <p>Admin info.</p>
     * @param Manager <p>Admin info.</p>
     */
    public void setManager(DspmUinUser [] Manager) {
        this.Manager = Manager;
    }

    /**
     * Get <p>Is the identity bound. 0: not bound; 1: bound</p> 
     * @return BindIdentify <p>Is the identity bound. 0: not bound; 1: bound</p>
     */
    public Long getBindIdentify() {
        return this.BindIdentify;
    }

    /**
     * Set <p>Is the identity bound. 0: not bound; 1: bound</p>
     * @param BindIdentify <p>Is the identity bound. 0: not bound; 1: bound</p>
     */
    public void setBindIdentify(Long BindIdentify) {
        this.BindIdentify = BindIdentify;
    }

    /**
     * Get <p>Admin or not</p> 
     * @return IsManager <p>Admin or not</p>
     */
    public Long getIsManager() {
        return this.IsManager;
    }

    /**
     * Set <p>Admin or not</p>
     * @param IsManager <p>Admin or not</p>
     */
    public void setIsManager(Long IsManager) {
        this.IsManager = IsManager;
    }

    /**
     * Get <p>Risk statistics</p> 
     * @return RiskCount <p>Risk statistics</p>
     */
    public DspmRiskCount getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>Risk statistics</p>
     * @param RiskCount <p>Risk statistics</p>
     */
    public void setRiskCount(DspmRiskCount RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>Security recommendation.<br>Resolve immediate problem-solving<br>Reinforcement<br>None no abnormality detected</p> 
     * @return SafetyAdvice <p>Security recommendation.<br>Resolve immediate problem-solving<br>Reinforcement<br>None no abnormality detected</p>
     */
    public String getSafetyAdvice() {
        return this.SafetyAdvice;
    }

    /**
     * Set <p>Security recommendation.<br>Resolve immediate problem-solving<br>Reinforcement<br>None no abnormality detected</p>
     * @param SafetyAdvice <p>Security recommendation.<br>Resolve immediate problem-solving<br>Reinforcement<br>None no abnormality detected</p>
     */
    public void setSafetyAdvice(String SafetyAdvice) {
        this.SafetyAdvice = SafetyAdvice;
    }

    /**
     * Get <p>Log delivery status.<br>0 - Delivery off. 1 - Delivery on. 2 - Delivery activating. 3 - Delivery closing.</p> 
     * @return LogDeliveryStatus <p>Log delivery status.<br>0 - Delivery off. 1 - Delivery on. 2 - Delivery activating. 3 - Delivery closing.</p>
     */
    public Long getLogDeliveryStatus() {
        return this.LogDeliveryStatus;
    }

    /**
     * Set <p>Log delivery status.<br>0 - Delivery off. 1 - Delivery on. 2 - Delivery activating. 3 - Delivery closing.</p>
     * @param LogDeliveryStatus <p>Log delivery status.<br>0 - Delivery off. 1 - Delivery on. 2 - Delivery activating. 3 - Delivery closing.</p>
     */
    public void setLogDeliveryStatus(Long LogDeliveryStatus) {
        this.LogDeliveryStatus = LogDeliveryStatus;
    }

    /**
     * Get <p>Whether log shipping is supported. 0: no support; 1: support</p> 
     * @return LogDeliverySupported <p>Whether log shipping is supported. 0: no support; 1: support</p>
     */
    public Long getLogDeliverySupported() {
        return this.LogDeliverySupported;
    }

    /**
     * Set <p>Whether log shipping is supported. 0: no support; 1: support</p>
     * @param LogDeliverySupported <p>Whether log shipping is supported. 0: no support; 1: support</p>
     */
    public void setLogDeliverySupported(Long LogDeliverySupported) {
        this.LogDeliverySupported = LogDeliverySupported;
    }

    /**
     * Get <p>Data scanning info</p> 
     * @return DataScanInfo <p>Data scanning info</p>
     */
    public DspmAssetDataScanDetail getDataScanInfo() {
        return this.DataScanInfo;
    }

    /**
     * Set <p>Data scanning info</p>
     * @param DataScanInfo <p>Data scanning info</p>
     */
    public void setDataScanInfo(DspmAssetDataScanDetail DataScanInfo) {
        this.DataScanInfo = DataScanInfo;
    }

    /**
     * Get <p>app id of the account to which the asset belongs</p> 
     * @return AppId <p>app id of the account to which the asset belongs</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>app id of the account to which the asset belongs</p>
     * @param AppId <p>app id of the account to which the asset belongs</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Account nickname</p> 
     * @return NickName <p>Account nickname</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Account nickname</p>
     * @param NickName <p>Account nickname</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>Account uin of asset ownership</p> 
     * @return Uin <p>Account uin of asset ownership</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Account uin of asset ownership</p>
     * @param Uin <p>Account uin of asset ownership</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Security analysis status (0-off, 1-on, 2-activating, 3-disabling)</p> 
     * @return SecurityAnalyseStatus <p>Security analysis status (0-off, 1-on, 2-activating, 3-disabling)</p>
     */
    public Long getSecurityAnalyseStatus() {
        return this.SecurityAnalyseStatus;
    }

    /**
     * Set <p>Security analysis status (0-off, 1-on, 2-activating, 3-disabling)</p>
     * @param SecurityAnalyseStatus <p>Security analysis status (0-off, 1-on, 2-activating, 3-disabling)</p>
     */
    public void setSecurityAnalyseStatus(Long SecurityAnalyseStatus) {
        this.SecurityAnalyseStatus = SecurityAnalyseStatus;
    }

    /**
     * Get <p>Total number of logs for the current instance.</p> 
     * @return TotalAuditLogs <p>Total number of logs for the current instance.</p>
     */
    public Long getTotalAuditLogs() {
        return this.TotalAuditLogs;
    }

    /**
     * Set <p>Total number of logs for the current instance.</p>
     * @param TotalAuditLogs <p>Total number of logs for the current instance.</p>
     */
    public void setTotalAuditLogs(Long TotalAuditLogs) {
        this.TotalAuditLogs = TotalAuditLogs;
    }

    /**
     * Get <p>Reasons why log audit is forbidden. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p> 
     * @return LogDeliveryDisableReason <p>Reasons why log audit is forbidden. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p>
     */
    public String getLogDeliveryDisableReason() {
        return this.LogDeliveryDisableReason;
    }

    /**
     * Set <p>Reasons why log audit is forbidden. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p>
     * @param LogDeliveryDisableReason <p>Reasons why log audit is forbidden. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p>
     */
    public void setLogDeliveryDisableReason(String LogDeliveryDisableReason) {
        this.LogDeliveryDisableReason = LogDeliveryDisableReason;
    }

    /**
     * Get <p>Start timestamp of online log, accurate to second</p> 
     * @return OldestOnlineLogTimestamp <p>Start timestamp of online log, accurate to second</p>
     */
    public Long getOldestOnlineLogTimestamp() {
        return this.OldestOnlineLogTimestamp;
    }

    /**
     * Set <p>Start timestamp of online log, accurate to second</p>
     * @param OldestOnlineLogTimestamp <p>Start timestamp of online log, accurate to second</p>
     */
    public void setOldestOnlineLogTimestamp(Long OldestOnlineLogTimestamp) {
        this.OldestOnlineLogTimestamp = OldestOnlineLogTimestamp;
    }

    /**
     * Get <p>Latest timestamp of the online log, accurate to the second</p> 
     * @return NewestOnlineLogTimestamp <p>Latest timestamp of the online log, accurate to the second</p>
     */
    public Long getNewestOnlineLogTimestamp() {
        return this.NewestOnlineLogTimestamp;
    }

    /**
     * Set <p>Latest timestamp of the online log, accurate to the second</p>
     * @param NewestOnlineLogTimestamp <p>Latest timestamp of the online log, accurate to the second</p>
     */
    public void setNewestOnlineLogTimestamp(Long NewestOnlineLogTimestamp) {
        this.NewestOnlineLogTimestamp = NewestOnlineLogTimestamp;
    }

    /**
     * Get <p>Operation error information</p> 
     * @return OperationErrorMsg <p>Operation error information</p>
     */
    public String getOperationErrorMsg() {
        return this.OperationErrorMsg;
    }

    /**
     * Set <p>Operation error information</p>
     * @param OperationErrorMsg <p>Operation error information</p>
     */
    public void setOperationErrorMsg(String OperationErrorMsg) {
        this.OperationErrorMsg = OperationErrorMsg;
    }

    /**
     * Get <p>Whether account operations are supported. 0: not supported; 1: supported</p> 
     * @return AccountOptSupported <p>Whether account operations are supported. 0: not supported; 1: supported</p>
     */
    public Long getAccountOptSupported() {
        return this.AccountOptSupported;
    }

    /**
     * Set <p>Whether account operations are supported. 0: not supported; 1: supported</p>
     * @param AccountOptSupported <p>Whether account operations are supported. 0: not supported; 1: supported</p>
     */
    public void setAccountOptSupported(Long AccountOptSupported) {
        this.AccountOptSupported = AccountOptSupported;
    }

    /**
     * Get <p>Instance type</p> 
     * @return InstanceType <p>Instance type</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type</p>
     * @param InstanceType <p>Instance type</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Cluster type (MongoDB), consistent with ClusterType in the cloud API DescribeDBInstances: 0-replica set, 1-sharding; fixed as 0 for non-MongoDB assets</p> 
     * @return ClusterType <p>Cluster type (MongoDB), consistent with ClusterType in the cloud API DescribeDBInstances: 0-replica set, 1-sharding; fixed as 0 for non-MongoDB assets</p>
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>Cluster type (MongoDB), consistent with ClusterType in the cloud API DescribeDBInstances: 0-replica set, 1-sharding; fixed as 0 for non-MongoDB assets</p>
     * @param ClusterType <p>Cluster type (MongoDB), consistent with ClusterType in the cloud API DescribeDBInstances: 0-replica set, 1-sharding; fixed as 0 for non-MongoDB assets</p>
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>Whether sensitive data identification is supported. 0: not supported; 1: supported</p> 
     * @return IdentifyScanSupported <p>Whether sensitive data identification is supported. 0: not supported; 1: supported</p>
     */
    public Long getIdentifyScanSupported() {
        return this.IdentifyScanSupported;
    }

    /**
     * Set <p>Whether sensitive data identification is supported. 0: not supported; 1: supported</p>
     * @param IdentifyScanSupported <p>Whether sensitive data identification is supported. 0: not supported; 1: supported</p>
     */
    public void setIdentifyScanSupported(Long IdentifyScanSupported) {
        this.IdentifyScanSupported = IdentifyScanSupported;
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

    public DspmDbAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmDbAsset(DspmDbAsset source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AccountCount != null) {
            this.AccountCount = new Long(source.AccountCount);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Manager != null) {
            this.Manager = new DspmUinUser[source.Manager.length];
            for (int i = 0; i < source.Manager.length; i++) {
                this.Manager[i] = new DspmUinUser(source.Manager[i]);
            }
        }
        if (source.BindIdentify != null) {
            this.BindIdentify = new Long(source.BindIdentify);
        }
        if (source.IsManager != null) {
            this.IsManager = new Long(source.IsManager);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new DspmRiskCount(source.RiskCount);
        }
        if (source.SafetyAdvice != null) {
            this.SafetyAdvice = new String(source.SafetyAdvice);
        }
        if (source.LogDeliveryStatus != null) {
            this.LogDeliveryStatus = new Long(source.LogDeliveryStatus);
        }
        if (source.LogDeliverySupported != null) {
            this.LogDeliverySupported = new Long(source.LogDeliverySupported);
        }
        if (source.DataScanInfo != null) {
            this.DataScanInfo = new DspmAssetDataScanDetail(source.DataScanInfo);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SecurityAnalyseStatus != null) {
            this.SecurityAnalyseStatus = new Long(source.SecurityAnalyseStatus);
        }
        if (source.TotalAuditLogs != null) {
            this.TotalAuditLogs = new Long(source.TotalAuditLogs);
        }
        if (source.LogDeliveryDisableReason != null) {
            this.LogDeliveryDisableReason = new String(source.LogDeliveryDisableReason);
        }
        if (source.OldestOnlineLogTimestamp != null) {
            this.OldestOnlineLogTimestamp = new Long(source.OldestOnlineLogTimestamp);
        }
        if (source.NewestOnlineLogTimestamp != null) {
            this.NewestOnlineLogTimestamp = new Long(source.NewestOnlineLogTimestamp);
        }
        if (source.OperationErrorMsg != null) {
            this.OperationErrorMsg = new String(source.OperationErrorMsg);
        }
        if (source.AccountOptSupported != null) {
            this.AccountOptSupported = new Long(source.AccountOptSupported);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.IdentifyScanSupported != null) {
            this.IdentifyScanSupported = new Long(source.IdentifyScanSupported);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Manager.", this.Manager);
        this.setParamSimple(map, prefix + "BindIdentify", this.BindIdentify);
        this.setParamSimple(map, prefix + "IsManager", this.IsManager);
        this.setParamObj(map, prefix + "RiskCount.", this.RiskCount);
        this.setParamSimple(map, prefix + "SafetyAdvice", this.SafetyAdvice);
        this.setParamSimple(map, prefix + "LogDeliveryStatus", this.LogDeliveryStatus);
        this.setParamSimple(map, prefix + "LogDeliverySupported", this.LogDeliverySupported);
        this.setParamObj(map, prefix + "DataScanInfo.", this.DataScanInfo);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SecurityAnalyseStatus", this.SecurityAnalyseStatus);
        this.setParamSimple(map, prefix + "TotalAuditLogs", this.TotalAuditLogs);
        this.setParamSimple(map, prefix + "LogDeliveryDisableReason", this.LogDeliveryDisableReason);
        this.setParamSimple(map, prefix + "OldestOnlineLogTimestamp", this.OldestOnlineLogTimestamp);
        this.setParamSimple(map, prefix + "NewestOnlineLogTimestamp", this.NewestOnlineLogTimestamp);
        this.setParamSimple(map, prefix + "OperationErrorMsg", this.OperationErrorMsg);
        this.setParamSimple(map, prefix + "AccountOptSupported", this.AccountOptSupported);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "IdentifyScanSupported", this.IdentifyScanSupported);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

