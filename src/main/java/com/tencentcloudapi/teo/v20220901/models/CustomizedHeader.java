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

public class CustomizedHeader extends AbstractModel {

    /**
    * Custom header key.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Custom header value.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Custom header key.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return Key Custom header key.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Custom header key.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param Key Custom header key.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Custom header value.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return Value Custom header value.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Custom header value.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param Value Custom header value.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public CustomizedHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomizedHeader(CustomizedHeader source) {
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

