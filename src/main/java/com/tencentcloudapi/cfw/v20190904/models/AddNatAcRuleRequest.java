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

public class AddNatAcRuleRequest extends AbstractModel{

    /**
    * NAT access control rules to be added.
    */
    @SerializedName("Rules")
    @Expose
    private CreateNatRuleItem [] Rules;

    /**
    * Source of the rules to be added. Generally, this parameter is not used. The value insert_rule indicates that rules in the specified location are inserted, and the value batch_import indicates that rules are imported in batches. If the parameter is left empty, rules defined in the API request are added.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get NAT access control rules to be added. 
     * @return Rules NAT access control rules to be added.
     */
    public CreateNatRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set NAT access control rules to be added.
     * @param Rules NAT access control rules to be added.
     */
    public void setRules(CreateNatRuleItem [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Source of the rules to be added. Generally, this parameter is not used. The value insert_rule indicates that rules in the specified location are inserted, and the value batch_import indicates that rules are imported in batches. If the parameter is left empty, rules defined in the API request are added. 
     * @return From Source of the rules to be added. Generally, this parameter is not used. The value insert_rule indicates that rules in the specified location are inserted, and the value batch_import indicates that rules are imported in batches. If the parameter is left empty, rules defined in the API request are added.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Source of the rules to be added. Generally, this parameter is not used. The value insert_rule indicates that rules in the specified location are inserted, and the value batch_import indicates that rules are imported in batches. If the parameter is left empty, rules defined in the API request are added.
     * @param From Source of the rules to be added. Generally, this parameter is not used. The value insert_rule indicates that rules in the specified location are inserted, and the value batch_import indicates that rules are imported in batches. If the parameter is left empty, rules defined in the API request are added.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    public AddNatAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddNatAcRuleRequest(AddNatAcRuleRequest source) {
        if (source.Rules != null) {
            this.Rules = new CreateNatRuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new CreateNatRuleItem(source.Rules[i]);
            }
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "From", this.From);

    }
}

