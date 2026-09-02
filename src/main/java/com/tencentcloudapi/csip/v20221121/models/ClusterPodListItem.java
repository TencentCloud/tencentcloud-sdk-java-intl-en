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

public class ClusterPodListItem extends AbstractModel {

    /**
    * <p>Asset id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Unique pod id</p>
    */
    @SerializedName("PodUid")
    @Expose
    private String PodUid;

    /**
    * <p>Pod name.</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>Pod IP array</p>
    */
    @SerializedName("PodIPs")
    @Expose
    private String [] PodIPs;

    /**
    * <p>pod status</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>Number of protected cores</p>
    */
    @SerializedName("DefendCoresCount")
    @Expose
    private Long DefendCoresCount;

    /**
    * <p>Node ID.</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>Node type</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Load Name</p>
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * <p>Workload type</p>
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
    * <p>Namespace.</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Unique Pod identifier ID</p>
    */
    @SerializedName("UniqueID")
    @Expose
    private String UniqueID;

    /**
    * <p>Critical risk count</p>
    */
    @SerializedName("RiskEventCriticalCount")
    @Expose
    private Long RiskEventCriticalCount;

    /**
    * <p>Number of high-risk items</p>
    */
    @SerializedName("RiskEventHighCount")
    @Expose
    private Long RiskEventHighCount;

    /**
    * <p>Number of medium-risk items</p>
    */
    @SerializedName("RiskEventMiddleCount")
    @Expose
    private Long RiskEventMiddleCount;

    /**
    * <p>Number of low risks</p>
    */
    @SerializedName("RiskEventLowCount")
    @Expose
    private Long RiskEventLowCount;

    /**
    * <p>Number of critical alerts</p>
    */
    @SerializedName("AlarmEventCriticalCount")
    @Expose
    private Long AlarmEventCriticalCount;

    /**
    * <p>High-risk alarm count</p>
    */
    @SerializedName("AlarmEventHighCount")
    @Expose
    private Long AlarmEventHighCount;

    /**
    * <p>Number of medium-risk alerts</p>
    */
    @SerializedName("AlarmEventMiddleCount")
    @Expose
    private Long AlarmEventMiddleCount;

    /**
    * <p>Number of low-risk alarms</p>
    */
    @SerializedName("AlarmEventLowCount")
    @Expose
    private Long AlarmEventLowCount;

    /**
    * <p>Associated container list</p>
    */
    @SerializedName("ContainerList")
    @Expose
    private ClusterContainerListItem [] ContainerList;

    /**
    * <p>Number of associated alarms</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>Number of cores.</p><p>Unit: millicore.</p>
    */
    @SerializedName("CoresCount")
    @Expose
    private Long CoresCount;

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
     * Get <p>Unique pod id</p> 
     * @return PodUid <p>Unique pod id</p>
     */
    public String getPodUid() {
        return this.PodUid;
    }

    /**
     * Set <p>Unique pod id</p>
     * @param PodUid <p>Unique pod id</p>
     */
    public void setPodUid(String PodUid) {
        this.PodUid = PodUid;
    }

    /**
     * Get <p>Pod name.</p> 
     * @return PodName <p>Pod name.</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod name.</p>
     * @param PodName <p>Pod name.</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>Pod IP array</p> 
     * @return PodIPs <p>Pod IP array</p>
     */
    public String [] getPodIPs() {
        return this.PodIPs;
    }

    /**
     * Set <p>Pod IP array</p>
     * @param PodIPs <p>Pod IP array</p>
     */
    public void setPodIPs(String [] PodIPs) {
        this.PodIPs = PodIPs;
    }

    /**
     * Get <p>pod status</p> 
     * @return RunStatus <p>pod status</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>pod status</p>
     * @param RunStatus <p>pod status</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
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
     * Get <p>Node ID.</p> 
     * @return NodeId <p>Node ID.</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>Node ID.</p>
     * @param NodeId <p>Node ID.</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>Node type</p> 
     * @return NodeType <p>Node type</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Node type</p>
     * @param NodeType <p>Node type</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Load Name</p> 
     * @return WorkloadName <p>Load Name</p>
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set <p>Load Name</p>
     * @param WorkloadName <p>Load Name</p>
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get <p>Workload type</p> 
     * @return WorkloadType <p>Workload type</p>
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set <p>Workload type</p>
     * @param WorkloadType <p>Workload type</p>
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    /**
     * Get <p>Namespace.</p> 
     * @return Namespace <p>Namespace.</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Namespace.</p>
     * @param Namespace <p>Namespace.</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
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
     * Get <p>Unique Pod identifier ID</p> 
     * @return UniqueID <p>Unique Pod identifier ID</p>
     */
    public String getUniqueID() {
        return this.UniqueID;
    }

    /**
     * Set <p>Unique Pod identifier ID</p>
     * @param UniqueID <p>Unique Pod identifier ID</p>
     */
    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
    }

    /**
     * Get <p>Critical risk count</p> 
     * @return RiskEventCriticalCount <p>Critical risk count</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventCriticalCount() {
        return this.RiskEventCriticalCount;
    }

    /**
     * Set <p>Critical risk count</p>
     * @param RiskEventCriticalCount <p>Critical risk count</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventCriticalCount(Long RiskEventCriticalCount) {
        this.RiskEventCriticalCount = RiskEventCriticalCount;
    }

    /**
     * Get <p>Number of high-risk items</p> 
     * @return RiskEventHighCount <p>Number of high-risk items</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventHighCount() {
        return this.RiskEventHighCount;
    }

    /**
     * Set <p>Number of high-risk items</p>
     * @param RiskEventHighCount <p>Number of high-risk items</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventHighCount(Long RiskEventHighCount) {
        this.RiskEventHighCount = RiskEventHighCount;
    }

    /**
     * Get <p>Number of medium-risk items</p> 
     * @return RiskEventMiddleCount <p>Number of medium-risk items</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventMiddleCount() {
        return this.RiskEventMiddleCount;
    }

    /**
     * Set <p>Number of medium-risk items</p>
     * @param RiskEventMiddleCount <p>Number of medium-risk items</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventMiddleCount(Long RiskEventMiddleCount) {
        this.RiskEventMiddleCount = RiskEventMiddleCount;
    }

    /**
     * Get <p>Number of low risks</p> 
     * @return RiskEventLowCount <p>Number of low risks</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventLowCount() {
        return this.RiskEventLowCount;
    }

    /**
     * Set <p>Number of low risks</p>
     * @param RiskEventLowCount <p>Number of low risks</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventLowCount(Long RiskEventLowCount) {
        this.RiskEventLowCount = RiskEventLowCount;
    }

    /**
     * Get <p>Number of critical alerts</p> 
     * @return AlarmEventCriticalCount <p>Number of critical alerts</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventCriticalCount() {
        return this.AlarmEventCriticalCount;
    }

    /**
     * Set <p>Number of critical alerts</p>
     * @param AlarmEventCriticalCount <p>Number of critical alerts</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventCriticalCount(Long AlarmEventCriticalCount) {
        this.AlarmEventCriticalCount = AlarmEventCriticalCount;
    }

    /**
     * Get <p>High-risk alarm count</p> 
     * @return AlarmEventHighCount <p>High-risk alarm count</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventHighCount() {
        return this.AlarmEventHighCount;
    }

    /**
     * Set <p>High-risk alarm count</p>
     * @param AlarmEventHighCount <p>High-risk alarm count</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventHighCount(Long AlarmEventHighCount) {
        this.AlarmEventHighCount = AlarmEventHighCount;
    }

    /**
     * Get <p>Number of medium-risk alerts</p> 
     * @return AlarmEventMiddleCount <p>Number of medium-risk alerts</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventMiddleCount() {
        return this.AlarmEventMiddleCount;
    }

    /**
     * Set <p>Number of medium-risk alerts</p>
     * @param AlarmEventMiddleCount <p>Number of medium-risk alerts</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventMiddleCount(Long AlarmEventMiddleCount) {
        this.AlarmEventMiddleCount = AlarmEventMiddleCount;
    }

    /**
     * Get <p>Number of low-risk alarms</p> 
     * @return AlarmEventLowCount <p>Number of low-risk alarms</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventLowCount() {
        return this.AlarmEventLowCount;
    }

    /**
     * Set <p>Number of low-risk alarms</p>
     * @param AlarmEventLowCount <p>Number of low-risk alarms</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventLowCount(Long AlarmEventLowCount) {
        this.AlarmEventLowCount = AlarmEventLowCount;
    }

    /**
     * Get <p>Associated container list</p> 
     * @return ContainerList <p>Associated container list</p>
     */
    public ClusterContainerListItem [] getContainerList() {
        return this.ContainerList;
    }

    /**
     * Set <p>Associated container list</p>
     * @param ContainerList <p>Associated container list</p>
     */
    public void setContainerList(ClusterContainerListItem [] ContainerList) {
        this.ContainerList = ContainerList;
    }

    /**
     * Get <p>Number of associated alarms</p> 
     * @return AlarmCount <p>Number of associated alarms</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>Number of associated alarms</p>
     * @param AlarmCount <p>Number of associated alarms</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get <p>Number of cores.</p><p>Unit: millicore.</p> 
     * @return CoresCount <p>Number of cores.</p><p>Unit: millicore.</p>
     */
    public Long getCoresCount() {
        return this.CoresCount;
    }

    /**
     * Set <p>Number of cores.</p><p>Unit: millicore.</p>
     * @param CoresCount <p>Number of cores.</p><p>Unit: millicore.</p>
     */
    public void setCoresCount(Long CoresCount) {
        this.CoresCount = CoresCount;
    }

    public ClusterPodListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterPodListItem(ClusterPodListItem source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.PodUid != null) {
            this.PodUid = new String(source.PodUid);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIPs != null) {
            this.PodIPs = new String[source.PodIPs.length];
            for (int i = 0; i < source.PodIPs.length; i++) {
                this.PodIPs[i] = new String(source.PodIPs[i]);
            }
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.DefendCoresCount != null) {
            this.DefendCoresCount = new Long(source.DefendCoresCount);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UniqueID != null) {
            this.UniqueID = new String(source.UniqueID);
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
        if (source.ContainerList != null) {
            this.ContainerList = new ClusterContainerListItem[source.ContainerList.length];
            for (int i = 0; i < source.ContainerList.length; i++) {
                this.ContainerList[i] = new ClusterContainerListItem(source.ContainerList[i]);
            }
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.CoresCount != null) {
            this.CoresCount = new Long(source.CoresCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "PodUid", this.PodUid);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamArraySimple(map, prefix + "PodIPs.", this.PodIPs);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "DefendCoresCount", this.DefendCoresCount);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UniqueID", this.UniqueID);
        this.setParamSimple(map, prefix + "RiskEventCriticalCount", this.RiskEventCriticalCount);
        this.setParamSimple(map, prefix + "RiskEventHighCount", this.RiskEventHighCount);
        this.setParamSimple(map, prefix + "RiskEventMiddleCount", this.RiskEventMiddleCount);
        this.setParamSimple(map, prefix + "RiskEventLowCount", this.RiskEventLowCount);
        this.setParamSimple(map, prefix + "AlarmEventCriticalCount", this.AlarmEventCriticalCount);
        this.setParamSimple(map, prefix + "AlarmEventHighCount", this.AlarmEventHighCount);
        this.setParamSimple(map, prefix + "AlarmEventMiddleCount", this.AlarmEventMiddleCount);
        this.setParamSimple(map, prefix + "AlarmEventLowCount", this.AlarmEventLowCount);
        this.setParamArrayObj(map, prefix + "ContainerList.", this.ContainerList);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "CoresCount", this.CoresCount);

    }
}

