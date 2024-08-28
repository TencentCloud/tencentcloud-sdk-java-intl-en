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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyValueArrayInfo extends AbstractModel {

    /**
    * Field requiring Key-Value or Meta Field Index configuration
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Field index description
    */
    @SerializedName("Value")
    @Expose
    private ValueInfo Value;

    /**
     * Get Field requiring Key-Value or Meta Field Index configuration 
     * @return Key Field requiring Key-Value or Meta Field Index configuration
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Field requiring Key-Value or Meta Field Index configuration
     * @param Key Field requiring Key-Value or Meta Field Index configuration
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Field index description 
     * @return Value Field index description
     */
    public ValueInfo getValue() {
        return this.Value;
    }

    /**
     * Set Field index description
     * @param Value Field index description
     */
    public void setValue(ValueInfo Value) {
        this.Value = Value;
    }

    public KeyValueArrayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyValueArrayInfo(KeyValueArrayInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new ValueInfo(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

