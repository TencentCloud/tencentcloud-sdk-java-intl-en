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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceVersionBrief extends AbstractModel{

    /**
    * Version name
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Status of version
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * (Disused) Whether to enable elastic scaling
    */
    @SerializedName("EnableEs")
    @Expose
    private Long EnableEs;

    /**
    * Number of current instances
    */
    @SerializedName("CurrentInstances")
    @Expose
    private Long CurrentInstances;

    /**
    * Version ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * (Disused) Log output configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogOutputConf")
    @Expose
    private LogOutputConf LogOutputConf;

    /**
    * Expected number of instances
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpectedInstances")
    @Expose
    private Long ExpectedInstances;

    /**
    * Deployment mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * Task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BuildTaskId")
    @Expose
    private String BuildTaskId;

    /**
    * Environment ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Environment name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Application ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Whether the application is being deployed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnderDeploying")
    @Expose
    private Boolean UnderDeploying;

    /**
    * Status of batch deployment
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("BatchDeployStatus")
    @Expose
    private String BatchDeployStatus;

    /**
    * Availability zones
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Node information
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("NodeInfos")
    @Expose
    private NodeInfo [] NodeInfos;

    /**
    * Pod information
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PodList")
    @Expose
    private DescribeRunPodPage PodList;

    /**
    * Workload information
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("WorkloadInfo")
    @Expose
    private WorkloadInfo WorkloadInfo;

    /**
    * Creation time
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
     * Get Version name 
     * @return VersionName Version name
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Version name
     * @param VersionName Version name
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Status of version 
     * @return Status Status of version
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of version
     * @param Status Status of version
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get (Disused) Whether to enable elastic scaling 
     * @return EnableEs (Disused) Whether to enable elastic scaling
     */
    public Long getEnableEs() {
        return this.EnableEs;
    }

    /**
     * Set (Disused) Whether to enable elastic scaling
     * @param EnableEs (Disused) Whether to enable elastic scaling
     */
    public void setEnableEs(Long EnableEs) {
        this.EnableEs = EnableEs;
    }

    /**
     * Get Number of current instances 
     * @return CurrentInstances Number of current instances
     */
    public Long getCurrentInstances() {
        return this.CurrentInstances;
    }

    /**
     * Set Number of current instances
     * @param CurrentInstances Number of current instances
     */
    public void setCurrentInstances(Long CurrentInstances) {
        this.CurrentInstances = CurrentInstances;
    }

    /**
     * Get Version ID 
     * @return VersionId Version ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Version ID
     * @param VersionId Version ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get (Disused) Log output configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogOutputConf (Disused) Log output configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LogOutputConf getLogOutputConf() {
        return this.LogOutputConf;
    }

    /**
     * Set (Disused) Log output configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogOutputConf (Disused) Log output configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogOutputConf(LogOutputConf LogOutputConf) {
        this.LogOutputConf = LogOutputConf;
    }

    /**
     * Get Expected number of instances
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpectedInstances Expected number of instances
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExpectedInstances() {
        return this.ExpectedInstances;
    }

    /**
     * Set Expected number of instances
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpectedInstances Expected number of instances
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpectedInstances(Long ExpectedInstances) {
        this.ExpectedInstances = ExpectedInstances;
    }

    /**
     * Get Deployment mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeployMode Deployment mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Deployment mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeployMode Deployment mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BuildTaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBuildTaskId() {
        return this.BuildTaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BuildTaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBuildTaskId(String BuildTaskId) {
        this.BuildTaskId = BuildTaskId;
    }

    /**
     * Get Environment ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentId Environment ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentId Environment ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Environment name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentName Environment name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentName Environment name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get Application ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Whether the application is being deployed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnderDeploying Whether the application is being deployed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getUnderDeploying() {
        return this.UnderDeploying;
    }

    /**
     * Set Whether the application is being deployed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnderDeploying Whether the application is being deployed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnderDeploying(Boolean UnderDeploying) {
        this.UnderDeploying = UnderDeploying;
    }

    /**
     * Get Status of batch deployment
Note: This field may return `null`, indicating that no valid value was found. 
     * @return BatchDeployStatus Status of batch deployment
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getBatchDeployStatus() {
        return this.BatchDeployStatus;
    }

    /**
     * Set Status of batch deployment
Note: This field may return `null`, indicating that no valid value was found.
     * @param BatchDeployStatus Status of batch deployment
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setBatchDeployStatus(String BatchDeployStatus) {
        this.BatchDeployStatus = BatchDeployStatus;
    }

    /**
     * Get Availability zones
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Zones Availability zones
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Availability zones
Note: This field may return `null`, indicating that no valid value was found.
     * @param Zones Availability zones
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Node information
Note: This field may return `null`, indicating that no valid value was found. 
     * @return NodeInfos Node information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public NodeInfo [] getNodeInfos() {
        return this.NodeInfos;
    }

    /**
     * Set Node information
Note: This field may return `null`, indicating that no valid value was found.
     * @param NodeInfos Node information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setNodeInfos(NodeInfo [] NodeInfos) {
        this.NodeInfos = NodeInfos;
    }

    /**
     * Get Pod information
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PodList Pod information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public DescribeRunPodPage getPodList() {
        return this.PodList;
    }

    /**
     * Set Pod information
Note: This field may return `null`, indicating that no valid value was found.
     * @param PodList Pod information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPodList(DescribeRunPodPage PodList) {
        this.PodList = PodList;
    }

    /**
     * Get Workload information
Note: This field may return `null`, indicating that no valid value was found. 
     * @return WorkloadInfo Workload information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public WorkloadInfo getWorkloadInfo() {
        return this.WorkloadInfo;
    }

    /**
     * Set Workload information
Note: This field may return `null`, indicating that no valid value was found.
     * @param WorkloadInfo Workload information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setWorkloadInfo(WorkloadInfo WorkloadInfo) {
        this.WorkloadInfo = WorkloadInfo;
    }

    /**
     * Get Creation time
Note: This field may return `null`, indicating that no valid value was found. 
     * @return CreateDate Creation time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set Creation time
Note: This field may return `null`, indicating that no valid value was found.
     * @param CreateDate Creation time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    public ServiceVersionBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceVersionBrief(ServiceVersionBrief source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EnableEs != null) {
            this.EnableEs = new Long(source.EnableEs);
        }
        if (source.CurrentInstances != null) {
            this.CurrentInstances = new Long(source.CurrentInstances);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.LogOutputConf != null) {
            this.LogOutputConf = new LogOutputConf(source.LogOutputConf);
        }
        if (source.ExpectedInstances != null) {
            this.ExpectedInstances = new Long(source.ExpectedInstances);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.BuildTaskId != null) {
            this.BuildTaskId = new String(source.BuildTaskId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.UnderDeploying != null) {
            this.UnderDeploying = new Boolean(source.UnderDeploying);
        }
        if (source.BatchDeployStatus != null) {
            this.BatchDeployStatus = new String(source.BatchDeployStatus);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.NodeInfos != null) {
            this.NodeInfos = new NodeInfo[source.NodeInfos.length];
            for (int i = 0; i < source.NodeInfos.length; i++) {
                this.NodeInfos[i] = new NodeInfo(source.NodeInfos[i]);
            }
        }
        if (source.PodList != null) {
            this.PodList = new DescribeRunPodPage(source.PodList);
        }
        if (source.WorkloadInfo != null) {
            this.WorkloadInfo = new WorkloadInfo(source.WorkloadInfo);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableEs", this.EnableEs);
        this.setParamSimple(map, prefix + "CurrentInstances", this.CurrentInstances);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamObj(map, prefix + "LogOutputConf.", this.LogOutputConf);
        this.setParamSimple(map, prefix + "ExpectedInstances", this.ExpectedInstances);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "BuildTaskId", this.BuildTaskId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "UnderDeploying", this.UnderDeploying);
        this.setParamSimple(map, prefix + "BatchDeployStatus", this.BatchDeployStatus);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArrayObj(map, prefix + "NodeInfos.", this.NodeInfos);
        this.setParamObj(map, prefix + "PodList.", this.PodList);
        this.setParamObj(map, prefix + "WorkloadInfo.", this.WorkloadInfo);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);

    }
}

