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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvanceFilterRuleInfo extends AbstractModel {

    /**
    * Filter fields
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Filtering rule. 0: equal to; 1: the field exists; 2 the field does not exist.
    */
    @SerializedName("Rule")
    @Expose
    private Long Rule;

    /**
    * Values after filtering
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Filter fields 
     * @return Key Filter fields
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Filter fields
     * @param Key Filter fields
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Filtering rule. 0: equal to; 1: the field exists; 2 the field does not exist. 
     * @return Rule Filtering rule. 0: equal to; 1: the field exists; 2 the field does not exist.
     */
    public Long getRule() {
        return this.Rule;
    }

    /**
     * Set Filtering rule. 0: equal to; 1: the field exists; 2 the field does not exist.
     * @param Rule Filtering rule. 0: equal to; 1: the field exists; 2 the field does not exist.
     */
    public void setRule(Long Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Values after filtering 
     * @return Value Values after filtering
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Values after filtering
     * @param Value Values after filtering
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AdvanceFilterRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvanceFilterRuleInfo(AdvanceFilterRuleInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Rule != null) {
            this.Rule = new Long(source.Rule);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

