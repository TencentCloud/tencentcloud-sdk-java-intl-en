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

public class CreateK8sApiAbnormalRuleInfoRequest extends AbstractModel {

    /**
    * Rule details
    */
    @SerializedName("RuleInfo")
    @Expose
    private K8sApiAbnormalRuleInfo RuleInfo;

    /**
    * The ID of the copy rule (for copy rule scenarios)
    */
    @SerializedName("CopySrcRuleID")
    @Expose
    private String CopySrcRuleID;

    /**
    * Event ID (for adding events to an allowlist)
    */
    @SerializedName("EventID")
    @Expose
    private Long EventID;

    /**
     * Get Rule details 
     * @return RuleInfo Rule details
     */
    public K8sApiAbnormalRuleInfo getRuleInfo() {
        return this.RuleInfo;
    }

    /**
     * Set Rule details
     * @param RuleInfo Rule details
     */
    public void setRuleInfo(K8sApiAbnormalRuleInfo RuleInfo) {
        this.RuleInfo = RuleInfo;
    }

    /**
     * Get The ID of the copy rule (for copy rule scenarios) 
     * @return CopySrcRuleID The ID of the copy rule (for copy rule scenarios)
     */
    public String getCopySrcRuleID() {
        return this.CopySrcRuleID;
    }

    /**
     * Set The ID of the copy rule (for copy rule scenarios)
     * @param CopySrcRuleID The ID of the copy rule (for copy rule scenarios)
     */
    public void setCopySrcRuleID(String CopySrcRuleID) {
        this.CopySrcRuleID = CopySrcRuleID;
    }

    /**
     * Get Event ID (for adding events to an allowlist) 
     * @return EventID Event ID (for adding events to an allowlist)
     */
    public Long getEventID() {
        return this.EventID;
    }

    /**
     * Set Event ID (for adding events to an allowlist)
     * @param EventID Event ID (for adding events to an allowlist)
     */
    public void setEventID(Long EventID) {
        this.EventID = EventID;
    }

    public CreateK8sApiAbnormalRuleInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateK8sApiAbnormalRuleInfoRequest(CreateK8sApiAbnormalRuleInfoRequest source) {
        if (source.RuleInfo != null) {
            this.RuleInfo = new K8sApiAbnormalRuleInfo(source.RuleInfo);
        }
        if (source.CopySrcRuleID != null) {
            this.CopySrcRuleID = new String(source.CopySrcRuleID);
        }
        if (source.EventID != null) {
            this.EventID = new Long(source.EventID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RuleInfo.", this.RuleInfo);
        this.setParamSimple(map, prefix + "CopySrcRuleID", this.CopySrcRuleID);
        this.setParamSimple(map, prefix + "EventID", this.EventID);

    }
}

