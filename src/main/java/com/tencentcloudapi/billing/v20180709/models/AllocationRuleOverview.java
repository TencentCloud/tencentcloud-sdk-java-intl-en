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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationRuleOverview extends AbstractModel {

    /**
    * Sharing rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Sharing rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Public area policy type.
Enumeration value.
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Last update time of the sharing rules.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Overview of cost allocation units.
    */
    @SerializedName("AllocationNode")
    @Expose
    private AllocationUnit [] AllocationNode;

    /**
     * Get Sharing rule ID. 
     * @return RuleId Sharing rule ID.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Sharing rule ID.
     * @param RuleId Sharing rule ID.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Sharing rule name. 
     * @return RuleName Sharing rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Sharing rule name.
     * @param RuleName Sharing rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Public area policy type.
Enumeration value.
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion. 
     * @return Type Public area policy type.
Enumeration value.
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Public area policy type.
Enumeration value.
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion.
     * @param Type Public area policy type.
Enumeration value.
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Last update time of the sharing rules. 
     * @return UpdateTime Last update time of the sharing rules.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time of the sharing rules.
     * @param UpdateTime Last update time of the sharing rules.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Overview of cost allocation units. 
     * @return AllocationNode Overview of cost allocation units.
     */
    public AllocationUnit [] getAllocationNode() {
        return this.AllocationNode;
    }

    /**
     * Set Overview of cost allocation units.
     * @param AllocationNode Overview of cost allocation units.
     */
    public void setAllocationNode(AllocationUnit [] AllocationNode) {
        this.AllocationNode = AllocationNode;
    }

    public AllocationRuleOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationRuleOverview(AllocationRuleOverview source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AllocationNode != null) {
            this.AllocationNode = new AllocationUnit[source.AllocationNode.length];
            for (int i = 0; i < source.AllocationNode.length; i++) {
                this.AllocationNode[i] = new AllocationUnit(source.AllocationNode[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "AllocationNode.", this.AllocationNode);

    }
}

