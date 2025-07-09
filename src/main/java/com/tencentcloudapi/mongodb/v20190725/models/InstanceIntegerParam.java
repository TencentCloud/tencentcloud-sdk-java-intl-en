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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceIntegerParam extends AbstractModel {

    /**
    * Current value
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Default value
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Maximum value
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * Minimum value
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no, which means the parameter setting takes effect immediately)
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * Parameter name
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Parameter description
    */
    @SerializedName("Tips")
    @Expose
    private String [] Tips;

    /**
    * Data type of the parameter
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Redundant field which can be ignored
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
     * Get Current value 
     * @return CurrentValue Current value
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Current value
     * @param CurrentValue Current value
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Default value 
     * @return DefaultValue Default value
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value
     * @param DefaultValue Default value
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Maximum value 
     * @return Max Maximum value
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value
     * @param Max Maximum value
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get Minimum value 
     * @return Min Minimum value
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value
     * @param Min Minimum value
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no, which means the parameter setting takes effect immediately) 
     * @return NeedRestart Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no, which means the parameter setting takes effect immediately)
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no, which means the parameter setting takes effect immediately)
     * @param NeedRestart Whether to restart the instance for the parameter to take effect. Valid values: `1` (yes), `0` (no, which means the parameter setting takes effect immediately)
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get Parameter name 
     * @return ParamName Parameter name
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name
     * @param ParamName Parameter name
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Parameter description 
     * @return Tips Parameter description
     */
    public String [] getTips() {
        return this.Tips;
    }

    /**
     * Set Parameter description
     * @param Tips Parameter description
     */
    public void setTips(String [] Tips) {
        this.Tips = Tips;
    }

    /**
     * Get Data type of the parameter 
     * @return ValueType Data type of the parameter
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Data type of the parameter
     * @param ValueType Data type of the parameter
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no) 
     * @return Status Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no)
     * @param Status Whether `CurrentValue` is the parameter value actually in use. Valid values: `1` (yes), `0` (no)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Redundant field which can be ignored 
     * @return Unit Redundant field which can be ignored
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Redundant field which can be ignored
     * @param Unit Redundant field which can be ignored
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public InstanceIntegerParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceIntegerParam(InstanceIntegerParam source) {
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new String(source.NeedRestart);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.Tips != null) {
            this.Tips = new String[source.Tips.length];
            for (int i = 0; i < source.Tips.length; i++) {
                this.Tips[i] = new String(source.Tips[i]);
            }
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamArraySimple(map, prefix + "Tips.", this.Tips);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

