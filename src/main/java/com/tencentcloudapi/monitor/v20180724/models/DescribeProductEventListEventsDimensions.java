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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductEventListEventsDimensions extends AbstractModel {

    /**
    * Dimension name in English.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Dimension name in Chinese.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Dimension value.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Dimension name in English.
Note: This field may return null, indicating that no valid value was found. 
     * @return Key Dimension name in English.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Dimension name in English.
Note: This field may return null, indicating that no valid value was found.
     * @param Key Dimension name in English.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Dimension name in Chinese.
Note: This field may return null, indicating that no valid value was found. 
     * @return Name Dimension name in Chinese.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dimension name in Chinese.
Note: This field may return null, indicating that no valid value was found.
     * @param Name Dimension name in Chinese.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Dimension value.
Note: This field may return null, indicating that no valid value was found. 
     * @return Value Dimension value.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Dimension value.
Note: This field may return null, indicating that no valid value was found.
     * @param Value Dimension value.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public DescribeProductEventListEventsDimensions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductEventListEventsDimensions(DescribeProductEventListEventsDimensions source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

