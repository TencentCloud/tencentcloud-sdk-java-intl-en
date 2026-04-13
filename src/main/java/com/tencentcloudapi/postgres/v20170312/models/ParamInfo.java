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

public class ParamInfo extends AbstractModel {

    /**
    * Parameter ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter value type: integer, real, bool, enum, mutil_enum.
When the parameter type is integer or real (floating-point), the value range is determined based on the Max and Min of the return value. 
When the parameter type is boolean, the valid values are true or false. 
When the parameter type is enum (enumeration type) or mutil_enum (multi-enum type), the valid values are determined by EnumValue in the return value.
    */
    @SerializedName("ParamValueType")
    @Expose
    private String ParamValueType;

    /**
    * Parameter value unit. returns null if the parameter has no units.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Default parameter value. returns in string form.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Specifies the current value in string form.
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Specifies the numerical type (integer, real) parameter and its lower bound.
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * Value range of the enum parameter
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * Numerical type (integer, real) parameter specifies the upper bound.
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * Chinese description.
    */
    @SerializedName("ParamDescriptionCH")
    @Expose
    private String ParamDescriptionCH;

    /**
    * Specifies the english description of the parameter.
    */
    @SerializedName("ParamDescriptionEN")
    @Expose
    private String ParamDescriptionEN;

    /**
    * Specifies whether a restart is required for parameter modification (true indicates required, false indicates not required).
    */
    @SerializedName("NeedReboot")
    @Expose
    private Boolean NeedReboot;

    /**
    * Parameter chinese category.
    */
    @SerializedName("ClassificationCN")
    @Expose
    private String ClassificationCN;

    /**
    * Parameter english category.
    */
    @SerializedName("ClassificationEN")
    @Expose
    private String ClassificationEN;

    /**
    * Specifies whether it is related to the specification (true for related, false for unrelated).
    */
    @SerializedName("SpecRelated")
    @Expose
    private Boolean SpecRelated;

    /**
    * Indicates whether it is a key parameter (true means it is a key parameter, modification requires special attention and may affect instance performance).
    */
    @SerializedName("Advanced")
    @Expose
    private Boolean Advanced;

    /**
    * Specifies the last modified time.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private String LastModifyTime;

    /**
    * Parameter primary-secondary constraints. `0`: no constraint between primary and standby. `1`: standby parameter value > primary machine parameter value. `2`: primary parameter value must be greater than that of the standby machine.
    */
    @SerializedName("StandbyRelated")
    @Expose
    private Long StandbyRelated;

    /**
    * Parameter version association information, containing detailed parameter information for the respective kernel version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionRelationSet")
    @Expose
    private ParamVersionRelation [] VersionRelationSet;

    /**
    * Parameter specification association information, containing detailed parameter information for the respective specification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecRelationSet")
    @Expose
    private ParamSpecRelation [] SpecRelationSet;

    /**
     * Get Parameter ID 
     * @return ID Parameter ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Parameter ID
     * @param ID Parameter ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

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
     * Get Parameter value type: integer, real, bool, enum, mutil_enum.
When the parameter type is integer or real (floating-point), the value range is determined based on the Max and Min of the return value. 
When the parameter type is boolean, the valid values are true or false. 
When the parameter type is enum (enumeration type) or mutil_enum (multi-enum type), the valid values are determined by EnumValue in the return value. 
     * @return ParamValueType Parameter value type: integer, real, bool, enum, mutil_enum.
When the parameter type is integer or real (floating-point), the value range is determined based on the Max and Min of the return value. 
When the parameter type is boolean, the valid values are true or false. 
When the parameter type is enum (enumeration type) or mutil_enum (multi-enum type), the valid values are determined by EnumValue in the return value.
     */
    public String getParamValueType() {
        return this.ParamValueType;
    }

    /**
     * Set Parameter value type: integer, real, bool, enum, mutil_enum.
When the parameter type is integer or real (floating-point), the value range is determined based on the Max and Min of the return value. 
When the parameter type is boolean, the valid values are true or false. 
When the parameter type is enum (enumeration type) or mutil_enum (multi-enum type), the valid values are determined by EnumValue in the return value.
     * @param ParamValueType Parameter value type: integer, real, bool, enum, mutil_enum.
When the parameter type is integer or real (floating-point), the value range is determined based on the Max and Min of the return value. 
When the parameter type is boolean, the valid values are true or false. 
When the parameter type is enum (enumeration type) or mutil_enum (multi-enum type), the valid values are determined by EnumValue in the return value.
     */
    public void setParamValueType(String ParamValueType) {
        this.ParamValueType = ParamValueType;
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
     * Get Default parameter value. returns in string form. 
     * @return DefaultValue Default parameter value. returns in string form.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default parameter value. returns in string form.
     * @param DefaultValue Default parameter value. returns in string form.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Specifies the current value in string form. 
     * @return CurrentValue Specifies the current value in string form.
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Specifies the current value in string form.
     * @param CurrentValue Specifies the current value in string form.
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Specifies the numerical type (integer, real) parameter and its lower bound. 
     * @return Max Specifies the numerical type (integer, real) parameter and its lower bound.
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set Specifies the numerical type (integer, real) parameter and its lower bound.
     * @param Max Specifies the numerical type (integer, real) parameter and its lower bound.
     */
    public void setMax(Float Max) {
        this.Max = Max;
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
     * Get Numerical type (integer, real) parameter specifies the upper bound. 
     * @return Min Numerical type (integer, real) parameter specifies the upper bound.
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set Numerical type (integer, real) parameter specifies the upper bound.
     * @param Min Numerical type (integer, real) parameter specifies the upper bound.
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get Chinese description. 
     * @return ParamDescriptionCH Chinese description.
     */
    public String getParamDescriptionCH() {
        return this.ParamDescriptionCH;
    }

    /**
     * Set Chinese description.
     * @param ParamDescriptionCH Chinese description.
     */
    public void setParamDescriptionCH(String ParamDescriptionCH) {
        this.ParamDescriptionCH = ParamDescriptionCH;
    }

    /**
     * Get Specifies the english description of the parameter. 
     * @return ParamDescriptionEN Specifies the english description of the parameter.
     */
    public String getParamDescriptionEN() {
        return this.ParamDescriptionEN;
    }

    /**
     * Set Specifies the english description of the parameter.
     * @param ParamDescriptionEN Specifies the english description of the parameter.
     */
    public void setParamDescriptionEN(String ParamDescriptionEN) {
        this.ParamDescriptionEN = ParamDescriptionEN;
    }

    /**
     * Get Specifies whether a restart is required for parameter modification (true indicates required, false indicates not required). 
     * @return NeedReboot Specifies whether a restart is required for parameter modification (true indicates required, false indicates not required).
     */
    public Boolean getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set Specifies whether a restart is required for parameter modification (true indicates required, false indicates not required).
     * @param NeedReboot Specifies whether a restart is required for parameter modification (true indicates required, false indicates not required).
     */
    public void setNeedReboot(Boolean NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get Parameter chinese category. 
     * @return ClassificationCN Parameter chinese category.
     */
    public String getClassificationCN() {
        return this.ClassificationCN;
    }

    /**
     * Set Parameter chinese category.
     * @param ClassificationCN Parameter chinese category.
     */
    public void setClassificationCN(String ClassificationCN) {
        this.ClassificationCN = ClassificationCN;
    }

    /**
     * Get Parameter english category. 
     * @return ClassificationEN Parameter english category.
     */
    public String getClassificationEN() {
        return this.ClassificationEN;
    }

    /**
     * Set Parameter english category.
     * @param ClassificationEN Parameter english category.
     */
    public void setClassificationEN(String ClassificationEN) {
        this.ClassificationEN = ClassificationEN;
    }

    /**
     * Get Specifies whether it is related to the specification (true for related, false for unrelated). 
     * @return SpecRelated Specifies whether it is related to the specification (true for related, false for unrelated).
     */
    public Boolean getSpecRelated() {
        return this.SpecRelated;
    }

    /**
     * Set Specifies whether it is related to the specification (true for related, false for unrelated).
     * @param SpecRelated Specifies whether it is related to the specification (true for related, false for unrelated).
     */
    public void setSpecRelated(Boolean SpecRelated) {
        this.SpecRelated = SpecRelated;
    }

    /**
     * Get Indicates whether it is a key parameter (true means it is a key parameter, modification requires special attention and may affect instance performance). 
     * @return Advanced Indicates whether it is a key parameter (true means it is a key parameter, modification requires special attention and may affect instance performance).
     */
    public Boolean getAdvanced() {
        return this.Advanced;
    }

    /**
     * Set Indicates whether it is a key parameter (true means it is a key parameter, modification requires special attention and may affect instance performance).
     * @param Advanced Indicates whether it is a key parameter (true means it is a key parameter, modification requires special attention and may affect instance performance).
     */
    public void setAdvanced(Boolean Advanced) {
        this.Advanced = Advanced;
    }

    /**
     * Get Specifies the last modified time. 
     * @return LastModifyTime Specifies the last modified time.
     */
    public String getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set Specifies the last modified time.
     * @param LastModifyTime Specifies the last modified time.
     */
    public void setLastModifyTime(String LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get Parameter primary-secondary constraints. `0`: no constraint between primary and standby. `1`: standby parameter value > primary machine parameter value. `2`: primary parameter value must be greater than that of the standby machine. 
     * @return StandbyRelated Parameter primary-secondary constraints. `0`: no constraint between primary and standby. `1`: standby parameter value > primary machine parameter value. `2`: primary parameter value must be greater than that of the standby machine.
     */
    public Long getStandbyRelated() {
        return this.StandbyRelated;
    }

    /**
     * Set Parameter primary-secondary constraints. `0`: no constraint between primary and standby. `1`: standby parameter value > primary machine parameter value. `2`: primary parameter value must be greater than that of the standby machine.
     * @param StandbyRelated Parameter primary-secondary constraints. `0`: no constraint between primary and standby. `1`: standby parameter value > primary machine parameter value. `2`: primary parameter value must be greater than that of the standby machine.
     */
    public void setStandbyRelated(Long StandbyRelated) {
        this.StandbyRelated = StandbyRelated;
    }

    /**
     * Get Parameter version association information, containing detailed parameter information for the respective kernel version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VersionRelationSet Parameter version association information, containing detailed parameter information for the respective kernel version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamVersionRelation [] getVersionRelationSet() {
        return this.VersionRelationSet;
    }

    /**
     * Set Parameter version association information, containing detailed parameter information for the respective kernel version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VersionRelationSet Parameter version association information, containing detailed parameter information for the respective kernel version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionRelationSet(ParamVersionRelation [] VersionRelationSet) {
        this.VersionRelationSet = VersionRelationSet;
    }

    /**
     * Get Parameter specification association information, containing detailed parameter information for the respective specification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecRelationSet Parameter specification association information, containing detailed parameter information for the respective specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamSpecRelation [] getSpecRelationSet() {
        return this.SpecRelationSet;
    }

    /**
     * Set Parameter specification association information, containing detailed parameter information for the respective specification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecRelationSet Parameter specification association information, containing detailed parameter information for the respective specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecRelationSet(ParamSpecRelation [] SpecRelationSet) {
        this.SpecRelationSet = SpecRelationSet;
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
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
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
        if (source.StandbyRelated != null) {
            this.StandbyRelated = new Long(source.StandbyRelated);
        }
        if (source.VersionRelationSet != null) {
            this.VersionRelationSet = new ParamVersionRelation[source.VersionRelationSet.length];
            for (int i = 0; i < source.VersionRelationSet.length; i++) {
                this.VersionRelationSet[i] = new ParamVersionRelation(source.VersionRelationSet[i]);
            }
        }
        if (source.SpecRelationSet != null) {
            this.SpecRelationSet = new ParamSpecRelation[source.SpecRelationSet.length];
            for (int i = 0; i < source.SpecRelationSet.length; i++) {
                this.SpecRelationSet[i] = new ParamSpecRelation(source.SpecRelationSet[i]);
            }
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
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "ParamDescriptionCH", this.ParamDescriptionCH);
        this.setParamSimple(map, prefix + "ParamDescriptionEN", this.ParamDescriptionEN);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "ClassificationCN", this.ClassificationCN);
        this.setParamSimple(map, prefix + "ClassificationEN", this.ClassificationEN);
        this.setParamSimple(map, prefix + "SpecRelated", this.SpecRelated);
        this.setParamSimple(map, prefix + "Advanced", this.Advanced);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "StandbyRelated", this.StandbyRelated);
        this.setParamArrayObj(map, prefix + "VersionRelationSet.", this.VersionRelationSet);
        this.setParamArrayObj(map, prefix + "SpecRelationSet.", this.SpecRelationSet);

    }
}

