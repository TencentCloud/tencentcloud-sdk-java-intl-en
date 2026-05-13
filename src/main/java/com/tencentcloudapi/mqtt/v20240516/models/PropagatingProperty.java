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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PropagatingProperty extends AbstractModel {

    /**
    * propagating properties key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * propagating properties value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get propagating properties key 
     * @return Key propagating properties key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set propagating properties key
     * @param Key propagating properties key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get propagating properties value 
     * @return Value propagating properties value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set propagating properties value
     * @param Value propagating properties value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public PropagatingProperty() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PropagatingProperty(PropagatingProperty source) {
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

