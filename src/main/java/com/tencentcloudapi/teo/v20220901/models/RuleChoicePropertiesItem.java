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

public class RuleChoicePropertiesItem extends AbstractModel {

    /**
    * Parameter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> CUSTOM_NUM: The parameter value is user-customized, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized and of string type.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Available values of the parameter.
Note: If the parameter value is user-customized, this array is an empty array.
    */
    @SerializedName("ChoicesValue")
    @Expose
    private String [] ChoicesValue;

    /**
    * Minimum value of the value parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * Maximum value of a numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * Whether the parameter value supports multi-select or filling in multiple values.
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
    * Special parameter.
<li> NULL: select NormalAction for RuleAction;</li>
<li> The member parameter Id is Action: select RewirteAction for RuleAction;</li>
<li> The member parameter Id is StatusCode: select CodeAction for RuleAction.</li>
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
     * Get Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> CUSTOM_NUM: The parameter value is user-customized, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized and of string type.</li> 
     * @return Type Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> CUSTOM_NUM: The parameter value is user-customized, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized and of string type.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> CUSTOM_NUM: The parameter value is user-customized, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized and of string type.</li>
     * @param Type Parameter type.
<li> CHOICE: The parameter value can only be selected from ChoicesValue; </li>
<li> TOGGLE: The parameter value is a switch type, select from ChoicesValue;</li>
<li> CUSTOM_NUM: The parameter value is user-customized, integer type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized and of string type.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get Minimum value of the value parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0. 
     * @return Min Minimum value of the value parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value of the value parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     * @param Min Minimum value of the value parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get Maximum value of a numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0. 
     * @return Max Maximum value of a numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value of a numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     * @param Max Maximum value of a numeric parameter. This item is meaningless for non-numeric parameters or when both Min and Max are 0.
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get Whether the parameter value supports multi-select or filling in multiple values. 
     * @return IsMultiple Whether the parameter value supports multi-select or filling in multiple values.
     */
    public Boolean getIsMultiple() {
        return this.IsMultiple;
    }

    /**
     * Set Whether the parameter value supports multi-select or filling in multiple values.
     * @param IsMultiple Whether the parameter value supports multi-select or filling in multiple values.
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
     * Get Special parameter.
<li> NULL: select NormalAction for RuleAction;</li>
<li> The member parameter Id is Action: select RewirteAction for RuleAction;</li>
<li> The member parameter Id is StatusCode: select CodeAction for RuleAction.</li> 
     * @return ExtraParameter Special parameter.
<li> NULL: select NormalAction for RuleAction;</li>
<li> The member parameter Id is Action: select RewirteAction for RuleAction;</li>
<li> The member parameter Id is StatusCode: select CodeAction for RuleAction.</li>
     */
    public RuleExtraParameter getExtraParameter() {
        return this.ExtraParameter;
    }

    /**
     * Set Special parameter.
<li> NULL: select NormalAction for RuleAction;</li>
<li> The member parameter Id is Action: select RewirteAction for RuleAction;</li>
<li> The member parameter Id is StatusCode: select CodeAction for RuleAction.</li>
     * @param ExtraParameter Special parameter.
<li> NULL: select NormalAction for RuleAction;</li>
<li> The member parameter Id is Action: select RewirteAction for RuleAction;</li>
<li> The member parameter Id is StatusCode: select CodeAction for RuleAction.</li>
     */
    public void setExtraParameter(RuleExtraParameter ExtraParameter) {
        this.ExtraParameter = ExtraParameter;
    }

    public RuleChoicePropertiesItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleChoicePropertiesItem(RuleChoicePropertiesItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ChoicesValue != null) {
            this.ChoicesValue = new String[source.ChoicesValue.length];
            for (int i = 0; i < source.ChoicesValue.length; i++) {
                this.ChoicesValue[i] = new String(source.ChoicesValue[i]);
            }
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
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
        if (source.ExtraParameter != null) {
            this.ExtraParameter = new RuleExtraParameter(source.ExtraParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "ChoicesValue.", this.ChoicesValue);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "IsMultiple", this.IsMultiple);
        this.setParamSimple(map, prefix + "IsAllowEmpty", this.IsAllowEmpty);
        this.setParamObj(map, prefix + "ExtraParameter.", this.ExtraParameter);

    }
}

