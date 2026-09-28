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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPHeaderInfo extends AbstractModel {

    /**
    * Key of the HTTP Header. Length: 1–40 characters. Supported character sets: a-z a-z 0-9 - _
Chinese characters are not allowed. No support for Host and Cookie.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Value of the HTTP Header. Length: 1-128 characters. Printable characters supported.
Unsupported. It cannot begin or end with a space, and cannot end with a backslash.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Key of the HTTP Header. Length: 1–40 characters. Supported character sets: a-z a-z 0-9 - _
Chinese characters are not allowed. No support for Host and Cookie. 
     * @return Key Key of the HTTP Header. Length: 1–40 characters. Supported character sets: a-z a-z 0-9 - _
Chinese characters are not allowed. No support for Host and Cookie.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key of the HTTP Header. Length: 1–40 characters. Supported character sets: a-z a-z 0-9 - _
Chinese characters are not allowed. No support for Host and Cookie.
     * @param Key Key of the HTTP Header. Length: 1–40 characters. Supported character sets: a-z a-z 0-9 - _
Chinese characters are not allowed. No support for Host and Cookie.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Value of the HTTP Header. Length: 1-128 characters. Printable characters supported.
Unsupported. It cannot begin or end with a space, and cannot end with a backslash. 
     * @return Values Value of the HTTP Header. Length: 1-128 characters. Printable characters supported.
Unsupported. It cannot begin or end with a space, and cannot end with a backslash.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Value of the HTTP Header. Length: 1-128 characters. Printable characters supported.
Unsupported. It cannot begin or end with a space, and cannot end with a backslash.
     * @param Values Value of the HTTP Header. Length: 1-128 characters. Printable characters supported.
Unsupported. It cannot begin or end with a space, and cannot end with a backslash.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public HTTPHeaderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPHeaderInfo(HTTPHeaderInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

