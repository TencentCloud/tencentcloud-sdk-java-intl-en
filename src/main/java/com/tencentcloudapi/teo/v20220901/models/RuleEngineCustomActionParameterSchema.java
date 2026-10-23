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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleEngineCustomActionParameterSchema extends AbstractModel {

    /**
    * <p>Parameter field name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Parameter field data type. Valid values: <li>Boolean: boolean;</li><li>Integer: integer;</li><li>Float: floating-point;</li><li>String: string;</li><li>ArrayOfInteger: integer array;</li><li>ArrayOfFloat: floating-point array;</li><li>ArrayOfString: array of strings.</li></p>
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * <p>Parameter field description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Field default value of the parameter.</p>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * <p>Parameter field unit.</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>Whether the parameter field is required or not.</p><p>Default value: false</p><p>If filled, it is applicable to ALL parameter field type verification; if left blank, no verification.</p>
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * <p>Minimum value of the parameter field.</p><p>If filled, it is used to validate the value for integer, floating-point number, integer array, and floating-point number array type parameters; if left blank, there is no verification.</p>
    */
    @SerializedName("MinValue")
    @Expose
    private Float MinValue;

    /**
    * <p>Maximum value of the parameter field.</p><p>If filled, it is used for value verification of type parameters for integers, floating-point numbers, integer arrays, and floating-point number arrays. If left blank, there is no verification.</p>
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * <p>Minimum length of the parameter field.</p><p>If filled, it is used for value verification of string and string array type parameters. If not filled, there is no verification.</p>
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
    * <p>Maximum length of the parameter field.</p><p>If filled, it is used for value verification for strings and array of strings type parameters; if left blank, no verification.</p>
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * <p>Minimum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters; if left blank, there is no verification.</p>
    */
    @SerializedName("MinItems")
    @Expose
    private Long MinItems;

    /**
    * <p>Maximum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters. If left blank, there is no verification.</p>
    */
    @SerializedName("MaxItems")
    @Expose
    private Long MaxItems;

    /**
    * <p>Whether the parameter field item is unique.</p><p>Default value: false</p><p>If filled, it is applicable to various array type parameter value verification; if left blank, no verification.</p>
    */
    @SerializedName("UniqueItems")
    @Expose
    private Boolean UniqueItems;

    /**
    * <p>Allowed format of the parameter field.</p><p>If filled, verification of string or string array content is required. If not filled, there is no verification.</p>
    */
    @SerializedName("AllowedPattern")
    @Expose
    private String AllowedPattern;

    /**
    * <p>Allowed values of the parameter field. If empty, there is no verification.</p><p>If this parameter is filled, it indicates that the corresponding parameter is an enum and only allows values from this parameter array; if left blank, there is no verification.</p>
    */
    @SerializedName("AllowedValues")
    @Expose
    private String [] AllowedValues;

    /**
    * <p>Minimum step size of the parameter field.</p><p>If filled, it is suitable for value verification of floating-point and floating-point array type parameters. If not filled, there is no verification.</p>
    */
    @SerializedName("MultipleOf")
    @Expose
    private String MultipleOf;

    /**
     * Get <p>Parameter field name.</p> 
     * @return Name <p>Parameter field name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Parameter field name.</p>
     * @param Name <p>Parameter field name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Parameter field data type. Valid values: <li>Boolean: boolean;</li><li>Integer: integer;</li><li>Float: floating-point;</li><li>String: string;</li><li>ArrayOfInteger: integer array;</li><li>ArrayOfFloat: floating-point array;</li><li>ArrayOfString: array of strings.</li></p> 
     * @return ValueType <p>Parameter field data type. Valid values: <li>Boolean: boolean;</li><li>Integer: integer;</li><li>Float: floating-point;</li><li>String: string;</li><li>ArrayOfInteger: integer array;</li><li>ArrayOfFloat: floating-point array;</li><li>ArrayOfString: array of strings.</li></p>
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>Parameter field data type. Valid values: <li>Boolean: boolean;</li><li>Integer: integer;</li><li>Float: floating-point;</li><li>String: string;</li><li>ArrayOfInteger: integer array;</li><li>ArrayOfFloat: floating-point array;</li><li>ArrayOfString: array of strings.</li></p>
     * @param ValueType <p>Parameter field data type. Valid values: <li>Boolean: boolean;</li><li>Integer: integer;</li><li>Float: floating-point;</li><li>String: string;</li><li>ArrayOfInteger: integer array;</li><li>ArrayOfFloat: floating-point array;</li><li>ArrayOfString: array of strings.</li></p>
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get <p>Parameter field description.</p> 
     * @return Description <p>Parameter field description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Parameter field description.</p>
     * @param Description <p>Parameter field description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Field default value of the parameter.</p> 
     * @return Default <p>Field default value of the parameter.</p>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set <p>Field default value of the parameter.</p>
     * @param Default <p>Field default value of the parameter.</p>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get <p>Parameter field unit.</p> 
     * @return Unit <p>Parameter field unit.</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>Parameter field unit.</p>
     * @param Unit <p>Parameter field unit.</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>Whether the parameter field is required or not.</p><p>Default value: false</p><p>If filled, it is applicable to ALL parameter field type verification; if left blank, no verification.</p> 
     * @return Required <p>Whether the parameter field is required or not.</p><p>Default value: false</p><p>If filled, it is applicable to ALL parameter field type verification; if left blank, no verification.</p>
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set <p>Whether the parameter field is required or not.</p><p>Default value: false</p><p>If filled, it is applicable to ALL parameter field type verification; if left blank, no verification.</p>
     * @param Required <p>Whether the parameter field is required or not.</p><p>Default value: false</p><p>If filled, it is applicable to ALL parameter field type verification; if left blank, no verification.</p>
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get <p>Minimum value of the parameter field.</p><p>If filled, it is used to validate the value for integer, floating-point number, integer array, and floating-point number array type parameters; if left blank, there is no verification.</p> 
     * @return MinValue <p>Minimum value of the parameter field.</p><p>If filled, it is used to validate the value for integer, floating-point number, integer array, and floating-point number array type parameters; if left blank, there is no verification.</p>
     */
    public Float getMinValue() {
        return this.MinValue;
    }

    /**
     * Set <p>Minimum value of the parameter field.</p><p>If filled, it is used to validate the value for integer, floating-point number, integer array, and floating-point number array type parameters; if left blank, there is no verification.</p>
     * @param MinValue <p>Minimum value of the parameter field.</p><p>If filled, it is used to validate the value for integer, floating-point number, integer array, and floating-point number array type parameters; if left blank, there is no verification.</p>
     */
    public void setMinValue(Float MinValue) {
        this.MinValue = MinValue;
    }

    /**
     * Get <p>Maximum value of the parameter field.</p><p>If filled, it is used for value verification of type parameters for integers, floating-point numbers, integer arrays, and floating-point number arrays. If left blank, there is no verification.</p> 
     * @return MaxValue <p>Maximum value of the parameter field.</p><p>If filled, it is used for value verification of type parameters for integers, floating-point numbers, integer arrays, and floating-point number arrays. If left blank, there is no verification.</p>
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set <p>Maximum value of the parameter field.</p><p>If filled, it is used for value verification of type parameters for integers, floating-point numbers, integer arrays, and floating-point number arrays. If left blank, there is no verification.</p>
     * @param MaxValue <p>Maximum value of the parameter field.</p><p>If filled, it is used for value verification of type parameters for integers, floating-point numbers, integer arrays, and floating-point number arrays. If left blank, there is no verification.</p>
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get <p>Minimum length of the parameter field.</p><p>If filled, it is used for value verification of string and string array type parameters. If not filled, there is no verification.</p> 
     * @return MinLength <p>Minimum length of the parameter field.</p><p>If filled, it is used for value verification of string and string array type parameters. If not filled, there is no verification.</p>
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * Set <p>Minimum length of the parameter field.</p><p>If filled, it is used for value verification of string and string array type parameters. If not filled, there is no verification.</p>
     * @param MinLength <p>Minimum length of the parameter field.</p><p>If filled, it is used for value verification of string and string array type parameters. If not filled, there is no verification.</p>
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    /**
     * Get <p>Maximum length of the parameter field.</p><p>If filled, it is used for value verification for strings and array of strings type parameters; if left blank, no verification.</p> 
     * @return MaxLength <p>Maximum length of the parameter field.</p><p>If filled, it is used for value verification for strings and array of strings type parameters; if left blank, no verification.</p>
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set <p>Maximum length of the parameter field.</p><p>If filled, it is used for value verification for strings and array of strings type parameters; if left blank, no verification.</p>
     * @param MaxLength <p>Maximum length of the parameter field.</p><p>If filled, it is used for value verification for strings and array of strings type parameters; if left blank, no verification.</p>
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get <p>Minimum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters; if left blank, there is no verification.</p> 
     * @return MinItems <p>Minimum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters; if left blank, there is no verification.</p>
     */
    public Long getMinItems() {
        return this.MinItems;
    }

    /**
     * Set <p>Minimum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters; if left blank, there is no verification.</p>
     * @param MinItems <p>Minimum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters; if left blank, there is no verification.</p>
     */
    public void setMinItems(Long MinItems) {
        this.MinItems = MinItems;
    }

    /**
     * Get <p>Maximum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters. If left blank, there is no verification.</p> 
     * @return MaxItems <p>Maximum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters. If left blank, there is no verification.</p>
     */
    public Long getMaxItems() {
        return this.MaxItems;
    }

    /**
     * Set <p>Maximum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters. If left blank, there is no verification.</p>
     * @param MaxItems <p>Maximum item count of the parameter field.</p><p>If filled, it is applicable to value verification for various array type parameters. If left blank, there is no verification.</p>
     */
    public void setMaxItems(Long MaxItems) {
        this.MaxItems = MaxItems;
    }

    /**
     * Get <p>Whether the parameter field item is unique.</p><p>Default value: false</p><p>If filled, it is applicable to various array type parameter value verification; if left blank, no verification.</p> 
     * @return UniqueItems <p>Whether the parameter field item is unique.</p><p>Default value: false</p><p>If filled, it is applicable to various array type parameter value verification; if left blank, no verification.</p>
     */
    public Boolean getUniqueItems() {
        return this.UniqueItems;
    }

    /**
     * Set <p>Whether the parameter field item is unique.</p><p>Default value: false</p><p>If filled, it is applicable to various array type parameter value verification; if left blank, no verification.</p>
     * @param UniqueItems <p>Whether the parameter field item is unique.</p><p>Default value: false</p><p>If filled, it is applicable to various array type parameter value verification; if left blank, no verification.</p>
     */
    public void setUniqueItems(Boolean UniqueItems) {
        this.UniqueItems = UniqueItems;
    }

    /**
     * Get <p>Allowed format of the parameter field.</p><p>If filled, verification of string or string array content is required. If not filled, there is no verification.</p> 
     * @return AllowedPattern <p>Allowed format of the parameter field.</p><p>If filled, verification of string or string array content is required. If not filled, there is no verification.</p>
     */
    public String getAllowedPattern() {
        return this.AllowedPattern;
    }

    /**
     * Set <p>Allowed format of the parameter field.</p><p>If filled, verification of string or string array content is required. If not filled, there is no verification.</p>
     * @param AllowedPattern <p>Allowed format of the parameter field.</p><p>If filled, verification of string or string array content is required. If not filled, there is no verification.</p>
     */
    public void setAllowedPattern(String AllowedPattern) {
        this.AllowedPattern = AllowedPattern;
    }

    /**
     * Get <p>Allowed values of the parameter field. If empty, there is no verification.</p><p>If this parameter is filled, it indicates that the corresponding parameter is an enum and only allows values from this parameter array; if left blank, there is no verification.</p> 
     * @return AllowedValues <p>Allowed values of the parameter field. If empty, there is no verification.</p><p>If this parameter is filled, it indicates that the corresponding parameter is an enum and only allows values from this parameter array; if left blank, there is no verification.</p>
     */
    public String [] getAllowedValues() {
        return this.AllowedValues;
    }

    /**
     * Set <p>Allowed values of the parameter field. If empty, there is no verification.</p><p>If this parameter is filled, it indicates that the corresponding parameter is an enum and only allows values from this parameter array; if left blank, there is no verification.</p>
     * @param AllowedValues <p>Allowed values of the parameter field. If empty, there is no verification.</p><p>If this parameter is filled, it indicates that the corresponding parameter is an enum and only allows values from this parameter array; if left blank, there is no verification.</p>
     */
    public void setAllowedValues(String [] AllowedValues) {
        this.AllowedValues = AllowedValues;
    }

    /**
     * Get <p>Minimum step size of the parameter field.</p><p>If filled, it is suitable for value verification of floating-point and floating-point array type parameters. If not filled, there is no verification.</p> 
     * @return MultipleOf <p>Minimum step size of the parameter field.</p><p>If filled, it is suitable for value verification of floating-point and floating-point array type parameters. If not filled, there is no verification.</p>
     */
    public String getMultipleOf() {
        return this.MultipleOf;
    }

    /**
     * Set <p>Minimum step size of the parameter field.</p><p>If filled, it is suitable for value verification of floating-point and floating-point array type parameters. If not filled, there is no verification.</p>
     * @param MultipleOf <p>Minimum step size of the parameter field.</p><p>If filled, it is suitable for value verification of floating-point and floating-point array type parameters. If not filled, there is no verification.</p>
     */
    public void setMultipleOf(String MultipleOf) {
        this.MultipleOf = MultipleOf;
    }

    public RuleEngineCustomActionParameterSchema() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineCustomActionParameterSchema(RuleEngineCustomActionParameterSchema source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.MinValue != null) {
            this.MinValue = new Float(source.MinValue);
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Float(source.MaxValue);
        }
        if (source.MinLength != null) {
            this.MinLength = new Long(source.MinLength);
        }
        if (source.MaxLength != null) {
            this.MaxLength = new Long(source.MaxLength);
        }
        if (source.MinItems != null) {
            this.MinItems = new Long(source.MinItems);
        }
        if (source.MaxItems != null) {
            this.MaxItems = new Long(source.MaxItems);
        }
        if (source.UniqueItems != null) {
            this.UniqueItems = new Boolean(source.UniqueItems);
        }
        if (source.AllowedPattern != null) {
            this.AllowedPattern = new String(source.AllowedPattern);
        }
        if (source.AllowedValues != null) {
            this.AllowedValues = new String[source.AllowedValues.length];
            for (int i = 0; i < source.AllowedValues.length; i++) {
                this.AllowedValues[i] = new String(source.AllowedValues[i]);
            }
        }
        if (source.MultipleOf != null) {
            this.MultipleOf = new String(source.MultipleOf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "MinValue", this.MinValue);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);
        this.setParamSimple(map, prefix + "MaxLength", this.MaxLength);
        this.setParamSimple(map, prefix + "MinItems", this.MinItems);
        this.setParamSimple(map, prefix + "MaxItems", this.MaxItems);
        this.setParamSimple(map, prefix + "UniqueItems", this.UniqueItems);
        this.setParamSimple(map, prefix + "AllowedPattern", this.AllowedPattern);
        this.setParamArraySimple(map, prefix + "AllowedValues.", this.AllowedValues);
        this.setParamSimple(map, prefix + "MultipleOf", this.MultipleOf);

    }
}

