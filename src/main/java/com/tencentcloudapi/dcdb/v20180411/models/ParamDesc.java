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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamDesc extends AbstractModel{

    /**
    * Parameter name
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * Current parameter value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Previously set value, which is the same as `value` after the parameter takes effect. If no value has been set, this field will not be returned.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SetValue")
    @Expose
    private String SetValue;

    /**
    * Default value
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * Parameter constraint
    */
    @SerializedName("Constraint")
    @Expose
    private ParamConstraint Constraint;

    /**
    * Whether a value has been set. false: no, true: yes
    */
    @SerializedName("HaveSetValue")
    @Expose
    private Boolean HaveSetValue;

    /**
     * Get Parameter name 
     * @return Param Parameter name
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set Parameter name
     * @param Param Parameter name
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get Current parameter value 
     * @return Value Current parameter value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Current parameter value
     * @param Value Current parameter value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Previously set value, which is the same as `value` after the parameter takes effect. If no value has been set, this field will not be returned.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SetValue Previously set value, which is the same as `value` after the parameter takes effect. If no value has been set, this field will not be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSetValue() {
        return this.SetValue;
    }

    /**
     * Set Previously set value, which is the same as `value` after the parameter takes effect. If no value has been set, this field will not be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SetValue Previously set value, which is the same as `value` after the parameter takes effect. If no value has been set, this field will not be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSetValue(String SetValue) {
        this.SetValue = SetValue;
    }

    /**
     * Get Default value 
     * @return Default Default value
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set Default value
     * @param Default Default value
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get Parameter constraint 
     * @return Constraint Parameter constraint
     */
    public ParamConstraint getConstraint() {
        return this.Constraint;
    }

    /**
     * Set Parameter constraint
     * @param Constraint Parameter constraint
     */
    public void setConstraint(ParamConstraint Constraint) {
        this.Constraint = Constraint;
    }

    /**
     * Get Whether a value has been set. false: no, true: yes 
     * @return HaveSetValue Whether a value has been set. false: no, true: yes
     */
    public Boolean getHaveSetValue() {
        return this.HaveSetValue;
    }

    /**
     * Set Whether a value has been set. false: no, true: yes
     * @param HaveSetValue Whether a value has been set. false: no, true: yes
     */
    public void setHaveSetValue(Boolean HaveSetValue) {
        this.HaveSetValue = HaveSetValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "SetValue", this.SetValue);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamObj(map, prefix + "Constraint.", this.Constraint);
        this.setParamSimple(map, prefix + "HaveSetValue", this.HaveSetValue);

    }
}

