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

public class EdgeKVPutRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Namespace name.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Key name. The length is 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Key-value. Cannot be empty and supports up to 1 MB. Supports storing string data.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Expiration time, absolute time. It means the seconds elapsed since midnight (UTC/GMT) on January 1, 1970, and cannot be earlier than the current time. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire.
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
    * Expiration time, relative time, in seconds. Indicates the data will expire after the specified seconds, must be greater than 0. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire.
    */
    @SerializedName("ExpirationTTL")
    @Expose
    private Long ExpirationTTL;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Namespace name. 
     * @return Namespace Namespace name.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace name.
     * @param Namespace Namespace name.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Key name. The length is 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores. 
     * @return Key Key name. The length is 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key name. The length is 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores.
     * @param Key Key name. The length is 1-512 characters. Allowed characters include letters, digits, hyphens, and underscores.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Key-value. Cannot be empty and supports up to 1 MB. Supports storing string data. 
     * @return Value Key-value. Cannot be empty and supports up to 1 MB. Supports storing string data.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Key-value. Cannot be empty and supports up to 1 MB. Supports storing string data.
     * @param Value Key-value. Cannot be empty and supports up to 1 MB. Supports storing string data.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Expiration time, absolute time. It means the seconds elapsed since midnight (UTC/GMT) on January 1, 1970, and cannot be earlier than the current time. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire. 
     * @return Expiration Expiration time, absolute time. It means the seconds elapsed since midnight (UTC/GMT) on January 1, 1970, and cannot be earlier than the current time. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire.
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set Expiration time, absolute time. It means the seconds elapsed since midnight (UTC/GMT) on January 1, 1970, and cannot be earlier than the current time. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire.
     * @param Expiration Expiration time, absolute time. It means the seconds elapsed since midnight (UTC/GMT) on January 1, 1970, and cannot be earlier than the current time. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire.
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get Expiration time, relative time, in seconds. Indicates the data will expire after the specified seconds, must be greater than 0. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire. 
     * @return ExpirationTTL Expiration time, relative time, in seconds. Indicates the data will expire after the specified seconds, must be greater than 0. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire.
     */
    public Long getExpirationTTL() {
        return this.ExpirationTTL;
    }

    /**
     * Set Expiration time, relative time, in seconds. Indicates the data will expire after the specified seconds, must be greater than 0. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire.
     * @param ExpirationTTL Expiration time, relative time, in seconds. Indicates the data will expire after the specified seconds, must be greater than 0. If both Expiration and ExpirationTTL are filled in, ExpirationTTL takes precedence. If neither Expiration nor ExpirationTTL is specified, the key-value pair will never expire.
     */
    public void setExpirationTTL(Long ExpirationTTL) {
        this.ExpirationTTL = ExpirationTTL;
    }

    public EdgeKVPutRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeKVPutRequest(EdgeKVPutRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Expiration != null) {
            this.Expiration = new Long(source.Expiration);
        }
        if (source.ExpirationTTL != null) {
            this.ExpirationTTL = new Long(source.ExpirationTTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "ExpirationTTL", this.ExpirationTTL);

    }
}

