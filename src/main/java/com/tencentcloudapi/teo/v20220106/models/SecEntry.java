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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecEntry extends AbstractModel{

    /**
    * Entry key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Entry value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private SecEntryValue [] Value;

    /**
     * Get Entry key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Key Entry key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Entry key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Key Entry key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Entry value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Entry value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SecEntryValue [] getValue() {
        return this.Value;
    }

    /**
     * Set Entry value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Entry value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(SecEntryValue [] Value) {
        this.Value = Value;
    }

    public SecEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecEntry(SecEntry source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new SecEntryValue[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new SecEntryValue(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArrayObj(map, prefix + "Value.", this.Value);

    }
}

