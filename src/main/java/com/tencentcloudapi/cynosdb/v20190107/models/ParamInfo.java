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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamInfo extends AbstractModel {

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
    * Available option list when the parameter is enum, string, or bool.
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * Maximum value when the parameter type is float/integer.
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * Minimum value when the parameter type is float/integer
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Parameter name.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Whether a restart is required.
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

    /**
    * Parameter type: integer, float, string, enum, or bool.
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * Match type. multiVal and regex are used when the parameter type is string.
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * Match the target value. For multiVal, separate each key with a semicolon (;).
    */
    @SerializedName("MatchValue")
    @Expose
    private String MatchValue;

    /**
    * Parameter description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether it is a global parameter
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * Whether the parameter is modifiable
    */
    @SerializedName("ModifiableInfo")
    @Expose
    private ModifiableInfo ModifiableInfo;

    /**
    * Whether it is a function
    */
    @SerializedName("IsFunc")
    @Expose
    private Boolean IsFunc;

    /**
    * Function
    */
    @SerializedName("Func")
    @Expose
    private String Func;

    /**
    * Default formula style for parameters that support formulas
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
     * Get Available option list when the parameter is enum, string, or bool. 
     * @return EnumValue Available option list when the parameter is enum, string, or bool.
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Available option list when the parameter is enum, string, or bool.
     * @param EnumValue Available option list when the parameter is enum, string, or bool.
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get Maximum value when the parameter type is float/integer. 
     * @return Max Maximum value when the parameter type is float/integer.
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value when the parameter type is float/integer.
     * @param Max Maximum value when the parameter type is float/integer.
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get Minimum value when the parameter type is float/integer 
     * @return Min Minimum value when the parameter type is float/integer
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value when the parameter type is float/integer
     * @param Min Minimum value when the parameter type is float/integer
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get Parameter name. 
     * @return ParamName Parameter name.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name.
     * @param ParamName Parameter name.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Whether a restart is required. 
     * @return NeedReboot Whether a restart is required.
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set Whether a restart is required.
     * @param NeedReboot Whether a restart is required.
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get Parameter type: integer, float, string, enum, or bool. 
     * @return ParamType Parameter type: integer, float, string, enum, or bool.
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set Parameter type: integer, float, string, enum, or bool.
     * @param ParamType Parameter type: integer, float, string, enum, or bool.
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get Match type. multiVal and regex are used when the parameter type is string. 
     * @return MatchType Match type. multiVal and regex are used when the parameter type is string.
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set Match type. multiVal and regex are used when the parameter type is string.
     * @param MatchType Match type. multiVal and regex are used when the parameter type is string.
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get Match the target value. For multiVal, separate each key with a semicolon (;). 
     * @return MatchValue Match the target value. For multiVal, separate each key with a semicolon (;).
     */
    public String getMatchValue() {
        return this.MatchValue;
    }

    /**
     * Set Match the target value. For multiVal, separate each key with a semicolon (;).
     * @param MatchValue Match the target value. For multiVal, separate each key with a semicolon (;).
     */
    public void setMatchValue(String MatchValue) {
        this.MatchValue = MatchValue;
    }

    /**
     * Get Parameter description. 
     * @return Description Parameter description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Parameter description.
     * @param Description Parameter description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether it is a global parameter 
     * @return IsGlobal Whether it is a global parameter
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether it is a global parameter
     * @param IsGlobal Whether it is a global parameter
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Whether the parameter is modifiable 
     * @return ModifiableInfo Whether the parameter is modifiable
     */
    public ModifiableInfo getModifiableInfo() {
        return this.ModifiableInfo;
    }

    /**
     * Set Whether the parameter is modifiable
     * @param ModifiableInfo Whether the parameter is modifiable
     */
    public void setModifiableInfo(ModifiableInfo ModifiableInfo) {
        this.ModifiableInfo = ModifiableInfo;
    }

    /**
     * Get Whether it is a function 
     * @return IsFunc Whether it is a function
     */
    public Boolean getIsFunc() {
        return this.IsFunc;
    }

    /**
     * Set Whether it is a function
     * @param IsFunc Whether it is a function
     */
    public void setIsFunc(Boolean IsFunc) {
        this.IsFunc = IsFunc;
    }

    /**
     * Get Function 
     * @return Func Function
     */
    public String getFunc() {
        return this.Func;
    }

    /**
     * Set Function
     * @param Func Function
     */
    public void setFunc(String Func) {
        this.Func = Func;
    }

    /**
     * Get Default formula style for parameters that support formulas 
     * @return FuncPattern Default formula style for parameters that support formulas
     */
    public String getFuncPattern() {
        return this.FuncPattern;
    }

    /**
     * Set Default formula style for parameters that support formulas
     * @param FuncPattern Default formula style for parameters that support formulas
     */
    public void setFuncPattern(String FuncPattern) {
        this.FuncPattern = FuncPattern;
    }

    public ParamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamInfo(ParamInfo source) {
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
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Long(source.NeedReboot);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.MatchValue != null) {
            this.MatchValue = new String(source.MatchValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.ModifiableInfo != null) {
            this.ModifiableInfo = new ModifiableInfo(source.ModifiableInfo);
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
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "MatchValue", this.MatchValue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamObj(map, prefix + "ModifiableInfo.", this.ModifiableInfo);
        this.setParamSimple(map, prefix + "IsFunc", this.IsFunc);
        this.setParamSimple(map, prefix + "Func", this.Func);
        this.setParamSimple(map, prefix + "FuncPattern", this.FuncPattern);

    }
}

