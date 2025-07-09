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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputParameter extends AbstractModel {

    /**
    * Parameter name
    */
    @SerializedName("ParameterKey")
    @Expose
    private String ParameterKey;

    /**
    * Parameter type. Required type: Require, optional type: Optional.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Parameter value

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Parameter name 
     * @return ParameterKey Parameter name
     */
    public String getParameterKey() {
        return this.ParameterKey;
    }

    /**
     * Set Parameter name
     * @param ParameterKey Parameter name
     */
    public void setParameterKey(String ParameterKey) {
        this.ParameterKey = ParameterKey;
    }

    /**
     * Get Parameter type. Required type: Require, optional type: Optional. 
     * @return Type Parameter type. Required type: Require, optional type: Optional.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Parameter type. Required type: Require, optional type: Optional.
     * @param Type Parameter type. Required type: Require, optional type: Optional.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Parameter value

Note: This field may return null, indicating that no valid value is found. 
     * @return Value Parameter value

Note: This field may return null, indicating that no valid value is found.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Parameter value

Note: This field may return null, indicating that no valid value is found.
     * @param Value Parameter value

Note: This field may return null, indicating that no valid value is found.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public InputParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputParameter(InputParameter source) {
        if (source.ParameterKey != null) {
            this.ParameterKey = new String(source.ParameterKey);
        }
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
        this.setParamSimple(map, prefix + "ParameterKey", this.ParameterKey);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

