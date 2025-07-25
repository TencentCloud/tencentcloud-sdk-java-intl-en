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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExcludePathInfo extends AbstractModel {

    /**
    * Type. Valid values: `File`, `Path`
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Specific content corresponding to `Type`
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Type. Valid values: `File`, `Path` 
     * @return Type Type. Valid values: `File`, `Path`
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type. Valid values: `File`, `Path`
     * @param Type Type. Valid values: `File`, `Path`
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Specific content corresponding to `Type` 
     * @return Value Specific content corresponding to `Type`
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Specific content corresponding to `Type`
     * @param Value Specific content corresponding to `Type`
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ExcludePathInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExcludePathInfo(ExcludePathInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

