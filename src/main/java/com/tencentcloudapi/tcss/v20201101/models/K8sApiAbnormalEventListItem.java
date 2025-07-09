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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sApiAbnormalEventListItem extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Hit rule type
    */
    @SerializedName("MatchRuleType")
    @Expose
    private String MatchRuleType;

    /**
    * Threat level
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
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Rule type
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Solution
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Hit rule
    */
    @SerializedName("MatchRule")
    @Expose
    private K8sApiAbnormalRuleScopeInfo MatchRule;

    /**
     * Get Event ID 
     * @return ID Event ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Event ID
     * @param ID Event ID
     */
    public void setID(Long ID) {
        this.ID = ID;
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
     * Get Threat level 
     * @return RiskLevel Threat level
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Threat level
     * @param RiskLevel Threat level
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
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Rule type 
     * @return RuleType Rule type
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type
     * @param RuleType Rule type
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
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
     * Get Solution 
     * @return Suggestion Solution
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Solution
     * @param Suggestion Solution
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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

    public K8sApiAbnormalEventListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalEventListItem(K8sApiAbnormalEventListItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
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
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MatchRule != null) {
            this.MatchRule = new K8sApiAbnormalRuleScopeInfo(source.MatchRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "MatchRuleType", this.MatchRuleType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterRunningStatus", this.ClusterRunningStatus);
        this.setParamSimple(map, prefix + "FirstCreateTime", this.FirstCreateTime);
        this.setParamSimple(map, prefix + "LastCreateTime", this.LastCreateTime);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamObj(map, prefix + "MatchRule.", this.MatchRule);

    }
}

