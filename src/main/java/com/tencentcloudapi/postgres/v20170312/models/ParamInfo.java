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

public class ParamInfo extends AbstractModel{

    /**
    * Parameter ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Value type of the parameter. Valid values: `integer`, `real` (floating-point), `bool`, `enum`, `mutil_enum` (this type of parameter can be set to multiple enumerated values)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamValueType")
    @Expose
    private String ParamValueType;

    /**
    * Value unit of the parameter. If the parameter has no unit, this field will return an empty string.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Default value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Current value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Value range of the enum parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * The maximum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * The minimum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * Parameter description in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamDescriptionCH")
    @Expose
    private String ParamDescriptionCH;

    /**
    * Parameter description in English
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamDescriptionEN")
    @Expose
    private String ParamDescriptionEN;

    /**
    * Whether to restart the instance for the modified parameter to take effect. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NeedReboot")
    @Expose
    private Boolean NeedReboot;

    /**
    * Parameter category in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassificationCN")
    @Expose
    private String ClassificationCN;

    /**
    * Parameter category in English
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassificationEN")
    @Expose
    private String ClassificationEN;

    /**
    * Whether the parameter is related to specifications. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecRelated")
    @Expose
    private Boolean SpecRelated;

    /**
    * Whether it is a key parameter. Valid values: `true` (yes, and modifying it may affect instance performance), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Advanced")
    @Expose
    private Boolean Advanced;

    /**
    * The last modified time of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private String LastModifyTime;

    /**
     * Get Parameter ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ID Parameter ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Parameter ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ID Parameter ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Name Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Name Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Value type of the parameter. Valid values: `integer`, `real` (floating-point), `bool`, `enum`, `mutil_enum` (this type of parameter can be set to multiple enumerated values)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ParamValueType Value type of the parameter. Valid values: `integer`, `real` (floating-point), `bool`, `enum`, `mutil_enum` (this type of parameter can be set to multiple enumerated values)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getParamValueType() {
        return this.ParamValueType;
    }

    /**
     * Set Value type of the parameter. Valid values: `integer`, `real` (floating-point), `bool`, `enum`, `mutil_enum` (this type of parameter can be set to multiple enumerated values)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ParamValueType Value type of the parameter. Valid values: `integer`, `real` (floating-point), `bool`, `enum`, `mutil_enum` (this type of parameter can be set to multiple enumerated values)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setParamValueType(String ParamValueType) {
        this.ParamValueType = ParamValueType;
    }

    /**
     * Get Value unit of the parameter. If the parameter has no unit, this field will return an empty string.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Unit Value unit of the parameter. If the parameter has no unit, this field will return an empty string.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Value unit of the parameter. If the parameter has no unit, this field will return an empty string.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Unit Value unit of the parameter. If the parameter has no unit, this field will return an empty string.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Default value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DefaultValue Default value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DefaultValue Default value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Current value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CurrentValue Current value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Current value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CurrentValue Current value of the parameter, which is returned as a string
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Value range of the enum parameter
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EnumValue Value range of the enum parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set Value range of the enum parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EnumValue Value range of the enum parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get The maximum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Max The maximum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set The maximum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Max The maximum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get The minimum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Min The minimum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set The minimum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Min The minimum value of the `integer` or `real` parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get Parameter description in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ParamDescriptionCH Parameter description in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getParamDescriptionCH() {
        return this.ParamDescriptionCH;
    }

    /**
     * Set Parameter description in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ParamDescriptionCH Parameter description in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setParamDescriptionCH(String ParamDescriptionCH) {
        this.ParamDescriptionCH = ParamDescriptionCH;
    }

    /**
     * Get Parameter description in English
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ParamDescriptionEN Parameter description in English
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getParamDescriptionEN() {
        return this.ParamDescriptionEN;
    }

    /**
     * Set Parameter description in English
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ParamDescriptionEN Parameter description in English
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setParamDescriptionEN(String ParamDescriptionEN) {
        this.ParamDescriptionEN = ParamDescriptionEN;
    }

    /**
     * Get Whether to restart the instance for the modified parameter to take effect. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return NeedReboot Whether to restart the instance for the modified parameter to take effect. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set Whether to restart the instance for the modified parameter to take effect. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param NeedReboot Whether to restart the instance for the modified parameter to take effect. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNeedReboot(Boolean NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get Parameter category in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClassificationCN Parameter category in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClassificationCN() {
        return this.ClassificationCN;
    }

    /**
     * Set Parameter category in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClassificationCN Parameter category in Chinese
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClassificationCN(String ClassificationCN) {
        this.ClassificationCN = ClassificationCN;
    }

    /**
     * Get Parameter category in English
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClassificationEN Parameter category in English
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClassificationEN() {
        return this.ClassificationEN;
    }

    /**
     * Set Parameter category in English
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClassificationEN Parameter category in English
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClassificationEN(String ClassificationEN) {
        this.ClassificationEN = ClassificationEN;
    }

    /**
     * Get Whether the parameter is related to specifications. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SpecRelated Whether the parameter is related to specifications. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getSpecRelated() {
        return this.SpecRelated;
    }

    /**
     * Set Whether the parameter is related to specifications. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SpecRelated Whether the parameter is related to specifications. Valid values: `true` (yes), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSpecRelated(Boolean SpecRelated) {
        this.SpecRelated = SpecRelated;
    }

    /**
     * Get Whether it is a key parameter. Valid values: `true` (yes, and modifying it may affect instance performance), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Advanced Whether it is a key parameter. Valid values: `true` (yes, and modifying it may affect instance performance), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getAdvanced() {
        return this.Advanced;
    }

    /**
     * Set Whether it is a key parameter. Valid values: `true` (yes, and modifying it may affect instance performance), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Advanced Whether it is a key parameter. Valid values: `true` (yes, and modifying it may affect instance performance), `false` (no)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAdvanced(Boolean Advanced) {
        this.Advanced = Advanced;
    }

    /**
     * Get The last modified time of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LastModifyTime The last modified time of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set The last modified time of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LastModifyTime The last modified time of the parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLastModifyTime(String LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    public ParamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamInfo(ParamInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParamValueType != null) {
            this.ParamValueType = new String(source.ParamValueType);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.ParamDescriptionCH != null) {
            this.ParamDescriptionCH = new String(source.ParamDescriptionCH);
        }
        if (source.ParamDescriptionEN != null) {
            this.ParamDescriptionEN = new String(source.ParamDescriptionEN);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Boolean(source.NeedReboot);
        }
        if (source.ClassificationCN != null) {
            this.ClassificationCN = new String(source.ClassificationCN);
        }
        if (source.ClassificationEN != null) {
            this.ClassificationEN = new String(source.ClassificationEN);
        }
        if (source.SpecRelated != null) {
            this.SpecRelated = new Boolean(source.SpecRelated);
        }
        if (source.Advanced != null) {
            this.Advanced = new Boolean(source.Advanced);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new String(source.LastModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParamValueType", this.ParamValueType);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "ParamDescriptionCH", this.ParamDescriptionCH);
        this.setParamSimple(map, prefix + "ParamDescriptionEN", this.ParamDescriptionEN);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "ClassificationCN", this.ClassificationCN);
        this.setParamSimple(map, prefix + "ClassificationEN", this.ClassificationEN);
        this.setParamSimple(map, prefix + "SpecRelated", this.SpecRelated);
        this.setParamSimple(map, prefix + "Advanced", this.Advanced);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);

    }
}

