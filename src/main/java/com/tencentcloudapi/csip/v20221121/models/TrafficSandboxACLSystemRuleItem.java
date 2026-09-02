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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxACLSystemRuleItem extends AbstractModel {

    /**
    * System rule ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * System rule content
    */
    @SerializedName("RuleContent")
    @Expose
    private TrafficSandboxACLRuleContentItem [] RuleContent;

    /**
     * Get System rule ID 
     * @return ID System rule ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set System rule ID
     * @param ID System rule ID
     */
    public void setID(Long ID) {
        this.ID = ID;
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
     * Get System rule content 
     * @return RuleContent System rule content
     */
    public TrafficSandboxACLRuleContentItem [] getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set System rule content
     * @param RuleContent System rule content
     */
    public void setRuleContent(TrafficSandboxACLRuleContentItem [] RuleContent) {
        this.RuleContent = RuleContent;
    }

    public TrafficSandboxACLSystemRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxACLSystemRuleItem(TrafficSandboxACLSystemRuleItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new TrafficSandboxACLRuleContentItem[source.RuleContent.length];
            for (int i = 0; i < source.RuleContent.length; i++) {
                this.RuleContent[i] = new TrafficSandboxACLRuleContentItem(source.RuleContent[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "RuleContent.", this.RuleContent);

    }
}

