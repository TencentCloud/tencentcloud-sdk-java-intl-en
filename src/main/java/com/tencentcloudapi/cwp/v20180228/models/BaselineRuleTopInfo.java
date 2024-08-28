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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineRuleTopInfo extends AbstractModel {

    /**
    * Baseline detection item name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Detection item hazard level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Total number of events
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * Detection Item ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get Baseline detection item name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleName Baseline detection item name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Baseline detection item name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleName Baseline detection item name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Detection item hazard level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Detection item hazard level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Detection item hazard level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Detection item hazard level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Total number of events
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventCount Total number of events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set Total number of events
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventCount Total number of events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get Detection Item ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Detection Item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Detection Item ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Detection Item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public BaselineRuleTopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRuleTopInfo(BaselineRuleTopInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

