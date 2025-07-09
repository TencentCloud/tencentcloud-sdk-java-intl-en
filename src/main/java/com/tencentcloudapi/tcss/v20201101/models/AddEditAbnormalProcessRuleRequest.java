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

public class AddEditAbnormalProcessRuleRequest extends AbstractModel {

    /**
    * Information of the added policy. The policy ID is empty here but cannot be empty when you edit a policy.
    */
    @SerializedName("RuleInfo")
    @Expose
    private AbnormalProcessRuleInfo RuleInfo;

    /**
    * Required only when an item is allowed
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get Information of the added policy. The policy ID is empty here but cannot be empty when you edit a policy. 
     * @return RuleInfo Information of the added policy. The policy ID is empty here but cannot be empty when you edit a policy.
     */
    public AbnormalProcessRuleInfo getRuleInfo() {
        return this.RuleInfo;
    }

    /**
     * Set Information of the added policy. The policy ID is empty here but cannot be empty when you edit a policy.
     * @param RuleInfo Information of the added policy. The policy ID is empty here but cannot be empty when you edit a policy.
     */
    public void setRuleInfo(AbnormalProcessRuleInfo RuleInfo) {
        this.RuleInfo = RuleInfo;
    }

    /**
     * Get Required only when an item is allowed 
     * @return EventId Required only when an item is allowed
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Required only when an item is allowed
     * @param EventId Required only when an item is allowed
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public AddEditAbnormalProcessRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEditAbnormalProcessRuleRequest(AddEditAbnormalProcessRuleRequest source) {
        if (source.RuleInfo != null) {
            this.RuleInfo = new AbnormalProcessRuleInfo(source.RuleInfo);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RuleInfo.", this.RuleInfo);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

