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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotManagementCustomRules extends AbstractModel {

    /**
    * List of Bot custom Rules. When using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> If the Rules parameter in SecurityPolicy.BotManagement.CustomRules is not specified, or the Rules parameter length is zero: clear all Bot custom rule configurations.</li> <li> If the CustomRules parameter value is not specified in the SecurityPolicy.BotManagement parameters: keep the existing Bot custom rule configuration without modification.</li>
    */
    @SerializedName("Rules")
    @Expose
    private BotManagementCustomRule [] Rules;

    /**
     * Get List of Bot custom Rules. When using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> If the Rules parameter in SecurityPolicy.BotManagement.CustomRules is not specified, or the Rules parameter length is zero: clear all Bot custom rule configurations.</li> <li> If the CustomRules parameter value is not specified in the SecurityPolicy.BotManagement parameters: keep the existing Bot custom rule configuration without modification.</li> 
     * @return Rules List of Bot custom Rules. When using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> If the Rules parameter in SecurityPolicy.BotManagement.CustomRules is not specified, or the Rules parameter length is zero: clear all Bot custom rule configurations.</li> <li> If the CustomRules parameter value is not specified in the SecurityPolicy.BotManagement parameters: keep the existing Bot custom rule configuration without modification.</li>
     */
    public BotManagementCustomRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set List of Bot custom Rules. When using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> If the Rules parameter in SecurityPolicy.BotManagement.CustomRules is not specified, or the Rules parameter length is zero: clear all Bot custom rule configurations.</li> <li> If the CustomRules parameter value is not specified in the SecurityPolicy.BotManagement parameters: keep the existing Bot custom rule configuration without modification.</li>
     * @param Rules List of Bot custom Rules. When using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> If the Rules parameter in SecurityPolicy.BotManagement.CustomRules is not specified, or the Rules parameter length is zero: clear all Bot custom rule configurations.</li> <li> If the CustomRules parameter value is not specified in the SecurityPolicy.BotManagement parameters: keep the existing Bot custom rule configuration without modification.</li>
     */
    public void setRules(BotManagementCustomRule [] Rules) {
        this.Rules = Rules;
    }

    public BotManagementCustomRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagementCustomRules(BotManagementCustomRules source) {
        if (source.Rules != null) {
            this.Rules = new BotManagementCustomRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new BotManagementCustomRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

