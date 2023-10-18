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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatSequenceRulesRequest extends AbstractModel {

    /**
    * Rule sequence number. Values: `OrderIndex` (Original sequence number), `NewOrderIndex` (New sequence number)
    */
    @SerializedName("RuleChangeItems")
    @Expose
    private RuleChangeItem [] RuleChangeItems;

    /**
    * Rule direction. Values: `1` (Inbound) and `0` (Outbound)
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get Rule sequence number. Values: `OrderIndex` (Original sequence number), `NewOrderIndex` (New sequence number) 
     * @return RuleChangeItems Rule sequence number. Values: `OrderIndex` (Original sequence number), `NewOrderIndex` (New sequence number)
     */
    public RuleChangeItem [] getRuleChangeItems() {
        return this.RuleChangeItems;
    }

    /**
     * Set Rule sequence number. Values: `OrderIndex` (Original sequence number), `NewOrderIndex` (New sequence number)
     * @param RuleChangeItems Rule sequence number. Values: `OrderIndex` (Original sequence number), `NewOrderIndex` (New sequence number)
     */
    public void setRuleChangeItems(RuleChangeItem [] RuleChangeItems) {
        this.RuleChangeItems = RuleChangeItems;
    }

    /**
     * Get Rule direction. Values: `1` (Inbound) and `0` (Outbound) 
     * @return Direction Rule direction. Values: `1` (Inbound) and `0` (Outbound)
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Rule direction. Values: `1` (Inbound) and `0` (Outbound)
     * @param Direction Rule direction. Values: `1` (Inbound) and `0` (Outbound)
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public ModifyNatSequenceRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatSequenceRulesRequest(ModifyNatSequenceRulesRequest source) {
        if (source.RuleChangeItems != null) {
            this.RuleChangeItems = new RuleChangeItem[source.RuleChangeItems.length];
            for (int i = 0; i < source.RuleChangeItems.length; i++) {
                this.RuleChangeItems[i] = new RuleChangeItem(source.RuleChangeItems[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleChangeItems.", this.RuleChangeItems);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

