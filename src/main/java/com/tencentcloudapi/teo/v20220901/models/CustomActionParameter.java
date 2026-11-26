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

public class CustomActionParameter extends AbstractModel {

    /**
    * <p>Field names of Parameters under custom configuration.</p><p>You can get them through the API return value CustomActionSet[].Parameters[].Name of DescribeAvailableCustomActionsForRuleEngine, for example, "Seconds", "Ports", "StatusCode".</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Data type of each parameter field in the custom configuration.</p><p>Enumeration values:</p><ul><li>String: string type.</li><li>Integer: integer type.</li><li>Float: floating-point type.</li><li>Boolean: boolean type.</li><li>ArrayOfString: array of strings type.</li><li>ArrayOfInteger: array of integers type.</li><li>ArrayOfFloat: array of floating-point numbers type.</li></ul><p>You can obtain it through the API return value CustomActionSet[].Parameters[].Type of DescribeAvailableCustomActionsForRuleEngine.</p>
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * <p>String type parameter value. This parameter is required when ValueType is String.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
    */
    @SerializedName("StringValue")
    @Expose
    private String StringValue;

    /**
    * <p>Integer type parameter value. This parameter is required when ValueType is Integer.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
    */
    @SerializedName("IntegerValue")
    @Expose
    private Long IntegerValue;

    /**
    * <p>Floating-point parameter value. This parameter is required when ValueType is Float.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
    */
    @SerializedName("FloatValue")
    @Expose
    private Float FloatValue;

    /**
    * <p>Boolean parameter value. This parameter is required when ValueType is Boolean.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
    */
    @SerializedName("BooleanValue")
    @Expose
    private Boolean BooleanValue;

    /**
    * <p>Array of strings type parameter value. This parameter is required when ValueType is ArrayOfString.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
    */
    @SerializedName("StringArrayValue")
    @Expose
    private String [] StringArrayValue;

    /**
    * <p>Integer array type parameter value. This parameter is required when ValueType is ArrayOfInteger.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
    */
    @SerializedName("IntegerArrayValue")
    @Expose
    private Long [] IntegerArrayValue;

    /**
    * <p>Floating-point array type parameter value. This parameter is required when ValueType is ArrayOfFloat.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
    */
    @SerializedName("FloatArrayValue")
    @Expose
    private Float [] FloatArrayValue;

    /**
     * Get <p>Field names of Parameters under custom configuration.</p><p>You can get them through the API return value CustomActionSet[].Parameters[].Name of DescribeAvailableCustomActionsForRuleEngine, for example, "Seconds", "Ports", "StatusCode".</p> 
     * @return Name <p>Field names of Parameters under custom configuration.</p><p>You can get them through the API return value CustomActionSet[].Parameters[].Name of DescribeAvailableCustomActionsForRuleEngine, for example, "Seconds", "Ports", "StatusCode".</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Field names of Parameters under custom configuration.</p><p>You can get them through the API return value CustomActionSet[].Parameters[].Name of DescribeAvailableCustomActionsForRuleEngine, for example, "Seconds", "Ports", "StatusCode".</p>
     * @param Name <p>Field names of Parameters under custom configuration.</p><p>You can get them through the API return value CustomActionSet[].Parameters[].Name of DescribeAvailableCustomActionsForRuleEngine, for example, "Seconds", "Ports", "StatusCode".</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Data type of each parameter field in the custom configuration.</p><p>Enumeration values:</p><ul><li>String: string type.</li><li>Integer: integer type.</li><li>Float: floating-point type.</li><li>Boolean: boolean type.</li><li>ArrayOfString: array of strings type.</li><li>ArrayOfInteger: array of integers type.</li><li>ArrayOfFloat: array of floating-point numbers type.</li></ul><p>You can obtain it through the API return value CustomActionSet[].Parameters[].Type of DescribeAvailableCustomActionsForRuleEngine.</p> 
     * @return ValueType <p>Data type of each parameter field in the custom configuration.</p><p>Enumeration values:</p><ul><li>String: string type.</li><li>Integer: integer type.</li><li>Float: floating-point type.</li><li>Boolean: boolean type.</li><li>ArrayOfString: array of strings type.</li><li>ArrayOfInteger: array of integers type.</li><li>ArrayOfFloat: array of floating-point numbers type.</li></ul><p>You can obtain it through the API return value CustomActionSet[].Parameters[].Type of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>Data type of each parameter field in the custom configuration.</p><p>Enumeration values:</p><ul><li>String: string type.</li><li>Integer: integer type.</li><li>Float: floating-point type.</li><li>Boolean: boolean type.</li><li>ArrayOfString: array of strings type.</li><li>ArrayOfInteger: array of integers type.</li><li>ArrayOfFloat: array of floating-point numbers type.</li></ul><p>You can obtain it through the API return value CustomActionSet[].Parameters[].Type of DescribeAvailableCustomActionsForRuleEngine.</p>
     * @param ValueType <p>Data type of each parameter field in the custom configuration.</p><p>Enumeration values:</p><ul><li>String: string type.</li><li>Integer: integer type.</li><li>Float: floating-point type.</li><li>Boolean: boolean type.</li><li>ArrayOfString: array of strings type.</li><li>ArrayOfInteger: array of integers type.</li><li>ArrayOfFloat: array of floating-point numbers type.</li></ul><p>You can obtain it through the API return value CustomActionSet[].Parameters[].Type of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get <p>String type parameter value. This parameter is required when ValueType is String.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p> 
     * @return StringValue <p>String type parameter value. This parameter is required when ValueType is String.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public String getStringValue() {
        return this.StringValue;
    }

    /**
     * Set <p>String type parameter value. This parameter is required when ValueType is String.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     * @param StringValue <p>String type parameter value. This parameter is required when ValueType is String.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public void setStringValue(String StringValue) {
        this.StringValue = StringValue;
    }

    /**
     * Get <p>Integer type parameter value. This parameter is required when ValueType is Integer.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p> 
     * @return IntegerValue <p>Integer type parameter value. This parameter is required when ValueType is Integer.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     */
    public Long getIntegerValue() {
        return this.IntegerValue;
    }

    /**
     * Set <p>Integer type parameter value. This parameter is required when ValueType is Integer.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     * @param IntegerValue <p>Integer type parameter value. This parameter is required when ValueType is Integer.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     */
    public void setIntegerValue(Long IntegerValue) {
        this.IntegerValue = IntegerValue;
    }

    /**
     * Get <p>Floating-point parameter value. This parameter is required when ValueType is Float.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p> 
     * @return FloatValue <p>Floating-point parameter value. This parameter is required when ValueType is Float.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public Float getFloatValue() {
        return this.FloatValue;
    }

    /**
     * Set <p>Floating-point parameter value. This parameter is required when ValueType is Float.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     * @param FloatValue <p>Floating-point parameter value. This parameter is required when ValueType is Float.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public void setFloatValue(Float FloatValue) {
        this.FloatValue = FloatValue;
    }

    /**
     * Get <p>Boolean parameter value. This parameter is required when ValueType is Boolean.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p> 
     * @return BooleanValue <p>Boolean parameter value. This parameter is required when ValueType is Boolean.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public Boolean getBooleanValue() {
        return this.BooleanValue;
    }

    /**
     * Set <p>Boolean parameter value. This parameter is required when ValueType is Boolean.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     * @param BooleanValue <p>Boolean parameter value. This parameter is required when ValueType is Boolean.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public void setBooleanValue(Boolean BooleanValue) {
        this.BooleanValue = BooleanValue;
    }

    /**
     * Get <p>Array of strings type parameter value. This parameter is required when ValueType is ArrayOfString.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p> 
     * @return StringArrayValue <p>Array of strings type parameter value. This parameter is required when ValueType is ArrayOfString.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public String [] getStringArrayValue() {
        return this.StringArrayValue;
    }

    /**
     * Set <p>Array of strings type parameter value. This parameter is required when ValueType is ArrayOfString.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     * @param StringArrayValue <p>Array of strings type parameter value. This parameter is required when ValueType is ArrayOfString.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public void setStringArrayValue(String [] StringArrayValue) {
        this.StringArrayValue = StringArrayValue;
    }

    /**
     * Get <p>Integer array type parameter value. This parameter is required when ValueType is ArrayOfInteger.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p> 
     * @return IntegerArrayValue <p>Integer array type parameter value. This parameter is required when ValueType is ArrayOfInteger.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public Long [] getIntegerArrayValue() {
        return this.IntegerArrayValue;
    }

    /**
     * Set <p>Integer array type parameter value. This parameter is required when ValueType is ArrayOfInteger.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     * @param IntegerArrayValue <p>Integer array type parameter value. This parameter is required when ValueType is ArrayOfInteger.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters API return value of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public void setIntegerArrayValue(Long [] IntegerArrayValue) {
        this.IntegerArrayValue = IntegerArrayValue;
    }

    /**
     * Get <p>Floating-point array type parameter value. This parameter is required when ValueType is ArrayOfFloat.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p> 
     * @return FloatArrayValue <p>Floating-point array type parameter value. This parameter is required when ValueType is ArrayOfFloat.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     */
    public Float [] getFloatArrayValue() {
        return this.FloatArrayValue;
    }

    /**
     * Set <p>Floating-point array type parameter value. This parameter is required when ValueType is ArrayOfFloat.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     * @param FloatArrayValue <p>Floating-point array type parameter value. This parameter is required when ValueType is ArrayOfFloat.</p><p>You can get the default value, unit, limit, and other descriptions of the parameter value through the CustomActionSet[].Parameters return value of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     */
    public void setFloatArrayValue(Float [] FloatArrayValue) {
        this.FloatArrayValue = FloatArrayValue;
    }

    public CustomActionParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomActionParameter(CustomActionParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.StringValue != null) {
            this.StringValue = new String(source.StringValue);
        }
        if (source.IntegerValue != null) {
            this.IntegerValue = new Long(source.IntegerValue);
        }
        if (source.FloatValue != null) {
            this.FloatValue = new Float(source.FloatValue);
        }
        if (source.BooleanValue != null) {
            this.BooleanValue = new Boolean(source.BooleanValue);
        }
        if (source.StringArrayValue != null) {
            this.StringArrayValue = new String[source.StringArrayValue.length];
            for (int i = 0; i < source.StringArrayValue.length; i++) {
                this.StringArrayValue[i] = new String(source.StringArrayValue[i]);
            }
        }
        if (source.IntegerArrayValue != null) {
            this.IntegerArrayValue = new Long[source.IntegerArrayValue.length];
            for (int i = 0; i < source.IntegerArrayValue.length; i++) {
                this.IntegerArrayValue[i] = new Long(source.IntegerArrayValue[i]);
            }
        }
        if (source.FloatArrayValue != null) {
            this.FloatArrayValue = new Float[source.FloatArrayValue.length];
            for (int i = 0; i < source.FloatArrayValue.length; i++) {
                this.FloatArrayValue[i] = new Float(source.FloatArrayValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "StringValue", this.StringValue);
        this.setParamSimple(map, prefix + "IntegerValue", this.IntegerValue);
        this.setParamSimple(map, prefix + "FloatValue", this.FloatValue);
        this.setParamSimple(map, prefix + "BooleanValue", this.BooleanValue);
        this.setParamArraySimple(map, prefix + "StringArrayValue.", this.StringArrayValue);
        this.setParamArraySimple(map, prefix + "IntegerArrayValue.", this.IntegerArrayValue);
        this.setParamArraySimple(map, prefix + "FloatArrayValue.", this.FloatArrayValue);

    }
}

