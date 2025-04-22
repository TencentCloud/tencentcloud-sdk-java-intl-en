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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamDetail extends AbstractModel {

    /**
    * Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Default value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Indicates whether the restart is required.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NeedRestart")
    @Expose
    private Boolean NeedRestart;

    /**
    * Current value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunningValue")
    @Expose
    private String RunningValue;

    /**
    * Value range.
    */
    @SerializedName("ValueRange")
    @Expose
    private ValueRange ValueRange;

    /**
    * Unit.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Introduction in English.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShortDesc")
    @Expose
    private String ShortDesc;

    /**
    * Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
     * Get Parameter name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamName Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamName Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Default value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultValue Default value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultValue Default value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Indicates whether the restart is required.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NeedRestart Indicates whether the restart is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set Indicates whether the restart is required.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NeedRestart Indicates whether the restart is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNeedRestart(Boolean NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get Current value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunningValue Current value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRunningValue() {
        return this.RunningValue;
    }

    /**
     * Set Current value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunningValue Current value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunningValue(String RunningValue) {
        this.RunningValue = RunningValue;
    }

    /**
     * Get Value range. 
     * @return ValueRange Value range.
     */
    public ValueRange getValueRange() {
        return this.ValueRange;
    }

    /**
     * Set Value range.
     * @param ValueRange Value range.
     */
    public void setValueRange(ValueRange ValueRange) {
        this.ValueRange = ValueRange;
    }

    /**
     * Get Unit.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Unit Unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Unit Unit.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Introduction in English.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShortDesc Introduction in English.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getShortDesc() {
        return this.ShortDesc;
    }

    /**
     * Set Introduction in English.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShortDesc Introduction in English.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShortDesc(String ShortDesc) {
        this.ShortDesc = ShortDesc;
    }

    /**
     * Get Parameter name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParameterName Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParameterName Parameter name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    public ParamDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamDetail(ParamDetail source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Boolean(source.NeedRestart);
        }
        if (source.RunningValue != null) {
            this.RunningValue = new String(source.RunningValue);
        }
        if (source.ValueRange != null) {
            this.ValueRange = new ValueRange(source.ValueRange);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.ShortDesc != null) {
            this.ShortDesc = new String(source.ShortDesc);
        }
        if (source.ParameterName != null) {
            this.ParameterName = new String(source.ParameterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "RunningValue", this.RunningValue);
        this.setParamObj(map, prefix + "ValueRange.", this.ValueRange);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "ShortDesc", this.ShortDesc);
        this.setParamSimple(map, prefix + "ParameterName", this.ParameterName);

    }
}

