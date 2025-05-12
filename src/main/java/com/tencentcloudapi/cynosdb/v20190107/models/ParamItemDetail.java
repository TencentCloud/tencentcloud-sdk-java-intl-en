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

public class ParamItemDetail extends AbstractModel {

    /**
    * Current value
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Default value
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * Enumerated values of the parameter It is null if the parameter is non-enumerated.
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
    * Maximum value
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * Minimum value
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes)
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

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
    * Parameter description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether the type is a formula.
    */
    @SerializedName("IsFunc")
    @Expose
    private Boolean IsFunc;

    /**
    * Parameter configuration formula.
    */
    @SerializedName("Func")
    @Expose
    private String Func;

    /**
    * The default formula style of parameters that support formulas.
    */
    @SerializedName("FuncPattern")
    @Expose
    private String FuncPattern;

    /**
     * Get Current value 
     * @return CurrentValue Current value
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Current value
     * @param CurrentValue Current value
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
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
     * Get Enumerated values of the parameter It is null if the parameter is non-enumerated. 
     * @return EnumValue Enumerated values of the parameter It is null if the parameter is non-enumerated.
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Enumerated values of the parameter It is null if the parameter is non-enumerated.
     * @param EnumValue Enumerated values of the parameter It is null if the parameter is non-enumerated.
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
     * Get Maximum value 
     * @return Max Maximum value
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value
     * @param Max Maximum value
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get Minimum value 
     * @return Min Minimum value
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value
     * @param Min Minimum value
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes) 
     * @return NeedReboot Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes)
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes)
     * @param NeedReboot Whether to restart the database for the modified parameters to take effect. Valid values:  `0` (no), `1` (yes)
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

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
     * Get Whether the type is a formula. 
     * @return IsFunc Whether the type is a formula.
     */
    public Boolean getIsFunc() {
        return this.IsFunc;
    }

    /**
     * Set Whether the type is a formula.
     * @param IsFunc Whether the type is a formula.
     */
    public void setIsFunc(Boolean IsFunc) {
        this.IsFunc = IsFunc;
    }

    /**
     * Get Parameter configuration formula. 
     * @return Func Parameter configuration formula.
     */
    public String getFunc() {
        return this.Func;
    }

    /**
     * Set Parameter configuration formula.
     * @param Func Parameter configuration formula.
     */
    public void setFunc(String Func) {
        this.Func = Func;
    }

    /**
     * Get The default formula style of parameters that support formulas. 
     * @return FuncPattern The default formula style of parameters that support formulas.
     */
    public String getFuncPattern() {
        return this.FuncPattern;
    }

    /**
     * Set The default formula style of parameters that support formulas.
     * @param FuncPattern The default formula style of parameters that support formulas.
     */
    public void setFuncPattern(String FuncPattern) {
        this.FuncPattern = FuncPattern;
    }

    public ParamItemDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamItemDetail(ParamItemDetail source) {
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
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
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Long(source.NeedReboot);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsFunc != null) {
            this.IsFunc = new Boolean(source.IsFunc);
        }
        if (source.Func != null) {
            this.Func = new String(source.Func);
        }
        if (source.FuncPattern != null) {
            this.FuncPattern = new String(source.FuncPattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsFunc", this.IsFunc);
        this.setParamSimple(map, prefix + "Func", this.Func);
        this.setParamSimple(map, prefix + "FuncPattern", this.FuncPattern);

    }
}

