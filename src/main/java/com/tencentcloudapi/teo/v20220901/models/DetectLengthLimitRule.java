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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLengthLimitRule extends AbstractModel {

    /**
    * Rule Id. Output only.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule name. Output usage only.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule description. For output usage only.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule configuration condition. For output usage only.
    */
    @SerializedName("Conditions")
    @Expose
    private DetectLengthLimitCondition [] Conditions;

    /**
    * Handling method. Valid values:
<li>skip: When the request body data exceeds the detection depth set by body_depth in the Conditions output parameter, skip testing of all request body content;</li>
<li>scan: Only detect the detection depth set by body_depth in the Conditions output. Request body content beyond this depth is directly truncated, and the excess request body will not undergo security detection.</li>Output usage only.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get Rule Id. Output only. 
     * @return RuleId Rule Id. Output only.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule Id. Output only.
     * @param RuleId Rule Id. Output only.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule name. Output usage only. 
     * @return RuleName Rule name. Output usage only.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name. Output usage only.
     * @param RuleName Rule name. Output usage only.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule description. For output usage only. 
     * @return Description Rule description. For output usage only.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description. For output usage only.
     * @param Description Rule description. For output usage only.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Rule configuration condition. For output usage only. 
     * @return Conditions Rule configuration condition. For output usage only.
     */
    public DetectLengthLimitCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Rule configuration condition. For output usage only.
     * @param Conditions Rule configuration condition. For output usage only.
     */
    public void setConditions(DetectLengthLimitCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Handling method. Valid values:
<li>skip: When the request body data exceeds the detection depth set by body_depth in the Conditions output parameter, skip testing of all request body content;</li>
<li>scan: Only detect the detection depth set by body_depth in the Conditions output. Request body content beyond this depth is directly truncated, and the excess request body will not undergo security detection.</li>Output usage only. 
     * @return Action Handling method. Valid values:
<li>skip: When the request body data exceeds the detection depth set by body_depth in the Conditions output parameter, skip testing of all request body content;</li>
<li>scan: Only detect the detection depth set by body_depth in the Conditions output. Request body content beyond this depth is directly truncated, and the excess request body will not undergo security detection.</li>Output usage only.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Handling method. Valid values:
<li>skip: When the request body data exceeds the detection depth set by body_depth in the Conditions output parameter, skip testing of all request body content;</li>
<li>scan: Only detect the detection depth set by body_depth in the Conditions output. Request body content beyond this depth is directly truncated, and the excess request body will not undergo security detection.</li>Output usage only.
     * @param Action Handling method. Valid values:
<li>skip: When the request body data exceeds the detection depth set by body_depth in the Conditions output parameter, skip testing of all request body content;</li>
<li>scan: Only detect the detection depth set by body_depth in the Conditions output. Request body content beyond this depth is directly truncated, and the excess request body will not undergo security detection.</li>Output usage only.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public DetectLengthLimitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectLengthLimitRule(DetectLengthLimitRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Conditions != null) {
            this.Conditions = new DetectLengthLimitCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new DetectLengthLimitCondition(source.Conditions[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

