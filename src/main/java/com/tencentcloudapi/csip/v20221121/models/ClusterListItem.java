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

public class ClusterListItem extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Asset id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

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
    * <p>Cluster type<br>MANAGED_CLUSTER: managed cluster</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>Number of critical alarm events</p>
    */
    @SerializedName("AlarmEventCriticalCount")
    @Expose
    private Long AlarmEventCriticalCount;

    /**
    * <p>Number of high-risk alarm events</p>
    */
    @SerializedName("AlarmEventHighCount")
    @Expose
    private Long AlarmEventHighCount;

    /**
    * <p>Number of medium-risk alarm events</p>
    */
    @SerializedName("AlarmEventMiddleCount")
    @Expose
    private Long AlarmEventMiddleCount;

    /**
    * <p>Number of low-risk alarm events</p>
    */
    @SerializedName("AlarmEventLowCount")
    @Expose
    private Long AlarmEventLowCount;

    /**
    * <p>Number of critical risk events</p>
    */
    @SerializedName("RiskEventCriticalCount")
    @Expose
    private Long RiskEventCriticalCount;

    /**
    * <p>Number of high-severity risk events</p>
    */
    @SerializedName("RiskEventHighCount")
    @Expose
    private Long RiskEventHighCount;

    /**
    * <p>Number of medium-risk events</p>
    */
    @SerializedName("RiskEventMiddleCount")
    @Expose
    private Long RiskEventMiddleCount;

    /**
    * <p>Number of low-risk events</p>
    */
    @SerializedName("RiskEventLowCount")
    @Expose
    private Long RiskEventLowCount;

    /**
    * <p>Total nodes</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>Total number of offline nodes</p>
    */
    @SerializedName("OfflineNodeCount")
    @Expose
    private Long OfflineNodeCount;

    /**
    * <p>Total number of nodes not installed</p>
    */
    @SerializedName("UninstallNodeCount")
    @Expose
    private Long UninstallNodeCount;

    /**
    * <p>Total cores.</p>
    */
    @SerializedName("TotalCoresCount")
    @Expose
    private Long TotalCoresCount;

    /**
    * <p>Number of protected cores</p>
    */
    @SerializedName("DefendCoresCount")
    @Expose
    private Long DefendCoresCount;

    /**
    * <p>Audit log switch<br>(0: off; 1: on; 2: activation fail; 3: failed to close)</p>
    */
    @SerializedName("AuditLogSwitchStatus")
    @Expose
    private Long AuditLogSwitchStatus;

    /**
    * <p>Protection status<br>Defended: Defended</p>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>Cluster status</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>K8s version.</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Most recent asset synchronization time</p>
    */
    @SerializedName("LastAssetSyncTime")
    @Expose
    private String LastAssetSyncTime;

    /**
    * <p>Last risk check time</p>
    */
    @SerializedName("LastRiskCheckTime")
    @Expose
    private String LastRiskCheckTime;

    /**
    * <p>Risk status</p>
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * <p>Tag list.</p>
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
    * <p>Owner name</p>
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * <p>Failure reason</p>
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * <p>Operating sub-status</p>
    */
    @SerializedName("RunSubStatus")
    @Expose
    private String RunSubStatus;

    /**
    * <p>Cluster access status</p><p>Enumeration values:</p><ul><li>AccessedNone: not connected</li><li>AccessedInstalling: connecting</li><li>AccessedInstalled: connected - unprotected</li><li>AccessedUninstalling: uninstalling</li><li>AccessedUninstallException: uninstallation exception</li><li>AccessedDefended: connected - defended</li><li>AccessedPartialDefence: connected - partially defended</li><li>AccessedException: access exception</li></ul>
    */
    @SerializedName("AccessedStatus")
    @Expose
    private String AccessedStatus;

    /**
    * <p>Integration sub-status</p>
    */
    @SerializedName("AccessedSubStatus")
    @Expose
    private String AccessedSubStatus;

    /**
    * <p>Cluster ca certificate md5 value, unique cluster id</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>Asset synchronization status</p><p>Enumeration values:</p><ul><li>AssetCheckNone: initial state</li><li>AssetCheckSync: synchronizing</li><li>AssetCheckFinished: synchronization complete</li><li>AssetCheckFailed: synchronization failed</li></ul>
    */
    @SerializedName("AssetSyncStatus")
    @Expose
    private String AssetSyncStatus;

    /**
    * <p>Number of cluster configuration risks</p>
    */
    @SerializedName("RiskConfigCount")
    @Expose
    private Long RiskConfigCount;

    /**
    * <p>Cluster access failure reason</p>
    */
    @SerializedName("AccessFailedMessage")
    @Expose
    private String AccessFailedMessage;

    /**
    * <p>Region Chinese Name</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>Region English name</p>
    */
    @SerializedName("RegionNameEn")
    @Expose
    private String RegionNameEn;

    /**
    * <p>Number of nodes not bound to the Ultimate Edition</p>
    */
    @SerializedName("UnboundUltimateNodeCount")
    @Expose
    private Long UnboundUltimateNodeCount;

    /**
     * Get <p>appid</p> 
     * @return AppID <p>appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>appid</p>
     * @param AppID <p>appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Asset id</p> 
     * @return AssetId <p>Asset id</p>
     * @deprecated
     */
    @Deprecated
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>Asset id</p>
     * @param AssetId <p>Asset id</p>
     * @deprecated
     */
    @Deprecated
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
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

    /**
     * Get <p>Cluster type<br>MANAGED_CLUSTER: managed cluster</p> 
     * @return ClusterType <p>Cluster type<br>MANAGED_CLUSTER: managed cluster</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>Cluster type<br>MANAGED_CLUSTER: managed cluster</p>
     * @param ClusterType <p>Cluster type<br>MANAGED_CLUSTER: managed cluster</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>Number of critical alarm events</p> 
     * @return AlarmEventCriticalCount <p>Number of critical alarm events</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventCriticalCount() {
        return this.AlarmEventCriticalCount;
    }

    /**
     * Set <p>Number of critical alarm events</p>
     * @param AlarmEventCriticalCount <p>Number of critical alarm events</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventCriticalCount(Long AlarmEventCriticalCount) {
        this.AlarmEventCriticalCount = AlarmEventCriticalCount;
    }

    /**
     * Get <p>Number of high-risk alarm events</p> 
     * @return AlarmEventHighCount <p>Number of high-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventHighCount() {
        return this.AlarmEventHighCount;
    }

    /**
     * Set <p>Number of high-risk alarm events</p>
     * @param AlarmEventHighCount <p>Number of high-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventHighCount(Long AlarmEventHighCount) {
        this.AlarmEventHighCount = AlarmEventHighCount;
    }

    /**
     * Get <p>Number of medium-risk alarm events</p> 
     * @return AlarmEventMiddleCount <p>Number of medium-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventMiddleCount() {
        return this.AlarmEventMiddleCount;
    }

    /**
     * Set <p>Number of medium-risk alarm events</p>
     * @param AlarmEventMiddleCount <p>Number of medium-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventMiddleCount(Long AlarmEventMiddleCount) {
        this.AlarmEventMiddleCount = AlarmEventMiddleCount;
    }

    /**
     * Get <p>Number of low-risk alarm events</p> 
     * @return AlarmEventLowCount <p>Number of low-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventLowCount() {
        return this.AlarmEventLowCount;
    }

    /**
     * Set <p>Number of low-risk alarm events</p>
     * @param AlarmEventLowCount <p>Number of low-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventLowCount(Long AlarmEventLowCount) {
        this.AlarmEventLowCount = AlarmEventLowCount;
    }

    /**
     * Get <p>Number of critical risk events</p> 
     * @return RiskEventCriticalCount <p>Number of critical risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventCriticalCount() {
        return this.RiskEventCriticalCount;
    }

    /**
     * Set <p>Number of critical risk events</p>
     * @param RiskEventCriticalCount <p>Number of critical risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventCriticalCount(Long RiskEventCriticalCount) {
        this.RiskEventCriticalCount = RiskEventCriticalCount;
    }

    /**
     * Get <p>Number of high-severity risk events</p> 
     * @return RiskEventHighCount <p>Number of high-severity risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventHighCount() {
        return this.RiskEventHighCount;
    }

    /**
     * Set <p>Number of high-severity risk events</p>
     * @param RiskEventHighCount <p>Number of high-severity risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventHighCount(Long RiskEventHighCount) {
        this.RiskEventHighCount = RiskEventHighCount;
    }

    /**
     * Get <p>Number of medium-risk events</p> 
     * @return RiskEventMiddleCount <p>Number of medium-risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventMiddleCount() {
        return this.RiskEventMiddleCount;
    }

    /**
     * Set <p>Number of medium-risk events</p>
     * @param RiskEventMiddleCount <p>Number of medium-risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventMiddleCount(Long RiskEventMiddleCount) {
        this.RiskEventMiddleCount = RiskEventMiddleCount;
    }

    /**
     * Get <p>Number of low-risk events</p> 
     * @return RiskEventLowCount <p>Number of low-risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventLowCount() {
        return this.RiskEventLowCount;
    }

    /**
     * Set <p>Number of low-risk events</p>
     * @param RiskEventLowCount <p>Number of low-risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventLowCount(Long RiskEventLowCount) {
        this.RiskEventLowCount = RiskEventLowCount;
    }

    /**
     * Get <p>Total nodes</p> 
     * @return NodeCount <p>Total nodes</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>Total nodes</p>
     * @param NodeCount <p>Total nodes</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>Total number of offline nodes</p> 
     * @return OfflineNodeCount <p>Total number of offline nodes</p>
     */
    public Long getOfflineNodeCount() {
        return this.OfflineNodeCount;
    }

    /**
     * Set <p>Total number of offline nodes</p>
     * @param OfflineNodeCount <p>Total number of offline nodes</p>
     */
    public void setOfflineNodeCount(Long OfflineNodeCount) {
        this.OfflineNodeCount = OfflineNodeCount;
    }

    /**
     * Get <p>Total number of nodes not installed</p> 
     * @return UninstallNodeCount <p>Total number of nodes not installed</p>
     */
    public Long getUninstallNodeCount() {
        return this.UninstallNodeCount;
    }

    /**
     * Set <p>Total number of nodes not installed</p>
     * @param UninstallNodeCount <p>Total number of nodes not installed</p>
     */
    public void setUninstallNodeCount(Long UninstallNodeCount) {
        this.UninstallNodeCount = UninstallNodeCount;
    }

    /**
     * Get <p>Total cores.</p> 
     * @return TotalCoresCount <p>Total cores.</p>
     */
    public Long getTotalCoresCount() {
        return this.TotalCoresCount;
    }

    /**
     * Set <p>Total cores.</p>
     * @param TotalCoresCount <p>Total cores.</p>
     */
    public void setTotalCoresCount(Long TotalCoresCount) {
        this.TotalCoresCount = TotalCoresCount;
    }

    /**
     * Get <p>Number of protected cores</p> 
     * @return DefendCoresCount <p>Number of protected cores</p>
     * @deprecated
     */
    @Deprecated
    public Long getDefendCoresCount() {
        return this.DefendCoresCount;
    }

    /**
     * Set <p>Number of protected cores</p>
     * @param DefendCoresCount <p>Number of protected cores</p>
     * @deprecated
     */
    @Deprecated
    public void setDefendCoresCount(Long DefendCoresCount) {
        this.DefendCoresCount = DefendCoresCount;
    }

    /**
     * Get <p>Audit log switch<br>(0: off; 1: on; 2: activation fail; 3: failed to close)</p> 
     * @return AuditLogSwitchStatus <p>Audit log switch<br>(0: off; 1: on; 2: activation fail; 3: failed to close)</p>
     */
    public Long getAuditLogSwitchStatus() {
        return this.AuditLogSwitchStatus;
    }

    /**
     * Set <p>Audit log switch<br>(0: off; 1: on; 2: activation fail; 3: failed to close)</p>
     * @param AuditLogSwitchStatus <p>Audit log switch<br>(0: off; 1: on; 2: activation fail; 3: failed to close)</p>
     */
    public void setAuditLogSwitchStatus(Long AuditLogSwitchStatus) {
        this.AuditLogSwitchStatus = AuditLogSwitchStatus;
    }

    /**
     * Get <p>Protection status<br>Defended: Defended</p> 
     * @return DefendStatus <p>Protection status<br>Defended: Defended</p>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>Protection status<br>Defended: Defended</p>
     * @param DefendStatus <p>Protection status<br>Defended: Defended</p>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>Cluster status</p> 
     * @return RunStatus <p>Cluster status</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>Cluster status</p>
     * @param RunStatus <p>Cluster status</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
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
     * Get <p>K8s version.</p> 
     * @return Version <p>K8s version.</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>K8s version.</p>
     * @param Version <p>K8s version.</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Most recent asset synchronization time</p> 
     * @return LastAssetSyncTime <p>Most recent asset synchronization time</p>
     */
    public String getLastAssetSyncTime() {
        return this.LastAssetSyncTime;
    }

    /**
     * Set <p>Most recent asset synchronization time</p>
     * @param LastAssetSyncTime <p>Most recent asset synchronization time</p>
     */
    public void setLastAssetSyncTime(String LastAssetSyncTime) {
        this.LastAssetSyncTime = LastAssetSyncTime;
    }

    /**
     * Get <p>Last risk check time</p> 
     * @return LastRiskCheckTime <p>Last risk check time</p>
     */
    public String getLastRiskCheckTime() {
        return this.LastRiskCheckTime;
    }

    /**
     * Set <p>Last risk check time</p>
     * @param LastRiskCheckTime <p>Last risk check time</p>
     */
    public void setLastRiskCheckTime(String LastRiskCheckTime) {
        this.LastRiskCheckTime = LastRiskCheckTime;
    }

    /**
     * Get <p>Risk status</p> 
     * @return RiskStatus <p>Risk status</p>
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set <p>Risk status</p>
     * @param RiskStatus <p>Risk status</p>
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get <p>Tag list.</p> 
     * @return Tags <p>Tag list.</p>
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag list.</p>
     * @param Tags <p>Tag list.</p>
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Owner name</p> 
     * @return OwnerName <p>Owner name</p>
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set <p>Owner name</p>
     * @param OwnerName <p>Owner name</p>
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get <p>Failure reason</p> 
     * @return FailMessage <p>Failure reason</p>
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set <p>Failure reason</p>
     * @param FailMessage <p>Failure reason</p>
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get <p>Operating sub-status</p> 
     * @return RunSubStatus <p>Operating sub-status</p>
     */
    public String getRunSubStatus() {
        return this.RunSubStatus;
    }

    /**
     * Set <p>Operating sub-status</p>
     * @param RunSubStatus <p>Operating sub-status</p>
     */
    public void setRunSubStatus(String RunSubStatus) {
        this.RunSubStatus = RunSubStatus;
    }

    /**
     * Get <p>Cluster access status</p><p>Enumeration values:</p><ul><li>AccessedNone: not connected</li><li>AccessedInstalling: connecting</li><li>AccessedInstalled: connected - unprotected</li><li>AccessedUninstalling: uninstalling</li><li>AccessedUninstallException: uninstallation exception</li><li>AccessedDefended: connected - defended</li><li>AccessedPartialDefence: connected - partially defended</li><li>AccessedException: access exception</li></ul> 
     * @return AccessedStatus <p>Cluster access status</p><p>Enumeration values:</p><ul><li>AccessedNone: not connected</li><li>AccessedInstalling: connecting</li><li>AccessedInstalled: connected - unprotected</li><li>AccessedUninstalling: uninstalling</li><li>AccessedUninstallException: uninstallation exception</li><li>AccessedDefended: connected - defended</li><li>AccessedPartialDefence: connected - partially defended</li><li>AccessedException: access exception</li></ul>
     */
    public String getAccessedStatus() {
        return this.AccessedStatus;
    }

    /**
     * Set <p>Cluster access status</p><p>Enumeration values:</p><ul><li>AccessedNone: not connected</li><li>AccessedInstalling: connecting</li><li>AccessedInstalled: connected - unprotected</li><li>AccessedUninstalling: uninstalling</li><li>AccessedUninstallException: uninstallation exception</li><li>AccessedDefended: connected - defended</li><li>AccessedPartialDefence: connected - partially defended</li><li>AccessedException: access exception</li></ul>
     * @param AccessedStatus <p>Cluster access status</p><p>Enumeration values:</p><ul><li>AccessedNone: not connected</li><li>AccessedInstalling: connecting</li><li>AccessedInstalled: connected - unprotected</li><li>AccessedUninstalling: uninstalling</li><li>AccessedUninstallException: uninstallation exception</li><li>AccessedDefended: connected - defended</li><li>AccessedPartialDefence: connected - partially defended</li><li>AccessedException: access exception</li></ul>
     */
    public void setAccessedStatus(String AccessedStatus) {
        this.AccessedStatus = AccessedStatus;
    }

    /**
     * Get <p>Integration sub-status</p> 
     * @return AccessedSubStatus <p>Integration sub-status</p>
     */
    public String getAccessedSubStatus() {
        return this.AccessedSubStatus;
    }

    /**
     * Set <p>Integration sub-status</p>
     * @param AccessedSubStatus <p>Integration sub-status</p>
     */
    public void setAccessedSubStatus(String AccessedSubStatus) {
        this.AccessedSubStatus = AccessedSubStatus;
    }

    /**
     * Get <p>Cluster ca certificate md5 value, unique cluster id</p> 
     * @return ClusterCaMD5 <p>Cluster ca certificate md5 value, unique cluster id</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>Cluster ca certificate md5 value, unique cluster id</p>
     * @param ClusterCaMD5 <p>Cluster ca certificate md5 value, unique cluster id</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>Asset synchronization status</p><p>Enumeration values:</p><ul><li>AssetCheckNone: initial state</li><li>AssetCheckSync: synchronizing</li><li>AssetCheckFinished: synchronization complete</li><li>AssetCheckFailed: synchronization failed</li></ul> 
     * @return AssetSyncStatus <p>Asset synchronization status</p><p>Enumeration values:</p><ul><li>AssetCheckNone: initial state</li><li>AssetCheckSync: synchronizing</li><li>AssetCheckFinished: synchronization complete</li><li>AssetCheckFailed: synchronization failed</li></ul>
     */
    public String getAssetSyncStatus() {
        return this.AssetSyncStatus;
    }

    /**
     * Set <p>Asset synchronization status</p><p>Enumeration values:</p><ul><li>AssetCheckNone: initial state</li><li>AssetCheckSync: synchronizing</li><li>AssetCheckFinished: synchronization complete</li><li>AssetCheckFailed: synchronization failed</li></ul>
     * @param AssetSyncStatus <p>Asset synchronization status</p><p>Enumeration values:</p><ul><li>AssetCheckNone: initial state</li><li>AssetCheckSync: synchronizing</li><li>AssetCheckFinished: synchronization complete</li><li>AssetCheckFailed: synchronization failed</li></ul>
     */
    public void setAssetSyncStatus(String AssetSyncStatus) {
        this.AssetSyncStatus = AssetSyncStatus;
    }

    /**
     * Get <p>Number of cluster configuration risks</p> 
     * @return RiskConfigCount <p>Number of cluster configuration risks</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskConfigCount() {
        return this.RiskConfigCount;
    }

    /**
     * Set <p>Number of cluster configuration risks</p>
     * @param RiskConfigCount <p>Number of cluster configuration risks</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskConfigCount(Long RiskConfigCount) {
        this.RiskConfigCount = RiskConfigCount;
    }

    /**
     * Get <p>Cluster access failure reason</p> 
     * @return AccessFailedMessage <p>Cluster access failure reason</p>
     * @deprecated
     */
    @Deprecated
    public String getAccessFailedMessage() {
        return this.AccessFailedMessage;
    }

    /**
     * Set <p>Cluster access failure reason</p>
     * @param AccessFailedMessage <p>Cluster access failure reason</p>
     * @deprecated
     */
    @Deprecated
    public void setAccessFailedMessage(String AccessFailedMessage) {
        this.AccessFailedMessage = AccessFailedMessage;
    }

    /**
     * Get <p>Region Chinese Name</p> 
     * @return RegionName <p>Region Chinese Name</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>Region Chinese Name</p>
     * @param RegionName <p>Region Chinese Name</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>Region English name</p> 
     * @return RegionNameEn <p>Region English name</p>
     */
    public String getRegionNameEn() {
        return this.RegionNameEn;
    }

    /**
     * Set <p>Region English name</p>
     * @param RegionNameEn <p>Region English name</p>
     */
    public void setRegionNameEn(String RegionNameEn) {
        this.RegionNameEn = RegionNameEn;
    }

    /**
     * Get <p>Number of nodes not bound to the Ultimate Edition</p> 
     * @return UnboundUltimateNodeCount <p>Number of nodes not bound to the Ultimate Edition</p>
     */
    public Long getUnboundUltimateNodeCount() {
        return this.UnboundUltimateNodeCount;
    }

    /**
     * Set <p>Number of nodes not bound to the Ultimate Edition</p>
     * @param UnboundUltimateNodeCount <p>Number of nodes not bound to the Ultimate Edition</p>
     */
    public void setUnboundUltimateNodeCount(Long UnboundUltimateNodeCount) {
        this.UnboundUltimateNodeCount = UnboundUltimateNodeCount;
    }

    public ClusterListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterListItem(ClusterListItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.AlarmEventCriticalCount != null) {
            this.AlarmEventCriticalCount = new Long(source.AlarmEventCriticalCount);
        }
        if (source.AlarmEventHighCount != null) {
            this.AlarmEventHighCount = new Long(source.AlarmEventHighCount);
        }
        if (source.AlarmEventMiddleCount != null) {
            this.AlarmEventMiddleCount = new Long(source.AlarmEventMiddleCount);
        }
        if (source.AlarmEventLowCount != null) {
            this.AlarmEventLowCount = new Long(source.AlarmEventLowCount);
        }
        if (source.RiskEventCriticalCount != null) {
            this.RiskEventCriticalCount = new Long(source.RiskEventCriticalCount);
        }
        if (source.RiskEventHighCount != null) {
            this.RiskEventHighCount = new Long(source.RiskEventHighCount);
        }
        if (source.RiskEventMiddleCount != null) {
            this.RiskEventMiddleCount = new Long(source.RiskEventMiddleCount);
        }
        if (source.RiskEventLowCount != null) {
            this.RiskEventLowCount = new Long(source.RiskEventLowCount);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.OfflineNodeCount != null) {
            this.OfflineNodeCount = new Long(source.OfflineNodeCount);
        }
        if (source.UninstallNodeCount != null) {
            this.UninstallNodeCount = new Long(source.UninstallNodeCount);
        }
        if (source.TotalCoresCount != null) {
            this.TotalCoresCount = new Long(source.TotalCoresCount);
        }
        if (source.DefendCoresCount != null) {
            this.DefendCoresCount = new Long(source.DefendCoresCount);
        }
        if (source.AuditLogSwitchStatus != null) {
            this.AuditLogSwitchStatus = new Long(source.AuditLogSwitchStatus);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LastAssetSyncTime != null) {
            this.LastAssetSyncTime = new String(source.LastAssetSyncTime);
        }
        if (source.LastRiskCheckTime != null) {
            this.LastRiskCheckTime = new String(source.LastRiskCheckTime);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTag(source.Tags[i]);
            }
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.RunSubStatus != null) {
            this.RunSubStatus = new String(source.RunSubStatus);
        }
        if (source.AccessedStatus != null) {
            this.AccessedStatus = new String(source.AccessedStatus);
        }
        if (source.AccessedSubStatus != null) {
            this.AccessedSubStatus = new String(source.AccessedSubStatus);
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.AssetSyncStatus != null) {
            this.AssetSyncStatus = new String(source.AssetSyncStatus);
        }
        if (source.RiskConfigCount != null) {
            this.RiskConfigCount = new Long(source.RiskConfigCount);
        }
        if (source.AccessFailedMessage != null) {
            this.AccessFailedMessage = new String(source.AccessFailedMessage);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionNameEn != null) {
            this.RegionNameEn = new String(source.RegionNameEn);
        }
        if (source.UnboundUltimateNodeCount != null) {
            this.UnboundUltimateNodeCount = new Long(source.UnboundUltimateNodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "AlarmEventCriticalCount", this.AlarmEventCriticalCount);
        this.setParamSimple(map, prefix + "AlarmEventHighCount", this.AlarmEventHighCount);
        this.setParamSimple(map, prefix + "AlarmEventMiddleCount", this.AlarmEventMiddleCount);
        this.setParamSimple(map, prefix + "AlarmEventLowCount", this.AlarmEventLowCount);
        this.setParamSimple(map, prefix + "RiskEventCriticalCount", this.RiskEventCriticalCount);
        this.setParamSimple(map, prefix + "RiskEventHighCount", this.RiskEventHighCount);
        this.setParamSimple(map, prefix + "RiskEventMiddleCount", this.RiskEventMiddleCount);
        this.setParamSimple(map, prefix + "RiskEventLowCount", this.RiskEventLowCount);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "OfflineNodeCount", this.OfflineNodeCount);
        this.setParamSimple(map, prefix + "UninstallNodeCount", this.UninstallNodeCount);
        this.setParamSimple(map, prefix + "TotalCoresCount", this.TotalCoresCount);
        this.setParamSimple(map, prefix + "DefendCoresCount", this.DefendCoresCount);
        this.setParamSimple(map, prefix + "AuditLogSwitchStatus", this.AuditLogSwitchStatus);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LastAssetSyncTime", this.LastAssetSyncTime);
        this.setParamSimple(map, prefix + "LastRiskCheckTime", this.LastRiskCheckTime);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "RunSubStatus", this.RunSubStatus);
        this.setParamSimple(map, prefix + "AccessedStatus", this.AccessedStatus);
        this.setParamSimple(map, prefix + "AccessedSubStatus", this.AccessedSubStatus);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamSimple(map, prefix + "AssetSyncStatus", this.AssetSyncStatus);
        this.setParamSimple(map, prefix + "RiskConfigCount", this.RiskConfigCount);
        this.setParamSimple(map, prefix + "AccessFailedMessage", this.AccessFailedMessage);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionNameEn", this.RegionNameEn);
        this.setParamSimple(map, prefix + "UnboundUltimateNodeCount", this.UnboundUltimateNodeCount);

    }
}

