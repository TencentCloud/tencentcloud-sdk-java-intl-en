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

public class ClientAttestationRules extends AbstractModel {

    /**
    * List of client authentication. when using ModifySecurityPolicy to modify Web protection configuration: <li> if Rules in SecurityPolicy.BotManagement.ClientAttestationRules is not specified or the parameter length of Rules is zero: clear all client authentication rule configuration. </li> <li> if ClientAttestationRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing client authentication rule configuration and do not modify. </li>.
    */
    @SerializedName("Rules")
    @Expose
    private ClientAttestationRule [] Rules;

    /**
     * Get List of client authentication. when using ModifySecurityPolicy to modify Web protection configuration: <li> if Rules in SecurityPolicy.BotManagement.ClientAttestationRules is not specified or the parameter length of Rules is zero: clear all client authentication rule configuration. </li> <li> if ClientAttestationRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing client authentication rule configuration and do not modify. </li>. 
     * @return Rules List of client authentication. when using ModifySecurityPolicy to modify Web protection configuration: <li> if Rules in SecurityPolicy.BotManagement.ClientAttestationRules is not specified or the parameter length of Rules is zero: clear all client authentication rule configuration. </li> <li> if ClientAttestationRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing client authentication rule configuration and do not modify. </li>.
     */
    public ClientAttestationRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set List of client authentication. when using ModifySecurityPolicy to modify Web protection configuration: <li> if Rules in SecurityPolicy.BotManagement.ClientAttestationRules is not specified or the parameter length of Rules is zero: clear all client authentication rule configuration. </li> <li> if ClientAttestationRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing client authentication rule configuration and do not modify. </li>.
     * @param Rules List of client authentication. when using ModifySecurityPolicy to modify Web protection configuration: <li> if Rules in SecurityPolicy.BotManagement.ClientAttestationRules is not specified or the parameter length of Rules is zero: clear all client authentication rule configuration. </li> <li> if ClientAttestationRules in SecurityPolicy.BotManagement parameters is unspecified: keep existing client authentication rule configuration and do not modify. </li>.
     */
    public void setRules(ClientAttestationRule [] Rules) {
        this.Rules = Rules;
    }

    public ClientAttestationRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientAttestationRules(ClientAttestationRules source) {
        if (source.Rules != null) {
            this.Rules = new ClientAttestationRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ClientAttestationRule(source.Rules[i]);
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

