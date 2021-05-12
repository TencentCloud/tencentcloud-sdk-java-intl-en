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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag extends AbstractModel{

    /**
    * Tag key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Tag value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Type of the resource binded to the tag. Currently supported types include "auto-scaling-group"
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get Tag key 
     * @return Key Tag key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Tag key
     * @param Key Tag key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Tag value 
     * @return Value Tag value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Tag value
     * @param Value Tag value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Type of the resource binded to the tag. Currently supported types include "auto-scaling-group"
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceType Type of the resource binded to the tag. Currently supported types include "auto-scaling-group"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Type of the resource binded to the tag. Currently supported types include "auto-scaling-group"
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceType Type of the resource binded to the tag. Currently supported types include "auto-scaling-group"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tag(Tag source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

