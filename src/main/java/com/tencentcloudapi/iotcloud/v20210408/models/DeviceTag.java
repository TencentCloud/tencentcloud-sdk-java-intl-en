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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceTag extends AbstractModel {

    /**
    * Attribute name
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Attribute value type. `1`: integer; `2`: string
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Attribute value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Attribute description
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Attribute name 
     * @return Tag Attribute name
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Attribute name
     * @param Tag Attribute name
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Attribute value type. `1`: integer; `2`: string 
     * @return Type Attribute value type. `1`: integer; `2`: string
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Attribute value type. `1`: integer; `2`: string
     * @param Type Attribute value type. `1`: integer; `2`: string
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Attribute value 
     * @return Value Attribute value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Attribute value
     * @param Value Attribute value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Attribute description
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Name Attribute description
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Attribute description
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Name Attribute description
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DeviceTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceTag(DeviceTag source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

