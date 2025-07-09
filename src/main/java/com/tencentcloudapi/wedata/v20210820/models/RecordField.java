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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordField extends AbstractModel {

    /**
    * Field Name, Extended Field Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Field Value, Extended Field Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Field Name, Extended Field Name 
     * @return Name Field Name, Extended Field Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Field Name, Extended Field Name
     * @param Name Field Name, Extended Field Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Field Value, Extended Field Value 
     * @return Value Field Value, Extended Field Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Field Value, Extended Field Value
     * @param Value Field Value, Extended Field Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public RecordField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordField(RecordField source) {
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

