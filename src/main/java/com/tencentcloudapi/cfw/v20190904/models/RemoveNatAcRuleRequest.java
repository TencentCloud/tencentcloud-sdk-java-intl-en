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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveNatAcRuleRequest extends AbstractModel{

    /**
    * UUIDs of the rules to delete, which can be obtained by querying the rule list. Note: If [-1] is passed in, all rules are deleted.
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long [] RuleUuid;

    /**
    * Rule direction. Valid values: 1: inbound; 0: outbound.
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get UUIDs of the rules to delete, which can be obtained by querying the rule list. Note: If [-1] is passed in, all rules are deleted. 
     * @return RuleUuid UUIDs of the rules to delete, which can be obtained by querying the rule list. Note: If [-1] is passed in, all rules are deleted.
     */
    public Long [] getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set UUIDs of the rules to delete, which can be obtained by querying the rule list. Note: If [-1] is passed in, all rules are deleted.
     * @param RuleUuid UUIDs of the rules to delete, which can be obtained by querying the rule list. Note: If [-1] is passed in, all rules are deleted.
     */
    public void setRuleUuid(Long [] RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    /**
     * Get Rule direction. Valid values: 1: inbound; 0: outbound. 
     * @return Direction Rule direction. Valid values: 1: inbound; 0: outbound.
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Rule direction. Valid values: 1: inbound; 0: outbound.
     * @param Direction Rule direction. Valid values: 1: inbound; 0: outbound.
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public RemoveNatAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveNatAcRuleRequest(RemoveNatAcRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long[source.RuleUuid.length];
            for (int i = 0; i < source.RuleUuid.length; i++) {
                this.RuleUuid[i] = new Long(source.RuleUuid[i]);
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
        this.setParamArraySimple(map, prefix + "RuleUuid.", this.RuleUuid);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

