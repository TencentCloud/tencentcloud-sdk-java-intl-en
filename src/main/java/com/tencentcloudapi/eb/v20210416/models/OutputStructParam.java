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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputStructParam extends AbstractModel{

    /**
    * Key in the corresponding JSON output
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * You can enter a JsonPath, constant, or built-in date type
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Data type of `Value`. Valid values: STRING, NUMBER, BOOLEAN, NULL, SYS_VARIABLE, JSONPATH
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
     * Get Key in the corresponding JSON output 
     * @return Key Key in the corresponding JSON output
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key in the corresponding JSON output
     * @param Key Key in the corresponding JSON output
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get You can enter a JsonPath, constant, or built-in date type 
     * @return Value You can enter a JsonPath, constant, or built-in date type
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set You can enter a JsonPath, constant, or built-in date type
     * @param Value You can enter a JsonPath, constant, or built-in date type
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Data type of `Value`. Valid values: STRING, NUMBER, BOOLEAN, NULL, SYS_VARIABLE, JSONPATH 
     * @return ValueType Data type of `Value`. Valid values: STRING, NUMBER, BOOLEAN, NULL, SYS_VARIABLE, JSONPATH
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Data type of `Value`. Valid values: STRING, NUMBER, BOOLEAN, NULL, SYS_VARIABLE, JSONPATH
     * @param ValueType Data type of `Value`. Valid values: STRING, NUMBER, BOOLEAN, NULL, SYS_VARIABLE, JSONPATH
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    public OutputStructParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputStructParam(OutputStructParam source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);

    }
}

