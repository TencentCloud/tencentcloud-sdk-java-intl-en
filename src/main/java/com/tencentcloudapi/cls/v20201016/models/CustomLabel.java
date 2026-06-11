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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomLabel extends AbstractModel {

    /**
    * Tag key.
-Must start with a letter or underscore, but cannot start with double underscores (__), followed by any letter, digit, or underscore.
- Supports up to 256 characters.
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Tag value.
- Supports up to 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Tag key.
-Must start with a letter or underscore, but cannot start with double underscores (__), followed by any letter, digit, or underscore.
- Supports up to 256 characters.
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Key Tag key.
-Must start with a letter or underscore, but cannot start with double underscores (__), followed by any letter, digit, or underscore.
- Supports up to 256 characters.
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Tag key.
-Must start with a letter or underscore, but cannot start with double underscores (__), followed by any letter, digit, or underscore.
- Supports up to 256 characters.
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Key Tag key.
-Must start with a letter or underscore, but cannot start with double underscores (__), followed by any letter, digit, or underscore.
- Supports up to 256 characters.
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Tag value.
- Supports up to 256 characters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Tag value.
- Supports up to 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Tag value.
- Supports up to 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Tag value.
- Supports up to 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public CustomLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomLabel(CustomLabel source) {
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

