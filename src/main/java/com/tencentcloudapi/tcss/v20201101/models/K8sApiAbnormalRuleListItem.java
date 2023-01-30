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

public class K8sApiAbnormalRuleListItem extends AbstractModel{

    /**
    * Rule ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

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
    * Total number of affected clusters
    */
    @SerializedName("EffectClusterCount")
    @Expose
    private Long EffectClusterCount;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Edit account
    */
    @SerializedName("OprUin")
    @Expose
    private String OprUin;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

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

    public K8sApiAbnormalRuleListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalRuleListItem(K8sApiAbnormalRuleListItem source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.EffectClusterCount != null) {
            this.EffectClusterCount = new Long(source.EffectClusterCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OprUin != null) {
            this.OprUin = new String(source.OprUin);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "EffectClusterCount", this.EffectClusterCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OprUin", this.OprUin);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

