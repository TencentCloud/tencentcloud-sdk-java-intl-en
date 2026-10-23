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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetParameters extends AbstractModel {

    /**
    * <p>Specify the custom variable name. A custom variable must be defined before it can be used in operations.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Assign value to a Custom Variable. Supports the use of constant strings, variables, and formulas. Chinese characters are not allowed. Length cannot exceed 1000 characters.</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>Specify the custom variable name. A custom variable must be defined before it can be used in operations.</p> 
     * @return Name <p>Specify the custom variable name. A custom variable must be defined before it can be used in operations.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Specify the custom variable name. A custom variable must be defined before it can be used in operations.</p>
     * @param Name <p>Specify the custom variable name. A custom variable must be defined before it can be used in operations.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Assign value to a Custom Variable. Supports the use of constant strings, variables, and formulas. Chinese characters are not allowed. Length cannot exceed 1000 characters.</p> 
     * @return Value <p>Assign value to a Custom Variable. Supports the use of constant strings, variables, and formulas. Chinese characters are not allowed. Length cannot exceed 1000 characters.</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Assign value to a Custom Variable. Supports the use of constant strings, variables, and formulas. Chinese characters are not allowed. Length cannot exceed 1000 characters.</p>
     * @param Value <p>Assign value to a Custom Variable. Supports the use of constant strings, variables, and formulas. Chinese characters are not allowed. Length cannot exceed 1000 characters.</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public SetParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetParameters(SetParameters source) {
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

