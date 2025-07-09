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

public class ConditionInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Attributes")
    @Expose
    private String Attributes;

    /**
    * 
    */
    @SerializedName("Rule")
    @Expose
    private Long Rule;

    /**
    * 
    */
    @SerializedName("ConditionValue")
    @Expose
    private String ConditionValue;

    /**
     * Get  
     * @return Attributes 
     */
    public String getAttributes() {
        return this.Attributes;
    }

    /**
     * Set 
     * @param Attributes 
     */
    public void setAttributes(String Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get  
     * @return Rule 
     */
    public Long getRule() {
        return this.Rule;
    }

    /**
     * Set 
     * @param Rule 
     */
    public void setRule(Long Rule) {
        this.Rule = Rule;
    }

    /**
     * Get  
     * @return ConditionValue 
     */
    public String getConditionValue() {
        return this.ConditionValue;
    }

    /**
     * Set 
     * @param ConditionValue 
     */
    public void setConditionValue(String ConditionValue) {
        this.ConditionValue = ConditionValue;
    }

    public ConditionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConditionInfo(ConditionInfo source) {
        if (source.Attributes != null) {
            this.Attributes = new String(source.Attributes);
        }
        if (source.Rule != null) {
            this.Rule = new Long(source.Rule);
        }
        if (source.ConditionValue != null) {
            this.ConditionValue = new String(source.ConditionValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Attributes", this.Attributes);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "ConditionValue", this.ConditionValue);

    }
}

