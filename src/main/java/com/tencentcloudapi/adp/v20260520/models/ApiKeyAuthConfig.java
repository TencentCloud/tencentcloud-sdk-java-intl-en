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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiKeyAuthConfig extends AbstractModel {

    /**
    * Key position. HEADER/QUERY

Enumeration values:
| uint | Description |
| --- | --- |
Header authentication
| 1 | Query authentication |
    */
    @SerializedName("KeyLocation")
    @Expose
    private Long KeyLocation;

    /**
    * Key parameter name
    */
    @SerializedName("KeyParamName")
    @Expose
    private String KeyParamName;

    /**
    * Key parameter value
    */
    @SerializedName("KeyParamValue")
    @Expose
    private String KeyParamValue;

    /**
     * Get Key position. HEADER/QUERY

Enumeration values:
| uint | Description |
| --- | --- |
Header authentication
| 1 | Query authentication | 
     * @return KeyLocation Key position. HEADER/QUERY

Enumeration values:
| uint | Description |
| --- | --- |
Header authentication
| 1 | Query authentication |
     */
    public Long getKeyLocation() {
        return this.KeyLocation;
    }

    /**
     * Set Key position. HEADER/QUERY

Enumeration values:
| uint | Description |
| --- | --- |
Header authentication
| 1 | Query authentication |
     * @param KeyLocation Key position. HEADER/QUERY

Enumeration values:
| uint | Description |
| --- | --- |
Header authentication
| 1 | Query authentication |
     */
    public void setKeyLocation(Long KeyLocation) {
        this.KeyLocation = KeyLocation;
    }

    /**
     * Get Key parameter name 
     * @return KeyParamName Key parameter name
     */
    public String getKeyParamName() {
        return this.KeyParamName;
    }

    /**
     * Set Key parameter name
     * @param KeyParamName Key parameter name
     */
    public void setKeyParamName(String KeyParamName) {
        this.KeyParamName = KeyParamName;
    }

    /**
     * Get Key parameter value 
     * @return KeyParamValue Key parameter value
     */
    public String getKeyParamValue() {
        return this.KeyParamValue;
    }

    /**
     * Set Key parameter value
     * @param KeyParamValue Key parameter value
     */
    public void setKeyParamValue(String KeyParamValue) {
        this.KeyParamValue = KeyParamValue;
    }

    public ApiKeyAuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiKeyAuthConfig(ApiKeyAuthConfig source) {
        if (source.KeyLocation != null) {
            this.KeyLocation = new Long(source.KeyLocation);
        }
        if (source.KeyParamName != null) {
            this.KeyParamName = new String(source.KeyParamName);
        }
        if (source.KeyParamValue != null) {
            this.KeyParamValue = new String(source.KeyParamValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyLocation", this.KeyLocation);
        this.setParamSimple(map, prefix + "KeyParamName", this.KeyParamName);
        this.setParamSimple(map, prefix + "KeyParamValue", this.KeyParamValue);

    }
}

