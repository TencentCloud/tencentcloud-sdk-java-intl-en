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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamDesc extends AbstractModel {

    /**
    * Parameter name.
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * Current parameter value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * The configured value is the same as the value once the parameter takes effect.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SetValue")
    @Expose
    private String SetValue;

    /**
    * System default value.
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * Parameter limits.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Constraint")
    @Expose
    private ParamConstraint Constraint;

    /**
    * Whether a value has been set. false: not set. true: has set.
    */
    @SerializedName("HaveSetValue")
    @Expose
    private Boolean HaveSetValue;

    /**
    * true: restart required.
    */
    @SerializedName("NeedRestart")
    @Expose
    private Boolean NeedRestart;

    /**
    * Parameter description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Parameter name. 
     * @return Param Parameter name.
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set Parameter name.
     * @param Param Parameter name.
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get Current parameter value. 
     * @return Value Current parameter value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Current parameter value.
     * @param Value Current parameter value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get The configured value is the same as the value once the parameter takes effect.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SetValue The configured value is the same as the value once the parameter takes effect.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSetValue() {
        return this.SetValue;
    }

    /**
     * Set The configured value is the same as the value once the parameter takes effect.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SetValue The configured value is the same as the value once the parameter takes effect.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSetValue(String SetValue) {
        this.SetValue = SetValue;
    }

    /**
     * Get System default value. 
     * @return Default System default value.
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set System default value.
     * @param Default System default value.
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get Parameter limits.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Constraint Parameter limits.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamConstraint getConstraint() {
        return this.Constraint;
    }

    /**
     * Set Parameter limits.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Constraint Parameter limits.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConstraint(ParamConstraint Constraint) {
        this.Constraint = Constraint;
    }

    /**
     * Get Whether a value has been set. false: not set. true: has set. 
     * @return HaveSetValue Whether a value has been set. false: not set. true: has set.
     */
    public Boolean getHaveSetValue() {
        return this.HaveSetValue;
    }

    /**
     * Set Whether a value has been set. false: not set. true: has set.
     * @param HaveSetValue Whether a value has been set. false: not set. true: has set.
     */
    public void setHaveSetValue(Boolean HaveSetValue) {
        this.HaveSetValue = HaveSetValue;
    }

    /**
     * Get true: restart required. 
     * @return NeedRestart true: restart required.
     */
    public Boolean getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set true: restart required.
     * @param NeedRestart true: restart required.
     */
    public void setNeedRestart(Boolean NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get Parameter description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Parameter description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Parameter description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Parameter description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ParamDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamDesc(ParamDesc source) {
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.SetValue != null) {
            this.SetValue = new String(source.SetValue);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Constraint != null) {
            this.Constraint = new ParamConstraint(source.Constraint);
        }
        if (source.HaveSetValue != null) {
            this.HaveSetValue = new Boolean(source.HaveSetValue);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Boolean(source.NeedRestart);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
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
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

