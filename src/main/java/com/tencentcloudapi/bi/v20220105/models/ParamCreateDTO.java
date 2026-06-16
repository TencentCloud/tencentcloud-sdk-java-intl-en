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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamCreateDTO extends AbstractModel {

    /**
    * Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Default value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Parameter type, string/datetime/number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * Format type, yyyy-MM-dd HH:mm:ss.SSS (only time required)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FormatRule")
    @Expose
    private String FormatRule;

    /**
    * Complex type, another format expression, such as YYYY-MM
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComplexType")
    @Expose
    private String ComplexType;

    /**
    * Application scope
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
     * Get Parameter name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamName Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamName Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Default value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultValue Default value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultValue Default value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Parameter type, string/datetime/number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamType Parameter type, string/datetime/number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set Parameter type, string/datetime/number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamType Parameter type, string/datetime/number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get Format type, yyyy-MM-dd HH:mm:ss.SSS (only time required)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FormatRule Format type, yyyy-MM-dd HH:mm:ss.SSS (only time required)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFormatRule() {
        return this.FormatRule;
    }

    /**
     * Set Format type, yyyy-MM-dd HH:mm:ss.SSS (only time required)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FormatRule Format type, yyyy-MM-dd HH:mm:ss.SSS (only time required)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFormatRule(String FormatRule) {
        this.FormatRule = FormatRule;
    }

    /**
     * Get Complex type, another format expression, such as YYYY-MM
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComplexType Complex type, another format expression, such as YYYY-MM
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComplexType() {
        return this.ComplexType;
    }

    /**
     * Set Complex type, another format expression, such as YYYY-MM
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComplexType Complex type, another format expression, such as YYYY-MM
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComplexType(String ComplexType) {
        this.ComplexType = ComplexType;
    }

    /**
     * Get Application scope
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scope Application scope
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set Application scope
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scope Application scope
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    public ParamCreateDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamCreateDTO(ParamCreateDTO source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.FormatRule != null) {
            this.FormatRule = new String(source.FormatRule);
        }
        if (source.ComplexType != null) {
            this.ComplexType = new String(source.ComplexType);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "FormatRule", this.FormatRule);
        this.setParamSimple(map, prefix + "ComplexType", this.ComplexType);
        this.setParamSimple(map, prefix + "Scope", this.Scope);

    }
}

