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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResponseHeaders extends AbstractModel {

    /**
    * <p>key</p><p>Parameter format: 1. The string only contain printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input limit: Length 1-40.</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>value</p><p>Input limit: length cannot exceed 128</p><p>If the string contains $, you can only configure '$remote_addr' and '$remote_port'. Otherwise, it is not supported.</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>key</p><p>Parameter format: 1. The string only contain printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input limit: Length 1-40.</p> 
     * @return Key <p>key</p><p>Parameter format: 1. The string only contain printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input limit: Length 1-40.</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>key</p><p>Parameter format: 1. The string only contain printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input limit: Length 1-40.</p>
     * @param Key <p>key</p><p>Parameter format: 1. The string only contain printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input limit: Length 1-40.</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>value</p><p>Input limit: length cannot exceed 128</p><p>If the string contains $, you can only configure '$remote_addr' and '$remote_port'. Otherwise, it is not supported.</p> 
     * @return Value <p>value</p><p>Input limit: length cannot exceed 128</p><p>If the string contains $, you can only configure '$remote_addr' and '$remote_port'. Otherwise, it is not supported.</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>value</p><p>Input limit: length cannot exceed 128</p><p>If the string contains $, you can only configure '$remote_addr' and '$remote_port'. Otherwise, it is not supported.</p>
     * @param Value <p>value</p><p>Input limit: length cannot exceed 128</p><p>If the string contains $, you can only configure '$remote_addr' and '$remote_port'. Otherwise, it is not supported.</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ResponseHeaders() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseHeaders(ResponseHeaders source) {
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

