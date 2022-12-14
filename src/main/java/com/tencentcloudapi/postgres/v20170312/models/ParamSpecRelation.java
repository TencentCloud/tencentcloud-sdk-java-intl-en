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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamSpecRelation extends AbstractModel{

    /**
    * Parameter name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The specification that corresponds to the parameter information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * The default parameter value under this specification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Unit of the parameter value. If the parameter has no unit, this field will return null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * The maximum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * The minimum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Parameter name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Parameter name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Parameter name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The specification that corresponds to the parameter information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Memory The specification that corresponds to the parameter information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set The specification that corresponds to the parameter information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Memory The specification that corresponds to the parameter information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get The default parameter value under this specification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value The default parameter value under this specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set The default parameter value under this specification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value The default parameter value under this specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Unit of the parameter value. If the parameter has no unit, this field will return null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Unit Unit of the parameter value. If the parameter has no unit, this field will return null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit of the parameter value. If the parameter has no unit, this field will return null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Unit Unit of the parameter value. If the parameter has no unit, this field will return null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get The maximum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Max The maximum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set The maximum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Max The maximum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get The minimum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Min The minimum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set The minimum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Min The minimum value of the `integer` or `real` parameter
Note: This field may return null, indicating that no valid values can be obtained.
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

    public ParamSpecRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamSpecRelation(ParamSpecRelation source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Memory != null) {
            this.Memory = new String(source.Memory);
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
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);

    }
}

