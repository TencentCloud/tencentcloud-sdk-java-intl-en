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
    * Value of the parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Minimum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * Available values of the parameter.
Note: If the parameter value is user-customized, this array is an empty array.
    */
    @SerializedName("ChoicesValue")
    @Expose
    private String [] ChoicesValue;

    /**
    * Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> OBJECT: The parameter value is an object type, and ChoiceProperties are attributes associated with the object type;</li>
<li> CUSTOM_NUM: user-customized parameter value, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li>Note: When the parameter type is OBJECT, see [Example 2: Create with the parameter type OBJECT](https://www.tencentcloud.com/document/product/1552/80622?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Maximum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * Whether the parameter value supports multiple selections or filling in multiple values.
    */
    @SerializedName("IsMultiple")
    @Expose
    private Boolean IsMultiple;

    /**
    * Allow Empty.
    */
    @SerializedName("IsAllowEmpty")
    @Expose
    private Boolean IsAllowEmpty;

    /**
    * The associated configuration parameter of this parameter is required for the API call.
Note: If no new configuration parameters are added to the optional parameter, this array is an empty array.
    */
    @SerializedName("ChoiceProperties")
    @Expose
    private RuleChoicePropertiesItem [] ChoiceProperties;

    /**
    * <li> NULL: no special parameter. Select NormalAction for RuleAction;</li>
    */
    @SerializedName("ExtraParameter")
    @Expose
    private RuleExtraParameter ExtraParameter;

    /**
     * Get Value of the parameter name. 
     * @return Name Value of the parameter name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Value of the parameter name.
     * @param Name Value of the parameter name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Minimum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0. 
     * @return Min Minimum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     * @param Min Minimum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get Available values of the parameter.
Note: If the parameter value is user-customized, this array is an empty array. 
     * @return ChoicesValue Available values of the parameter.
Note: If the parameter value is user-customized, this array is an empty array.
     */
    public String [] getChoicesValue() {
        return this.ChoicesValue;
    }

    /**
     * Set Available values of the parameter.
Note: If the parameter value is user-customized, this array is an empty array.
     * @param ChoicesValue Available values of the parameter.
Note: If the parameter value is user-customized, this array is an empty array.
     */
    public void setChoicesValue(String [] ChoicesValue) {
        this.ChoicesValue = ChoicesValue;
    }

    /**
     * Get Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> OBJECT: The parameter value is an object type, and ChoiceProperties are attributes associated with the object type;</li>
<li> CUSTOM_NUM: user-customized parameter value, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li>Note: When the parameter type is OBJECT, see [Example 2: Create with the parameter type OBJECT](https://www.tencentcloud.com/document/product/1552/80622?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D) 
     * @return Type Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> OBJECT: The parameter value is an object type, and ChoiceProperties are attributes associated with the object type;</li>
<li> CUSTOM_NUM: user-customized parameter value, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li>Note: When the parameter type is OBJECT, see [Example 2: Create with the parameter type OBJECT](https://www.tencentcloud.com/document/product/1552/80622?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> OBJECT: The parameter value is an object type, and ChoiceProperties are attributes associated with the object type;</li>
<li> CUSTOM_NUM: user-customized parameter value, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li>Note: When the parameter type is OBJECT, see [Example 2: Create with the parameter type OBJECT](https://www.tencentcloud.com/document/product/1552/80622?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D)
     * @param Type Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> OBJECT: The parameter value is an object type, and ChoiceProperties are attributes associated with the object type;</li>
<li> CUSTOM_NUM: user-customized parameter value, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li>Note: When the parameter type is OBJECT, see [Example 2: Create with the parameter type OBJECT](https://www.tencentcloud.com/document/product/1552/80622?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Maximum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0. 
     * @return Max Maximum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     * @param Max Maximum value of the numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get Whether the parameter value supports multiple selections or filling in multiple values. 
     * @return IsMultiple Whether the parameter value supports multiple selections or filling in multiple values.
     */
    public Boolean getIsMultiple() {
        return this.IsMultiple;
    }

    /**
     * Set Whether the parameter value supports multiple selections or filling in multiple values.
     * @param IsMultiple Whether the parameter value supports multiple selections or filling in multiple values.
     */
    public void setIsMultiple(Boolean IsMultiple) {
        this.IsMultiple = IsMultiple;
    }

    /**
     * Get Allow Empty. 
     * @return IsAllowEmpty Allow Empty.
     */
    public Boolean getIsAllowEmpty() {
        return this.IsAllowEmpty;
    }

    /**
     * Set Allow Empty.
     * @param IsAllowEmpty Allow Empty.
     */
    public void setIsAllowEmpty(Boolean IsAllowEmpty) {
        this.IsAllowEmpty = IsAllowEmpty;
    }

    /**
     * Get The associated configuration parameter of this parameter is required for the API call.
Note: If no new configuration parameters are added to the optional parameter, this array is an empty array. 
     * @return ChoiceProperties The associated configuration parameter of this parameter is required for the API call.
Note: If no new configuration parameters are added to the optional parameter, this array is an empty array.
     */
    public RuleChoicePropertiesItem [] getChoiceProperties() {
        return this.ChoiceProperties;
    }

    /**
     * Set The associated configuration parameter of this parameter is required for the API call.
Note: If no new configuration parameters are added to the optional parameter, this array is an empty array.
     * @param ChoiceProperties The associated configuration parameter of this parameter is required for the API call.
Note: If no new configuration parameters are added to the optional parameter, this array is an empty array.
     */
    public void setChoiceProperties(RuleChoicePropertiesItem [] ChoiceProperties) {
        this.ChoiceProperties = ChoiceProperties;
    }

    /**
     * Get <li> NULL: no special parameter. Select NormalAction for RuleAction;</li> 
     * @return ExtraParameter <li> NULL: no special parameter. Select NormalAction for RuleAction;</li>
     */
    public RuleExtraParameter getExtraParameter() {
        return this.ExtraParameter;
    }

    /**
     * Set <li> NULL: no special parameter. Select NormalAction for RuleAction;</li>
     * @param ExtraParameter <li> NULL: no special parameter. Select NormalAction for RuleAction;</li>
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

