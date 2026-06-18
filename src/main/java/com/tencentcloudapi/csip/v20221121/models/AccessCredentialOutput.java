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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessCredentialOutput extends AbstractModel {

    /**
    * Credential key name (original), such as SecretId, SecretKey, Token
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Credential key-value (masked)
Supplementary description: Reserve the first 3 and last 4 digits, replace the middle with ***; replace all with *** if the length is less than 7.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Credential key name (original), such as SecretId, SecretKey, Token 
     * @return Key Credential key name (original), such as SecretId, SecretKey, Token
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Credential key name (original), such as SecretId, SecretKey, Token
     * @param Key Credential key name (original), such as SecretId, SecretKey, Token
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Credential key-value (masked)
Supplementary description: Reserve the first 3 and last 4 digits, replace the middle with ***; replace all with *** if the length is less than 7. 
     * @return Value Credential key-value (masked)
Supplementary description: Reserve the first 3 and last 4 digits, replace the middle with ***; replace all with *** if the length is less than 7.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Credential key-value (masked)
Supplementary description: Reserve the first 3 and last 4 digits, replace the middle with ***; replace all with *** if the length is less than 7.
     * @param Value Credential key-value (masked)
Supplementary description: Reserve the first 3 and last 4 digits, replace the middle with ***; replace all with *** if the length is less than 7.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AccessCredentialOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessCredentialOutput(AccessCredentialOutput source) {
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

