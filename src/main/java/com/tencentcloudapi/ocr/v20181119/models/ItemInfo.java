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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemInfo extends AbstractModel{

    /**
    * The key information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private Key Key;

    /**
    * The value information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private Value Value;

    /**
     * Get The key information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Key The key information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Key getKey() {
        return this.Key;
    }

    /**
     * Set The key information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Key The key information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKey(Key Key) {
        this.Key = Key;
    }

    /**
     * Get The value information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value The value information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Value getValue() {
        return this.Value;
    }

    /**
     * Set The value information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value The value information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(Value Value) {
        this.Value = Value;
    }

    public ItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemInfo(ItemInfo source) {
        if (source.Key != null) {
            this.Key = new Key(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Value(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Key.", this.Key);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

