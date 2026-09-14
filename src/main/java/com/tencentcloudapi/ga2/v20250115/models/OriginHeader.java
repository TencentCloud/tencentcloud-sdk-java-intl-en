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

public class OriginHeader extends AbstractModel {

    /**
    * <p>Key.</p><p>Parameter format: 1. The string literal only contains printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input parameter limitation: length 1-40.</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Value.</p><p>Input parameter limit: length cannot exceed 128.</p><p>If the string contains $, you can only configure '$remote_addr', '$remote_port'; otherwise, it is not supported.</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>Key.</p><p>Parameter format: 1. The string literal only contains printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input parameter limitation: length 1-40.</p> 
     * @return Key <p>Key.</p><p>Parameter format: 1. The string literal only contains printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input parameter limitation: length 1-40.</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Key.</p><p>Parameter format: 1. The string literal only contains printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input parameter limitation: length 1-40.</p>
     * @param Key <p>Key.</p><p>Parameter format: 1. The string literal only contains printable ASCII characters. 2. Cannot contain these characters ()&lt;&gt;@,;:\&quot;/[ ]?={ }</p><p>Input parameter limitation: length 1-40.</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Value.</p><p>Input parameter limit: length cannot exceed 128.</p><p>If the string contains $, you can only configure '$remote_addr', '$remote_port'; otherwise, it is not supported.</p> 
     * @return Value <p>Value.</p><p>Input parameter limit: length cannot exceed 128.</p><p>If the string contains $, you can only configure '$remote_addr', '$remote_port'; otherwise, it is not supported.</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Value.</p><p>Input parameter limit: length cannot exceed 128.</p><p>If the string contains $, you can only configure '$remote_addr', '$remote_port'; otherwise, it is not supported.</p>
     * @param Value <p>Value.</p><p>Input parameter limit: length cannot exceed 128.</p><p>If the string contains $, you can only configure '$remote_addr', '$remote_port'; otherwise, it is not supported.</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public OriginHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginHeader(OriginHeader source) {
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

