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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfoItem extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster version
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Cluster OS
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * Cluster type
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Number of nodes in the cluster
    */
    @SerializedName("ClusterNodeNum")
    @Expose
    private Long ClusterNodeNum;

    /**
    * Cluster region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Status of the monitoring component. Valid values: `Defender_Uninstall`, `Defender_Normal`, `Defender_Error`, `Defender_Installing`.
    */
    @SerializedName("DefenderStatus")
    @Expose
    private String DefenderStatus;

    /**
    * Cluster status
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * Cluster check mode. Valid values: `Cluster_Normal`, `Cluster_Actived`.
    */
    @SerializedName("ClusterCheckMode")
    @Expose
    private String ClusterCheckMode;

    /**
    * Whether automatic and regular check is enabled
    */
    @SerializedName("ClusterAutoCheck")
    @Expose
    private Boolean ClusterAutoCheck;

    /**
    * Cause of the failure to deploy the defender. When it is `UserDaemonSetNotReady`, `UnreadyNodeNum` is changed to "The defenders on N nodes are ready". If it is another value, the error message is directly displayed.
    */
    @SerializedName("DefenderErrorReason")
    @Expose
    private String DefenderErrorReason;

    /**
    * Number of nodes where the defender is not ready
    */
    @SerializedName("UnreadyNodeNum")
    @Expose
    private Long UnreadyNodeNum;

    /**
    * Number of critical check items
    */
    @SerializedName("SeriousRiskCount")
    @Expose
    private Long SeriousRiskCount;

    /**
    * Number of high-risk check items
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * Number of medium-risk check items
    */
    @SerializedName("MiddleRiskCount")
    @Expose
    private Long MiddleRiskCount;

    /**
    * Number of prompt-risk check items
    */
    @SerializedName("HintRiskCount")
    @Expose
    private Long HintRiskCount;

    /**
    * Check failure cause
    */
    @SerializedName("CheckFailReason")
    @Expose
    private String CheckFailReason;

    /**
    * Check status. Valid values: `Task_Running`, `NoRisk`, `HasRisk`, `Uncheck`, `Task_Error`.
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * Task creation time and check time
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

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
     * Get Cluster version 
     * @return ClusterVersion Cluster version
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Cluster version
     * @param ClusterVersion Cluster version
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Cluster OS 
     * @return ClusterOs Cluster OS
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set Cluster OS
     * @param ClusterOs Cluster OS
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get Cluster type 
     * @return ClusterType Cluster type
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type
     * @param ClusterType Cluster type
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Number of nodes in the cluster 
     * @return ClusterNodeNum Number of nodes in the cluster
     */
    public Long getClusterNodeNum() {
        return this.ClusterNodeNum;
    }

    /**
     * Set Number of nodes in the cluster
     * @param ClusterNodeNum Number of nodes in the cluster
     */
    public void setClusterNodeNum(Long ClusterNodeNum) {
        this.ClusterNodeNum = ClusterNodeNum;
    }

    /**
     * Get Cluster region 
     * @return Region Cluster region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Cluster region
     * @param Region Cluster region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Status of the monitoring component. Valid values: `Defender_Uninstall`, `Defender_Normal`, `Defender_Error`, `Defender_Installing`. 
     * @return DefenderStatus Status of the monitoring component. Valid values: `Defender_Uninstall`, `Defender_Normal`, `Defender_Error`, `Defender_Installing`.
     */
    public String getDefenderStatus() {
        return this.DefenderStatus;
    }

    /**
     * Set Status of the monitoring component. Valid values: `Defender_Uninstall`, `Defender_Normal`, `Defender_Error`, `Defender_Installing`.
     * @param DefenderStatus Status of the monitoring component. Valid values: `Defender_Uninstall`, `Defender_Normal`, `Defender_Error`, `Defender_Installing`.
     */
    public void setDefenderStatus(String DefenderStatus) {
        this.DefenderStatus = DefenderStatus;
    }

    /**
     * Get Cluster status 
     * @return ClusterStatus Cluster status
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Cluster status
     * @param ClusterStatus Cluster status
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Cluster check mode. Valid values: `Cluster_Normal`, `Cluster_Actived`. 
     * @return ClusterCheckMode Cluster check mode. Valid values: `Cluster_Normal`, `Cluster_Actived`.
     */
    public String getClusterCheckMode() {
        return this.ClusterCheckMode;
    }

    /**
     * Set Cluster check mode. Valid values: `Cluster_Normal`, `Cluster_Actived`.
     * @param ClusterCheckMode Cluster check mode. Valid values: `Cluster_Normal`, `Cluster_Actived`.
     */
    public void setClusterCheckMode(String ClusterCheckMode) {
        this.ClusterCheckMode = ClusterCheckMode;
    }

    /**
     * Get Whether automatic and regular check is enabled 
     * @return ClusterAutoCheck Whether automatic and regular check is enabled
     */
    public Boolean getClusterAutoCheck() {
        return this.ClusterAutoCheck;
    }

    /**
     * Set Whether automatic and regular check is enabled
     * @param ClusterAutoCheck Whether automatic and regular check is enabled
     */
    public void setClusterAutoCheck(Boolean ClusterAutoCheck) {
        this.ClusterAutoCheck = ClusterAutoCheck;
    }

    /**
     * Get Cause of the failure to deploy the defender. When it is `UserDaemonSetNotReady`, `UnreadyNodeNum` is changed to "The defenders on N nodes are ready". If it is another value, the error message is directly displayed. 
     * @return DefenderErrorReason Cause of the failure to deploy the defender. When it is `UserDaemonSetNotReady`, `UnreadyNodeNum` is changed to "The defenders on N nodes are ready". If it is another value, the error message is directly displayed.
     */
    public String getDefenderErrorReason() {
        return this.DefenderErrorReason;
    }

    /**
     * Set Cause of the failure to deploy the defender. When it is `UserDaemonSetNotReady`, `UnreadyNodeNum` is changed to "The defenders on N nodes are ready". If it is another value, the error message is directly displayed.
     * @param DefenderErrorReason Cause of the failure to deploy the defender. When it is `UserDaemonSetNotReady`, `UnreadyNodeNum` is changed to "The defenders on N nodes are ready". If it is another value, the error message is directly displayed.
     */
    public void setDefenderErrorReason(String DefenderErrorReason) {
        this.DefenderErrorReason = DefenderErrorReason;
    }

    /**
     * Get Number of nodes where the defender is not ready 
     * @return UnreadyNodeNum Number of nodes where the defender is not ready
     */
    public Long getUnreadyNodeNum() {
        return this.UnreadyNodeNum;
    }

    /**
     * Set Number of nodes where the defender is not ready
     * @param UnreadyNodeNum Number of nodes where the defender is not ready
     */
    public void setUnreadyNodeNum(Long UnreadyNodeNum) {
        this.UnreadyNodeNum = UnreadyNodeNum;
    }

    /**
     * Get Number of critical check items 
     * @return SeriousRiskCount Number of critical check items
     */
    public Long getSeriousRiskCount() {
        return this.SeriousRiskCount;
    }

    /**
     * Set Number of critical check items
     * @param SeriousRiskCount Number of critical check items
     */
    public void setSeriousRiskCount(Long SeriousRiskCount) {
        this.SeriousRiskCount = SeriousRiskCount;
    }

    /**
     * Get Number of high-risk check items 
     * @return HighRiskCount Number of high-risk check items
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set Number of high-risk check items
     * @param HighRiskCount Number of high-risk check items
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get Number of medium-risk check items 
     * @return MiddleRiskCount Number of medium-risk check items
     */
    public Long getMiddleRiskCount() {
        return this.MiddleRiskCount;
    }

    /**
     * Set Number of medium-risk check items
     * @param MiddleRiskCount Number of medium-risk check items
     */
    public void setMiddleRiskCount(Long MiddleRiskCount) {
        this.MiddleRiskCount = MiddleRiskCount;
    }

    /**
     * Get Number of prompt-risk check items 
     * @return HintRiskCount Number of prompt-risk check items
     */
    public Long getHintRiskCount() {
        return this.HintRiskCount;
    }

    /**
     * Set Number of prompt-risk check items
     * @param HintRiskCount Number of prompt-risk check items
     */
    public void setHintRiskCount(Long HintRiskCount) {
        this.HintRiskCount = HintRiskCount;
    }

    /**
     * Get Check failure cause 
     * @return CheckFailReason Check failure cause
     */
    public String getCheckFailReason() {
        return this.CheckFailReason;
    }

    /**
     * Set Check failure cause
     * @param CheckFailReason Check failure cause
     */
    public void setCheckFailReason(String CheckFailReason) {
        this.CheckFailReason = CheckFailReason;
    }

    /**
     * Get Check status. Valid values: `Task_Running`, `NoRisk`, `HasRisk`, `Uncheck`, `Task_Error`. 
     * @return CheckStatus Check status. Valid values: `Task_Running`, `NoRisk`, `HasRisk`, `Uncheck`, `Task_Error`.
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set Check status. Valid values: `Task_Running`, `NoRisk`, `HasRisk`, `Uncheck`, `Task_Error`.
     * @param CheckStatus Check status. Valid values: `Task_Running`, `NoRisk`, `HasRisk`, `Uncheck`, `Task_Error`.
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get Task creation time and check time 
     * @return TaskCreateTime Task creation time and check time
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set Task creation time and check time
     * @param TaskCreateTime Task creation time and check time
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    public ClusterInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfoItem(ClusterInfoItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterOs != null) {
            this.ClusterOs = new String(source.ClusterOs);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterNodeNum != null) {
            this.ClusterNodeNum = new Long(source.ClusterNodeNum);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DefenderStatus != null) {
            this.DefenderStatus = new String(source.DefenderStatus);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.ClusterCheckMode != null) {
            this.ClusterCheckMode = new String(source.ClusterCheckMode);
        }
        if (source.ClusterAutoCheck != null) {
            this.ClusterAutoCheck = new Boolean(source.ClusterAutoCheck);
        }
        if (source.DefenderErrorReason != null) {
            this.DefenderErrorReason = new String(source.DefenderErrorReason);
        }
        if (source.UnreadyNodeNum != null) {
            this.UnreadyNodeNum = new Long(source.UnreadyNodeNum);
        }
        if (source.SeriousRiskCount != null) {
            this.SeriousRiskCount = new Long(source.SeriousRiskCount);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.MiddleRiskCount != null) {
            this.MiddleRiskCount = new Long(source.MiddleRiskCount);
        }
        if (source.HintRiskCount != null) {
            this.HintRiskCount = new Long(source.HintRiskCount);
        }
        if (source.CheckFailReason != null) {
            this.CheckFailReason = new String(source.CheckFailReason);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterOs", this.ClusterOs);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterNodeNum", this.ClusterNodeNum);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DefenderStatus", this.DefenderStatus);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ClusterCheckMode", this.ClusterCheckMode);
        this.setParamSimple(map, prefix + "ClusterAutoCheck", this.ClusterAutoCheck);
        this.setParamSimple(map, prefix + "DefenderErrorReason", this.DefenderErrorReason);
        this.setParamSimple(map, prefix + "UnreadyNodeNum", this.UnreadyNodeNum);
        this.setParamSimple(map, prefix + "SeriousRiskCount", this.SeriousRiskCount);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "MiddleRiskCount", this.MiddleRiskCount);
        this.setParamSimple(map, prefix + "HintRiskCount", this.HintRiskCount);
        this.setParamSimple(map, prefix + "CheckFailReason", this.CheckFailReason);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);

    }
}

