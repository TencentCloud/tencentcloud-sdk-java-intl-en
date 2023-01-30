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

public class K8sApiAbnormalEventInfo extends AbstractModel{

    /**
    * Hit rule name
    */
    @SerializedName("MatchRuleName")
    @Expose
    private String MatchRuleName;

    /**
    * Hit rule type
    */
    @SerializedName("MatchRuleType")
    @Expose
    private String MatchRuleType;

    /**
    * Alarm level
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster running status
    */
    @SerializedName("ClusterRunningStatus")
    @Expose
    private String ClusterRunningStatus;

    /**
    * First creation time
    */
    @SerializedName("FirstCreateTime")
    @Expose
    private String FirstCreateTime;

    /**
    * Last creation time
    */
    @SerializedName("LastCreateTime")
    @Expose
    private String LastCreateTime;

    /**
    * Number of alarms
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * Status
`EVENT_UNDEAL`: Unhandled
`EVENT_DEALED`: Handled
`EVENT_IGNORE`: Ignored
`EVENT_DEL`: Deleted
`EVENT_ADD_WHITE`: Added to an allowlist
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The master IP of a cluster
    */
    @SerializedName("ClusterMasterIP")
    @Expose
    private String ClusterMasterIP;

    /**
    * K8s version
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * Runtime component
    */
    @SerializedName("RunningComponent")
    @Expose
    private String [] RunningComponent;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Suggestion
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Request information
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * Rule ID
    */
    @SerializedName("MatchRuleID")
    @Expose
    private String MatchRuleID;

    /**
    * An array of highlighted fields
    */
    @SerializedName("HighLightFields")
    @Expose
    private String [] HighLightFields;

    /**
    * Hit rule
    */
    @SerializedName("MatchRule")
    @Expose
    private K8sApiAbnormalRuleScopeInfo MatchRule;

    /**
     * Get Hit rule name 
     * @return MatchRuleName Hit rule name
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set Hit rule name
     * @param MatchRuleName Hit rule name
     */
    public void setMatchRuleName(String MatchRuleName) {
        this.MatchRuleName = MatchRuleName;
    }

    /**
     * Get Hit rule type 
     * @return MatchRuleType Hit rule type
     */
    public String getMatchRuleType() {
        return this.MatchRuleType;
    }

    /**
     * Set Hit rule type
     * @param MatchRuleType Hit rule type
     */
    public void setMatchRuleType(String MatchRuleType) {
        this.MatchRuleType = MatchRuleType;
    }

    /**
     * Get Alarm level 
     * @return RiskLevel Alarm level
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Alarm level
     * @param RiskLevel Alarm level
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Cluster ID 
     * @return ClusterID Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID
     * @param ClusterID Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
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
     * Get Cluster running status 
     * @return ClusterRunningStatus Cluster running status
     */
    public String getClusterRunningStatus() {
        return this.ClusterRunningStatus;
    }

    /**
     * Set Cluster running status
     * @param ClusterRunningStatus Cluster running status
     */
    public void setClusterRunningStatus(String ClusterRunningStatus) {
        this.ClusterRunningStatus = ClusterRunningStatus;
    }

    /**
     * Get First creation time 
     * @return FirstCreateTime First creation time
     */
    public String getFirstCreateTime() {
        return this.FirstCreateTime;
    }

    /**
     * Set First creation time
     * @param FirstCreateTime First creation time
     */
    public void setFirstCreateTime(String FirstCreateTime) {
        this.FirstCreateTime = FirstCreateTime;
    }

    /**
     * Get Last creation time 
     * @return LastCreateTime Last creation time
     */
    public String getLastCreateTime() {
        return this.LastCreateTime;
    }

    /**
     * Set Last creation time
     * @param LastCreateTime Last creation time
     */
    public void setLastCreateTime(String LastCreateTime) {
        this.LastCreateTime = LastCreateTime;
    }

    /**
     * Get Number of alarms 
     * @return AlarmCount Number of alarms
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set Number of alarms
     * @param AlarmCount Number of alarms
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get Status
`EVENT_UNDEAL`: Unhandled
`EVENT_DEALED`: Handled
`EVENT_IGNORE`: Ignored
`EVENT_DEL`: Deleted
`EVENT_ADD_WHITE`: Added to an allowlist 
     * @return Status Status
`EVENT_UNDEAL`: Unhandled
`EVENT_DEALED`: Handled
`EVENT_IGNORE`: Ignored
`EVENT_DEL`: Deleted
`EVENT_ADD_WHITE`: Added to an allowlist
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
`EVENT_UNDEAL`: Unhandled
`EVENT_DEALED`: Handled
`EVENT_IGNORE`: Ignored
`EVENT_DEL`: Deleted
`EVENT_ADD_WHITE`: Added to an allowlist
     * @param Status Status
`EVENT_UNDEAL`: Unhandled
`EVENT_DEALED`: Handled
`EVENT_IGNORE`: Ignored
`EVENT_DEL`: Deleted
`EVENT_ADD_WHITE`: Added to an allowlist
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The master IP of a cluster 
     * @return ClusterMasterIP The master IP of a cluster
     */
    public String getClusterMasterIP() {
        return this.ClusterMasterIP;
    }

    /**
     * Set The master IP of a cluster
     * @param ClusterMasterIP The master IP of a cluster
     */
    public void setClusterMasterIP(String ClusterMasterIP) {
        this.ClusterMasterIP = ClusterMasterIP;
    }

    /**
     * Get K8s version 
     * @return K8sVersion K8s version
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set K8s version
     * @param K8sVersion K8s version
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get Runtime component 
     * @return RunningComponent Runtime component
     */
    public String [] getRunningComponent() {
        return this.RunningComponent;
    }

    /**
     * Set Runtime component
     * @param RunningComponent Runtime component
     */
    public void setRunningComponent(String [] RunningComponent) {
        this.RunningComponent = RunningComponent;
    }

    /**
     * Get Description 
     * @return Desc Description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
     * @param Desc Description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Suggestion 
     * @return Suggestion Suggestion
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion
     * @param Suggestion Suggestion
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Request information 
     * @return Info Request information
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Request information
     * @param Info Request information
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get Rule ID 
     * @return MatchRuleID Rule ID
     */
    public String getMatchRuleID() {
        return this.MatchRuleID;
    }

    /**
     * Set Rule ID
     * @param MatchRuleID Rule ID
     */
    public void setMatchRuleID(String MatchRuleID) {
        this.MatchRuleID = MatchRuleID;
    }

    /**
     * Get An array of highlighted fields 
     * @return HighLightFields An array of highlighted fields
     */
    public String [] getHighLightFields() {
        return this.HighLightFields;
    }

    /**
     * Set An array of highlighted fields
     * @param HighLightFields An array of highlighted fields
     */
    public void setHighLightFields(String [] HighLightFields) {
        this.HighLightFields = HighLightFields;
    }

    /**
     * Get Hit rule 
     * @return MatchRule Hit rule
     */
    public K8sApiAbnormalRuleScopeInfo getMatchRule() {
        return this.MatchRule;
    }

    /**
     * Set Hit rule
     * @param MatchRule Hit rule
     */
    public void setMatchRule(K8sApiAbnormalRuleScopeInfo MatchRule) {
        this.MatchRule = MatchRule;
    }

    public K8sApiAbnormalEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalEventInfo(K8sApiAbnormalEventInfo source) {
        if (source.MatchRuleName != null) {
            this.MatchRuleName = new String(source.MatchRuleName);
        }
        if (source.MatchRuleType != null) {
            this.MatchRuleType = new String(source.MatchRuleType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterRunningStatus != null) {
            this.ClusterRunningStatus = new String(source.ClusterRunningStatus);
        }
        if (source.FirstCreateTime != null) {
            this.FirstCreateTime = new String(source.FirstCreateTime);
        }
        if (source.LastCreateTime != null) {
            this.LastCreateTime = new String(source.LastCreateTime);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ClusterMasterIP != null) {
            this.ClusterMasterIP = new String(source.ClusterMasterIP);
        }
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.RunningComponent != null) {
            this.RunningComponent = new String[source.RunningComponent.length];
            for (int i = 0; i < source.RunningComponent.length; i++) {
                this.RunningComponent[i] = new String(source.RunningComponent[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.MatchRuleID != null) {
            this.MatchRuleID = new String(source.MatchRuleID);
        }
        if (source.HighLightFields != null) {
            this.HighLightFields = new String[source.HighLightFields.length];
            for (int i = 0; i < source.HighLightFields.length; i++) {
                this.HighLightFields[i] = new String(source.HighLightFields[i]);
            }
        }
        if (source.MatchRule != null) {
            this.MatchRule = new K8sApiAbnormalRuleScopeInfo(source.MatchRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchRuleName", this.MatchRuleName);
        this.setParamSimple(map, prefix + "MatchRuleType", this.MatchRuleType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterRunningStatus", this.ClusterRunningStatus);
        this.setParamSimple(map, prefix + "FirstCreateTime", this.FirstCreateTime);
        this.setParamSimple(map, prefix + "LastCreateTime", this.LastCreateTime);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterMasterIP", this.ClusterMasterIP);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamArraySimple(map, prefix + "RunningComponent.", this.RunningComponent);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "MatchRuleID", this.MatchRuleID);
        this.setParamArraySimple(map, prefix + "HighLightFields.", this.HighLightFields);
        this.setParamObj(map, prefix + "MatchRule.", this.MatchRule);

    }
}

