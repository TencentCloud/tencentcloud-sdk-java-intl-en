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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAllocationRuleRequest extends AbstractModel {

    /**
    * The deleted sharing rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Month, which is the current month by default if not provided.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get The deleted sharing rule ID. 
     * @return RuleId The deleted sharing rule ID.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The deleted sharing rule ID.
     * @param RuleId The deleted sharing rule ID.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Month, which is the current month by default if not provided. 
     * @return Month Month, which is the current month by default if not provided.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Month, which is the current month by default if not provided.
     * @param Month Month, which is the current month by default if not provided.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public DeleteAllocationRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAllocationRuleRequest(DeleteAllocationRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

