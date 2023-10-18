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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamDetail extends AbstractModel {

    /**
    * Parameter name
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Parameter type. Valid values:  `integer`, `enum`, `float`, `string`, `func`.
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * Whether `func` is supported. Valid values: `true` (supported), `false` (not supported).
    */
    @SerializedName("SupportFunc")
    @Expose
    private Boolean SupportFunc;

    /**
    * Default value
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * Parameter description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Current value of the parameter
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes).
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

    /**
    * Maximum value of the parameter
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * Minimum value of the parameter
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Enumerated values of the parameter.  It is null if the parameter is non-enumerated. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * Valid values: `1` (global parameter),  `0`  (non-global parameter).
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * The match type. Valid value: `multiVal`.
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * Match values, which will be separated by comma when `MatchType` is `multiVal`.
    */
    @SerializedName("MatchValue")
    @Expose
    private String MatchValue;

    /**
    * Whether it is a `func` type. Valid values: `true` (yes), `false` (no). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsFunc")
    @Expose
    private Boolean IsFunc;

    /**
    * Formula content returned when `ParamType` is `func`. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Func")
    @Expose
    private String Func;

    /**
    * Whether the parameter can be modified Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiableInfo")
    @Expose
    private ModifiableInfo ModifiableInfo;

    /**
     * Get Parameter name 
     * @return ParamName Parameter name
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name
     * @param ParamName Parameter name
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Parameter type. Valid values:  `integer`, `enum`, `float`, `string`, `func`. 
     * @return ParamType Parameter type. Valid values:  `integer`, `enum`, `float`, `string`, `func`.
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set Parameter type. Valid values:  `integer`, `enum`, `float`, `string`, `func`.
     * @param ParamType Parameter type. Valid values:  `integer`, `enum`, `float`, `string`, `func`.
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get Whether `func` is supported. Valid values: `true` (supported), `false` (not supported). 
     * @return SupportFunc Whether `func` is supported. Valid values: `true` (supported), `false` (not supported).
     */
    public Boolean getSupportFunc() {
        return this.SupportFunc;
    }

    /**
     * Set Whether `func` is supported. Valid values: `true` (supported), `false` (not supported).
     * @param SupportFunc Whether `func` is supported. Valid values: `true` (supported), `false` (not supported).
     */
    public void setSupportFunc(Boolean SupportFunc) {
        this.SupportFunc = SupportFunc;
    }

    /**
     * Get Default value 
     * @return Default Default value
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set Default value
     * @param Default Default value
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get Parameter description 
     * @return Description Parameter description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Parameter description
     * @param Description Parameter description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Current value of the parameter 
     * @return CurrentValue Current value of the parameter
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Current value of the parameter
     * @param CurrentValue Current value of the parameter
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes). 
     * @return NeedReboot Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes).
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes).
     * @param NeedReboot Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes).
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get Maximum value of the parameter 
     * @return Max Maximum value of the parameter
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value of the parameter
     * @param Max Maximum value of the parameter
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get Minimum value of the parameter 
     * @return Min Minimum value of the parameter
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value of the parameter
     * @param Min Minimum value of the parameter
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get Enumerated values of the parameter.  It is null if the parameter is non-enumerated. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnumValue Enumerated values of the parameter.  It is null if the parameter is non-enumerated. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Enumerated values of the parameter.  It is null if the parameter is non-enumerated. Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnumValue Enumerated values of the parameter.  It is null if the parameter is non-enumerated. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get Valid values: `1` (global parameter),  `0`  (non-global parameter). 
     * @return IsGlobal Valid values: `1` (global parameter),  `0`  (non-global parameter).
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Valid values: `1` (global parameter),  `0`  (non-global parameter).
     * @param IsGlobal Valid values: `1` (global parameter),  `0`  (non-global parameter).
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get The match type. Valid value: `multiVal`. 
     * @return MatchType The match type. Valid value: `multiVal`.
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set The match type. Valid value: `multiVal`.
     * @param MatchType The match type. Valid value: `multiVal`.
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get Match values, which will be separated by comma when `MatchType` is `multiVal`. 
     * @return MatchValue Match values, which will be separated by comma when `MatchType` is `multiVal`.
     */
    public String getMatchValue() {
        return this.MatchValue;
    }

    /**
     * Set Match values, which will be separated by comma when `MatchType` is `multiVal`.
     * @param MatchValue Match values, which will be separated by comma when `MatchType` is `multiVal`.
     */
    public void setMatchValue(String MatchValue) {
        this.MatchValue = MatchValue;
    }

    /**
     * Get Whether it is a `func` type. Valid values: `true` (yes), `false` (no). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsFunc Whether it is a `func` type. Valid values: `true` (yes), `false` (no). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsFunc() {
        return this.IsFunc;
    }

    /**
     * Set Whether it is a `func` type. Valid values: `true` (yes), `false` (no). Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsFunc Whether it is a `func` type. Valid values: `true` (yes), `false` (no). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsFunc(Boolean IsFunc) {
        this.IsFunc = IsFunc;
    }

    /**
     * Get Formula content returned when `ParamType` is `func`. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Func Formula content returned when `ParamType` is `func`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFunc() {
        return this.Func;
    }

    /**
     * Set Formula content returned when `ParamType` is `func`. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Func Formula content returned when `ParamType` is `func`. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFunc(String Func) {
        this.Func = Func;
    }

    /**
     * Get Whether the parameter can be modified Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifiableInfo Whether the parameter can be modified Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ModifiableInfo getModifiableInfo() {
        return this.ModifiableInfo;
    }

    /**
     * Set Whether the parameter can be modified Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifiableInfo Whether the parameter can be modified Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiableInfo(ModifiableInfo ModifiableInfo) {
        this.ModifiableInfo = ModifiableInfo;
    }

    public ParamDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamDetail(ParamDetail source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.SupportFunc != null) {
            this.SupportFunc = new Boolean(source.SupportFunc);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Long(source.NeedReboot);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.MatchValue != null) {
            this.MatchValue = new String(source.MatchValue);
        }
        if (source.IsFunc != null) {
            this.IsFunc = new Boolean(source.IsFunc);
        }
        if (source.Func != null) {
            this.Func = new String(source.Func);
        }
        if (source.ModifiableInfo != null) {
            this.ModifiableInfo = new ModifiableInfo(source.ModifiableInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "SupportFunc", this.SupportFunc);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "MatchValue", this.MatchValue);
        this.setParamSimple(map, prefix + "IsFunc", this.IsFunc);
        this.setParamSimple(map, prefix + "Func", this.Func);
        this.setParamObj(map, prefix + "ModifiableInfo.", this.ModifiableInfo);

    }
}

