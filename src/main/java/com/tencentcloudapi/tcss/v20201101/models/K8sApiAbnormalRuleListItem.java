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

public class K8sApiAbnormalRuleListItem extends AbstractModel {

    /**
    * Whether take effect on all clusters. true indicates all clusters take effect. false indicates only specified clusters take effect.
    */
    @SerializedName("EffectAllCluster")
    @Expose
    private Boolean EffectAllCluster;

    /**
    * Total number of affected clusters
    */
    @SerializedName("EffectClusterCount")
    @Expose
    private Long EffectClusterCount;

    /**
    * Edit account
    */
    @SerializedName("OprUin")
    @Expose
    private String OprUin;

    /**
    * Deduplicated list of ALL execution actions in the rule group. The present blocklist contains only RULE_MODE_ALERT (Alert).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleActions")
    @Expose
    private String [] RuleActions;

    /**
    * Rule ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Subrule content list, deserialized from rule_details JSON
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleInfoList")
    @Expose
    private K8sApiAbnormalRuleScopeInfo [] RuleInfoList;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule type
RT_SYSTEM System rules
RT_USER User defined
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Whether take effect on all clusters. true indicates all clusters take effect. false indicates only specified clusters take effect. 
     * @return EffectAllCluster Whether take effect on all clusters. true indicates all clusters take effect. false indicates only specified clusters take effect.
     */
    public Boolean getEffectAllCluster() {
        return this.EffectAllCluster;
    }

    /**
     * Set Whether take effect on all clusters. true indicates all clusters take effect. false indicates only specified clusters take effect.
     * @param EffectAllCluster Whether take effect on all clusters. true indicates all clusters take effect. false indicates only specified clusters take effect.
     */
    public void setEffectAllCluster(Boolean EffectAllCluster) {
        this.EffectAllCluster = EffectAllCluster;
    }

    /**
     * Get Total number of affected clusters 
     * @return EffectClusterCount Total number of affected clusters
     */
    public Long getEffectClusterCount() {
        return this.EffectClusterCount;
    }

    /**
     * Set Total number of affected clusters
     * @param EffectClusterCount Total number of affected clusters
     */
    public void setEffectClusterCount(Long EffectClusterCount) {
        this.EffectClusterCount = EffectClusterCount;
    }

    /**
     * Get Edit account 
     * @return OprUin Edit account
     */
    public String getOprUin() {
        return this.OprUin;
    }

    /**
     * Set Edit account
     * @param OprUin Edit account
     */
    public void setOprUin(String OprUin) {
        this.OprUin = OprUin;
    }

    /**
     * Get Deduplicated list of ALL execution actions in the rule group. The present blocklist contains only RULE_MODE_ALERT (Alert).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleActions Deduplicated list of ALL execution actions in the rule group. The present blocklist contains only RULE_MODE_ALERT (Alert).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set Deduplicated list of ALL execution actions in the rule group. The present blocklist contains only RULE_MODE_ALERT (Alert).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleActions Deduplicated list of ALL execution actions in the rule group. The present blocklist contains only RULE_MODE_ALERT (Alert).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleActions(String [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get Rule ID 
     * @return RuleID Rule ID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID
     * @param RuleID Rule ID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Subrule content list, deserialized from rule_details JSON
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleInfoList Subrule content list, deserialized from rule_details JSON
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public K8sApiAbnormalRuleScopeInfo [] getRuleInfoList() {
        return this.RuleInfoList;
    }

    /**
     * Set Subrule content list, deserialized from rule_details JSON
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleInfoList Subrule content list, deserialized from rule_details JSON
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleInfoList(K8sApiAbnormalRuleScopeInfo [] RuleInfoList) {
        this.RuleInfoList = RuleInfoList;
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
     * Get Rule type
RT_SYSTEM System rules
RT_USER User defined 
     * @return RuleType Rule type
RT_SYSTEM System rules
RT_USER User defined
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type
RT_SYSTEM System rules
RT_USER User defined
     * @param RuleType Rule type
RT_SYSTEM System rules
RT_USER User defined
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public K8sApiAbnormalRuleListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalRuleListItem(K8sApiAbnormalRuleListItem source) {
        if (source.EffectAllCluster != null) {
            this.EffectAllCluster = new Boolean(source.EffectAllCluster);
        }
        if (source.EffectClusterCount != null) {
            this.EffectClusterCount = new Long(source.EffectClusterCount);
        }
        if (source.OprUin != null) {
            this.OprUin = new String(source.OprUin);
        }
        if (source.RuleActions != null) {
            this.RuleActions = new String[source.RuleActions.length];
            for (int i = 0; i < source.RuleActions.length; i++) {
                this.RuleActions[i] = new String(source.RuleActions[i]);
            }
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleInfoList != null) {
            this.RuleInfoList = new K8sApiAbnormalRuleScopeInfo[source.RuleInfoList.length];
            for (int i = 0; i < source.RuleInfoList.length; i++) {
                this.RuleInfoList[i] = new K8sApiAbnormalRuleScopeInfo(source.RuleInfoList[i]);
            }
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EffectAllCluster", this.EffectAllCluster);
        this.setParamSimple(map, prefix + "EffectClusterCount", this.EffectClusterCount);
        this.setParamSimple(map, prefix + "OprUin", this.OprUin);
        this.setParamArraySimple(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArrayObj(map, prefix + "RuleInfoList.", this.RuleInfoList);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

