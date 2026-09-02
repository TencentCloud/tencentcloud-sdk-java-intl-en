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

public class DescribeClusterPodDetailResponse extends AbstractModel {

    /**
    * <p>Pod unique ID</p>
    */
    @SerializedName("UniqueID")
    @Expose
    private String UniqueID;

    /**
    * <p>Primary Account AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Pod name</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>Pod IP address</p>
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * <p>Pod running state</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>Pod Labels list</p>
    */
    @SerializedName("Labels")
    @Expose
    private AssetTag [] Labels;

    /**
    * <p>Pod startup time</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Start time (seconds)</p>
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * <p>Pod restart count</p>
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * <p>Cluster Name</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Cluster ID</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>Cluster type</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>Cluster operation status</p>
    */
    @SerializedName("ClusterRunStatus")
    @Expose
    private String ClusterRunStatus;

    /**
    * <p>Namespace</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>Node name where it resides.</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>Current node ID</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>Name of the associated Workload</p>
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
    * <p>Number of critical risk events</p>
    */
    @SerializedName("RiskEventCriticalCount")
    @Expose
    private Long RiskEventCriticalCount;

    /**
    * <p>Number of high-risk events</p>
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
    * <p>Region</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Node private IP</p>
    */
    @SerializedName("NodeInternalIP")
    @Expose
    private String NodeInternalIP;

    /**
    * <p>Node public IP</p>
    */
    @SerializedName("NodeExternalIP")
    @Expose
    private String NodeExternalIP;

    /**
    * <p>Number of associated containers</p>
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * <p>Number of associated services</p>
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

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
    * <p>Number of alarms.</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Pod unique ID</p> 
     * @return UniqueID <p>Pod unique ID</p>
     */
    public String getUniqueID() {
        return this.UniqueID;
    }

    /**
     * Set <p>Pod unique ID</p>
     * @param UniqueID <p>Pod unique ID</p>
     */
    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
    }

    /**
     * Get <p>Primary Account AppID</p> 
     * @return AppID <p>Primary Account AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>Primary Account AppID</p>
     * @param AppID <p>Primary Account AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Pod name</p> 
     * @return PodName <p>Pod name</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod name</p>
     * @param PodName <p>Pod name</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>Pod IP address</p> 
     * @return PodIP <p>Pod IP address</p>
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set <p>Pod IP address</p>
     * @param PodIP <p>Pod IP address</p>
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get <p>Pod running state</p> 
     * @return RunStatus <p>Pod running state</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>Pod running state</p>
     * @param RunStatus <p>Pod running state</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>Pod Labels list</p> 
     * @return Labels <p>Pod Labels list</p>
     */
    public AssetTag [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>Pod Labels list</p>
     * @param Labels <p>Pod Labels list</p>
     */
    public void setLabels(AssetTag [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Pod startup time</p> 
     * @return StartTime <p>Pod startup time</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Pod startup time</p>
     * @param StartTime <p>Pod startup time</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Start time (seconds)</p> 
     * @return StartupTime <p>Start time (seconds)</p>
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set <p>Start time (seconds)</p>
     * @param StartupTime <p>Start time (seconds)</p>
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get <p>Pod restart count</p> 
     * @return RestartCount <p>Pod restart count</p>
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set <p>Pod restart count</p>
     * @param RestartCount <p>Pod restart count</p>
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get <p>Cluster Name</p> 
     * @return ClusterName <p>Cluster Name</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster Name</p>
     * @param ClusterName <p>Cluster Name</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Cluster ID</p> 
     * @return ClusterID <p>Cluster ID</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>Cluster ID</p>
     * @param ClusterID <p>Cluster ID</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>Cluster type</p> 
     * @return ClusterType <p>Cluster type</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>Cluster type</p>
     * @param ClusterType <p>Cluster type</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>Cluster operation status</p> 
     * @return ClusterRunStatus <p>Cluster operation status</p>
     */
    public String getClusterRunStatus() {
        return this.ClusterRunStatus;
    }

    /**
     * Set <p>Cluster operation status</p>
     * @param ClusterRunStatus <p>Cluster operation status</p>
     */
    public void setClusterRunStatus(String ClusterRunStatus) {
        this.ClusterRunStatus = ClusterRunStatus;
    }

    /**
     * Get <p>Namespace</p> 
     * @return Namespace <p>Namespace</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Namespace</p>
     * @param Namespace <p>Namespace</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>Node name where it resides.</p> 
     * @return NodeName <p>Node name where it resides.</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>Node name where it resides.</p>
     * @param NodeName <p>Node name where it resides.</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>Current node ID</p> 
     * @return NodeId <p>Current node ID</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>Current node ID</p>
     * @param NodeId <p>Current node ID</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>Name of the associated Workload</p> 
     * @return WorkloadName <p>Name of the associated Workload</p>
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set <p>Name of the associated Workload</p>
     * @param WorkloadName <p>Name of the associated Workload</p>
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
     * Get <p>Number of critical risk events</p> 
     * @return RiskEventCriticalCount <p>Number of critical risk events</p>
     */
    public Long getRiskEventCriticalCount() {
        return this.RiskEventCriticalCount;
    }

    /**
     * Set <p>Number of critical risk events</p>
     * @param RiskEventCriticalCount <p>Number of critical risk events</p>
     */
    public void setRiskEventCriticalCount(Long RiskEventCriticalCount) {
        this.RiskEventCriticalCount = RiskEventCriticalCount;
    }

    /**
     * Get <p>Number of high-risk events</p> 
     * @return RiskEventHighCount <p>Number of high-risk events</p>
     */
    public Long getRiskEventHighCount() {
        return this.RiskEventHighCount;
    }

    /**
     * Set <p>Number of high-risk events</p>
     * @param RiskEventHighCount <p>Number of high-risk events</p>
     */
    public void setRiskEventHighCount(Long RiskEventHighCount) {
        this.RiskEventHighCount = RiskEventHighCount;
    }

    /**
     * Get <p>Number of medium-risk events</p> 
     * @return RiskEventMiddleCount <p>Number of medium-risk events</p>
     */
    public Long getRiskEventMiddleCount() {
        return this.RiskEventMiddleCount;
    }

    /**
     * Set <p>Number of medium-risk events</p>
     * @param RiskEventMiddleCount <p>Number of medium-risk events</p>
     */
    public void setRiskEventMiddleCount(Long RiskEventMiddleCount) {
        this.RiskEventMiddleCount = RiskEventMiddleCount;
    }

    /**
     * Get <p>Number of low-risk events</p> 
     * @return RiskEventLowCount <p>Number of low-risk events</p>
     */
    public Long getRiskEventLowCount() {
        return this.RiskEventLowCount;
    }

    /**
     * Set <p>Number of low-risk events</p>
     * @param RiskEventLowCount <p>Number of low-risk events</p>
     */
    public void setRiskEventLowCount(Long RiskEventLowCount) {
        this.RiskEventLowCount = RiskEventLowCount;
    }

    /**
     * Get <p>Number of critical alarm events</p> 
     * @return AlarmEventCriticalCount <p>Number of critical alarm events</p>
     */
    public Long getAlarmEventCriticalCount() {
        return this.AlarmEventCriticalCount;
    }

    /**
     * Set <p>Number of critical alarm events</p>
     * @param AlarmEventCriticalCount <p>Number of critical alarm events</p>
     */
    public void setAlarmEventCriticalCount(Long AlarmEventCriticalCount) {
        this.AlarmEventCriticalCount = AlarmEventCriticalCount;
    }

    /**
     * Get <p>Number of high-risk alarm events</p> 
     * @return AlarmEventHighCount <p>Number of high-risk alarm events</p>
     */
    public Long getAlarmEventHighCount() {
        return this.AlarmEventHighCount;
    }

    /**
     * Set <p>Number of high-risk alarm events</p>
     * @param AlarmEventHighCount <p>Number of high-risk alarm events</p>
     */
    public void setAlarmEventHighCount(Long AlarmEventHighCount) {
        this.AlarmEventHighCount = AlarmEventHighCount;
    }

    /**
     * Get <p>Number of medium-risk alarm events</p> 
     * @return AlarmEventMiddleCount <p>Number of medium-risk alarm events</p>
     */
    public Long getAlarmEventMiddleCount() {
        return this.AlarmEventMiddleCount;
    }

    /**
     * Set <p>Number of medium-risk alarm events</p>
     * @param AlarmEventMiddleCount <p>Number of medium-risk alarm events</p>
     */
    public void setAlarmEventMiddleCount(Long AlarmEventMiddleCount) {
        this.AlarmEventMiddleCount = AlarmEventMiddleCount;
    }

    /**
     * Get <p>Number of low-risk alarm events</p> 
     * @return AlarmEventLowCount <p>Number of low-risk alarm events</p>
     */
    public Long getAlarmEventLowCount() {
        return this.AlarmEventLowCount;
    }

    /**
     * Set <p>Number of low-risk alarm events</p>
     * @param AlarmEventLowCount <p>Number of low-risk alarm events</p>
     */
    public void setAlarmEventLowCount(Long AlarmEventLowCount) {
        this.AlarmEventLowCount = AlarmEventLowCount;
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
     * Get <p>Node private IP</p> 
     * @return NodeInternalIP <p>Node private IP</p>
     */
    public String getNodeInternalIP() {
        return this.NodeInternalIP;
    }

    /**
     * Set <p>Node private IP</p>
     * @param NodeInternalIP <p>Node private IP</p>
     */
    public void setNodeInternalIP(String NodeInternalIP) {
        this.NodeInternalIP = NodeInternalIP;
    }

    /**
     * Get <p>Node public IP</p> 
     * @return NodeExternalIP <p>Node public IP</p>
     */
    public String getNodeExternalIP() {
        return this.NodeExternalIP;
    }

    /**
     * Set <p>Node public IP</p>
     * @param NodeExternalIP <p>Node public IP</p>
     */
    public void setNodeExternalIP(String NodeExternalIP) {
        this.NodeExternalIP = NodeExternalIP;
    }

    /**
     * Get <p>Number of associated containers</p> 
     * @return ContainerCount <p>Number of associated containers</p>
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set <p>Number of associated containers</p>
     * @param ContainerCount <p>Number of associated containers</p>
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get <p>Number of associated services</p> 
     * @return ServiceCount <p>Number of associated services</p>
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>Number of associated services</p>
     * @param ServiceCount <p>Number of associated services</p>
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
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
     * Get <p>Number of alarms.</p> 
     * @return AlarmCount <p>Number of alarms.</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>Number of alarms.</p>
     * @param AlarmCount <p>Number of alarms.</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterPodDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterPodDetailResponse(DescribeClusterPodDetailResponse source) {
        if (source.UniqueID != null) {
            this.UniqueID = new String(source.UniqueID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.Labels != null) {
            this.Labels = new AssetTag[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AssetTag(source.Labels[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterRunStatus != null) {
            this.ClusterRunStatus = new String(source.ClusterRunStatus);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.NodeInternalIP != null) {
            this.NodeInternalIP = new String(source.NodeInternalIP);
        }
        if (source.NodeExternalIP != null) {
            this.NodeExternalIP = new String(source.NodeExternalIP);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionNameEn != null) {
            this.RegionNameEn = new String(source.RegionNameEn);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueID", this.UniqueID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterRunStatus", this.ClusterRunStatus);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "RiskEventCriticalCount", this.RiskEventCriticalCount);
        this.setParamSimple(map, prefix + "RiskEventHighCount", this.RiskEventHighCount);
        this.setParamSimple(map, prefix + "RiskEventMiddleCount", this.RiskEventMiddleCount);
        this.setParamSimple(map, prefix + "RiskEventLowCount", this.RiskEventLowCount);
        this.setParamSimple(map, prefix + "AlarmEventCriticalCount", this.AlarmEventCriticalCount);
        this.setParamSimple(map, prefix + "AlarmEventHighCount", this.AlarmEventHighCount);
        this.setParamSimple(map, prefix + "AlarmEventMiddleCount", this.AlarmEventMiddleCount);
        this.setParamSimple(map, prefix + "AlarmEventLowCount", this.AlarmEventLowCount);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "NodeInternalIP", this.NodeInternalIP);
        this.setParamSimple(map, prefix + "NodeExternalIP", this.NodeExternalIP);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionNameEn", this.RegionNameEn);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

