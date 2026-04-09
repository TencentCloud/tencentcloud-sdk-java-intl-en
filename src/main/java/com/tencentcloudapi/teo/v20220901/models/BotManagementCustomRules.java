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
    * List of Bot custom Rules. when using ModifySecurityPolicy to modify Web protection configuration: <br> <li> if Rules in SecurityPolicy.BotManagement.CustomRules is not specified or parameter length of Rules is zero: clear all Bot custom rule configurations.</li> <li> if CustomRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing Bot custom rule configurations and do not modify them.</li>.
    */
    @SerializedName("Rules")
    @Expose
    private BotManagementCustomRule [] Rules;

    /**
     * Get List of Bot custom Rules. when using ModifySecurityPolicy to modify Web protection configuration: <br> <li> if Rules in SecurityPolicy.BotManagement.CustomRules is not specified or parameter length of Rules is zero: clear all Bot custom rule configurations.</li> <li> if CustomRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing Bot custom rule configurations and do not modify them.</li>. 
     * @return Rules List of Bot custom Rules. when using ModifySecurityPolicy to modify Web protection configuration: <br> <li> if Rules in SecurityPolicy.BotManagement.CustomRules is not specified or parameter length of Rules is zero: clear all Bot custom rule configurations.</li> <li> if CustomRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing Bot custom rule configurations and do not modify them.</li>.
     */
    public BotManagementCustomRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set List of Bot custom Rules. when using ModifySecurityPolicy to modify Web protection configuration: <br> <li> if Rules in SecurityPolicy.BotManagement.CustomRules is not specified or parameter length of Rules is zero: clear all Bot custom rule configurations.</li> <li> if CustomRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing Bot custom rule configurations and do not modify them.</li>.
     * @param Rules List of Bot custom Rules. when using ModifySecurityPolicy to modify Web protection configuration: <br> <li> if Rules in SecurityPolicy.BotManagement.CustomRules is not specified or parameter length of Rules is zero: clear all Bot custom rule configurations.</li> <li> if CustomRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing Bot custom rule configurations and do not modify them.</li>.
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

