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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvVar extends AbstractModel {

    /**
    * <p>Environment variable key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Environment variable value</p>
    */
    @SerializedName("Value")
    @Expose
    private EnvEntry Value;

    /**
     * Get <p>Environment variable key</p> 
     * @return Key <p>Environment variable key</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Environment variable key</p>
     * @param Key <p>Environment variable key</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Environment variable value</p> 
     * @return Value <p>Environment variable value</p>
     */
    public EnvEntry getValue() {
        return this.Value;
    }

    /**
     * Set <p>Environment variable value</p>
     * @param Value <p>Environment variable value</p>
     */
    public void setValue(EnvEntry Value) {
        this.Value = Value;
    }

    public EnvVar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvVar(EnvVar source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new EnvEntry(source.Value);
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

