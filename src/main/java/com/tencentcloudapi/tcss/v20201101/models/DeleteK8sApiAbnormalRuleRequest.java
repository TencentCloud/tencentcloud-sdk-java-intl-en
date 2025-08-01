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

public class DeleteK8sApiAbnormalRuleRequest extends AbstractModel {

    /**
    * Rule ID set
    */
    @SerializedName("RuleIDSet")
    @Expose
    private String [] RuleIDSet;

    /**
     * Get Rule ID set 
     * @return RuleIDSet Rule ID set
     */
    public String [] getRuleIDSet() {
        return this.RuleIDSet;
    }

    /**
     * Set Rule ID set
     * @param RuleIDSet Rule ID set
     */
    public void setRuleIDSet(String [] RuleIDSet) {
        this.RuleIDSet = RuleIDSet;
    }

    public DeleteK8sApiAbnormalRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteK8sApiAbnormalRuleRequest(DeleteK8sApiAbnormalRuleRequest source) {
        if (source.RuleIDSet != null) {
            this.RuleIDSet = new String[source.RuleIDSet.length];
            for (int i = 0; i < source.RuleIDSet.length; i++) {
                this.RuleIDSet[i] = new String(source.RuleIDSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleIDSet.", this.RuleIDSet);

    }
}

