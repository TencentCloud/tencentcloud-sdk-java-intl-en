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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOwaspRuleTypeLevelRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Rule type ID list.
    */
    @SerializedName("TypeIDs")
    @Expose
    private String [] TypeIDs;

    /**
    * Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
    */
    @SerializedName("RuleTypeLevel")
    @Expose
    private Long RuleTypeLevel;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Rule type ID list. 
     * @return TypeIDs Rule type ID list.
     */
    public String [] getTypeIDs() {
        return this.TypeIDs;
    }

    /**
     * Set Rule type ID list.
     * @param TypeIDs Rule type ID list.
     */
    public void setTypeIDs(String [] TypeIDs) {
        this.TypeIDs = TypeIDs;
    }

    /**
     * Get Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict). 
     * @return RuleTypeLevel Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
     */
    public Long getRuleTypeLevel() {
        return this.RuleTypeLevel;
    }

    /**
     * Set Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
     * @param RuleTypeLevel Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
     */
    public void setRuleTypeLevel(Long RuleTypeLevel) {
        this.RuleTypeLevel = RuleTypeLevel;
    }

    public ModifyOwaspRuleTypeLevelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOwaspRuleTypeLevelRequest(ModifyOwaspRuleTypeLevelRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.TypeIDs != null) {
            this.TypeIDs = new String[source.TypeIDs.length];
            for (int i = 0; i < source.TypeIDs.length; i++) {
                this.TypeIDs[i] = new String(source.TypeIDs[i]);
            }
        }
        if (source.RuleTypeLevel != null) {
            this.RuleTypeLevel = new Long(source.RuleTypeLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "TypeIDs.", this.TypeIDs);
        this.setParamSimple(map, prefix + "RuleTypeLevel", this.RuleTypeLevel);

    }
}

