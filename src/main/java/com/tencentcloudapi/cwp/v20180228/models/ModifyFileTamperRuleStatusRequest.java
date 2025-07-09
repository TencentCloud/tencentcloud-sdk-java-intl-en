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

public class ModifyFileTamperRuleStatusRequest extends AbstractModel {

    /**
    * 0: enable; 1: disable; 2: delete
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Corresponding event ID
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * Whether a system rule: 0: system rule; 1: user defined rule. System rule Status cannot be deleted.
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
     * Get 0: enable; 1: disable; 2: delete 
     * @return Status 0: enable; 1: disable; 2: delete
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: enable; 1: disable; 2: delete
     * @param Status 0: enable; 1: disable; 2: delete
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Corresponding event ID 
     * @return Ids Corresponding event ID
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set Corresponding event ID
     * @param Ids Corresponding event ID
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Whether a system rule: 0: system rule; 1: user defined rule. System rule Status cannot be deleted. 
     * @return RuleCategory Whether a system rule: 0: system rule; 1: user defined rule. System rule Status cannot be deleted.
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set Whether a system rule: 0: system rule; 1: user defined rule. System rule Status cannot be deleted.
     * @param RuleCategory Whether a system rule: 0: system rule; 1: user defined rule. System rule Status cannot be deleted.
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    public ModifyFileTamperRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileTamperRuleStatusRequest(ModifyFileTamperRuleStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);

    }
}

