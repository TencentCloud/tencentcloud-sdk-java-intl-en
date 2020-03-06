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
package com.tencentcloudapi.cdb.v20170320.models;

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
    * Parameter type
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
    * Whether the database needs to be restarted for the modified parameter to take effect. Value range: 0 (no); 1 (yes)
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
    * Enumerated values of the parameter. It is null if the parameter is non-enumerated
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
     * Get Parameter type 
     * @return ParamType Parameter type
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set Parameter type
     * @param ParamType Parameter type
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
     * Get Whether the database needs to be restarted for the modified parameter to take effect. Value range: 0 (no); 1 (yes) 
     * @return NeedReboot Whether the database needs to be restarted for the modified parameter to take effect. Value range: 0 (no); 1 (yes)
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set Whether the database needs to be restarted for the modified parameter to take effect. Value range: 0 (no); 1 (yes)
     * @param NeedReboot Whether the database needs to be restarted for the modified parameter to take effect. Value range: 0 (no); 1 (yes)
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
     * Get Enumerated values of the parameter. It is null if the parameter is non-enumerated 
     * @return EnumValue Enumerated values of the parameter. It is null if the parameter is non-enumerated
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Enumerated values of the parameter. It is null if the parameter is non-enumerated
     * @param EnumValue Enumerated values of the parameter. It is null if the parameter is non-enumerated
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
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

