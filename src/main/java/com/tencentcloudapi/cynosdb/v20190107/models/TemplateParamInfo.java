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

public class TemplateParamInfo extends AbstractModel {

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
    * The collection of optional value types when the parameter type is `enum`.
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * The maximum value when the parameter type is float/integer.
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * Minimum value when the parameter type is float/integer.
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Parameter name
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Whether to restart the instance for the parameter to take effect
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

    /**
    * Parameter description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Parameter type. Valid value: `integer`, `float`, `string`, `enum`.
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

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
     * Get The collection of optional value types when the parameter type is `enum`. 
     * @return EnumValue The collection of optional value types when the parameter type is `enum`.
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set The collection of optional value types when the parameter type is `enum`.
     * @param EnumValue The collection of optional value types when the parameter type is `enum`.
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get The maximum value when the parameter type is float/integer. 
     * @return Max The maximum value when the parameter type is float/integer.
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set The maximum value when the parameter type is float/integer.
     * @param Max The maximum value when the parameter type is float/integer.
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get Minimum value when the parameter type is float/integer. 
     * @return Min Minimum value when the parameter type is float/integer.
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value when the parameter type is float/integer.
     * @param Min Minimum value when the parameter type is float/integer.
     */
    public void setMin(String Min) {
        this.Min = Min;
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
     * Get Whether to restart the instance for the parameter to take effect 
     * @return NeedReboot Whether to restart the instance for the parameter to take effect
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set Whether to restart the instance for the parameter to take effect
     * @param NeedReboot Whether to restart the instance for the parameter to take effect
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
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
     * Get Parameter type. Valid value: `integer`, `float`, `string`, `enum`. 
     * @return ParamType Parameter type. Valid value: `integer`, `float`, `string`, `enum`.
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set Parameter type. Valid value: `integer`, `float`, `string`, `enum`.
     * @param ParamType Parameter type. Valid value: `integer`, `float`, `string`, `enum`.
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    public TemplateParamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateParamInfo(TemplateParamInfo source) {
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);

    }
}

