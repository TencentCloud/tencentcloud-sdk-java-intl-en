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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataGovernPolicy extends AbstractModel {

    /**
    * Governance rule type. Valid values: `Customize` (custom) and `Intelligence` (intelligent).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * The governance engine.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GovernEngine")
    @Expose
    private String GovernEngine;

    /**
     * Get Governance rule type. Valid values: `Customize` (custom) and `Intelligence` (intelligent).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleType Governance rule type. Valid values: `Customize` (custom) and `Intelligence` (intelligent).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Governance rule type. Valid values: `Customize` (custom) and `Intelligence` (intelligent).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleType Governance rule type. Valid values: `Customize` (custom) and `Intelligence` (intelligent).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get The governance engine.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GovernEngine The governance engine.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGovernEngine() {
        return this.GovernEngine;
    }

    /**
     * Set The governance engine.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GovernEngine The governance engine.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGovernEngine(String GovernEngine) {
        this.GovernEngine = GovernEngine;
    }

    public DataGovernPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataGovernPolicy(DataGovernPolicy source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.GovernEngine != null) {
            this.GovernEngine = new String(source.GovernEngine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "GovernEngine", this.GovernEngine);

    }
}

