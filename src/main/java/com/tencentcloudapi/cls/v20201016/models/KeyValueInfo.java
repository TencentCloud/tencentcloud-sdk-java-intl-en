/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class KeyValueInfo extends AbstractModel {

    /**
    * Name of the field for which you want to configure a key-value or metadata field index. The name can contain letters, digits, underscores, and symbols -./@ and cannot start with an underscore.

Note:
For a metadata field, set its `Key` to be consistent with the one for log uploading, without prefixing it with `__TAG__.`. `__TAG__.` will be prefixed automatically for display in the console.
2. The total number of keys in key-value indexes (`KeyValue`) and metadata field indexes (`Tag`) cannot exceed 300.
3. The number of levels in `Key` cannot exceed 10. Example: a.b.c.d.e.f.g.h.j.k
4. JSON parent and child fields (such as “a” and “a.b”) cannot be contained at the same time.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Field index description information
    */
    @SerializedName("Value")
    @Expose
    private ValueInfo Value;

    /**
     * Get Name of the field for which you want to configure a key-value or metadata field index. The name can contain letters, digits, underscores, and symbols -./@ and cannot start with an underscore.

Note:
For a metadata field, set its `Key` to be consistent with the one for log uploading, without prefixing it with `__TAG__.`. `__TAG__.` will be prefixed automatically for display in the console.
2. The total number of keys in key-value indexes (`KeyValue`) and metadata field indexes (`Tag`) cannot exceed 300.
3. The number of levels in `Key` cannot exceed 10. Example: a.b.c.d.e.f.g.h.j.k
4. JSON parent and child fields (such as “a” and “a.b”) cannot be contained at the same time. 
     * @return Key Name of the field for which you want to configure a key-value or metadata field index. The name can contain letters, digits, underscores, and symbols -./@ and cannot start with an underscore.

Note:
For a metadata field, set its `Key` to be consistent with the one for log uploading, without prefixing it with `__TAG__.`. `__TAG__.` will be prefixed automatically for display in the console.
2. The total number of keys in key-value indexes (`KeyValue`) and metadata field indexes (`Tag`) cannot exceed 300.
3. The number of levels in `Key` cannot exceed 10. Example: a.b.c.d.e.f.g.h.j.k
4. JSON parent and child fields (such as “a” and “a.b”) cannot be contained at the same time.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Name of the field for which you want to configure a key-value or metadata field index. The name can contain letters, digits, underscores, and symbols -./@ and cannot start with an underscore.

Note:
For a metadata field, set its `Key` to be consistent with the one for log uploading, without prefixing it with `__TAG__.`. `__TAG__.` will be prefixed automatically for display in the console.
2. The total number of keys in key-value indexes (`KeyValue`) and metadata field indexes (`Tag`) cannot exceed 300.
3. The number of levels in `Key` cannot exceed 10. Example: a.b.c.d.e.f.g.h.j.k
4. JSON parent and child fields (such as “a” and “a.b”) cannot be contained at the same time.
     * @param Key Name of the field for which you want to configure a key-value or metadata field index. The name can contain letters, digits, underscores, and symbols -./@ and cannot start with an underscore.

Note:
For a metadata field, set its `Key` to be consistent with the one for log uploading, without prefixing it with `__TAG__.`. `__TAG__.` will be prefixed automatically for display in the console.
2. The total number of keys in key-value indexes (`KeyValue`) and metadata field indexes (`Tag`) cannot exceed 300.
3. The number of levels in `Key` cannot exceed 10. Example: a.b.c.d.e.f.g.h.j.k
4. JSON parent and child fields (such as “a” and “a.b”) cannot be contained at the same time.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Field index description information 
     * @return Value Field index description information
     */
    public ValueInfo getValue() {
        return this.Value;
    }

    /**
     * Set Field index description information
     * @param Value Field index description information
     */
    public void setValue(ValueInfo Value) {
        this.Value = Value;
    }

    public KeyValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyValueInfo(KeyValueInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new ValueInfo(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

