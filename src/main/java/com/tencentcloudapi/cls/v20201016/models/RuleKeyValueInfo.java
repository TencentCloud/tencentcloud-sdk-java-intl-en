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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleKeyValueInfo extends AbstractModel {

    /**
    * Case sensitivity
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Boolean CaseSensitive;

    /**
    * Key-value pair information of the index to be created
    */
    @SerializedName("KeyValues")
    @Expose
    private KeyValueInfo [] KeyValues;

    /**
     * Get Case sensitivity 
     * @return CaseSensitive Case sensitivity
     */
    public Boolean getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set Case sensitivity
     * @param CaseSensitive Case sensitivity
     */
    public void setCaseSensitive(Boolean CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get Key-value pair information of the index to be created 
     * @return KeyValues Key-value pair information of the index to be created
     */
    public KeyValueInfo [] getKeyValues() {
        return this.KeyValues;
    }

    /**
     * Set Key-value pair information of the index to be created
     * @param KeyValues Key-value pair information of the index to be created
     */
    public void setKeyValues(KeyValueInfo [] KeyValues) {
        this.KeyValues = KeyValues;
    }

    public RuleKeyValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleKeyValueInfo(RuleKeyValueInfo source) {
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Boolean(source.CaseSensitive);
        }
        if (source.KeyValues != null) {
            this.KeyValues = new KeyValueInfo[source.KeyValues.length];
            for (int i = 0; i < source.KeyValues.length; i++) {
                this.KeyValues[i] = new KeyValueInfo(source.KeyValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamArrayObj(map, prefix + "KeyValues.", this.KeyValues);

    }
}

