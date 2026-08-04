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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceEnvironmentVariable extends AbstractModel {

    /**
    * Variable name  is limited to uppercase and lowercase letters, digits, and underscores, and must start with a letter or underscore. The length is limited to no more than 64 characters.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Variable value. Supports any visible characters such as letters, numbers, and symbols. Length limited to no more than 2048 characters.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Variable name  is limited to uppercase and lowercase letters, digits, and underscores, and must start with a letter or underscore. The length is limited to no more than 64 characters. 
     * @return Key Variable name  is limited to uppercase and lowercase letters, digits, and underscores, and must start with a letter or underscore. The length is limited to no more than 64 characters.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Variable name  is limited to uppercase and lowercase letters, digits, and underscores, and must start with a letter or underscore. The length is limited to no more than 64 characters.
     * @param Key Variable name  is limited to uppercase and lowercase letters, digits, and underscores, and must start with a letter or underscore. The length is limited to no more than 64 characters.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Variable value. Supports any visible characters such as letters, numbers, and symbols. Length limited to no more than 2048 characters. 
     * @return Value Variable value. Supports any visible characters such as letters, numbers, and symbols. Length limited to no more than 2048 characters.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Variable value. Supports any visible characters such as letters, numbers, and symbols. Length limited to no more than 2048 characters.
     * @param Value Variable value. Supports any visible characters such as letters, numbers, and symbols. Length limited to no more than 2048 characters.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public InferenceEnvironmentVariable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceEnvironmentVariable(InferenceEnvironmentVariable source) {
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

