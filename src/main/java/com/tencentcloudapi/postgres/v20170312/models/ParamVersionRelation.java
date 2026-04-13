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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamVersionRelation extends AbstractModel {

    /**
    * Parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter information belonging to kernel version.
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * Default value of the parameter for this version and specification.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Parameter value unit. returns null if the parameter has no units.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Numerical type (integer, real) parameter specifies the upper bound.
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * Specifies the numerical type (integer, real) parameter and its lower bound.
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * Value range of the enum parameter
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
     * Get Parameter name. 
     * @return Name Parameter name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name.
     * @param Name Parameter name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter information belonging to kernel version. 
     * @return DBKernelVersion Parameter information belonging to kernel version.
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set Parameter information belonging to kernel version.
     * @param DBKernelVersion Parameter information belonging to kernel version.
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get Default value of the parameter for this version and specification. 
     * @return Value Default value of the parameter for this version and specification.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Default value of the parameter for this version and specification.
     * @param Value Default value of the parameter for this version and specification.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Parameter value unit. returns null if the parameter has no units. 
     * @return Unit Parameter value unit. returns null if the parameter has no units.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Parameter value unit. returns null if the parameter has no units.
     * @param Unit Parameter value unit. returns null if the parameter has no units.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Numerical type (integer, real) parameter specifies the upper bound. 
     * @return Max Numerical type (integer, real) parameter specifies the upper bound.
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set Numerical type (integer, real) parameter specifies the upper bound.
     * @param Max Numerical type (integer, real) parameter specifies the upper bound.
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get Specifies the numerical type (integer, real) parameter and its lower bound. 
     * @return Min Specifies the numerical type (integer, real) parameter and its lower bound.
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set Specifies the numerical type (integer, real) parameter and its lower bound.
     * @param Min Specifies the numerical type (integer, real) parameter and its lower bound.
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get Value range of the enum parameter
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnumValue Value range of the enum parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Value range of the enum parameter
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnumValue Value range of the enum parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    public ParamVersionRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamVersionRelation(ParamVersionRelation source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
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
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);

    }
}

