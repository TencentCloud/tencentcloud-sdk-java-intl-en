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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCPrecisionPlyRecord extends AbstractModel {

    /**
    * Type of the configuration field. Only `value` is supported.
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * Configuration field. Valid values: `cgi`, `ua`, `cookie`, `referer`, `accept`, and `srcip`.
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * Value of the configuration field
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Filters values of configuration fields. `equal`: The value matches the configuration field. `not_equal`: The value does not match the configuration field. `include`: The value is included.
    */
    @SerializedName("ValueOperator")
    @Expose
    private String ValueOperator;

    /**
     * Get Type of the configuration field. Only `value` is supported. 
     * @return FieldType Type of the configuration field. Only `value` is supported.
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set Type of the configuration field. Only `value` is supported.
     * @param FieldType Type of the configuration field. Only `value` is supported.
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get Configuration field. Valid values: `cgi`, `ua`, `cookie`, `referer`, `accept`, and `srcip`. 
     * @return FieldName Configuration field. Valid values: `cgi`, `ua`, `cookie`, `referer`, `accept`, and `srcip`.
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set Configuration field. Valid values: `cgi`, `ua`, `cookie`, `referer`, `accept`, and `srcip`.
     * @param FieldName Configuration field. Valid values: `cgi`, `ua`, `cookie`, `referer`, `accept`, and `srcip`.
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get Value of the configuration field 
     * @return Value Value of the configuration field
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value of the configuration field
     * @param Value Value of the configuration field
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Filters values of configuration fields. `equal`: The value matches the configuration field. `not_equal`: The value does not match the configuration field. `include`: The value is included. 
     * @return ValueOperator Filters values of configuration fields. `equal`: The value matches the configuration field. `not_equal`: The value does not match the configuration field. `include`: The value is included.
     */
    public String getValueOperator() {
        return this.ValueOperator;
    }

    /**
     * Set Filters values of configuration fields. `equal`: The value matches the configuration field. `not_equal`: The value does not match the configuration field. `include`: The value is included.
     * @param ValueOperator Filters values of configuration fields. `equal`: The value matches the configuration field. `not_equal`: The value does not match the configuration field. `include`: The value is included.
     */
    public void setValueOperator(String ValueOperator) {
        this.ValueOperator = ValueOperator;
    }

    public CCPrecisionPlyRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCPrecisionPlyRecord(CCPrecisionPlyRecord source) {
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueOperator != null) {
            this.ValueOperator = new String(source.ValueOperator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueOperator", this.ValueOperator);

    }
}

