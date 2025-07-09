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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebHookRuleSummary extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Robot Address
    */
    @SerializedName("HookAddr")
    @Expose
    private String HookAddr;

    /**
    * Remarks
    */
    @SerializedName("RuleRemark")
    @Expose
    private String RuleRemark;

    /**
    * Event type
    */
    @SerializedName("RuleItems")
    @Expose
    private WebHookEventKv [] RuleItems;

    /**
    * Host range
    */
    @SerializedName("HostLabels")
    @Expose
    private WebHookHostLabel [] HostLabels;

    /**
    * Enable/Disable [1-Disable, 0-Enable]
    */
    @SerializedName("IsDisabled")
    @Expose
    private Long IsDisabled;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Number of hosts
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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
     * Get Robot Address 
     * @return HookAddr Robot Address
     */
    public String getHookAddr() {
        return this.HookAddr;
    }

    /**
     * Set Robot Address
     * @param HookAddr Robot Address
     */
    public void setHookAddr(String HookAddr) {
        this.HookAddr = HookAddr;
    }

    /**
     * Get Remarks 
     * @return RuleRemark Remarks
     */
    public String getRuleRemark() {
        return this.RuleRemark;
    }

    /**
     * Set Remarks
     * @param RuleRemark Remarks
     */
    public void setRuleRemark(String RuleRemark) {
        this.RuleRemark = RuleRemark;
    }

    /**
     * Get Event type 
     * @return RuleItems Event type
     */
    public WebHookEventKv [] getRuleItems() {
        return this.RuleItems;
    }

    /**
     * Set Event type
     * @param RuleItems Event type
     */
    public void setRuleItems(WebHookEventKv [] RuleItems) {
        this.RuleItems = RuleItems;
    }

    /**
     * Get Host range 
     * @return HostLabels Host range
     */
    public WebHookHostLabel [] getHostLabels() {
        return this.HostLabels;
    }

    /**
     * Set Host range
     * @param HostLabels Host range
     */
    public void setHostLabels(WebHookHostLabel [] HostLabels) {
        this.HostLabels = HostLabels;
    }

    /**
     * Get Enable/Disable [1-Disable, 0-Enable] 
     * @return IsDisabled Enable/Disable [1-Disable, 0-Enable]
     */
    public Long getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set Enable/Disable [1-Disable, 0-Enable]
     * @param IsDisabled Enable/Disable [1-Disable, 0-Enable]
     */
    public void setIsDisabled(Long IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get Number of hosts 
     * @return HostCount Number of hosts
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of hosts
     * @param HostCount Number of hosts
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    public WebHookRuleSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebHookRuleSummary(WebHookRuleSummary source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.HookAddr != null) {
            this.HookAddr = new String(source.HookAddr);
        }
        if (source.RuleRemark != null) {
            this.RuleRemark = new String(source.RuleRemark);
        }
        if (source.RuleItems != null) {
            this.RuleItems = new WebHookEventKv[source.RuleItems.length];
            for (int i = 0; i < source.RuleItems.length; i++) {
                this.RuleItems[i] = new WebHookEventKv(source.RuleItems[i]);
            }
        }
        if (source.HostLabels != null) {
            this.HostLabels = new WebHookHostLabel[source.HostLabels.length];
            for (int i = 0; i < source.HostLabels.length; i++) {
                this.HostLabels[i] = new WebHookHostLabel(source.HostLabels[i]);
            }
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Long(source.IsDisabled);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "HookAddr", this.HookAddr);
        this.setParamSimple(map, prefix + "RuleRemark", this.RuleRemark);
        this.setParamArrayObj(map, prefix + "RuleItems.", this.RuleItems);
        this.setParamArrayObj(map, prefix + "HostLabels.", this.HostLabels);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);

    }
}

