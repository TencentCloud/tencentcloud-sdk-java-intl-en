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

public class RemoveEnterpriseSecurityGroupRuleRequest extends AbstractModel{

    /**
    * UUID of the rule, which can be obtained by querying the rule list
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * Type of deletion. 0: delete a single entry, and enter ID of the deleted rule for RuleUuid; 1: delete all, and enter 0 for RuleUuid
    */
    @SerializedName("RemoveType")
    @Expose
    private Long RemoveType;

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

    /**
     * Get Type of deletion. 0: delete a single entry, and enter ID of the deleted rule for RuleUuid; 1: delete all, and enter 0 for RuleUuid 
     * @return RemoveType Type of deletion. 0: delete a single entry, and enter ID of the deleted rule for RuleUuid; 1: delete all, and enter 0 for RuleUuid
     */
    public Long getRemoveType() {
        return this.RemoveType;
    }

    /**
     * Set Type of deletion. 0: delete a single entry, and enter ID of the deleted rule for RuleUuid; 1: delete all, and enter 0 for RuleUuid
     * @param RemoveType Type of deletion. 0: delete a single entry, and enter ID of the deleted rule for RuleUuid; 1: delete all, and enter 0 for RuleUuid
     */
    public void setRemoveType(Long RemoveType) {
        this.RemoveType = RemoveType;
    }

    public RemoveEnterpriseSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveEnterpriseSecurityGroupRuleRequest(RemoveEnterpriseSecurityGroupRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.RemoveType != null) {
            this.RemoveType = new Long(source.RemoveType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "RemoveType", this.RemoveType);

    }
}

