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

public class InputParameterForManage extends AbstractModel {

    /**
    * Value type. Integer: Integer, String: String.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * Parameter key
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ParameterKey")
    @Expose
    private String ParameterKey;

    /**
    * Parameter type. Required type: Required, Optional type: Optional.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Default value

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Description

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Value type. Integer: Integer, String: String.
Note: This field may return null, indicating that no valid value is found. 
     * @return ValueType Value type. Integer: Integer, String: String.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Value type. Integer: Integer, String: String.
Note: This field may return null, indicating that no valid value is found.
     * @param ValueType Value type. Integer: Integer, String: String.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get Parameter key
Note: This field may return null, indicating that no valid value is found. 
     * @return ParameterKey Parameter key
Note: This field may return null, indicating that no valid value is found.
     */
    public String getParameterKey() {
        return this.ParameterKey;
    }

    /**
     * Set Parameter key
Note: This field may return null, indicating that no valid value is found.
     * @param ParameterKey Parameter key
Note: This field may return null, indicating that no valid value is found.
     */
    public void setParameterKey(String ParameterKey) {
        this.ParameterKey = ParameterKey;
    }

    /**
     * Get Parameter type. Required type: Required, Optional type: Optional.
Note: This field may return null, indicating that no valid value is found. 
     * @return Type Parameter type. Required type: Required, Optional type: Optional.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Parameter type. Required type: Required, Optional type: Optional.
Note: This field may return null, indicating that no valid value is found.
     * @param Type Parameter type. Required type: Required, Optional type: Optional.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Default value

Note: This field may return null, indicating that no valid value is found. 
     * @return DefaultValue Default value

Note: This field may return null, indicating that no valid value is found.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value

Note: This field may return null, indicating that no valid value is found.
     * @param DefaultValue Default value

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Description

Note: This field may return null, indicating that no valid value is found. 
     * @return Description Description

Note: This field may return null, indicating that no valid value is found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description

Note: This field may return null, indicating that no valid value is found.
     * @param Description Description

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public InputParameterForManage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputParameterForManage(InputParameterForManage source) {
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.ParameterKey != null) {
            this.ParameterKey = new String(source.ParameterKey);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "ParameterKey", this.ParameterKey);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

