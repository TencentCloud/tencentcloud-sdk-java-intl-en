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

public class RulesProperties extends AbstractModel {

    /**
    * Parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Minimum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect.
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * Valid parameter values.
Note: If `Type` is `CUSTOM_NUM` or `CUSTOM_STRING`, this parameter will be an empty array.
    */
    @SerializedName("ChoicesValue")
    @Expose
    private String [] ChoicesValue;

    /**
    * The parameter value type.
<Li>`CHOICE`: the parameter value can only be selected from `choicesvalue`.</li>
<Li>TOGGLE: the parameter value is of switch type and can be selected from `choicesvalue`.</li>
<Li>OBJECT: the parameter value is of object type, and `choiceproperties` are the properties associated with this object type.</li>
<Li>`CUSTOM_NUM`: (integer) custom value.</li>
<Li> custom_string: parameter value is user-customized, string type.</li> 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Maximum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect.
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * Whether multiple values can be selected or entered.
    */
    @SerializedName("IsMultiple")
    @Expose
    private Boolean IsMultiple;

    /**
    * Whether the parameter can be left empty.
    */
    @SerializedName("IsAllowEmpty")
    @Expose
    private Boolean IsAllowEmpty;

    /**
    * Associated configuration parameters of this parameter, which are required for API call.
Note: This parameter will be an empty array if no special parameters are added as optional parameters.
    */
    @SerializedName("ChoiceProperties")
    @Expose
    private RuleChoicePropertiesItem [] ChoiceProperties;

    /**
    * <li>NULL: No special parameters when `NormalAction` is selected for `RuleAction`.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraParameter")
    @Expose
    private RuleExtraParameter ExtraParameter;

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
     * Get Minimum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect. 
     * @return Min Minimum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect.
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect.
     * @param Min Minimum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect.
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get Valid parameter values.
Note: If `Type` is `CUSTOM_NUM` or `CUSTOM_STRING`, this parameter will be an empty array. 
     * @return ChoicesValue Valid parameter values.
Note: If `Type` is `CUSTOM_NUM` or `CUSTOM_STRING`, this parameter will be an empty array.
     */
    public String [] getChoicesValue() {
        return this.ChoicesValue;
    }

    /**
     * Set Valid parameter values.
Note: If `Type` is `CUSTOM_NUM` or `CUSTOM_STRING`, this parameter will be an empty array.
     * @param ChoicesValue Valid parameter values.
Note: If `Type` is `CUSTOM_NUM` or `CUSTOM_STRING`, this parameter will be an empty array.
     */
    public void setChoicesValue(String [] ChoicesValue) {
        this.ChoicesValue = ChoicesValue;
    }

    /**
     * Get The parameter value type.
<Li>`CHOICE`: the parameter value can only be selected from `choicesvalue`.</li>
<Li>TOGGLE: the parameter value is of switch type and can be selected from `choicesvalue`.</li>
<Li>OBJECT: the parameter value is of object type, and `choiceproperties` are the properties associated with this object type.</li>
<Li>`CUSTOM_NUM`: (integer) custom value.</li>
<Li> custom_string: parameter value is user-customized, string type.</li>  
     * @return Type The parameter value type.
<Li>`CHOICE`: the parameter value can only be selected from `choicesvalue`.</li>
<Li>TOGGLE: the parameter value is of switch type and can be selected from `choicesvalue`.</li>
<Li>OBJECT: the parameter value is of object type, and `choiceproperties` are the properties associated with this object type.</li>
<Li>`CUSTOM_NUM`: (integer) custom value.</li>
<Li> custom_string: parameter value is user-customized, string type.</li> 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The parameter value type.
<Li>`CHOICE`: the parameter value can only be selected from `choicesvalue`.</li>
<Li>TOGGLE: the parameter value is of switch type and can be selected from `choicesvalue`.</li>
<Li>OBJECT: the parameter value is of object type, and `choiceproperties` are the properties associated with this object type.</li>
<Li>`CUSTOM_NUM`: (integer) custom value.</li>
<Li> custom_string: parameter value is user-customized, string type.</li> 
     * @param Type The parameter value type.
<Li>`CHOICE`: the parameter value can only be selected from `choicesvalue`.</li>
<Li>TOGGLE: the parameter value is of switch type and can be selected from `choicesvalue`.</li>
<Li>OBJECT: the parameter value is of object type, and `choiceproperties` are the properties associated with this object type.</li>
<Li>`CUSTOM_NUM`: (integer) custom value.</li>
<Li> custom_string: parameter value is user-customized, string type.</li> 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Maximum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect. 
     * @return Max Maximum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect.
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect.
     * @param Max Maximum value. If both `Min` and `Max` are set to `0`, this parameter does not take effect.
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get Whether multiple values can be selected or entered. 
     * @return IsMultiple Whether multiple values can be selected or entered.
     */
    public Boolean getIsMultiple() {
        return this.IsMultiple;
    }

    /**
     * Set Whether multiple values can be selected or entered.
     * @param IsMultiple Whether multiple values can be selected or entered.
     */
    public void setIsMultiple(Boolean IsMultiple) {
        this.IsMultiple = IsMultiple;
    }

    /**
     * Get Whether the parameter can be left empty. 
     * @return IsAllowEmpty Whether the parameter can be left empty.
     */
    public Boolean getIsAllowEmpty() {
        return this.IsAllowEmpty;
    }

    /**
     * Set Whether the parameter can be left empty.
     * @param IsAllowEmpty Whether the parameter can be left empty.
     */
    public void setIsAllowEmpty(Boolean IsAllowEmpty) {
        this.IsAllowEmpty = IsAllowEmpty;
    }

    /**
     * Get Associated configuration parameters of this parameter, which are required for API call.
Note: This parameter will be an empty array if no special parameters are added as optional parameters. 
     * @return ChoiceProperties Associated configuration parameters of this parameter, which are required for API call.
Note: This parameter will be an empty array if no special parameters are added as optional parameters.
     */
    public RuleChoicePropertiesItem [] getChoiceProperties() {
        return this.ChoiceProperties;
    }

    /**
     * Set Associated configuration parameters of this parameter, which are required for API call.
Note: This parameter will be an empty array if no special parameters are added as optional parameters.
     * @param ChoiceProperties Associated configuration parameters of this parameter, which are required for API call.
Note: This parameter will be an empty array if no special parameters are added as optional parameters.
     */
    public void setChoiceProperties(RuleChoicePropertiesItem [] ChoiceProperties) {
        this.ChoiceProperties = ChoiceProperties;
    }

    /**
     * Get <li>NULL: No special parameters when `NormalAction` is selected for `RuleAction`.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraParameter <li>NULL: No special parameters when `NormalAction` is selected for `RuleAction`.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RuleExtraParameter getExtraParameter() {
        return this.ExtraParameter;
    }

    /**
     * Set <li>NULL: No special parameters when `NormalAction` is selected for `RuleAction`.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraParameter <li>NULL: No special parameters when `NormalAction` is selected for `RuleAction`.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraParameter(RuleExtraParameter ExtraParameter) {
        this.ExtraParameter = ExtraParameter;
    }

    public RulesProperties() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RulesProperties(RulesProperties source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.ChoicesValue != null) {
            this.ChoicesValue = new String[source.ChoicesValue.length];
            for (int i = 0; i < source.ChoicesValue.length; i++) {
                this.ChoicesValue[i] = new String(source.ChoicesValue[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
        if (source.IsMultiple != null) {
            this.IsMultiple = new Boolean(source.IsMultiple);
        }
        if (source.IsAllowEmpty != null) {
            this.IsAllowEmpty = new Boolean(source.IsAllowEmpty);
        }
        if (source.ChoiceProperties != null) {
            this.ChoiceProperties = new RuleChoicePropertiesItem[source.ChoiceProperties.length];
            for (int i = 0; i < source.ChoiceProperties.length; i++) {
                this.ChoiceProperties[i] = new RuleChoicePropertiesItem(source.ChoiceProperties[i]);
            }
        }
        if (source.ExtraParameter != null) {
            this.ExtraParameter = new RuleExtraParameter(source.ExtraParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamArraySimple(map, prefix + "ChoicesValue.", this.ChoicesValue);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "IsMultiple", this.IsMultiple);
        this.setParamSimple(map, prefix + "IsAllowEmpty", this.IsAllowEmpty);
        this.setParamArrayObj(map, prefix + "ChoiceProperties.", this.ChoiceProperties);
        this.setParamObj(map, prefix + "ExtraParameter.", this.ExtraParameter);

    }
}

