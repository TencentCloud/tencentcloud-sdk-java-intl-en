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

public class KeyValuePair extends AbstractModel {

    /**
    * Key name. Each key name cannot be empty, with a length of 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Key-value. Cannot be empty for input parameters and supports up to 1 MB. Returns an empty string if the key does not exist for output parameters.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Expiration time, following ISO 8601 standard, format YYYY-MM-DDThh:mm:ssZ (UTC time). If it is an empty string in the output, it means the key-value pair will never expire.
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
     * Get Key name. Each key name cannot be empty, with a length of 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores. 
     * @return Key Key name. Each key name cannot be empty, with a length of 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key name. Each key name cannot be empty, with a length of 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores.
     * @param Key Key name. Each key name cannot be empty, with a length of 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Key-value. Cannot be empty for input parameters and supports up to 1 MB. Returns an empty string if the key does not exist for output parameters. 
     * @return Value Key-value. Cannot be empty for input parameters and supports up to 1 MB. Returns an empty string if the key does not exist for output parameters.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Key-value. Cannot be empty for input parameters and supports up to 1 MB. Returns an empty string if the key does not exist for output parameters.
     * @param Value Key-value. Cannot be empty for input parameters and supports up to 1 MB. Returns an empty string if the key does not exist for output parameters.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Expiration time, following ISO 8601 standard, format YYYY-MM-DDThh:mm:ssZ (UTC time). If it is an empty string in the output, it means the key-value pair will never expire. 
     * @return Expiration Expiration time, following ISO 8601 standard, format YYYY-MM-DDThh:mm:ssZ (UTC time). If it is an empty string in the output, it means the key-value pair will never expire.
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * Set Expiration time, following ISO 8601 standard, format YYYY-MM-DDThh:mm:ssZ (UTC time). If it is an empty string in the output, it means the key-value pair will never expire.
     * @param Expiration Expiration time, following ISO 8601 standard, format YYYY-MM-DDThh:mm:ssZ (UTC time). If it is an empty string in the output, it means the key-value pair will never expire.
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
    }

    public KeyValuePair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyValuePair(KeyValuePair source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Expiration != null) {
            this.Expiration = new String(source.Expiration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);

    }
}

