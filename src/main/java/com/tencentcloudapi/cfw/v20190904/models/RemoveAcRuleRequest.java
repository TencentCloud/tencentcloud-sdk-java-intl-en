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

public class RemoveAcRuleRequest extends AbstractModel{

    /**
    * UUID of the rule, which can be obtained by querying the rule list
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
     * Get UUID of the rule, which can be obtained by querying the rule list 
     * @return RuleUuid UUID of the rule, which can be obtained by querying the rule list
     */
    public Long getRuleUuid() {
        return this.RuleUuid;
    }

    /**
     * Set UUID of the rule, which can be obtained by querying the rule list
     * @param RuleUuid UUID of the rule, which can be obtained by querying the rule list
     */
    public void setRuleUuid(Long RuleUuid) {
        this.RuleUuid = RuleUuid;
    }

    public RemoveAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveAcRuleRequest(RemoveAcRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);

    }
}

