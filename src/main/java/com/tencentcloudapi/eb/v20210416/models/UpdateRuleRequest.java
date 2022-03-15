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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRuleRequest extends AbstractModel{

    /**
    * Event rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Event bus ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Switch.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Rule description, which can contain up to 200 characters of any type.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Event rule name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get Event rule ID 
     * @return RuleId Event rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Event rule ID
     * @param RuleId Event rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Event bus ID 
     * @return EventBusId Event bus ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set Event bus ID
     * @param EventBusId Event bus ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get Switch. 
     * @return Enable Switch.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Switch.
     * @param Enable Switch.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Rule description, which can contain up to 200 characters of any type. 
     * @return Description Rule description, which can contain up to 200 characters of any type.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description, which can contain up to 200 characters of any type.
     * @param Description Rule description, which can contain up to 200 characters of any type.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Event rule name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter 
     * @return RuleName Event rule name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Event rule name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     * @param RuleName Event rule name, which can contain 2–60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public UpdateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRuleRequest(UpdateRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

