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

public class EnvEntry extends AbstractModel {

    /**
    * <p>Environment variable value</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>Whether to mask</p>
    */
    @SerializedName("Sensitive")
    @Expose
    private Boolean Sensitive;

    /**
     * Get <p>Environment variable value</p> 
     * @return Value <p>Environment variable value</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Environment variable value</p>
     * @param Value <p>Environment variable value</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>Whether to mask</p> 
     * @return Sensitive <p>Whether to mask</p>
     */
    public Boolean getSensitive() {
        return this.Sensitive;
    }

    /**
     * Set <p>Whether to mask</p>
     * @param Sensitive <p>Whether to mask</p>
     */
    public void setSensitive(Boolean Sensitive) {
        this.Sensitive = Sensitive;
    }

    public EnvEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvEntry(EnvEntry source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Sensitive != null) {
            this.Sensitive = new Boolean(source.Sensitive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Sensitive", this.Sensitive);

    }
}

