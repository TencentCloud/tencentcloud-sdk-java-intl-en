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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParameterDetail extends AbstractModel {

    /**
    * Parameter name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Data type of the parameter. Valid values: `integer`, `enum`
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
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * Minimum value of the parameter
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * Enumerated values of the parameter
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * Parameter status. Valid values: `0` (normal), `1` (modifying)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get Data type of the parameter. Valid values: `integer`, `enum` 
     * @return ParamType Data type of the parameter. Valid values: `integer`, `enum`
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set Data type of the parameter. Valid values: `integer`, `enum`
     * @param ParamType Data type of the parameter. Valid values: `integer`, `enum`
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
     * @return Max Maximum value of the parameter
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value of the parameter
     * @param Max Maximum value of the parameter
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get Minimum value of the parameter 
     * @return Min Minimum value of the parameter
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value of the parameter
     * @param Min Minimum value of the parameter
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get Enumerated values of the parameter 
     * @return EnumValue Enumerated values of the parameter
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Enumerated values of the parameter
     * @param EnumValue Enumerated values of the parameter
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get Parameter status. Valid values: `0` (normal), `1` (modifying) 
     * @return Status Parameter status. Valid values: `0` (normal), `1` (modifying)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Parameter status. Valid values: `0` (normal), `1` (modifying)
     * @param Status Parameter status. Valid values: `0` (normal), `1` (modifying)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
            this.Max = new Long(source.Max);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

