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

public class ModifyEnterpriseSecurityGroupRuleRequest extends AbstractModel {

    /**
    * UUID of the rule, which can be obtained by querying the rule list
    */
    @SerializedName("RuleUuid")
    @Expose
    private Long RuleUuid;

    /**
    * Modification type. Values: `0` (Modify rule content), `1` (Toggle on/off a rule) and `2` (Toggle on/off all rules)
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * The new rule content you want. It’s only required when you want to modify the rule content (`ModifyType=0`)
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupRule Data;

    /**
    * `0`: Do not enable; `1`: Enable
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

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
     * Get Modification type. Values: `0` (Modify rule content), `1` (Toggle on/off a rule) and `2` (Toggle on/off all rules) 
     * @return ModifyType Modification type. Values: `0` (Modify rule content), `1` (Toggle on/off a rule) and `2` (Toggle on/off all rules)
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Modification type. Values: `0` (Modify rule content), `1` (Toggle on/off a rule) and `2` (Toggle on/off all rules)
     * @param ModifyType Modification type. Values: `0` (Modify rule content), `1` (Toggle on/off a rule) and `2` (Toggle on/off all rules)
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get The new rule content you want. It’s only required when you want to modify the rule content (`ModifyType=0`) 
     * @return Data The new rule content you want. It’s only required when you want to modify the rule content (`ModifyType=0`)
     */
    public SecurityGroupRule getData() {
        return this.Data;
    }

    /**
     * Set The new rule content you want. It’s only required when you want to modify the rule content (`ModifyType=0`)
     * @param Data The new rule content you want. It’s only required when you want to modify the rule content (`ModifyType=0`)
     */
    public void setData(SecurityGroupRule Data) {
        this.Data = Data;
    }

    /**
     * Get `0`: Do not enable; `1`: Enable 
     * @return Enable `0`: Do not enable; `1`: Enable
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set `0`: Do not enable; `1`: Enable
     * @param Enable `0`: Do not enable; `1`: Enable
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyEnterpriseSecurityGroupRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnterpriseSecurityGroupRuleRequest(ModifyEnterpriseSecurityGroupRuleRequest source) {
        if (source.RuleUuid != null) {
            this.RuleUuid = new Long(source.RuleUuid);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.Data != null) {
            this.Data = new SecurityGroupRule(source.Data);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleUuid", this.RuleUuid);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

