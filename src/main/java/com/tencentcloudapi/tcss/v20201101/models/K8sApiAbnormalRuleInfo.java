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

public class K8sApiAbnormalRuleInfo extends AbstractModel{

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Rule information list
    */
    @SerializedName("RuleInfoList")
    @Expose
    private K8sApiAbnormalRuleScopeInfo [] RuleInfoList;

    /**
    * Effective cluster IDSet
    */
    @SerializedName("EffectClusterIDSet")
    @Expose
    private String [] EffectClusterIDSet;

    /**
    * Rule type
RT_SYSTEM: System rules
RT_USER: User-defined rules
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Whether all clusters are effective
    */
    @SerializedName("EffectAllCluster")
    @Expose
    private Boolean EffectAllCluster;

    /**
    * Rule ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

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
     * Get Rule information list 
     * @return RuleInfoList Rule information list
     */
    public K8sApiAbnormalRuleScopeInfo [] getRuleInfoList() {
        return this.RuleInfoList;
    }

    /**
     * Set Rule information list
     * @param RuleInfoList Rule information list
     */
    public void setRuleInfoList(K8sApiAbnormalRuleScopeInfo [] RuleInfoList) {
        this.RuleInfoList = RuleInfoList;
    }

    /**
     * Get Effective cluster IDSet 
     * @return EffectClusterIDSet Effective cluster IDSet
     */
    public String [] getEffectClusterIDSet() {
        return this.EffectClusterIDSet;
    }

    /**
     * Set Effective cluster IDSet
     * @param EffectClusterIDSet Effective cluster IDSet
     */
    public void setEffectClusterIDSet(String [] EffectClusterIDSet) {
        this.EffectClusterIDSet = EffectClusterIDSet;
    }

    /**
     * Get Rule type
RT_SYSTEM: System rules
RT_USER: User-defined rules 
     * @return RuleType Rule type
RT_SYSTEM: System rules
RT_USER: User-defined rules
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type
RT_SYSTEM: System rules
RT_USER: User-defined rules
     * @param RuleType Rule type
RT_SYSTEM: System rules
RT_USER: User-defined rules
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Whether all clusters are effective 
     * @return EffectAllCluster Whether all clusters are effective
     */
    public Boolean getEffectAllCluster() {
        return this.EffectAllCluster;
    }

    /**
     * Set Whether all clusters are effective
     * @param EffectAllCluster Whether all clusters are effective
     */
    public void setEffectAllCluster(Boolean EffectAllCluster) {
        this.EffectAllCluster = EffectAllCluster;
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

    public K8sApiAbnormalRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalRuleInfo(K8sApiAbnormalRuleInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.RuleInfoList != null) {
            this.RuleInfoList = new K8sApiAbnormalRuleScopeInfo[source.RuleInfoList.length];
            for (int i = 0; i < source.RuleInfoList.length; i++) {
                this.RuleInfoList[i] = new K8sApiAbnormalRuleScopeInfo(source.RuleInfoList[i]);
            }
        }
        if (source.EffectClusterIDSet != null) {
            this.EffectClusterIDSet = new String[source.EffectClusterIDSet.length];
            for (int i = 0; i < source.EffectClusterIDSet.length; i++) {
                this.EffectClusterIDSet[i] = new String(source.EffectClusterIDSet[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.EffectAllCluster != null) {
            this.EffectAllCluster = new Boolean(source.EffectAllCluster);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "RuleInfoList.", this.RuleInfoList);
        this.setParamArraySimple(map, prefix + "EffectClusterIDSet.", this.EffectClusterIDSet);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "EffectAllCluster", this.EffectAllCluster);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);

    }
}

