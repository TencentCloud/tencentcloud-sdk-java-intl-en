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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParameterDetail extends AbstractModel{

    /**
    * Parameter name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Data type of the parameter
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * Default value of the parameter
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
    * Whether the database needs to be restarted for the modified parameter to take effect. Valid values: `0` (no),`1` (yes)
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

    /**
    * Maximum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * Minimum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Enumerated values of the parameter. It is null if the parameter is non-enumerated
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
     * Get Parameter name 
     * @return Name Parameter name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name
     * @param Name Parameter name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Data type of the parameter 
     * @return ParamType Data type of the parameter
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set Data type of the parameter
     * @param ParamType Data type of the parameter
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get Default value of the parameter 
     * @return Default Default value of the parameter
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set Default value of the parameter
     * @param Default Default value of the parameter
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
     * Get Whether the database needs to be restarted for the modified parameter to take effect. Valid values: `0` (no),`1` (yes) 
     * @return NeedReboot Whether the database needs to be restarted for the modified parameter to take effect. Valid values: `0` (no),`1` (yes)
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set Whether the database needs to be restarted for the modified parameter to take effect. Valid values: `0` (no),`1` (yes)
     * @param NeedReboot Whether the database needs to be restarted for the modified parameter to take effect. Valid values: `0` (no),`1` (yes)
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get Maximum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Max Maximum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Max Maximum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get Minimum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Min Minimum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Min Minimum value of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get Enumerated values of the parameter. It is null if the parameter is non-enumerated
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EnumValue Enumerated values of the parameter. It is null if the parameter is non-enumerated
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Enumerated values of the parameter. It is null if the parameter is non-enumerated
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EnumValue Enumerated values of the parameter. It is null if the parameter is non-enumerated
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    public ParameterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParameterDetail(ParameterDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);

    }
}

