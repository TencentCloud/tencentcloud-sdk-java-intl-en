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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberMap extends AbstractModel{

    /**
    * Key
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Key 
     * @return Name Key
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Key
     * @param Name Key
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Value 
     * @return Value Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value
     * @param Value Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public MemberMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberMap(MemberMap source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

