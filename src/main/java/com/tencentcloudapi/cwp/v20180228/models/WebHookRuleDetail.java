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

public class WebHookRuleDetail extends AbstractModel {

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Chatbot address
    */
    @SerializedName("HookAddr")
    @Expose
    private String HookAddr;

    /**
    * Event type
    */
    @SerializedName("RuleItems")
    @Expose
    private WebHookEventKv [] RuleItems;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Remarks
    */
    @SerializedName("RuleRemark")
    @Expose
    private String RuleRemark;

    /**
    * Host scope
    */
    @SerializedName("HostLabels")
    @Expose
    private WebHookHostLabel [] HostLabels;

    /**
    * Host ID List
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * Whether it is disabled [1: disabled|0: enabled]
    */
    @SerializedName("IsDisabled")
    @Expose
    private Long IsDisabled;

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
     * Get Chatbot address 
     * @return HookAddr Chatbot address
     */
    public String getHookAddr() {
        return this.HookAddr;
    }

    /**
     * Set Chatbot address
     * @param HookAddr Chatbot address
     */
    public void setHookAddr(String HookAddr) {
        this.HookAddr = HookAddr;
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
     * Get Host scope 
     * @return HostLabels Host scope
     */
    public WebHookHostLabel [] getHostLabels() {
        return this.HostLabels;
    }

    /**
     * Set Host scope
     * @param HostLabels Host scope
     */
    public void setHostLabels(WebHookHostLabel [] HostLabels) {
        this.HostLabels = HostLabels;
    }

    /**
     * Get Host ID List 
     * @return HostIds Host ID List
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set Host ID List
     * @param HostIds Host ID List
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get Whether it is disabled [1: disabled|0: enabled] 
     * @return IsDisabled Whether it is disabled [1: disabled|0: enabled]
     */
    public Long getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set Whether it is disabled [1: disabled|0: enabled]
     * @param IsDisabled Whether it is disabled [1: disabled|0: enabled]
     */
    public void setIsDisabled(Long IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    public WebHookRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebHookRuleDetail(WebHookRuleDetail source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.HookAddr != null) {
            this.HookAddr = new String(source.HookAddr);
        }
        if (source.RuleItems != null) {
            this.RuleItems = new WebHookEventKv[source.RuleItems.length];
            for (int i = 0; i < source.RuleItems.length; i++) {
                this.RuleItems[i] = new WebHookEventKv(source.RuleItems[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleRemark != null) {
            this.RuleRemark = new String(source.RuleRemark);
        }
        if (source.HostLabels != null) {
            this.HostLabels = new WebHookHostLabel[source.HostLabels.length];
            for (int i = 0; i < source.HostLabels.length; i++) {
                this.HostLabels[i] = new WebHookHostLabel(source.HostLabels[i]);
            }
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Long(source.IsDisabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "HookAddr", this.HookAddr);
        this.setParamArrayObj(map, prefix + "RuleItems.", this.RuleItems);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleRemark", this.RuleRemark);
        this.setParamArrayObj(map, prefix + "HostLabels.", this.HostLabels);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);

    }
}

