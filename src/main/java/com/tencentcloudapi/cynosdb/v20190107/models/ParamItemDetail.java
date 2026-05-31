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

public class ParamItemDetail extends AbstractModel {

    /**
    * <p>Current value</p>
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * <p>Default value</p>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * <p>Optional enumerated value of the parameter. If it is a non-enumerated value, it is empty.</p>
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * <p>1: Global parameter, 0: Non-global parameter</p>
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * <p>Maximum value</p>
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * <p>Minimum value</p>
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * <p>After modifying parameters, whether database restart is required to take effect. 0-no restart required, 1-restart required.</p>
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

    /**
    * <p>Parameter name</p>
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * <p>Parameter type: integer, enum, float, string, func</p>
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * <p>Whether the parameter is modifiable</p>
    */
    @SerializedName("ModifiableInfo")
    @Expose
    private ModifiableInfo ModifiableInfo;

    /**
    * <p>Parameter description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Whether the type is formula</p>
    */
    @SerializedName("IsFunc")
    @Expose
    private Boolean IsFunc;

    /**
    * <p>Parameter configuration formula</p>
    */
    @SerializedName("Func")
    @Expose
    private String Func;

    /**
    * <p>Default formula style for parameters that support formulas</p>
    */
    @SerializedName("FuncPattern")
    @Expose
    private String FuncPattern;

    /**
     * Get <p>Current value</p> 
     * @return CurrentValue <p>Current value</p>
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set <p>Current value</p>
     * @param CurrentValue <p>Current value</p>
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get <p>Default value</p> 
     * @return Default <p>Default value</p>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set <p>Default value</p>
     * @param Default <p>Default value</p>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get <p>Optional enumerated value of the parameter. If it is a non-enumerated value, it is empty.</p> 
     * @return EnumValue <p>Optional enumerated value of the parameter. If it is a non-enumerated value, it is empty.</p>
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set <p>Optional enumerated value of the parameter. If it is a non-enumerated value, it is empty.</p>
     * @param EnumValue <p>Optional enumerated value of the parameter. If it is a non-enumerated value, it is empty.</p>
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get <p>1: Global parameter, 0: Non-global parameter</p> 
     * @return IsGlobal <p>1: Global parameter, 0: Non-global parameter</p>
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>1: Global parameter, 0: Non-global parameter</p>
     * @param IsGlobal <p>1: Global parameter, 0: Non-global parameter</p>
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get <p>Maximum value</p> 
     * @return Max <p>Maximum value</p>
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set <p>Maximum value</p>
     * @param Max <p>Maximum value</p>
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get <p>Minimum value</p> 
     * @return Min <p>Minimum value</p>
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set <p>Minimum value</p>
     * @param Min <p>Minimum value</p>
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get <p>After modifying parameters, whether database restart is required to take effect. 0-no restart required, 1-restart required.</p> 
     * @return NeedReboot <p>After modifying parameters, whether database restart is required to take effect. 0-no restart required, 1-restart required.</p>
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set <p>After modifying parameters, whether database restart is required to take effect. 0-no restart required, 1-restart required.</p>
     * @param NeedReboot <p>After modifying parameters, whether database restart is required to take effect. 0-no restart required, 1-restart required.</p>
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get <p>Parameter name</p> 
     * @return ParamName <p>Parameter name</p>
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set <p>Parameter name</p>
     * @param ParamName <p>Parameter name</p>
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get <p>Parameter type: integer, enum, float, string, func</p> 
     * @return ParamType <p>Parameter type: integer, enum, float, string, func</p>
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set <p>Parameter type: integer, enum, float, string, func</p>
     * @param ParamType <p>Parameter type: integer, enum, float, string, func</p>
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get <p>Whether the parameter is modifiable</p> 
     * @return ModifiableInfo <p>Whether the parameter is modifiable</p>
     */
    public ModifiableInfo getModifiableInfo() {
        return this.ModifiableInfo;
    }

    /**
     * Set <p>Whether the parameter is modifiable</p>
     * @param ModifiableInfo <p>Whether the parameter is modifiable</p>
     */
    public void setModifiableInfo(ModifiableInfo ModifiableInfo) {
        this.ModifiableInfo = ModifiableInfo;
    }

    /**
     * Get <p>Parameter description</p> 
     * @return Description <p>Parameter description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Parameter description</p>
     * @param Description <p>Parameter description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Whether the type is formula</p> 
     * @return IsFunc <p>Whether the type is formula</p>
     */
    public Boolean getIsFunc() {
        return this.IsFunc;
    }

    /**
     * Set <p>Whether the type is formula</p>
     * @param IsFunc <p>Whether the type is formula</p>
     */
    public void setIsFunc(Boolean IsFunc) {
        this.IsFunc = IsFunc;
    }

    /**
     * Get <p>Parameter configuration formula</p> 
     * @return Func <p>Parameter configuration formula</p>
     */
    public String getFunc() {
        return this.Func;
    }

    /**
     * Set <p>Parameter configuration formula</p>
     * @param Func <p>Parameter configuration formula</p>
     */
    public void setFunc(String Func) {
        this.Func = Func;
    }

    /**
     * Get <p>Default formula style for parameters that support formulas</p> 
     * @return FuncPattern <p>Default formula style for parameters that support formulas</p>
     */
    public String getFuncPattern() {
        return this.FuncPattern;
    }

    /**
     * Set <p>Default formula style for parameters that support formulas</p>
     * @param FuncPattern <p>Default formula style for parameters that support formulas</p>
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
        if (source.ModifiableInfo != null) {
            this.ModifiableInfo = new ModifiableInfo(source.ModifiableInfo);
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
        this.setParamObj(map, prefix + "ModifiableInfo.", this.ModifiableInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsFunc", this.IsFunc);
        this.setParamSimple(map, prefix + "Func", this.Func);
        this.setParamSimple(map, prefix + "FuncPattern", this.FuncPattern);

    }
}

