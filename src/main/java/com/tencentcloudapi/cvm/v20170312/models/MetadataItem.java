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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetadataItem extends AbstractModel {

    /**
    * Custom metadata key. it must comply with the regular expression ^[a-zA-Z0-9_-]+$. the length is less than or equal to 128 bytes (case-sensitive).

    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Specifies a custom metadata value. it supports any data . The size is &le; 256 KB. it is case-sensitive.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Custom metadata key. it must comply with the regular expression ^[a-zA-Z0-9_-]+$. the length is less than or equal to 128 bytes (case-sensitive).
 
     * @return Key Custom metadata key. it must comply with the regular expression ^[a-zA-Z0-9_-]+$. the length is less than or equal to 128 bytes (case-sensitive).

     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Custom metadata key. it must comply with the regular expression ^[a-zA-Z0-9_-]+$. the length is less than or equal to 128 bytes (case-sensitive).

     * @param Key Custom metadata key. it must comply with the regular expression ^[a-zA-Z0-9_-]+$. the length is less than or equal to 128 bytes (case-sensitive).

     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Specifies a custom metadata value. it supports any data . The size is &le; 256 KB. it is case-sensitive. 
     * @return Value Specifies a custom metadata value. it supports any data . The size is &le; 256 KB. it is case-sensitive.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Specifies a custom metadata value. it supports any data . The size is &le; 256 KB. it is case-sensitive.
     * @param Value Specifies a custom metadata value. it supports any data . The size is &le; 256 KB. it is case-sensitive.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public MetadataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetadataItem(MetadataItem source) {
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

