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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleConditionItem extends AbstractModel {

    /**
    * Key of the quality inspection item condition.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Value corresponding to the condition.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Key of the quality inspection item condition. 
     * @return Key Key of the quality inspection item condition.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key of the quality inspection item condition.
     * @param Key Key of the quality inspection item condition.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Value corresponding to the condition. 
     * @return Value Value corresponding to the condition.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value corresponding to the condition.
     * @param Value Value corresponding to the condition.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public RuleConditionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleConditionItem(RuleConditionItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
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
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

